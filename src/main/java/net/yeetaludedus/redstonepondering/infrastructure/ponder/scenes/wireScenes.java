package net.yeetaludedus.redstonepondering.infrastructure.ponder.scenes;

import net.createmod.ponder.api.scene.SceneBuilder;
import net.createmod.ponder.api.scene.SceneBuildingUtil;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;

public class wireScenes {

    public static void wirePowers(SceneBuilder scene, SceneBuildingUtil util) {
        // no casting, use the API builder you’re given
        scene.title("wire", "Powering components with redstone dust");
        scene.configureBasePlate(0, 0, 5);
        scene.idle(10);
        scene.overlay().showText(60)
                .text("test")
                .placeNearTarget()
                .pointAt(util.vector().of(2, 1, 3));
        // no need to call markAsFinished(); the API builder handles lifecycle
    }

}
