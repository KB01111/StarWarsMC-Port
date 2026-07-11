package che.swgc.platform.services;

import che.swgc.entity.CommandableMob;
import che.swgc.entity.StarFighter;
import che.swgc.force.ForceSecondaryAction;
import java.util.Optional;
import java.util.UUID;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.LivingEntity;

public interface SwgcClientBridge {
    void tryStartLightsaberHum(LivingEntity entity, SoundEvent sound);

    void startStarFighterNoise(StarFighter fighter);

    void openDroidScreen(CommandableMob mob);

    boolean isSecondaryActionInputDown(ForceSecondaryAction action);

    Optional<UUID> getLocalPlayerUuid();

    static SwgcClientBridge noop() {
        return new SwgcClientBridge() {
            @Override
            public void tryStartLightsaberHum(LivingEntity entity, SoundEvent sound) {}

            @Override
            public void startStarFighterNoise(StarFighter fighter) {}

            @Override
            public void openDroidScreen(CommandableMob mob) {}

            @Override
            public boolean isSecondaryActionInputDown(ForceSecondaryAction action) {
                return false;
            }

            @Override
            public Optional<UUID> getLocalPlayerUuid() {
                return Optional.empty();
            }
        };
    }
}
