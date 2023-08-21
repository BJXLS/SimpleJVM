package com.bjxls.classfile.classconstant;

import com.bjxls.Utils.ByteUtils;
import com.bjxls.classfile.ClassReader;

/**
 * @author BJXLS
 *
 * @description:
 */
public class ConstantDoubleInfo extends ConstantInfo {
    double val;

    public ConstantDoubleInfo(int i) {
        type = i;
    }


    @Override
    void readInfo(ClassReader reader) {
        byte[] data = reader.readUint64();
        val = ByteUtils.byte2Double64(data);
    }

    public double getVal() {
        return val;
    }
}
