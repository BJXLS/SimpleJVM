package com.bjxls.instructions.loads.loadxarr;

import com.bjxls.instructions.base.NoOperandsInstruction;
import com.bjxls.instructions.loads.Load;
import com.bjxls.rtda.OperandStack;
import com.bjxls.rtda.Zframe;
import com.bjxls.rtda.heap.Zobject;

/**
 * @author zachaxy
 * @date 17/12/29
 * 获取数组指定索引值（非基本类型）：eg String s = str[2];
 */
public class AALOAD extends NoOperandsInstruction {
    @Override
    public void execute(Zframe frame) {
        OperandStack operandStack = frame.getOperandStack();
        //数组元素的索引值
        int index = operandStack.popInt();
        //数组对象的引用
        Zobject arrRef = operandStack.popRef();

        Load.checkNotNull(arrRef);
        //得到数组对象
        Zobject[] refs = arrRef.getRefs();
        Load.checkIndex(arrRef.getArrayLen(), index);
        //将数组的 index 的值压栈
        operandStack.pushRef(refs[index]);
    }
}
