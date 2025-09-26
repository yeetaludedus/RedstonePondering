package net.yeetaludedus.redstonepondering.infrastructure.ponder;

import net.createmod.catnip.registry.RegisteredObjectsHelper;
import net.createmod.ponder.api.registration.PonderTagRegistrationHelper;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.yeetaludedus.redstonepondering.RedstonePondering;

public class AllRedstonePonderTags {
    public static final ResourceLocation

    POWER_RELAYS = loc("power_relays");

    private static ResourceLocation loc(String id) {
        return RedstonePondering.asResource(id);
    }

    public static void register(PonderTagRegistrationHelper<ResourceLocation> helper) {
        PonderTagRegistrationHelper<Block> HELPER = helper.withKeyFunction(BuiltInRegistries.BLOCK::getKey);

        PonderTagRegistrationHelper<ItemLike> itemHelper = helper.withKeyFunction(RegisteredObjectsHelper::getKeyOrThrow);

        helper.registerTag(loc("power_relays"))
                .addToIndex()
                .item(Blocks.REDSTONE_WIRE::asItem,true,true)
                .title("Redstone dust relaying")
                .description("How redstone relays power to other components")
                .register();

        HELPER.addToTag(loc("power_relays"))
                .add(Blocks.REDSTONE_WIRE);
    }
}
