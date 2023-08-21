package com.bjxls.instructions.comparisons.ifacmp;

import com.bjxls.rtda.OperandStack;
import com.bjxls.rtda.Zframe;
import com.bjxls.rtda.heap.Zobject;

/**
 * @author BJXLS
 *
 * @description:
 */
public class IfAcmp {
    public static boolean _acmp(Zframe frame) {
        OperandStack stack = frame.getOperandStack();
        Zobject ref2 = stack.popRef();
        Zobject ref1 = stack.popRef();
        return ref1 == ref2;
    }
}
