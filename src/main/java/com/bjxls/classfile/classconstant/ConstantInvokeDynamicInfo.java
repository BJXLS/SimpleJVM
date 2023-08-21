package com.bjxls.classfile.classconstant;

import com.bjxls.classfile.ClassReader;

/**
 * @author BJXLS
 *
 * @description:
 */
public class ConstantInvokeDynamicInfo extends ConstantInfo {
    int bootstrapMethodAttrIndex;
    int nameAndTypeIndex;

    public ConstantInvokeDynamicInfo(int i) {
        type = i;
    }

    @Override
    void readInfo(ClassReader reader) {
        bootstrapMethodAttrIndex = reader.readUint16();
        nameAndTypeIndex = reader.readUint16();
    }
}
