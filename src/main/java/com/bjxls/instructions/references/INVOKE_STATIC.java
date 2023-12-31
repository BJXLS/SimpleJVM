package com.bjxls.instructions.references;

import com.bjxls.instructions.base.ClassInitLogic;
import com.bjxls.instructions.base.Index16Instruction;
import com.bjxls.instructions.base.MethodInvokeLogic;
import com.bjxls.rtda.Zframe;
import com.bjxls.rtda.heap.MethodRef;
import com.bjxls.rtda.heap.RuntimeConstantPool;
import com.bjxls.rtda.heap.Zclass;
import com.bjxls.rtda.heap.Zmethod;

/**
 * @author zachaxy
 * @date 17/12/27
 * @description:静态方法调用指令
 * 静态方法,在调用阶段即可确定是哪个方法
 */
public class INVOKE_STATIC extends Index16Instruction {
    @Override
    public void execute(Zframe frame) {
        RuntimeConstantPool runtimeConstantPool = frame.getMethod().getClazz().getRuntimeConstantPool();
        //通过index,拿到方法符号引用
        MethodRef methodRef = (MethodRef) runtimeConstantPool.getRuntimeConstant(index).getValue();
        Zmethod resolvedMethod = methodRef.resolvedMethod();
        if (!resolvedMethod.isStatic()) {
            throw new IncompatibleClassChangeError();
        }

        Zclass clazz = resolvedMethod.getClazz();
        //判断其Class是否已经加载过,如果还未加载,那么调用其类的<clinit>方法压栈
        if (!clazz.isInitStarted()) {
            //当前指令已经是在执行new了,但是类还没有加载,所以当前帧先回退,让类初始化的帧入栈,等类初始化完成后,重新执行new;
            frame.revertNextPC();
            ClassInitLogic.initClass(frame.getThread(), clazz);
            return;
        }

        MethodInvokeLogic.invokeMethod(frame, resolvedMethod);
    }
}
