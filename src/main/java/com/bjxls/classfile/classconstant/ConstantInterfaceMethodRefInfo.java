package com.bjxls.classfile.classconstant;

import com.bjxls.classfile.ConstantPool;

/**
 * @author BJXLS
 *
 * @description: 接口方法引用消息
 */
public class ConstantInterfaceMethodRefInfo extends ConstantMemberRefInfo {
    public ConstantInterfaceMethodRefInfo(ConstantPool constantPool, int type) {
        super(constantPool, type);
    }
}
