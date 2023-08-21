package com.bjxls.instructions.stores.storeint;

import com.bjxls.instructions.base.NoOperandsInstruction;
import com.bjxls.instructions.stores.Store;
import com.bjxls.rtda.Zframe;

/**
 * @author BJXLS
 *
 * @description:
 */
public class ISTORE_0 extends NoOperandsInstruction {
    @Override
    public void execute(Zframe frame) {
        Store.istore(frame,0);
    }
}
