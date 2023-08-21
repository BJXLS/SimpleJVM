package com.bjxls.instructions.math.div;

import com.bjxls.instructions.base.NoOperandsInstruction;
import com.bjxls.rtda.OperandStack;
import com.bjxls.rtda.Zframe;

/**
 * @author BJXLS
 *
 * @description:
 */
public class FDIV extends NoOperandsInstruction {
    @Override
    public void execute(Zframe frame) {
        OperandStack stack = frame.getOperandStack();
        float val2 = stack.popFloat();
        float val1 = stack.popFloat();
        float res = val1 / val2;
        stack.pushFloat(res);
    }
}
