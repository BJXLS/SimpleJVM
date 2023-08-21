package com.bjxls.instructions.references;

import com.bjxls.instructions.base.Index16Instruction;
import com.bjxls.rtda.OperandStack;
import com.bjxls.rtda.Zframe;
import com.bjxls.rtda.heap.ClassRef;
import com.bjxls.rtda.heap.RuntimeConstantPool;
import com.bjxls.rtda.heap.Zclass;
import com.bjxls.rtda.heap.Zobject;

/**
 * @author BJXLS
 * Time: 2023/7/26.
 * @description: java 中的 instanceof 关键字，会被解析成 INSTANCE_OF 指令 eg:(obj instanceof Object)
 * 将判断的结果写入操作数栈
 */
public class INSTANCE_OF extends Index16Instruction {
    @Override
    public void execute(Zframe frame) {
        OperandStack stack = frame.getOperandStack();
        Zobject obj = stack.popRef();
        //如果 obj 为 null，对任何 class 类型的判断都是 false；
        if (obj == null) {
            stack.pushInt(0);
            return;
        }

        RuntimeConstantPool runtimeConstantPool = frame.getMethod().getClazz().getRuntimeConstantPool();
        ClassRef classRef = (ClassRef) runtimeConstantPool.getRuntimeConstant(index).getValue();
        Zclass clazz = classRef.resolvedClass();
        //obj是不是class的实例
        if (obj.isInstanceOf(clazz)) {
            stack.pushInt(1);
        } else {
            stack.pushInt(0);
        }
    }
}
