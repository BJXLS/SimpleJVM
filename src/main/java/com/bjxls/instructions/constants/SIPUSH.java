package com.bjxls.instructions.constants;

import com.bjxls.instructions.base.BytecodeReader;
import com.bjxls.instructions.base.Instruction;
import com.bjxls.rtda.Zframe;

/**
 * @author BJXLS
 *
 * @description:sipush指令从操作数中获取一个short型整数，扩展成int型，然后推入栈顶
 */
public class SIPUSH implements Instruction {
    int val;

    @Override
    public void fetchOperands(BytecodeReader reader) {
        val = reader.readInt16();
    }

    @Override
    public void execute(Zframe frame) {
        frame.getOperandStack().pushInt((val + 65536) % 65536);
    }
}
