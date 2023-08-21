package com.bjxls.instructions.control;

import com.bjxls.instructions.base.NoOperandsInstruction;
import com.bjxls.rtda.Zframe;
import com.bjxls.rtda.Zthread;

/**
 * @author zachaxy
 * @date 17/12/27
 * @description:返回值为 double 的 return 指令
 */
public class DRETURN extends NoOperandsInstruction {
    @Override
    public void execute(Zframe frame) {
        Zthread thread = frame.getThread();
        Zframe currentFrame = thread.popFrame();
        Zframe invokerFrame = thread.getCurrentFrame();
        double val = currentFrame.getOperandStack().popDouble();
        invokerFrame.getOperandStack().pushDouble(val);
    }
}
