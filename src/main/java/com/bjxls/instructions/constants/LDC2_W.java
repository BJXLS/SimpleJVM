package com.bjxls.instructions.constants;

import com.bjxls.classfile.classconstant.ConstantInfo;
import com.bjxls.instructions.base.Index16Instruction;
import com.bjxls.rtda.OperandStack;
import com.bjxls.rtda.Zframe;
import com.bjxls.rtda.heap.RuntimeConstantInfo;
import com.bjxls.rtda.heap.Zclass;

/**
 * @author zachaxy
 * @date 17/12/26
 * @description:LDC2_W 和 LDC 的区别是，其获取常量池的常量类型为 Long 和 Double，都是 16bit 宽的
 */
public class LDC2_W extends Index16Instruction {
    @Override
    public void execute(Zframe frame) {
        OperandStack operandStack = frame.getOperandStack();
        Zclass clazz = frame.getMethod().getClazz();
        RuntimeConstantInfo runtimeConstant = clazz.getRuntimeConstantPool().getRuntimeConstant(index);
        switch (runtimeConstant.getType()){
            case ConstantInfo.CONSTANT_Long:
                operandStack.pushLong((Long) runtimeConstant.getValue());
                break;
            case ConstantInfo.CONSTANT_Double:
                operandStack.pushDouble((Double) runtimeConstant.getValue());
                break;
            default:
                throw new ClassFormatError();
        }
    }
}
