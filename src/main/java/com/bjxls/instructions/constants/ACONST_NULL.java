package com.bjxls.instructions.constants;

import com.bjxls.instructions.base.NoOperandsInstruction;
import com.bjxls.rtda.Zframe;

/**
 * @author BJXLS
 *
 * @description: push null
 */
public class ACONST_NULL extends NoOperandsInstruction {

    @Override
    public void execute(Zframe frame) {
        frame.getOperandStack().pushRef(null);
    }
}
