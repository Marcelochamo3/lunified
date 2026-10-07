package o;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class Op0 extends Mp0 {
    public final Class a0;
    public final Constructor b0;
    public final Method c0;
    public final Method d0;
    public final Method e0;
    public final Method f0;
    public final Method g0;

    public Op0() throws NoSuchMethodException {
        Method methodN;
        Constructor<?> constructor;
        Method methodM;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodM = M(cls2);
            Class<?> cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodN = N(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            methodN = null;
            constructor = null;
            methodM = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.a0 = cls;
        this.b0 = constructor;
        this.c0 = methodM;
        this.d0 = method;
        this.e0 = method2;
        this.f0 = method3;
        this.g0 = methodN;
    }

    public static Method M(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public final void H(Object obj) {
        try {
            this.f0.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean I(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.c0.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface J(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.a0, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.g0.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean K(Object obj) {
        try {
            return ((Boolean) this.e0.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final Object L() {
        try {
            return this.b0.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method N(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // o.Mp0, o.AbstractC1468fA
    public final Typeface g(Context context, C0410Ew c0410Ew, Resources resources, int i) {
        if (this.c0 == null) {
            return super.g(context, c0410Ew, resources, i);
        }
        Object objL = L();
        if (objL == null) {
            return null;
        }
        for (C0436Fw c0436Fw : c0410Ew.a) {
            if (!I(context, objL, c0436Fw.a, c0436Fw.e, c0436Fw.b, c0436Fw.c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c0436Fw.d))) {
                H(objL);
                return null;
            }
        }
        if (K(objL)) {
            return J(objL);
        }
        return null;
    }

    @Override // o.Mp0, o.AbstractC1468fA
    public final Typeface h(Context context, C0488Hw[] c0488HwArr, int i) {
        Typeface typefaceJ;
        boolean zBooleanValue;
        if (c0488HwArr.length < 1) {
            return null;
        }
        if (this.c0 == null) {
            C0488Hw c0488HwO = o(i, c0488HwArr);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(c0488HwO.a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(c0488HwO.c).setItalic(c0488HwO.d).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } catch (Throwable th) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap map = new HashMap();
        for (C0488Hw c0488Hw : c0488HwArr) {
            if (c0488Hw.e == 0) {
                Uri uri = c0488Hw.a;
                if (!map.containsKey(uri)) {
                    map.put(uri, AbstractC1376eG.y(context, uri));
                }
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Object objL = L();
        if (objL == null) {
            return null;
        }
        boolean z = false;
        for (C0488Hw c0488Hw2 : c0488HwArr) {
            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(c0488Hw2.a);
            if (byteBuffer != null) {
                try {
                    zBooleanValue = ((Boolean) this.d0.invoke(objL, byteBuffer, Integer.valueOf(c0488Hw2.b), null, Integer.valueOf(c0488Hw2.c), Integer.valueOf(c0488Hw2.d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    zBooleanValue = false;
                }
                if (!zBooleanValue) {
                    H(objL);
                    return null;
                }
                z = true;
            }
        }
        if (!z) {
            H(objL);
            return null;
        }
        if (K(objL) && (typefaceJ = J(objL)) != null) {
            return Typeface.create(typefaceJ, i);
        }
        return null;
    }

    @Override // o.AbstractC1468fA
    public final Typeface j(Context context, Resources resources, int i, String str, int i2) {
        if (this.c0 == null) {
            return super.j(context, resources, i, str, i2);
        }
        Object objL = L();
        if (objL == null) {
            return null;
        }
        if (!I(context, objL, str, 0, -1, -1, null)) {
            H(objL);
            return null;
        }
        if (K(objL)) {
            return J(objL);
        }
        return null;
    }
}
