package com.bjxls.instructions.loads.loadfloat;

import com.bjxls.instructions.base.Index8Instruction;
import com.bjxls.instructions.loads.Load;
import com.bjxls.rtda.Zframe;

/**
 * @author BJXLS
 *
 * @description:
 */
public class FLOAD extends Index8Instruction {
    @Override
    public void execute(Zframe frame) {
        Load.fload(frame,index);
    }
}
