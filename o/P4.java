package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class P4 {
    public final TextView a;
    public C2673rg b;
    public C2673rg c;
    public C2673rg d;
    public C2673rg e;
    public C2673rg f;
    public C2673rg g;
    public C2673rg h;
    public final Y4 i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    public P4(TextView textView) {
        this.a = textView;
        this.i = new Y4(textView);
    }

    public static C2673rg c(Context context, C1846j4 c1846j4, int i) {
        ColorStateList colorStateListI;
        synchronized (c1846j4) {
            colorStateListI = c1846j4.a.i(context, i);
        }
        if (colorStateListI == null) {
            return null;
        }
        C2673rg c2673rg = new C2673rg();
        c2673rg.b = true;
        c2673rg.c = colorStateListI;
        return c2673rg;
    }

    public static void h(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i >= 30) {
            AbstractC3079vp.a(editorInfo, text);
            return;
        }
        text.getClass();
        if (i >= 30) {
            AbstractC3079vp.a(editorInfo, text);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 : i2;
        if (i2 <= i3) {
            i2 = i3;
        }
        int length = text.length();
        if (i4 < 0 || i2 > length) {
            AbstractC3409z9.D(editorInfo, null, 0, 0);
            return;
        }
        int i5 = editorInfo.inputType & 4095;
        if (i5 == 129 || i5 == 225 || i5 == 18) {
            AbstractC3409z9.D(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            AbstractC3409z9.D(editorInfo, text, i4, i2);
            return;
        }
        int i6 = i2 - i4;
        int i7 = i6 > 1024 ? 0 : i6;
        int length2 = text.length() - i2;
        int i8 = C1672hI.a.g - i7;
        int iMin = Math.min(length2, i8 - Math.min(i4, (int) (((double) i8) * 0.8d)));
        int iMin2 = Math.min(i4, i8 - iMin);
        int i9 = i4 - iMin2;
        if (Character.isLowSurrogate(text.charAt(i9))) {
            i9++;
            iMin2--;
        }
        if (Character.isHighSurrogate(text.charAt((i2 + iMin) - 1))) {
            iMin--;
        }
        int i10 = iMin2 + i7;
        AbstractC3409z9.D(editorInfo, i7 != i6 ? TextUtils.concat(text.subSequence(i9, i9 + iMin2), text.subSequence(i2, iMin + i2)) : text.subSequence(i9, i10 + iMin + i9), iMin2, i10);
    }

    public final void a(Drawable drawable, C2673rg c2673rg) {
        if (drawable == null || c2673rg == null) {
            return;
        }
        C1846j4.e(drawable, c2673rg, this.a.getDrawableState());
    }

    public final void b() {
        C2673rg c2673rg = this.b;
        TextView textView = this.a;
        if (c2673rg != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f);
        a(compoundDrawablesRelative[2], this.g);
    }

    public final ColorStateList d() {
        C2673rg c2673rg = this.h;
        if (c2673rg != null) {
            return (ColorStateList) c2673rg.c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        C2673rg c2673rg = this.h;
        if (c2673rg != null) {
            return (PorterDuff.Mode) c2673rg.d;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:278:0x0475  */
    /* JADX WARN: Code duplicated, block: B:280:0x047a  */
    /* JADX WARN: Code duplicated, block: B:283:0x0483 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:284:0x0485  */
    /* JADX WARN: Code duplicated, block: B:285:0x048a  */
    /* JADX WARN: Code duplicated, block: B:287:0x0490  */
    /* JADX WARN: Code duplicated, block: B:288:0x0494  */
    /* JADX WARN: Code duplicated, block: B:291:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0107  */
    /* JADX WARN: Code duplicated, block: B:47:0x010e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0121  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void f(AttributeSet attributeSet, int i) {
        String string;
        boolean z;
        boolean z2;
        ColorStateList colorStateListS;
        ColorStateList colorStateListS2;
        ColorStateList colorStateListS3;
        String string2;
        int i2;
        int i3;
        float fApplyDimension;
        int i4;
        float dimensionPixelSize;
        int i5;
        ColorStateList colorStateList;
        int resourceId;
        int i6;
        int resourceId2;
        int i7;
        int i8;
        int i9;
        TextView textView = this.a;
        Context context = textView.getContext();
        C1846j4 c1846j4A = C1846j4.a();
        int[] iArr = T40.h;
        RN rnY = RN.y(context, attributeSet, iArr, i, 0);
        It0.o(textView, textView.getContext(), iArr, attributeSet, (TypedArray) rnY.n, i);
        TypedArray typedArray = (TypedArray) rnY.n;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.b = c(context, c1846j4A, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.c = c(context, c1846j4A, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.d = c(context, c1846j4A, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.e = c(context, c1846j4A, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f = c(context, c1846j4A, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.g = c(context, c1846j4A, typedArray.getResourceId(6, 0));
        }
        rnY.A();
        boolean z3 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = T40.w;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            RN rn = new RN(context, 9, typedArrayObtainStyledAttributes);
            if (z3 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z = false;
                z2 = false;
            } else {
                z = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z2 = true;
            }
            n(context, rn);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 < 23) {
                colorStateListS = typedArrayObtainStyledAttributes.hasValue(3) ? rn.s(3) : null;
                if (typedArrayObtainStyledAttributes.hasValue(4)) {
                    colorStateListS2 = rn.s(4);
                    i9 = 5;
                } else {
                    i9 = 5;
                    colorStateListS2 = null;
                }
                if (typedArrayObtainStyledAttributes.hasValue(i9)) {
                    colorStateListS3 = rn.s(i9);
                    i7 = 15;
                } else {
                    i7 = 15;
                }
                if (typedArrayObtainStyledAttributes.hasValue(i7)) {
                    string2 = typedArrayObtainStyledAttributes.getString(i7);
                    i8 = 26;
                } else {
                    i8 = 26;
                    string2 = null;
                }
                if (i10 >= i8 || !typedArrayObtainStyledAttributes.hasValue(13)) {
                    string = null;
                } else {
                    string = typedArrayObtainStyledAttributes.getString(13);
                }
                rn.A();
            } else {
                i7 = 15;
                colorStateListS = null;
                colorStateListS2 = null;
            }
            colorStateListS3 = null;
            if (typedArrayObtainStyledAttributes.hasValue(i7)) {
                string2 = typedArrayObtainStyledAttributes.getString(i7);
                i8 = 26;
            } else {
                i8 = 26;
                string2 = null;
            }
            if (i10 >= i8) {
                string = null;
            } else {
                string = null;
            }
            rn.A();
        } else {
            string = null;
            z = false;
            z2 = false;
            colorStateListS = null;
            colorStateListS2 = null;
            colorStateListS3 = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        RN rn2 = new RN(context, 9, typedArrayObtainStyledAttributes2);
        if (!z3 && typedArrayObtainStyledAttributes2.hasValue(14)) {
            z = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z2 = true;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 23) {
            if (typedArrayObtainStyledAttributes2.hasValue(3)) {
                colorStateListS = rn2.s(3);
            }
            if (typedArrayObtainStyledAttributes2.hasValue(4)) {
                colorStateListS2 = rn2.s(4);
            }
            if (typedArrayObtainStyledAttributes2.hasValue(5)) {
                colorStateListS3 = rn2.s(5);
            }
        }
        ColorStateList colorStateList2 = colorStateListS;
        ColorStateList colorStateList3 = colorStateListS2;
        ColorStateList colorStateList4 = colorStateListS3;
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes2.getString(15);
        }
        String string3 = string;
        String str = string2;
        if (i11 >= 26 && typedArrayObtainStyledAttributes2.hasValue(13)) {
            string3 = typedArrayObtainStyledAttributes2.getString(13);
        }
        String str2 = string3;
        if (i11 >= 28 && typedArrayObtainStyledAttributes2.hasValue(0) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, rn2);
        rn2.A();
        if (colorStateList2 != null) {
            textView.setTextColor(colorStateList2);
        }
        if (colorStateList3 != null) {
            textView.setHintTextColor(colorStateList3);
        }
        if (colorStateList4 != null) {
            textView.setLinkTextColor(colorStateList4);
        }
        if (!z3 && z2) {
            textView.setAllCaps(z);
        }
        Typeface typeface = this.l;
        if (typeface != null) {
            if (this.k == -1) {
                textView.setTypeface(typeface, this.j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str2 != null) {
            N4.d(textView, str2);
        }
        if (str == null) {
            i2 = 0;
        } else if (i11 >= 24) {
            M4.b(textView, M4.a(str));
            i2 = 0;
        } else {
            i2 = 0;
            textView.setTextLocale(L4.a(str.split(",")[0]));
        }
        int[] iArr3 = T40.i;
        Y4 y4 = this.i;
        Context context2 = y4.j;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i, i2);
        TextView textView2 = y4.i;
        It0.o(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes3, i);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            y4.a = typedArrayObtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(2)) {
            fApplyDimension = typedArrayObtainStyledAttributes3.getDimension(2, -1.0f);
            i3 = 1;
        } else {
            i3 = 1;
            fApplyDimension = -1.0f;
        }
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(i3) ? typedArrayObtainStyledAttributes3.getDimension(i3, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(3) && (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i12 = 0; i12 < length; i12++) {
                    iArr4[i12] = typedArrayObtainTypedArray.getDimensionPixelSize(i12, -1);
                }
                y4.f = Y4.b(iArr4);
                y4.i();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!y4.j()) {
            y4.a = 0;
        } else if (y4.a == 1) {
            if (!y4.g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (fApplyDimension == -1.0f) {
                    i6 = 2;
                    fApplyDimension = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i6 = 2;
                }
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(i6, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                y4.k(fApplyDimension, dimension2, dimension);
            }
            y4.h();
        }
        if (AbstractC3478zu0.c && y4.a != 0) {
            int[] iArr5 = y4.f;
            if (iArr5.length > 0) {
                if (N4.a(textView) != -1.0f) {
                    N4.b(textView, Math.round(y4.d), Math.round(y4.e), Math.round(y4.c), 0);
                } else {
                    N4.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableB = resourceId4 != -1 ? c1846j4A.b(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableB2 = resourceId5 != -1 ? c1846j4A.b(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableB3 = resourceId6 != -1 ? c1846j4A.b(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableB4 = resourceId7 != -1 ? c1846j4A.b(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableB5 = resourceId8 != -1 ? c1846j4A.b(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableB6 = resourceId9 != -1 ? c1846j4A.b(context, resourceId9) : null;
        if (drawableB5 != null || drawableB6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableB5 == null) {
                drawableB5 = compoundDrawablesRelative[0];
            }
            if (drawableB2 == null) {
                drawableB2 = compoundDrawablesRelative[1];
            }
            if (drawableB6 == null) {
                drawableB6 = compoundDrawablesRelative[2];
            }
            if (drawableB4 == null) {
                drawableB4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableB5, drawableB2, drawableB6, drawableB4);
        } else if (drawableB != null || drawableB2 != null || drawableB3 != null || drawableB4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableB == null) {
                    drawableB = compoundDrawables[0];
                }
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawables[1];
                }
                if (drawableB3 == null) {
                    drawableB3 = compoundDrawables[2];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableB, drawableB2, drawableB3, drawableB4);
            } else {
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawablesRelative2[1];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableB2, compoundDrawablesRelative2[2], drawableB4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = AbstractC1459f50.v(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Ui0.f(textView, colorStateList);
            } else if (textView instanceof Tj0) {
                ((Tj0) textView).setSupportCompoundDrawablesTintList(colorStateList);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            PorterDuff.Mode modeC = AbstractC3077vo.c(typedArrayObtainStyledAttributes4.getInt(12, -1), null);
            if (Build.VERSION.SDK_INT >= 24) {
                Ui0.g(textView, modeC);
            } else if (textView instanceof Tj0) {
                ((Tj0) textView).setSupportCompoundDrawablesTintMode(modeC);
            }
        }
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, -1);
        if (typedArrayObtainStyledAttributes4.hasValue(19)) {
            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes4.peekValue(19);
            if (typedValuePeekValue == null || typedValuePeekValue.type != 5) {
                i4 = -1;
                dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, -1);
            } else {
                int i13 = typedValuePeekValue.data;
                int i14 = i13 & 15;
                dimensionPixelSize = TypedValue.complexToFloat(i13);
                i5 = i14;
                i4 = -1;
            }
            typedArrayObtainStyledAttributes4.recycle();
            if (dimensionPixelSize2 != i4) {
                AbstractC3045vW.H(textView, dimensionPixelSize2);
            }
            if (dimensionPixelSize3 != i4) {
                AbstractC3045vW.I(textView, dimensionPixelSize3);
            }
            if (dimensionPixelSize != -1.0f) {
                if (i5 == i4) {
                    AbstractC3045vW.K(textView, (int) dimensionPixelSize);
                } else if (Build.VERSION.SDK_INT >= 34) {
                    Xi0.a(textView, i5, dimensionPixelSize);
                } else {
                    AbstractC3045vW.K(textView, Math.round(TypedValue.applyDimension(i5, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
                }
            }
        }
        i4 = -1;
        dimensionPixelSize = -1.0f;
        i5 = -1;
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize2 != i4) {
            AbstractC3045vW.H(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != i4) {
            AbstractC3045vW.I(textView, dimensionPixelSize3);
        }
        if (dimensionPixelSize != -1.0f) {
            if (i5 == i4) {
                AbstractC3045vW.K(textView, (int) dimensionPixelSize);
            } else if (Build.VERSION.SDK_INT >= 34) {
                Xi0.a(textView, i5, dimensionPixelSize);
            } else {
                AbstractC3045vW.K(textView, Math.round(TypedValue.applyDimension(i5, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
            }
        }
    }

    public final void g(Context context, int i) {
        String string;
        ColorStateList colorStateListS;
        ColorStateList colorStateListS2;
        ColorStateList colorStateListS3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, T40.w);
        RN rn = new RN(context, 9, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 23) {
            if (typedArrayObtainStyledAttributes.hasValue(3) && (colorStateListS3 = rn.s(3)) != null) {
                textView.setTextColor(colorStateListS3);
            }
            if (typedArrayObtainStyledAttributes.hasValue(5) && (colorStateListS2 = rn.s(5)) != null) {
                textView.setLinkTextColor(colorStateListS2);
            }
            if (typedArrayObtainStyledAttributes.hasValue(4) && (colorStateListS = rn.s(4)) != null) {
                textView.setHintTextColor(colorStateListS);
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, rn);
        if (i2 >= 26 && typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            N4.d(textView, string);
        }
        rn.A();
        Typeface typeface = this.l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void i(int i, int i2, int i3, int i4) {
        Y4 y4 = this.i;
        if (y4.j()) {
            DisplayMetrics displayMetrics = y4.j.getResources().getDisplayMetrics();
            y4.k(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (y4.h()) {
                y4.a();
            }
        }
    }

    public final void j(int[] iArr, int i) {
        Y4 y4 = this.i;
        if (y4.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = y4.j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                y4.f = Y4.b(iArrCopyOf);
                if (!y4.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                y4.g = false;
            }
            if (y4.h()) {
                y4.a();
            }
        }
    }

    public final void k(int i) {
        Y4 y4 = this.i;
        if (y4.j()) {
            if (i == 0) {
                y4.a = 0;
                y4.d = -1.0f;
                y4.e = -1.0f;
                y4.c = -1.0f;
                y4.f = new int[0];
                y4.b = false;
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException(AbstractC1674hK.n(i, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = y4.j.getResources().getDisplayMetrics();
            y4.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (y4.h()) {
                y4.a();
            }
        }
    }

    public final void l(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new C2673rg();
        }
        C2673rg c2673rg = this.h;
        c2673rg.c = colorStateList;
        c2673rg.b = colorStateList != null;
        this.b = c2673rg;
        this.c = c2673rg;
        this.d = c2673rg;
        this.e = c2673rg;
        this.f = c2673rg;
        this.g = c2673rg;
    }

    public final void m(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new C2673rg();
        }
        C2673rg c2673rg = this.h;
        c2673rg.d = mode;
        c2673rg.a = mode != null;
        this.b = c2673rg;
        this.c = c2673rg;
        this.d = c2673rg;
        this.e = c2673rg;
        this.f = c2673rg;
        this.g = c2673rg;
    }

    public final void n(Context context, RN rn) {
        String string;
        int i = this.j;
        TypedArray typedArray = (TypedArray) rn.n;
        this.j = typedArray.getInt(2, i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int i3 = typedArray.getInt(11, -1);
            this.k = i3;
            if (i3 != -1) {
                this.j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.m = false;
                int i4 = typedArray.getInt(1, 1);
                if (i4 == 1) {
                    this.l = Typeface.SANS_SERIF;
                    return;
                } else if (i4 == 2) {
                    this.l = Typeface.SERIF;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.l = null;
        int i5 = typedArray.hasValue(12) ? 12 : 10;
        int i6 = this.k;
        int i7 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceW = rn.w(i5, this.j, new K4(this, i6, i7, new WeakReference(this.a)));
                if (typefaceW != null) {
                    if (i2 < 28 || this.k == -1) {
                        this.l = typefaceW;
                    } else {
                        this.l = O4.a(Typeface.create(typefaceW, 0), this.k, (this.j & 2) != 0);
                    }
                }
                this.m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (string = typedArray.getString(i5)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
            this.l = Typeface.create(string, this.j);
        } else {
            this.l = O4.a(Typeface.create(string, 0), this.k, (this.j & 2) != 0);
        }
    }
}
