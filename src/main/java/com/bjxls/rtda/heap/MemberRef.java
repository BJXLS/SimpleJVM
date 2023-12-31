package com.bjxls.rtda.heap;

import com.bjxls.classfile.classconstant.ConstantMemberRefInfo;

/**
 * @author BJXLS
 * Time: 2023/7/22.
 * @description: 字段和方法的符号引用保存的相同信息;包含全限名和描述符;
 * 字段和方法特有的属性,有其对应子类来实现;
 */
public class MemberRef extends SymRef {
    protected String name;        //字段或方法名
    protected String descriptor;  //字段或方法描述符

    public MemberRef(RuntimeConstantPool runtimeConstantPool) {
        super(runtimeConstantPool);
    }

    void copyMemberRefInfo(ConstantMemberRefInfo refInfo) {
        className = refInfo.getClassName();
        name = refInfo.getName();
        descriptor = refInfo.getDescriptor();
    }

    public String getName() {
        return name;
    }

    public String getDescriptor() {
        return descriptor;
    }
}
