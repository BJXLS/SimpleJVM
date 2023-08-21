package com.bjxls.instructions.constants;

import com.bjxls.instructions.base.NoOperandsInstruction;
import com.bjxls.rtda.Zframe;

/**
 * @author BJXLS
 *
 * @description: Push float
 */
public class FCONST_2 extends NoOperandsInstruction {
    @Override
    public void execute(Zframe frame) {
        frame.getOperandStack().pushFloat(2.0f);
    }
}
