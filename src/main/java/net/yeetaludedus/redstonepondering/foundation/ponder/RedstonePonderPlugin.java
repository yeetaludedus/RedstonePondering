package net.yeetaludedus.redstonepondering.foundation.ponder;

import net.createmod.ponder.api.registration.PonderPlugin;
import net.createmod.ponder.api.registration.PonderSceneRegistrationHelper;
import net.createmod.ponder.api.registration.PonderTagRegistrationHelper;
import net.minecraft.resources.ResourceLocation;
import net.yeetaludedus.redstonepondering.RedstonePondering;
import net.yeetaludedus.redstonepondering.infrastructure.ponder.AllRedstonePonderScenes;
import net.yeetaludedus.redstonepondering.infrastructure.ponder.AllRedstonePonderTags;

public class RedstonePonderPlugin implements PonderPlugin {
    @Override
    public String getModId() {return RedstonePondering.MODID;}

    @Override
    public void registerScenes(PonderSceneRegistrationHelper<ResourceLocation> helper) {
        AllRedstonePonderScenes.register(helper);
    }

    @Override
    public void registerTags(PonderTagRegistrationHelper<ResourceLocation> helper) {
        AllRedstonePonderTags.register(helper);
    }
}