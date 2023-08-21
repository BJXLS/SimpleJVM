package com.bjxls.classfile.classconstant;

import com.bjxls.classfile.ClassReader;

/**
 * @author BJXLS
 *
 * @description: Java7 中的属性，在本 JVM 中未实现
 */
public class ConstantMethodTypeInfo extends ConstantInfo {
    //关于byte上界,自行处理;
    private int descriptorIndex;

    public ConstantMethodTypeInfo(int i) {
        type = i;
    }


    @Override
    void readInfo(ClassReader reader) {
        descriptorIndex = reader.readUint16();
    }

    public int getDescriptorIndex() {
        return descriptorIndex;
    }
}
