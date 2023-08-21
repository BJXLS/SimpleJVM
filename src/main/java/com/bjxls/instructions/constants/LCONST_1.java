package com.bjxls.instructions.constants;

import com.bjxls.instructions.base.NoOperandsInstruction;
import com.bjxls.rtda.Zframe;

/**
 * @author BJXLS
 * 
 * @description: Push int constant
 */
public class LCONST_1 extends NoOperandsInstruction {

    @Override
    public void execute(Zframe frame) {
        frame.getOperandStack().pushLong(1);
    }
}
