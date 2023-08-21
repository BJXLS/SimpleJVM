package com.bjxls.instructions.control;

import com.bjxls.instructions.base.BranchInstruction;
import com.bjxls.instructions.base.BranchLogic;
import com.bjxls.rtda.Zframe;

/**
 * @author BJXLS
 *
 * @description:
 */
public class GOTO extends BranchInstruction {
    @Override
    public void execute(Zframe frame) {
        BranchLogic.branch(frame,offset);
    }
}
