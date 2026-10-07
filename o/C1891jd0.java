package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: renamed from: o.jd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1891jd0 {
    public Nr0 a = new J80();
    public Nr0 b = new J80();
    public Nr0 c = new J80();
    public Nr0 d = new J80();
    public InterfaceC0888Xh e = new C2421p(0.0f);
    public InterfaceC0888Xh f = new C2421p(0.0f);
    public InterfaceC0888Xh g = new C2421p(0.0f);
    public InterfaceC0888Xh h = new C2421p(0.0f);
    public C2691rp i = new C2691rp(0);
    public C2691rp j = new C2691rp(0);
    public C2691rp k = new C2691rp(0);
    public C2691rp l = new C2691rp(0);

    public static C1795id0 a(Context context, int i, int i2, C2421p c2421p) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(H40.z);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(3, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(4, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(2, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(1, i3);
            InterfaceC0888Xh interfaceC0888XhC = c(typedArrayObtainStyledAttributes, 5, c2421p);
            InterfaceC0888Xh interfaceC0888XhC2 = c(typedArrayObtainStyledAttributes, 8, interfaceC0888XhC);
            InterfaceC0888Xh interfaceC0888XhC3 = c(typedArrayObtainStyledAttributes, 9, interfaceC0888XhC);
            InterfaceC0888Xh interfaceC0888XhC4 = c(typedArrayObtainStyledAttributes, 7, interfaceC0888XhC);
            InterfaceC0888Xh interfaceC0888XhC5 = c(typedArrayObtainStyledAttributes, 6, interfaceC0888XhC);
            C1795id0 c1795id0 = new C1795id0();
            Nr0 nr0J = AbstractC3409z9.j(i4);
            c1795id0.a = nr0J;
            C1795id0.b(nr0J);
            c1795id0.e = interfaceC0888XhC2;
            Nr0 nr0J2 = AbstractC3409z9.j(i5);
            c1795id0.b = nr0J2;
            C1795id0.b(nr0J2);
            c1795id0.f = interfaceC0888XhC3;
            Nr0 nr0J3 = AbstractC3409z9.j(i6);
            c1795id0.c = nr0J3;
            C1795id0.b(nr0J3);
            c1795id0.g = interfaceC0888XhC4;
            Nr0 nr0J4 = AbstractC3409z9.j(i7);
            c1795id0.d = nr0J4;
            C1795id0.b(nr0J4);
            c1795id0.h = interfaceC0888XhC5;
            return c1795id0;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static C1795id0 b(Context context, AttributeSet attributeSet, int i, int i2) {
        C2421p c2421p = new C2421p(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, H40.r, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, c2421p);
    }

    public static InterfaceC0888Xh c(TypedArray typedArray, int i, InterfaceC0888Xh interfaceC0888Xh) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue == null) {
            return interfaceC0888Xh;
        }
        int i2 = typedValuePeekValue.type;
        if (i2 == 5) {
            return new C2421p(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return i2 == 6 ? new T60(typedValuePeekValue.getFraction(1.0f, 1.0f)) : interfaceC0888Xh;
    }

    public final boolean d(RectF rectF) {
        boolean z = this.l.getClass().equals(C2691rp.class) && this.j.getClass().equals(C2691rp.class) && this.i.getClass().equals(C2691rp.class) && this.k.getClass().equals(C2691rp.class);
        float fA = this.e.a(rectF);
        return z && ((this.f.a(rectF) > fA ? 1 : (this.f.a(rectF) == fA ? 0 : -1)) == 0 && (this.h.a(rectF) > fA ? 1 : (this.h.a(rectF) == fA ? 0 : -1)) == 0 && (this.g.a(rectF) > fA ? 1 : (this.g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.b instanceof J80) && (this.a instanceof J80) && (this.c instanceof J80) && (this.d instanceof J80));
    }

    public final C1795id0 e() {
        C1795id0 c1795id0 = new C1795id0();
        c1795id0.a = this.a;
        c1795id0.b = this.b;
        c1795id0.c = this.c;
        c1795id0.d = this.d;
        c1795id0.e = this.e;
        c1795id0.f = this.f;
        c1795id0.g = this.g;
        c1795id0.h = this.h;
        c1795id0.i = this.i;
        c1795id0.j = this.j;
        c1795id0.k = this.k;
        c1795id0.l = this.l;
        return c1795id0;
    }
}
