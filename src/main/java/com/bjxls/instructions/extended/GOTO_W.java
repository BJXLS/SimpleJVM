package com.bjxls.instructions.extended;

import com.bjxls.instructions.base.BranchLogic;
import com.bjxls.instructions.base.BytecodeReader;
import com.bjxls.instructions.base.Instruction;
import com.bjxls.rtda.Zframe;

/**
 * @author BJXLS
 * 
 * @description: goto_w指令和goto指令的唯一区别就是索引从2字节变成了4字节
 */
public class GOTO_W implements Instruction {
    int offset;

    @Override
    public void fetchOperands(BytecodeReader reader) {
        offset = reader.readInt32();
    }

    @Override
    public void execute(Zframe frame) {
        BranchLogic.branch(frame, offset);
    }
}
