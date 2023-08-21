package com.bjxls.instructions.stores.storefloat;

import com.bjxls.instructions.base.NoOperandsInstruction;
import com.bjxls.instructions.stores.Store;
import com.bjxls.rtda.Zframe;

/**
 * @author BJXLS
 *
 * @description:
 */
public class FSTORE_1 extends NoOperandsInstruction {
    @Override
    public void execute(Zframe frame) {
        Store.fstore(frame,1);
    }
}
