package com.bjxls.instructions.base;

import com.bjxls.rtda.Zframe;
import com.bjxls.rtda.Zthread;
import com.bjxls.rtda.heap.Zclass;
import com.bjxls.rtda.heap.Zmethod;

/**
 * @author zachaxy
 * @date 17/12/28
 * @description:执行类的初始化
 */
public class ClassInitLogic {
    public static void initClass(Zthread thread, Zclass clazz) {
        clazz.startInit();
        scheduleClinit(thread, clazz);
        initSuperClass(thread, clazz);
    }

    private static void scheduleClinit(Zthread thread, Zclass clazz) {
        Zmethod clinit = clazz.getMethod("<clinit>", "()V");
        if (clinit != null && clinit.getClazz() == clazz) {
            // exec <clinit>
            Zframe newFrame = thread.createFrame(clinit);
            thread.pushFrame(newFrame);
        }
    }

    private static void initSuperClass(Zthread thread, Zclass clazz) {
        if (!clazz.isInterface()) {
            Zclass superClass = clazz.getSuperClass();
            if (superClass != null && !superClass.isInitStarted()) {
                initClass(thread, superClass);
            }
        }
    }
}


