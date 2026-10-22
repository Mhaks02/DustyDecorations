package net.mhaks.dustydecorations;

import net.mhaks.dustydecorations.block.entity.ModBlockEntityTypes;
import net.mhaks.dustydecorations.block.entity.client.CameraQuadropodBlockRenderer;
import net.mhaks.dustydecorations.block.entity.client.ScarecrowBlockRenderer;
import net.mhaks.dustydecorations.block.entity.custom.NautilusWindChimeBlockEntity;
import net.mhaks.dustydecorations.block.entity.custom.PaperLanternBlockEntity;
import net.mhaks.dustydecorations.config.alert.ConfigMigrationManager;
import net.mhaks.dustydecorations.entity.ModEntityTypes;
import net.mhaks.dustydecorations.entity.client.NautilusGolemRenderer;
import net.mhaks.dustydecorations.platform.Services;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

import java.nio.file.Files;
import java.util.function.BiConsumer;

public class DustyDecorationsClient {

    public static void manageClientConfig() {
        boolean oldConfigExisted = Files.exists(Services.PLATFORM.getConfigDir().toAbsolutePath().resolve("Dusty Decorations Config.toml"));
        boolean configExisted = Files.exists(Services.PLATFORM.getConfigDir().toAbsolutePath().resolve(ModConstants.MOD_ID + "-client.toml"));

        // for dev purposes
        if (Services.PLATFORM.isDevelopmentEnvironment()) {
            oldConfigExisted = true;
            configExisted = true;
        }
        ConfigMigrationManager.setOldConfigExisted(oldConfigExisted);
        ConfigMigrationManager.setConfigExisted(configExisted);
    }

    public static void registerRenderers(BiConsumer<EntityType<? extends Entity>, EntityRendererProvider> entityRenderers, BiConsumer<BlockEntityType<? extends BlockEntity>, BlockEntityRendererProvider> blockEntityRenderers) {

        entityRenderers.accept(ModEntityTypes.NAUTILUS_GOLEM.get(), NautilusGolemRenderer::new);

        blockEntityRenderers.accept(ModBlockEntityTypes.PAPER_LANTERN_BLOCK_ENTITY.get(),
                context -> new GeoBlockRenderer(ModBlockEntityTypes.PAPER_LANTERN_BLOCK_ENTITY.get()));
        blockEntityRenderers.accept(ModBlockEntityTypes.CAMERA_QUADROPOD_BLOCK_ENTITY.get(), CameraQuadropodBlockRenderer::new);
        blockEntityRenderers.accept(ModBlockEntityTypes.SCARECROW_BLOCK_ENTITY.get(), ScarecrowBlockRenderer::new);
        blockEntityRenderers.accept(ModBlockEntityTypes.NAUTILUS_WIND_CHIME_BLOCK_ENTITY.get(),
                context -> new GeoBlockRenderer(ModBlockEntityTypes.NAUTILUS_WIND_CHIME_BLOCK_ENTITY.get()));

    }

}