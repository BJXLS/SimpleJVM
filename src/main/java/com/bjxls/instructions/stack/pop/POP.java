package com.bjxls.instructions.stack.pop;

import com.bjxls.instructions.base.NoOperandsInstruction;
import com.bjxls.rtda.Zframe;

/**
 * @author BJXLS
 *
 * @description: pop指令把栈顶变量弹出
 * 只能用于弹出int、float等占用一个操作数栈位置的变量
 */
public class POP extends NoOperandsInstruction {
    @Override
    public void execute(Zframe frame) {
        frame.getOperandStack().popSlot();
    }
}
