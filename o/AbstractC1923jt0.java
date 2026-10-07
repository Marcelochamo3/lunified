package o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EdgeEffect;
import com.bumptech.glide.integration.okhttp3.OkHttpGlideModule;
import com.skidush.clonex.R;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.zip.Inflater;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.jt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1923jt0 {
    public static final N2 a = new N2(8);
    public static final J2 b = new J2(10, "NO_OWNER", false);
    public static final int[] c = {R.attr.colorPrimary};
    public static final int[] d = {R.attr.colorPrimaryVariant};

    public static OkHttpGlideModule C(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                Object objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                if (objNewInstance instanceof OkHttpGlideModule) {
                    return (OkHttpGlideModule) objNewInstance;
                }
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + objNewInstance);
            } catch (IllegalAccessException e) {
                I(cls, e);
                throw null;
            } catch (InstantiationException e2) {
                I(cls, e2);
                throw null;
            } catch (NoSuchMethodException e3) {
                I(cls, e3);
                throw null;
            } catch (InvocationTargetException e4) {
                I(cls, e4);
                throw null;
            }
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0064  */
    public static ArrayList D(C2562qX c2562qX) {
        ArrayList arrayList;
        int i;
        ArrayList arrayList2;
        I30 i30;
        C2562qX c2562qX2 = c2562qX;
        I30 i31 = null;
        if (c2562qX.u() != 0) {
            return null;
        }
        c2562qX2.G(7);
        int iG = c2562qX.g();
        if (iG == 1684433976) {
            C2562qX c2562qX3 = new C2562qX();
            Inflater inflater = new Inflater(true);
            try {
                if (!Lr0.G(c2562qX2, c2562qX3, inflater)) {
                    inflater.end();
                    return null;
                }
                inflater.end();
                c2562qX2 = c2562qX3;
            } catch (Throwable th) {
                inflater.end();
                throw th;
            }
        } else if (iG != 1918990112) {
            return null;
        }
        ArrayList arrayList3 = new ArrayList();
        int i2 = c2562qX2.b;
        int i3 = c2562qX2.c;
        while (i2 < i3) {
            int iG2 = c2562qX2.g() + i2;
            if (iG2 > i2 && iG2 <= i3) {
                if (c2562qX2.g() == 1835365224) {
                    int iG3 = c2562qX2.g();
                    if (iG3 > 10000) {
                        i30 = i31;
                        arrayList2 = arrayList3;
                        i = i3;
                    } else {
                        float[] fArr = new float[iG3];
                        for (int i4 = 0; i4 < iG3; i4++) {
                            fArr[i4] = Float.intBitsToFloat(c2562qX2.g());
                        }
                        int iG4 = c2562qX2.g();
                        if (iG4 > 32000) {
                            i30 = i31;
                            arrayList2 = arrayList3;
                            i = i3;
                        } else {
                            double dLog = Math.log(2.0d);
                            arrayList2 = arrayList3;
                            int iCeil = (int) Math.ceil(Math.log(((double) iG3) * 2.0d) / dLog);
                            byte[] bArr = c2562qX2.a;
                            C2084lc c2084lc = new C2084lc(bArr.length, bArr);
                            c2084lc.p(c2562qX2.b * 8);
                            float[] fArr2 = new float[iG4 * 5];
                            int i5 = 5;
                            int[] iArr = new int[5];
                            int i6 = 0;
                            int i7 = 0;
                            while (true) {
                                if (i6 < iG4) {
                                    int i8 = 0;
                                    while (true) {
                                        if (i8 < i5) {
                                            int i9 = iArr[i8];
                                            int i10 = c2084lc.i(iCeil);
                                            int i11 = ((i10 >> 1) ^ (-(i10 & 1))) + i9;
                                            if (i11 < iG3 && i11 >= 0) {
                                                fArr2[i7] = fArr[i11];
                                                iArr[i8] = i11;
                                                i8++;
                                                i7++;
                                                i5 = 5;
                                            }
                                        } else {
                                            i6++;
                                            i5 = 5;
                                        }
                                    }
                                } else {
                                    c2084lc.p((c2084lc.g() + 7) & (-8));
                                    int i12 = 32;
                                    int i13 = c2084lc.i(32);
                                    C0709Qk[] c0709QkArr = new C0709Qk[i13];
                                    int i14 = 0;
                                    while (true) {
                                        if (i14 < i13) {
                                            int i15 = c2084lc.i(8);
                                            int i16 = c2084lc.i(8);
                                            int i17 = c2084lc.i(i12);
                                            if (i17 <= 128000) {
                                                i = i3;
                                                int iCeil2 = (int) Math.ceil(Math.log(((double) iG4) * 2.0d) / dLog);
                                                float[] fArr3 = new float[i17 * 3];
                                                float[] fArr4 = new float[i17 * 2];
                                                int i18 = 0;
                                                int i19 = 0;
                                                while (true) {
                                                    if (i18 < i17) {
                                                        int i20 = c2084lc.i(iCeil2);
                                                        C2084lc c2084lc2 = c2084lc;
                                                        float[] fArr5 = fArr4;
                                                        int i21 = i13;
                                                        int i22 = ((i20 >> 1) ^ (-(i20 & 1))) + i19;
                                                        if (i22 < 0 || i22 >= iG4) {
                                                            i30 = null;
                                                        } else {
                                                            int i23 = i18 * 3;
                                                            int i24 = i22 * 5;
                                                            fArr3[i23] = fArr2[i24];
                                                            fArr3[i23 + 1] = fArr2[i24 + 1];
                                                            fArr3[i23 + 2] = fArr2[i24 + 2];
                                                            int i25 = i18 * 2;
                                                            fArr5[i25] = fArr2[i24 + 3];
                                                            fArr5[i25 + 1] = fArr2[i24 + 4];
                                                            i18++;
                                                            i19 = i22;
                                                            c2084lc = c2084lc2;
                                                            fArr4 = fArr5;
                                                            i13 = i21;
                                                        }
                                                    } else {
                                                        c0709QkArr[i14] = new C0709Qk(i15, fArr3, fArr4, i16);
                                                        i14++;
                                                        i3 = i;
                                                        i13 = i13;
                                                        i12 = 32;
                                                    }
                                                }
                                            }
                                        } else {
                                            i = i3;
                                            i30 = new I30(c0709QkArr);
                                        }
                                    }
                                }
                                i = i3;
                                i30 = null;
                            }
                        }
                    }
                    if (i30 != null) {
                        arrayList = arrayList2;
                        arrayList.add(i30);
                    }
                } else {
                    arrayList = arrayList3;
                    i = i3;
                }
                c2562qX2.F(iG2);
                arrayList3 = arrayList;
                i2 = iG2;
                i3 = i;
                i31 = null;
            }
            return null;
        }
        return arrayList3;
    }

    public static JSONObject E(JSONObject jSONObject, JSONObject jSONObject2) {
        com.skidush.clonex.bridge.N7 n7 = com.skidush.clonex.bridge.N7.a;
        String string = jSONObject.toString();
        AbstractC1474fG.i(string, "toString(...)");
        String string2 = jSONObject2.toString();
        AbstractC1474fG.i(string2, "toString(...)");
        String strI = n7.i(string, string2);
        if (strI != null) {
            return new JSONObject(strI);
        }
        throw new IllegalStateException("Configuración de reproducción no disponible");
    }

    public static final void F(Map map) {
        Set setKeySet = map.keySet();
        if (setKeySet != null) {
            ArrayList arrayList = new ArrayList(AbstractC1016af.O(setKeySet, 10));
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                String lowerCase = ((String) it.next()).toLowerCase(Locale.ROOT);
                AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
                arrayList.add(lowerCase);
            }
            AbstractC0911Ye.h0(AbstractC0911Ye.q0(arrayList), null, "[", "]", null, 57);
        }
    }

    public static final void G(Comparable comparable) {
        Object objK;
        String string = comparable != null ? comparable.toString() : null;
        String str = "";
        if (string == null) {
            string = "";
        }
        if (AbstractC1899jh0.O(string)) {
            return;
        }
        try {
            Uri uri = Uri.parse(string);
            String scheme = uri.getScheme();
            if (scheme == null) {
                scheme = "";
            }
            String host = uri.getHost();
            if (host != null) {
                str = host;
            }
            if ((!AbstractC1899jh0.O(scheme)) && (!AbstractC1899jh0.O(str))) {
                objK = scheme + "://" + str + "/[oculto]";
            } else {
                objK = AbstractC1899jh0.O(scheme) ^ true ? scheme.concat(":[oculto]") : "[destino oculto]";
            }
        } catch (Throwable th) {
            objK = Jp0.k(th);
        }
    }

    public static void H(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            Ql0.a(view, charSequence);
            return;
        }
        Sl0 sl0 = Sl0.v;
        if (sl0 != null && sl0.l == view) {
            Sl0.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new Sl0(view, charSequence);
            return;
        }
        Sl0 sl1 = Sl0.w;
        if (sl1 != null && sl1.l == view) {
            sl1.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static void I(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, reflectiveOperationException);
    }

    public static final C2791sq0 K(InterfaceC0473Hh interfaceC0473Hh, InterfaceC1022ai interfaceC1022ai, Object obj) {
        C2791sq0 c2791sq0 = null;
        if (!(interfaceC0473Hh instanceof InterfaceC1803ii)) {
            return null;
        }
        if (interfaceC1022ai.q(C2888tq0.l) != null) {
            InterfaceC1803ii interfaceC1803iiD = (InterfaceC1803ii) interfaceC0473Hh;
            while (!(interfaceC1803iiD instanceof C1618gn) && (interfaceC1803iiD = interfaceC1803iiD.d()) != null) {
                if (interfaceC1803iiD instanceof C2791sq0) {
                    c2791sq0 = (C2791sq0) interfaceC1803iiD;
                    break;
                }
            }
            if (c2791sq0 != null) {
                c2791sq0.m0(interfaceC1022ai, obj);
            }
        }
        return c2791sq0;
    }

    public static int L(int i) {
        String strH = com.skidush.clonex.bridge.N7.a.h(i);
        if (strH != null) {
            if (!(!AbstractC1899jh0.O(strH))) {
                strH = null;
            }
            if (strH != null) {
                Integer numJ = AbstractC1802ih0.J(strH);
                if (numJ != null) {
                    Integer num = numJ.intValue() > 0 ? numJ : null;
                    if (num != null) {
                        return num.intValue();
                    }
                }
                throw new IllegalStateException("Configuración protegida no válida");
            }
        }
        throw new IllegalStateException("Configuración protegida no disponible");
    }

    public static YS a() {
        return new YS(false);
    }

    public static int b(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        int visibility = view.getVisibility();
        if (visibility == 0) {
            return 2;
        }
        if (visibility == 4) {
            return 4;
        }
        if (visibility == 8) {
            return 3;
        }
        throw new IllegalArgumentException(AbstractC1674hK.n(visibility, "Unknown visibility "));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:29:0x004e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0052 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    public static boolean c(int i, Rect rect, Rect rect2, Rect rect3) {
        int iR;
        int i2;
        int i3;
        boolean zD = d(i, rect, rect2);
        if (d(i, rect, rect3) || !zD) {
            return false;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    if (rect.bottom <= rect3.top) {
                        if (i != 17 && i != 66) {
                            iR = r(i, rect, rect2);
                            if (i != 17) {
                                i2 = rect.left;
                                i3 = rect3.left;
                            } else if (i != 33) {
                                i2 = rect.top;
                                i3 = rect3.top;
                            } else if (i != 66) {
                                i2 = rect3.right;
                                i3 = rect.right;
                            } else {
                                if (i == 130) {
                                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                }
                                i2 = rect3.bottom;
                                i3 = rect.bottom;
                            }
                            if (iR < Math.max(1, i2 - i3)) {
                                return true;
                            }
                            return false;
                        }
                    }
                } else if (rect.right <= rect3.left) {
                    if (i != 17) {
                        iR = r(i, rect, rect2);
                        if (i != 17) {
                            i2 = rect.left;
                            i3 = rect3.left;
                        } else if (i != 33) {
                            i2 = rect.top;
                            i3 = rect3.top;
                        } else if (i != 66) {
                            i2 = rect3.right;
                            i3 = rect.right;
                        } else {
                            if (i == 130) {
                                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            }
                            i2 = rect3.bottom;
                            i3 = rect.bottom;
                        }
                        if (iR < Math.max(1, i2 - i3)) {
                            return true;
                        }
                        return false;
                    }
                }
            } else if (rect.top >= rect3.bottom) {
                if (i != 17) {
                    iR = r(i, rect, rect2);
                    if (i != 17) {
                        i2 = rect.left;
                        i3 = rect3.left;
                    } else if (i != 33) {
                        i2 = rect.top;
                        i3 = rect3.top;
                    } else if (i != 66) {
                        i2 = rect3.right;
                        i3 = rect.right;
                    } else {
                        if (i == 130) {
                            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        }
                        i2 = rect3.bottom;
                        i3 = rect.bottom;
                    }
                    if (iR < Math.max(1, i2 - i3)) {
                        return true;
                    }
                    return false;
                }
            }
        } else if (rect.left >= rect3.right) {
            if (i != 17) {
                iR = r(i, rect, rect2);
                if (i != 17) {
                    i2 = rect.left;
                    i3 = rect3.left;
                } else if (i != 33) {
                    i2 = rect.top;
                    i3 = rect3.top;
                } else if (i != 66) {
                    i2 = rect3.right;
                    i3 = rect.right;
                } else {
                    if (i == 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    i2 = rect3.bottom;
                    i3 = rect.bottom;
                }
                if (iR < Math.max(1, i2 - i3)) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    public static boolean d(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static void e(long j, E9 e9, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        int i6;
        int i7 = i;
        if (i2 >= i3) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        for (int i8 = i2; i8 < i3; i8++) {
            if (((C2468pa) arrayList.get(i8)).d() < i7) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
        C2468pa c2468pa = (C2468pa) arrayList.get(i2);
        C2468pa c2468pa2 = (C2468pa) arrayList.get(i3 - 1);
        if (i7 == c2468pa.d()) {
            int iIntValue = ((Number) arrayList2.get(i2)).intValue();
            int i9 = i2 + 1;
            C2468pa c2468pa3 = (C2468pa) arrayList.get(i9);
            i4 = i9;
            i5 = iIntValue;
            c2468pa = c2468pa3;
        } else {
            i4 = i2;
            i5 = -1;
        }
        if (c2468pa.g(i7) == c2468pa2.g(i7)) {
            int iMin = Math.min(c2468pa.d(), c2468pa2.d());
            int i10 = 0;
            for (int i11 = i7; i11 < iMin && c2468pa.g(i11) == c2468pa2.g(i11); i11++) {
                i10++;
            }
            long j2 = 4;
            long j3 = (e9.m / j2) + j + ((long) 2) + ((long) i10) + 1;
            e9.i0(-i10);
            e9.i0(i5);
            int i12 = i10 + i7;
            while (i7 < i12) {
                e9.i0(c2468pa.g(i7) & 255);
                i7++;
            }
            if (i4 + 1 == i3) {
                if (i12 != ((C2468pa) arrayList.get(i4)).d()) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                e9.i0(((Number) arrayList2.get(i4)).intValue());
                return;
            } else {
                E9 e10 = new E9();
                e9.i0(((int) ((e10.m / j2) + j3)) * (-1));
                e(j3, e10, i12, arrayList, i4, i3, arrayList2);
                e9.e0(e10);
                return;
            }
        }
        int i13 = 1;
        for (int i14 = i4 + 1; i14 < i3; i14++) {
            if (((C2468pa) arrayList.get(i14 - 1)).g(i7) != ((C2468pa) arrayList.get(i14)).g(i7)) {
                i13++;
            }
        }
        long j4 = 4;
        long j5 = (e9.m / j4) + j + ((long) 2) + ((long) (i13 * 2));
        e9.i0(i13);
        e9.i0(i5);
        for (int i15 = i4; i15 < i3; i15++) {
            int iG = ((C2468pa) arrayList.get(i15)).g(i7);
            if (i15 == i4 || iG != ((C2468pa) arrayList.get(i15 - 1)).g(i7)) {
                e9.i0(iG & 255);
            }
        }
        E9 e11 = new E9();
        int i16 = i4;
        while (i16 < i3) {
            byte bG = ((C2468pa) arrayList.get(i16)).g(i7);
            int i17 = i16 + 1;
            int i18 = i17;
            while (true) {
                if (i18 >= i3) {
                    i6 = i3;
                    break;
                } else {
                    if (bG != ((C2468pa) arrayList.get(i18)).g(i7)) {
                        i6 = i18;
                        break;
                    }
                    i18++;
                }
            }
            if (i17 == i6 && i7 + 1 == ((C2468pa) arrayList.get(i16)).d()) {
                e9.i0(((Number) arrayList2.get(i16)).intValue());
            } else {
                e9.i0(((int) ((e11.m / j4) + j5)) * (-1));
                e(j5, e11, i7 + 1, arrayList, i16, i6, arrayList2);
            }
            e11 = e11;
            i16 = i6;
        }
        e9.e0(e11);
    }

    public static void f(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, H40.G, i, i2);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                h(context, d, "Theme.MaterialComponents");
            }
        }
        h(context, c, "Theme.AppCompat");
    }

    public static void g(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, H40.G, i, i2);
        boolean z = false;
        if (!typedArrayObtainStyledAttributes.getBoolean(2, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
            int length = iArr2.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    typedArrayObtainStyledAttributes2.recycle();
                    z = true;
                    break;
                } else {
                    if (typedArrayObtainStyledAttributes2.getResourceId(iArr2[i3], -1) == -1) {
                        typedArrayObtainStyledAttributes2.recycle();
                        break;
                    }
                    i3++;
                }
            }
        } else if (typedArrayObtainStyledAttributes.getResourceId(0, -1) != -1) {
            z = true;
            break;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    public static void h(Context context, int[] iArr, String str) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i)) {
                typedArrayObtainStyledAttributes.recycle();
                throw new IllegalArgumentException(AbstractC1701hf0.u("The style on this component requires your app theme to be ", str, " (or a descendant)."));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static final InterfaceC1022ai l(InterfaceC1022ai interfaceC1022ai, InterfaceC1022ai interfaceC1022ai2, boolean z) {
        Boolean bool = Boolean.FALSE;
        C2478pf c2478pf = C2478pf.q;
        boolean zBooleanValue = ((Boolean) interfaceC1022ai.l(bool, c2478pf)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) interfaceC1022ai2.l(bool, c2478pf)).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return interfaceC1022ai.Q(interfaceC1022ai2);
        }
        C1038aq c1038aq = C1038aq.l;
        InterfaceC1022ai interfaceC1022ai3 = (InterfaceC1022ai) interfaceC1022ai.l(c1038aq, new C2478pf(2, 8));
        Object objL = interfaceC1022ai2;
        if (zBooleanValue2) {
            objL = interfaceC1022ai2.l(c1038aq, C2478pf.p);
        }
        return interfaceC1022ai3.Q((InterfaceC1022ai) objL);
    }

    public static String m(Context context, int i) {
        String strValueOf;
        AbstractC1474fG.j(context, "context");
        if (i <= 16777215) {
            return String.valueOf(i);
        }
        try {
            strValueOf = context.getResources().getResourceName(i);
        } catch (Resources.NotFoundException unused) {
            strValueOf = String.valueOf(i);
        }
        AbstractC1474fG.i(strValueOf, "try {\n                  …tring()\n                }");
        return strValueOf;
    }

    public static float n(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC2595qp.b(edgeEffect);
        }
        return 0.0f;
    }

    public static boolean q(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            return (i2 > i3 || rect.left >= i3) && rect.left > rect2.left;
        }
        if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            return (i4 > i5 || rect.top >= i5) && rect.top > rect2.top;
        }
        if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            return (i6 < i7 || rect.right <= i7) && rect.right < rect2.right;
        }
        if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
    }

    public static int r(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i2 = rect2.top;
            i3 = rect.bottom;
        }
        return Math.max(0, i2 - i3);
    }

    public static int s(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static final InterfaceC1022ai t(InterfaceC1608gi interfaceC1608gi, InterfaceC1022ai interfaceC1022ai) {
        InterfaceC1022ai interfaceC1022aiL = l(interfaceC1608gi.t(), interfaceC1022ai, true);
        C3362yl c3362yl = AbstractC1910jn.a;
        return (interfaceC1022aiL == c3362yl || interfaceC1022aiL.q(C2691rp.p) != null) ? interfaceC1022aiL : interfaceC1022aiL.Q(c3362yl);
    }

    public static TypedArray u(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        f(context, attributeSet, i, i2);
        g(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    public static RN v(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        f(context, attributeSet, i, i2);
        g(context, attributeSet, iArr, i, i2, iArr2);
        return new RN(context, 9, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public static void w(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static float x(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC2595qp.c(edgeEffect, f, f2);
        }
        AbstractC2498pp.a(edgeEffect, f, f2);
        return f;
    }

    public abstract void A(View view, int i, int i2);

    public abstract void B(View view, float f, float f2);

    public abstract boolean J(View view, int i);

    public abstract int i(View view, int i);

    public abstract int j(View view, int i);

    public abstract List k(String str, List list);

    public int o(View view) {
        return 0;
    }

    public int p() {
        return 0;
    }

    public abstract void z(int i);

    public void y(View view, int i) {
    }
}
