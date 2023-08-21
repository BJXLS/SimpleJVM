package com.bjxls.snative;

import com.bjxls.rtda.Zframe;
import com.bjxls.snative.lang.Nclass;
import com.bjxls.snative.lang.Nobject;
import com.bjxls.snative.lang.Nthrowable;

import java.util.HashMap;

/**
 * @author zachaxy
 * @description：native 方法注册中心，所有的 native 方法都要在注册中心进行注册
 */
public class RegisterCenter {
    private static HashMap<String, NativeMethod> nativeMethods = new HashMap<>();

    // 类名、方法名和方法描述符加在一起才会唯一确定一个方法
    public static void register(String className, String methodName, String methodDescriptor, NativeMethod nativeMethod) {
        String key = className + "~" + methodName + "~" + methodDescriptor;
        nativeMethods.put(key, nativeMethod);
    }

    public static NativeMethod findNativeMethod(String className, String methodName, String methodDescriptor) {
        String key = className + "~" + methodName + "~" + methodDescriptor;
        if (nativeMethods.containsKey(key)) {
            return nativeMethods.get(key);
        }

        if ("()V".equals(methodDescriptor)) {
            if ("registerNatives".equals(methodName) || "initIDs".equals(methodName)) {
                //返回一个空的方法执行体 emptyNativeMethod
                return new NativeMethod() {
                    @Override
                    public void run(Zframe frame) {

                    }
                };
            }
        }

        return null;
    }

    //对外供 JVM 启动后的唯一接入口，JVM 启动后应该立即调用 RegisterCenter 的 init 方法
    public static void init() {
        register("java/lang/Object", "getClass", "()Ljava/lang/Class;", new Nobject.getClass());


        register("java/lang/Class", "getPrimitiveClass", "(Ljava/lang/String;)Ljava/lang/Class;", new Nclass.getPrimitiveClass());
        register("java/lang/Class", "getName0", "()Ljava/lang/String;", new Nclass.getName0());
        register("java/lang/Class", "desiredAssertionStatus0", "(Ljava/lang/Class;)Z", new Nclass.desiredAssertionStatus0());
        register("java/lang/Class", "isArray", "()Z", new Nclass.isArray());
/*
    register("java/lang/Class", "isInterface", "()Z", new Nclass.isInterface())
	register("java/lang/Class", "isPrimitive", "()Z", new Nclass.isPrimitive())
	register("java/lang/Class", "getDeclaredFields0", "(Z)[Ljava/lang/reflect/Field;", new Nclass.getDeclaredFields0())
	register("java/lang/Class", "forName0", "(Ljava/lang/String;ZLjava/lang/ClassLoader;Ljava/lang/Class;)Ljava/lang/Class;", new Nclass.forName0())
	register("java/lang/Class", "getDeclaredConstructors0", "(Z)[Ljava/lang/reflect/Constructor;", new Nclass.getDeclaredConstructors0())
	register("java/lang/Class", "getModifiers", "()I", new Nclass.getModifiers())
	register("java/lang/Class", "getSuperclass", "()Ljava/lang/Class;", new Nclass.getSuperclass())
	register("java/lang/Class", "getInterfaces0", "()[Ljava/lang/Class;", new Nclass.getInterfaces0())
	register("java/lang/Class", "getDeclaredMethods0", "(Z)[Ljava/lang/reflect/Method;", new Nclass.getDeclaredMethods0())
	register("java/lang/Class", "getComponentType", "()Ljava/lang/Class;", new Nclass.getComponentType())
	register("java/lang/Class", "isAssignableFrom", "(Ljava/lang/Class;)Z", new Nclass.isAssignableFrom())
 */
        register("java/lang/Throwable", "fillInStackTrace", "(I)Ljava/lang/Throwable;", new Nthrowable.fillInStackTrace());

    }
}
