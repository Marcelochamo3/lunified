package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Np0 extends AbstractC1468fA {
    public static final Class V;
    public static final Constructor W;
    public static final Method X;
    public static final Method Y;

    static {
        Method method;
        Class<?> cls;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            method = null;
            cls = null;
            method2 = null;
        }
        W = constructor;
        V = cls;
        X = method2;
        Y = method;
    }

    public static boolean F(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) X.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface G(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) V, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) Y.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a A[LOOP:0: B:9:0x0015->B:37:0x006a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x005c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0069 A[SYNTHETIC] */
    @Override // o.AbstractC1468fA
    public final Typeface g(Context context, C0410Ew c0410Ew, Resources resources, int i) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        MappedByteBuffer map;
        try {
            objNewInstance = W.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance == null) {
            return null;
        }
        for (C0436Fw c0436Fw : c0410Ew.a) {
            int i2 = c0436Fw.f;
            File fileU = AbstractC1376eG.u(context);
            if (fileU != null) {
                try {
                    if (AbstractC1376eG.m(fileU, resources, i2)) {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(fileU);
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                            } catch (Throwable th) {
                                try {
                                    fileInputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (IOException unused2) {
                            map = null;
                        }
                        fileU.delete();
                    } else {
                        fileU.delete();
                    }
                    if (map == null) {
                        return null;
                    }
                    if (!F(objNewInstance, map, c0436Fw.e, c0436Fw.b, c0436Fw.c)) {
                        return null;
                    }
                } catch (Throwable th3) {
                    fileU.delete();
                    throw th3;
                }
            }
            map = null;
            if (map == null) {
                return null;
            }
            if (!F(objNewInstance, map, c0436Fw.e, c0436Fw.b, c0436Fw.c)) {
                return null;
            }
        }
        return G(objNewInstance);
    }

    @Override // o.AbstractC1468fA
    public final Typeface h(Context context, C0488Hw[] c0488HwArr, int i) {
        Object objNewInstance;
        try {
            objNewInstance = W.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance == null) {
            return null;
        }
        Nd0 nd0 = new Nd0(0);
        for (C0488Hw c0488Hw : c0488HwArr) {
            Uri uri = c0488Hw.a;
            ByteBuffer byteBufferY = (ByteBuffer) nd0.get(uri);
            if (byteBufferY == null) {
                byteBufferY = AbstractC1376eG.y(context, uri);
                nd0.put(uri, byteBufferY);
            }
            if (byteBufferY == null) {
                return null;
            }
            if (!F(objNewInstance, byteBufferY, c0488Hw.b, c0488Hw.c, c0488Hw.d)) {
                return null;
            }
        }
        Typeface typefaceG = G(objNewInstance);
        if (typefaceG == null) {
            return null;
        }
        return Typeface.create(typefaceG, i);
    }
}
