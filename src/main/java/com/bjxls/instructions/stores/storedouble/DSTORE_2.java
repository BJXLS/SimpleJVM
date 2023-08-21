package com.bjxls.instructions.stores.storedouble;

import com.bjxls.instructions.base.NoOperandsInstruction;
import com.bjxls.instructions.stores.Store;
import com.bjxls.rtda.Zframe;

/**
 * @author BJXLS
 *
 * @description:
 */
public class DSTORE_2 extends NoOperandsInstruction {
    @Override
    public void execute(Zframe frame) {
        Store.dstote(frame,2);
    }
}
