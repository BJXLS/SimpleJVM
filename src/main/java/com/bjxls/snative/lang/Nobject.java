package com.bjxls.snative.lang;


import com.bjxls.rtda.Zframe;
import com.bjxls.rtda.heap.Zobject;
import com.bjxls.snative.NativeMethod;

/**
 * @author zachaxy
 */


public class Nobject {
    // static native Class<?> getPrimitiveClass(String name);
    // (Ljava/lang/String;)Ljava/lang/Class;
    // 该方法是获取非基本类型的类对象;
    public static class getClass implements NativeMethod {

        @Override
        public void run(Zframe frame) {
            // 从局部变量表中获取非静态方法的实际的第一个参数——this
            Zobject self = frame.getLocalVars().getRef(0);
            Zobject jObject = self.getClazz().getjObject();
            frame.getOperandStack().pushRef(jObject);
        }
    }
}

