package com.bjxls.instructions.comparisons.ificmp;

import com.bjxls.instructions.base.BranchInstruction;
import com.bjxls.instructions.base.BranchLogic;
import com.bjxls.rtda.Zframe;

/**
 * @author BJXLS
 * 
 * @description:
 */
public class IF_ICMPLE extends BranchInstruction {
    @Override
    public void execute(Zframe frame) {
        int[] res = IfIcmp._icmpPop(frame);
        int val1 = res[0];
        int val2 = res[1];
        if (val1 <= val2) {
            BranchLogic.branch(frame, offset);
        }
    }
}
