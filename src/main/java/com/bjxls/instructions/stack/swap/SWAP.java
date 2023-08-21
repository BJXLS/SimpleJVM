package com.bjxls.instructions.stack.swap;

import com.bjxls.instructions.base.NoOperandsInstruction;
import com.bjxls.rtda.OperandStack;
import com.bjxls.rtda.Slot;
import com.bjxls.rtda.Zframe;

/**
 * @author BJXLS
 *
 * @description: swap指令交换栈顶的两个变量
 */
public class SWAP extends NoOperandsInstruction {
    @Override
    public void execute(Zframe frame) {
        OperandStack stack = frame.getOperandStack();
        Slot slot1 = stack.popSlot();
        Slot slot2 = stack.popSlot();

        stack.pushSlot(slot1);
        stack.pushSlot(slot2);
    }
}
