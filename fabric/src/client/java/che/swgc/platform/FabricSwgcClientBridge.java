package che.swgc.platform;

import che.swgc.client.SwgcClientUtils;
import che.swgc.entity.CommandableMob;
import che.swgc.entity.StarFighter;
import che.swgc.force.ForceSecondaryAction;
import che.swgc.platform.services.SwgcClientBridge;
import java.util.Optional;
import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.LivingEntity;

public final class FabricSwgcClientBridge implements SwgcClientBridge {
    @Override
    public void tryStartLightsaberHum(LivingEntity entity, SoundEvent sound) {
        SwgcClientUtils.tryStartLightsaberHum(entity, sound);
    }

    @Override
    public void startStarFighterNoise(StarFighter fighter) {
        SwgcClientUtils.startStarFighterNoise(fighter);
    }

    @Override
    public void openDroidScreen(CommandableMob mob) {
        SwgcClientUtils.openDroidScreen(mob);
    }

    @Override
    public boolean isSecondaryActionInputDown(ForceSecondaryAction action) {
        Minecraft client = Minecraft.getInstance();
        return action.lmb && client.options.keyAttack.isDown() || action.rmb && client.options.keyUse.isDown();
    }

    @Override
    public Optional<UUID> getLocalPlayerUuid() {
        Minecraft client = Minecraft.getInstance();
        return client.player == null ? Optional.empty() : Optional.of(client.player.getUUID());
    }
}
