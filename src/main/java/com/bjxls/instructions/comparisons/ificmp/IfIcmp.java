package com.bjxls.instructions.comparisons.ificmp;

import com.bjxls.rtda.OperandStack;
import com.bjxls.rtda.Zframe;

/**
 * @author BJXLS
 * 
 * @description:
 */
public class IfIcmp {
    static int[] _icmpPop(Zframe frame) {
        OperandStack stack = frame.getOperandStack();
        int[] res = new int[2];
        res[1] = stack.popInt();
        res[0] = stack.popInt();
        return res;
    }
}
