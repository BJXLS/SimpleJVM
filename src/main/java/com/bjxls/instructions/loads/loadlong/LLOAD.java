package com.bjxls.instructions.loads.loadlong;

import com.bjxls.instructions.base.Index8Instruction;
import com.bjxls.instructions.loads.Load;
import com.bjxls.rtda.Zframe;

/**
 * @author BJXLS
 * 
 * @description:
 */
public class LLOAD extends Index8Instruction {
    @Override
    public void execute(Zframe frame) {
        Load.lload(frame,index);
    }
}
