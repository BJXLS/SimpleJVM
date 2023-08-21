package com.bjxls.instructions.references;

import com.bjxls.instructions.base.NoOperandsInstruction;
import com.bjxls.rtda.OperandStack;
import com.bjxls.rtda.Zframe;
import com.bjxls.rtda.heap.Zobject;

/**
 * @author zachaxy
 * @date 17/12/29
 * @description:获取数组长度的指令
 */
public class ARRAY_LENGTH extends NoOperandsInstruction {
    @Override
    public void execute(Zframe frame) {
        OperandStack operandStack = frame.getOperandStack();
        Zobject arrRef = operandStack.popRef();
        if (arrRef == null) {
            throw new NullPointerException("called length on a null Object");
        }
        int arrLen = arrRef.getArrayLen();
        operandStack.pushInt(arrLen);
    }
}
