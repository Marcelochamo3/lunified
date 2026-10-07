package com.titan.ranger;

/* JADX INFO: loaded from: classes.dex */
public final class NativeJni {
    private static final NativeJni INSTANCE = new NativeJni();

    static {
        System.loadLibrary("c++_shared");
        System.loadLibrary("ranger-jni");
    }

    private NativeJni() {
    }

    private native String Call(String str, String str2);

    public static NativeJni getInstance() {
        return INSTANCE;
    }

    public final synchronized String call(String str, String str2) {
        return Call(str, str2);
    }

    public final String getVersion() {
        return call("GetVersion", "{}");
    }
}
