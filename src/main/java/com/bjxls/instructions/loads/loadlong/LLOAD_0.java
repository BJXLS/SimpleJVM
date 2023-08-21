package com.bjxls.instructions.loads.loadlong;

import com.bjxls.instructions.base.NoOperandsInstruction;
import com.bjxls.instructions.loads.Load;
import com.bjxls.rtda.Zframe;

/**
 * @author BJXLS
 *
 * @description:
 */
public class LLOAD_0 extends NoOperandsInstruction {
    @Override
    public void execute(Zframe frame) {
        Load.lload(frame,0);
    }
}
