package com.bjxls.classfile.classconstant;

import com.bjxls.classfile.ConstantPool;

/**
 * @author BJXLS
 *
 * @description: 字段符号引用
 */
public class ConstantFieldRefInfo extends ConstantMemberRefInfo {
    public ConstantFieldRefInfo(ConstantPool constantPool,int type) {
        super(constantPool,type);
    }
}
