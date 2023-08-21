package com.bjxls.instructions.stores.storeref;

import com.bjxls.instructions.base.Index8Instruction;
import com.bjxls.instructions.stores.Store;
import com.bjxls.rtda.Zframe;

/**
 * @author BJXLS
 * 
 * @description:
 */
public class ASTORE extends Index8Instruction {
    @Override
    public void execute(Zframe frame) {
        Store.astore(frame,index);
    }
}
