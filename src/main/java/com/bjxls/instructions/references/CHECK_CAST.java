package com.bjxls.instructions.references;

import com.bjxls.instructions.base.Index16Instruction;
import com.bjxls.rtda.OperandStack;
import com.bjxls.rtda.Zframe;
import com.bjxls.rtda.heap.ClassRef;
import com.bjxls.rtda.heap.RuntimeConstantPool;
import com.bjxls.rtda.heap.Zclass;
import com.bjxls.rtda.heap.Zobject;

/**
 * @author zachaxy
 * @date 17/12/26
 * @description：类型转换,该指令和instanceof指令的区别在于,instanceof判断后将结果压入操作数栈,而cast直接抛出异常
 * String str = (String)obj
 * NOTE:checkcast 指令，在pop到引用 obj 之后，又将 obj push 到栈中！！！
 */
public class CHECK_CAST extends Index16Instruction {
    @Override
    public void execute(Zframe frame) {
        OperandStack stack = frame.getOperandStack();
        Zobject obj = stack.popRef();
        stack.pushRef(obj);
        //如果 obj 为 null，则可以转换为任意类型
        if (obj == null) {
            return;
        }

        RuntimeConstantPool runtimeConstantPool = frame.getMethod().getClazz().getRuntimeConstantPool();
        ClassRef classRef = (ClassRef) runtimeConstantPool.getRuntimeConstant(index).getValue();
        Zclass clazz = classRef.resolvedClass();
        if (!obj.isInstanceOf(clazz)) {
            throw new ClassCastException(obj.getClazz().thisClassName + " can't cast to " + clazz.thisClassName);
        }
    }
}
