package me.alpha432.oyvey.event.events;


import me.alpha432.oyvey.event.oyveyEvent;
import net.minecraft.util.math.BlockPos;

public class DestroyBlockEvent extends oyveyEvent {

    private BlockPos blockPos;

    public DestroyBlockEvent(BlockPos blockPos) {
        super();
        this.blockPos = blockPos;
    }

    public BlockPos getBlockPos() {
        return this.blockPos;
    }

    public void setBlockPos(BlockPos blockPos) {
        this.blockPos = blockPos;
    }
}