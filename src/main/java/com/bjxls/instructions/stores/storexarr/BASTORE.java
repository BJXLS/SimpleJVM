package com.bjxls.instructions.stores.storexarr;

import com.bjxls.instructions.base.NoOperandsInstruction;
import com.bjxls.instructions.stores.Store;
import com.bjxls.rtda.OperandStack;
import com.bjxls.rtda.Zframe;
import com.bjxls.rtda.heap.Zobject;

/**
 * @author zachaxy
 * @date 17/12/29
 * @description:对数组某一元素的赋值  x[0] = y
 */
public class BASTORE extends NoOperandsInstruction {
    @Override
    public void execute(Zframe frame) {
        OperandStack operandStack = frame.getOperandStack();
        //所要赋的值
        byte val = (byte) operandStack.popInt();
        //数组索引
        int index = operandStack.popInt();
        //数组对象的引用
        Zobject arrRef = operandStack.popRef();

        Store.checkNotNull(arrRef);
        //得到数组对象
        byte[] refs = arrRef.getBytes();
        Store.checkIndex(arrRef.getArrayLen(), index);
        //将数组的 index 的元素进行赋值
        refs[index] = val;
    }
}
