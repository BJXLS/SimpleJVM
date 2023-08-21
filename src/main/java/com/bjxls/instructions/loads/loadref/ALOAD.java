package com.bjxls.instructions.loads.loadref;

import com.bjxls.instructions.base.Index8Instruction;
import com.bjxls.instructions.loads.Load;
import com.bjxls.rtda.Zframe;

/**
 * @author BJXLS
 *
 * @description:
 */
public class ALOAD extends Index8Instruction{
    @Override
    public void execute(Zframe frame) {
        Load.aload(frame,index);
    }
}
