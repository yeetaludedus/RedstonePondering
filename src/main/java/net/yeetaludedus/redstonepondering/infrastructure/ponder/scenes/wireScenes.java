package net.yeetaludedus.redstonepondering.infrastructure.ponder.scenes;

import net.createmod.ponder.api.scene.SceneBuilder;
import net.createmod.ponder.api.scene.SceneBuildingUtil;
import net.createmod.ponder.foundation.PonderScene;
import net.createmod.ponder.foundation.PonderSceneBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;

public class wireScenes {

    public static void wirePowers(SceneBuilder builder, SceneBuildingUtil util) {
        PonderSceneBuilder scene = new PonderSceneBuilder((PonderScene) builder);

        scene.title("wire","Powering components with redstone dust");
        scene.configureBasePlate(0,0,5);
        scene.idle(10);
        scene.overlay().showText(1000)
                .text("test")
                .placeNearTarget()
                .pointAt(util.vector().of(2,1,3));
        scene.markAsFinished();
    }

}
