package com.bjxls.instructions.comparisons.ifcond;

import com.bjxls.instructions.base.BranchInstruction;
import com.bjxls.instructions.base.BranchLogic;
import com.bjxls.rtda.Zframe;

/**
 * @author BJXLS
 *
 * @description:
 */
public class IFEQ extends BranchInstruction {
    @Override
    public void execute(Zframe frame) {
        int val = frame.getOperandStack().popInt();
        if (val == 0) {
            BranchLogic.branch(frame, offset);
        }
    }
}
