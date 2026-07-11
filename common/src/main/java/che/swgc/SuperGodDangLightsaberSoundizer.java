package che.swgc;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SuperGodDangLightsaberSoundizer {
   public SuperGodDangLightsaberSoundizer() {
   }

   public static void main(String... args) throws IOException {
      File folder = new File("common/src/main/resources/assets/swgc/sounds/item/lightsaber");
      HashMap<String, List<String>> map = new HashMap<>();

      for (File file : Objects.requireNonNull(folder.listFiles())) {
         String newName = Pattern.compile("[( )]").matcher(file.getName()).replaceAll("");
         String withoutType = newName.substring(0, newName.length() - 4);
         file.renameTo(new File(folder.getPath() + "/" + newName));
         map.computeIfAbsent(Pattern.compile("\\d+").matcher(withoutType).replaceFirst(""), key1 -> new ArrayList<>()).add(withoutType);
      }

      StringBuilder builder = new StringBuilder("{");
      AtomicBoolean first = new AtomicBoolean(true);
      map.forEach(
         (key, value) -> {
            value.sort((s1, s2) -> {
               Matcher matcher = Pattern.compile("\\d+").matcher(s1);
               if (!matcher.find()) {
                  return -1;
               } else {
                  int ret = Integer.parseInt(matcher.group());
                  matcher.reset(s2);
                  return !matcher.find() ? 1 : ret - Integer.parseInt(matcher.group());
               }
            });
            if (first.get()) {
               first.set(false);
            } else {
               builder.append(",");
            }

            builder.append(
               " \n    \"item.lightsaber.%s\": {\n        \"subtitles\": \"subtitles.swgc.item.lightsaber.%s\",\n        \"sounds\": [".formatted(key, key)
            );
            AtomicBoolean first1 = new AtomicBoolean(true);
            value.forEach(s -> {
               if (first1.get()) {
                  first1.set(false);
               } else {
                  builder.append(",");
               }

               builder.append("\n            \"swgc:item/lightsaber/").append(s).append("\"");
            });
            builder.append("\n        ]\n    }");
         }
      );
      builder.append("\n}");

      try (FileOutputStream stream = new FileOutputStream("common/src/main/resources/assets/swgc/lightsaber_sounds.json")) {
         stream.write(builder.toString().getBytes(StandardCharsets.UTF_8));
      }
   }
}
