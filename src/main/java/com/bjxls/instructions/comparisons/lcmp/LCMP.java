package com.bjxls.instructions.comparisons.lcmp;

import com.bjxls.instructions.base.NoOperandsInstruction;
import com.bjxls.rtda.OperandStack;
import com.bjxls.rtda.Zframe;

/**
 * @author BJXLS
 * 
 * @description:
 */
public class LCMP extends NoOperandsInstruction {
    @Override
    public void execute(Zframe frame) {
        OperandStack stack = frame.getOperandStack();
        long val2 = stack.popLong();
        long val1 = stack.popLong();
        if (val1 > val2) {
            stack.pushInt(1);
        } else if (val1 == val2) {
            stack.pushInt(0);
        } else {
            stack.pushInt(-1);
        }
    }
}
