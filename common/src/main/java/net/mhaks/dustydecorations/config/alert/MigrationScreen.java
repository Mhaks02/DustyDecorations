package net.mhaks.dustydecorations.config.alert;

import net.mhaks.dustydecorations.config.ConfigClient;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.MultiLineLabel;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.TitleScreen;
import net.minecraft.network.chat.Component;

public class MigrationScreen extends Screen {
    private final Screen parent;

    public MigrationScreen(Screen parent) {
        super(Component.translatable("screen.dustydecorations.migration_warning.title").append(" Dusty Decorations 2.0!"));
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
        this.addRenderableWidget(Button.builder(
                Component.translatable("screen.dustydecorations.migration_warning.ok").withStyle(ChatFormatting.WHITE),
                button -> {
                    ConfigMigrationManager.deleteOldConfig();
                    ConfigMigrationManager.markUnderstood();
                    this.minecraft.setScreen(parent);
                }
        ).bounds(this.width / 2 - 80, this.height / 2 + 50, 160, 20).build());
    }

    @Override
    public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTick) {
        this.renderBackground(guiGraphics, mouseX, mouseY, partialTick);

        super.render(guiGraphics, mouseX, mouseY, partialTick);

        MultiLineLabel title = MultiLineLabel.create(this.font,
                Component.translatable("screen.dustydecorations.migration_warning.title")
                        .append(Component.literal("\n\ufff3 "))
                        .append(Component.literal("Dusty Decorations 2.0").withStyle(ChatFormatting.BOLD))
                        .append(Component.literal(" \ufff3")),
                this.width / 2);
        MultiLineLabel body_1 = MultiLineLabel.create(this.font,
                Component.translatable("screen.dustydecorations.migration_warning.body.1").withStyle(ChatFormatting.GRAY),
                320);
        MultiLineLabel body_2 = MultiLineLabel.create(this.font,
                        Component.literal("⚠ ").withStyle(ChatFormatting.GOLD)
                                .append(Component.translatable("screen.dustydecorations.migration_warning.body.2").withStyle(ChatFormatting.GOLD))
                                .append(Component.literal(" ⚠").withStyle(ChatFormatting.GOLD))
                                .append(Component.translatable("screen.dustydecorations.migration_warning.body.3").withStyle(ChatFormatting.GRAY)),
                320);

        title.renderCentered(guiGraphics, this.width / 2, this.height / 2 - 64);
        body_1.renderCentered(guiGraphics, this.width / 2, this.height / 2 - 36);
        body_2.renderCentered(guiGraphics, this.width / 2, this.height / 2 + 8);

    }
}
