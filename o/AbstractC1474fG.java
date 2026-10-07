package o;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.provider.Settings;
import android.util.Base64;
import android.util.Size;
import android.util.SizeF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import j$.util.Spliterators;
import j$.util.stream.Stream;
import j$.util.stream.StreamSupport;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: o.fG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1474fG {
    public static final float[][] a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] c = {95.047f, 100.0f, 108.883f};
    public static final float[][] d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final J2 e = new J2(10, "CONDITION_FALSE", false);
    public static final C2743sL f = new C2743sL(12);
    public static final C3325yL g = new C3325yL();
    public static final C3325yL h = new C3325yL();
    public static Method i;
    public static boolean j;
    public static Field k;
    public static boolean l;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    /* JADX WARN: Code duplicated, block: B:7:0x0012  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int A(String str) {
        byte b2;
        String str2 = str;
        if (str2 == null) {
            return -1;
        }
        ArrayList arrayList = IQ.a;
        byte b3 = 2;
        switch (str.hashCode()) {
            case -1007807498:
                if (!str2.equals("audio/x-flac")) {
                    b2 = -1;
                } else {
                    b2 = 0;
                }
                break;
            case -586683234:
                if (!str2.equals("audio/x-wav")) {
                    b2 = -1;
                } else {
                    b2 = 1;
                }
                break;
            case 187090231:
                if (!str2.equals("audio/mp3")) {
                    b2 = -1;
                } else {
                    b2 = 2;
                }
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
                str2 = "audio/flac";
                break;
            case 1:
                str2 = "audio/wav";
                break;
            case 2:
                str2 = "audio/mpeg";
                break;
        }
        switch (str2.hashCode()) {
            case -2123537834:
                if (!str2.equals("audio/eac3-joc")) {
                    b3 = -1;
                } else {
                    b3 = 0;
                }
                break;
            case -1662384011:
                if (!str2.equals("video/mp2p")) {
                    b3 = -1;
                } else {
                    b3 = 1;
                }
                break;
            case -1662384007:
                if (!str2.equals("video/mp2t")) {
                    b3 = -1;
                }
                break;
            case -1662095187:
                if (!str2.equals("video/webm")) {
                    b3 = -1;
                } else {
                    b3 = 3;
                }
                break;
            case -1606874997:
                if (!str2.equals("audio/amr-wb")) {
                    b3 = -1;
                } else {
                    b3 = 4;
                }
                break;
            case -1487394660:
                if (!str2.equals("image/jpeg")) {
                    b3 = -1;
                } else {
                    b3 = 5;
                }
                break;
            case -1248337486:
                if (!str2.equals("application/mp4")) {
                    b3 = -1;
                } else {
                    b3 = 6;
                }
                break;
            case -1079884372:
                if (!str2.equals("video/x-msvideo")) {
                    b3 = -1;
                } else {
                    b3 = 7;
                }
                break;
            case -1004728940:
                if (!str2.equals("text/vtt")) {
                    b3 = -1;
                } else {
                    b3 = 8;
                }
                break;
            case -387023398:
                if (!str2.equals("audio/x-matroska")) {
                    b3 = -1;
                } else {
                    b3 = 9;
                }
                break;
            case -43467528:
                if (!str2.equals("application/webm")) {
                    b3 = -1;
                } else {
                    b3 = 10;
                }
                break;
            case 13915911:
                if (!str2.equals("video/x-flv")) {
                    b3 = -1;
                } else {
                    b3 = C3285xv.h;
                }
                break;
            case 187078296:
                if (!str2.equals("audio/ac3")) {
                    b3 = -1;
                } else {
                    b3 = 12;
                }
                break;
            case 187078297:
                if (!str2.equals("audio/ac4")) {
                    b3 = -1;
                } else {
                    b3 = 13;
                }
                break;
            case 187078669:
                if (!str2.equals("audio/amr")) {
                    b3 = -1;
                } else {
                    b3 = 14;
                }
                break;
            case 187090232:
                if (!str2.equals("audio/mp4")) {
                    b3 = -1;
                } else {
                    b3 = 15;
                }
                break;
            case 187091926:
                if (!str2.equals("audio/ogg")) {
                    b3 = -1;
                } else {
                    b3 = 16;
                }
                break;
            case 187099443:
                if (!str2.equals("audio/wav")) {
                    b3 = -1;
                } else {
                    b3 = 17;
                }
                break;
            case 1331848029:
                if (!str2.equals("video/mp4")) {
                    b3 = -1;
                } else {
                    b3 = 18;
                }
                break;
            case 1503095341:
                if (!str2.equals("audio/3gpp")) {
                    b3 = -1;
                } else {
                    b3 = 19;
                }
                break;
            case 1504578661:
                if (!str2.equals("audio/eac3")) {
                    b3 = -1;
                } else {
                    b3 = 20;
                }
                break;
            case 1504619009:
                if (!str2.equals("audio/flac")) {
                    b3 = -1;
                } else {
                    b3 = 21;
                }
                break;
            case 1504824762:
                if (!str2.equals("audio/midi")) {
                    b3 = -1;
                } else {
                    b3 = 22;
                }
                break;
            case 1504831518:
                if (!str2.equals("audio/mpeg")) {
                    b3 = -1;
                } else {
                    b3 = 23;
                }
                break;
            case 1505118770:
                if (!str2.equals("audio/webm")) {
                    b3 = -1;
                } else {
                    b3 = 24;
                }
                break;
            case 2039520277:
                if (!str2.equals("video/x-matroska")) {
                    b3 = -1;
                } else {
                    b3 = 25;
                }
                break;
            default:
                b3 = -1;
                break;
        }
        switch (b3) {
            case 0:
            case 12:
            case 20:
                return 0;
            case 1:
                return 10;
            case 2:
                return 11;
            case 3:
            case 9:
            case 10:
            case 24:
            case 25:
                return 6;
            case 4:
            case 14:
            case 19:
                return 3;
            case 5:
                return 14;
            case 6:
            case 15:
            case 18:
                return 8;
            case 7:
                return 16;
            case 8:
                return 13;
            case 11:
                return 5;
            case 13:
                return 1;
            case 16:
                return 9;
            case 17:
                return 12;
            case 21:
                return 4;
            case 22:
                return 15;
            case 23:
                return 7;
            default:
                return -1;
        }
    }

    public static int B(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        return lastPathSegment.endsWith(".avi") ? 16 : -1;
    }

    public static void C(Activity activity) {
        j(activity, "activity");
        if (Build.VERSION.SDK_INT >= 29) {
            C1463f70.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new C1463f70());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC1561g70(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public static String D(Context context) throws NoSuchAlgorithmException {
        Object objK;
        j(context, "context");
        try {
            objK = Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Throwable th) {
            objK = Jp0.k(th);
        }
        if (objK instanceof C2439p80) {
            objK = null;
        }
        String str = (String) objK;
        String string = str != null ? AbstractC1119bh0.E0(str).toString() : null;
        if (string == null) {
            string = "";
        }
        if (!(!AbstractC1899jh0.O(string)) || b(string, "9774d56d682e549c")) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("blindaje_install", 0);
            String string2 = sharedPreferences.getString("fallback_id", null);
            if (string2 == null) {
                string2 = UUID.randomUUID().toString();
                i(string2, "toString(...)");
                sharedPreferences.edit().putString("fallback_id", string2).apply();
            }
            string = string2;
        }
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = string.getBytes(AbstractC1305dd.a);
        i(bytes, "getBytes(...)");
        String strEncodeToString = Base64.encodeToString(messageDigest.digest(bytes), 11);
        i(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    public static int E(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (f2 + 16.0f) / 116.0f;
        float f4 = f2 > 8.0f ? f3 * f3 * f3 : f2 / 903.2963f;
        float f5 = f3 * f3 * f3;
        boolean z = f5 > 0.008856452f;
        float f6 = z ? f5 : ((f3 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f5 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = c;
        return AbstractC1894jf.a(f6 * fArr[0], f4 * fArr[1], f5 * fArr[2]);
    }

    public static boolean G(String str) {
        C2815t3 c2815t3 = Kv0.a;
        Set<InterfaceC2286ng> setUnmodifiableSet = Collections.unmodifiableSet(AbstractC2912u3.c);
        HashSet hashSet = new HashSet();
        for (InterfaceC2286ng interfaceC2286ng : setUnmodifiableSet) {
            if (((AbstractC2912u3) interfaceC2286ng).a.equals(str)) {
                hashSet.add(interfaceC2286ng);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature ".concat(str));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            AbstractC2912u3 abstractC2912u3 = (AbstractC2912u3) ((InterfaceC2286ng) it.next());
            if (abstractC2912u3.a() || abstractC2912u3.b()) {
                return true;
            }
        }
        return false;
    }

    public static float J(int i2) {
        float f2 = i2 / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static Typeface K(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, AbstractC0397Ej.i(configuration.fontWeightAdjustment + typeface.getWeight(), 1, 1000), typeface.isItalic());
    }

    public static TP N(String str) {
        j(str, "<this>");
        try {
            return o(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static RN O(AbstractC1099bV abstractC1099bV) {
        RN rn;
        AbstractC1099bV abstractC1099bVH = abstractC1099bV.H();
        C0660On c0660On = abstractC1099bVH instanceof C0660On ? (C0660On) abstractC1099bVH : null;
        return (c0660On == null || (rn = c0660On.v) == null) ? new RN(new C1081bD()) : rn;
    }

    public static void P(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
    }

    public static void Q(C2527q4 c2527q4, boolean z) {
        if (Build.VERSION.SDK_INT >= 23) {
            AbstractC2233n20.c(c2527q4, z);
            return;
        }
        if (!l) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                k = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            l = true;
        }
        Field field = k;
        if (field != null) {
            try {
                field.set(c2527q4, Boolean.valueOf(z));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public static void R(PopupWindow popupWindow, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            AbstractC2233n20.d(popupWindow, i2);
            return;
        }
        if (!j) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                i = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            j = true;
        }
        Method method = i;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i2));
            } catch (Exception unused2) {
            }
        }
    }

    public static Stream T(AbstractC1099bV abstractC1099bV, Class cls) {
        return StreamSupport.stream(Spliterators.spliteratorUnknownSize(new C1196cV(abstractC1099bV, cls), 273), false);
    }

    public static void U(String str) {
        C0730Rf c0730Rf = new C0730Rf(AbstractC1701hf0.u("lateinit property ", str, " has not been initialized"));
        P(c0730Rf, AbstractC1474fG.class.getName());
        throw c0730Rf;
    }

    public static String V(int i2) {
        Object[] objArr = {Integer.valueOf(Color.red(i2)), Integer.valueOf(Color.green(i2)), Integer.valueOf(Color.blue(i2)), Double.valueOf(((double) Color.alpha(i2)) / 255.0d)};
        int i3 = Lr0.a;
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", objArr);
    }

    public static float Y() {
        return ((float) Math.pow((((double) 50.0f) + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public static C0497If a() {
        C0497If c0497If = new C0497If(true);
        c0497If.S(null);
        return c0497If;
    }

    public static boolean b(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static final Bundle c(C1101bX... c1101bXArr) {
        Bundle bundle = new Bundle(c1101bXArr.length);
        for (C1101bX c1101bX : c1101bXArr) {
            String str = (String) c1101bX.l;
            Object obj = c1101bX.m;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                g(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                R9.a(bundle, str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                R9.b(bundle, str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static void f(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(str.concat(" must not be null"));
        P(illegalStateException, AbstractC1474fG.class.getName());
        throw illegalStateException;
    }

    public static void g(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        P(nullPointerException, AbstractC1474fG.class.getName());
        throw nullPointerException;
    }

    public static void h(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        P(nullPointerException, AbstractC1474fG.class.getName());
        throw nullPointerException;
    }

    public static void i(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        P(nullPointerException, AbstractC1474fG.class.getName());
        throw nullPointerException;
    }

    public static void j(Object obj, String str) {
        if (obj == null) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = AbstractC1474fG.class.getName();
            int i2 = 0;
            while (!stackTrace[i2].getClassName().equals(name)) {
                i2++;
            }
            while (stackTrace[i2].getClassName().equals(name)) {
                i2++;
            }
            StackTraceElement stackTraceElement = stackTrace[i2];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            P(nullPointerException, AbstractC1474fG.class.getName());
            throw nullPointerException;
        }
    }

    public static int k(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 == i3 ? 0 : 1;
    }

    public static final E90 l(AbstractC2484pi abstractC2484pi) {
        j(abstractC2484pi, "<this>");
        K90 k90 = (K90) abstractC2484pi.a(f);
        if (k90 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        InterfaceC1047au0 interfaceC1047au0 = (InterfaceC1047au0) abstractC2484pi.a(g);
        if (interfaceC1047au0 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) abstractC2484pi.a(h);
        String str = (String) abstractC2484pi.a(O9.G);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        J90 j90D = k90.a().d();
        G90 g90 = j90D instanceof G90 ? (G90) j90D : null;
        if (g90 == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap = y(interfaceC1047au0).b;
        E90 e90 = (E90) linkedHashMap.get(str);
        if (e90 != null) {
            return e90;
        }
        Class[] clsArr = E90.f;
        g90.b();
        Bundle bundle2 = g90.c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = g90.c;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = g90.c;
        if (bundle5 != null && bundle5.isEmpty()) {
            g90.c = null;
        }
        E90 e90F = Ou0.f(bundle3, bundle);
        linkedHashMap.put(str, e90F);
        return e90F;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void m(Activity activity, SJ sj) {
        j(activity, "activity");
        j(sj, "event");
        if (activity instanceof InterfaceC1283dK) {
            C1478fK c1478fKF = ((InterfaceC1283dK) activity).f();
            if (c1478fKF instanceof C1478fK) {
                c1478fKF.d(sj);
            }
        }
    }

    public static final void n(K90 k90) {
        j(k90, "<this>");
        TJ tj = k90.f().d;
        if (tj != TJ.m && tj != TJ.n) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (k90.a().d() == null) {
            G90 g90 = new G90(k90.a(), (InterfaceC1047au0) k90);
            k90.a().f("androidx.lifecycle.internal.SavedStateHandlesProvider", g90);
            k90.f().a(new I50(5, g90));
        }
    }

    public static TP o(String str) {
        j(str, "<this>");
        Matcher matcher = TP.e.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }
        String strGroup = matcher.group(1);
        i(strGroup, "typeSubtype.group(1)");
        Locale locale = Locale.US;
        String strI = AbstractC1701hf0.i(locale, "US", strGroup, locale, "this as java.lang.String).toLowerCase(locale)");
        String strGroup2 = matcher.group(2);
        i(strGroup2, "typeSubtype.group(2)");
        String lowerCase = strGroup2.toLowerCase(locale);
        i(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = TP.f.matcher(str);
        int iEnd = matcher.end();
        while (iEnd < str.length()) {
            matcher2.region(iEnd, str.length());
            if (!matcher2.lookingAt()) {
                StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                String strSubstring = str.substring(iEnd);
                i(strSubstring, "this as java.lang.String).substring(startIndex)");
                sb.append(strSubstring);
                sb.append("\" for: \"");
                sb.append(str);
                sb.append('\"');
                throw new IllegalArgumentException(sb.toString().toString());
            }
            String strGroup3 = matcher2.group(1);
            if (strGroup3 == null) {
                iEnd = matcher2.end();
            } else {
                String strGroup4 = matcher2.group(2);
                if (strGroup4 == null) {
                    strGroup4 = matcher2.group(3);
                } else if (AbstractC1899jh0.U(strGroup4, "'", false) && AbstractC1899jh0.L(strGroup4, "'", false) && strGroup4.length() > 2) {
                    strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                    i(strGroup4, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                arrayList.add(strGroup3);
                arrayList.add(strGroup4);
                iEnd = matcher2.end();
            }
        }
        return new TP(str, strI, lowerCase, (String[]) arrayList.toArray(new String[0]));
    }

    public static String q(Context context) {
        Object objK;
        j(context, "context");
        try {
            objK = Settings.Global.getString(context.getContentResolver(), "device_name");
        } catch (Throwable th) {
            objK = Jp0.k(th);
        }
        if (objK instanceof C2439p80) {
            objK = null;
        }
        String str = (String) objK;
        String string = str != null ? AbstractC1119bh0.E0(str).toString() : null;
        if (string == null) {
            string = "";
        }
        String str2 = Build.MANUFACTURER;
        String string2 = str2 != null ? AbstractC1119bh0.E0(str2).toString() : null;
        if (string2 == null) {
            string2 = "";
        }
        String str3 = Build.MODEL;
        String string3 = str3 != null ? AbstractC1119bh0.E0(str3).toString() : null;
        String str4 = string3 != null ? string3 : "";
        if (!AbstractC1899jh0.O(str4)) {
            string2 = (AbstractC1899jh0.O(string2) || AbstractC1899jh0.U(str4, string2, true)) ? str4 : AbstractC1701hf0.e(string2, " ", str4);
        }
        if ((!AbstractC1899jh0.O(string)) && (!AbstractC1899jh0.O(string2)) && !AbstractC1899jh0.N(string, string2, true)) {
            return AbstractC1701hf0.e(string, " - ", string2);
        }
        if (!AbstractC1899jh0.O(string)) {
            return string;
        }
        if (!AbstractC1899jh0.O(string2)) {
            return string2;
        }
        String str5 = Build.DEVICE;
        return (str5 == null || AbstractC1899jh0.O(str5)) ? "Android Device" : str5;
    }

    public static final H90 y(InterfaceC1047au0 interfaceC1047au0) {
        j(interfaceC1047au0, "<this>");
        C3483zx c3483zx = new C3483zx(3);
        Zt0 zt0E = interfaceC1047au0.e();
        AbstractC2484pi abstractC2484piD = interfaceC1047au0 instanceof InterfaceC1665hB ? ((InterfaceC1665hB) interfaceC1047au0).d() : C2290ni.b;
        j(zt0E, "store");
        j(abstractC2484piD, "defaultCreationExtras");
        return (H90) new RN(zt0E, c3483zx, abstractC2484piD).x(AbstractC2822t60.a(H90.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public abstract boolean F(float f2);

    public abstract boolean H(View view);

    public abstract boolean I(float f2, float f3);

    public abstract void L(int i2);

    public abstract void M(Typeface typeface, boolean z);

    public abstract boolean S(View view, float f2);

    public abstract void W(ViewGroup.MarginLayoutParams marginLayoutParams, int i2);

    public abstract void X(ViewGroup.MarginLayoutParams marginLayoutParams, int i2, int i3);

    public abstract int d(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float e(int i2);

    public abstract int p(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract int r();

    public abstract int s();

    public abstract int t();

    public abstract int u();

    public abstract int w(View view);

    public abstract int x(CoordinatorLayout coordinatorLayout);

    public abstract int z();
}
