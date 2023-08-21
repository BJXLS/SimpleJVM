package com.bjxls.instructions.math.iinc;

import com.bjxls.instructions.base.BytecodeReader;
import com.bjxls.instructions.base.Instruction;
import com.bjxls.rtda.LocalVars;
import com.bjxls.rtda.Zframe;

/**
 * @author BJXLS
 * 
 * @description: iinc指令给局部变量表中的int变量增加常量值，局部变量表索引和常量值都由指令的操作数提供。
 */
public class IINC implements Instruction {
    public int index;
    public int offset;

    @Override
    public void fetchOperands(BytecodeReader reader) {
        index = reader.readUint8();
        offset = reader.readInt8();
    }

    @Override
    public void execute(Zframe frame) {
        LocalVars localVars = frame.getLocalVars();
        int val = localVars.getInt(index);
        val += offset;
        localVars.setInt(index, val);
    }
}
