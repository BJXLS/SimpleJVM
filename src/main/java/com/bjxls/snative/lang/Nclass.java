package com.bjxls.snative.lang;

import com.bjxls.rtda.Zframe;
import com.bjxls.rtda.heap.StringPool;
import com.bjxls.rtda.heap.Zclass;
import com.bjxls.rtda.heap.ZclassLoader;
import com.bjxls.rtda.heap.Zobject;
import com.bjxls.snative.NativeMethod;

/**
 * @author zachaxy
 */
public class Nclass {

    // static native Class<?> getPrimitiveClass(String name);
    // (Ljava/lang/String;)Ljava/lang/Class;
    // 该方法是获取基本类型的类对象;
    public static class getPrimitiveClass implements NativeMethod {
        @Override
        public void run(Zframe frame) {
            Zobject nameObj = frame.getLocalVars().getRef(0);
            String name = StringPool.realString(nameObj);
            ZclassLoader classLoader = frame.getMethod().getClazz().getLoader();
            Zobject jObject = classLoader.loadClass(name).getjObject();
            frame.getOperandStack().pushRef(jObject);
        }
    }

    public static class getName0 implements NativeMethod {
        @Override
        public void run(Zframe frame) {
            Zobject self = frame.getLocalVars().getRef(0);
            Zclass clazz = (Zclass) self.extra;
            String name = clazz.getJavaName();
            Zobject nameObj = StringPool.jString(clazz.getLoader(), name);
            frame.getOperandStack().pushRef(nameObj);
        }
    }

    public static class desiredAssertionStatus0 implements NativeMethod {
        @Override
        public void run(Zframe frame) {
            frame.getOperandStack().pushBoolean(false);
        }
    }

    public static class isArray implements NativeMethod {
        @Override
        public void run(Zframe frame) {
            Zobject self = frame.getLocalVars().getRef(0);
            Zclass clazz = (Zclass) self.extra;
            frame.getOperandStack().pushBoolean(clazz.isArray());
        }
    }

}
