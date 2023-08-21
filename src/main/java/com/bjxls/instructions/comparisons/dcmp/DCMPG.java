package com.bjxls.instructions.comparisons.dcmp;

import com.bjxls.instructions.base.NoOperandsInstruction;
import com.bjxls.rtda.Zframe;

/**
 * @author BJXLS
 * 
 * @description:
 */
public class DCMPG extends NoOperandsInstruction {
    @Override
    public void execute(Zframe frame) {
        DCMP._dcmp(frame, true);
    }
}
