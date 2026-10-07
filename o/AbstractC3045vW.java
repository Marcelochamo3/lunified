package o;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.Property;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* JADX INFO: renamed from: o.vW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3045vW implements InterfaceC3058ve0 {
    public static final byte[] a = {0, 0, 0, 1};
    public static final String[] b = {"", "A", "B", "C"};
    public static final Object c = new Object();
    public static final J2 d = new J2(10, "NO_VALUE", false);
    public static Field e;
    public static boolean f;
    public static Method g;
    public static boolean h;
    public static Method i;
    public static boolean j;

    public static void A(Resources.Theme theme) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            AbstractC1367e80.a(theme);
            return;
        }
        if (i2 >= 23) {
            synchronized (AbstractC1468fA.P) {
                if (!AbstractC1468fA.R) {
                    try {
                        Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                        AbstractC1468fA.Q = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (NoSuchMethodException unused) {
                    }
                    AbstractC1468fA.R = true;
                }
                Method method = AbstractC1468fA.Q;
                if (method != null) {
                    try {
                        method.invoke(theme, null);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                        AbstractC1468fA.Q = null;
                    }
                }
            }
        }
    }

    public static String B(StringBuilder sb, int i2, int i3) {
        int i4;
        int iLastIndexOf;
        if (i2 >= i3) {
            return sb.toString();
        }
        if (sb.charAt(i2) == '/') {
            i2++;
        }
        int i5 = i2;
        int i6 = i5;
        while (i5 <= i3) {
            if (i5 == i3) {
                i4 = i5;
            } else if (sb.charAt(i5) == '/') {
                i4 = i5 + 1;
            } else {
                i5++;
            }
            int i7 = i6 + 1;
            if (i5 == i7 && sb.charAt(i6) == '.') {
                sb.delete(i6, i4);
                i3 -= i4 - i6;
            } else {
                if (i5 == i6 + 2 && sb.charAt(i6) == '.' && sb.charAt(i7) == '.') {
                    iLastIndexOf = sb.lastIndexOf("/", i6 - 2) + 1;
                    int i8 = iLastIndexOf > i2 ? iLastIndexOf : i2;
                    sb.delete(i8, i4);
                    i3 -= i4 - i8;
                } else {
                    iLastIndexOf = i5 + 1;
                }
                i6 = iLastIndexOf;
            }
            i5 = i6;
        }
        return sb.toString();
    }

    public static String C(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] iArrT = t(str2);
        if (iArrT[0] != -1) {
            sb.append(str2);
            B(sb, iArrT[1], iArrT[2]);
            return sb.toString();
        }
        int[] iArrT2 = t(str);
        if (iArrT[3] == 0) {
            sb.append((CharSequence) str, 0, iArrT2[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (iArrT[2] == 0) {
            sb.append((CharSequence) str, 0, iArrT2[2]);
            sb.append(str2);
            return sb.toString();
        }
        int i2 = iArrT[1];
        if (i2 != 0) {
            int i3 = iArrT2[0] + 1;
            sb.append((CharSequence) str, 0, i3);
            sb.append(str2);
            return B(sb, iArrT[1] + i3, i3 + iArrT[2]);
        }
        if (str2.charAt(i2) == '/') {
            sb.append((CharSequence) str, 0, iArrT2[1]);
            sb.append(str2);
            int i4 = iArrT2[1];
            return B(sb, i4, iArrT[2] + i4);
        }
        int i5 = iArrT2[0] + 2;
        int i6 = iArrT2[1];
        if (i5 >= i6 || i6 != iArrT2[2]) {
            int iLastIndexOf = str.lastIndexOf(47, iArrT2[2] - 1);
            int i7 = iLastIndexOf == -1 ? iArrT2[1] : iLastIndexOf + 1;
            sb.append((CharSequence) str, 0, i7);
            sb.append(str2);
            return B(sb, iArrT2[1], i7 + iArrT[2]);
        }
        sb.append((CharSequence) str, 0, i6);
        sb.append('/');
        sb.append(str2);
        int i8 = iArrT2[1];
        return B(sb, i8, iArrT[2] + i8 + 1);
    }

    public static int D(Context context, int i2, int i3) {
        TypedValue typedValueY = zy0.y(context, i2);
        return (typedValueY == null || typedValueY.type != 16) ? i3 : typedValueY.data;
    }

    public static TimeInterpolator E(Context context, int i2, Interpolator interpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!v(strValueOf, "cubic-bezier") && !v(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (!v(strValueOf, "cubic-bezier")) {
            if (v(strValueOf, "path")) {
                return BX.c(zy0.q(strValueOf.substring(5, strValueOf.length() - 1)));
            }
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(strValueOf));
        }
        String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
        if (strArrSplit.length == 4) {
            return BX.b(q(0, strArrSplit), q(1, strArrSplit), q(2, strArrSplit), q(3, strArrSplit));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
    }

    public static Uri F(String str, String str2) {
        return Uri.parse(C(str, str2));
    }

    public static C2446pE G(String str) {
        C2446pE c2446pEB;
        if (str == null) {
            return null;
        }
        try {
            C2349oE c2349oE = new C2349oE();
            c2349oE.g(null, str);
            c2446pEB = c2349oE.b();
        } catch (IllegalArgumentException unused) {
            c2446pEB = null;
        }
        if (c2446pEB != null && c2446pEB.j && c2446pEB.b.length() == 0 && c2446pEB.c.length() == 0) {
            return c2446pEB;
        }
        return null;
    }

    public static void H(TextView textView, int i2) {
        Jp0.g(i2);
        if (Build.VERSION.SDK_INT >= 28) {
            Wi0.d(textView, i2);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), i2 + i3, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void I(TextView textView, int i2) {
        Jp0.g(i2);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i2 - i3);
        }
    }

    public static boolean J(Drawable drawable, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AbstractC2302no.b(drawable, i2);
        }
        if (!h) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                g = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            h = true;
        }
        Method method = g;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i2));
                return true;
            } catch (Exception unused2) {
                g = null;
            }
        }
        return false;
    }

    public static void K(TextView textView, int i2) {
        Jp0.g(i2);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i2 != fontMetricsInt) {
            textView.setLineSpacing(i2 - fontMetricsInt, 1.0f);
        }
    }

    public static void L(TextView textView, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i2);
        } else {
            textView.setTextAppearance(textView.getContext(), i2);
        }
    }

    public static void M(Drawable drawable, int i2) {
        AbstractC2205mo.g(drawable, i2);
    }

    public static void N(Drawable drawable, ColorStateList colorStateList) {
        AbstractC2205mo.h(drawable, colorStateList);
    }

    public static void O(Drawable drawable, PorterDuff.Mode mode) {
        AbstractC2205mo.i(drawable, mode);
    }

    public static void P(K3 k3, C1478fK c1478fK) {
        TJ tj = c1478fK.d;
        if (tj == TJ.m || tj.compareTo(TJ.f532o) >= 0) {
            k3.g();
        } else {
            c1478fK.a(new C1712hl(k3, c1478fK));
        }
    }

    public static ActionMode.Callback Q(ActionMode.Callback callback) {
        return (!(callback instanceof Yi0) || Build.VERSION.SDK_INT < 26) ? callback : ((Yi0) callback).a;
    }

    public static Drawable R(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23 || (drawable instanceof Pj0)) {
            return drawable;
        }
        Uw0 uw0 = new Uw0();
        uw0.f562o = uw0.a();
        uw0.c(drawable);
        if (Uw0.s == null) {
            try {
                Uw0.s = Drawable.class.getDeclaredMethod("isProjected", null);
            } catch (Exception unused) {
            }
        }
        return uw0;
    }

    public static ActionMode.Callback S(ActionMode.Callback callback, TextView textView) {
        int i2 = Build.VERSION.SDK_INT;
        return (i2 < 26 || i2 > 27 || (callback instanceof Yi0) || callback == null) ? callback : new Yi0(callback, textView);
    }

    public static final void d(Object[] objArr, long j2, Object obj) {
        objArr[(objArr.length - 1) & ((int) j2)] = obj;
    }

    public static final void e(Ut0 ut0, K3 k3, C1478fK c1478fK) {
        AbstractC1474fG.j(k3, "registry");
        AbstractC1474fG.j(c1478fK, "lifecycle");
        F90 f90 = (F90) ut0.c("androidx.lifecycle.savedstate.vm.tag");
        if (f90 == null || f90.n) {
            return;
        }
        f90.f(k3, c1478fK);
        P(k3, c1478fK);
    }

    public static String f(int i2, boolean z, int i3, int i4, int[] iArr, int i5) {
        Object[] objArr = {b[i2], Integer.valueOf(i3), Integer.valueOf(i4), Character.valueOf(z ? 'H' : 'L'), Integer.valueOf(i5)};
        int i6 = Lr0.a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i7 = 0; i7 < length; i7++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i7])));
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b2 A[LOOP:0: B:53:0x00b0->B:54:0x00b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    public static boolean g(C2562qX c2562qX, C3091vv c3091vv, int i2, C2800sv c2800sv) {
        int iU;
        byte[] bArr;
        int i3;
        int i4;
        long jV = c2562qX.v();
        long j2 = jV >>> 16;
        if (j2 != i2) {
            return false;
        }
        boolean z = (j2 & 1) == 1;
        int i5 = (int) ((jV >> 12) & 15);
        int i6 = (int) ((jV >> 8) & 15);
        int i7 = (int) ((jV >> 4) & 15);
        int i8 = (int) ((jV >> 1) & 7);
        boolean z2 = (jV & 1) == 1;
        if (i7 > 7 ? !(i7 > 10 || c3091vv.g != 2) : i7 == c3091vv.g - 1) {
            if ((i8 == 0 || i8 == c3091vv.i) && !z2) {
                try {
                    long jA = c2562qX.A();
                    if (!z) {
                        jA *= (long) c3091vv.b;
                    }
                    c2800sv.a = jA;
                    int iZ = z(i5, c2562qX);
                    if (iZ != -1 && iZ <= c3091vv.b) {
                        if (i6 == 0) {
                            iU = c2562qX.u();
                            int i9 = c2562qX.b;
                            bArr = c2562qX.a;
                            i3 = i9 - 1;
                            int i10 = Lr0.a;
                            i4 = 0;
                            for (int i11 = c2562qX.b; i11 < i3; i11++) {
                                i4 = Lr0.m[i4 ^ (bArr[i11] & 255)];
                            }
                            if (iU == i4) {
                                return true;
                            }
                        } else if (i6 > 11) {
                            int i12 = c3091vv.e;
                            if (i6 == 12) {
                                if (c2562qX.u() * 1000 == i12) {
                                    iU = c2562qX.u();
                                    int i13 = c2562qX.b;
                                    bArr = c2562qX.a;
                                    i3 = i13 - 1;
                                    int i14 = Lr0.a;
                                    i4 = 0;
                                    while (i11 < i3) {
                                        i4 = Lr0.m[i4 ^ (bArr[i11] & 255)];
                                    }
                                    if (iU == i4) {
                                        return true;
                                    }
                                }
                            } else if (i6 <= 14) {
                                int iZ2 = c2562qX.z();
                                if (i6 == 14) {
                                    iZ2 *= 10;
                                }
                                if (iZ2 == i12) {
                                    iU = c2562qX.u();
                                    int i15 = c2562qX.b;
                                    bArr = c2562qX.a;
                                    i3 = i15 - 1;
                                    int i16 = Lr0.a;
                                    i4 = 0;
                                    while (i11 < i3) {
                                        i4 = Lr0.m[i4 ^ (bArr[i11] & 255)];
                                    }
                                    if (iU == i4) {
                                        return true;
                                    }
                                }
                            }
                        } else if (i6 == c3091vv.f) {
                            iU = c2562qX.u();
                            int i17 = c2562qX.b;
                            bArr = c2562qX.a;
                            i3 = i17 - 1;
                            int i18 = Lr0.a;
                            i4 = 0;
                            while (i11 < i3) {
                                i4 = Lr0.m[i4 ^ (bArr[i11] & 255)];
                            }
                            if (iU == i4) {
                                return true;
                            }
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return false;
    }

    public static void h(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void i(int i2, Object[] objArr) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (objArr[i3] == null) {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i3);
                throw new NullPointerException(sb.toString());
            }
        }
    }

    public static void j(Object obj) {
        k(obj, "Argument must not be null");
    }

    public static void k(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void l(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        if (Build.VERSION.SDK_INT >= 23) {
            drawable.clearColorFilter();
            return;
        }
        drawable.clearColorFilter();
        if (drawable instanceof InsetDrawable) {
            l(((InsetDrawable) drawable).getDrawable());
            return;
        }
        if (drawable instanceof Tw0) {
            l(((Uw0) ((Tw0) drawable)).q);
            return;
        }
        if (!(drawable instanceof DrawableContainer) || (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) == null) {
            return;
        }
        int childCount = drawableContainerState.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            Drawable child = drawableContainerState.getChild(i2);
            if (child != null) {
                l(child);
            }
        }
    }

    public static final F90 m(K3 k3, C1478fK c1478fK, String str, Bundle bundle) {
        Bundle bundleC = k3.c(str);
        Class[] clsArr = E90.f;
        F90 f90 = new F90(str, Ou0.f(bundleC, bundle));
        f90.f(k3, c1478fK);
        P(k3, c1478fK);
        return f90;
    }

    public static Drawable o(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AbstractC1702hg.a(compoundButton);
        }
        if (!f) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f = true;
        }
        Field field = e;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException unused2) {
                e = null;
            }
        }
        return null;
    }

    public static int p(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AbstractC2302no.a(drawable);
        }
        if (!j) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", null);
                i = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            j = true;
        }
        Method method = i;
        if (method == null) {
            return 0;
        }
        try {
            return ((Integer) method.invoke(drawable, null)).intValue();
        } catch (Exception unused2) {
            i = null;
            return 0;
        }
    }

    public static float q(int i2, String[] strArr) {
        float f2 = Float.parseFloat(strArr[i2]);
        if (f2 >= 0.0f && f2 <= 1.0f) {
            return f2;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f2);
    }

    public static G20 s(TextView textView) {
        int iA;
        int iD;
        TextDirectionHeuristic textDirectionHeuristic;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            return new G20(Wi0.c(textView));
        }
        TextPaint textPaint = new TextPaint(textView.getPaint());
        if (Build.VERSION.SDK_INT >= 23) {
            iA = 1;
            iD = 1;
        } else {
            iA = 0;
            iD = 0;
        }
        TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        if (i2 >= 23) {
            iA = Ui0.a(textView);
            iD = Ui0.d(textView);
        }
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i2 < 28 || (textView.getInputType() & 15) != 3) {
            boolean z = textView.getLayoutDirection() == 1;
            switch (textView.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    textDirectionHeuristic = !z ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(Wi0.b(Vi0.a(textView.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new G20(textPaint, textDirectionHeuristic, iA, iD);
    }

    public static int[] t(String str) {
        int iIndexOf;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int iIndexOf2 = str.indexOf(35);
        if (iIndexOf2 != -1) {
            length = iIndexOf2;
        }
        int iIndexOf3 = str.indexOf(63);
        if (iIndexOf3 == -1 || iIndexOf3 > length) {
            iIndexOf3 = length;
        }
        int iIndexOf4 = str.indexOf(47);
        if (iIndexOf4 == -1 || iIndexOf4 > iIndexOf3) {
            iIndexOf4 = iIndexOf3;
        }
        int iIndexOf5 = str.indexOf(58);
        if (iIndexOf5 > iIndexOf4) {
            iIndexOf5 = -1;
        }
        int i2 = iIndexOf5 + 2;
        if (i2 < iIndexOf3 && str.charAt(iIndexOf5 + 1) == '/' && str.charAt(i2) == '/') {
            iIndexOf = str.indexOf(47, iIndexOf5 + 3);
            if (iIndexOf == -1 || iIndexOf > iIndexOf3) {
                iIndexOf = iIndexOf3;
            }
        } else {
            iIndexOf = iIndexOf5 + 1;
        }
        iArr[0] = iIndexOf5;
        iArr[1] = iIndexOf;
        iArr[2] = iIndexOf3;
        iArr[3] = length;
        return iArr;
    }

    public static boolean u(String str, String str2) {
        C2446pE c2446pEG;
        AbstractC1474fG.j(str, "initialUrl");
        C2446pE c2446pEG2 = G(str);
        return c2446pEG2 != null && (c2446pEG = G(str2)) != null && AbstractC1899jh0.N(c2446pEG2.a, c2446pEG.a, true) && AbstractC1899jh0.N(c2446pEG2.d, c2446pEG.d, true) && c2446pEG2.e == c2446pEG.e;
    }

    public static boolean v(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    /* JADX WARN: Code duplicated, block: B:102:0x012d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x0140 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x0180 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x0193 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x01c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x01d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x01ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x01a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x01b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x014d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x01e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x01d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x019e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x018b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x0065 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x006b A[EDGE_INSN: B:133:0x006b->B:22:0x006b BREAK  A[LOOP:2: B:16:0x004d->B:20:0x005e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0048  */
    /* JADX WARN: Code duplicated, block: B:17:0x004f  */
    /* JADX WARN: Code duplicated, block: B:20:0x005e A[LOOP:2: B:16:0x004d->B:20:0x005e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0092  */
    /* JADX WARN: Code duplicated, block: B:64:0x0157  */
    /* JADX WARN: Code duplicated, block: B:67:0x0165  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:82:0x01bc  */
    public static C0414Fa w(C2152mB c2152mB) {
        int i2;
        int i3;
        int length;
        int length2;
        String string;
        boolean z;
        String string2;
        int i4;
        C2152mB c2152mB2 = c2152mB;
        AbstractC1474fG.j(c2152mB2, "headers");
        int size = c2152mB.size();
        boolean z2 = true;
        int i5 = 0;
        boolean z3 = true;
        String str = null;
        boolean z4 = false;
        boolean z5 = false;
        int iY = -1;
        int iY2 = -1;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        int iY3 = -1;
        int iY4 = -1;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        while (i5 < size) {
            String strD = c2152mB2.d(i5);
            String strH = c2152mB2.h(i5);
            if (AbstractC1899jh0.N(strD, "Cache-Control", z2)) {
                if (str == null) {
                    str = strH;
                }
                i3 = 0;
                while (i3 < strH.length()) {
                    length = strH.length();
                    length2 = i3;
                    while (true) {
                        if (length2 < length) {
                            size = size;
                            length2 = strH.length();
                            break;
                        }
                        size = size;
                        if (AbstractC1119bh0.X("=,;", strH.charAt(length2))) {
                            break;
                        }
                        length2++;
                        size = size;
                    }
                    String strSubstring = strH.substring(i3, length2);
                    AbstractC1474fG.i(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    string = AbstractC1119bh0.E0(strSubstring).toString();
                    if (length2 != strH.length() || strH.charAt(length2) == ',' || strH.charAt(length2) == ';') {
                        z3 = z3;
                        z = true;
                        i3 = length2 + 1;
                        string2 = null;
                    } else {
                        int length3 = length2 + 1;
                        byte[] bArr = Mr0.a;
                        int length4 = strH.length();
                        while (true) {
                            if (length3 >= length4) {
                                i4 = 1;
                                length3 = strH.length();
                                break;
                            }
                            char cCharAt = strH.charAt(length3);
                            int i6 = length4;
                            if (cCharAt != ' ' && cCharAt != '\t') {
                                i4 = 1;
                                break;
                            }
                            length3++;
                            length4 = i6;
                        }
                        if (length3 < strH.length()) {
                            z3 = z3;
                            if (strH.charAt(length3) == '\"') {
                                int i7 = length3 + i4;
                                int iD0 = AbstractC1119bh0.d0(strH, '\"', i7, false, 4);
                                String strSubstring2 = strH.substring(i7, iD0);
                                AbstractC1474fG.i(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                string2 = strSubstring2;
                                i3 = iD0 + 1;
                                z = true;
                            }
                        } else {
                            z3 = z3;
                        }
                        int length5 = strH.length();
                        int length6 = length3;
                        while (true) {
                            if (length6 >= length5) {
                                z = true;
                                length6 = strH.length();
                                break;
                            }
                            int i8 = length5;
                            if (AbstractC1119bh0.X(",;", strH.charAt(length6))) {
                                z = true;
                                break;
                            }
                            length6++;
                            length5 = i8;
                        }
                        String strSubstring3 = strH.substring(length3, length6);
                        AbstractC1474fG.i(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                        string2 = AbstractC1119bh0.E0(strSubstring3).toString();
                        i3 = length6;
                    }
                    if (AbstractC1899jh0.N("no-cache", string, z)) {
                        z4 = true;
                    } else if (AbstractC1899jh0.N("no-store", string, z)) {
                        z5 = true;
                    } else if (AbstractC1899jh0.N("max-age", string, z)) {
                        iY = Mr0.y(-1, string2);
                    } else if (AbstractC1899jh0.N("s-maxage", string, z)) {
                        iY2 = Mr0.y(-1, string2);
                    } else if (AbstractC1899jh0.N("private", string, z)) {
                        z6 = true;
                    } else if (AbstractC1899jh0.N("public", string, z)) {
                        z7 = true;
                    } else if (AbstractC1899jh0.N("must-revalidate", string, z)) {
                        z8 = true;
                    } else if (AbstractC1899jh0.N("max-stale", string, z)) {
                        iY3 = Mr0.y(Integer.MAX_VALUE, string2);
                    } else if (AbstractC1899jh0.N("min-fresh", string, z)) {
                        iY4 = Mr0.y(-1, string2);
                    } else if (AbstractC1899jh0.N("only-if-cached", string, z)) {
                        z9 = true;
                    } else if (AbstractC1899jh0.N("no-transform", string, z)) {
                        z10 = true;
                    } else if (AbstractC1899jh0.N("immutable", string, z)) {
                        z11 = true;
                    }
                }
                i2 = size;
                i5++;
                c2152mB2 = c2152mB;
                size = i2;
                z2 = true;
            } else {
                if (!AbstractC1899jh0.N(strD, "Pragma", z2)) {
                    i2 = size;
                }
                i5++;
                c2152mB2 = c2152mB;
                size = i2;
                z2 = true;
            }
            z3 = false;
            i3 = 0;
            while (i3 < strH.length()) {
                length = strH.length();
                length2 = i3;
                while (true) {
                    if (length2 < length) {
                        size = size;
                        length2 = strH.length();
                        break;
                    }
                    size = size;
                    if (AbstractC1119bh0.X("=,;", strH.charAt(length2))) {
                        break;
                        break;
                    }
                    length2++;
                    size = size;
                }
                String strSubstring4 = strH.substring(i3, length2);
                AbstractC1474fG.i(strSubstring4, "this as java.lang.String…ing(startIndex, endIndex)");
                string = AbstractC1119bh0.E0(strSubstring4).toString();
                if (length2 != strH.length()) {
                    z3 = z3;
                    z = true;
                    i3 = length2 + 1;
                    string2 = null;
                } else {
                    z3 = z3;
                    z = true;
                    i3 = length2 + 1;
                    string2 = null;
                }
                if (AbstractC1899jh0.N("no-cache", string, z)) {
                    z4 = true;
                } else if (AbstractC1899jh0.N("no-store", string, z)) {
                    z5 = true;
                } else if (AbstractC1899jh0.N("max-age", string, z)) {
                    iY = Mr0.y(-1, string2);
                } else if (AbstractC1899jh0.N("s-maxage", string, z)) {
                    iY2 = Mr0.y(-1, string2);
                } else if (AbstractC1899jh0.N("private", string, z)) {
                    z6 = true;
                } else if (AbstractC1899jh0.N("public", string, z)) {
                    z7 = true;
                } else if (AbstractC1899jh0.N("must-revalidate", string, z)) {
                    z8 = true;
                } else if (AbstractC1899jh0.N("max-stale", string, z)) {
                    iY3 = Mr0.y(Integer.MAX_VALUE, string2);
                } else if (AbstractC1899jh0.N("min-fresh", string, z)) {
                    iY4 = Mr0.y(-1, string2);
                } else if (AbstractC1899jh0.N("only-if-cached", string, z)) {
                    z9 = true;
                } else if (AbstractC1899jh0.N("no-transform", string, z)) {
                    z10 = true;
                } else if (AbstractC1899jh0.N("immutable", string, z)) {
                    z11 = true;
                }
            }
            i2 = size;
            i5++;
            c2152mB2 = c2152mB;
            size = i2;
            z2 = true;
        }
        return new C0414Fa(z4, z5, iY, iY2, z6, z7, z8, iY3, iY4, z9, z10, z11, !z3 ? null : str);
    }

    public static final boolean y(String str) {
        AbstractC1474fG.j(str, "method");
        return (AbstractC1474fG.b(str, "GET") || AbstractC1474fG.b(str, "HEAD")) ? false : true;
    }

    public static int z(int i2, C2562qX c2562qX) {
        switch (i2) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i2 - 2);
            case 6:
                return c2562qX.u() + 1;
            case 7:
                return c2562qX.z() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i2 - 8);
            default:
                return -1;
        }
    }

    @Override // o.InterfaceC3058ve0
    public float b(View view) {
        return view.getTranslationX();
    }

    @Override // o.InterfaceC3058ve0
    public Property c() {
        return View.TRANSLATION_X;
    }

    public abstract Intent n(AbstractActivityC1116bg abstractActivityC1116bg, Object obj);

    public L0 r(AbstractActivityC1116bg abstractActivityC1116bg, Object obj) {
        AbstractC1474fG.j(abstractActivityC1116bg, "context");
        return null;
    }

    public abstract Object x(Intent intent, int i2);
}
