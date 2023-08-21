package com.bjxls.instructions.stores.storeref;

import com.bjxls.instructions.base.NoOperandsInstruction;
import com.bjxls.instructions.stores.Store;
import com.bjxls.rtda.Zframe;

/**
 * @author BJXLS
 *
 * @description:
 */
public class ASTORE_1 extends NoOperandsInstruction {
    @Override
    public void execute(Zframe frame) {
        Store.astore(frame,1);
    }
}
