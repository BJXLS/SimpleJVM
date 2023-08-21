package com.bjxls.instructions.references;

import com.bjxls.instructions.base.NoOperandsInstruction;
import com.bjxls.rtda.Zframe;
import com.bjxls.rtda.heap.Zmethod;
import com.bjxls.snative.NativeMethod;
import com.bjxls.snative.RegisterCenter;

/**
 * @author zachaxy
 * @date 18/1/2
 * @description:nativie 方法执行的指令
 */
public class INVOKE_NATIVE extends NoOperandsInstruction {
    @Override
    public void execute(Zframe frame) {
        Zmethod method = frame.getMethod();
        String clazzName = method.getClazz().thisClassName;
        String methodName = method.getName();
        String descriptor = method.getDescriptor();

        NativeMethod nativeMethod = RegisterCenter.findNativeMethod(clazzName, methodName, descriptor);
        if (nativeMethod == null) {
            String methodInfo = clazzName + "." + methodName + descriptor;
            throw new UnsatisfiedLinkError(methodInfo);
        }

        nativeMethod.run(frame);
    }
}
