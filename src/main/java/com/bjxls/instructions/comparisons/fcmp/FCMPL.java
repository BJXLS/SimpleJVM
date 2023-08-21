package com.bjxls.instructions.comparisons.fcmp;

import com.bjxls.instructions.base.NoOperandsInstruction;
import com.bjxls.rtda.Zframe;

/**
 * @author BJXLS
 *
 * @description:
 */
public class FCMPL extends NoOperandsInstruction {
    @Override
    public void execute(Zframe frame) {
        FCMP._fcmp(frame, false);
    }
}
