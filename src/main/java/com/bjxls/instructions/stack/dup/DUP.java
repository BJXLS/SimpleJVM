package com.bjxls.instructions.stack.dup;

import com.bjxls.instructions.base.NoOperandsInstruction;
import com.bjxls.rtda.OperandStack;
import com.bjxls.rtda.Slot;
import com.bjxls.rtda.Zframe;

/**
 * @author BJXLS
 * 
 * @description: DUP指令复制栈顶的单个变量
 */
public class DUP extends NoOperandsInstruction {
    @Override
    public void execute(Zframe frame) {
        OperandStack stack = frame.getOperandStack();
        Slot slot = stack.popSlot();
        stack.pushSlot(slot);
        stack.pushSlot(slot);
    }
}
