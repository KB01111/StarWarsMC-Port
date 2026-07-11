package che.swgc.platform;

import che.swgc.platform.services.IItems;
import che.swgc.platform.services.IPlatformHelper;
import che.swgc.platform.services.IRegisters;
import java.util.ServiceLoader;

public class Services {
    public static final IPlatformHelper PLATFORM = load(IPlatformHelper.class);
    public static final IRegisters REGISTERS = load(IRegisters.class);
    public static final IItems ITEMS = load(IItems.class);

    private Services() {}

    public static <T> T load(Class<T> clazz) {
        return ServiceLoader.load(clazz).findFirst()
            .orElseThrow(() -> new NullPointerException("Failed to load service for " + clazz.getName()));
    }
}
