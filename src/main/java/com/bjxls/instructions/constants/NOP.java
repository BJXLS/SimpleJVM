package com.bjxls.instructions.constants;

import com.bjxls.instructions.base.NoOperandsInstruction;
import com.bjxls.rtda.Zframe;

/**
 * @author BJXLS
 *
 * @description: nop指令是最简单的一条指令，因为它什么也不做
 */
public class NOP extends NoOperandsInstruction{
    @Override
    public void execute(Zframe frame) {

    }
}
