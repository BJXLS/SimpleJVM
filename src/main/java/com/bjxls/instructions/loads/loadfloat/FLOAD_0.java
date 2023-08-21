package com.bjxls.instructions.loads.loadfloat;

import com.bjxls.instructions.base.NoOperandsInstruction;
import com.bjxls.instructions.loads.Load;
import com.bjxls.rtda.Zframe;

/**
 * @author BJXLS
 *
 * @description:
 */
public class FLOAD_0 extends NoOperandsInstruction{

    @Override
    public void execute(Zframe frame) {
        Load.fload(frame,0);
    }
}
