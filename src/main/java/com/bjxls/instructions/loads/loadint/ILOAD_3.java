package com.bjxls.instructions.loads.loadint;

import com.bjxls.instructions.base.NoOperandsInstruction;
import com.bjxls.instructions.loads.Load;
import com.bjxls.rtda.Zframe;

/**
 * @author BJXLS
 *
 * @description:
 */
public class ILOAD_3 extends NoOperandsInstruction {
    @Override
    public void execute(Zframe frame) {
        Load.iload(frame, 3);
    }
}
