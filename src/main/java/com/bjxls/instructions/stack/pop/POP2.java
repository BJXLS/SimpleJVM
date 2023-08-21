package com.bjxls.instructions.stack.pop;

import com.bjxls.instructions.base.NoOperandsInstruction;
import com.bjxls.rtda.OperandStack;
import com.bjxls.rtda.Zframe;

/**
 * @author BJXLS
 *
 * @description: double和long变量在操作数栈中占据两个位置，需要使用pop2指令弹出
 */
public class POP2 extends NoOperandsInstruction {
    @Override
    public void execute(Zframe frame) {
        OperandStack stack = frame.getOperandStack();
        stack.popSlot();
        stack.popSlot();
    }
}
