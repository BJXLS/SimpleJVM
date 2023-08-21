package com.bjxls.instructions.stack.dup;

import com.bjxls.instructions.base.NoOperandsInstruction;
import com.bjxls.rtda.OperandStack;
import com.bjxls.rtda.Slot;
import com.bjxls.rtda.Zframe;

/**
 * @author BJXLS
 *
 * @description: DUP_X1 指令 先将栈顶的两个变量交换,然后再将原栈顶元素添加到栈顶 ab => bab;
 */
public class DUP_X1 extends NoOperandsInstruction {
    @Override
    public void execute(Zframe frame) {
        OperandStack stack = frame.getOperandStack();
        Slot slot1 = stack.popSlot();
        Slot slot2 = stack.popSlot();
        stack.pushSlot(slot1);
        stack.pushSlot(slot2);
        stack.pushSlot(slot1);
    }
}
