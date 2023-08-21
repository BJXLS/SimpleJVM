package com.bjxls.classfile.classconstant;

import com.bjxls.classfile.ConstantPool;

/**
 * @author BJXLS
 * 
 * @description: 方法引用消息
 */
public class ConstantMethodRefInfo extends ConstantMemberRefInfo {
    public ConstantMethodRefInfo(ConstantPool constantPool, int type) {
        super(constantPool, type);
    }
}
