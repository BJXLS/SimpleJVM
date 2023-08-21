package com.bjxls.classfile.classconstant;

import com.bjxls.Utils.ByteUtils;
import com.bjxls.classfile.ClassReader;

/**
 * @author BJXLS
 * 
 * @description:
 */
public class ConstantFloatInfo extends ConstantInfo {
    float val;

    public ConstantFloatInfo(int i) {
        type = i;
    }

    @Override
    void readInfo(ClassReader reader) {
        byte[] data = reader.readUint32();
        val = ByteUtils.byte2Float32(data);
    }


    public float getVal() {
        return val;
    }
}
