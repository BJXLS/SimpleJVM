package com.bjxls.instructions.base;

import com.bjxls.rtda.Zframe;

/**
 * @author BJXLS
 * 
 * @description: 真正的跳转逻辑,因为这个函数在很多指令中都会用到，所以把它定义base中
 */
public class BranchLogic {
    public static void branch(Zframe frame, int offset) {
        int pc = frame.getThread().getPc();
        int nextPC = pc + offset;
        frame.setNextPC(nextPC);
    }
}
