package net.pitan76.advancedreborn.gui;

import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerEntity;
import net.pitan76.advancedreborn.tile.LoggingMachineTile;
import reborncore.client.gui.builder.GuiBase;
import reborncore.common.screen.BuiltScreenHandler;

public class GuiLoggingMachine extends GuiBase<BuiltScreenHandler> {

    public LoggingMachineTile tile;
    public GuiLoggingMachine(int syncId, PlayerEntity player, LoggingMachineTile tile) {
        super(player, tile, tile.createScreenHandler(syncId, player));
        this.tile = tile;
    }

    public boolean isConfigEnabled() {
        return true;
    }

    public void init() {
        super.init();
    }

    public void drawBackground(MatrixStack matrixStack, float lastFrameDuration, int mouseX, int mouseY) {
        super.drawBackground(matrixStack, lastFrameDuration, mouseX, mouseY);
        Layer layer = Layer.BACKGROUND;
        drawSlot(matrixStack, 55, 50, layer);

        drawSlot(matrixStack, 55, 72, layer);
        drawSlot(matrixStack, 73, 72, layer);
        drawSlot(matrixStack, 91, 72, layer);
        drawSlot(matrixStack, 109, 72, layer);
        drawSlot(matrixStack, 127, 72, layer);

        drawSlot(matrixStack, 8, 72, layer);
    }

    public void drawForeground(MatrixStack matrixStack, int mouseX, int mouseY) {
        super.drawForeground(matrixStack, mouseX, mouseY);
        Layer layer = Layer.FOREGROUND;
        builder.drawMultiEnergyBar(matrixStack, this, 9, 19, (int) tile.getEnergy(), (int) tile.getMaxStoredPower(), mouseX, mouseY, 0, layer);
    }
}
