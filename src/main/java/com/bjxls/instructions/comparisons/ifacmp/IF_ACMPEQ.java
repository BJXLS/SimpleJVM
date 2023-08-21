package com.bjxls.instructions.comparisons.ifacmp;

import com.bjxls.instructions.base.BranchInstruction;
import com.bjxls.instructions.base.BranchLogic;
import com.bjxls.rtda.Zframe;

/**
 * @author BJXLS
 * 
 * @description:
 */
public class IF_ACMPEQ extends BranchInstruction {
    @Override
    public void execute(Zframe frame) {
        if (IfAcmp._acmp(frame)) {
            BranchLogic.branch(frame, offset);
        }
    }
}
