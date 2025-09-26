package net.yeetaludedus.redstonepondering.infrastructure.ponder;

import net.createmod.ponder.api.registration.PonderSceneRegistrationHelper;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.yeetaludedus.redstonepondering.infrastructure.ponder.scenes.wireScenes;

public class AllRedstonePonderScenes {
    public static void register(PonderSceneRegistrationHelper<ResourceLocation> helper) {
        PonderSceneRegistrationHelper<Block> HELPER = helper.withKeyFunction(BuiltInRegistries.BLOCK::getKey);

        HELPER.forComponents(Blocks.REDSTONE_WIRE)
                .addStoryBoard("wire/power", wireScenes::wirePowers, AllRedstonePonderTags.POWER_RELAYS);
    }
}
