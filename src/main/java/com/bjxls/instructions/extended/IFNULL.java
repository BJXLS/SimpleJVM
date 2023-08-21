package com.bjxls.instructions.extended;

import com.bjxls.instructions.base.BranchInstruction;
import com.bjxls.instructions.base.BranchLogic;
import com.bjxls.rtda.Zframe;
import com.bjxls.rtda.heap.Zobject;

/**
 * @author BJXLS
 *
 * @description:
 */
public class IFNULL extends BranchInstruction {
    @Override
    public void execute(Zframe frame) {
        Zobject ref = frame.getOperandStack().popRef();
        if (ref == null) {
            BranchLogic.branch(frame, offset);
        }
    }
}
