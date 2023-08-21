package com.bjxls.instructions.math.neg;

import com.bjxls.instructions.base.NoOperandsInstruction;
import com.bjxls.rtda.OperandStack;
import com.bjxls.rtda.Zframe;

/**
 * @author BJXLS
 * 
 * @description:
 */
public class FNEG extends NoOperandsInstruction {
    @Override
    public void execute(Zframe frame) {
        OperandStack stack = frame.getOperandStack();
        float val = stack.popFloat();
        stack.pushFloat(-val);
    }
}