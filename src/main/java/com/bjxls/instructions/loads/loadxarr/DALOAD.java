package com.bjxls.instructions.loads.loadxarr;

import com.bjxls.instructions.base.NoOperandsInstruction;
import com.bjxls.instructions.loads.Load;
import com.bjxls.rtda.OperandStack;
import com.bjxls.rtda.Zframe;
import com.bjxls.rtda.heap.Zobject;

/**
 * @author zachaxy
 * @date 17/12/29
 * 获取数组指定索引值：eg double d = doubles[2];
 */
public class DALOAD extends NoOperandsInstruction {
    @Override
    public void execute(Zframe frame) {
        OperandStack operandStack = frame.getOperandStack();
        //数组元素的索引值
        int index = operandStack.popInt();
        //数组对象的引用
        Zobject arrRef = operandStack.popRef();

        Load.checkNotNull(arrRef);
        //得到数组对象
        double[] refs = arrRef.getDoubles();
        Load.checkIndex(arrRef.getArrayLen(), index);
        //将数组的 index 的值压栈
        operandStack.pushDouble(refs[index]);
    }
}
