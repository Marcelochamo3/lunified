package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.OsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class Mp0 extends AbstractC1468fA {
    public static Class V = null;
    public static Constructor W = null;
    public static Method X = null;
    public static Method Y = null;
    public static boolean Z = false;

    public static boolean F(Object obj, String str, int i, boolean z) throws NoSuchMethodException {
        G();
        try {
            return ((Boolean) X.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public static void G() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (Z) {
            return;
        }
        Z = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
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

    @Override // o.AbstractC1468fA
    public Typeface g(Context context, C0410Ew c0410Ew, Resources resources, int i) throws NoSuchMethodException {
        G();
        try {
            Object objNewInstance = W.newInstance(null);
            for (C0436Fw c0436Fw : c0410Ew.a) {
                File fileU = AbstractC1376eG.u(context);
                if (fileU == null) {
                    return null;
                }
                try {
                    if (!AbstractC1376eG.m(fileU, resources, c0436Fw.f)) {
                        return null;
                    }
                    if (!F(objNewInstance, fileU.getPath(), c0436Fw.b, c0436Fw.c)) {
                        return null;
                    }
                    fileU.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileU.delete();
                }
            }
            G();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) V, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) Y.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // o.AbstractC1468fA
    public Typeface h(Context context, C0488Hw[] c0488HwArr, int i) {
        File file;
        if (c0488HwArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(o(i, c0488HwArr).a, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                try {
                    String str = android.system.Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                    file = OsConstants.S_ISREG(android.system.Os.stat(str).st_mode) ? new File(str) : null;
                } catch (Throwable th) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (ErrnoException unused) {
            }
            if (file != null && file.canRead()) {
                Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                parcelFileDescriptorOpenFileDescriptor.close();
                return typefaceCreateFromFile;
            }
            FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
            try {
                Typeface typefaceI = i(context, fileInputStream);
                fileInputStream.close();
                parcelFileDescriptorOpenFileDescriptor.close();
                return typefaceI;
            } catch (Throwable th3) {
                try {
                    fileInputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException unused2) {
            return null;
        }
    }
}
