package com.bjxls.instructions.base;

import com.bjxls.rtda.Slot;
import com.bjxls.rtda.Zframe;
import com.bjxls.rtda.Zthread;
import com.bjxls.rtda.heap.Zmethod;

/**
 * @author zachaxy
 * @date 17/12/27
 */
public class MethodInvokeLogic {

    public static void invokeMethod(Zframe invokerFrame, Zmethod method) {
        Zthread thread = invokerFrame.getThread();
        Zframe newFrame = thread.createFrame(method);
        thread.pushFrame(newFrame);

        int argSlotCount = method.getArgSlotCount();
        if (argSlotCount > 0) {
            for (int i = argSlotCount - 1; i >= 0; i--) {
                Slot slot = invokerFrame.getOperandStack().popSlot();
                newFrame.getLocalVars().setSlot(i, slot);
            }
        }
    }
}
