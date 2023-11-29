package com.deeplake.sandbox.blocks;

import com.deeplake.sandbox.init.RegisterUtil;
import net.minecraft.block.BlockLadder;

public class BlockLadderCustom extends BlockLadder {
    public BlockLadderCustom() {
        RegisterUtil.initBlock(this, "test_ladder");
    }
}
