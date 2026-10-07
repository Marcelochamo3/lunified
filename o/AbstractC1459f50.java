package o;

import android.R;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.LongSparseArray;
import android.util.Property;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: o.f50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1459f50 implements InterfaceC3058ve0 {
    public static final Object[] a = new Object[0];
    public static final int[] b = {R.attr.theme, com.skidush.clonex.R.attr.theme};
    public static final int[] c = {com.skidush.clonex.R.attr.materialThemeOverlay};
    public static final int[] d = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};
    public static volatile boolean e = true;
    public static Field f;
    public static boolean g;
    public static Class h;
    public static boolean i;
    public static Field j;
    public static boolean k;
    public static Field l;
    public static boolean m;
    public static SharedPreferences n;

    /* JADX WARN: Code duplicated, block: B:28:0x008d  */
    public static LinkedHashSet A() {
        Set<String> setB0;
        Q30.a.getClass();
        List list = P30.b;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((Q30) it.next()).getName());
        }
        Q30.a.getClass();
        List list2 = P30.b;
        Set set = P30.c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (!set.contains((Q30) obj)) {
                arrayList.add(obj);
            }
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            linkedHashSet2.add(((Q30) it2.next()).getName());
        }
        SharedPreferences sharedPreferences = n;
        if (sharedPreferences == null) {
            return linkedHashSet2;
        }
        if (sharedPreferences == null) {
            AbstractC1474fG.U("prefs");
            throw null;
        }
        if (sharedPreferences.contains("VISIBLE_PROVIDERS")) {
            SharedPreferences sharedPreferences2 = n;
            if (sharedPreferences2 == null) {
                AbstractC1474fG.U("prefs");
                throw null;
            }
            Set<String> stringSet = sharedPreferences2.getStringSet("VISIBLE_PROVIDERS", C1722hq.l);
            if (stringSet != null) {
                setB0 = AbstractC0911Ye.B0(stringSet);
            } else {
                setB0 = null;
            }
        } else {
            setB0 = null;
        }
        Cr0 cr0 = Cr0.E;
        Integer numA = cr0.a();
        int iIntValue = numA != null ? numA.intValue() : 0;
        if (iIntValue < 2) {
            cr0.e(2);
            if (setB0 != null) {
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                for (String str : setB0) {
                    if (AbstractC1474fG.b(str, "PPV.TO")) {
                        QW qw = QW.b;
                        str = "EVENTOS 3";
                    }
                    linkedHashSet3.add(str);
                }
                if (iIntValue < 1) {
                    C2409ot c2409ot = C2409ot.b;
                    LinkedHashSet linkedHashSetS = Lc0.S(linkedHashSet3, "EVENTOS 2");
                    LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                    AbstractC0911Ye.v0(linkedHashSetS, linkedHashSet4);
                    linkedHashSet3 = linkedHashSet4;
                }
                LinkedHashSet linkedHashSet5 = new LinkedHashSet();
                for (Object obj2 : linkedHashSet3) {
                    if (linkedHashSet.contains((String) obj2)) {
                        linkedHashSet5.add(obj2);
                    }
                }
                Cr0.D.g(linkedHashSet5);
                return linkedHashSet5;
            }
        }
        if (setB0 == null) {
            return linkedHashSet2;
        }
        LinkedHashSet linkedHashSet6 = new LinkedHashSet();
        for (Object obj3 : setB0) {
            if (linkedHashSet.contains((String) obj3)) {
                linkedHashSet6.add(obj3);
            }
        }
        LinkedHashSet linkedHashSet7 = linkedHashSet6.isEmpty() ^ true ? linkedHashSet6 : null;
        return linkedHashSet7 != null ? linkedHashSet7 : linkedHashSet2;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0039  */
    public static boolean B(C1855j80 c1855j80, C1951k70 c1951k70) {
        AbstractC1474fG.j(c1855j80, "response");
        AbstractC1474fG.j(c1951k70, "request");
        int i2 = c1855j80.f840o;
        if (i2 != 200 && i2 != 410 && i2 != 414 && i2 != 501 && i2 != 203 && i2 != 204) {
            if (i2 == 307) {
                if (c1855j80.f("Expires", null) == null && c1855j80.a().c == -1 && !c1855j80.a().f && !c1855j80.a().e) {
                    return false;
                }
            } else if (i2 != 308 && i2 != 404 && i2 != 405) {
                switch (i2) {
                    case 300:
                    case 301:
                        break;
                    case 302:
                        if (c1855j80.f("Expires", null) == null) {
                            return false;
                        }
                        break;
                    default:
                        return false;
                }
            }
        }
        if (c1855j80.a().b) {
            return false;
        }
        C0414Fa c0414FaW = c1951k70.f;
        if (c0414FaW == null) {
            int i3 = C0414Fa.n;
            c0414FaW = AbstractC3045vW.w(c1951k70.c);
            c1951k70.f = c0414FaW;
        }
        return !c0414FaW.b;
    }

    public static Drawable C(Context context, int i2, Resources.Theme theme) {
        if (theme != null) {
            C0447Gh c0447Gh = new C0447Gh(context);
            c0447Gh.b = theme;
            c0447Gh.a(theme.getResources().getConfiguration());
            context = c0447Gh;
        }
        return Ou0.l(context, i2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:39:0x007c A[RETURN, SYNTHETIC] */
    public static int D(String str) {
        switch (str) {
            case "steel_blue":
                return com.skidush.clonex.R.style.AppTheme_Mobile_Steel;
            case "retro_neon":
                return com.skidush.clonex.R.style.AppTheme_Mobile_Neon;
            case "nord_frost":
                return com.skidush.clonex.R.style.AppTheme_Mobile_Nord;
            case "crimson_noir":
                return com.skidush.clonex.R.style.AppTheme_Mobile_Crimson;
            case "forest_night":
                return com.skidush.clonex.R.style.AppTheme_Mobile_Forest;
            case "emerald_luxe":
                return com.skidush.clonex.R.style.AppTheme_Mobile_Emerald;
            case "sunset_cinema":
                return com.skidush.clonex.R.style.AppTheme_Mobile_Sunset;
            case "nero_amoled_oled":
                return com.skidush.clonex.R.style.AppTheme_Mobile_Amoled;
            case "midnight_violet":
                return com.skidush.clonex.R.style.AppTheme_Mobile_Violet;
            default:
                return com.skidush.clonex.R.style.AppTheme_Mobile;
        }
    }

    public static String E(Context context) {
        String str = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (UK.f(context, str) == 0) {
            return str;
        }
        throw new RuntimeException(AbstractC1701hf0.u("Permission ", str, " is required by your application to receive broadcasts, please add it to your manifest"));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static C1123bj0 F(String str) {
        AbstractC1474fG.j(str, "theme");
        switch (str.hashCode()) {
            case -2074050994:
                if (str.equals("steel_blue")) {
                    return G("#141C25", "#1A2430", "#7DB3E8", "#8CA2B8", "#EAF4FF", "#ADC5DA");
                }
                break;
            case -1424289065:
                if (str.equals("retro_neon")) {
                    return G("#16161D", "#18181E", "#4DE0D7", "#A56FBD", "#F4F7FF", "#CFB7DA");
                }
                break;
            case -715186376:
                if (str.equals("nord_frost")) {
                    return G("#182029", "#18212A", "#8ED0E8", "#8EA2B0", "#EAF7FD", "#B1C9D6");
                }
                break;
            case -169112566:
                if (str.equals("crimson_noir")) {
                    return G("#1C1014", "#241015", "#D86A7A", "#A88891", "#FFECEF", "#D6B2BA");
                }
                break;
            case 846944630:
                if (str.equals("forest_night")) {
                    return G("#101816", "#13221E", "#65D7C2", "#8DB3AA", "#E6FFF8", "#A8D1C7");
                }
                break;
            case 862887793:
                if (str.equals("emerald_luxe")) {
                    return G("#11201B", "#13211B", "#7ED6A3", "#98AE9F", "#EDF9F2", "#B6D0C0");
                }
                break;
            case 1102196922:
                if (str.equals("sunset_cinema")) {
                    return G("#201410", "#2B1812", "#F39A5B", "#C49B86", "#FFF0E5", "#D7B7A4");
                }
                break;
            case 1413414440:
                if (str.equals("nero_amoled_oled")) {
                    return G("#000000", "#050505", "#FFFFFF", "#7A7A7A", "#FFFFFF", "#BDBDBD");
                }
                break;
            case 2044615886:
                if (str.equals("midnight_violet")) {
                    return G("#151523", "#181726", "#AFA3FF", "#8F8AAE", "#F1EEFF", "#BFB9DD");
                }
                break;
        }
        return G("#181818", "#1E2129", "#C6C6C6", "#808080", "#FFFFFF", "#B3FFFFFF");
    }

    public static C1123bj0 G(String str, String str2, String str3, String str4, String str5, String str6) {
        return new C1123bj0(Color.parseColor(str), Color.parseColor(str2), Color.parseColor(str3), Color.parseColor(str4), Color.parseColor(str5), Color.parseColor(str6));
    }

    public static byte[] H(Mac mac, byte[] bArr, byte[] bArr2, int i2, int i3) throws InvalidKeyException {
        mac.init(new SecretKeySpec(bArr, "HmacSHA256"));
        int macLength = mac.getMacLength();
        int i4 = ((i3 + macLength) - 1) / macLength;
        byte[] bArr3 = new byte[i3];
        if (1 <= i4) {
            int i5 = 1;
            while (true) {
                byte[] bArr4 = new byte[bArr2.length + 4];
                System.arraycopy(bArr2, 0, bArr4, 0, bArr2.length);
                R(bArr4, bArr2.length, i5);
                byte[] bArrDoFinal = mac.doFinal(bArr4);
                byte[] bArr5 = (byte[]) bArrDoFinal.clone();
                int i6 = 1;
                while (i6 < i2) {
                    byte[] bArrDoFinal2 = mac.doFinal(bArrDoFinal);
                    Arrays.fill(bArrDoFinal, (byte) 0);
                    int length = bArr5.length;
                    for (int i7 = 0; i7 < length; i7++) {
                        bArr5[i7] = (byte) (bArr5[i7] ^ bArrDoFinal2[i7]);
                    }
                    i6++;
                    bArrDoFinal = bArrDoFinal2;
                }
                int i8 = (i5 - 1) * macLength;
                System.arraycopy(bArr5, 0, bArr3, i8, Math.min(macLength, i3 - i8));
                Arrays.fill(bArr4, (byte) 0);
                Arrays.fill(bArrDoFinal, (byte) 0);
                Arrays.fill(bArr5, (byte) 0);
                if (i5 == i4) {
                    break;
                }
                i5++;
            }
        }
        return bArr3;
    }

    public static C2994uv I(C2562qX c2562qX) {
        c2562qX.G(1);
        int iW = c2562qX.w();
        long j2 = ((long) c2562qX.b) + ((long) iW);
        int i2 = iW / 18;
        long[] jArrCopyOf = new long[i2];
        long[] jArrCopyOf2 = new long[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            long jO = c2562qX.o();
            if (jO == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i3);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i3);
                break;
            }
            jArrCopyOf[i3] = jO;
            jArrCopyOf2[i3] = c2562qX.o();
            c2562qX.G(2);
        }
        c2562qX.G((int) (j2 - ((long) c2562qX.b)));
        return new C2994uv(jArrCopyOf, 0, jArrCopyOf2);
    }

    public static void J(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = AbstractC3045vW.R(drawable).mutate();
        AbstractC2205mo.h(drawableMutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    public static void K(Context context, W80 w80, IntentFilter intentFilter) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            AbstractC0343Ch.a(context, w80, intentFilter, null, null, 2);
        } else if (i2 >= 26) {
            AbstractC0291Ah.a(context, w80, intentFilter, null, null, 2);
        } else {
            context.registerReceiver(w80, intentFilter, null, null);
        }
    }

    public static void L(Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            AbstractC2125lw0.a(window, z);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }

    public static void M(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = It0.a;
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z = onLongClickListener != null;
        boolean z2 = zHasOnClickListeners || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        checkableImageButton.setLongClickable(z);
        checkableImageButton.setImportantForAccessibility(z2 ? 1 : 2);
    }

    public static boolean N(InterfaceC0328Bs interfaceC0328Bs, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        int i2;
        long jD = interfaceC0328Bs.d();
        long j2 = 4096;
        long j3 = -1;
        int i3 = (jD > (-1L) ? 1 : (jD == (-1L) ? 0 : -1));
        if (i3 != 0 && jD <= 4096) {
            j2 = jD;
        }
        int i4 = (int) j2;
        C2562qX c2562qX = new C2562qX(64);
        boolean z5 = false;
        int i5 = 0;
        boolean z6 = false;
        while (true) {
            if (i5 < i4) {
                c2562qX.C(8);
                if (interfaceC0328Bs.x(c2562qX.a, z5 ? 1 : 0, 8, true)) {
                    long jV = c2562qX.v();
                    int iG = c2562qX.g();
                    if (jV == 1) {
                        interfaceC0328Bs.B(c2562qX.a, 8, 8);
                        c2562qX.E(16);
                        jV = c2562qX.o();
                        i2 = 16;
                    } else {
                        if (jV == 0) {
                            long jD2 = interfaceC0328Bs.d();
                            if (jD2 != j3) {
                                jV = (jD2 - interfaceC0328Bs.A()) + ((long) 8);
                            }
                        }
                        i2 = 8;
                    }
                    long j4 = i2;
                    if (jV < j4) {
                        return z5;
                    }
                    i5 += i2;
                    if (iG == 1836019574) {
                        i4 += (int) jV;
                        if (i3 != 0 && i4 > jD) {
                            i4 = (int) jD;
                        }
                        j3 = -1;
                    } else {
                        if (iG == 1836019558 || iG == 1836475768) {
                            z3 = true;
                            z4 = true;
                            if (z6 || z != z4) {
                                return false;
                            }
                            return z3;
                        }
                        int i6 = i3;
                        if ((((long) i5) + jV) - j4 < i4) {
                            int i7 = (int) (jV - j4);
                            i5 += i7;
                            if (iG == 1718909296) {
                                if (i7 < 8) {
                                    return false;
                                }
                                c2562qX.C(i7);
                                interfaceC0328Bs.B(c2562qX.a, 0, i7);
                                int i8 = i7 / 4;
                                for (int i9 = 0; i9 < i8; i9++) {
                                    if (i9 != 1) {
                                        int iG2 = c2562qX.g();
                                        if ((iG2 >>> 8) != 3368816 && (iG2 != 1751476579 || !z2)) {
                                            int[] iArr = d;
                                            int i10 = 0;
                                            while (true) {
                                                if (i10 >= 29) {
                                                    continue;
                                                } else if (iArr[i10] != iG2) {
                                                    i10++;
                                                }
                                            }
                                        }
                                        z6 = true;
                                        break;
                                    }
                                    c2562qX.G(4);
                                }
                                if (!z6) {
                                    return false;
                                }
                            } else if (i7 != 0) {
                                interfaceC0328Bs.C(i7);
                            }
                            i3 = i6;
                            j3 = -1;
                            z5 = false;
                        }
                    }
                }
            }
            z3 = true;
            z4 = false;
            if (z6) {
            }
            return false;
        }
    }

    public static final Object[] O(Collection collection) {
        AbstractC1474fG.j(collection, "collection");
        int size = collection.size();
        Object[] objArr = a;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArrCopyOf = new Object[size];
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            objArrCopyOf[i2] = it.next();
            if (i3 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i4 = ((i3 * 3) + 1) >>> 1;
                if (i4 <= i3) {
                    i4 = 2147483645;
                    if (i3 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
                AbstractC1474fG.i(objArrCopyOf, "copyOf(...)");
            } else if (!it.hasNext()) {
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i3);
                AbstractC1474fG.i(objArrCopyOf2, "copyOf(...)");
                return objArrCopyOf2;
            }
            i2 = i3;
        }
    }

    public static final Object[] P(Collection collection, Object[] objArr) {
        Object[] objArrCopyOf;
        AbstractC1474fG.j(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i2 = 0;
        if (size == 0) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        if (size <= objArr.length) {
            objArrCopyOf = objArr;
        } else {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            AbstractC1474fG.h(objNewInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf = (Object[]) objNewInstance;
        }
        while (true) {
            int i3 = i2 + 1;
            objArrCopyOf[i2] = it.next();
            if (i3 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i4 = ((i3 * 3) + 1) >>> 1;
                if (i4 <= i3) {
                    i4 = 2147483645;
                    if (i3 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
                AbstractC1474fG.i(objArrCopyOf, "copyOf(...)");
            } else if (!it.hasNext()) {
                if (objArrCopyOf == objArr) {
                    objArr[i3] = null;
                    return objArr;
                }
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i3);
                AbstractC1474fG.i(objArrCopyOf2, "copyOf(...)");
                return objArrCopyOf2;
            }
            i2 = i3;
        }
    }

    public static Context Q(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c, i2, i3);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        boolean z = (context instanceof C0447Gh) && ((C0447Gh) context).a == resourceId;
        if (resourceId == 0 || z) {
            return context;
        }
        C0447Gh c0447Gh = new C0447Gh(context, resourceId);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, b);
        int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = typedArrayObtainStyledAttributes2.getResourceId(1, 0);
        typedArrayObtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            c0447Gh.getTheme().applyStyle(resourceId2, true);
        }
        return c0447Gh;
    }

    public static void R(byte[] bArr, int i2, int i3) {
        bArr[i2] = (byte) (i3 >>> 24);
        bArr[i2 + 1] = (byte) (i3 >>> 16);
        bArr[i2 + 2] = (byte) (i3 >>> 8);
        bArr[i2 + 3] = (byte) i3;
    }

    public static void d(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = AbstractC3045vW.R(drawable).mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                AbstractC2205mo.h(drawable, colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
                AbstractC2205mo.h(drawable, ColorStateList.valueOf(colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                AbstractC2205mo.i(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static String f(int i2, String str, int i3) {
        if (i2 < 0) {
            return UK.J("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return UK.J("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i3);
        throw new IllegalArgumentException(sb.toString());
    }

    public static void g(boolean z, String str, long j2) {
        if (!z) {
            throw new IllegalArgumentException(UK.J(str, Long.valueOf(j2)));
        }
    }

    public static void h(int i2, int i3) {
        String strJ;
        if (i2 < 0 || i2 >= i3) {
            if (i2 < 0) {
                strJ = UK.J("%s (%s) must not be negative", "index", Integer.valueOf(i2));
            } else {
                if (i3 < 0) {
                    StringBuilder sb = new StringBuilder(26);
                    sb.append("negative size: ");
                    sb.append(i3);
                    throw new IllegalArgumentException(sb.toString());
                }
                strJ = UK.J("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(strJ);
        }
    }

    public static void i(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(f(i2, "index", i3));
        }
    }

    public static void j(int i2, int i3, int i4) {
        String strF;
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            if (i2 < 0 || i2 > i4) {
                strF = f(i2, "start index", i4);
            } else {
                strF = (i3 < 0 || i3 > i4) ? f(i3, "end index", i4) : UK.J("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strF);
        }
    }

    public static int k(Context context, String str) {
        boolean zA = true;
        if (str == null) {
            throw new NullPointerException("permission must be non-null");
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        C2172mV c2172mV = new C2172mV(context);
        if (i2 >= 24) {
            zA = AbstractC2075lV.a(c2172mV.a);
        } else {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            String packageName = context.getApplicationContext().getPackageName();
            int i3 = applicationInfo.uid;
            try {
                Class<?> cls = Class.forName(AppOpsManager.class.getName());
                Class<?> cls2 = Integer.TYPE;
                Method method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
                Integer num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
                num.getClass();
                if (((Integer) method.invoke(appOpsManager, num, Integer.valueOf(i3), packageName)).intValue() != 0) {
                    zA = false;
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            }
        }
        return zA ? 0 : -1;
    }

    public static ImageView.ScaleType l(int i2) {
        if (i2 == 0) {
            return ImageView.ScaleType.FIT_XY;
        }
        if (i2 == 1) {
            return ImageView.ScaleType.FIT_START;
        }
        if (i2 == 2) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        if (i2 == 3) {
            return ImageView.ScaleType.FIT_END;
        }
        if (i2 != 5) {
            return i2 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE;
        }
        return ImageView.ScaleType.CENTER_CROP;
    }

    public static byte[] n(String str, String str2) throws IOException {
        if (str.length() != 0 && str.length() % 2 == 0) {
            Pattern patternCompile = Pattern.compile("[0-9a-fA-F]+");
            AbstractC1474fG.i(patternCompile, "compile(...)");
            if (patternCompile.matcher(str).matches()) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i2 = 0; i2 < length; i2++) {
                    int i3 = i2 * 2;
                    String strSubstring = str.substring(i3, i3 + 2);
                    AbstractC1474fG.i(strSubstring, "substring(...)");
                    AbstractC3021v9.e(16);
                    bArr[i2] = (byte) Integer.parseInt(strSubstring, 16);
                }
                return bArr;
            }
        }
        throw new IOException(AbstractC1701hf0.u("El campo ALTCHA ", str2, " no es válido"));
    }

    public static String o(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            sb.append("0123456789abcdef".charAt((b2 & 255) >>> 4));
            sb.append("0123456789abcdef".charAt(b2 & 15));
        }
        String string = sb.toString();
        AbstractC1474fG.i(string, "toString(...)");
        return string;
    }

    public static boolean p(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void q(Object obj) {
        LongSparseArray longSparseArray;
        if (!i) {
            try {
                h = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException unused) {
            }
            i = true;
        }
        Class cls = h;
        if (cls == null) {
            return;
        }
        if (!k) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                j = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
            }
            k = true;
        }
        Field field = j;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException unused3) {
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }

    public static Br0 r() {
        Integer numA = Cr0.l.a();
        Object obj = null;
        if (numA == null) {
            return null;
        }
        int iIntValue = numA.intValue();
        C0404Eq c0404Eq = Br0.p;
        c0404Eq.getClass();
        G g2 = new G(0, c0404Eq);
        while (g2.hasNext()) {
            Object next = g2.next();
            if (((Br0) next).l == iIntValue) {
                obj = next;
                break;
            }
        }
        return (Br0) obj;
    }

    public static C0493Ib s() {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        int iIntValue5;
        Integer numA = Cr0.q.a();
        if (numA != null) {
            iIntValue = numA.intValue();
        } else {
            R00.a.getClass();
            iIntValue = R00.b.a;
        }
        int i2 = iIntValue;
        Integer numA2 = Cr0.r.a();
        if (numA2 != null) {
            iIntValue2 = numA2.intValue();
        } else {
            R00.a.getClass();
            iIntValue2 = R00.b.b;
        }
        int i3 = iIntValue2;
        Integer numA3 = Cr0.s.a();
        if (numA3 != null) {
            iIntValue3 = numA3.intValue();
        } else {
            R00.a.getClass();
            iIntValue3 = R00.b.c;
        }
        int i4 = iIntValue3;
        Integer numA4 = Cr0.t.a();
        if (numA4 != null) {
            iIntValue4 = numA4.intValue();
        } else {
            R00.a.getClass();
            iIntValue4 = R00.b.d;
        }
        int i5 = iIntValue4;
        Integer numA5 = Cr0.u.a();
        if (numA5 != null) {
            iIntValue5 = numA5.intValue();
        } else {
            R00.a.getClass();
            iIntValue5 = R00.b.e;
        }
        int i6 = iIntValue5;
        R00.a.getClass();
        return new C0493Ib(i2, i3, i4, i5, i6, R00.b.f);
    }

    public static float t() {
        SharedPreferences sharedPreferences = n;
        Float fValueOf = null;
        if (sharedPreferences == null) {
            AbstractC1474fG.U("prefs");
            throw null;
        }
        if (sharedPreferences.contains("CAPTION_TEXT_SIZE")) {
            SharedPreferences sharedPreferences2 = n;
            if (sharedPreferences2 == null) {
                AbstractC1474fG.U("prefs");
                throw null;
            }
            fValueOf = Float.valueOf(sharedPreferences2.getFloat("CAPTION_TEXT_SIZE", 0.0f));
        }
        if (fValueOf != null) {
            return fValueOf.floatValue();
        }
        M00.c.getClass();
        return M00.d.b;
    }

    public static int u(Context context, int i2) {
        return Build.VERSION.SDK_INT >= 23 ? AbstractC3451zh.a(context, i2) : context.getResources().getColor(i2);
    }

    public static ColorStateList v(Context context, int i2) {
        ColorStateList colorStateListA;
        ColorStateList colorStateList;
        C1172c80 c1172c80;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        C1270d80 c1270d80 = new C1270d80(resources, theme);
        synchronized (AbstractC1465f80.c) {
            try {
                SparseArray sparseArray = (SparseArray) AbstractC1465f80.b.get(c1270d80);
                colorStateListA = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (c1172c80 = (C1172c80) sparseArray.get(i2)) == null) {
                    colorStateList = null;
                } else {
                    if (c1172c80.b.equals(resources.getConfiguration())) {
                        if (theme != null || c1172c80.c != 0) {
                            if (theme == null || c1172c80.c != theme.hashCode()) {
                            }
                        }
                        colorStateList = c1172c80.a;
                    }
                    sparseArray.remove(i2);
                    colorStateList = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = AbstractC1465f80.a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i2, typedValue, true);
        int i3 = typedValue.type;
        if (i3 < 28 || i3 > 31) {
            try {
                colorStateListA = Cif.a(resources, resources.getXml(i2), theme);
            } catch (Exception unused) {
            }
        }
        if (colorStateListA == null) {
            return Build.VERSION.SDK_INT >= 23 ? AbstractC1075b80.b(resources, i2, theme) : resources.getColorStateList(i2);
        }
        AbstractC1465f80.a(c1270d80, i2, colorStateListA, theme);
        return colorStateListA;
    }

    public static Q30 w() {
        Object next;
        String strB = Cr0.m.b();
        if (AbstractC1474fG.b(strB, "PPV.TO")) {
            return QW.b;
        }
        Q30.a.getClass();
        Iterator it = P30.b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC1474fG.b(((Q30) next).getName(), strB));
        Q30 q30 = (Q30) next;
        return q30 == null ? C1816io0.b : q30;
    }

    public static Drawable x(Context context, Context context2, int i2, Resources.Theme theme) {
        try {
            if (e) {
                return C(context2, i2, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e2) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e2;
            }
            return AbstractC3354yh.b(context2, i2);
        } catch (NoClassDefFoundError unused2) {
            e = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal threadLocal = AbstractC1465f80.a;
        return AbstractC0977a80.a(resources, i2, theme);
    }

    public static final WJ y(InterfaceC1283dK interfaceC1283dK) {
        WJ wj;
        AbstractC1474fG.j(interfaceC1283dK, "<this>");
        C1478fK c1478fKF = interfaceC1283dK.f();
        AbstractC1474fG.j(c1478fKF, "<this>");
        loop0: while (true) {
            AtomicReference atomicReference = c1478fKF.a;
            wj = (WJ) atomicReference.get();
            if (wj != null) {
                break;
            }
            Fh0 fh0A = U9.a();
            C3362yl c3362yl = AbstractC1910jn.a;
            wj = new WJ(c1478fKF, Sr0.z(fh0A, ((C1079bB) FM.a).q));
            do {
                if (atomicReference.compareAndSet(null, wj)) {
                    C3362yl c3362yl2 = AbstractC1910jn.a;
                    AbstractC1376eG.w(wj, ((C1079bB) FM.a).q, 0, new VJ(wj, null), 2);
                    break loop0;
                }
            } while (atomicReference.get() == null);
        }
        return wj;
    }

    public static Dr0 z() {
        Object next;
        C0404Eq c0404Eq = Dr0.p;
        c0404Eq.getClass();
        G g2 = new G(0, c0404Eq);
        while (true) {
            if (!g2.hasNext()) {
                next = null;
                break;
            }
            next = g2.next();
            int i2 = ((Dr0) next).m;
            Integer numA = Cr0.p.a();
            if (numA != null && i2 == numA.intValue()) {
                break;
            }
        }
        Dr0 dr0 = (Dr0) next;
        return dr0 == null ? Dr0.Fit : dr0;
    }

    @Override // o.InterfaceC3058ve0
    public float b(View view) {
        return view.getTranslationY();
    }

    @Override // o.InterfaceC3058ve0
    public Property c() {
        return View.TRANSLATION_Y;
    }

    public C2295nk0 e() {
        U9.d(2, "expectedValuesPerKey");
        return new C2295nk0(this);
    }

    public abstract Map m();
}
