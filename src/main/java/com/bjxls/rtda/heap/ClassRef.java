package com.bjxls.rtda.heap;

import com.bjxls.classfile.classconstant.ConstantClassInfo;

/**
 * @author BJXLS
 * Time: 2023/7/22.
 * @description: 类引用
 */
public class ClassRef extends SymRef {
    public ClassRef(RuntimeConstantPool runtimeConstantPool, ConstantClassInfo classInfo) {
        super(runtimeConstantPool);
        this.className = classInfo.getName();
    }
}
