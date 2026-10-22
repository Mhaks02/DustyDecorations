package net.mhaks.dustydecorations.config.alert;

import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.MultiLineTextWidget;
import net.minecraft.client.gui.layouts.HeaderAndFooterLayout;
import net.minecraft.client.gui.layouts.LinearLayout;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.TitleScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.util.Mth;
import net.minecraft.util.Util;

public class MigrationScreen extends Screen {
    private final Screen parent;
    private float fadeInStart;
    private boolean fadingIn = true;
    private float fadeOutStart;
    private final HeaderAndFooterLayout layout = new HeaderAndFooterLayout(this, this.height / 2 + 120, this.height / 2 + 33);

    public MigrationScreen(Screen parent) {
        super(Component.translatable("screen.dustydecorations.migration_warning.title"));
        this.parent = parent;
    }

    public static void openWarningScreen(Screen parent) {
        if (!(parent instanceof TitleScreen)) return;
        if (ConfigMigrationManager.wasPromptShown()) return;
        if (!ConfigMigrationManager.needsMigrationPrompt()) return;
        Minecraft.getInstance().setScreen(new MigrationScreen(parent));
    }

    @Override
    public void init() {
        LinearLayout linearLayout = this.layout.addToContents(LinearLayout.vertical());
        linearLayout.defaultCellSetting().alignHorizontallyCenter().padding(4);

        Component title = Component.translatable("screen.dustydecorations.migration_warning.title_1").withStyle(ChatFormatting.AQUA)
                .append(Component.literal("\n\ufff3 ").withStyle(ChatFormatting.WHITE))
                .append(Component.literal("Dusty Decorations 2.0").withStyle(ChatFormatting.BOLD, ChatFormatting.AQUA))
                .append(Component.literal(" \ufff3").withStyle(ChatFormatting.WHITE));
        Component body_1 = Component.translatable("screen.dustydecorations.migration_warning.body.1");
        Component body_2 = Component.literal("⚠ ").withStyle(ChatFormatting.GOLD)
                .append(Component.translatable("screen.dustydecorations.migration_warning.body.2"))
                .append(Component.literal(" ⚠"))
                .append(Component.translatable("screen.dustydecorations.migration_warning.body.3").withStyle(ChatFormatting.WHITE));

        this.layout.addToHeader(linearLayout.addChild(new MultiLineTextWidget(title, this.font).setMaxWidth(320).setCentered(true), layoutSettings -> layoutSettings.paddingBottom(8)));
        linearLayout.addChild(new MultiLineTextWidget(body_1, this.font).setMaxWidth(320).setCentered(true));
        linearLayout.addChild(new MultiLineTextWidget(body_2, this.font).setMaxWidth(320).setCentered(true), layoutSettings -> layoutSettings.paddingBottom(8));
        this.layout.addToFooter(linearLayout.addChild(
                Button.builder(
                        Component.translatable("screen.dustydecorations.migration_warning.ok").withStyle(ChatFormatting.WHITE),
                        button -> {
                            ConfigMigrationManager.deleteOldConfig();
                            ConfigMigrationManager.markUnderstood();
                            this.onClose();
                        }
                ).size(160, 20).build()));

        this.layout.visitWidgets(this::addRenderableWidget);
        this.repositionElements();
    }

    @Override
    protected void repositionElements() {
        this.layout.arrangeElements();
    }

    @Override
    public void onClose() {
        if (this.fadeOutStart == 0.0F) {
            this.fadeOutStart = (float)Util.getMillis();
        }
    }

    private void close() {
        this.minecraft.setScreen(parent);
    }

    @Override
    public void renderBackground(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTick) {
        renderPanorama(guiGraphics, partialTick);
    }

    @Override
    public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTick) {
        super.render(guiGraphics, mouseX, mouseY, partialTick);

        if (this.fadeInStart == 0L && this.fadingIn) {
            this.fadeInStart = Util.getMillis();
        }

        float f = 1.0F;
        if (this.fadingIn) {
            float f1 = (Util.getMillis() - this.fadeInStart) / 2000.0F;
            if (f1 >= 1.0F) {
                this.fadingIn = false;
                this.fadeInStart = 0.0F;
            } else {
                f1 = Mth.clamp(f1, 0.0F, 1.0F);
                f = Mth.clampedMap(f1, 0.5F, 1.0F, 0.0F, 1.0F);
            }
            this.fadeWidgets(f);
        }

        if (this.fadeOutStart > 0.0F) {
            float f2 = 1.0F - (Util.getMillis() - this.fadeOutStart) / 1000.0F;
            float f3 = 0.0F;
            if (f2 <= 0.0F) {
                this.fadeOutStart = 0.0F;
                this.close();
            } else {
                f2 = Mth.clamp(f2, 0.0F, 1.0F);
                f3 = Mth.clampedMap(f2, 0.5F, 1.0F, 0.0F, 1.0F);
            }
            this.fadeWidgets(f3);
        }

    }
}
