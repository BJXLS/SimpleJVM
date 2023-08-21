package com.bjxls.instructions.loads.loaddouble;

import com.bjxls.instructions.base.NoOperandsInstruction;
import com.bjxls.instructions.loads.Load;
import com.bjxls.rtda.Zframe;

/**
 * @author BJXLS
 *
 * @description:
 */
public class DLOAD_3 extends NoOperandsInstruction {
    @Override
    public void execute(Zframe frame) {
        Load.dload(frame, 3);
    }
}
