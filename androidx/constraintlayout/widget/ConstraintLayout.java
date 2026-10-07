package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import o.AbstractC0446Gg;
import o.AbstractC0472Hg;
import o.AbstractC0783Tg;
import o.AbstractC1637gw0;
import o.AbstractC2636rB;
import o.As0;
import o.C0498Ig;
import o.C0524Jg;
import o.C0705Qg;
import o.C0731Rg;
import o.C0757Sg;
import o.C1636gw;
import o.C2298nm;
import o.C2720s4;
import o.C2742sK;
import o.C3080vp0;
import o.C3344yc;
import o.C3444zd0;
import o.FV;
import o.HA;
import o.IA;
import o.K30;
import o.M40;
import o.Na0;
import o.O7;
import o.TC;
import o.Yu0;
import o.zy0;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static C3444zd0 C;
    public int A;
    public int B;
    public final SparseArray l;
    public final ArrayList m;
    public final C0757Sg n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public int t;
    public C0705Qg u;
    public C2720s4 v;
    public int w;
    public HashMap x;
    public final SparseArray y;
    public final K30 z;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.l = new SparseArray();
        this.m = new ArrayList(4);
        this.n = new C0757Sg();
        this.f13o = 0;
        this.p = 0;
        this.q = Integer.MAX_VALUE;
        this.r = Integer.MAX_VALUE;
        this.s = true;
        this.t = C3080vp0.F0;
        this.u = null;
        this.v = null;
        this.w = -1;
        this.x = new HashMap();
        this.y = new SparseArray();
        this.z = new K30(this, this);
        this.A = 0;
        this.B = 0;
        i(attributeSet, 0);
    }

    public static C0498Ig g() {
        C0498Ig c0498Ig = new C0498Ig(-2, -2);
        c0498Ig.a = -1;
        c0498Ig.b = -1;
        c0498Ig.c = -1.0f;
        c0498Ig.d = true;
        c0498Ig.e = -1;
        c0498Ig.f = -1;
        c0498Ig.g = -1;
        c0498Ig.h = -1;
        c0498Ig.i = -1;
        c0498Ig.j = -1;
        c0498Ig.k = -1;
        c0498Ig.l = -1;
        c0498Ig.m = -1;
        c0498Ig.n = -1;
        c0498Ig.f327o = -1;
        c0498Ig.p = -1;
        c0498Ig.q = 0;
        c0498Ig.r = 0.0f;
        c0498Ig.s = -1;
        c0498Ig.t = -1;
        c0498Ig.u = -1;
        c0498Ig.v = -1;
        c0498Ig.w = Integer.MIN_VALUE;
        c0498Ig.x = Integer.MIN_VALUE;
        c0498Ig.y = Integer.MIN_VALUE;
        c0498Ig.z = Integer.MIN_VALUE;
        c0498Ig.A = Integer.MIN_VALUE;
        c0498Ig.B = Integer.MIN_VALUE;
        c0498Ig.C = Integer.MIN_VALUE;
        c0498Ig.D = 0;
        c0498Ig.E = 0.5f;
        c0498Ig.F = 0.5f;
        c0498Ig.G = null;
        c0498Ig.H = -1.0f;
        c0498Ig.I = -1.0f;
        c0498Ig.J = 0;
        c0498Ig.K = 0;
        c0498Ig.L = 0;
        c0498Ig.M = 0;
        c0498Ig.N = 0;
        c0498Ig.O = 0;
        c0498Ig.P = 0;
        c0498Ig.Q = 0;
        c0498Ig.R = 1.0f;
        c0498Ig.S = 1.0f;
        c0498Ig.T = -1;
        c0498Ig.U = -1;
        c0498Ig.V = -1;
        c0498Ig.W = false;
        c0498Ig.X = false;
        c0498Ig.Y = null;
        c0498Ig.Z = 0;
        c0498Ig.a0 = true;
        c0498Ig.b0 = true;
        c0498Ig.c0 = false;
        c0498Ig.d0 = false;
        c0498Ig.e0 = false;
        c0498Ig.f0 = -1;
        c0498Ig.g0 = -1;
        c0498Ig.h0 = -1;
        c0498Ig.i0 = -1;
        c0498Ig.j0 = Integer.MIN_VALUE;
        c0498Ig.k0 = Integer.MIN_VALUE;
        c0498Ig.l0 = 0.5f;
        c0498Ig.p0 = new C0731Rg();
        return c0498Ig;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static C3444zd0 getSharedValues() {
        if (C == null) {
            C3444zd0 c3444zd0 = new C3444zd0();
            new SparseIntArray();
            new HashMap();
            C = c3444zd0;
        }
        return C;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0498Ig;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.m;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((AbstractC0446Gg) arrayList.get(i)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        int i8 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i6;
                        float f2 = i7;
                        float f3 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i7 + i8;
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.s = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C0498Ig c0498Ig = new C0498Ig(context, attributeSet);
        c0498Ig.a = -1;
        c0498Ig.b = -1;
        c0498Ig.c = -1.0f;
        c0498Ig.d = true;
        c0498Ig.e = -1;
        c0498Ig.f = -1;
        c0498Ig.g = -1;
        c0498Ig.h = -1;
        c0498Ig.i = -1;
        c0498Ig.j = -1;
        c0498Ig.k = -1;
        c0498Ig.l = -1;
        c0498Ig.m = -1;
        c0498Ig.n = -1;
        c0498Ig.f327o = -1;
        c0498Ig.p = -1;
        c0498Ig.q = 0;
        c0498Ig.r = 0.0f;
        c0498Ig.s = -1;
        c0498Ig.t = -1;
        c0498Ig.u = -1;
        c0498Ig.v = -1;
        c0498Ig.w = Integer.MIN_VALUE;
        c0498Ig.x = Integer.MIN_VALUE;
        c0498Ig.y = Integer.MIN_VALUE;
        c0498Ig.z = Integer.MIN_VALUE;
        c0498Ig.A = Integer.MIN_VALUE;
        c0498Ig.B = Integer.MIN_VALUE;
        c0498Ig.C = Integer.MIN_VALUE;
        c0498Ig.D = 0;
        c0498Ig.E = 0.5f;
        c0498Ig.F = 0.5f;
        c0498Ig.G = null;
        c0498Ig.H = -1.0f;
        c0498Ig.I = -1.0f;
        c0498Ig.J = 0;
        c0498Ig.K = 0;
        c0498Ig.L = 0;
        c0498Ig.M = 0;
        c0498Ig.N = 0;
        c0498Ig.O = 0;
        c0498Ig.P = 0;
        c0498Ig.Q = 0;
        c0498Ig.R = 1.0f;
        c0498Ig.S = 1.0f;
        c0498Ig.T = -1;
        c0498Ig.U = -1;
        c0498Ig.V = -1;
        c0498Ig.W = false;
        c0498Ig.X = false;
        c0498Ig.Y = null;
        c0498Ig.Z = 0;
        c0498Ig.a0 = true;
        c0498Ig.b0 = true;
        c0498Ig.c0 = false;
        c0498Ig.d0 = false;
        c0498Ig.e0 = false;
        c0498Ig.f0 = -1;
        c0498Ig.g0 = -1;
        c0498Ig.h0 = -1;
        c0498Ig.i0 = -1;
        c0498Ig.j0 = Integer.MIN_VALUE;
        c0498Ig.k0 = Integer.MIN_VALUE;
        c0498Ig.l0 = 0.5f;
        c0498Ig.p0 = new C0731Rg();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, M40.b);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            int i2 = AbstractC0472Hg.a.get(index);
            switch (i2) {
                case 1:
                    c0498Ig.V = typedArrayObtainStyledAttributes.getInt(index, c0498Ig.V);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, c0498Ig.p);
                    c0498Ig.p = resourceId;
                    if (resourceId == -1) {
                        c0498Ig.p = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 3:
                    c0498Ig.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0498Ig.q);
                    break;
                case 4:
                    float f = typedArrayObtainStyledAttributes.getFloat(index, c0498Ig.r) % 360.0f;
                    c0498Ig.r = f;
                    if (f < 0.0f) {
                        c0498Ig.r = (360.0f - f) % 360.0f;
                    }
                    break;
                case 5:
                    c0498Ig.a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0498Ig.a);
                    break;
                case 6:
                    c0498Ig.b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0498Ig.b);
                    break;
                case 7:
                    c0498Ig.c = typedArrayObtainStyledAttributes.getFloat(index, c0498Ig.c);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, c0498Ig.e);
                    c0498Ig.e = resourceId2;
                    if (resourceId2 == -1) {
                        c0498Ig.e = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, c0498Ig.f);
                    c0498Ig.f = resourceId3;
                    if (resourceId3 == -1) {
                        c0498Ig.f = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, c0498Ig.g);
                    c0498Ig.g = resourceId4;
                    if (resourceId4 == -1) {
                        c0498Ig.g = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, c0498Ig.h);
                    c0498Ig.h = resourceId5;
                    if (resourceId5 == -1) {
                        c0498Ig.h = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, c0498Ig.i);
                    c0498Ig.i = resourceId6;
                    if (resourceId6 == -1) {
                        c0498Ig.i = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, c0498Ig.j);
                    c0498Ig.j = resourceId7;
                    if (resourceId7 == -1) {
                        c0498Ig.j = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, c0498Ig.k);
                    c0498Ig.k = resourceId8;
                    if (resourceId8 == -1) {
                        c0498Ig.k = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, c0498Ig.l);
                    c0498Ig.l = resourceId9;
                    if (resourceId9 == -1) {
                        c0498Ig.l = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, c0498Ig.m);
                    c0498Ig.m = resourceId10;
                    if (resourceId10 == -1) {
                        c0498Ig.m = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, c0498Ig.s);
                    c0498Ig.s = resourceId11;
                    if (resourceId11 == -1) {
                        c0498Ig.s = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, c0498Ig.t);
                    c0498Ig.t = resourceId12;
                    if (resourceId12 == -1) {
                        c0498Ig.t = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, c0498Ig.u);
                    c0498Ig.u = resourceId13;
                    if (resourceId13 == -1) {
                        c0498Ig.u = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, c0498Ig.v);
                    c0498Ig.v = resourceId14;
                    if (resourceId14 == -1) {
                        c0498Ig.v = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 21:
                    c0498Ig.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0498Ig.w);
                    break;
                case 22:
                    c0498Ig.x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0498Ig.x);
                    break;
                case 23:
                    c0498Ig.y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0498Ig.y);
                    break;
                case 24:
                    c0498Ig.z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0498Ig.z);
                    break;
                case 25:
                    c0498Ig.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0498Ig.A);
                    break;
                case 26:
                    c0498Ig.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0498Ig.B);
                    break;
                case 27:
                    c0498Ig.W = typedArrayObtainStyledAttributes.getBoolean(index, c0498Ig.W);
                    break;
                case 28:
                    c0498Ig.X = typedArrayObtainStyledAttributes.getBoolean(index, c0498Ig.X);
                    break;
                case 29:
                    c0498Ig.E = typedArrayObtainStyledAttributes.getFloat(index, c0498Ig.E);
                    break;
                case 30:
                    c0498Ig.F = typedArrayObtainStyledAttributes.getFloat(index, c0498Ig.F);
                    break;
                case 31:
                    c0498Ig.L = typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 32:
                    c0498Ig.M = typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 33:
                    try {
                        c0498Ig.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0498Ig.N);
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c0498Ig.N) == -2) {
                            c0498Ig.N = -2;
                        }
                    }
                    break;
                case C3080vp0.H /* 34 */:
                    try {
                        c0498Ig.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0498Ig.P);
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c0498Ig.P) == -2) {
                            c0498Ig.P = -2;
                        }
                    }
                    break;
                case C3080vp0.I /* 35 */:
                    c0498Ig.R = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, c0498Ig.R));
                    c0498Ig.L = 2;
                    break;
                case C3080vp0.J /* 36 */:
                    try {
                        c0498Ig.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0498Ig.O);
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c0498Ig.O) == -2) {
                            c0498Ig.O = -2;
                        }
                    }
                    break;
                case 37:
                    try {
                        c0498Ig.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0498Ig.Q);
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c0498Ig.Q) == -2) {
                            c0498Ig.Q = -2;
                        }
                    }
                    break;
                case C3080vp0.L /* 38 */:
                    c0498Ig.S = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, c0498Ig.S));
                    c0498Ig.M = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            C0705Qg.h(c0498Ig, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            c0498Ig.H = typedArrayObtainStyledAttributes.getFloat(index, c0498Ig.H);
                            break;
                        case 46:
                            c0498Ig.I = typedArrayObtainStyledAttributes.getFloat(index, c0498Ig.I);
                            break;
                        case 47:
                            c0498Ig.J = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case C3080vp0.V /* 48 */:
                            c0498Ig.K = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            c0498Ig.T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0498Ig.T);
                            break;
                        case C3080vp0.X /* 50 */:
                            c0498Ig.U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0498Ig.U);
                            break;
                        case 51:
                            c0498Ig.Y = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case C3080vp0.Z /* 52 */:
                            int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, c0498Ig.n);
                            c0498Ig.n = resourceId15;
                            if (resourceId15 == -1) {
                                c0498Ig.n = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 53:
                            int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, c0498Ig.f327o);
                            c0498Ig.f327o = resourceId16;
                            if (resourceId16 == -1) {
                                c0498Ig.f327o = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 54:
                            c0498Ig.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0498Ig.D);
                            break;
                        case 55:
                            c0498Ig.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0498Ig.C);
                            break;
                        default:
                            switch (i2) {
                                case 64:
                                    C0705Qg.g(c0498Ig, typedArrayObtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    C0705Qg.g(c0498Ig, typedArrayObtainStyledAttributes, index, 1);
                                    break;
                                case Yu0.a.J /* 66 */:
                                    c0498Ig.Z = typedArrayObtainStyledAttributes.getInt(index, c0498Ig.Z);
                                    break;
                                case 67:
                                    c0498Ig.d = typedArrayObtainStyledAttributes.getBoolean(index, c0498Ig.d);
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        c0498Ig.a();
        return c0498Ig;
    }

    public int getMaxHeight() {
        return this.r;
    }

    public int getMaxWidth() {
        return this.q;
    }

    public int getMinHeight() {
        return this.p;
    }

    public int getMinWidth() {
        return this.f13o;
    }

    public int getOptimizationLevel() {
        return this.n.D0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        C0757Sg c0757Sg = this.n;
        if (c0757Sg.j == null) {
            int id2 = getId();
            if (id2 != -1) {
                c0757Sg.j = getContext().getResources().getResourceEntryName(id2);
            } else {
                c0757Sg.j = "parent";
            }
        }
        if (c0757Sg.h0 == null) {
            c0757Sg.h0 = c0757Sg.j;
        }
        for (C0731Rg c0731Rg : c0757Sg.q0) {
            View view = (View) c0731Rg.f0;
            if (view != null) {
                if (c0731Rg.j == null && (id = view.getId()) != -1) {
                    c0731Rg.j = getContext().getResources().getResourceEntryName(id);
                }
                if (c0731Rg.h0 == null) {
                    c0731Rg.h0 = c0731Rg.j;
                }
            }
        }
        c0757Sg.n(sb);
        return sb.toString();
    }

    public final C0731Rg h(View view) {
        if (view == this) {
            return this.n;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof C0498Ig) {
            return ((C0498Ig) view.getLayoutParams()).p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof C0498Ig) {
            return ((C0498Ig) view.getLayoutParams()).p0;
        }
        return null;
    }

    public final void i(AttributeSet attributeSet, int i) {
        C0757Sg c0757Sg = this.n;
        c0757Sg.f0 = this;
        K30 k30 = this.z;
        c0757Sg.u0 = k30;
        c0757Sg.s0.f = k30;
        this.l.put(getId(), this);
        this.u = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, M40.b, i, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 16) {
                    this.f13o = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f13o);
                } else if (index == 17) {
                    this.p = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.p);
                } else if (index == 14) {
                    this.q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.q);
                } else if (index == 15) {
                    this.r = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.r);
                } else if (index == 113) {
                    this.t = typedArrayObtainStyledAttributes.getInt(index, this.t);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.v = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C0705Qg c0705Qg = new C0705Qg();
                        this.u = c0705Qg;
                        c0705Qg.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.u = null;
                    }
                    this.w = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        c0757Sg.D0 = this.t;
        C2742sK.p = c0757Sg.W(512);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0070  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void j(int i) {
        Context context = getContext();
        C2720s4 c2720s4 = new C2720s4((char) 0, 15);
        c2720s4.m = new SparseArray();
        c2720s4.n = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            int eventType = xml.getEventType();
            FV fv = null;
            while (true) {
                byte b = 1;
                if (eventType != 1) {
                    if (eventType == 0) {
                        xml.getName();
                    } else if (eventType == 2) {
                        String name = xml.getName();
                        switch (name.hashCode()) {
                            case -1349929691:
                                if (!name.equals("ConstraintSet")) {
                                    b = -1;
                                } else {
                                    b = 4;
                                }
                                break;
                            case 80204913:
                                if (!name.equals("State")) {
                                    b = -1;
                                } else {
                                    b = 2;
                                }
                                break;
                            case 1382829617:
                                if (!name.equals("StateSet")) {
                                    b = -1;
                                }
                                break;
                            case 1657696882:
                                if (!name.equals("layoutDescription")) {
                                    b = -1;
                                } else {
                                    b = 0;
                                }
                                break;
                            case 1901439077:
                                if (!name.equals("Variant")) {
                                    b = -1;
                                } else {
                                    b = 3;
                                }
                                break;
                            default:
                                b = -1;
                                break;
                        }
                        if (b == 2) {
                            fv = new FV(context, xml);
                            ((SparseArray) c2720s4.m).put(fv.l, fv);
                        } else if (b == 3) {
                            C0524Jg c0524Jg = new C0524Jg(context, xml);
                            if (fv != null) {
                                ((ArrayList) fv.n).add(c0524Jg);
                            }
                        } else if (b == 4) {
                            c2720s4.g0(context, xml);
                        }
                    }
                    eventType = xml.next();
                }
                this.v = c2720s4;
                return;
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:101:0x01c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:106:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:108:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:112:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:116:0x01fe A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:159:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:161:0x0308  */
    /* JADX WARN: Code duplicated, block: B:163:0x030b  */
    /* JADX WARN: Code duplicated, block: B:168:0x032d  */
    /* JADX WARN: Code duplicated, block: B:177:0x034a  */
    /* JADX WARN: Code duplicated, block: B:199:0x0386  */
    /* JADX WARN: Code duplicated, block: B:201:0x0396  */
    /* JADX WARN: Code duplicated, block: B:204:0x03a2 A[LOOP:11: B:202:0x039c->B:204:0x03a2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:206:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:209:0x0401  */
    /* JADX WARN: Code duplicated, block: B:210:0x040a  */
    /* JADX WARN: Code duplicated, block: B:212:0x040f  */
    /* JADX WARN: Code duplicated, block: B:213:0x0418  */
    /* JADX WARN: Code duplicated, block: B:215:0x041b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:216:0x041d  */
    /* JADX WARN: Code duplicated, block: B:217:0x041f  */
    /* JADX WARN: Code duplicated, block: B:219:0x0422  */
    /* JADX WARN: Code duplicated, block: B:220:0x0424  */
    /* JADX WARN: Code duplicated, block: B:222:0x0429  */
    /* JADX WARN: Code duplicated, block: B:224:0x0435  */
    /* JADX WARN: Code duplicated, block: B:228:0x043c  */
    /* JADX WARN: Code duplicated, block: B:230:0x044d  */
    /* JADX WARN: Code duplicated, block: B:232:0x0459  */
    /* JADX WARN: Code duplicated, block: B:233:0x045d  */
    /* JADX WARN: Code duplicated, block: B:251:0x048b  */
    /* JADX WARN: Code duplicated, block: B:257:0x0497  */
    /* JADX WARN: Code duplicated, block: B:259:0x049a  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:285:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:288:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:292:0x04eb A[LOOP:4: B:291:0x04e9->B:292:0x04eb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:295:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:297:0x04fc A[LOOP:5: B:296:0x04fa->B:297:0x04fc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:300:0x051a  */
    /* JADX WARN: Code duplicated, block: B:302:0x051f  */
    /* JADX WARN: Code duplicated, block: B:304:0x0526  */
    /* JADX WARN: Code duplicated, block: B:306:0x0529  */
    /* JADX WARN: Code duplicated, block: B:309:0x052f  */
    /* JADX WARN: Code duplicated, block: B:310:0x0531  */
    /* JADX WARN: Code duplicated, block: B:313:0x054e  */
    /* JADX WARN: Code duplicated, block: B:315:0x0558  */
    /* JADX WARN: Code duplicated, block: B:316:0x055e  */
    /* JADX WARN: Code duplicated, block: B:318:0x057d  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:320:0x0582  */
    /* JADX WARN: Code duplicated, block: B:324:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:326:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:328:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:337:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:339:0x05e6  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:341:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:343:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:360:0x0632  */
    /* JADX WARN: Code duplicated, block: B:363:0x0644  */
    /* JADX WARN: Code duplicated, block: B:365:0x0649  */
    /* JADX WARN: Code duplicated, block: B:368:0x0668  */
    /* JADX WARN: Code duplicated, block: B:36:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:370:0x066b  */
    /* JADX WARN: Code duplicated, block: B:372:0x066e  */
    /* JADX WARN: Code duplicated, block: B:374:0x0673  */
    /* JADX WARN: Code duplicated, block: B:377:0x0692  */
    /* JADX WARN: Code duplicated, block: B:379:0x0695  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:382:0x069a  */
    /* JADX WARN: Code duplicated, block: B:385:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:389:0x06b6 A[LOOP:7: B:335:0x05e0->B:389:0x06b6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:393:0x01bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00da  */
    /* JADX WARN: Code duplicated, block: B:405:0x0379 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:421:0x04dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:427:0x06c7 A[EDGE_INSN: B:427:0x06c7->B:390:0x06c7 BREAK  A[LOOP:7: B:335:0x05e0->B:389:0x06b6], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:49:0x0121  */
    /* JADX WARN: Code duplicated, block: B:50:0x0124  */
    /* JADX WARN: Code duplicated, block: B:53:0x012b  */
    /* JADX WARN: Code duplicated, block: B:54:0x012e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0153  */
    /* JADX WARN: Code duplicated, block: B:61:0x015c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0160  */
    /* JADX WARN: Code duplicated, block: B:66:0x0163  */
    /* JADX WARN: Code duplicated, block: B:68:0x0173  */
    /* JADX WARN: Code duplicated, block: B:70:0x0177  */
    /* JADX WARN: Code duplicated, block: B:73:0x017d  */
    /* JADX WARN: Code duplicated, block: B:74:0x017f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0182 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:80:0x018d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0194 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x019a  */
    /* JADX WARN: Code duplicated, block: B:98:0x01bc  */
    public final void k(C0757Sg c0757Sg, int i, int i2, int i3) {
        int iMin;
        int iMax;
        int iMin2;
        int iMax2;
        int i4;
        int iQ;
        C2298nm c2298nm;
        int i5;
        int[] iArr;
        int i6;
        int i7;
        Na0 na0;
        K30 k30;
        int size;
        int iQ2;
        int iK;
        boolean zS;
        boolean z;
        int i8;
        boolean z2;
        boolean z3;
        K30 k31;
        int i9;
        int i10;
        boolean zT;
        int i11;
        ArrayList arrayList;
        int size2;
        int i12;
        int i13;
        int[] iArr2;
        boolean z4;
        boolean z5;
        int iMax3;
        int iMax4;
        int i14;
        boolean z6;
        K30 k32;
        int i15;
        int i16;
        K30 k33;
        ArrayList arrayList2;
        int i17;
        C0731Rg c0731Rg;
        int iQ3;
        int iK2;
        ArrayList arrayList3;
        int i18;
        boolean zN;
        int iQ4;
        K30 k34;
        int iK3;
        C0731Rg c0731Rg2;
        int iQ5;
        int iK4;
        K30 k35;
        boolean zN2;
        int iQ6;
        int iK5;
        boolean z7;
        int size3;
        K30 k36;
        int i19;
        ConstraintLayout constraintLayout;
        int childCount;
        int i20;
        ArrayList arrayList4;
        int size4;
        int i21;
        C0731Rg c0731Rg3;
        int iJ;
        boolean z8;
        TC tc;
        As0 as0;
        int iMin3;
        int iMin4;
        boolean z9;
        C0757Sg c0757Sg2;
        int i22;
        int i23;
        int i24;
        boolean zT2;
        boolean z10;
        boolean z11;
        int i25;
        int i26;
        int[] iArr3;
        int i27;
        int i28;
        boolean z12;
        Iterator it;
        boolean z13;
        AbstractC1637gw0 abstractC1637gw0;
        int i29;
        C0731Rg c0731Rg4;
        int[] iArr4;
        boolean z14;
        boolean z15;
        boolean z16;
        C0757Sg c0757Sg3 = c0757Sg;
        int mode = View.MeasureSpec.getMode(i2);
        int size5 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size6 = View.MeasureSpec.getSize(i3);
        int iMax5 = Math.max(0, getPaddingTop());
        int iMax6 = Math.max(0, getPaddingBottom());
        int i30 = iMax5 + iMax6;
        int paddingWidth = getPaddingWidth();
        K30 k37 = this.z;
        k37.a = iMax5;
        k37.b = iMax6;
        k37.c = paddingWidth;
        k37.d = i30;
        k37.e = i2;
        k37.f = i3;
        int iMax7 = Math.max(0, getPaddingStart());
        int iMax8 = Math.max(0, getPaddingEnd());
        int i31 = 1;
        if (iMax7 <= 0 && iMax8 <= 0) {
            iMax7 = Math.max(0, getPaddingLeft());
        } else if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            iMax7 = iMax8;
        }
        int i32 = size5 - paddingWidth;
        int i33 = size6 - i30;
        int i34 = k37.d;
        int i35 = k37.c;
        int childCount2 = getChildCount();
        if (mode == Integer.MIN_VALUE) {
            if (childCount2 == 0) {
                iMax = Math.max(0, this.f13o);
            } else {
                iMin = i32;
            }
            i31 = 2;
            if (mode2 != Integer.MIN_VALUE) {
                if (childCount2 == 0) {
                    iMax2 = Math.max(0, this.p);
                } else {
                    iMin2 = i33;
                }
                i4 = 2;
                iQ = c0757Sg.q();
                c2298nm = c0757Sg3.s0;
                i5 = iMin;
                if (i5 == iQ) {
                    c2298nm.c = true;
                } else {
                    c2298nm.c = true;
                }
                c0757Sg3.Y = 0;
                c0757Sg3.Z = 0;
                int i36 = this.q - i35;
                iArr = c0757Sg3.C;
                iArr[0] = i36;
                iArr[1] = this.r - i34;
                c0757Sg3.b0 = 0;
                c0757Sg3.c0 = 0;
                c0757Sg3.M(i31);
                c0757Sg3.O(i5);
                c0757Sg3.N(i4);
                c0757Sg3.L(iMin2);
                i6 = this.f13o - i35;
                if (i6 < 0) {
                    c0757Sg3.b0 = 0;
                } else {
                    c0757Sg3.b0 = i6;
                }
                i7 = this.p - i34;
                if (i7 < 0) {
                    c0757Sg3.c0 = 0;
                } else {
                    c0757Sg3.c0 = i7;
                }
                c0757Sg3.x0 = iMax7;
                c0757Sg3.y0 = iMax5;
                na0 = c0757Sg3.r0;
                na0.getClass();
                k30 = c0757Sg3.u0;
                size = c0757Sg3.q0.size();
                iQ2 = c0757Sg.q();
                iK = c0757Sg.k();
                zS = zy0.s(i, 128);
                if (zS) {
                    z = true;
                } else {
                    z = true;
                }
                if (z) {
                    i29 = 0;
                    while (true) {
                        if (i29 < size) {
                            c0731Rg4 = (C0731Rg) c0757Sg3.q0.get(i29);
                            iArr4 = c0731Rg4.p0;
                            if (iArr4[0] == 3) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (iArr4[1] == 3) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (z14) {
                                z16 = false;
                            } else {
                                z16 = false;
                            }
                            if (!c0731Rg4.x()) {
                            }
                            i8 = 1073741824;
                            z = false;
                        } else {
                            i8 = 1073741824;
                        }
                    }
                } else {
                    i8 = 1073741824;
                }
                z2 = ((mode != i8 && mode2 == i8) || zS) & z;
                if (z2) {
                    iMin3 = Math.min(iArr[0], i32);
                    iMin4 = Math.min(iArr[1], i33);
                    if (mode == 1073741824) {
                        c0757Sg3.O(iMin3);
                        c0757Sg3.s0.b = true;
                    }
                    if (mode2 == 1073741824) {
                        c0757Sg3.L(iMin4);
                        c0757Sg3.s0.b = true;
                    }
                    if (mode == 1073741824) {
                        z3 = z2;
                        k31 = k30;
                        iQ2 = iQ2;
                        i9 = iK;
                        z9 = c2298nm.b;
                        c0757Sg2 = c2298nm.a;
                        if (z9) {
                            for (C0731Rg c0731Rg5 : c0757Sg2.q0) {
                                c0731Rg5.h();
                                c0731Rg5.a = false;
                                TC tc2 = c0731Rg5.d;
                                tc2.e.j = false;
                                tc2.g = false;
                                tc2.n();
                                As0 as1 = c0731Rg5.e;
                                as1.e.j = false;
                                as1.g = false;
                                as1.m();
                            }
                            i22 = 0;
                            c0757Sg2.h();
                            c0757Sg2.a = false;
                            TC tc3 = c0757Sg2.d;
                            tc3.e.j = false;
                            tc3.g = false;
                            tc3.n();
                            As0 as2 = c0757Sg2.e;
                            as2.e.j = false;
                            as2.g = false;
                            as2.m();
                            c2298nm.c();
                        } else {
                            i22 = 0;
                        }
                        c2298nm.b(c2298nm.d);
                        c0757Sg2.Y = i22;
                        c0757Sg2.Z = i22;
                        c0757Sg2.d.h.d(i22);
                        c0757Sg2.e.h.d(i22);
                        i23 = 1073741824;
                        if (mode == 1073741824) {
                            i24 = 1;
                            zT2 = c0757Sg3.T(i22, zS) & true;
                            i10 = 1;
                        } else {
                            i24 = 1;
                            i10 = 0;
                            zT2 = true;
                        }
                        if (mode2 == 1073741824) {
                            zT = zT2 & c0757Sg3.T(i24, zS);
                            i10++;
                        } else {
                            zT = zT2;
                        }
                    } else {
                        z3 = z2;
                        k31 = k30;
                        iQ2 = iQ2;
                        i9 = iK;
                        z9 = c2298nm.b;
                        c0757Sg2 = c2298nm.a;
                        if (z9) {
                            while (r0.hasNext()) {
                                c0731Rg5.h();
                                c0731Rg5.a = false;
                                TC tc4 = c0731Rg5.d;
                                tc4.e.j = false;
                                tc4.g = false;
                                tc4.n();
                                As0 as3 = c0731Rg5.e;
                                as3.e.j = false;
                                as3.g = false;
                                as3.m();
                            }
                            i22 = 0;
                            c0757Sg2.h();
                            c0757Sg2.a = false;
                            TC tc5 = c0757Sg2.d;
                            tc5.e.j = false;
                            tc5.g = false;
                            tc5.n();
                            As0 as4 = c0757Sg2.e;
                            as4.e.j = false;
                            as4.g = false;
                            as4.m();
                            c2298nm.c();
                        } else {
                            i22 = 0;
                        }
                        c2298nm.b(c2298nm.d);
                        c0757Sg2.Y = i22;
                        c0757Sg2.Z = i22;
                        c0757Sg2.d.h.d(i22);
                        c0757Sg2.e.h.d(i22);
                        i23 = 1073741824;
                        if (mode == 1073741824) {
                            i24 = 1;
                            zT2 = c0757Sg3.T(i22, zS) & true;
                            i10 = 1;
                        } else {
                            i24 = 1;
                            i10 = 0;
                            zT2 = true;
                        }
                        if (mode2 == 1073741824) {
                            zT = zT2 & c0757Sg3.T(i24, zS);
                            i10++;
                        } else {
                            zT = zT2;
                        }
                    }
                    if (zT) {
                        if (mode == i23) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (mode2 == i23) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        c0757Sg3.P(z10, z11);
                    }
                } else {
                    z3 = z2;
                    k31 = k30;
                    iQ2 = iQ2;
                    i9 = iK;
                    i10 = 0;
                    zT = false;
                }
                if (zT) {
                }
                i11 = c0757Sg3.D0;
                if (size > 0) {
                    size3 = c0757Sg3.q0.size();
                    boolean zW = c0757Sg3.W(64);
                    k36 = c0757Sg3.u0;
                    for (i19 = 0; i19 < size3; i19++) {
                        c0731Rg3 = (C0731Rg) c0757Sg3.q0.get(i19);
                        if (!(c0731Rg3 instanceof HA)) {
                            iJ = c0731Rg3.j(0);
                            int iJ2 = c0731Rg3.j(1);
                            if (iJ == 3) {
                                z8 = false;
                            } else {
                                z8 = false;
                            }
                            if (z8) {
                            }
                            if (!z8) {
                                na0.N(0, c0731Rg3, k36);
                            }
                        }
                    }
                    constraintLayout = (ConstraintLayout) k36.g;
                    childCount = constraintLayout.getChildCount();
                    for (i20 = 0; i20 < childCount; i20++) {
                        constraintLayout.getChildAt(i20);
                    }
                    arrayList4 = constraintLayout.m;
                    size4 = arrayList4.size();
                    if (size4 > 0) {
                        for (i21 = 0; i21 < size4; i21++) {
                            ((AbstractC0446Gg) arrayList4.get(i21)).getClass();
                        }
                    }
                }
                na0.W(c0757Sg3);
                arrayList = (ArrayList) na0.m;
                size2 = arrayList.size();
                i12 = iQ2;
                i13 = i9;
                if (size > 0) {
                    na0.R(c0757Sg3, 0, i12, i13);
                }
                if (size2 > 0) {
                    iArr2 = c0757Sg3.p0;
                    if (iArr2[0] == 2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (iArr2[1] == 2) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    int iQ7 = c0757Sg.q();
                    C0757Sg c0757Sg4 = (C0757Sg) na0.f414o;
                    iMax3 = Math.max(iQ7, c0757Sg4.b0);
                    iMax4 = Math.max(c0757Sg.k(), c0757Sg4.c0);
                    i14 = 0;
                    z6 = false;
                    while (i14 < size2) {
                        c0731Rg2 = (C0731Rg) arrayList.get(i14);
                        if (c0731Rg2 instanceof C1636gw) {
                            iQ5 = c0731Rg2.q();
                            iK4 = c0731Rg2.k();
                            k35 = k31;
                            zN2 = z6 | na0.N(1, c0731Rg2, k35);
                            iQ6 = c0731Rg2.q();
                            iK5 = c0731Rg2.k();
                            if (iQ6 != iQ5) {
                                c0731Rg2.O(iQ6);
                                if (z4) {
                                    iMax3 = Math.max(iMax3, c0731Rg2.i(4).e() + c0731Rg2.r() + c0731Rg2.U);
                                }
                                z7 = true;
                            } else {
                                z7 = zN2;
                            }
                            if (iK5 != iK4) {
                                c0731Rg2.L(iK5);
                                if (z5) {
                                    iMax4 = Math.max(iMax4, c0731Rg2.i(5).e() + c0731Rg2.s() + c0731Rg2.V);
                                }
                                z7 = true;
                            }
                            z6 = ((C1636gw) c0731Rg2).y0 | z7;
                        } else {
                            k35 = k31;
                        }
                        i14++;
                        k31 = k35;
                        i11 = i11;
                    }
                    int i37 = i11;
                    k32 = k31;
                    i15 = 0;
                    while (i15 < 2) {
                        i16 = 0;
                        while (i16 < size2) {
                            c0731Rg = (C0731Rg) arrayList.get(i16);
                            if (c0731Rg instanceof AbstractC2636rB) {
                                iQ3 = c0731Rg.q();
                                iK2 = c0731Rg.k();
                                arrayList3 = arrayList;
                                int i38 = c0731Rg.a0;
                                i18 = size2;
                                zN = na0.N(i15 == 1 ? 2 : 1, c0731Rg, k32) | z6;
                                iQ4 = c0731Rg.q();
                                k34 = k32;
                                iK3 = c0731Rg.k();
                                if (iQ4 != iQ3) {
                                    c0731Rg.O(iQ4);
                                    if (!z4) {
                                    }
                                    zN = true;
                                }
                                if (iK3 != iK2) {
                                    c0731Rg.L(iK3);
                                    if (!z5) {
                                    }
                                    zN = true;
                                }
                                if (c0731Rg.E) {
                                    z6 = zN;
                                } else {
                                    z6 = zN;
                                }
                            } else {
                                iQ3 = c0731Rg.q();
                                iK2 = c0731Rg.k();
                                arrayList3 = arrayList;
                                int i39 = c0731Rg.a0;
                                i18 = size2;
                                zN = na0.N(i15 == 1 ? 2 : 1, c0731Rg, k32) | z6;
                                iQ4 = c0731Rg.q();
                                k34 = k32;
                                iK3 = c0731Rg.k();
                                if (iQ4 != iQ3) {
                                    c0731Rg.O(iQ4);
                                    if (!z4) {
                                    }
                                    zN = true;
                                }
                                if (iK3 != iK2) {
                                    c0731Rg.L(iK3);
                                    if (!z5) {
                                    }
                                    zN = true;
                                }
                                if (c0731Rg.E) {
                                    z6 = zN;
                                } else {
                                    z6 = zN;
                                }
                            }
                            i16++;
                            arrayList = arrayList3;
                            size2 = i18;
                            k32 = k34;
                        }
                        k33 = k32;
                        arrayList2 = arrayList;
                        i17 = size2;
                        if (z6) {
                            break;
                            break;
                        }
                        i15++;
                        na0.R(c0757Sg, i15, i12, i13);
                        k32 = k33;
                        arrayList = arrayList2;
                        size2 = i17;
                        z6 = false;
                    }
                    c0757Sg3 = c0757Sg;
                    i11 = i37;
                }
                c0757Sg3.D0 = i11;
                C2742sK.p = c0757Sg3.W(512);
            }
            if (mode2 != 0) {
                if (mode2 != 1073741824) {
                    i4 = 1;
                } else {
                    iMin2 = Math.min(this.r - i34, i33);
                    i4 = 1;
                }
                iQ = c0757Sg.q();
                c2298nm = c0757Sg3.s0;
                i5 = iMin;
                if (i5 == iQ) {
                    c2298nm.c = true;
                } else {
                    c2298nm.c = true;
                }
                c0757Sg3.Y = 0;
                c0757Sg3.Z = 0;
                int i310 = this.q - i35;
                iArr = c0757Sg3.C;
                iArr[0] = i310;
                iArr[1] = this.r - i34;
                c0757Sg3.b0 = 0;
                c0757Sg3.c0 = 0;
                c0757Sg3.M(i31);
                c0757Sg3.O(i5);
                c0757Sg3.N(i4);
                c0757Sg3.L(iMin2);
                i6 = this.f13o - i35;
                if (i6 < 0) {
                    c0757Sg3.b0 = 0;
                } else {
                    c0757Sg3.b0 = i6;
                }
                i7 = this.p - i34;
                if (i7 < 0) {
                    c0757Sg3.c0 = 0;
                } else {
                    c0757Sg3.c0 = i7;
                }
                c0757Sg3.x0 = iMax7;
                c0757Sg3.y0 = iMax5;
                na0 = c0757Sg3.r0;
                na0.getClass();
                k30 = c0757Sg3.u0;
                size = c0757Sg3.q0.size();
                iQ2 = c0757Sg.q();
                iK = c0757Sg.k();
                zS = zy0.s(i, 128);
                if (zS) {
                    z = true;
                } else {
                    z = true;
                }
                if (z) {
                    i29 = 0;
                    while (true) {
                        if (i29 < size) {
                            c0731Rg4 = (C0731Rg) c0757Sg3.q0.get(i29);
                            iArr4 = c0731Rg4.p0;
                            if (iArr4[0] == 3) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (iArr4[1] == 3) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (z14) {
                                z16 = false;
                            } else {
                                z16 = false;
                            }
                            if (!c0731Rg4.x()) {
                            }
                            i8 = 1073741824;
                            z = false;
                        } else {
                            i8 = 1073741824;
                        }
                    }
                } else {
                    i8 = 1073741824;
                }
                z2 = ((mode != i8 && mode2 == i8) || zS) & z;
                if (z2) {
                    iMin3 = Math.min(iArr[0], i32);
                    iMin4 = Math.min(iArr[1], i33);
                    if (mode == 1073741824) {
                        c0757Sg3.O(iMin3);
                        c0757Sg3.s0.b = true;
                    }
                    if (mode2 == 1073741824) {
                        c0757Sg3.L(iMin4);
                        c0757Sg3.s0.b = true;
                    }
                    if (mode == 1073741824) {
                        z3 = z2;
                        k31 = k30;
                        iQ2 = iQ2;
                        i9 = iK;
                        z9 = c2298nm.b;
                        c0757Sg2 = c2298nm.a;
                        if (z9) {
                            while (r0.hasNext()) {
                                c0731Rg5.h();
                                c0731Rg5.a = false;
                                TC tc6 = c0731Rg5.d;
                                tc6.e.j = false;
                                tc6.g = false;
                                tc6.n();
                                As0 as5 = c0731Rg5.e;
                                as5.e.j = false;
                                as5.g = false;
                                as5.m();
                            }
                            i22 = 0;
                            c0757Sg2.h();
                            c0757Sg2.a = false;
                            TC tc7 = c0757Sg2.d;
                            tc7.e.j = false;
                            tc7.g = false;
                            tc7.n();
                            As0 as6 = c0757Sg2.e;
                            as6.e.j = false;
                            as6.g = false;
                            as6.m();
                            c2298nm.c();
                        } else {
                            i22 = 0;
                        }
                        c2298nm.b(c2298nm.d);
                        c0757Sg2.Y = i22;
                        c0757Sg2.Z = i22;
                        c0757Sg2.d.h.d(i22);
                        c0757Sg2.e.h.d(i22);
                        i23 = 1073741824;
                        if (mode == 1073741824) {
                            i24 = 1;
                            zT2 = c0757Sg3.T(i22, zS) & true;
                            i10 = 1;
                        } else {
                            i24 = 1;
                            i10 = 0;
                            zT2 = true;
                        }
                        if (mode2 == 1073741824) {
                            zT = zT2 & c0757Sg3.T(i24, zS);
                            i10++;
                        } else {
                            zT = zT2;
                        }
                    } else {
                        z3 = z2;
                        k31 = k30;
                        iQ2 = iQ2;
                        i9 = iK;
                        z9 = c2298nm.b;
                        c0757Sg2 = c2298nm.a;
                        if (z9) {
                            while (r0.hasNext()) {
                                c0731Rg5.h();
                                c0731Rg5.a = false;
                                TC tc8 = c0731Rg5.d;
                                tc8.e.j = false;
                                tc8.g = false;
                                tc8.n();
                                As0 as7 = c0731Rg5.e;
                                as7.e.j = false;
                                as7.g = false;
                                as7.m();
                            }
                            i22 = 0;
                            c0757Sg2.h();
                            c0757Sg2.a = false;
                            TC tc9 = c0757Sg2.d;
                            tc9.e.j = false;
                            tc9.g = false;
                            tc9.n();
                            As0 as8 = c0757Sg2.e;
                            as8.e.j = false;
                            as8.g = false;
                            as8.m();
                            c2298nm.c();
                        } else {
                            i22 = 0;
                        }
                        c2298nm.b(c2298nm.d);
                        c0757Sg2.Y = i22;
                        c0757Sg2.Z = i22;
                        c0757Sg2.d.h.d(i22);
                        c0757Sg2.e.h.d(i22);
                        i23 = 1073741824;
                        if (mode == 1073741824) {
                            i24 = 1;
                            zT2 = c0757Sg3.T(i22, zS) & true;
                            i10 = 1;
                        } else {
                            i24 = 1;
                            i10 = 0;
                            zT2 = true;
                        }
                        if (mode2 == 1073741824) {
                            zT = zT2 & c0757Sg3.T(i24, zS);
                            i10++;
                        } else {
                            zT = zT2;
                        }
                    }
                    if (zT) {
                        if (mode == i23) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (mode2 == i23) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        c0757Sg3.P(z10, z11);
                    }
                } else {
                    z3 = z2;
                    k31 = k30;
                    iQ2 = iQ2;
                    i9 = iK;
                    i10 = 0;
                    zT = false;
                }
                if (zT) {
                }
                i11 = c0757Sg3.D0;
                if (size > 0) {
                    size3 = c0757Sg3.q0.size();
                    boolean zW2 = c0757Sg3.W(64);
                    k36 = c0757Sg3.u0;
                    while (i19 < size3) {
                        c0731Rg3 = (C0731Rg) c0757Sg3.q0.get(i19);
                        if (!(c0731Rg3 instanceof HA)) {
                            iJ = c0731Rg3.j(0);
                            int iJ3 = c0731Rg3.j(1);
                            if (iJ == 3) {
                                z8 = false;
                            } else {
                                z8 = false;
                            }
                            if (z8) {
                            }
                            if (!z8) {
                                na0.N(0, c0731Rg3, k36);
                            }
                        }
                    }
                    constraintLayout = (ConstraintLayout) k36.g;
                    childCount = constraintLayout.getChildCount();
                    while (i20 < childCount) {
                        constraintLayout.getChildAt(i20);
                    }
                    arrayList4 = constraintLayout.m;
                    size4 = arrayList4.size();
                    if (size4 > 0) {
                        while (i21 < size4) {
                            ((AbstractC0446Gg) arrayList4.get(i21)).getClass();
                        }
                    }
                }
                na0.W(c0757Sg3);
                arrayList = (ArrayList) na0.m;
                size2 = arrayList.size();
                i12 = iQ2;
                i13 = i9;
                if (size > 0) {
                    na0.R(c0757Sg3, 0, i12, i13);
                }
                if (size2 > 0) {
                    iArr2 = c0757Sg3.p0;
                    if (iArr2[0] == 2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (iArr2[1] == 2) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    int iQ8 = c0757Sg.q();
                    C0757Sg c0757Sg5 = (C0757Sg) na0.f414o;
                    iMax3 = Math.max(iQ8, c0757Sg5.b0);
                    iMax4 = Math.max(c0757Sg.k(), c0757Sg5.c0);
                    i14 = 0;
                    z6 = false;
                    while (i14 < size2) {
                        c0731Rg2 = (C0731Rg) arrayList.get(i14);
                        if (c0731Rg2 instanceof C1636gw) {
                            k35 = k31;
                        } else {
                            iQ5 = c0731Rg2.q();
                            iK4 = c0731Rg2.k();
                            k35 = k31;
                            zN2 = z6 | na0.N(1, c0731Rg2, k35);
                            iQ6 = c0731Rg2.q();
                            iK5 = c0731Rg2.k();
                            if (iQ6 != iQ5) {
                                c0731Rg2.O(iQ6);
                                if (z4) {
                                    iMax3 = Math.max(iMax3, c0731Rg2.i(4).e() + c0731Rg2.r() + c0731Rg2.U);
                                }
                                z7 = true;
                            } else {
                                z7 = zN2;
                            }
                            if (iK5 != iK4) {
                                c0731Rg2.L(iK5);
                                if (z5) {
                                    iMax4 = Math.max(iMax4, c0731Rg2.i(5).e() + c0731Rg2.s() + c0731Rg2.V);
                                }
                                z7 = true;
                            }
                            z6 = ((C1636gw) c0731Rg2).y0 | z7;
                        }
                        i14++;
                        k31 = k35;
                        i11 = i11;
                    }
                    int i311 = i11;
                    k32 = k31;
                    i15 = 0;
                    while (i15 < 2) {
                        i16 = 0;
                        while (i16 < size2) {
                            c0731Rg = (C0731Rg) arrayList.get(i16);
                            if (c0731Rg instanceof AbstractC2636rB) {
                                iQ3 = c0731Rg.q();
                                iK2 = c0731Rg.k();
                                arrayList3 = arrayList;
                                int i312 = c0731Rg.a0;
                                i18 = size2;
                                zN = na0.N(i15 == 1 ? 2 : 1, c0731Rg, k32) | z6;
                                iQ4 = c0731Rg.q();
                                k34 = k32;
                                iK3 = c0731Rg.k();
                                if (iQ4 != iQ3) {
                                    c0731Rg.O(iQ4);
                                    if (!z4) {
                                    }
                                    zN = true;
                                }
                                if (iK3 != iK2) {
                                    c0731Rg.L(iK3);
                                    if (!z5) {
                                    }
                                    zN = true;
                                }
                                if (c0731Rg.E) {
                                    z6 = zN;
                                } else {
                                    z6 = zN;
                                }
                            } else {
                                iQ3 = c0731Rg.q();
                                iK2 = c0731Rg.k();
                                arrayList3 = arrayList;
                                int i313 = c0731Rg.a0;
                                i18 = size2;
                                zN = na0.N(i15 == 1 ? 2 : 1, c0731Rg, k32) | z6;
                                iQ4 = c0731Rg.q();
                                k34 = k32;
                                iK3 = c0731Rg.k();
                                if (iQ4 != iQ3) {
                                    c0731Rg.O(iQ4);
                                    if (!z4) {
                                    }
                                    zN = true;
                                }
                                if (iK3 != iK2) {
                                    c0731Rg.L(iK3);
                                    if (!z5) {
                                    }
                                    zN = true;
                                }
                                if (c0731Rg.E) {
                                    z6 = zN;
                                } else {
                                    z6 = zN;
                                }
                            }
                            i16++;
                            arrayList = arrayList3;
                            size2 = i18;
                            k32 = k34;
                        }
                        k33 = k32;
                        arrayList2 = arrayList;
                        i17 = size2;
                        if (z6) {
                            break;
                            break;
                        }
                        i15++;
                        na0.R(c0757Sg, i15, i12, i13);
                        k32 = k33;
                        arrayList = arrayList2;
                        size2 = i17;
                        z6 = false;
                    }
                    c0757Sg3 = c0757Sg;
                    i11 = i311;
                }
                c0757Sg3.D0 = i11;
                C2742sK.p = c0757Sg3.W(512);
            }
            if (childCount2 == 0) {
                iMax2 = Math.max(0, this.p);
            } else {
                i4 = 2;
            }
            iMin2 = 0;
            iQ = c0757Sg.q();
            c2298nm = c0757Sg3.s0;
            i5 = iMin;
            if (i5 == iQ) {
                c2298nm.c = true;
            } else {
                c2298nm.c = true;
            }
            c0757Sg3.Y = 0;
            c0757Sg3.Z = 0;
            int i314 = this.q - i35;
            iArr = c0757Sg3.C;
            iArr[0] = i314;
            iArr[1] = this.r - i34;
            c0757Sg3.b0 = 0;
            c0757Sg3.c0 = 0;
            c0757Sg3.M(i31);
            c0757Sg3.O(i5);
            c0757Sg3.N(i4);
            c0757Sg3.L(iMin2);
            i6 = this.f13o - i35;
            if (i6 < 0) {
                c0757Sg3.b0 = 0;
            } else {
                c0757Sg3.b0 = i6;
            }
            i7 = this.p - i34;
            if (i7 < 0) {
                c0757Sg3.c0 = 0;
            } else {
                c0757Sg3.c0 = i7;
            }
            c0757Sg3.x0 = iMax7;
            c0757Sg3.y0 = iMax5;
            na0 = c0757Sg3.r0;
            na0.getClass();
            k30 = c0757Sg3.u0;
            size = c0757Sg3.q0.size();
            iQ2 = c0757Sg.q();
            iK = c0757Sg.k();
            zS = zy0.s(i, 128);
            if (zS) {
                z = true;
            } else {
                z = true;
            }
            if (z) {
                i29 = 0;
                while (true) {
                    if (i29 < size) {
                        c0731Rg4 = (C0731Rg) c0757Sg3.q0.get(i29);
                        iArr4 = c0731Rg4.p0;
                        if (iArr4[0] == 3) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (iArr4[1] == 3) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (z14) {
                            z16 = false;
                        } else {
                            z16 = false;
                        }
                        if (!c0731Rg4.x()) {
                        }
                        i8 = 1073741824;
                        z = false;
                    } else {
                        i8 = 1073741824;
                    }
                }
            } else {
                i8 = 1073741824;
            }
            z2 = ((mode != i8 && mode2 == i8) || zS) & z;
            if (z2) {
                iMin3 = Math.min(iArr[0], i32);
                iMin4 = Math.min(iArr[1], i33);
                if (mode == 1073741824) {
                    c0757Sg3.O(iMin3);
                    c0757Sg3.s0.b = true;
                }
                if (mode2 == 1073741824) {
                    c0757Sg3.L(iMin4);
                    c0757Sg3.s0.b = true;
                }
                if (mode == 1073741824) {
                    z3 = z2;
                    k31 = k30;
                    iQ2 = iQ2;
                    i9 = iK;
                    z9 = c2298nm.b;
                    c0757Sg2 = c2298nm.a;
                    if (z9) {
                        while (r0.hasNext()) {
                            c0731Rg5.h();
                            c0731Rg5.a = false;
                            TC tc10 = c0731Rg5.d;
                            tc10.e.j = false;
                            tc10.g = false;
                            tc10.n();
                            As0 as9 = c0731Rg5.e;
                            as9.e.j = false;
                            as9.g = false;
                            as9.m();
                        }
                        i22 = 0;
                        c0757Sg2.h();
                        c0757Sg2.a = false;
                        TC tc11 = c0757Sg2.d;
                        tc11.e.j = false;
                        tc11.g = false;
                        tc11.n();
                        As0 as10 = c0757Sg2.e;
                        as10.e.j = false;
                        as10.g = false;
                        as10.m();
                        c2298nm.c();
                    } else {
                        i22 = 0;
                    }
                    c2298nm.b(c2298nm.d);
                    c0757Sg2.Y = i22;
                    c0757Sg2.Z = i22;
                    c0757Sg2.d.h.d(i22);
                    c0757Sg2.e.h.d(i22);
                    i23 = 1073741824;
                    if (mode == 1073741824) {
                        i24 = 1;
                        zT2 = c0757Sg3.T(i22, zS) & true;
                        i10 = 1;
                    } else {
                        i24 = 1;
                        i10 = 0;
                        zT2 = true;
                    }
                    if (mode2 == 1073741824) {
                        zT = zT2 & c0757Sg3.T(i24, zS);
                        i10++;
                    } else {
                        zT = zT2;
                    }
                } else {
                    z3 = z2;
                    k31 = k30;
                    iQ2 = iQ2;
                    i9 = iK;
                    z9 = c2298nm.b;
                    c0757Sg2 = c2298nm.a;
                    if (z9) {
                        while (r0.hasNext()) {
                            c0731Rg5.h();
                            c0731Rg5.a = false;
                            TC tc12 = c0731Rg5.d;
                            tc12.e.j = false;
                            tc12.g = false;
                            tc12.n();
                            As0 as11 = c0731Rg5.e;
                            as11.e.j = false;
                            as11.g = false;
                            as11.m();
                        }
                        i22 = 0;
                        c0757Sg2.h();
                        c0757Sg2.a = false;
                        TC tc13 = c0757Sg2.d;
                        tc13.e.j = false;
                        tc13.g = false;
                        tc13.n();
                        As0 as12 = c0757Sg2.e;
                        as12.e.j = false;
                        as12.g = false;
                        as12.m();
                        c2298nm.c();
                    } else {
                        i22 = 0;
                    }
                    c2298nm.b(c2298nm.d);
                    c0757Sg2.Y = i22;
                    c0757Sg2.Z = i22;
                    c0757Sg2.d.h.d(i22);
                    c0757Sg2.e.h.d(i22);
                    i23 = 1073741824;
                    if (mode == 1073741824) {
                        i24 = 1;
                        zT2 = c0757Sg3.T(i22, zS) & true;
                        i10 = 1;
                    } else {
                        i24 = 1;
                        i10 = 0;
                        zT2 = true;
                    }
                    if (mode2 == 1073741824) {
                        zT = zT2 & c0757Sg3.T(i24, zS);
                        i10++;
                    } else {
                        zT = zT2;
                    }
                }
                if (zT) {
                    if (mode == i23) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (mode2 == i23) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    c0757Sg3.P(z10, z11);
                }
            } else {
                z3 = z2;
                k31 = k30;
                iQ2 = iQ2;
                i9 = iK;
                i10 = 0;
                zT = false;
            }
            if (zT) {
            }
            i11 = c0757Sg3.D0;
            if (size > 0) {
                size3 = c0757Sg3.q0.size();
                boolean zW3 = c0757Sg3.W(64);
                k36 = c0757Sg3.u0;
                while (i19 < size3) {
                    c0731Rg3 = (C0731Rg) c0757Sg3.q0.get(i19);
                    if (!(c0731Rg3 instanceof HA)) {
                        iJ = c0731Rg3.j(0);
                        int iJ4 = c0731Rg3.j(1);
                        if (iJ == 3) {
                            z8 = false;
                        } else {
                            z8 = false;
                        }
                        if (z8) {
                        }
                        if (!z8) {
                            na0.N(0, c0731Rg3, k36);
                        }
                    }
                }
                constraintLayout = (ConstraintLayout) k36.g;
                childCount = constraintLayout.getChildCount();
                while (i20 < childCount) {
                    constraintLayout.getChildAt(i20);
                }
                arrayList4 = constraintLayout.m;
                size4 = arrayList4.size();
                if (size4 > 0) {
                    while (i21 < size4) {
                        ((AbstractC0446Gg) arrayList4.get(i21)).getClass();
                    }
                }
            }
            na0.W(c0757Sg3);
            arrayList = (ArrayList) na0.m;
            size2 = arrayList.size();
            i12 = iQ2;
            i13 = i9;
            if (size > 0) {
                na0.R(c0757Sg3, 0, i12, i13);
            }
            if (size2 > 0) {
                iArr2 = c0757Sg3.p0;
                if (iArr2[0] == 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (iArr2[1] == 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                int iQ9 = c0757Sg.q();
                C0757Sg c0757Sg6 = (C0757Sg) na0.f414o;
                iMax3 = Math.max(iQ9, c0757Sg6.b0);
                iMax4 = Math.max(c0757Sg.k(), c0757Sg6.c0);
                i14 = 0;
                z6 = false;
                while (i14 < size2) {
                    c0731Rg2 = (C0731Rg) arrayList.get(i14);
                    if (c0731Rg2 instanceof C1636gw) {
                        k35 = k31;
                    } else {
                        iQ5 = c0731Rg2.q();
                        iK4 = c0731Rg2.k();
                        k35 = k31;
                        zN2 = z6 | na0.N(1, c0731Rg2, k35);
                        iQ6 = c0731Rg2.q();
                        iK5 = c0731Rg2.k();
                        if (iQ6 != iQ5) {
                            c0731Rg2.O(iQ6);
                            if (z4) {
                                iMax3 = Math.max(iMax3, c0731Rg2.i(4).e() + c0731Rg2.r() + c0731Rg2.U);
                            }
                            z7 = true;
                        } else {
                            z7 = zN2;
                        }
                        if (iK5 != iK4) {
                            c0731Rg2.L(iK5);
                            if (z5) {
                                iMax4 = Math.max(iMax4, c0731Rg2.i(5).e() + c0731Rg2.s() + c0731Rg2.V);
                            }
                            z7 = true;
                        }
                        z6 = ((C1636gw) c0731Rg2).y0 | z7;
                    }
                    i14++;
                    k31 = k35;
                    i11 = i11;
                }
                int i315 = i11;
                k32 = k31;
                i15 = 0;
                while (i15 < 2) {
                    i16 = 0;
                    while (i16 < size2) {
                        c0731Rg = (C0731Rg) arrayList.get(i16);
                        if (c0731Rg instanceof AbstractC2636rB) {
                            iQ3 = c0731Rg.q();
                            iK2 = c0731Rg.k();
                            arrayList3 = arrayList;
                            int i316 = c0731Rg.a0;
                            i18 = size2;
                            zN = na0.N(i15 == 1 ? 2 : 1, c0731Rg, k32) | z6;
                            iQ4 = c0731Rg.q();
                            k34 = k32;
                            iK3 = c0731Rg.k();
                            if (iQ4 != iQ3) {
                                c0731Rg.O(iQ4);
                                if (!z4) {
                                }
                                zN = true;
                            }
                            if (iK3 != iK2) {
                                c0731Rg.L(iK3);
                                if (!z5) {
                                }
                                zN = true;
                            }
                            if (c0731Rg.E) {
                                z6 = zN;
                            } else {
                                z6 = zN;
                            }
                        } else {
                            iQ3 = c0731Rg.q();
                            iK2 = c0731Rg.k();
                            arrayList3 = arrayList;
                            int i317 = c0731Rg.a0;
                            i18 = size2;
                            zN = na0.N(i15 == 1 ? 2 : 1, c0731Rg, k32) | z6;
                            iQ4 = c0731Rg.q();
                            k34 = k32;
                            iK3 = c0731Rg.k();
                            if (iQ4 != iQ3) {
                                c0731Rg.O(iQ4);
                                if (!z4) {
                                }
                                zN = true;
                            }
                            if (iK3 != iK2) {
                                c0731Rg.L(iK3);
                                if (!z5) {
                                }
                                zN = true;
                            }
                            if (c0731Rg.E) {
                                z6 = zN;
                            } else {
                                z6 = zN;
                            }
                        }
                        i16++;
                        arrayList = arrayList3;
                        size2 = i18;
                        k32 = k34;
                    }
                    k33 = k32;
                    arrayList2 = arrayList;
                    i17 = size2;
                    if (z6) {
                        break;
                        break;
                    }
                    i15++;
                    na0.R(c0757Sg, i15, i12, i13);
                    k32 = k33;
                    arrayList = arrayList2;
                    size2 = i17;
                    z6 = false;
                }
                c0757Sg3 = c0757Sg;
                i11 = i315;
            }
            c0757Sg3.D0 = i11;
            C2742sK.p = c0757Sg3.W(512);
            iMin2 = iMax2;
            i4 = 2;
            iQ = c0757Sg.q();
            c2298nm = c0757Sg3.s0;
            i5 = iMin;
            if (i5 == iQ) {
                c2298nm.c = true;
            } else {
                c2298nm.c = true;
            }
            c0757Sg3.Y = 0;
            c0757Sg3.Z = 0;
            int i318 = this.q - i35;
            iArr = c0757Sg3.C;
            iArr[0] = i318;
            iArr[1] = this.r - i34;
            c0757Sg3.b0 = 0;
            c0757Sg3.c0 = 0;
            c0757Sg3.M(i31);
            c0757Sg3.O(i5);
            c0757Sg3.N(i4);
            c0757Sg3.L(iMin2);
            i6 = this.f13o - i35;
            if (i6 < 0) {
                c0757Sg3.b0 = 0;
            } else {
                c0757Sg3.b0 = i6;
            }
            i7 = this.p - i34;
            if (i7 < 0) {
                c0757Sg3.c0 = 0;
            } else {
                c0757Sg3.c0 = i7;
            }
            c0757Sg3.x0 = iMax7;
            c0757Sg3.y0 = iMax5;
            na0 = c0757Sg3.r0;
            na0.getClass();
            k30 = c0757Sg3.u0;
            size = c0757Sg3.q0.size();
            iQ2 = c0757Sg.q();
            iK = c0757Sg.k();
            zS = zy0.s(i, 128);
            if (zS) {
                z = true;
            } else {
                z = true;
            }
            if (z) {
                i29 = 0;
                while (true) {
                    if (i29 < size) {
                        c0731Rg4 = (C0731Rg) c0757Sg3.q0.get(i29);
                        iArr4 = c0731Rg4.p0;
                        if (iArr4[0] == 3) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (iArr4[1] == 3) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (z14) {
                            z16 = false;
                        } else {
                            z16 = false;
                        }
                        if (!c0731Rg4.x()) {
                        }
                        i8 = 1073741824;
                        z = false;
                    } else {
                        i8 = 1073741824;
                    }
                }
            } else {
                i8 = 1073741824;
            }
            z2 = ((mode != i8 && mode2 == i8) || zS) & z;
            if (z2) {
                iMin3 = Math.min(iArr[0], i32);
                iMin4 = Math.min(iArr[1], i33);
                if (mode == 1073741824) {
                    c0757Sg3.O(iMin3);
                    c0757Sg3.s0.b = true;
                }
                if (mode2 == 1073741824) {
                    c0757Sg3.L(iMin4);
                    c0757Sg3.s0.b = true;
                }
                if (mode == 1073741824) {
                    z3 = z2;
                    k31 = k30;
                    iQ2 = iQ2;
                    i9 = iK;
                    z9 = c2298nm.b;
                    c0757Sg2 = c2298nm.a;
                    if (z9) {
                        while (r0.hasNext()) {
                            c0731Rg5.h();
                            c0731Rg5.a = false;
                            TC tc14 = c0731Rg5.d;
                            tc14.e.j = false;
                            tc14.g = false;
                            tc14.n();
                            As0 as13 = c0731Rg5.e;
                            as13.e.j = false;
                            as13.g = false;
                            as13.m();
                        }
                        i22 = 0;
                        c0757Sg2.h();
                        c0757Sg2.a = false;
                        TC tc15 = c0757Sg2.d;
                        tc15.e.j = false;
                        tc15.g = false;
                        tc15.n();
                        As0 as14 = c0757Sg2.e;
                        as14.e.j = false;
                        as14.g = false;
                        as14.m();
                        c2298nm.c();
                    } else {
                        i22 = 0;
                    }
                    c2298nm.b(c2298nm.d);
                    c0757Sg2.Y = i22;
                    c0757Sg2.Z = i22;
                    c0757Sg2.d.h.d(i22);
                    c0757Sg2.e.h.d(i22);
                    i23 = 1073741824;
                    if (mode == 1073741824) {
                        i24 = 1;
                        zT2 = c0757Sg3.T(i22, zS) & true;
                        i10 = 1;
                    } else {
                        i24 = 1;
                        i10 = 0;
                        zT2 = true;
                    }
                    if (mode2 == 1073741824) {
                        zT = zT2 & c0757Sg3.T(i24, zS);
                        i10++;
                    } else {
                        zT = zT2;
                    }
                } else {
                    z3 = z2;
                    k31 = k30;
                    iQ2 = iQ2;
                    i9 = iK;
                    z9 = c2298nm.b;
                    c0757Sg2 = c2298nm.a;
                    if (z9) {
                        while (r0.hasNext()) {
                            c0731Rg5.h();
                            c0731Rg5.a = false;
                            TC tc16 = c0731Rg5.d;
                            tc16.e.j = false;
                            tc16.g = false;
                            tc16.n();
                            As0 as15 = c0731Rg5.e;
                            as15.e.j = false;
                            as15.g = false;
                            as15.m();
                        }
                        i22 = 0;
                        c0757Sg2.h();
                        c0757Sg2.a = false;
                        TC tc17 = c0757Sg2.d;
                        tc17.e.j = false;
                        tc17.g = false;
                        tc17.n();
                        As0 as16 = c0757Sg2.e;
                        as16.e.j = false;
                        as16.g = false;
                        as16.m();
                        c2298nm.c();
                    } else {
                        i22 = 0;
                    }
                    c2298nm.b(c2298nm.d);
                    c0757Sg2.Y = i22;
                    c0757Sg2.Z = i22;
                    c0757Sg2.d.h.d(i22);
                    c0757Sg2.e.h.d(i22);
                    i23 = 1073741824;
                    if (mode == 1073741824) {
                        i24 = 1;
                        zT2 = c0757Sg3.T(i22, zS) & true;
                        i10 = 1;
                    } else {
                        i24 = 1;
                        i10 = 0;
                        zT2 = true;
                    }
                    if (mode2 == 1073741824) {
                        zT = zT2 & c0757Sg3.T(i24, zS);
                        i10++;
                    } else {
                        zT = zT2;
                    }
                }
                if (zT) {
                    if (mode == i23) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (mode2 == i23) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    c0757Sg3.P(z10, z11);
                }
            } else {
                z3 = z2;
                k31 = k30;
                iQ2 = iQ2;
                i9 = iK;
                i10 = 0;
                zT = false;
            }
            if (zT) {
            }
            i11 = c0757Sg3.D0;
            if (size > 0) {
                size3 = c0757Sg3.q0.size();
                boolean zW4 = c0757Sg3.W(64);
                k36 = c0757Sg3.u0;
                while (i19 < size3) {
                    c0731Rg3 = (C0731Rg) c0757Sg3.q0.get(i19);
                    if (!(c0731Rg3 instanceof HA)) {
                        iJ = c0731Rg3.j(0);
                        int iJ5 = c0731Rg3.j(1);
                        if (iJ == 3) {
                            z8 = false;
                        } else {
                            z8 = false;
                        }
                        if (z8) {
                        }
                        if (!z8) {
                            na0.N(0, c0731Rg3, k36);
                        }
                    }
                }
                constraintLayout = (ConstraintLayout) k36.g;
                childCount = constraintLayout.getChildCount();
                while (i20 < childCount) {
                    constraintLayout.getChildAt(i20);
                }
                arrayList4 = constraintLayout.m;
                size4 = arrayList4.size();
                if (size4 > 0) {
                    while (i21 < size4) {
                        ((AbstractC0446Gg) arrayList4.get(i21)).getClass();
                    }
                }
            }
            na0.W(c0757Sg3);
            arrayList = (ArrayList) na0.m;
            size2 = arrayList.size();
            i12 = iQ2;
            i13 = i9;
            if (size > 0) {
                na0.R(c0757Sg3, 0, i12, i13);
            }
            if (size2 > 0) {
                iArr2 = c0757Sg3.p0;
                if (iArr2[0] == 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (iArr2[1] == 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                int iQ10 = c0757Sg.q();
                C0757Sg c0757Sg7 = (C0757Sg) na0.f414o;
                iMax3 = Math.max(iQ10, c0757Sg7.b0);
                iMax4 = Math.max(c0757Sg.k(), c0757Sg7.c0);
                i14 = 0;
                z6 = false;
                while (i14 < size2) {
                    c0731Rg2 = (C0731Rg) arrayList.get(i14);
                    if (c0731Rg2 instanceof C1636gw) {
                        k35 = k31;
                    } else {
                        iQ5 = c0731Rg2.q();
                        iK4 = c0731Rg2.k();
                        k35 = k31;
                        zN2 = z6 | na0.N(1, c0731Rg2, k35);
                        iQ6 = c0731Rg2.q();
                        iK5 = c0731Rg2.k();
                        if (iQ6 != iQ5) {
                            c0731Rg2.O(iQ6);
                            if (z4) {
                                iMax3 = Math.max(iMax3, c0731Rg2.i(4).e() + c0731Rg2.r() + c0731Rg2.U);
                            }
                            z7 = true;
                        } else {
                            z7 = zN2;
                        }
                        if (iK5 != iK4) {
                            c0731Rg2.L(iK5);
                            if (z5) {
                                iMax4 = Math.max(iMax4, c0731Rg2.i(5).e() + c0731Rg2.s() + c0731Rg2.V);
                            }
                            z7 = true;
                        }
                        z6 = ((C1636gw) c0731Rg2).y0 | z7;
                    }
                    i14++;
                    k31 = k35;
                    i11 = i11;
                }
                int i319 = i11;
                k32 = k31;
                i15 = 0;
                while (i15 < 2) {
                    i16 = 0;
                    while (i16 < size2) {
                        c0731Rg = (C0731Rg) arrayList.get(i16);
                        if (c0731Rg instanceof AbstractC2636rB) {
                            iQ3 = c0731Rg.q();
                            iK2 = c0731Rg.k();
                            arrayList3 = arrayList;
                            int i3110 = c0731Rg.a0;
                            i18 = size2;
                            zN = na0.N(i15 == 1 ? 2 : 1, c0731Rg, k32) | z6;
                            iQ4 = c0731Rg.q();
                            k34 = k32;
                            iK3 = c0731Rg.k();
                            if (iQ4 != iQ3) {
                                c0731Rg.O(iQ4);
                                if (!z4) {
                                }
                                zN = true;
                            }
                            if (iK3 != iK2) {
                                c0731Rg.L(iK3);
                                if (!z5) {
                                }
                                zN = true;
                            }
                            if (c0731Rg.E) {
                                z6 = zN;
                            } else {
                                z6 = zN;
                            }
                        } else {
                            iQ3 = c0731Rg.q();
                            iK2 = c0731Rg.k();
                            arrayList3 = arrayList;
                            int i3111 = c0731Rg.a0;
                            i18 = size2;
                            zN = na0.N(i15 == 1 ? 2 : 1, c0731Rg, k32) | z6;
                            iQ4 = c0731Rg.q();
                            k34 = k32;
                            iK3 = c0731Rg.k();
                            if (iQ4 != iQ3) {
                                c0731Rg.O(iQ4);
                                if (!z4) {
                                }
                                zN = true;
                            }
                            if (iK3 != iK2) {
                                c0731Rg.L(iK3);
                                if (!z5) {
                                }
                                zN = true;
                            }
                            if (c0731Rg.E) {
                                z6 = zN;
                            } else {
                                z6 = zN;
                            }
                        }
                        i16++;
                        arrayList = arrayList3;
                        size2 = i18;
                        k32 = k34;
                    }
                    k33 = k32;
                    arrayList2 = arrayList;
                    i17 = size2;
                    if (z6) {
                        break;
                        break;
                    }
                    i15++;
                    na0.R(c0757Sg, i15, i12, i13);
                    k32 = k33;
                    arrayList = arrayList2;
                    size2 = i17;
                    z6 = false;
                }
                c0757Sg3 = c0757Sg;
                i11 = i319;
            }
            c0757Sg3.D0 = i11;
            C2742sK.p = c0757Sg3.W(512);
        }
        if (mode != 0) {
            if (mode == 1073741824) {
                iMin = Math.min(this.q - i35, i32);
                i31 = 1;
            }
            if (mode2 != Integer.MIN_VALUE) {
                if (childCount2 == 0) {
                    iMax2 = Math.max(0, this.p);
                } else {
                    iMin2 = i33;
                }
                i4 = 2;
                iQ = c0757Sg.q();
                c2298nm = c0757Sg3.s0;
                i5 = iMin;
                if (i5 == iQ) {
                    c2298nm.c = true;
                } else {
                    c2298nm.c = true;
                }
                c0757Sg3.Y = 0;
                c0757Sg3.Z = 0;
                int i3112 = this.q - i35;
                iArr = c0757Sg3.C;
                iArr[0] = i3112;
                iArr[1] = this.r - i34;
                c0757Sg3.b0 = 0;
                c0757Sg3.c0 = 0;
                c0757Sg3.M(i31);
                c0757Sg3.O(i5);
                c0757Sg3.N(i4);
                c0757Sg3.L(iMin2);
                i6 = this.f13o - i35;
                if (i6 < 0) {
                    c0757Sg3.b0 = 0;
                } else {
                    c0757Sg3.b0 = i6;
                }
                i7 = this.p - i34;
                if (i7 < 0) {
                    c0757Sg3.c0 = 0;
                } else {
                    c0757Sg3.c0 = i7;
                }
                c0757Sg3.x0 = iMax7;
                c0757Sg3.y0 = iMax5;
                na0 = c0757Sg3.r0;
                na0.getClass();
                k30 = c0757Sg3.u0;
                size = c0757Sg3.q0.size();
                iQ2 = c0757Sg.q();
                iK = c0757Sg.k();
                zS = zy0.s(i, 128);
                if (zS) {
                    z = true;
                } else {
                    z = true;
                }
                if (z) {
                    i29 = 0;
                    while (true) {
                        if (i29 < size) {
                            c0731Rg4 = (C0731Rg) c0757Sg3.q0.get(i29);
                            iArr4 = c0731Rg4.p0;
                            if (iArr4[0] == 3) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (iArr4[1] == 3) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (z14) {
                                z16 = false;
                            } else {
                                z16 = false;
                            }
                            if (!c0731Rg4.x()) {
                            }
                            i8 = 1073741824;
                            z = false;
                        } else {
                            i8 = 1073741824;
                        }
                    }
                } else {
                    i8 = 1073741824;
                }
                z2 = ((mode != i8 && mode2 == i8) || zS) & z;
                if (z2) {
                    iMin3 = Math.min(iArr[0], i32);
                    iMin4 = Math.min(iArr[1], i33);
                    if (mode == 1073741824) {
                        c0757Sg3.O(iMin3);
                        c0757Sg3.s0.b = true;
                    }
                    if (mode2 == 1073741824) {
                        c0757Sg3.L(iMin4);
                        c0757Sg3.s0.b = true;
                    }
                    if (mode == 1073741824) {
                        z3 = z2;
                        k31 = k30;
                        iQ2 = iQ2;
                        i9 = iK;
                        z9 = c2298nm.b;
                        c0757Sg2 = c2298nm.a;
                        if (z9) {
                            while (r0.hasNext()) {
                                c0731Rg5.h();
                                c0731Rg5.a = false;
                                TC tc18 = c0731Rg5.d;
                                tc18.e.j = false;
                                tc18.g = false;
                                tc18.n();
                                As0 as17 = c0731Rg5.e;
                                as17.e.j = false;
                                as17.g = false;
                                as17.m();
                            }
                            i22 = 0;
                            c0757Sg2.h();
                            c0757Sg2.a = false;
                            TC tc19 = c0757Sg2.d;
                            tc19.e.j = false;
                            tc19.g = false;
                            tc19.n();
                            As0 as18 = c0757Sg2.e;
                            as18.e.j = false;
                            as18.g = false;
                            as18.m();
                            c2298nm.c();
                        } else {
                            i22 = 0;
                        }
                        c2298nm.b(c2298nm.d);
                        c0757Sg2.Y = i22;
                        c0757Sg2.Z = i22;
                        c0757Sg2.d.h.d(i22);
                        c0757Sg2.e.h.d(i22);
                        i23 = 1073741824;
                        if (mode == 1073741824) {
                            i24 = 1;
                            zT2 = c0757Sg3.T(i22, zS) & true;
                            i10 = 1;
                        } else {
                            i24 = 1;
                            i10 = 0;
                            zT2 = true;
                        }
                        if (mode2 == 1073741824) {
                            zT = zT2 & c0757Sg3.T(i24, zS);
                            i10++;
                        } else {
                            zT = zT2;
                        }
                    } else {
                        z3 = z2;
                        k31 = k30;
                        iQ2 = iQ2;
                        i9 = iK;
                        z9 = c2298nm.b;
                        c0757Sg2 = c2298nm.a;
                        if (z9) {
                            while (r0.hasNext()) {
                                c0731Rg5.h();
                                c0731Rg5.a = false;
                                TC tc110 = c0731Rg5.d;
                                tc110.e.j = false;
                                tc110.g = false;
                                tc110.n();
                                As0 as19 = c0731Rg5.e;
                                as19.e.j = false;
                                as19.g = false;
                                as19.m();
                            }
                            i22 = 0;
                            c0757Sg2.h();
                            c0757Sg2.a = false;
                            TC tc111 = c0757Sg2.d;
                            tc111.e.j = false;
                            tc111.g = false;
                            tc111.n();
                            As0 as110 = c0757Sg2.e;
                            as110.e.j = false;
                            as110.g = false;
                            as110.m();
                            c2298nm.c();
                        } else {
                            i22 = 0;
                        }
                        c2298nm.b(c2298nm.d);
                        c0757Sg2.Y = i22;
                        c0757Sg2.Z = i22;
                        c0757Sg2.d.h.d(i22);
                        c0757Sg2.e.h.d(i22);
                        i23 = 1073741824;
                        if (mode == 1073741824) {
                            i24 = 1;
                            zT2 = c0757Sg3.T(i22, zS) & true;
                            i10 = 1;
                        } else {
                            i24 = 1;
                            i10 = 0;
                            zT2 = true;
                        }
                        if (mode2 == 1073741824) {
                            zT = zT2 & c0757Sg3.T(i24, zS);
                            i10++;
                        } else {
                            zT = zT2;
                        }
                    }
                    if (zT) {
                        if (mode == i23) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (mode2 == i23) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        c0757Sg3.P(z10, z11);
                    }
                } else {
                    z3 = z2;
                    k31 = k30;
                    iQ2 = iQ2;
                    i9 = iK;
                    i10 = 0;
                    zT = false;
                }
                if (zT) {
                }
                i11 = c0757Sg3.D0;
                if (size > 0) {
                    size3 = c0757Sg3.q0.size();
                    boolean zW5 = c0757Sg3.W(64);
                    k36 = c0757Sg3.u0;
                    while (i19 < size3) {
                        c0731Rg3 = (C0731Rg) c0757Sg3.q0.get(i19);
                        if (!(c0731Rg3 instanceof HA)) {
                            iJ = c0731Rg3.j(0);
                            int iJ6 = c0731Rg3.j(1);
                            if (iJ == 3) {
                                z8 = false;
                            } else {
                                z8 = false;
                            }
                            if (z8) {
                            }
                            if (!z8) {
                                na0.N(0, c0731Rg3, k36);
                            }
                        }
                    }
                    constraintLayout = (ConstraintLayout) k36.g;
                    childCount = constraintLayout.getChildCount();
                    while (i20 < childCount) {
                        constraintLayout.getChildAt(i20);
                    }
                    arrayList4 = constraintLayout.m;
                    size4 = arrayList4.size();
                    if (size4 > 0) {
                        while (i21 < size4) {
                            ((AbstractC0446Gg) arrayList4.get(i21)).getClass();
                        }
                    }
                }
                na0.W(c0757Sg3);
                arrayList = (ArrayList) na0.m;
                size2 = arrayList.size();
                i12 = iQ2;
                i13 = i9;
                if (size > 0) {
                    na0.R(c0757Sg3, 0, i12, i13);
                }
                if (size2 > 0) {
                    iArr2 = c0757Sg3.p0;
                    if (iArr2[0] == 2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (iArr2[1] == 2) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    int iQ11 = c0757Sg.q();
                    C0757Sg c0757Sg8 = (C0757Sg) na0.f414o;
                    iMax3 = Math.max(iQ11, c0757Sg8.b0);
                    iMax4 = Math.max(c0757Sg.k(), c0757Sg8.c0);
                    i14 = 0;
                    z6 = false;
                    while (i14 < size2) {
                        c0731Rg2 = (C0731Rg) arrayList.get(i14);
                        if (c0731Rg2 instanceof C1636gw) {
                            k35 = k31;
                        } else {
                            iQ5 = c0731Rg2.q();
                            iK4 = c0731Rg2.k();
                            k35 = k31;
                            zN2 = z6 | na0.N(1, c0731Rg2, k35);
                            iQ6 = c0731Rg2.q();
                            iK5 = c0731Rg2.k();
                            if (iQ6 != iQ5) {
                                c0731Rg2.O(iQ6);
                                if (z4) {
                                    iMax3 = Math.max(iMax3, c0731Rg2.i(4).e() + c0731Rg2.r() + c0731Rg2.U);
                                }
                                z7 = true;
                            } else {
                                z7 = zN2;
                            }
                            if (iK5 != iK4) {
                                c0731Rg2.L(iK5);
                                if (z5) {
                                    iMax4 = Math.max(iMax4, c0731Rg2.i(5).e() + c0731Rg2.s() + c0731Rg2.V);
                                }
                                z7 = true;
                            }
                            z6 = ((C1636gw) c0731Rg2).y0 | z7;
                        }
                        i14++;
                        k31 = k35;
                        i11 = i11;
                    }
                    int i3113 = i11;
                    k32 = k31;
                    i15 = 0;
                    while (i15 < 2) {
                        i16 = 0;
                        while (i16 < size2) {
                            c0731Rg = (C0731Rg) arrayList.get(i16);
                            if (c0731Rg instanceof AbstractC2636rB) {
                                iQ3 = c0731Rg.q();
                                iK2 = c0731Rg.k();
                                arrayList3 = arrayList;
                                int i3114 = c0731Rg.a0;
                                i18 = size2;
                                zN = na0.N(i15 == 1 ? 2 : 1, c0731Rg, k32) | z6;
                                iQ4 = c0731Rg.q();
                                k34 = k32;
                                iK3 = c0731Rg.k();
                                if (iQ4 != iQ3) {
                                    c0731Rg.O(iQ4);
                                    if (!z4) {
                                    }
                                    zN = true;
                                }
                                if (iK3 != iK2) {
                                    c0731Rg.L(iK3);
                                    if (!z5) {
                                    }
                                    zN = true;
                                }
                                if (c0731Rg.E) {
                                    z6 = zN;
                                } else {
                                    z6 = zN;
                                }
                            } else {
                                iQ3 = c0731Rg.q();
                                iK2 = c0731Rg.k();
                                arrayList3 = arrayList;
                                int i3115 = c0731Rg.a0;
                                i18 = size2;
                                zN = na0.N(i15 == 1 ? 2 : 1, c0731Rg, k32) | z6;
                                iQ4 = c0731Rg.q();
                                k34 = k32;
                                iK3 = c0731Rg.k();
                                if (iQ4 != iQ3) {
                                    c0731Rg.O(iQ4);
                                    if (!z4) {
                                    }
                                    zN = true;
                                }
                                if (iK3 != iK2) {
                                    c0731Rg.L(iK3);
                                    if (!z5) {
                                    }
                                    zN = true;
                                }
                                if (c0731Rg.E) {
                                    z6 = zN;
                                } else {
                                    z6 = zN;
                                }
                            }
                            i16++;
                            arrayList = arrayList3;
                            size2 = i18;
                            k32 = k34;
                        }
                        k33 = k32;
                        arrayList2 = arrayList;
                        i17 = size2;
                        if (z6) {
                            break;
                            break;
                        }
                        i15++;
                        na0.R(c0757Sg, i15, i12, i13);
                        k32 = k33;
                        arrayList = arrayList2;
                        size2 = i17;
                        z6 = false;
                    }
                    c0757Sg3 = c0757Sg;
                    i11 = i3113;
                }
                c0757Sg3.D0 = i11;
                C2742sK.p = c0757Sg3.W(512);
            }
            if (mode2 != 0) {
                if (mode2 != 1073741824) {
                    i4 = 1;
                } else {
                    iMin2 = Math.min(this.r - i34, i33);
                    i4 = 1;
                }
                iQ = c0757Sg.q();
                c2298nm = c0757Sg3.s0;
                i5 = iMin;
                if (i5 == iQ || iMin2 != c0757Sg.k()) {
                    c2298nm.c = true;
                }
                c0757Sg3.Y = 0;
                c0757Sg3.Z = 0;
                int i3116 = this.q - i35;
                iArr = c0757Sg3.C;
                iArr[0] = i3116;
                iArr[1] = this.r - i34;
                c0757Sg3.b0 = 0;
                c0757Sg3.c0 = 0;
                c0757Sg3.M(i31);
                c0757Sg3.O(i5);
                c0757Sg3.N(i4);
                c0757Sg3.L(iMin2);
                i6 = this.f13o - i35;
                if (i6 < 0) {
                    c0757Sg3.b0 = 0;
                } else {
                    c0757Sg3.b0 = i6;
                }
                i7 = this.p - i34;
                if (i7 < 0) {
                    c0757Sg3.c0 = 0;
                } else {
                    c0757Sg3.c0 = i7;
                }
                c0757Sg3.x0 = iMax7;
                c0757Sg3.y0 = iMax5;
                na0 = c0757Sg3.r0;
                na0.getClass();
                k30 = c0757Sg3.u0;
                size = c0757Sg3.q0.size();
                iQ2 = c0757Sg.q();
                iK = c0757Sg.k();
                zS = zy0.s(i, 128);
                if (zS || zy0.s(i, 64)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i29 = 0;
                    while (true) {
                        if (i29 < size) {
                            c0731Rg4 = (C0731Rg) c0757Sg3.q0.get(i29);
                            iArr4 = c0731Rg4.p0;
                            if (iArr4[0] == 3) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (iArr4[1] == 3) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (z14 || !z15 || c0731Rg4.W <= 0.0f) {
                                z16 = false;
                            } else {
                                z16 = true;
                            }
                            if ((!c0731Rg4.x() && z16) || ((c0731Rg4.y() && z16) || (c0731Rg4 instanceof C1636gw) || c0731Rg4.x() || c0731Rg4.y())) {
                                i8 = 1073741824;
                                z = false;
                            }
                        } else {
                            i8 = 1073741824;
                        }
                    }
                } else {
                    i8 = 1073741824;
                }
                z2 = ((mode != i8 && mode2 == i8) || zS) & z;
                if (z2) {
                    iMin3 = Math.min(iArr[0], i32);
                    iMin4 = Math.min(iArr[1], i33);
                    if (mode == 1073741824 && c0757Sg.q() != iMin3) {
                        c0757Sg3.O(iMin3);
                        c0757Sg3.s0.b = true;
                    }
                    if (mode2 == 1073741824 && c0757Sg.k() != iMin4) {
                        c0757Sg3.L(iMin4);
                        c0757Sg3.s0.b = true;
                    }
                    if (mode == 1073741824 || mode2 != 1073741824) {
                        z3 = z2;
                        k31 = k30;
                        iQ2 = iQ2;
                        i9 = iK;
                        z9 = c2298nm.b;
                        c0757Sg2 = c2298nm.a;
                        if (z9) {
                            while (r0.hasNext()) {
                                c0731Rg5.h();
                                c0731Rg5.a = false;
                                TC tc112 = c0731Rg5.d;
                                tc112.e.j = false;
                                tc112.g = false;
                                tc112.n();
                                As0 as111 = c0731Rg5.e;
                                as111.e.j = false;
                                as111.g = false;
                                as111.m();
                            }
                            i22 = 0;
                            c0757Sg2.h();
                            c0757Sg2.a = false;
                            TC tc113 = c0757Sg2.d;
                            tc113.e.j = false;
                            tc113.g = false;
                            tc113.n();
                            As0 as112 = c0757Sg2.e;
                            as112.e.j = false;
                            as112.g = false;
                            as112.m();
                            c2298nm.c();
                        } else {
                            i22 = 0;
                        }
                        c2298nm.b(c2298nm.d);
                        c0757Sg2.Y = i22;
                        c0757Sg2.Z = i22;
                        c0757Sg2.d.h.d(i22);
                        c0757Sg2.e.h.d(i22);
                        i23 = 1073741824;
                        if (mode == 1073741824) {
                            i24 = 1;
                            zT2 = c0757Sg3.T(i22, zS) & true;
                            i10 = 1;
                        } else {
                            i24 = 1;
                            i10 = 0;
                            zT2 = true;
                        }
                        if (mode2 == 1073741824) {
                            zT = zT2 & c0757Sg3.T(i24, zS);
                            i10++;
                        } else {
                            zT = zT2;
                        }
                    } else {
                        boolean z17 = zS & true;
                        boolean z18 = c2298nm.b;
                        C0757Sg c0757Sg9 = c2298nm.a;
                        if (z18 || c2298nm.c) {
                            for (C0731Rg c0731Rg6 : c0757Sg9.q0) {
                                c0731Rg6.h();
                                c0731Rg6.a = false;
                                c0731Rg6.d.n();
                                c0731Rg6.e.m();
                            }
                            i25 = 0;
                            c0757Sg9.h();
                            c0757Sg9.a = false;
                            c0757Sg9.d.n();
                            c0757Sg9.e.m();
                            c2298nm.c = false;
                        } else {
                            i25 = 0;
                        }
                        c2298nm.b(c2298nm.d);
                        c0757Sg9.Y = i25;
                        c0757Sg9.Z = i25;
                        int iJ7 = c0757Sg9.j(i25);
                        int iJ8 = c0757Sg9.j(1);
                        if (c2298nm.b) {
                            c2298nm.c();
                        }
                        int iR = c0757Sg9.r();
                        int iS = c0757Sg9.s();
                        z3 = z2;
                        c0757Sg9.d.h.d(iR);
                        c0757Sg9.e.h.d(iS);
                        c2298nm.g();
                        ArrayList<AbstractC1637gw0> arrayList5 = c2298nm.e;
                        k31 = k30;
                        if (iJ7 == 2 || iJ8 == 2) {
                            if (z17) {
                                Iterator it2 = arrayList5.iterator();
                                while (it2.hasNext()) {
                                    if (!((AbstractC1637gw0) it2.next()).k()) {
                                        z17 = false;
                                        break;
                                    }
                                }
                            }
                            if (z17 && iJ7 == 2) {
                                c0757Sg9.M(1);
                                c0757Sg9.O(c2298nm.d(c0757Sg9, 0));
                                c0757Sg9.d.e.d(c0757Sg9.q());
                            }
                            if (z17 && iJ8 == 2) {
                                i26 = 1;
                                c0757Sg9.N(1);
                                c0757Sg9.L(c2298nm.d(c0757Sg9, 1));
                                c0757Sg9.e.e.d(c0757Sg9.k());
                            }
                            iArr3 = c0757Sg9.p0;
                            i9 = iK;
                            i27 = iArr3[0];
                            if (i27 != i26 || i27 == 4) {
                                int iQ12 = c0757Sg9.q() + iR;
                                c0757Sg9.d.i.d(iQ12);
                                c0757Sg9.d.e.d(iQ12 - iR);
                                c2298nm.g();
                                i28 = iArr3[1];
                                if (i28 != 1 || i28 == 4) {
                                    int iK6 = c0757Sg9.k() + iS;
                                    c0757Sg9.e.i.d(iK6);
                                    c0757Sg9.e.e.d(iK6 - iS);
                                }
                                c2298nm.g();
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            for (AbstractC1637gw0 abstractC1637gw1 : arrayList5) {
                                if (abstractC1637gw1.b == c0757Sg9 || abstractC1637gw1.g) {
                                    abstractC1637gw1.e();
                                }
                            }
                            it = arrayList5.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    z13 = true;
                                    break;
                                }
                                abstractC1637gw0 = (AbstractC1637gw0) it.next();
                                if (!z12 || abstractC1637gw0.b != c0757Sg9) {
                                    if (abstractC1637gw0.h.j || ((!abstractC1637gw0.i.j && !(abstractC1637gw0 instanceof IA)) || (!abstractC1637gw0.e.j && !(abstractC1637gw0 instanceof C3344yc) && !(abstractC1637gw0 instanceof IA)))) {
                                        z13 = false;
                                        break;
                                    }
                                }
                            }
                            c0757Sg9.M(iJ7);
                            c0757Sg9.N(iJ8);
                            zT = z13;
                            i23 = 1073741824;
                            i10 = 2;
                        } else {
                            iQ2 = iQ2;
                        }
                        i26 = 1;
                        iArr3 = c0757Sg9.p0;
                        i9 = iK;
                        i27 = iArr3[0];
                        if (i27 != i26) {
                            int iQ13 = c0757Sg9.q() + iR;
                            c0757Sg9.d.i.d(iQ13);
                            c0757Sg9.d.e.d(iQ13 - iR);
                            c2298nm.g();
                            i28 = iArr3[1];
                            if (i28 != 1) {
                                int iK7 = c0757Sg9.k() + iS;
                                c0757Sg9.e.i.d(iK7);
                                c0757Sg9.e.e.d(iK7 - iS);
                            } else {
                                int iK8 = c0757Sg9.k() + iS;
                                c0757Sg9.e.i.d(iK8);
                                c0757Sg9.e.e.d(iK8 - iS);
                            }
                            c2298nm.g();
                            z12 = true;
                        } else {
                            int iQ14 = c0757Sg9.q() + iR;
                            c0757Sg9.d.i.d(iQ14);
                            c0757Sg9.d.e.d(iQ14 - iR);
                            c2298nm.g();
                            i28 = iArr3[1];
                            if (i28 != 1) {
                                int iK9 = c0757Sg9.k() + iS;
                                c0757Sg9.e.i.d(iK9);
                                c0757Sg9.e.e.d(iK9 - iS);
                            } else {
                                int iK10 = c0757Sg9.k() + iS;
                                c0757Sg9.e.i.d(iK10);
                                c0757Sg9.e.e.d(iK10 - iS);
                            }
                            c2298nm.g();
                            z12 = true;
                        }
                        while (r8.hasNext()) {
                            if (abstractC1637gw1.b == c0757Sg9) {
                            }
                            abstractC1637gw1.e();
                        }
                        it = arrayList5.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                z13 = true;
                                break;
                            }
                            abstractC1637gw0 = (AbstractC1637gw0) it.next();
                            if (!z12) {
                            }
                            if (abstractC1637gw0.h.j) {
                            }
                            z13 = false;
                            break;
                        }
                        c0757Sg9.M(iJ7);
                        c0757Sg9.N(iJ8);
                        zT = z13;
                        i23 = 1073741824;
                        i10 = 2;
                    }
                    if (zT) {
                        if (mode == i23) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (mode2 == i23) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        c0757Sg3.P(z10, z11);
                    }
                } else {
                    z3 = z2;
                    k31 = k30;
                    iQ2 = iQ2;
                    i9 = iK;
                    i10 = 0;
                    zT = false;
                }
                if (zT || i10 != 2) {
                    i11 = c0757Sg3.D0;
                    if (size > 0) {
                        size3 = c0757Sg3.q0.size();
                        boolean zW6 = c0757Sg3.W(64);
                        k36 = c0757Sg3.u0;
                        while (i19 < size3) {
                            c0731Rg3 = (C0731Rg) c0757Sg3.q0.get(i19);
                            if (!(c0731Rg3 instanceof HA) && !(c0731Rg3 instanceof O7) && !c0731Rg3.F && (!zW6 || (tc = c0731Rg3.d) == null || (as0 = c0731Rg3.e) == null || !tc.e.j || !as0.e.j)) {
                                iJ = c0731Rg3.j(0);
                                int iJ9 = c0731Rg3.j(1);
                                if (iJ == 3 || c0731Rg3.r == 1 || iJ9 != 3 || c0731Rg3.s == 1) {
                                    z8 = false;
                                } else {
                                    z8 = true;
                                }
                                if (z8 && c0757Sg3.W(1) && !(c0731Rg3 instanceof C1636gw)) {
                                    if (iJ == 3 && c0731Rg3.r == 0 && iJ9 != 3 && !c0731Rg3.x()) {
                                        z8 = true;
                                    }
                                    if (iJ9 == 3 && c0731Rg3.s == 0 && iJ != 3 && !c0731Rg3.x()) {
                                        z8 = true;
                                    }
                                    if (iJ == 3 || iJ9 == 3) {
                                        if (c0731Rg3.W > 0.0f) {
                                            z8 = true;
                                        }
                                    }
                                    if (!z8) {
                                        na0.N(0, c0731Rg3, k36);
                                    }
                                }
                                if (!z8) {
                                    na0.N(0, c0731Rg3, k36);
                                }
                            }
                        }
                        constraintLayout = (ConstraintLayout) k36.g;
                        childCount = constraintLayout.getChildCount();
                        while (i20 < childCount) {
                            constraintLayout.getChildAt(i20);
                        }
                        arrayList4 = constraintLayout.m;
                        size4 = arrayList4.size();
                        if (size4 > 0) {
                            while (i21 < size4) {
                                ((AbstractC0446Gg) arrayList4.get(i21)).getClass();
                            }
                        }
                    }
                    na0.W(c0757Sg3);
                    arrayList = (ArrayList) na0.m;
                    size2 = arrayList.size();
                    i12 = iQ2;
                    i13 = i9;
                    if (size > 0) {
                        na0.R(c0757Sg3, 0, i12, i13);
                    }
                    if (size2 > 0) {
                        iArr2 = c0757Sg3.p0;
                        if (iArr2[0] == 2) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (iArr2[1] == 2) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        int iQ15 = c0757Sg.q();
                        C0757Sg c0757Sg10 = (C0757Sg) na0.f414o;
                        iMax3 = Math.max(iQ15, c0757Sg10.b0);
                        iMax4 = Math.max(c0757Sg.k(), c0757Sg10.c0);
                        i14 = 0;
                        z6 = false;
                        while (i14 < size2) {
                            c0731Rg2 = (C0731Rg) arrayList.get(i14);
                            if (c0731Rg2 instanceof C1636gw) {
                                k35 = k31;
                            } else {
                                iQ5 = c0731Rg2.q();
                                iK4 = c0731Rg2.k();
                                k35 = k31;
                                zN2 = z6 | na0.N(1, c0731Rg2, k35);
                                iQ6 = c0731Rg2.q();
                                iK5 = c0731Rg2.k();
                                if (iQ6 != iQ5) {
                                    c0731Rg2.O(iQ6);
                                    if (z4 && c0731Rg2.r() + c0731Rg2.U > iMax3) {
                                        iMax3 = Math.max(iMax3, c0731Rg2.i(4).e() + c0731Rg2.r() + c0731Rg2.U);
                                    }
                                    z7 = true;
                                } else {
                                    z7 = zN2;
                                }
                                if (iK5 != iK4) {
                                    c0731Rg2.L(iK5);
                                    if (z5 && c0731Rg2.s() + c0731Rg2.V > iMax4) {
                                        iMax4 = Math.max(iMax4, c0731Rg2.i(5).e() + c0731Rg2.s() + c0731Rg2.V);
                                    }
                                    z7 = true;
                                }
                                z6 = ((C1636gw) c0731Rg2).y0 | z7;
                            }
                            i14++;
                            k31 = k35;
                            i11 = i11;
                        }
                        int i3117 = i11;
                        k32 = k31;
                        i15 = 0;
                        while (i15 < 2) {
                            i16 = 0;
                            while (i16 < size2) {
                                c0731Rg = (C0731Rg) arrayList.get(i16);
                                if (!((c0731Rg instanceof AbstractC2636rB) || (c0731Rg instanceof C1636gw)) || (c0731Rg instanceof HA) || c0731Rg.g0 == 8 || ((z3 && c0731Rg.d.e.j && c0731Rg.e.e.j) || (c0731Rg instanceof C1636gw))) {
                                    k34 = k32;
                                    arrayList3 = arrayList;
                                    i18 = size2;
                                } else {
                                    iQ3 = c0731Rg.q();
                                    iK2 = c0731Rg.k();
                                    arrayList3 = arrayList;
                                    int i3118 = c0731Rg.a0;
                                    i18 = size2;
                                    zN = na0.N(i15 == 1 ? 2 : 1, c0731Rg, k32) | z6;
                                    iQ4 = c0731Rg.q();
                                    k34 = k32;
                                    iK3 = c0731Rg.k();
                                    if (iQ4 != iQ3) {
                                        c0731Rg.O(iQ4);
                                        if (!z4 && c0731Rg.r() + c0731Rg.U > iMax3) {
                                            iMax3 = Math.max(iMax3, c0731Rg.i(4).e() + c0731Rg.r() + c0731Rg.U);
                                        }
                                        zN = true;
                                    }
                                    if (iK3 != iK2) {
                                        c0731Rg.L(iK3);
                                        if (!z5 && c0731Rg.s() + c0731Rg.V > iMax4) {
                                            iMax4 = Math.max(iMax4, c0731Rg.i(5).e() + c0731Rg.s() + c0731Rg.V);
                                        }
                                        zN = true;
                                    }
                                    if (c0731Rg.E || i3118 == c0731Rg.a0) {
                                        z6 = zN;
                                    } else {
                                        z6 = true;
                                    }
                                }
                                i16++;
                                arrayList = arrayList3;
                                size2 = i18;
                                k32 = k34;
                            }
                            k33 = k32;
                            arrayList2 = arrayList;
                            i17 = size2;
                            if (z6) {
                                break;
                            }
                            i15++;
                            na0.R(c0757Sg, i15, i12, i13);
                            k32 = k33;
                            arrayList = arrayList2;
                            size2 = i17;
                            z6 = false;
                        }
                        c0757Sg3 = c0757Sg;
                        i11 = i3117;
                    }
                    c0757Sg3.D0 = i11;
                    C2742sK.p = c0757Sg3.W(512);
                }
                return;
            }
            if (childCount2 == 0) {
                iMax2 = Math.max(0, this.p);
            } else {
                i4 = 2;
            }
            iMin2 = 0;
            iQ = c0757Sg.q();
            c2298nm = c0757Sg3.s0;
            i5 = iMin;
            if (i5 == iQ) {
                c2298nm.c = true;
            } else {
                c2298nm.c = true;
            }
            c0757Sg3.Y = 0;
            c0757Sg3.Z = 0;
            int i3119 = this.q - i35;
            iArr = c0757Sg3.C;
            iArr[0] = i3119;
            iArr[1] = this.r - i34;
            c0757Sg3.b0 = 0;
            c0757Sg3.c0 = 0;
            c0757Sg3.M(i31);
            c0757Sg3.O(i5);
            c0757Sg3.N(i4);
            c0757Sg3.L(iMin2);
            i6 = this.f13o - i35;
            if (i6 < 0) {
                c0757Sg3.b0 = 0;
            } else {
                c0757Sg3.b0 = i6;
            }
            i7 = this.p - i34;
            if (i7 < 0) {
                c0757Sg3.c0 = 0;
            } else {
                c0757Sg3.c0 = i7;
            }
            c0757Sg3.x0 = iMax7;
            c0757Sg3.y0 = iMax5;
            na0 = c0757Sg3.r0;
            na0.getClass();
            k30 = c0757Sg3.u0;
            size = c0757Sg3.q0.size();
            iQ2 = c0757Sg.q();
            iK = c0757Sg.k();
            zS = zy0.s(i, 128);
            if (zS) {
                z = true;
            } else {
                z = true;
            }
            if (z) {
                i29 = 0;
                while (true) {
                    if (i29 < size) {
                        c0731Rg4 = (C0731Rg) c0757Sg3.q0.get(i29);
                        iArr4 = c0731Rg4.p0;
                        if (iArr4[0] == 3) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (iArr4[1] == 3) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (z14) {
                            z16 = false;
                        } else {
                            z16 = false;
                        }
                        i29 = !c0731Rg4.x() ? i29 + 1 : i29 + 1;
                        i8 = 1073741824;
                        z = false;
                    } else {
                        i8 = 1073741824;
                    }
                }
            } else {
                i8 = 1073741824;
            }
            z2 = ((mode != i8 && mode2 == i8) || zS) & z;
            if (z2) {
                iMin3 = Math.min(iArr[0], i32);
                iMin4 = Math.min(iArr[1], i33);
                if (mode == 1073741824) {
                    c0757Sg3.O(iMin3);
                    c0757Sg3.s0.b = true;
                }
                if (mode2 == 1073741824) {
                    c0757Sg3.L(iMin4);
                    c0757Sg3.s0.b = true;
                }
                if (mode == 1073741824) {
                    z3 = z2;
                    k31 = k30;
                    iQ2 = iQ2;
                    i9 = iK;
                    z9 = c2298nm.b;
                    c0757Sg2 = c2298nm.a;
                    if (z9) {
                        while (r0.hasNext()) {
                            c0731Rg5.h();
                            c0731Rg5.a = false;
                            TC tc114 = c0731Rg5.d;
                            tc114.e.j = false;
                            tc114.g = false;
                            tc114.n();
                            As0 as113 = c0731Rg5.e;
                            as113.e.j = false;
                            as113.g = false;
                            as113.m();
                        }
                        i22 = 0;
                        c0757Sg2.h();
                        c0757Sg2.a = false;
                        TC tc115 = c0757Sg2.d;
                        tc115.e.j = false;
                        tc115.g = false;
                        tc115.n();
                        As0 as114 = c0757Sg2.e;
                        as114.e.j = false;
                        as114.g = false;
                        as114.m();
                        c2298nm.c();
                    } else {
                        i22 = 0;
                    }
                    c2298nm.b(c2298nm.d);
                    c0757Sg2.Y = i22;
                    c0757Sg2.Z = i22;
                    c0757Sg2.d.h.d(i22);
                    c0757Sg2.e.h.d(i22);
                    i23 = 1073741824;
                    if (mode == 1073741824) {
                        i24 = 1;
                        zT2 = c0757Sg3.T(i22, zS) & true;
                        i10 = 1;
                    } else {
                        i24 = 1;
                        i10 = 0;
                        zT2 = true;
                    }
                    if (mode2 == 1073741824) {
                        zT = zT2 & c0757Sg3.T(i24, zS);
                        i10++;
                    } else {
                        zT = zT2;
                    }
                } else {
                    z3 = z2;
                    k31 = k30;
                    iQ2 = iQ2;
                    i9 = iK;
                    z9 = c2298nm.b;
                    c0757Sg2 = c2298nm.a;
                    if (z9) {
                        while (r0.hasNext()) {
                            c0731Rg5.h();
                            c0731Rg5.a = false;
                            TC tc116 = c0731Rg5.d;
                            tc116.e.j = false;
                            tc116.g = false;
                            tc116.n();
                            As0 as115 = c0731Rg5.e;
                            as115.e.j = false;
                            as115.g = false;
                            as115.m();
                        }
                        i22 = 0;
                        c0757Sg2.h();
                        c0757Sg2.a = false;
                        TC tc117 = c0757Sg2.d;
                        tc117.e.j = false;
                        tc117.g = false;
                        tc117.n();
                        As0 as116 = c0757Sg2.e;
                        as116.e.j = false;
                        as116.g = false;
                        as116.m();
                        c2298nm.c();
                    } else {
                        i22 = 0;
                    }
                    c2298nm.b(c2298nm.d);
                    c0757Sg2.Y = i22;
                    c0757Sg2.Z = i22;
                    c0757Sg2.d.h.d(i22);
                    c0757Sg2.e.h.d(i22);
                    i23 = 1073741824;
                    if (mode == 1073741824) {
                        i24 = 1;
                        zT2 = c0757Sg3.T(i22, zS) & true;
                        i10 = 1;
                    } else {
                        i24 = 1;
                        i10 = 0;
                        zT2 = true;
                    }
                    if (mode2 == 1073741824) {
                        zT = zT2 & c0757Sg3.T(i24, zS);
                        i10++;
                    } else {
                        zT = zT2;
                    }
                }
                if (zT) {
                    if (mode == i23) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (mode2 == i23) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    c0757Sg3.P(z10, z11);
                }
            } else {
                z3 = z2;
                k31 = k30;
                iQ2 = iQ2;
                i9 = iK;
                i10 = 0;
                zT = false;
            }
            if (zT) {
            }
            i11 = c0757Sg3.D0;
            if (size > 0) {
                size3 = c0757Sg3.q0.size();
                boolean zW7 = c0757Sg3.W(64);
                k36 = c0757Sg3.u0;
                while (i19 < size3) {
                    c0731Rg3 = (C0731Rg) c0757Sg3.q0.get(i19);
                    if (!(c0731Rg3 instanceof HA)) {
                        iJ = c0731Rg3.j(0);
                        int iJ10 = c0731Rg3.j(1);
                        if (iJ == 3) {
                            z8 = false;
                        } else {
                            z8 = false;
                        }
                        if (z8) {
                        }
                        if (!z8) {
                            na0.N(0, c0731Rg3, k36);
                        }
                    }
                }
                constraintLayout = (ConstraintLayout) k36.g;
                childCount = constraintLayout.getChildCount();
                while (i20 < childCount) {
                    constraintLayout.getChildAt(i20);
                }
                arrayList4 = constraintLayout.m;
                size4 = arrayList4.size();
                if (size4 > 0) {
                    while (i21 < size4) {
                        ((AbstractC0446Gg) arrayList4.get(i21)).getClass();
                    }
                }
            }
            na0.W(c0757Sg3);
            arrayList = (ArrayList) na0.m;
            size2 = arrayList.size();
            i12 = iQ2;
            i13 = i9;
            if (size > 0) {
                na0.R(c0757Sg3, 0, i12, i13);
            }
            if (size2 > 0) {
                iArr2 = c0757Sg3.p0;
                if (iArr2[0] == 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (iArr2[1] == 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                int iQ16 = c0757Sg.q();
                C0757Sg c0757Sg11 = (C0757Sg) na0.f414o;
                iMax3 = Math.max(iQ16, c0757Sg11.b0);
                iMax4 = Math.max(c0757Sg.k(), c0757Sg11.c0);
                i14 = 0;
                z6 = false;
                while (i14 < size2) {
                    c0731Rg2 = (C0731Rg) arrayList.get(i14);
                    if (c0731Rg2 instanceof C1636gw) {
                        k35 = k31;
                    } else {
                        iQ5 = c0731Rg2.q();
                        iK4 = c0731Rg2.k();
                        k35 = k31;
                        zN2 = z6 | na0.N(1, c0731Rg2, k35);
                        iQ6 = c0731Rg2.q();
                        iK5 = c0731Rg2.k();
                        if (iQ6 != iQ5) {
                            c0731Rg2.O(iQ6);
                            if (z4) {
                                iMax3 = Math.max(iMax3, c0731Rg2.i(4).e() + c0731Rg2.r() + c0731Rg2.U);
                            }
                            z7 = true;
                        } else {
                            z7 = zN2;
                        }
                        if (iK5 != iK4) {
                            c0731Rg2.L(iK5);
                            if (z5) {
                                iMax4 = Math.max(iMax4, c0731Rg2.i(5).e() + c0731Rg2.s() + c0731Rg2.V);
                            }
                            z7 = true;
                        }
                        z6 = ((C1636gw) c0731Rg2).y0 | z7;
                    }
                    i14++;
                    k31 = k35;
                    i11 = i11;
                }
                int i31110 = i11;
                k32 = k31;
                i15 = 0;
                while (i15 < 2) {
                    i16 = 0;
                    while (i16 < size2) {
                        c0731Rg = (C0731Rg) arrayList.get(i16);
                        if (c0731Rg instanceof AbstractC2636rB) {
                            iQ3 = c0731Rg.q();
                            iK2 = c0731Rg.k();
                            arrayList3 = arrayList;
                            int i31111 = c0731Rg.a0;
                            i18 = size2;
                            zN = na0.N(i15 == 1 ? 2 : 1, c0731Rg, k32) | z6;
                            iQ4 = c0731Rg.q();
                            k34 = k32;
                            iK3 = c0731Rg.k();
                            if (iQ4 != iQ3) {
                                c0731Rg.O(iQ4);
                                if (!z4) {
                                }
                                zN = true;
                            }
                            if (iK3 != iK2) {
                                c0731Rg.L(iK3);
                                if (!z5) {
                                }
                                zN = true;
                            }
                            if (c0731Rg.E) {
                                z6 = zN;
                            } else {
                                z6 = zN;
                            }
                        } else {
                            iQ3 = c0731Rg.q();
                            iK2 = c0731Rg.k();
                            arrayList3 = arrayList;
                            int i31112 = c0731Rg.a0;
                            i18 = size2;
                            zN = na0.N(i15 == 1 ? 2 : 1, c0731Rg, k32) | z6;
                            iQ4 = c0731Rg.q();
                            k34 = k32;
                            iK3 = c0731Rg.k();
                            if (iQ4 != iQ3) {
                                c0731Rg.O(iQ4);
                                if (!z4) {
                                }
                                zN = true;
                            }
                            if (iK3 != iK2) {
                                c0731Rg.L(iK3);
                                if (!z5) {
                                }
                                zN = true;
                            }
                            if (c0731Rg.E) {
                                z6 = zN;
                            } else {
                                z6 = zN;
                            }
                        }
                        i16++;
                        arrayList = arrayList3;
                        size2 = i18;
                        k32 = k34;
                    }
                    k33 = k32;
                    arrayList2 = arrayList;
                    i17 = size2;
                    if (z6) {
                        break;
                        break;
                    }
                    i15++;
                    na0.R(c0757Sg, i15, i12, i13);
                    k32 = k33;
                    arrayList = arrayList2;
                    size2 = i17;
                    z6 = false;
                }
                c0757Sg3 = c0757Sg;
                i11 = i31110;
            }
            c0757Sg3.D0 = i11;
            C2742sK.p = c0757Sg3.W(512);
            iMin2 = iMax2;
            i4 = 2;
            iQ = c0757Sg.q();
            c2298nm = c0757Sg3.s0;
            i5 = iMin;
            if (i5 == iQ) {
                c2298nm.c = true;
            } else {
                c2298nm.c = true;
            }
            c0757Sg3.Y = 0;
            c0757Sg3.Z = 0;
            int i31113 = this.q - i35;
            iArr = c0757Sg3.C;
            iArr[0] = i31113;
            iArr[1] = this.r - i34;
            c0757Sg3.b0 = 0;
            c0757Sg3.c0 = 0;
            c0757Sg3.M(i31);
            c0757Sg3.O(i5);
            c0757Sg3.N(i4);
            c0757Sg3.L(iMin2);
            i6 = this.f13o - i35;
            if (i6 < 0) {
                c0757Sg3.b0 = 0;
            } else {
                c0757Sg3.b0 = i6;
            }
            i7 = this.p - i34;
            if (i7 < 0) {
                c0757Sg3.c0 = 0;
            } else {
                c0757Sg3.c0 = i7;
            }
            c0757Sg3.x0 = iMax7;
            c0757Sg3.y0 = iMax5;
            na0 = c0757Sg3.r0;
            na0.getClass();
            k30 = c0757Sg3.u0;
            size = c0757Sg3.q0.size();
            iQ2 = c0757Sg.q();
            iK = c0757Sg.k();
            zS = zy0.s(i, 128);
            if (zS) {
                z = true;
            } else {
                z = true;
            }
            if (z) {
                i29 = 0;
                while (true) {
                    if (i29 < size) {
                        c0731Rg4 = (C0731Rg) c0757Sg3.q0.get(i29);
                        iArr4 = c0731Rg4.p0;
                        if (iArr4[0] == 3) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (iArr4[1] == 3) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (z14) {
                            z16 = false;
                        } else {
                            z16 = false;
                        }
                        if (!c0731Rg4.x()) {
                        }
                        i8 = 1073741824;
                        z = false;
                    } else {
                        i8 = 1073741824;
                    }
                }
            } else {
                i8 = 1073741824;
            }
            z2 = ((mode != i8 && mode2 == i8) || zS) & z;
            if (z2) {
                iMin3 = Math.min(iArr[0], i32);
                iMin4 = Math.min(iArr[1], i33);
                if (mode == 1073741824) {
                    c0757Sg3.O(iMin3);
                    c0757Sg3.s0.b = true;
                }
                if (mode2 == 1073741824) {
                    c0757Sg3.L(iMin4);
                    c0757Sg3.s0.b = true;
                }
                if (mode == 1073741824) {
                    z3 = z2;
                    k31 = k30;
                    iQ2 = iQ2;
                    i9 = iK;
                    z9 = c2298nm.b;
                    c0757Sg2 = c2298nm.a;
                    if (z9) {
                        while (r0.hasNext()) {
                            c0731Rg5.h();
                            c0731Rg5.a = false;
                            TC tc118 = c0731Rg5.d;
                            tc118.e.j = false;
                            tc118.g = false;
                            tc118.n();
                            As0 as117 = c0731Rg5.e;
                            as117.e.j = false;
                            as117.g = false;
                            as117.m();
                        }
                        i22 = 0;
                        c0757Sg2.h();
                        c0757Sg2.a = false;
                        TC tc119 = c0757Sg2.d;
                        tc119.e.j = false;
                        tc119.g = false;
                        tc119.n();
                        As0 as118 = c0757Sg2.e;
                        as118.e.j = false;
                        as118.g = false;
                        as118.m();
                        c2298nm.c();
                    } else {
                        i22 = 0;
                    }
                    c2298nm.b(c2298nm.d);
                    c0757Sg2.Y = i22;
                    c0757Sg2.Z = i22;
                    c0757Sg2.d.h.d(i22);
                    c0757Sg2.e.h.d(i22);
                    i23 = 1073741824;
                    if (mode == 1073741824) {
                        i24 = 1;
                        zT2 = c0757Sg3.T(i22, zS) & true;
                        i10 = 1;
                    } else {
                        i24 = 1;
                        i10 = 0;
                        zT2 = true;
                    }
                    if (mode2 == 1073741824) {
                        zT = zT2 & c0757Sg3.T(i24, zS);
                        i10++;
                    } else {
                        zT = zT2;
                    }
                } else {
                    z3 = z2;
                    k31 = k30;
                    iQ2 = iQ2;
                    i9 = iK;
                    z9 = c2298nm.b;
                    c0757Sg2 = c2298nm.a;
                    if (z9) {
                        while (r0.hasNext()) {
                            c0731Rg5.h();
                            c0731Rg5.a = false;
                            TC tc1110 = c0731Rg5.d;
                            tc1110.e.j = false;
                            tc1110.g = false;
                            tc1110.n();
                            As0 as119 = c0731Rg5.e;
                            as119.e.j = false;
                            as119.g = false;
                            as119.m();
                        }
                        i22 = 0;
                        c0757Sg2.h();
                        c0757Sg2.a = false;
                        TC tc1111 = c0757Sg2.d;
                        tc1111.e.j = false;
                        tc1111.g = false;
                        tc1111.n();
                        As0 as1110 = c0757Sg2.e;
                        as1110.e.j = false;
                        as1110.g = false;
                        as1110.m();
                        c2298nm.c();
                    } else {
                        i22 = 0;
                    }
                    c2298nm.b(c2298nm.d);
                    c0757Sg2.Y = i22;
                    c0757Sg2.Z = i22;
                    c0757Sg2.d.h.d(i22);
                    c0757Sg2.e.h.d(i22);
                    i23 = 1073741824;
                    if (mode == 1073741824) {
                        i24 = 1;
                        zT2 = c0757Sg3.T(i22, zS) & true;
                        i10 = 1;
                    } else {
                        i24 = 1;
                        i10 = 0;
                        zT2 = true;
                    }
                    if (mode2 == 1073741824) {
                        zT = zT2 & c0757Sg3.T(i24, zS);
                        i10++;
                    } else {
                        zT = zT2;
                    }
                }
                if (zT) {
                    if (mode == i23) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (mode2 == i23) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    c0757Sg3.P(z10, z11);
                }
            } else {
                z3 = z2;
                k31 = k30;
                iQ2 = iQ2;
                i9 = iK;
                i10 = 0;
                zT = false;
            }
            if (zT) {
            }
            i11 = c0757Sg3.D0;
            if (size > 0) {
                size3 = c0757Sg3.q0.size();
                boolean zW8 = c0757Sg3.W(64);
                k36 = c0757Sg3.u0;
                while (i19 < size3) {
                    c0731Rg3 = (C0731Rg) c0757Sg3.q0.get(i19);
                    if (!(c0731Rg3 instanceof HA)) {
                        iJ = c0731Rg3.j(0);
                        int iJ11 = c0731Rg3.j(1);
                        if (iJ == 3) {
                            z8 = false;
                        } else {
                            z8 = false;
                        }
                        if (z8) {
                        }
                        if (!z8) {
                            na0.N(0, c0731Rg3, k36);
                        }
                    }
                }
                constraintLayout = (ConstraintLayout) k36.g;
                childCount = constraintLayout.getChildCount();
                while (i20 < childCount) {
                    constraintLayout.getChildAt(i20);
                }
                arrayList4 = constraintLayout.m;
                size4 = arrayList4.size();
                if (size4 > 0) {
                    while (i21 < size4) {
                        ((AbstractC0446Gg) arrayList4.get(i21)).getClass();
                    }
                }
            }
            na0.W(c0757Sg3);
            arrayList = (ArrayList) na0.m;
            size2 = arrayList.size();
            i12 = iQ2;
            i13 = i9;
            if (size > 0) {
                na0.R(c0757Sg3, 0, i12, i13);
            }
            if (size2 > 0) {
                iArr2 = c0757Sg3.p0;
                if (iArr2[0] == 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (iArr2[1] == 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                int iQ17 = c0757Sg.q();
                C0757Sg c0757Sg12 = (C0757Sg) na0.f414o;
                iMax3 = Math.max(iQ17, c0757Sg12.b0);
                iMax4 = Math.max(c0757Sg.k(), c0757Sg12.c0);
                i14 = 0;
                z6 = false;
                while (i14 < size2) {
                    c0731Rg2 = (C0731Rg) arrayList.get(i14);
                    if (c0731Rg2 instanceof C1636gw) {
                        k35 = k31;
                    } else {
                        iQ5 = c0731Rg2.q();
                        iK4 = c0731Rg2.k();
                        k35 = k31;
                        zN2 = z6 | na0.N(1, c0731Rg2, k35);
                        iQ6 = c0731Rg2.q();
                        iK5 = c0731Rg2.k();
                        if (iQ6 != iQ5) {
                            c0731Rg2.O(iQ6);
                            if (z4) {
                                iMax3 = Math.max(iMax3, c0731Rg2.i(4).e() + c0731Rg2.r() + c0731Rg2.U);
                            }
                            z7 = true;
                        } else {
                            z7 = zN2;
                        }
                        if (iK5 != iK4) {
                            c0731Rg2.L(iK5);
                            if (z5) {
                                iMax4 = Math.max(iMax4, c0731Rg2.i(5).e() + c0731Rg2.s() + c0731Rg2.V);
                            }
                            z7 = true;
                        }
                        z6 = ((C1636gw) c0731Rg2).y0 | z7;
                    }
                    i14++;
                    k31 = k35;
                    i11 = i11;
                }
                int i31114 = i11;
                k32 = k31;
                i15 = 0;
                while (i15 < 2) {
                    i16 = 0;
                    while (i16 < size2) {
                        c0731Rg = (C0731Rg) arrayList.get(i16);
                        if (c0731Rg instanceof AbstractC2636rB) {
                            iQ3 = c0731Rg.q();
                            iK2 = c0731Rg.k();
                            arrayList3 = arrayList;
                            int i31115 = c0731Rg.a0;
                            i18 = size2;
                            zN = na0.N(i15 == 1 ? 2 : 1, c0731Rg, k32) | z6;
                            iQ4 = c0731Rg.q();
                            k34 = k32;
                            iK3 = c0731Rg.k();
                            if (iQ4 != iQ3) {
                                c0731Rg.O(iQ4);
                                if (!z4) {
                                }
                                zN = true;
                            }
                            if (iK3 != iK2) {
                                c0731Rg.L(iK3);
                                if (!z5) {
                                }
                                zN = true;
                            }
                            if (c0731Rg.E) {
                                z6 = zN;
                            } else {
                                z6 = zN;
                            }
                        } else {
                            iQ3 = c0731Rg.q();
                            iK2 = c0731Rg.k();
                            arrayList3 = arrayList;
                            int i31116 = c0731Rg.a0;
                            i18 = size2;
                            zN = na0.N(i15 == 1 ? 2 : 1, c0731Rg, k32) | z6;
                            iQ4 = c0731Rg.q();
                            k34 = k32;
                            iK3 = c0731Rg.k();
                            if (iQ4 != iQ3) {
                                c0731Rg.O(iQ4);
                                if (!z4) {
                                }
                                zN = true;
                            }
                            if (iK3 != iK2) {
                                c0731Rg.L(iK3);
                                if (!z5) {
                                }
                                zN = true;
                            }
                            if (c0731Rg.E) {
                                z6 = zN;
                            } else {
                                z6 = zN;
                            }
                        }
                        i16++;
                        arrayList = arrayList3;
                        size2 = i18;
                        k32 = k34;
                    }
                    k33 = k32;
                    arrayList2 = arrayList;
                    i17 = size2;
                    if (z6) {
                        break;
                        break;
                    }
                    i15++;
                    na0.R(c0757Sg, i15, i12, i13);
                    k32 = k33;
                    arrayList = arrayList2;
                    size2 = i17;
                    z6 = false;
                }
                c0757Sg3 = c0757Sg;
                i11 = i31114;
            }
            c0757Sg3.D0 = i11;
            C2742sK.p = c0757Sg3.W(512);
        }
        if (childCount2 == 0) {
            iMax = Math.max(0, this.f13o);
        } else {
            i31 = 2;
        }
        iMin = 0;
        if (mode2 != Integer.MIN_VALUE) {
            if (childCount2 == 0) {
                iMax2 = Math.max(0, this.p);
            } else {
                iMin2 = i33;
            }
            i4 = 2;
            iQ = c0757Sg.q();
            c2298nm = c0757Sg3.s0;
            i5 = iMin;
            if (i5 == iQ) {
                c2298nm.c = true;
            } else {
                c2298nm.c = true;
            }
            c0757Sg3.Y = 0;
            c0757Sg3.Z = 0;
            int i31117 = this.q - i35;
            iArr = c0757Sg3.C;
            iArr[0] = i31117;
            iArr[1] = this.r - i34;
            c0757Sg3.b0 = 0;
            c0757Sg3.c0 = 0;
            c0757Sg3.M(i31);
            c0757Sg3.O(i5);
            c0757Sg3.N(i4);
            c0757Sg3.L(iMin2);
            i6 = this.f13o - i35;
            if (i6 < 0) {
                c0757Sg3.b0 = 0;
            } else {
                c0757Sg3.b0 = i6;
            }
            i7 = this.p - i34;
            if (i7 < 0) {
                c0757Sg3.c0 = 0;
            } else {
                c0757Sg3.c0 = i7;
            }
            c0757Sg3.x0 = iMax7;
            c0757Sg3.y0 = iMax5;
            na0 = c0757Sg3.r0;
            na0.getClass();
            k30 = c0757Sg3.u0;
            size = c0757Sg3.q0.size();
            iQ2 = c0757Sg.q();
            iK = c0757Sg.k();
            zS = zy0.s(i, 128);
            if (zS) {
                z = true;
            } else {
                z = true;
            }
            if (z) {
                i29 = 0;
                while (true) {
                    if (i29 < size) {
                        c0731Rg4 = (C0731Rg) c0757Sg3.q0.get(i29);
                        iArr4 = c0731Rg4.p0;
                        if (iArr4[0] == 3) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (iArr4[1] == 3) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (z14) {
                            z16 = false;
                        } else {
                            z16 = false;
                        }
                        if (!c0731Rg4.x()) {
                        }
                        i8 = 1073741824;
                        z = false;
                    } else {
                        i8 = 1073741824;
                    }
                }
            } else {
                i8 = 1073741824;
            }
            z2 = ((mode != i8 && mode2 == i8) || zS) & z;
            if (z2) {
                iMin3 = Math.min(iArr[0], i32);
                iMin4 = Math.min(iArr[1], i33);
                if (mode == 1073741824) {
                    c0757Sg3.O(iMin3);
                    c0757Sg3.s0.b = true;
                }
                if (mode2 == 1073741824) {
                    c0757Sg3.L(iMin4);
                    c0757Sg3.s0.b = true;
                }
                if (mode == 1073741824) {
                    z3 = z2;
                    k31 = k30;
                    iQ2 = iQ2;
                    i9 = iK;
                    z9 = c2298nm.b;
                    c0757Sg2 = c2298nm.a;
                    if (z9) {
                        while (r0.hasNext()) {
                            c0731Rg5.h();
                            c0731Rg5.a = false;
                            TC tc1112 = c0731Rg5.d;
                            tc1112.e.j = false;
                            tc1112.g = false;
                            tc1112.n();
                            As0 as1111 = c0731Rg5.e;
                            as1111.e.j = false;
                            as1111.g = false;
                            as1111.m();
                        }
                        i22 = 0;
                        c0757Sg2.h();
                        c0757Sg2.a = false;
                        TC tc1113 = c0757Sg2.d;
                        tc1113.e.j = false;
                        tc1113.g = false;
                        tc1113.n();
                        As0 as1112 = c0757Sg2.e;
                        as1112.e.j = false;
                        as1112.g = false;
                        as1112.m();
                        c2298nm.c();
                    } else {
                        i22 = 0;
                    }
                    c2298nm.b(c2298nm.d);
                    c0757Sg2.Y = i22;
                    c0757Sg2.Z = i22;
                    c0757Sg2.d.h.d(i22);
                    c0757Sg2.e.h.d(i22);
                    i23 = 1073741824;
                    if (mode == 1073741824) {
                        i24 = 1;
                        zT2 = c0757Sg3.T(i22, zS) & true;
                        i10 = 1;
                    } else {
                        i24 = 1;
                        i10 = 0;
                        zT2 = true;
                    }
                    if (mode2 == 1073741824) {
                        zT = zT2 & c0757Sg3.T(i24, zS);
                        i10++;
                    } else {
                        zT = zT2;
                    }
                } else {
                    z3 = z2;
                    k31 = k30;
                    iQ2 = iQ2;
                    i9 = iK;
                    z9 = c2298nm.b;
                    c0757Sg2 = c2298nm.a;
                    if (z9) {
                        while (r0.hasNext()) {
                            c0731Rg5.h();
                            c0731Rg5.a = false;
                            TC tc1114 = c0731Rg5.d;
                            tc1114.e.j = false;
                            tc1114.g = false;
                            tc1114.n();
                            As0 as1113 = c0731Rg5.e;
                            as1113.e.j = false;
                            as1113.g = false;
                            as1113.m();
                        }
                        i22 = 0;
                        c0757Sg2.h();
                        c0757Sg2.a = false;
                        TC tc1115 = c0757Sg2.d;
                        tc1115.e.j = false;
                        tc1115.g = false;
                        tc1115.n();
                        As0 as1114 = c0757Sg2.e;
                        as1114.e.j = false;
                        as1114.g = false;
                        as1114.m();
                        c2298nm.c();
                    } else {
                        i22 = 0;
                    }
                    c2298nm.b(c2298nm.d);
                    c0757Sg2.Y = i22;
                    c0757Sg2.Z = i22;
                    c0757Sg2.d.h.d(i22);
                    c0757Sg2.e.h.d(i22);
                    i23 = 1073741824;
                    if (mode == 1073741824) {
                        i24 = 1;
                        zT2 = c0757Sg3.T(i22, zS) & true;
                        i10 = 1;
                    } else {
                        i24 = 1;
                        i10 = 0;
                        zT2 = true;
                    }
                    if (mode2 == 1073741824) {
                        zT = zT2 & c0757Sg3.T(i24, zS);
                        i10++;
                    } else {
                        zT = zT2;
                    }
                }
                if (zT) {
                    if (mode == i23) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (mode2 == i23) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    c0757Sg3.P(z10, z11);
                }
            } else {
                z3 = z2;
                k31 = k30;
                iQ2 = iQ2;
                i9 = iK;
                i10 = 0;
                zT = false;
            }
            if (zT) {
            }
            i11 = c0757Sg3.D0;
            if (size > 0) {
                size3 = c0757Sg3.q0.size();
                boolean zW9 = c0757Sg3.W(64);
                k36 = c0757Sg3.u0;
                while (i19 < size3) {
                    c0731Rg3 = (C0731Rg) c0757Sg3.q0.get(i19);
                    if (!(c0731Rg3 instanceof HA)) {
                        iJ = c0731Rg3.j(0);
                        int iJ12 = c0731Rg3.j(1);
                        if (iJ == 3) {
                            z8 = false;
                        } else {
                            z8 = false;
                        }
                        if (z8) {
                        }
                        if (!z8) {
                            na0.N(0, c0731Rg3, k36);
                        }
                    }
                }
                constraintLayout = (ConstraintLayout) k36.g;
                childCount = constraintLayout.getChildCount();
                while (i20 < childCount) {
                    constraintLayout.getChildAt(i20);
                }
                arrayList4 = constraintLayout.m;
                size4 = arrayList4.size();
                if (size4 > 0) {
                    while (i21 < size4) {
                        ((AbstractC0446Gg) arrayList4.get(i21)).getClass();
                    }
                }
            }
            na0.W(c0757Sg3);
            arrayList = (ArrayList) na0.m;
            size2 = arrayList.size();
            i12 = iQ2;
            i13 = i9;
            if (size > 0) {
                na0.R(c0757Sg3, 0, i12, i13);
            }
            if (size2 > 0) {
                iArr2 = c0757Sg3.p0;
                if (iArr2[0] == 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (iArr2[1] == 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                int iQ18 = c0757Sg.q();
                C0757Sg c0757Sg13 = (C0757Sg) na0.f414o;
                iMax3 = Math.max(iQ18, c0757Sg13.b0);
                iMax4 = Math.max(c0757Sg.k(), c0757Sg13.c0);
                i14 = 0;
                z6 = false;
                while (i14 < size2) {
                    c0731Rg2 = (C0731Rg) arrayList.get(i14);
                    if (c0731Rg2 instanceof C1636gw) {
                        k35 = k31;
                    } else {
                        iQ5 = c0731Rg2.q();
                        iK4 = c0731Rg2.k();
                        k35 = k31;
                        zN2 = z6 | na0.N(1, c0731Rg2, k35);
                        iQ6 = c0731Rg2.q();
                        iK5 = c0731Rg2.k();
                        if (iQ6 != iQ5) {
                            c0731Rg2.O(iQ6);
                            if (z4) {
                                iMax3 = Math.max(iMax3, c0731Rg2.i(4).e() + c0731Rg2.r() + c0731Rg2.U);
                            }
                            z7 = true;
                        } else {
                            z7 = zN2;
                        }
                        if (iK5 != iK4) {
                            c0731Rg2.L(iK5);
                            if (z5) {
                                iMax4 = Math.max(iMax4, c0731Rg2.i(5).e() + c0731Rg2.s() + c0731Rg2.V);
                            }
                            z7 = true;
                        }
                        z6 = ((C1636gw) c0731Rg2).y0 | z7;
                    }
                    i14++;
                    k31 = k35;
                    i11 = i11;
                }
                int i31118 = i11;
                k32 = k31;
                i15 = 0;
                while (i15 < 2) {
                    i16 = 0;
                    while (i16 < size2) {
                        c0731Rg = (C0731Rg) arrayList.get(i16);
                        if (c0731Rg instanceof AbstractC2636rB) {
                            iQ3 = c0731Rg.q();
                            iK2 = c0731Rg.k();
                            arrayList3 = arrayList;
                            int i31119 = c0731Rg.a0;
                            i18 = size2;
                            zN = na0.N(i15 == 1 ? 2 : 1, c0731Rg, k32) | z6;
                            iQ4 = c0731Rg.q();
                            k34 = k32;
                            iK3 = c0731Rg.k();
                            if (iQ4 != iQ3) {
                                c0731Rg.O(iQ4);
                                if (!z4) {
                                }
                                zN = true;
                            }
                            if (iK3 != iK2) {
                                c0731Rg.L(iK3);
                                if (!z5) {
                                }
                                zN = true;
                            }
                            if (c0731Rg.E) {
                                z6 = zN;
                            } else {
                                z6 = zN;
                            }
                        } else {
                            iQ3 = c0731Rg.q();
                            iK2 = c0731Rg.k();
                            arrayList3 = arrayList;
                            int i311110 = c0731Rg.a0;
                            i18 = size2;
                            zN = na0.N(i15 == 1 ? 2 : 1, c0731Rg, k32) | z6;
                            iQ4 = c0731Rg.q();
                            k34 = k32;
                            iK3 = c0731Rg.k();
                            if (iQ4 != iQ3) {
                                c0731Rg.O(iQ4);
                                if (!z4) {
                                }
                                zN = true;
                            }
                            if (iK3 != iK2) {
                                c0731Rg.L(iK3);
                                if (!z5) {
                                }
                                zN = true;
                            }
                            if (c0731Rg.E) {
                                z6 = zN;
                            } else {
                                z6 = zN;
                            }
                        }
                        i16++;
                        arrayList = arrayList3;
                        size2 = i18;
                        k32 = k34;
                    }
                    k33 = k32;
                    arrayList2 = arrayList;
                    i17 = size2;
                    if (z6) {
                        break;
                        break;
                    }
                    i15++;
                    na0.R(c0757Sg, i15, i12, i13);
                    k32 = k33;
                    arrayList = arrayList2;
                    size2 = i17;
                    z6 = false;
                }
                c0757Sg3 = c0757Sg;
                i11 = i31118;
            }
            c0757Sg3.D0 = i11;
            C2742sK.p = c0757Sg3.W(512);
        }
        if (mode2 != 0) {
            if (mode2 != 1073741824) {
                i4 = 1;
            } else {
                iMin2 = Math.min(this.r - i34, i33);
                i4 = 1;
            }
            iQ = c0757Sg.q();
            c2298nm = c0757Sg3.s0;
            i5 = iMin;
            if (i5 == iQ) {
                c2298nm.c = true;
            } else {
                c2298nm.c = true;
            }
            c0757Sg3.Y = 0;
            c0757Sg3.Z = 0;
            int i311111 = this.q - i35;
            iArr = c0757Sg3.C;
            iArr[0] = i311111;
            iArr[1] = this.r - i34;
            c0757Sg3.b0 = 0;
            c0757Sg3.c0 = 0;
            c0757Sg3.M(i31);
            c0757Sg3.O(i5);
            c0757Sg3.N(i4);
            c0757Sg3.L(iMin2);
            i6 = this.f13o - i35;
            if (i6 < 0) {
                c0757Sg3.b0 = 0;
            } else {
                c0757Sg3.b0 = i6;
            }
            i7 = this.p - i34;
            if (i7 < 0) {
                c0757Sg3.c0 = 0;
            } else {
                c0757Sg3.c0 = i7;
            }
            c0757Sg3.x0 = iMax7;
            c0757Sg3.y0 = iMax5;
            na0 = c0757Sg3.r0;
            na0.getClass();
            k30 = c0757Sg3.u0;
            size = c0757Sg3.q0.size();
            iQ2 = c0757Sg.q();
            iK = c0757Sg.k();
            zS = zy0.s(i, 128);
            if (zS) {
                z = true;
            } else {
                z = true;
            }
            if (z) {
                i29 = 0;
                while (true) {
                    if (i29 < size) {
                        c0731Rg4 = (C0731Rg) c0757Sg3.q0.get(i29);
                        iArr4 = c0731Rg4.p0;
                        if (iArr4[0] == 3) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (iArr4[1] == 3) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (z14) {
                            z16 = false;
                        } else {
                            z16 = false;
                        }
                        if (!c0731Rg4.x()) {
                        }
                        i8 = 1073741824;
                        z = false;
                    } else {
                        i8 = 1073741824;
                    }
                }
            } else {
                i8 = 1073741824;
            }
            z2 = ((mode != i8 && mode2 == i8) || zS) & z;
            if (z2) {
                iMin3 = Math.min(iArr[0], i32);
                iMin4 = Math.min(iArr[1], i33);
                if (mode == 1073741824) {
                    c0757Sg3.O(iMin3);
                    c0757Sg3.s0.b = true;
                }
                if (mode2 == 1073741824) {
                    c0757Sg3.L(iMin4);
                    c0757Sg3.s0.b = true;
                }
                if (mode == 1073741824) {
                    z3 = z2;
                    k31 = k30;
                    iQ2 = iQ2;
                    i9 = iK;
                    z9 = c2298nm.b;
                    c0757Sg2 = c2298nm.a;
                    if (z9) {
                        while (r0.hasNext()) {
                            c0731Rg5.h();
                            c0731Rg5.a = false;
                            TC tc1116 = c0731Rg5.d;
                            tc1116.e.j = false;
                            tc1116.g = false;
                            tc1116.n();
                            As0 as1115 = c0731Rg5.e;
                            as1115.e.j = false;
                            as1115.g = false;
                            as1115.m();
                        }
                        i22 = 0;
                        c0757Sg2.h();
                        c0757Sg2.a = false;
                        TC tc1117 = c0757Sg2.d;
                        tc1117.e.j = false;
                        tc1117.g = false;
                        tc1117.n();
                        As0 as1116 = c0757Sg2.e;
                        as1116.e.j = false;
                        as1116.g = false;
                        as1116.m();
                        c2298nm.c();
                    } else {
                        i22 = 0;
                    }
                    c2298nm.b(c2298nm.d);
                    c0757Sg2.Y = i22;
                    c0757Sg2.Z = i22;
                    c0757Sg2.d.h.d(i22);
                    c0757Sg2.e.h.d(i22);
                    i23 = 1073741824;
                    if (mode == 1073741824) {
                        i24 = 1;
                        zT2 = c0757Sg3.T(i22, zS) & true;
                        i10 = 1;
                    } else {
                        i24 = 1;
                        i10 = 0;
                        zT2 = true;
                    }
                    if (mode2 == 1073741824) {
                        zT = zT2 & c0757Sg3.T(i24, zS);
                        i10++;
                    } else {
                        zT = zT2;
                    }
                } else {
                    z3 = z2;
                    k31 = k30;
                    iQ2 = iQ2;
                    i9 = iK;
                    z9 = c2298nm.b;
                    c0757Sg2 = c2298nm.a;
                    if (z9) {
                        while (r0.hasNext()) {
                            c0731Rg5.h();
                            c0731Rg5.a = false;
                            TC tc1118 = c0731Rg5.d;
                            tc1118.e.j = false;
                            tc1118.g = false;
                            tc1118.n();
                            As0 as1117 = c0731Rg5.e;
                            as1117.e.j = false;
                            as1117.g = false;
                            as1117.m();
                        }
                        i22 = 0;
                        c0757Sg2.h();
                        c0757Sg2.a = false;
                        TC tc1119 = c0757Sg2.d;
                        tc1119.e.j = false;
                        tc1119.g = false;
                        tc1119.n();
                        As0 as1118 = c0757Sg2.e;
                        as1118.e.j = false;
                        as1118.g = false;
                        as1118.m();
                        c2298nm.c();
                    } else {
                        i22 = 0;
                    }
                    c2298nm.b(c2298nm.d);
                    c0757Sg2.Y = i22;
                    c0757Sg2.Z = i22;
                    c0757Sg2.d.h.d(i22);
                    c0757Sg2.e.h.d(i22);
                    i23 = 1073741824;
                    if (mode == 1073741824) {
                        i24 = 1;
                        zT2 = c0757Sg3.T(i22, zS) & true;
                        i10 = 1;
                    } else {
                        i24 = 1;
                        i10 = 0;
                        zT2 = true;
                    }
                    if (mode2 == 1073741824) {
                        zT = zT2 & c0757Sg3.T(i24, zS);
                        i10++;
                    } else {
                        zT = zT2;
                    }
                }
                if (zT) {
                    if (mode == i23) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (mode2 == i23) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    c0757Sg3.P(z10, z11);
                }
            } else {
                z3 = z2;
                k31 = k30;
                iQ2 = iQ2;
                i9 = iK;
                i10 = 0;
                zT = false;
            }
            if (zT) {
            }
            i11 = c0757Sg3.D0;
            if (size > 0) {
                size3 = c0757Sg3.q0.size();
                boolean zW10 = c0757Sg3.W(64);
                k36 = c0757Sg3.u0;
                while (i19 < size3) {
                    c0731Rg3 = (C0731Rg) c0757Sg3.q0.get(i19);
                    if (!(c0731Rg3 instanceof HA)) {
                        iJ = c0731Rg3.j(0);
                        int iJ13 = c0731Rg3.j(1);
                        if (iJ == 3) {
                            z8 = false;
                        } else {
                            z8 = false;
                        }
                        if (z8) {
                        }
                        if (!z8) {
                            na0.N(0, c0731Rg3, k36);
                        }
                    }
                }
                constraintLayout = (ConstraintLayout) k36.g;
                childCount = constraintLayout.getChildCount();
                while (i20 < childCount) {
                    constraintLayout.getChildAt(i20);
                }
                arrayList4 = constraintLayout.m;
                size4 = arrayList4.size();
                if (size4 > 0) {
                    while (i21 < size4) {
                        ((AbstractC0446Gg) arrayList4.get(i21)).getClass();
                    }
                }
            }
            na0.W(c0757Sg3);
            arrayList = (ArrayList) na0.m;
            size2 = arrayList.size();
            i12 = iQ2;
            i13 = i9;
            if (size > 0) {
                na0.R(c0757Sg3, 0, i12, i13);
            }
            if (size2 > 0) {
                iArr2 = c0757Sg3.p0;
                if (iArr2[0] == 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (iArr2[1] == 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                int iQ19 = c0757Sg.q();
                C0757Sg c0757Sg14 = (C0757Sg) na0.f414o;
                iMax3 = Math.max(iQ19, c0757Sg14.b0);
                iMax4 = Math.max(c0757Sg.k(), c0757Sg14.c0);
                i14 = 0;
                z6 = false;
                while (i14 < size2) {
                    c0731Rg2 = (C0731Rg) arrayList.get(i14);
                    if (c0731Rg2 instanceof C1636gw) {
                        k35 = k31;
                    } else {
                        iQ5 = c0731Rg2.q();
                        iK4 = c0731Rg2.k();
                        k35 = k31;
                        zN2 = z6 | na0.N(1, c0731Rg2, k35);
                        iQ6 = c0731Rg2.q();
                        iK5 = c0731Rg2.k();
                        if (iQ6 != iQ5) {
                            c0731Rg2.O(iQ6);
                            if (z4) {
                                iMax3 = Math.max(iMax3, c0731Rg2.i(4).e() + c0731Rg2.r() + c0731Rg2.U);
                            }
                            z7 = true;
                        } else {
                            z7 = zN2;
                        }
                        if (iK5 != iK4) {
                            c0731Rg2.L(iK5);
                            if (z5) {
                                iMax4 = Math.max(iMax4, c0731Rg2.i(5).e() + c0731Rg2.s() + c0731Rg2.V);
                            }
                            z7 = true;
                        }
                        z6 = ((C1636gw) c0731Rg2).y0 | z7;
                    }
                    i14++;
                    k31 = k35;
                    i11 = i11;
                }
                int i311112 = i11;
                k32 = k31;
                i15 = 0;
                while (i15 < 2) {
                    i16 = 0;
                    while (i16 < size2) {
                        c0731Rg = (C0731Rg) arrayList.get(i16);
                        if (c0731Rg instanceof AbstractC2636rB) {
                            iQ3 = c0731Rg.q();
                            iK2 = c0731Rg.k();
                            arrayList3 = arrayList;
                            int i311113 = c0731Rg.a0;
                            i18 = size2;
                            zN = na0.N(i15 == 1 ? 2 : 1, c0731Rg, k32) | z6;
                            iQ4 = c0731Rg.q();
                            k34 = k32;
                            iK3 = c0731Rg.k();
                            if (iQ4 != iQ3) {
                                c0731Rg.O(iQ4);
                                if (!z4) {
                                }
                                zN = true;
                            }
                            if (iK3 != iK2) {
                                c0731Rg.L(iK3);
                                if (!z5) {
                                }
                                zN = true;
                            }
                            if (c0731Rg.E) {
                                z6 = zN;
                            } else {
                                z6 = zN;
                            }
                        } else {
                            iQ3 = c0731Rg.q();
                            iK2 = c0731Rg.k();
                            arrayList3 = arrayList;
                            int i311114 = c0731Rg.a0;
                            i18 = size2;
                            zN = na0.N(i15 == 1 ? 2 : 1, c0731Rg, k32) | z6;
                            iQ4 = c0731Rg.q();
                            k34 = k32;
                            iK3 = c0731Rg.k();
                            if (iQ4 != iQ3) {
                                c0731Rg.O(iQ4);
                                if (!z4) {
                                }
                                zN = true;
                            }
                            if (iK3 != iK2) {
                                c0731Rg.L(iK3);
                                if (!z5) {
                                }
                                zN = true;
                            }
                            if (c0731Rg.E) {
                                z6 = zN;
                            } else {
                                z6 = zN;
                            }
                        }
                        i16++;
                        arrayList = arrayList3;
                        size2 = i18;
                        k32 = k34;
                    }
                    k33 = k32;
                    arrayList2 = arrayList;
                    i17 = size2;
                    if (z6) {
                        break;
                        break;
                    }
                    i15++;
                    na0.R(c0757Sg, i15, i12, i13);
                    k32 = k33;
                    arrayList = arrayList2;
                    size2 = i17;
                    z6 = false;
                }
                c0757Sg3 = c0757Sg;
                i11 = i311112;
            }
            c0757Sg3.D0 = i11;
            C2742sK.p = c0757Sg3.W(512);
        }
        if (childCount2 == 0) {
            iMax2 = Math.max(0, this.p);
        } else {
            i4 = 2;
        }
        iMin2 = 0;
        iQ = c0757Sg.q();
        c2298nm = c0757Sg3.s0;
        i5 = iMin;
        if (i5 == iQ) {
            c2298nm.c = true;
        } else {
            c2298nm.c = true;
        }
        c0757Sg3.Y = 0;
        c0757Sg3.Z = 0;
        int i311115 = this.q - i35;
        iArr = c0757Sg3.C;
        iArr[0] = i311115;
        iArr[1] = this.r - i34;
        c0757Sg3.b0 = 0;
        c0757Sg3.c0 = 0;
        c0757Sg3.M(i31);
        c0757Sg3.O(i5);
        c0757Sg3.N(i4);
        c0757Sg3.L(iMin2);
        i6 = this.f13o - i35;
        if (i6 < 0) {
            c0757Sg3.b0 = 0;
        } else {
            c0757Sg3.b0 = i6;
        }
        i7 = this.p - i34;
        if (i7 < 0) {
            c0757Sg3.c0 = 0;
        } else {
            c0757Sg3.c0 = i7;
        }
        c0757Sg3.x0 = iMax7;
        c0757Sg3.y0 = iMax5;
        na0 = c0757Sg3.r0;
        na0.getClass();
        k30 = c0757Sg3.u0;
        size = c0757Sg3.q0.size();
        iQ2 = c0757Sg.q();
        iK = c0757Sg.k();
        zS = zy0.s(i, 128);
        if (zS) {
            z = true;
        } else {
            z = true;
        }
        if (z) {
            i29 = 0;
            while (true) {
                if (i29 < size) {
                    c0731Rg4 = (C0731Rg) c0757Sg3.q0.get(i29);
                    iArr4 = c0731Rg4.p0;
                    if (iArr4[0] == 3) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (iArr4[1] == 3) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (z14) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    if (!c0731Rg4.x()) {
                    }
                    i8 = 1073741824;
                    z = false;
                } else {
                    i8 = 1073741824;
                }
            }
        } else {
            i8 = 1073741824;
        }
        z2 = ((mode != i8 && mode2 == i8) || zS) & z;
        if (z2) {
            iMin3 = Math.min(iArr[0], i32);
            iMin4 = Math.min(iArr[1], i33);
            if (mode == 1073741824) {
                c0757Sg3.O(iMin3);
                c0757Sg3.s0.b = true;
            }
            if (mode2 == 1073741824) {
                c0757Sg3.L(iMin4);
                c0757Sg3.s0.b = true;
            }
            if (mode == 1073741824) {
                z3 = z2;
                k31 = k30;
                iQ2 = iQ2;
                i9 = iK;
                z9 = c2298nm.b;
                c0757Sg2 = c2298nm.a;
                if (z9) {
                    while (r0.hasNext()) {
                        c0731Rg5.h();
                        c0731Rg5.a = false;
                        TC tc11110 = c0731Rg5.d;
                        tc11110.e.j = false;
                        tc11110.g = false;
                        tc11110.n();
                        As0 as1119 = c0731Rg5.e;
                        as1119.e.j = false;
                        as1119.g = false;
                        as1119.m();
                    }
                    i22 = 0;
                    c0757Sg2.h();
                    c0757Sg2.a = false;
                    TC tc11111 = c0757Sg2.d;
                    tc11111.e.j = false;
                    tc11111.g = false;
                    tc11111.n();
                    As0 as11110 = c0757Sg2.e;
                    as11110.e.j = false;
                    as11110.g = false;
                    as11110.m();
                    c2298nm.c();
                } else {
                    i22 = 0;
                }
                c2298nm.b(c2298nm.d);
                c0757Sg2.Y = i22;
                c0757Sg2.Z = i22;
                c0757Sg2.d.h.d(i22);
                c0757Sg2.e.h.d(i22);
                i23 = 1073741824;
                if (mode == 1073741824) {
                    i24 = 1;
                    zT2 = c0757Sg3.T(i22, zS) & true;
                    i10 = 1;
                } else {
                    i24 = 1;
                    i10 = 0;
                    zT2 = true;
                }
                if (mode2 == 1073741824) {
                    zT = zT2 & c0757Sg3.T(i24, zS);
                    i10++;
                } else {
                    zT = zT2;
                }
            } else {
                z3 = z2;
                k31 = k30;
                iQ2 = iQ2;
                i9 = iK;
                z9 = c2298nm.b;
                c0757Sg2 = c2298nm.a;
                if (z9) {
                    while (r0.hasNext()) {
                        c0731Rg5.h();
                        c0731Rg5.a = false;
                        TC tc11112 = c0731Rg5.d;
                        tc11112.e.j = false;
                        tc11112.g = false;
                        tc11112.n();
                        As0 as11111 = c0731Rg5.e;
                        as11111.e.j = false;
                        as11111.g = false;
                        as11111.m();
                    }
                    i22 = 0;
                    c0757Sg2.h();
                    c0757Sg2.a = false;
                    TC tc11113 = c0757Sg2.d;
                    tc11113.e.j = false;
                    tc11113.g = false;
                    tc11113.n();
                    As0 as11112 = c0757Sg2.e;
                    as11112.e.j = false;
                    as11112.g = false;
                    as11112.m();
                    c2298nm.c();
                } else {
                    i22 = 0;
                }
                c2298nm.b(c2298nm.d);
                c0757Sg2.Y = i22;
                c0757Sg2.Z = i22;
                c0757Sg2.d.h.d(i22);
                c0757Sg2.e.h.d(i22);
                i23 = 1073741824;
                if (mode == 1073741824) {
                    i24 = 1;
                    zT2 = c0757Sg3.T(i22, zS) & true;
                    i10 = 1;
                } else {
                    i24 = 1;
                    i10 = 0;
                    zT2 = true;
                }
                if (mode2 == 1073741824) {
                    zT = zT2 & c0757Sg3.T(i24, zS);
                    i10++;
                } else {
                    zT = zT2;
                }
            }
            if (zT) {
                if (mode == i23) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (mode2 == i23) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                c0757Sg3.P(z10, z11);
            }
        } else {
            z3 = z2;
            k31 = k30;
            iQ2 = iQ2;
            i9 = iK;
            i10 = 0;
            zT = false;
        }
        if (zT) {
        }
        i11 = c0757Sg3.D0;
        if (size > 0) {
            size3 = c0757Sg3.q0.size();
            boolean zW11 = c0757Sg3.W(64);
            k36 = c0757Sg3.u0;
            while (i19 < size3) {
                c0731Rg3 = (C0731Rg) c0757Sg3.q0.get(i19);
                if (!(c0731Rg3 instanceof HA)) {
                    iJ = c0731Rg3.j(0);
                    int iJ14 = c0731Rg3.j(1);
                    if (iJ == 3) {
                        z8 = false;
                    } else {
                        z8 = false;
                    }
                    if (z8) {
                    }
                    if (!z8) {
                        na0.N(0, c0731Rg3, k36);
                    }
                }
            }
            constraintLayout = (ConstraintLayout) k36.g;
            childCount = constraintLayout.getChildCount();
            while (i20 < childCount) {
                constraintLayout.getChildAt(i20);
            }
            arrayList4 = constraintLayout.m;
            size4 = arrayList4.size();
            if (size4 > 0) {
                while (i21 < size4) {
                    ((AbstractC0446Gg) arrayList4.get(i21)).getClass();
                }
            }
        }
        na0.W(c0757Sg3);
        arrayList = (ArrayList) na0.m;
        size2 = arrayList.size();
        i12 = iQ2;
        i13 = i9;
        if (size > 0) {
            na0.R(c0757Sg3, 0, i12, i13);
        }
        if (size2 > 0) {
            iArr2 = c0757Sg3.p0;
            if (iArr2[0] == 2) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (iArr2[1] == 2) {
                z5 = true;
            } else {
                z5 = false;
            }
            int iQ110 = c0757Sg.q();
            C0757Sg c0757Sg15 = (C0757Sg) na0.f414o;
            iMax3 = Math.max(iQ110, c0757Sg15.b0);
            iMax4 = Math.max(c0757Sg.k(), c0757Sg15.c0);
            i14 = 0;
            z6 = false;
            while (i14 < size2) {
                c0731Rg2 = (C0731Rg) arrayList.get(i14);
                if (c0731Rg2 instanceof C1636gw) {
                    k35 = k31;
                } else {
                    iQ5 = c0731Rg2.q();
                    iK4 = c0731Rg2.k();
                    k35 = k31;
                    zN2 = z6 | na0.N(1, c0731Rg2, k35);
                    iQ6 = c0731Rg2.q();
                    iK5 = c0731Rg2.k();
                    if (iQ6 != iQ5) {
                        c0731Rg2.O(iQ6);
                        if (z4) {
                            iMax3 = Math.max(iMax3, c0731Rg2.i(4).e() + c0731Rg2.r() + c0731Rg2.U);
                        }
                        z7 = true;
                    } else {
                        z7 = zN2;
                    }
                    if (iK5 != iK4) {
                        c0731Rg2.L(iK5);
                        if (z5) {
                            iMax4 = Math.max(iMax4, c0731Rg2.i(5).e() + c0731Rg2.s() + c0731Rg2.V);
                        }
                        z7 = true;
                    }
                    z6 = ((C1636gw) c0731Rg2).y0 | z7;
                }
                i14++;
                k31 = k35;
                i11 = i11;
            }
            int i311116 = i11;
            k32 = k31;
            i15 = 0;
            while (i15 < 2) {
                i16 = 0;
                while (i16 < size2) {
                    c0731Rg = (C0731Rg) arrayList.get(i16);
                    if (c0731Rg instanceof AbstractC2636rB) {
                        iQ3 = c0731Rg.q();
                        iK2 = c0731Rg.k();
                        arrayList3 = arrayList;
                        int i311117 = c0731Rg.a0;
                        i18 = size2;
                        zN = na0.N(i15 == 1 ? 2 : 1, c0731Rg, k32) | z6;
                        iQ4 = c0731Rg.q();
                        k34 = k32;
                        iK3 = c0731Rg.k();
                        if (iQ4 != iQ3) {
                            c0731Rg.O(iQ4);
                            if (!z4) {
                            }
                            zN = true;
                        }
                        if (iK3 != iK2) {
                            c0731Rg.L(iK3);
                            if (!z5) {
                            }
                            zN = true;
                        }
                        if (c0731Rg.E) {
                            z6 = zN;
                        } else {
                            z6 = zN;
                        }
                    } else {
                        iQ3 = c0731Rg.q();
                        iK2 = c0731Rg.k();
                        arrayList3 = arrayList;
                        int i311118 = c0731Rg.a0;
                        i18 = size2;
                        zN = na0.N(i15 == 1 ? 2 : 1, c0731Rg, k32) | z6;
                        iQ4 = c0731Rg.q();
                        k34 = k32;
                        iK3 = c0731Rg.k();
                        if (iQ4 != iQ3) {
                            c0731Rg.O(iQ4);
                            if (!z4) {
                            }
                            zN = true;
                        }
                        if (iK3 != iK2) {
                            c0731Rg.L(iK3);
                            if (!z5) {
                            }
                            zN = true;
                        }
                        if (c0731Rg.E) {
                            z6 = zN;
                        } else {
                            z6 = zN;
                        }
                    }
                    i16++;
                    arrayList = arrayList3;
                    size2 = i18;
                    k32 = k34;
                }
                k33 = k32;
                arrayList2 = arrayList;
                i17 = size2;
                if (z6) {
                    break;
                    break;
                }
                i15++;
                na0.R(c0757Sg, i15, i12, i13);
                k32 = k33;
                arrayList = arrayList2;
                size2 = i17;
                z6 = false;
            }
            c0757Sg3 = c0757Sg;
            i11 = i311116;
        }
        c0757Sg3.D0 = i11;
        C2742sK.p = c0757Sg3.W(512);
        iMin2 = iMax2;
        i4 = 2;
        iQ = c0757Sg.q();
        c2298nm = c0757Sg3.s0;
        i5 = iMin;
        if (i5 == iQ) {
            c2298nm.c = true;
        } else {
            c2298nm.c = true;
        }
        c0757Sg3.Y = 0;
        c0757Sg3.Z = 0;
        int i311119 = this.q - i35;
        iArr = c0757Sg3.C;
        iArr[0] = i311119;
        iArr[1] = this.r - i34;
        c0757Sg3.b0 = 0;
        c0757Sg3.c0 = 0;
        c0757Sg3.M(i31);
        c0757Sg3.O(i5);
        c0757Sg3.N(i4);
        c0757Sg3.L(iMin2);
        i6 = this.f13o - i35;
        if (i6 < 0) {
            c0757Sg3.b0 = 0;
        } else {
            c0757Sg3.b0 = i6;
        }
        i7 = this.p - i34;
        if (i7 < 0) {
            c0757Sg3.c0 = 0;
        } else {
            c0757Sg3.c0 = i7;
        }
        c0757Sg3.x0 = iMax7;
        c0757Sg3.y0 = iMax5;
        na0 = c0757Sg3.r0;
        na0.getClass();
        k30 = c0757Sg3.u0;
        size = c0757Sg3.q0.size();
        iQ2 = c0757Sg.q();
        iK = c0757Sg.k();
        zS = zy0.s(i, 128);
        if (zS) {
            z = true;
        } else {
            z = true;
        }
        if (z) {
            i29 = 0;
            while (true) {
                if (i29 < size) {
                    c0731Rg4 = (C0731Rg) c0757Sg3.q0.get(i29);
                    iArr4 = c0731Rg4.p0;
                    if (iArr4[0] == 3) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (iArr4[1] == 3) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (z14) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    if (!c0731Rg4.x()) {
                    }
                    i8 = 1073741824;
                    z = false;
                } else {
                    i8 = 1073741824;
                }
            }
        } else {
            i8 = 1073741824;
        }
        z2 = ((mode != i8 && mode2 == i8) || zS) & z;
        if (z2) {
            iMin3 = Math.min(iArr[0], i32);
            iMin4 = Math.min(iArr[1], i33);
            if (mode == 1073741824) {
                c0757Sg3.O(iMin3);
                c0757Sg3.s0.b = true;
            }
            if (mode2 == 1073741824) {
                c0757Sg3.L(iMin4);
                c0757Sg3.s0.b = true;
            }
            if (mode == 1073741824) {
                z3 = z2;
                k31 = k30;
                iQ2 = iQ2;
                i9 = iK;
                z9 = c2298nm.b;
                c0757Sg2 = c2298nm.a;
                if (z9) {
                    while (r0.hasNext()) {
                        c0731Rg5.h();
                        c0731Rg5.a = false;
                        TC tc11114 = c0731Rg5.d;
                        tc11114.e.j = false;
                        tc11114.g = false;
                        tc11114.n();
                        As0 as11113 = c0731Rg5.e;
                        as11113.e.j = false;
                        as11113.g = false;
                        as11113.m();
                    }
                    i22 = 0;
                    c0757Sg2.h();
                    c0757Sg2.a = false;
                    TC tc11115 = c0757Sg2.d;
                    tc11115.e.j = false;
                    tc11115.g = false;
                    tc11115.n();
                    As0 as11114 = c0757Sg2.e;
                    as11114.e.j = false;
                    as11114.g = false;
                    as11114.m();
                    c2298nm.c();
                } else {
                    i22 = 0;
                }
                c2298nm.b(c2298nm.d);
                c0757Sg2.Y = i22;
                c0757Sg2.Z = i22;
                c0757Sg2.d.h.d(i22);
                c0757Sg2.e.h.d(i22);
                i23 = 1073741824;
                if (mode == 1073741824) {
                    i24 = 1;
                    zT2 = c0757Sg3.T(i22, zS) & true;
                    i10 = 1;
                } else {
                    i24 = 1;
                    i10 = 0;
                    zT2 = true;
                }
                if (mode2 == 1073741824) {
                    zT = zT2 & c0757Sg3.T(i24, zS);
                    i10++;
                } else {
                    zT = zT2;
                }
            } else {
                z3 = z2;
                k31 = k30;
                iQ2 = iQ2;
                i9 = iK;
                z9 = c2298nm.b;
                c0757Sg2 = c2298nm.a;
                if (z9) {
                    while (r0.hasNext()) {
                        c0731Rg5.h();
                        c0731Rg5.a = false;
                        TC tc11116 = c0731Rg5.d;
                        tc11116.e.j = false;
                        tc11116.g = false;
                        tc11116.n();
                        As0 as11115 = c0731Rg5.e;
                        as11115.e.j = false;
                        as11115.g = false;
                        as11115.m();
                    }
                    i22 = 0;
                    c0757Sg2.h();
                    c0757Sg2.a = false;
                    TC tc11117 = c0757Sg2.d;
                    tc11117.e.j = false;
                    tc11117.g = false;
                    tc11117.n();
                    As0 as11116 = c0757Sg2.e;
                    as11116.e.j = false;
                    as11116.g = false;
                    as11116.m();
                    c2298nm.c();
                } else {
                    i22 = 0;
                }
                c2298nm.b(c2298nm.d);
                c0757Sg2.Y = i22;
                c0757Sg2.Z = i22;
                c0757Sg2.d.h.d(i22);
                c0757Sg2.e.h.d(i22);
                i23 = 1073741824;
                if (mode == 1073741824) {
                    i24 = 1;
                    zT2 = c0757Sg3.T(i22, zS) & true;
                    i10 = 1;
                } else {
                    i24 = 1;
                    i10 = 0;
                    zT2 = true;
                }
                if (mode2 == 1073741824) {
                    zT = zT2 & c0757Sg3.T(i24, zS);
                    i10++;
                } else {
                    zT = zT2;
                }
            }
            if (zT) {
                if (mode == i23) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (mode2 == i23) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                c0757Sg3.P(z10, z11);
            }
        } else {
            z3 = z2;
            k31 = k30;
            iQ2 = iQ2;
            i9 = iK;
            i10 = 0;
            zT = false;
        }
        if (zT) {
        }
        i11 = c0757Sg3.D0;
        if (size > 0) {
            size3 = c0757Sg3.q0.size();
            boolean zW12 = c0757Sg3.W(64);
            k36 = c0757Sg3.u0;
            while (i19 < size3) {
                c0731Rg3 = (C0731Rg) c0757Sg3.q0.get(i19);
                if (!(c0731Rg3 instanceof HA)) {
                    iJ = c0731Rg3.j(0);
                    int iJ15 = c0731Rg3.j(1);
                    if (iJ == 3) {
                        z8 = false;
                    } else {
                        z8 = false;
                    }
                    if (z8) {
                    }
                    if (!z8) {
                        na0.N(0, c0731Rg3, k36);
                    }
                }
            }
            constraintLayout = (ConstraintLayout) k36.g;
            childCount = constraintLayout.getChildCount();
            while (i20 < childCount) {
                constraintLayout.getChildAt(i20);
            }
            arrayList4 = constraintLayout.m;
            size4 = arrayList4.size();
            if (size4 > 0) {
                while (i21 < size4) {
                    ((AbstractC0446Gg) arrayList4.get(i21)).getClass();
                }
            }
        }
        na0.W(c0757Sg3);
        arrayList = (ArrayList) na0.m;
        size2 = arrayList.size();
        i12 = iQ2;
        i13 = i9;
        if (size > 0) {
            na0.R(c0757Sg3, 0, i12, i13);
        }
        if (size2 > 0) {
            iArr2 = c0757Sg3.p0;
            if (iArr2[0] == 2) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (iArr2[1] == 2) {
                z5 = true;
            } else {
                z5 = false;
            }
            int iQ111 = c0757Sg.q();
            C0757Sg c0757Sg16 = (C0757Sg) na0.f414o;
            iMax3 = Math.max(iQ111, c0757Sg16.b0);
            iMax4 = Math.max(c0757Sg.k(), c0757Sg16.c0);
            i14 = 0;
            z6 = false;
            while (i14 < size2) {
                c0731Rg2 = (C0731Rg) arrayList.get(i14);
                if (c0731Rg2 instanceof C1636gw) {
                    k35 = k31;
                } else {
                    iQ5 = c0731Rg2.q();
                    iK4 = c0731Rg2.k();
                    k35 = k31;
                    zN2 = z6 | na0.N(1, c0731Rg2, k35);
                    iQ6 = c0731Rg2.q();
                    iK5 = c0731Rg2.k();
                    if (iQ6 != iQ5) {
                        c0731Rg2.O(iQ6);
                        if (z4) {
                            iMax3 = Math.max(iMax3, c0731Rg2.i(4).e() + c0731Rg2.r() + c0731Rg2.U);
                        }
                        z7 = true;
                    } else {
                        z7 = zN2;
                    }
                    if (iK5 != iK4) {
                        c0731Rg2.L(iK5);
                        if (z5) {
                            iMax4 = Math.max(iMax4, c0731Rg2.i(5).e() + c0731Rg2.s() + c0731Rg2.V);
                        }
                        z7 = true;
                    }
                    z6 = ((C1636gw) c0731Rg2).y0 | z7;
                }
                i14++;
                k31 = k35;
                i11 = i11;
            }
            int i3111110 = i11;
            k32 = k31;
            i15 = 0;
            while (i15 < 2) {
                i16 = 0;
                while (i16 < size2) {
                    c0731Rg = (C0731Rg) arrayList.get(i16);
                    if (c0731Rg instanceof AbstractC2636rB) {
                        iQ3 = c0731Rg.q();
                        iK2 = c0731Rg.k();
                        arrayList3 = arrayList;
                        int i3111111 = c0731Rg.a0;
                        i18 = size2;
                        zN = na0.N(i15 == 1 ? 2 : 1, c0731Rg, k32) | z6;
                        iQ4 = c0731Rg.q();
                        k34 = k32;
                        iK3 = c0731Rg.k();
                        if (iQ4 != iQ3) {
                            c0731Rg.O(iQ4);
                            if (!z4) {
                            }
                            zN = true;
                        }
                        if (iK3 != iK2) {
                            c0731Rg.L(iK3);
                            if (!z5) {
                            }
                            zN = true;
                        }
                        if (c0731Rg.E) {
                            z6 = zN;
                        } else {
                            z6 = zN;
                        }
                    } else {
                        iQ3 = c0731Rg.q();
                        iK2 = c0731Rg.k();
                        arrayList3 = arrayList;
                        int i3111112 = c0731Rg.a0;
                        i18 = size2;
                        zN = na0.N(i15 == 1 ? 2 : 1, c0731Rg, k32) | z6;
                        iQ4 = c0731Rg.q();
                        k34 = k32;
                        iK3 = c0731Rg.k();
                        if (iQ4 != iQ3) {
                            c0731Rg.O(iQ4);
                            if (!z4) {
                            }
                            zN = true;
                        }
                        if (iK3 != iK2) {
                            c0731Rg.L(iK3);
                            if (!z5) {
                            }
                            zN = true;
                        }
                        if (c0731Rg.E) {
                            z6 = zN;
                        } else {
                            z6 = zN;
                        }
                    }
                    i16++;
                    arrayList = arrayList3;
                    size2 = i18;
                    k32 = k34;
                }
                k33 = k32;
                arrayList2 = arrayList;
                i17 = size2;
                if (z6) {
                    break;
                    break;
                }
                i15++;
                na0.R(c0757Sg, i15, i12, i13);
                k32 = k33;
                arrayList = arrayList2;
                size2 = i17;
                z6 = false;
            }
            c0757Sg3 = c0757Sg;
            i11 = i3111110;
        }
        c0757Sg3.D0 = i11;
        C2742sK.p = c0757Sg3.W(512);
        iMin = iMax;
        i31 = 2;
        if (mode2 != Integer.MIN_VALUE) {
            if (childCount2 == 0) {
                iMax2 = Math.max(0, this.p);
            } else {
                iMin2 = i33;
            }
            i4 = 2;
            iQ = c0757Sg.q();
            c2298nm = c0757Sg3.s0;
            i5 = iMin;
            if (i5 == iQ) {
                c2298nm.c = true;
            } else {
                c2298nm.c = true;
            }
            c0757Sg3.Y = 0;
            c0757Sg3.Z = 0;
            int i3111113 = this.q - i35;
            iArr = c0757Sg3.C;
            iArr[0] = i3111113;
            iArr[1] = this.r - i34;
            c0757Sg3.b0 = 0;
            c0757Sg3.c0 = 0;
            c0757Sg3.M(i31);
            c0757Sg3.O(i5);
            c0757Sg3.N(i4);
            c0757Sg3.L(iMin2);
            i6 = this.f13o - i35;
            if (i6 < 0) {
                c0757Sg3.b0 = 0;
            } else {
                c0757Sg3.b0 = i6;
            }
            i7 = this.p - i34;
            if (i7 < 0) {
                c0757Sg3.c0 = 0;
            } else {
                c0757Sg3.c0 = i7;
            }
            c0757Sg3.x0 = iMax7;
            c0757Sg3.y0 = iMax5;
            na0 = c0757Sg3.r0;
            na0.getClass();
            k30 = c0757Sg3.u0;
            size = c0757Sg3.q0.size();
            iQ2 = c0757Sg.q();
            iK = c0757Sg.k();
            zS = zy0.s(i, 128);
            if (zS) {
                z = true;
            } else {
                z = true;
            }
            if (z) {
                i29 = 0;
                while (true) {
                    if (i29 < size) {
                        c0731Rg4 = (C0731Rg) c0757Sg3.q0.get(i29);
                        iArr4 = c0731Rg4.p0;
                        if (iArr4[0] == 3) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (iArr4[1] == 3) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (z14) {
                            z16 = false;
                        } else {
                            z16 = false;
                        }
                        if (!c0731Rg4.x()) {
                        }
                        i8 = 1073741824;
                        z = false;
                    } else {
                        i8 = 1073741824;
                    }
                }
            } else {
                i8 = 1073741824;
            }
            z2 = ((mode != i8 && mode2 == i8) || zS) & z;
            if (z2) {
                iMin3 = Math.min(iArr[0], i32);
                iMin4 = Math.min(iArr[1], i33);
                if (mode == 1073741824) {
                    c0757Sg3.O(iMin3);
                    c0757Sg3.s0.b = true;
                }
                if (mode2 == 1073741824) {
                    c0757Sg3.L(iMin4);
                    c0757Sg3.s0.b = true;
                }
                if (mode == 1073741824) {
                    z3 = z2;
                    k31 = k30;
                    iQ2 = iQ2;
                    i9 = iK;
                    z9 = c2298nm.b;
                    c0757Sg2 = c2298nm.a;
                    if (z9) {
                        while (r0.hasNext()) {
                            c0731Rg5.h();
                            c0731Rg5.a = false;
                            TC tc11118 = c0731Rg5.d;
                            tc11118.e.j = false;
                            tc11118.g = false;
                            tc11118.n();
                            As0 as11117 = c0731Rg5.e;
                            as11117.e.j = false;
                            as11117.g = false;
                            as11117.m();
                        }
                        i22 = 0;
                        c0757Sg2.h();
                        c0757Sg2.a = false;
                        TC tc11119 = c0757Sg2.d;
                        tc11119.e.j = false;
                        tc11119.g = false;
                        tc11119.n();
                        As0 as11118 = c0757Sg2.e;
                        as11118.e.j = false;
                        as11118.g = false;
                        as11118.m();
                        c2298nm.c();
                    } else {
                        i22 = 0;
                    }
                    c2298nm.b(c2298nm.d);
                    c0757Sg2.Y = i22;
                    c0757Sg2.Z = i22;
                    c0757Sg2.d.h.d(i22);
                    c0757Sg2.e.h.d(i22);
                    i23 = 1073741824;
                    if (mode == 1073741824) {
                        i24 = 1;
                        zT2 = c0757Sg3.T(i22, zS) & true;
                        i10 = 1;
                    } else {
                        i24 = 1;
                        i10 = 0;
                        zT2 = true;
                    }
                    if (mode2 == 1073741824) {
                        zT = zT2 & c0757Sg3.T(i24, zS);
                        i10++;
                    } else {
                        zT = zT2;
                    }
                } else {
                    z3 = z2;
                    k31 = k30;
                    iQ2 = iQ2;
                    i9 = iK;
                    z9 = c2298nm.b;
                    c0757Sg2 = c2298nm.a;
                    if (z9) {
                        while (r0.hasNext()) {
                            c0731Rg5.h();
                            c0731Rg5.a = false;
                            TC tc111110 = c0731Rg5.d;
                            tc111110.e.j = false;
                            tc111110.g = false;
                            tc111110.n();
                            As0 as11119 = c0731Rg5.e;
                            as11119.e.j = false;
                            as11119.g = false;
                            as11119.m();
                        }
                        i22 = 0;
                        c0757Sg2.h();
                        c0757Sg2.a = false;
                        TC tc111111 = c0757Sg2.d;
                        tc111111.e.j = false;
                        tc111111.g = false;
                        tc111111.n();
                        As0 as111110 = c0757Sg2.e;
                        as111110.e.j = false;
                        as111110.g = false;
                        as111110.m();
                        c2298nm.c();
                    } else {
                        i22 = 0;
                    }
                    c2298nm.b(c2298nm.d);
                    c0757Sg2.Y = i22;
                    c0757Sg2.Z = i22;
                    c0757Sg2.d.h.d(i22);
                    c0757Sg2.e.h.d(i22);
                    i23 = 1073741824;
                    if (mode == 1073741824) {
                        i24 = 1;
                        zT2 = c0757Sg3.T(i22, zS) & true;
                        i10 = 1;
                    } else {
                        i24 = 1;
                        i10 = 0;
                        zT2 = true;
                    }
                    if (mode2 == 1073741824) {
                        zT = zT2 & c0757Sg3.T(i24, zS);
                        i10++;
                    } else {
                        zT = zT2;
                    }
                }
                if (zT) {
                    if (mode == i23) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (mode2 == i23) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    c0757Sg3.P(z10, z11);
                }
            } else {
                z3 = z2;
                k31 = k30;
                iQ2 = iQ2;
                i9 = iK;
                i10 = 0;
                zT = false;
            }
            if (zT) {
            }
            i11 = c0757Sg3.D0;
            if (size > 0) {
                size3 = c0757Sg3.q0.size();
                boolean zW13 = c0757Sg3.W(64);
                k36 = c0757Sg3.u0;
                while (i19 < size3) {
                    c0731Rg3 = (C0731Rg) c0757Sg3.q0.get(i19);
                    if (!(c0731Rg3 instanceof HA)) {
                        iJ = c0731Rg3.j(0);
                        int iJ16 = c0731Rg3.j(1);
                        if (iJ == 3) {
                            z8 = false;
                        } else {
                            z8 = false;
                        }
                        if (z8) {
                        }
                        if (!z8) {
                            na0.N(0, c0731Rg3, k36);
                        }
                    }
                }
                constraintLayout = (ConstraintLayout) k36.g;
                childCount = constraintLayout.getChildCount();
                while (i20 < childCount) {
                    constraintLayout.getChildAt(i20);
                }
                arrayList4 = constraintLayout.m;
                size4 = arrayList4.size();
                if (size4 > 0) {
                    while (i21 < size4) {
                        ((AbstractC0446Gg) arrayList4.get(i21)).getClass();
                    }
                }
            }
            na0.W(c0757Sg3);
            arrayList = (ArrayList) na0.m;
            size2 = arrayList.size();
            i12 = iQ2;
            i13 = i9;
            if (size > 0) {
                na0.R(c0757Sg3, 0, i12, i13);
            }
            if (size2 > 0) {
                iArr2 = c0757Sg3.p0;
                if (iArr2[0] == 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (iArr2[1] == 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                int iQ112 = c0757Sg.q();
                C0757Sg c0757Sg17 = (C0757Sg) na0.f414o;
                iMax3 = Math.max(iQ112, c0757Sg17.b0);
                iMax4 = Math.max(c0757Sg.k(), c0757Sg17.c0);
                i14 = 0;
                z6 = false;
                while (i14 < size2) {
                    c0731Rg2 = (C0731Rg) arrayList.get(i14);
                    if (c0731Rg2 instanceof C1636gw) {
                        k35 = k31;
                    } else {
                        iQ5 = c0731Rg2.q();
                        iK4 = c0731Rg2.k();
                        k35 = k31;
                        zN2 = z6 | na0.N(1, c0731Rg2, k35);
                        iQ6 = c0731Rg2.q();
                        iK5 = c0731Rg2.k();
                        if (iQ6 != iQ5) {
                            c0731Rg2.O(iQ6);
                            if (z4) {
                                iMax3 = Math.max(iMax3, c0731Rg2.i(4).e() + c0731Rg2.r() + c0731Rg2.U);
                            }
                            z7 = true;
                        } else {
                            z7 = zN2;
                        }
                        if (iK5 != iK4) {
                            c0731Rg2.L(iK5);
                            if (z5) {
                                iMax4 = Math.max(iMax4, c0731Rg2.i(5).e() + c0731Rg2.s() + c0731Rg2.V);
                            }
                            z7 = true;
                        }
                        z6 = ((C1636gw) c0731Rg2).y0 | z7;
                    }
                    i14++;
                    k31 = k35;
                    i11 = i11;
                }
                int i3111114 = i11;
                k32 = k31;
                i15 = 0;
                while (i15 < 2) {
                    i16 = 0;
                    while (i16 < size2) {
                        c0731Rg = (C0731Rg) arrayList.get(i16);
                        if (c0731Rg instanceof AbstractC2636rB) {
                            iQ3 = c0731Rg.q();
                            iK2 = c0731Rg.k();
                            arrayList3 = arrayList;
                            int i3111115 = c0731Rg.a0;
                            i18 = size2;
                            zN = na0.N(i15 == 1 ? 2 : 1, c0731Rg, k32) | z6;
                            iQ4 = c0731Rg.q();
                            k34 = k32;
                            iK3 = c0731Rg.k();
                            if (iQ4 != iQ3) {
                                c0731Rg.O(iQ4);
                                if (!z4) {
                                }
                                zN = true;
                            }
                            if (iK3 != iK2) {
                                c0731Rg.L(iK3);
                                if (!z5) {
                                }
                                zN = true;
                            }
                            if (c0731Rg.E) {
                                z6 = zN;
                            } else {
                                z6 = zN;
                            }
                        } else {
                            iQ3 = c0731Rg.q();
                            iK2 = c0731Rg.k();
                            arrayList3 = arrayList;
                            int i3111116 = c0731Rg.a0;
                            i18 = size2;
                            zN = na0.N(i15 == 1 ? 2 : 1, c0731Rg, k32) | z6;
                            iQ4 = c0731Rg.q();
                            k34 = k32;
                            iK3 = c0731Rg.k();
                            if (iQ4 != iQ3) {
                                c0731Rg.O(iQ4);
                                if (!z4) {
                                }
                                zN = true;
                            }
                            if (iK3 != iK2) {
                                c0731Rg.L(iK3);
                                if (!z5) {
                                }
                                zN = true;
                            }
                            if (c0731Rg.E) {
                                z6 = zN;
                            } else {
                                z6 = zN;
                            }
                        }
                        i16++;
                        arrayList = arrayList3;
                        size2 = i18;
                        k32 = k34;
                    }
                    k33 = k32;
                    arrayList2 = arrayList;
                    i17 = size2;
                    if (z6) {
                        break;
                        break;
                    }
                    i15++;
                    na0.R(c0757Sg, i15, i12, i13);
                    k32 = k33;
                    arrayList = arrayList2;
                    size2 = i17;
                    z6 = false;
                }
                c0757Sg3 = c0757Sg;
                i11 = i3111114;
            }
            c0757Sg3.D0 = i11;
            C2742sK.p = c0757Sg3.W(512);
        }
        if (mode2 != 0) {
            if (mode2 != 1073741824) {
                i4 = 1;
            } else {
                iMin2 = Math.min(this.r - i34, i33);
                i4 = 1;
            }
            iQ = c0757Sg.q();
            c2298nm = c0757Sg3.s0;
            i5 = iMin;
            if (i5 == iQ) {
                c2298nm.c = true;
            } else {
                c2298nm.c = true;
            }
            c0757Sg3.Y = 0;
            c0757Sg3.Z = 0;
            int i3111117 = this.q - i35;
            iArr = c0757Sg3.C;
            iArr[0] = i3111117;
            iArr[1] = this.r - i34;
            c0757Sg3.b0 = 0;
            c0757Sg3.c0 = 0;
            c0757Sg3.M(i31);
            c0757Sg3.O(i5);
            c0757Sg3.N(i4);
            c0757Sg3.L(iMin2);
            i6 = this.f13o - i35;
            if (i6 < 0) {
                c0757Sg3.b0 = 0;
            } else {
                c0757Sg3.b0 = i6;
            }
            i7 = this.p - i34;
            if (i7 < 0) {
                c0757Sg3.c0 = 0;
            } else {
                c0757Sg3.c0 = i7;
            }
            c0757Sg3.x0 = iMax7;
            c0757Sg3.y0 = iMax5;
            na0 = c0757Sg3.r0;
            na0.getClass();
            k30 = c0757Sg3.u0;
            size = c0757Sg3.q0.size();
            iQ2 = c0757Sg.q();
            iK = c0757Sg.k();
            zS = zy0.s(i, 128);
            if (zS) {
                z = true;
            } else {
                z = true;
            }
            if (z) {
                i29 = 0;
                while (true) {
                    if (i29 < size) {
                        c0731Rg4 = (C0731Rg) c0757Sg3.q0.get(i29);
                        iArr4 = c0731Rg4.p0;
                        if (iArr4[0] == 3) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (iArr4[1] == 3) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (z14) {
                            z16 = false;
                        } else {
                            z16 = false;
                        }
                        if (!c0731Rg4.x()) {
                        }
                        i8 = 1073741824;
                        z = false;
                    } else {
                        i8 = 1073741824;
                    }
                }
            } else {
                i8 = 1073741824;
            }
            z2 = ((mode != i8 && mode2 == i8) || zS) & z;
            if (z2) {
                iMin3 = Math.min(iArr[0], i32);
                iMin4 = Math.min(iArr[1], i33);
                if (mode == 1073741824) {
                    c0757Sg3.O(iMin3);
                    c0757Sg3.s0.b = true;
                }
                if (mode2 == 1073741824) {
                    c0757Sg3.L(iMin4);
                    c0757Sg3.s0.b = true;
                }
                if (mode == 1073741824) {
                    z3 = z2;
                    k31 = k30;
                    iQ2 = iQ2;
                    i9 = iK;
                    z9 = c2298nm.b;
                    c0757Sg2 = c2298nm.a;
                    if (z9) {
                        while (r0.hasNext()) {
                            c0731Rg5.h();
                            c0731Rg5.a = false;
                            TC tc111112 = c0731Rg5.d;
                            tc111112.e.j = false;
                            tc111112.g = false;
                            tc111112.n();
                            As0 as111111 = c0731Rg5.e;
                            as111111.e.j = false;
                            as111111.g = false;
                            as111111.m();
                        }
                        i22 = 0;
                        c0757Sg2.h();
                        c0757Sg2.a = false;
                        TC tc111113 = c0757Sg2.d;
                        tc111113.e.j = false;
                        tc111113.g = false;
                        tc111113.n();
                        As0 as111112 = c0757Sg2.e;
                        as111112.e.j = false;
                        as111112.g = false;
                        as111112.m();
                        c2298nm.c();
                    } else {
                        i22 = 0;
                    }
                    c2298nm.b(c2298nm.d);
                    c0757Sg2.Y = i22;
                    c0757Sg2.Z = i22;
                    c0757Sg2.d.h.d(i22);
                    c0757Sg2.e.h.d(i22);
                    i23 = 1073741824;
                    if (mode == 1073741824) {
                        i24 = 1;
                        zT2 = c0757Sg3.T(i22, zS) & true;
                        i10 = 1;
                    } else {
                        i24 = 1;
                        i10 = 0;
                        zT2 = true;
                    }
                    if (mode2 == 1073741824) {
                        zT = zT2 & c0757Sg3.T(i24, zS);
                        i10++;
                    } else {
                        zT = zT2;
                    }
                } else {
                    z3 = z2;
                    k31 = k30;
                    iQ2 = iQ2;
                    i9 = iK;
                    z9 = c2298nm.b;
                    c0757Sg2 = c2298nm.a;
                    if (z9) {
                        while (r0.hasNext()) {
                            c0731Rg5.h();
                            c0731Rg5.a = false;
                            TC tc111114 = c0731Rg5.d;
                            tc111114.e.j = false;
                            tc111114.g = false;
                            tc111114.n();
                            As0 as111113 = c0731Rg5.e;
                            as111113.e.j = false;
                            as111113.g = false;
                            as111113.m();
                        }
                        i22 = 0;
                        c0757Sg2.h();
                        c0757Sg2.a = false;
                        TC tc111115 = c0757Sg2.d;
                        tc111115.e.j = false;
                        tc111115.g = false;
                        tc111115.n();
                        As0 as111114 = c0757Sg2.e;
                        as111114.e.j = false;
                        as111114.g = false;
                        as111114.m();
                        c2298nm.c();
                    } else {
                        i22 = 0;
                    }
                    c2298nm.b(c2298nm.d);
                    c0757Sg2.Y = i22;
                    c0757Sg2.Z = i22;
                    c0757Sg2.d.h.d(i22);
                    c0757Sg2.e.h.d(i22);
                    i23 = 1073741824;
                    if (mode == 1073741824) {
                        i24 = 1;
                        zT2 = c0757Sg3.T(i22, zS) & true;
                        i10 = 1;
                    } else {
                        i24 = 1;
                        i10 = 0;
                        zT2 = true;
                    }
                    if (mode2 == 1073741824) {
                        zT = zT2 & c0757Sg3.T(i24, zS);
                        i10++;
                    } else {
                        zT = zT2;
                    }
                }
                if (zT) {
                    if (mode == i23) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (mode2 == i23) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    c0757Sg3.P(z10, z11);
                }
            } else {
                z3 = z2;
                k31 = k30;
                iQ2 = iQ2;
                i9 = iK;
                i10 = 0;
                zT = false;
            }
            if (zT) {
            }
            i11 = c0757Sg3.D0;
            if (size > 0) {
                size3 = c0757Sg3.q0.size();
                boolean zW14 = c0757Sg3.W(64);
                k36 = c0757Sg3.u0;
                while (i19 < size3) {
                    c0731Rg3 = (C0731Rg) c0757Sg3.q0.get(i19);
                    if (!(c0731Rg3 instanceof HA)) {
                        iJ = c0731Rg3.j(0);
                        int iJ17 = c0731Rg3.j(1);
                        if (iJ == 3) {
                            z8 = false;
                        } else {
                            z8 = false;
                        }
                        if (z8) {
                        }
                        if (!z8) {
                            na0.N(0, c0731Rg3, k36);
                        }
                    }
                }
                constraintLayout = (ConstraintLayout) k36.g;
                childCount = constraintLayout.getChildCount();
                while (i20 < childCount) {
                    constraintLayout.getChildAt(i20);
                }
                arrayList4 = constraintLayout.m;
                size4 = arrayList4.size();
                if (size4 > 0) {
                    while (i21 < size4) {
                        ((AbstractC0446Gg) arrayList4.get(i21)).getClass();
                    }
                }
            }
            na0.W(c0757Sg3);
            arrayList = (ArrayList) na0.m;
            size2 = arrayList.size();
            i12 = iQ2;
            i13 = i9;
            if (size > 0) {
                na0.R(c0757Sg3, 0, i12, i13);
            }
            if (size2 > 0) {
                iArr2 = c0757Sg3.p0;
                if (iArr2[0] == 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (iArr2[1] == 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                int iQ113 = c0757Sg.q();
                C0757Sg c0757Sg18 = (C0757Sg) na0.f414o;
                iMax3 = Math.max(iQ113, c0757Sg18.b0);
                iMax4 = Math.max(c0757Sg.k(), c0757Sg18.c0);
                i14 = 0;
                z6 = false;
                while (i14 < size2) {
                    c0731Rg2 = (C0731Rg) arrayList.get(i14);
                    if (c0731Rg2 instanceof C1636gw) {
                        k35 = k31;
                    } else {
                        iQ5 = c0731Rg2.q();
                        iK4 = c0731Rg2.k();
                        k35 = k31;
                        zN2 = z6 | na0.N(1, c0731Rg2, k35);
                        iQ6 = c0731Rg2.q();
                        iK5 = c0731Rg2.k();
                        if (iQ6 != iQ5) {
                            c0731Rg2.O(iQ6);
                            if (z4) {
                                iMax3 = Math.max(iMax3, c0731Rg2.i(4).e() + c0731Rg2.r() + c0731Rg2.U);
                            }
                            z7 = true;
                        } else {
                            z7 = zN2;
                        }
                        if (iK5 != iK4) {
                            c0731Rg2.L(iK5);
                            if (z5) {
                                iMax4 = Math.max(iMax4, c0731Rg2.i(5).e() + c0731Rg2.s() + c0731Rg2.V);
                            }
                            z7 = true;
                        }
                        z6 = ((C1636gw) c0731Rg2).y0 | z7;
                    }
                    i14++;
                    k31 = k35;
                    i11 = i11;
                }
                int i3111118 = i11;
                k32 = k31;
                i15 = 0;
                while (i15 < 2) {
                    i16 = 0;
                    while (i16 < size2) {
                        c0731Rg = (C0731Rg) arrayList.get(i16);
                        if (c0731Rg instanceof AbstractC2636rB) {
                            iQ3 = c0731Rg.q();
                            iK2 = c0731Rg.k();
                            arrayList3 = arrayList;
                            int i3111119 = c0731Rg.a0;
                            i18 = size2;
                            zN = na0.N(i15 == 1 ? 2 : 1, c0731Rg, k32) | z6;
                            iQ4 = c0731Rg.q();
                            k34 = k32;
                            iK3 = c0731Rg.k();
                            if (iQ4 != iQ3) {
                                c0731Rg.O(iQ4);
                                if (!z4) {
                                }
                                zN = true;
                            }
                            if (iK3 != iK2) {
                                c0731Rg.L(iK3);
                                if (!z5) {
                                }
                                zN = true;
                            }
                            if (c0731Rg.E) {
                                z6 = zN;
                            } else {
                                z6 = zN;
                            }
                        } else {
                            iQ3 = c0731Rg.q();
                            iK2 = c0731Rg.k();
                            arrayList3 = arrayList;
                            int i31111110 = c0731Rg.a0;
                            i18 = size2;
                            zN = na0.N(i15 == 1 ? 2 : 1, c0731Rg, k32) | z6;
                            iQ4 = c0731Rg.q();
                            k34 = k32;
                            iK3 = c0731Rg.k();
                            if (iQ4 != iQ3) {
                                c0731Rg.O(iQ4);
                                if (!z4) {
                                }
                                zN = true;
                            }
                            if (iK3 != iK2) {
                                c0731Rg.L(iK3);
                                if (!z5) {
                                }
                                zN = true;
                            }
                            if (c0731Rg.E) {
                                z6 = zN;
                            } else {
                                z6 = zN;
                            }
                        }
                        i16++;
                        arrayList = arrayList3;
                        size2 = i18;
                        k32 = k34;
                    }
                    k33 = k32;
                    arrayList2 = arrayList;
                    i17 = size2;
                    if (z6) {
                        break;
                        break;
                    }
                    i15++;
                    na0.R(c0757Sg, i15, i12, i13);
                    k32 = k33;
                    arrayList = arrayList2;
                    size2 = i17;
                    z6 = false;
                }
                c0757Sg3 = c0757Sg;
                i11 = i3111118;
            }
            c0757Sg3.D0 = i11;
            C2742sK.p = c0757Sg3.W(512);
        }
        if (childCount2 == 0) {
            iMax2 = Math.max(0, this.p);
        } else {
            i4 = 2;
        }
        iMin2 = 0;
        iQ = c0757Sg.q();
        c2298nm = c0757Sg3.s0;
        i5 = iMin;
        if (i5 == iQ) {
            c2298nm.c = true;
        } else {
            c2298nm.c = true;
        }
        c0757Sg3.Y = 0;
        c0757Sg3.Z = 0;
        int i31111111 = this.q - i35;
        iArr = c0757Sg3.C;
        iArr[0] = i31111111;
        iArr[1] = this.r - i34;
        c0757Sg3.b0 = 0;
        c0757Sg3.c0 = 0;
        c0757Sg3.M(i31);
        c0757Sg3.O(i5);
        c0757Sg3.N(i4);
        c0757Sg3.L(iMin2);
        i6 = this.f13o - i35;
        if (i6 < 0) {
            c0757Sg3.b0 = 0;
        } else {
            c0757Sg3.b0 = i6;
        }
        i7 = this.p - i34;
        if (i7 < 0) {
            c0757Sg3.c0 = 0;
        } else {
            c0757Sg3.c0 = i7;
        }
        c0757Sg3.x0 = iMax7;
        c0757Sg3.y0 = iMax5;
        na0 = c0757Sg3.r0;
        na0.getClass();
        k30 = c0757Sg3.u0;
        size = c0757Sg3.q0.size();
        iQ2 = c0757Sg.q();
        iK = c0757Sg.k();
        zS = zy0.s(i, 128);
        if (zS) {
            z = true;
        } else {
            z = true;
        }
        if (z) {
            i29 = 0;
            while (true) {
                if (i29 < size) {
                    c0731Rg4 = (C0731Rg) c0757Sg3.q0.get(i29);
                    iArr4 = c0731Rg4.p0;
                    if (iArr4[0] == 3) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (iArr4[1] == 3) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (z14) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    if (!c0731Rg4.x()) {
                    }
                    i8 = 1073741824;
                    z = false;
                } else {
                    i8 = 1073741824;
                }
            }
        } else {
            i8 = 1073741824;
        }
        z2 = ((mode != i8 && mode2 == i8) || zS) & z;
        if (z2) {
            iMin3 = Math.min(iArr[0], i32);
            iMin4 = Math.min(iArr[1], i33);
            if (mode == 1073741824) {
                c0757Sg3.O(iMin3);
                c0757Sg3.s0.b = true;
            }
            if (mode2 == 1073741824) {
                c0757Sg3.L(iMin4);
                c0757Sg3.s0.b = true;
            }
            if (mode == 1073741824) {
                z3 = z2;
                k31 = k30;
                iQ2 = iQ2;
                i9 = iK;
                z9 = c2298nm.b;
                c0757Sg2 = c2298nm.a;
                if (z9) {
                    while (r0.hasNext()) {
                        c0731Rg5.h();
                        c0731Rg5.a = false;
                        TC tc111116 = c0731Rg5.d;
                        tc111116.e.j = false;
                        tc111116.g = false;
                        tc111116.n();
                        As0 as111115 = c0731Rg5.e;
                        as111115.e.j = false;
                        as111115.g = false;
                        as111115.m();
                    }
                    i22 = 0;
                    c0757Sg2.h();
                    c0757Sg2.a = false;
                    TC tc111117 = c0757Sg2.d;
                    tc111117.e.j = false;
                    tc111117.g = false;
                    tc111117.n();
                    As0 as111116 = c0757Sg2.e;
                    as111116.e.j = false;
                    as111116.g = false;
                    as111116.m();
                    c2298nm.c();
                } else {
                    i22 = 0;
                }
                c2298nm.b(c2298nm.d);
                c0757Sg2.Y = i22;
                c0757Sg2.Z = i22;
                c0757Sg2.d.h.d(i22);
                c0757Sg2.e.h.d(i22);
                i23 = 1073741824;
                if (mode == 1073741824) {
                    i24 = 1;
                    zT2 = c0757Sg3.T(i22, zS) & true;
                    i10 = 1;
                } else {
                    i24 = 1;
                    i10 = 0;
                    zT2 = true;
                }
                if (mode2 == 1073741824) {
                    zT = zT2 & c0757Sg3.T(i24, zS);
                    i10++;
                } else {
                    zT = zT2;
                }
            } else {
                z3 = z2;
                k31 = k30;
                iQ2 = iQ2;
                i9 = iK;
                z9 = c2298nm.b;
                c0757Sg2 = c2298nm.a;
                if (z9) {
                    while (r0.hasNext()) {
                        c0731Rg5.h();
                        c0731Rg5.a = false;
                        TC tc111118 = c0731Rg5.d;
                        tc111118.e.j = false;
                        tc111118.g = false;
                        tc111118.n();
                        As0 as111117 = c0731Rg5.e;
                        as111117.e.j = false;
                        as111117.g = false;
                        as111117.m();
                    }
                    i22 = 0;
                    c0757Sg2.h();
                    c0757Sg2.a = false;
                    TC tc111119 = c0757Sg2.d;
                    tc111119.e.j = false;
                    tc111119.g = false;
                    tc111119.n();
                    As0 as111118 = c0757Sg2.e;
                    as111118.e.j = false;
                    as111118.g = false;
                    as111118.m();
                    c2298nm.c();
                } else {
                    i22 = 0;
                }
                c2298nm.b(c2298nm.d);
                c0757Sg2.Y = i22;
                c0757Sg2.Z = i22;
                c0757Sg2.d.h.d(i22);
                c0757Sg2.e.h.d(i22);
                i23 = 1073741824;
                if (mode == 1073741824) {
                    i24 = 1;
                    zT2 = c0757Sg3.T(i22, zS) & true;
                    i10 = 1;
                } else {
                    i24 = 1;
                    i10 = 0;
                    zT2 = true;
                }
                if (mode2 == 1073741824) {
                    zT = zT2 & c0757Sg3.T(i24, zS);
                    i10++;
                } else {
                    zT = zT2;
                }
            }
            if (zT) {
                if (mode == i23) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (mode2 == i23) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                c0757Sg3.P(z10, z11);
            }
        } else {
            z3 = z2;
            k31 = k30;
            iQ2 = iQ2;
            i9 = iK;
            i10 = 0;
            zT = false;
        }
        if (zT) {
        }
        i11 = c0757Sg3.D0;
        if (size > 0) {
            size3 = c0757Sg3.q0.size();
            boolean zW15 = c0757Sg3.W(64);
            k36 = c0757Sg3.u0;
            while (i19 < size3) {
                c0731Rg3 = (C0731Rg) c0757Sg3.q0.get(i19);
                if (!(c0731Rg3 instanceof HA)) {
                    iJ = c0731Rg3.j(0);
                    int iJ18 = c0731Rg3.j(1);
                    if (iJ == 3) {
                        z8 = false;
                    } else {
                        z8 = false;
                    }
                    if (z8) {
                    }
                    if (!z8) {
                        na0.N(0, c0731Rg3, k36);
                    }
                }
            }
            constraintLayout = (ConstraintLayout) k36.g;
            childCount = constraintLayout.getChildCount();
            while (i20 < childCount) {
                constraintLayout.getChildAt(i20);
            }
            arrayList4 = constraintLayout.m;
            size4 = arrayList4.size();
            if (size4 > 0) {
                while (i21 < size4) {
                    ((AbstractC0446Gg) arrayList4.get(i21)).getClass();
                }
            }
        }
        na0.W(c0757Sg3);
        arrayList = (ArrayList) na0.m;
        size2 = arrayList.size();
        i12 = iQ2;
        i13 = i9;
        if (size > 0) {
            na0.R(c0757Sg3, 0, i12, i13);
        }
        if (size2 > 0) {
            iArr2 = c0757Sg3.p0;
            if (iArr2[0] == 2) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (iArr2[1] == 2) {
                z5 = true;
            } else {
                z5 = false;
            }
            int iQ114 = c0757Sg.q();
            C0757Sg c0757Sg19 = (C0757Sg) na0.f414o;
            iMax3 = Math.max(iQ114, c0757Sg19.b0);
            iMax4 = Math.max(c0757Sg.k(), c0757Sg19.c0);
            i14 = 0;
            z6 = false;
            while (i14 < size2) {
                c0731Rg2 = (C0731Rg) arrayList.get(i14);
                if (c0731Rg2 instanceof C1636gw) {
                    k35 = k31;
                } else {
                    iQ5 = c0731Rg2.q();
                    iK4 = c0731Rg2.k();
                    k35 = k31;
                    zN2 = z6 | na0.N(1, c0731Rg2, k35);
                    iQ6 = c0731Rg2.q();
                    iK5 = c0731Rg2.k();
                    if (iQ6 != iQ5) {
                        c0731Rg2.O(iQ6);
                        if (z4) {
                            iMax3 = Math.max(iMax3, c0731Rg2.i(4).e() + c0731Rg2.r() + c0731Rg2.U);
                        }
                        z7 = true;
                    } else {
                        z7 = zN2;
                    }
                    if (iK5 != iK4) {
                        c0731Rg2.L(iK5);
                        if (z5) {
                            iMax4 = Math.max(iMax4, c0731Rg2.i(5).e() + c0731Rg2.s() + c0731Rg2.V);
                        }
                        z7 = true;
                    }
                    z6 = ((C1636gw) c0731Rg2).y0 | z7;
                }
                i14++;
                k31 = k35;
                i11 = i11;
            }
            int i31111112 = i11;
            k32 = k31;
            i15 = 0;
            while (i15 < 2) {
                i16 = 0;
                while (i16 < size2) {
                    c0731Rg = (C0731Rg) arrayList.get(i16);
                    if (c0731Rg instanceof AbstractC2636rB) {
                        iQ3 = c0731Rg.q();
                        iK2 = c0731Rg.k();
                        arrayList3 = arrayList;
                        int i31111113 = c0731Rg.a0;
                        i18 = size2;
                        zN = na0.N(i15 == 1 ? 2 : 1, c0731Rg, k32) | z6;
                        iQ4 = c0731Rg.q();
                        k34 = k32;
                        iK3 = c0731Rg.k();
                        if (iQ4 != iQ3) {
                            c0731Rg.O(iQ4);
                            if (!z4) {
                            }
                            zN = true;
                        }
                        if (iK3 != iK2) {
                            c0731Rg.L(iK3);
                            if (!z5) {
                            }
                            zN = true;
                        }
                        if (c0731Rg.E) {
                            z6 = zN;
                        } else {
                            z6 = zN;
                        }
                    } else {
                        iQ3 = c0731Rg.q();
                        iK2 = c0731Rg.k();
                        arrayList3 = arrayList;
                        int i31111114 = c0731Rg.a0;
                        i18 = size2;
                        zN = na0.N(i15 == 1 ? 2 : 1, c0731Rg, k32) | z6;
                        iQ4 = c0731Rg.q();
                        k34 = k32;
                        iK3 = c0731Rg.k();
                        if (iQ4 != iQ3) {
                            c0731Rg.O(iQ4);
                            if (!z4) {
                            }
                            zN = true;
                        }
                        if (iK3 != iK2) {
                            c0731Rg.L(iK3);
                            if (!z5) {
                            }
                            zN = true;
                        }
                        if (c0731Rg.E) {
                            z6 = zN;
                        } else {
                            z6 = zN;
                        }
                    }
                    i16++;
                    arrayList = arrayList3;
                    size2 = i18;
                    k32 = k34;
                }
                k33 = k32;
                arrayList2 = arrayList;
                i17 = size2;
                if (z6) {
                    break;
                    break;
                }
                i15++;
                na0.R(c0757Sg, i15, i12, i13);
                k32 = k33;
                arrayList = arrayList2;
                size2 = i17;
                z6 = false;
            }
            c0757Sg3 = c0757Sg;
            i11 = i31111112;
        }
        c0757Sg3.D0 = i11;
        C2742sK.p = c0757Sg3.W(512);
        iMin2 = iMax2;
        i4 = 2;
        iQ = c0757Sg.q();
        c2298nm = c0757Sg3.s0;
        i5 = iMin;
        if (i5 == iQ) {
            c2298nm.c = true;
        } else {
            c2298nm.c = true;
        }
        c0757Sg3.Y = 0;
        c0757Sg3.Z = 0;
        int i31111115 = this.q - i35;
        iArr = c0757Sg3.C;
        iArr[0] = i31111115;
        iArr[1] = this.r - i34;
        c0757Sg3.b0 = 0;
        c0757Sg3.c0 = 0;
        c0757Sg3.M(i31);
        c0757Sg3.O(i5);
        c0757Sg3.N(i4);
        c0757Sg3.L(iMin2);
        i6 = this.f13o - i35;
        if (i6 < 0) {
            c0757Sg3.b0 = 0;
        } else {
            c0757Sg3.b0 = i6;
        }
        i7 = this.p - i34;
        if (i7 < 0) {
            c0757Sg3.c0 = 0;
        } else {
            c0757Sg3.c0 = i7;
        }
        c0757Sg3.x0 = iMax7;
        c0757Sg3.y0 = iMax5;
        na0 = c0757Sg3.r0;
        na0.getClass();
        k30 = c0757Sg3.u0;
        size = c0757Sg3.q0.size();
        iQ2 = c0757Sg.q();
        iK = c0757Sg.k();
        zS = zy0.s(i, 128);
        if (zS) {
            z = true;
        } else {
            z = true;
        }
        if (z) {
            i29 = 0;
            while (true) {
                if (i29 < size) {
                    c0731Rg4 = (C0731Rg) c0757Sg3.q0.get(i29);
                    iArr4 = c0731Rg4.p0;
                    if (iArr4[0] == 3) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (iArr4[1] == 3) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (z14) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    if (!c0731Rg4.x()) {
                    }
                    i8 = 1073741824;
                    z = false;
                } else {
                    i8 = 1073741824;
                }
            }
        } else {
            i8 = 1073741824;
        }
        z2 = ((mode != i8 && mode2 == i8) || zS) & z;
        if (z2) {
            iMin3 = Math.min(iArr[0], i32);
            iMin4 = Math.min(iArr[1], i33);
            if (mode == 1073741824) {
                c0757Sg3.O(iMin3);
                c0757Sg3.s0.b = true;
            }
            if (mode2 == 1073741824) {
                c0757Sg3.L(iMin4);
                c0757Sg3.s0.b = true;
            }
            if (mode == 1073741824) {
                z3 = z2;
                k31 = k30;
                iQ2 = iQ2;
                i9 = iK;
                z9 = c2298nm.b;
                c0757Sg2 = c2298nm.a;
                if (z9) {
                    while (r0.hasNext()) {
                        c0731Rg5.h();
                        c0731Rg5.a = false;
                        TC tc1111110 = c0731Rg5.d;
                        tc1111110.e.j = false;
                        tc1111110.g = false;
                        tc1111110.n();
                        As0 as111119 = c0731Rg5.e;
                        as111119.e.j = false;
                        as111119.g = false;
                        as111119.m();
                    }
                    i22 = 0;
                    c0757Sg2.h();
                    c0757Sg2.a = false;
                    TC tc1111111 = c0757Sg2.d;
                    tc1111111.e.j = false;
                    tc1111111.g = false;
                    tc1111111.n();
                    As0 as1111110 = c0757Sg2.e;
                    as1111110.e.j = false;
                    as1111110.g = false;
                    as1111110.m();
                    c2298nm.c();
                } else {
                    i22 = 0;
                }
                c2298nm.b(c2298nm.d);
                c0757Sg2.Y = i22;
                c0757Sg2.Z = i22;
                c0757Sg2.d.h.d(i22);
                c0757Sg2.e.h.d(i22);
                i23 = 1073741824;
                if (mode == 1073741824) {
                    i24 = 1;
                    zT2 = c0757Sg3.T(i22, zS) & true;
                    i10 = 1;
                } else {
                    i24 = 1;
                    i10 = 0;
                    zT2 = true;
                }
                if (mode2 == 1073741824) {
                    zT = zT2 & c0757Sg3.T(i24, zS);
                    i10++;
                } else {
                    zT = zT2;
                }
            } else {
                z3 = z2;
                k31 = k30;
                iQ2 = iQ2;
                i9 = iK;
                z9 = c2298nm.b;
                c0757Sg2 = c2298nm.a;
                if (z9) {
                    while (r0.hasNext()) {
                        c0731Rg5.h();
                        c0731Rg5.a = false;
                        TC tc1111112 = c0731Rg5.d;
                        tc1111112.e.j = false;
                        tc1111112.g = false;
                        tc1111112.n();
                        As0 as1111111 = c0731Rg5.e;
                        as1111111.e.j = false;
                        as1111111.g = false;
                        as1111111.m();
                    }
                    i22 = 0;
                    c0757Sg2.h();
                    c0757Sg2.a = false;
                    TC tc1111113 = c0757Sg2.d;
                    tc1111113.e.j = false;
                    tc1111113.g = false;
                    tc1111113.n();
                    As0 as1111112 = c0757Sg2.e;
                    as1111112.e.j = false;
                    as1111112.g = false;
                    as1111112.m();
                    c2298nm.c();
                } else {
                    i22 = 0;
                }
                c2298nm.b(c2298nm.d);
                c0757Sg2.Y = i22;
                c0757Sg2.Z = i22;
                c0757Sg2.d.h.d(i22);
                c0757Sg2.e.h.d(i22);
                i23 = 1073741824;
                if (mode == 1073741824) {
                    i24 = 1;
                    zT2 = c0757Sg3.T(i22, zS) & true;
                    i10 = 1;
                } else {
                    i24 = 1;
                    i10 = 0;
                    zT2 = true;
                }
                if (mode2 == 1073741824) {
                    zT = zT2 & c0757Sg3.T(i24, zS);
                    i10++;
                } else {
                    zT = zT2;
                }
            }
            if (zT) {
                if (mode == i23) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (mode2 == i23) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                c0757Sg3.P(z10, z11);
            }
        } else {
            z3 = z2;
            k31 = k30;
            iQ2 = iQ2;
            i9 = iK;
            i10 = 0;
            zT = false;
        }
        if (zT) {
        }
        i11 = c0757Sg3.D0;
        if (size > 0) {
            size3 = c0757Sg3.q0.size();
            boolean zW16 = c0757Sg3.W(64);
            k36 = c0757Sg3.u0;
            while (i19 < size3) {
                c0731Rg3 = (C0731Rg) c0757Sg3.q0.get(i19);
                if (!(c0731Rg3 instanceof HA)) {
                    iJ = c0731Rg3.j(0);
                    int iJ19 = c0731Rg3.j(1);
                    if (iJ == 3) {
                        z8 = false;
                    } else {
                        z8 = false;
                    }
                    if (z8) {
                    }
                    if (!z8) {
                        na0.N(0, c0731Rg3, k36);
                    }
                }
            }
            constraintLayout = (ConstraintLayout) k36.g;
            childCount = constraintLayout.getChildCount();
            while (i20 < childCount) {
                constraintLayout.getChildAt(i20);
            }
            arrayList4 = constraintLayout.m;
            size4 = arrayList4.size();
            if (size4 > 0) {
                while (i21 < size4) {
                    ((AbstractC0446Gg) arrayList4.get(i21)).getClass();
                }
            }
        }
        na0.W(c0757Sg3);
        arrayList = (ArrayList) na0.m;
        size2 = arrayList.size();
        i12 = iQ2;
        i13 = i9;
        if (size > 0) {
            na0.R(c0757Sg3, 0, i12, i13);
        }
        if (size2 > 0) {
            iArr2 = c0757Sg3.p0;
            if (iArr2[0] == 2) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (iArr2[1] == 2) {
                z5 = true;
            } else {
                z5 = false;
            }
            int iQ115 = c0757Sg.q();
            C0757Sg c0757Sg110 = (C0757Sg) na0.f414o;
            iMax3 = Math.max(iQ115, c0757Sg110.b0);
            iMax4 = Math.max(c0757Sg.k(), c0757Sg110.c0);
            i14 = 0;
            z6 = false;
            while (i14 < size2) {
                c0731Rg2 = (C0731Rg) arrayList.get(i14);
                if (c0731Rg2 instanceof C1636gw) {
                    k35 = k31;
                } else {
                    iQ5 = c0731Rg2.q();
                    iK4 = c0731Rg2.k();
                    k35 = k31;
                    zN2 = z6 | na0.N(1, c0731Rg2, k35);
                    iQ6 = c0731Rg2.q();
                    iK5 = c0731Rg2.k();
                    if (iQ6 != iQ5) {
                        c0731Rg2.O(iQ6);
                        if (z4) {
                            iMax3 = Math.max(iMax3, c0731Rg2.i(4).e() + c0731Rg2.r() + c0731Rg2.U);
                        }
                        z7 = true;
                    } else {
                        z7 = zN2;
                    }
                    if (iK5 != iK4) {
                        c0731Rg2.L(iK5);
                        if (z5) {
                            iMax4 = Math.max(iMax4, c0731Rg2.i(5).e() + c0731Rg2.s() + c0731Rg2.V);
                        }
                        z7 = true;
                    }
                    z6 = ((C1636gw) c0731Rg2).y0 | z7;
                }
                i14++;
                k31 = k35;
                i11 = i11;
            }
            int i31111116 = i11;
            k32 = k31;
            i15 = 0;
            while (i15 < 2) {
                i16 = 0;
                while (i16 < size2) {
                    c0731Rg = (C0731Rg) arrayList.get(i16);
                    if (c0731Rg instanceof AbstractC2636rB) {
                        iQ3 = c0731Rg.q();
                        iK2 = c0731Rg.k();
                        arrayList3 = arrayList;
                        int i31111117 = c0731Rg.a0;
                        i18 = size2;
                        zN = na0.N(i15 == 1 ? 2 : 1, c0731Rg, k32) | z6;
                        iQ4 = c0731Rg.q();
                        k34 = k32;
                        iK3 = c0731Rg.k();
                        if (iQ4 != iQ3) {
                            c0731Rg.O(iQ4);
                            if (!z4) {
                            }
                            zN = true;
                        }
                        if (iK3 != iK2) {
                            c0731Rg.L(iK3);
                            if (!z5) {
                            }
                            zN = true;
                        }
                        if (c0731Rg.E) {
                            z6 = zN;
                        } else {
                            z6 = zN;
                        }
                    } else {
                        iQ3 = c0731Rg.q();
                        iK2 = c0731Rg.k();
                        arrayList3 = arrayList;
                        int i31111118 = c0731Rg.a0;
                        i18 = size2;
                        zN = na0.N(i15 == 1 ? 2 : 1, c0731Rg, k32) | z6;
                        iQ4 = c0731Rg.q();
                        k34 = k32;
                        iK3 = c0731Rg.k();
                        if (iQ4 != iQ3) {
                            c0731Rg.O(iQ4);
                            if (!z4) {
                            }
                            zN = true;
                        }
                        if (iK3 != iK2) {
                            c0731Rg.L(iK3);
                            if (!z5) {
                            }
                            zN = true;
                        }
                        if (c0731Rg.E) {
                            z6 = zN;
                        } else {
                            z6 = zN;
                        }
                    }
                    i16++;
                    arrayList = arrayList3;
                    size2 = i18;
                    k32 = k34;
                }
                k33 = k32;
                arrayList2 = arrayList;
                i17 = size2;
                if (z6) {
                    break;
                    break;
                }
                i15++;
                na0.R(c0757Sg, i15, i12, i13);
                k32 = k33;
                arrayList = arrayList2;
                size2 = i17;
                z6 = false;
            }
            c0757Sg3 = c0757Sg;
            i11 = i31111116;
        }
        c0757Sg3.D0 = i11;
        C2742sK.p = c0757Sg3.W(512);
    }

    public final void l(C0731Rg c0731Rg, C0498Ig c0498Ig, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.l.get(i);
        C0731Rg c0731Rg2 = (C0731Rg) sparseArray.get(i);
        if (c0731Rg2 == null || view == null || !(view.getLayoutParams() instanceof C0498Ig)) {
            return;
        }
        c0498Ig.c0 = true;
        if (i2 == 6) {
            C0498Ig c0498Ig2 = (C0498Ig) view.getLayoutParams();
            c0498Ig2.c0 = true;
            c0498Ig2.p0.E = true;
        }
        c0731Rg.i(6).b(c0731Rg2.i(i2), c0498Ig.D, c0498Ig.C, true);
        c0731Rg.E = true;
        c0731Rg.i(3).j();
        c0731Rg.i(5).j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0498Ig c0498Ig = (C0498Ig) childAt.getLayoutParams();
            C0731Rg c0731Rg = c0498Ig.p0;
            if (childAt.getVisibility() != 8 || c0498Ig.d0 || c0498Ig.e0 || zIsInEditMode) {
                int iR = c0731Rg.r();
                int iS = c0731Rg.s();
                childAt.layout(iR, iS, c0731Rg.q() + iR, c0731Rg.k() + iS);
            }
        }
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((AbstractC0446Gg) arrayList.get(i6)).j();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:159:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:161:0x0301  */
    /* JADX WARN: Code duplicated, block: B:162:0x0313  */
    /* JADX WARN: Code duplicated, block: B:168:0x0334  */
    /* JADX WARN: Code duplicated, block: B:170:0x033e  */
    /* JADX WARN: Code duplicated, block: B:171:0x0351  */
    /* JADX WARN: Code duplicated, block: B:178:0x0378  */
    /* JADX WARN: Code duplicated, block: B:180:0x0382  */
    /* JADX WARN: Code duplicated, block: B:181:0x0396  */
    /* JADX WARN: Code duplicated, block: B:188:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:190:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:192:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:193:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:195:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:198:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:201:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:277:0x051e  */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        C0731Rg c0731Rg;
        int i5;
        int i6;
        C0731Rg c0731Rg2;
        int i7;
        int i8;
        C0731Rg c0731Rg3;
        int i9;
        C0498Ig c0498Ig;
        int i10;
        int i11;
        float f;
        C0731Rg c0731Rg4;
        C0731Rg c0731Rg5;
        C0731Rg c0731Rg6;
        int i12;
        int i13;
        float fAbs;
        int i14;
        ArrayList arrayList;
        C0731Rg c0731Rg7;
        ConstraintLayout constraintLayout = this;
        if (constraintLayout.A == i) {
            int i15 = constraintLayout.B;
        }
        int i16 = 0;
        if (!constraintLayout.s) {
            int childCount = getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                if (constraintLayout.getChildAt(i17).isLayoutRequested()) {
                    constraintLayout.s = true;
                    break;
                }
            }
        }
        constraintLayout.A = i;
        constraintLayout.B = i2;
        boolean z2 = (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
        C0757Sg c0757Sg = constraintLayout.n;
        c0757Sg.v0 = z2;
        if (constraintLayout.s) {
            constraintLayout.s = false;
            int childCount2 = getChildCount();
            int i18 = 0;
            while (true) {
                if (i18 >= childCount2) {
                    z = false;
                    break;
                } else {
                    if (constraintLayout.getChildAt(i18).isLayoutRequested()) {
                        z = true;
                        break;
                    }
                    i18++;
                }
            }
            if (z) {
                boolean zIsInEditMode = isInEditMode();
                int childCount3 = getChildCount();
                for (int i19 = 0; i19 < childCount3; i19++) {
                    C0731Rg c0731RgH = constraintLayout.h(constraintLayout.getChildAt(i19));
                    if (c0731RgH != null) {
                        c0731RgH.C();
                    }
                }
                Object obj = null;
                if (zIsInEditMode) {
                    for (int i20 = 0; i20 < childCount3; i20++) {
                        View childAt = constraintLayout.getChildAt(i20);
                        try {
                            String resourceName = getResources().getResourceName(childAt.getId());
                            Integer numValueOf = Integer.valueOf(childAt.getId());
                            if (resourceName instanceof String) {
                                if (constraintLayout.x == null) {
                                    constraintLayout.x = new HashMap();
                                }
                                int iIndexOf = resourceName.indexOf("/");
                                constraintLayout.x.put(iIndexOf != -1 ? resourceName.substring(iIndexOf + 1) : resourceName, numValueOf);
                            }
                            int iIndexOf2 = resourceName.indexOf(47);
                            if (iIndexOf2 != -1) {
                                resourceName = resourceName.substring(iIndexOf2 + 1);
                            }
                            int id = childAt.getId();
                            if (id != 0) {
                                View viewFindViewById = (View) constraintLayout.l.get(id);
                                if (viewFindViewById == null && (viewFindViewById = constraintLayout.findViewById(id)) != null && viewFindViewById != constraintLayout && viewFindViewById.getParent() == constraintLayout) {
                                    constraintLayout.onViewAdded(viewFindViewById);
                                }
                                c0731Rg7 = viewFindViewById == constraintLayout ? c0757Sg : viewFindViewById == null ? null : ((C0498Ig) viewFindViewById.getLayoutParams()).p0;
                            }
                            c0731Rg7.h0 = resourceName;
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
                }
                if (constraintLayout.w != -1) {
                    for (int i21 = 0; i21 < childCount3; i21++) {
                        constraintLayout.getChildAt(i21).getId();
                    }
                }
                C0705Qg c0705Qg = constraintLayout.u;
                if (c0705Qg != null) {
                    c0705Qg.a(constraintLayout);
                }
                c0757Sg.q0.clear();
                ArrayList arrayList2 = constraintLayout.m;
                int size = arrayList2.size();
                if (size > 0) {
                    int i22 = 0;
                    while (i22 < size) {
                        AbstractC0446Gg abstractC0446Gg = (AbstractC0446Gg) arrayList2.get(i22);
                        if (abstractC0446Gg.isInEditMode()) {
                            abstractC0446Gg.setIds(abstractC0446Gg.p);
                        }
                        AbstractC2636rB abstractC2636rB = abstractC0446Gg.f284o;
                        if (abstractC2636rB == null) {
                            arrayList = arrayList2;
                        } else {
                            abstractC2636rB.r0 = i16;
                            Arrays.fill(abstractC2636rB.q0, obj);
                            int i23 = 0;
                            while (i23 < abstractC0446Gg.m) {
                                int i24 = abstractC0446Gg.l[i23];
                                View view = (View) constraintLayout.l.get(i24);
                                if (view == null) {
                                    Integer numValueOf2 = Integer.valueOf(i24);
                                    HashMap map = abstractC0446Gg.r;
                                    String str = (String) map.get(numValueOf2);
                                    int iG = abstractC0446Gg.g(constraintLayout, str);
                                    if (iG != 0) {
                                        abstractC0446Gg.l[i23] = iG;
                                        map.put(Integer.valueOf(iG), str);
                                        view = (View) constraintLayout.l.get(iG);
                                    }
                                }
                                if (view != null) {
                                    AbstractC2636rB abstractC2636rB2 = abstractC0446Gg.f284o;
                                    C0731Rg c0731RgH2 = constraintLayout.h(view);
                                    abstractC2636rB2.getClass();
                                    if (c0731RgH2 != abstractC2636rB2 && c0731RgH2 != null) {
                                        int i25 = abstractC2636rB2.r0 + 1;
                                        C0731Rg[] c0731RgArr = abstractC2636rB2.q0;
                                        if (i25 > c0731RgArr.length) {
                                            abstractC2636rB2.q0 = (C0731Rg[]) Arrays.copyOf(c0731RgArr, c0731RgArr.length * 2);
                                        }
                                        C0731Rg[] c0731RgArr2 = abstractC2636rB2.q0;
                                        int i26 = abstractC2636rB2.r0;
                                        c0731RgArr2[i26] = c0731RgH2;
                                        abstractC2636rB2.r0 = i26 + 1;
                                    }
                                }
                                i23++;
                                arrayList2 = arrayList2;
                            }
                            arrayList = arrayList2;
                            abstractC0446Gg.f284o.S();
                        }
                        i22++;
                        arrayList2 = arrayList;
                        obj = null;
                        i16 = 0;
                    }
                }
                for (int i27 = 0; i27 < childCount3; i27++) {
                    constraintLayout.getChildAt(i27);
                }
                SparseArray sparseArray = constraintLayout.y;
                sparseArray.clear();
                sparseArray.put(0, c0757Sg);
                sparseArray.put(getId(), c0757Sg);
                for (int i28 = 0; i28 < childCount3; i28++) {
                    View childAt2 = constraintLayout.getChildAt(i28);
                    sparseArray.put(childAt2.getId(), constraintLayout.h(childAt2));
                }
                int i29 = 0;
                while (i29 < childCount3) {
                    View childAt3 = constraintLayout.getChildAt(i29);
                    C0731Rg c0731RgH3 = constraintLayout.h(childAt3);
                    if (c0731RgH3 == null) {
                        i3 = childCount3;
                    } else {
                        C0498Ig c0498Ig2 = (C0498Ig) childAt3.getLayoutParams();
                        c0757Sg.q0.add(c0731RgH3);
                        C0731Rg c0731Rg8 = c0731RgH3.T;
                        if (c0731Rg8 != null) {
                            ((C0757Sg) c0731Rg8).q0.remove(c0731RgH3);
                            c0731RgH3.C();
                        }
                        c0731RgH3.T = c0757Sg;
                        c0498Ig2.a();
                        c0731RgH3.g0 = childAt3.getVisibility();
                        c0731RgH3.f0 = childAt3;
                        if (childAt3 instanceof AbstractC0446Gg) {
                            ((AbstractC0446Gg) childAt3).i(c0731RgH3, c0757Sg.v0);
                        }
                        if (c0498Ig2.d0) {
                            HA ha = (HA) c0731RgH3;
                            int i30 = c0498Ig2.m0;
                            int i31 = c0498Ig2.n0;
                            float f2 = c0498Ig2.o0;
                            if (f2 != -1.0f) {
                                if (f2 > -1.0f) {
                                    ha.q0 = f2;
                                    ha.r0 = -1;
                                    ha.s0 = -1;
                                }
                            } else if (i30 != -1) {
                                if (i30 > -1) {
                                    ha.q0 = -1.0f;
                                    ha.r0 = i30;
                                    ha.s0 = -1;
                                }
                            } else if (i31 != -1 && i31 > -1) {
                                ha.q0 = -1.0f;
                                ha.r0 = -1;
                                ha.s0 = i31;
                            }
                            i3 = childCount3;
                        } else {
                            int i32 = c0498Ig2.f0;
                            int i33 = c0498Ig2.g0;
                            int i34 = c0498Ig2.h0;
                            int i35 = c0498Ig2.i0;
                            int i36 = c0498Ig2.j0;
                            i3 = childCount3;
                            int i37 = c0498Ig2.k0;
                            float f3 = c0498Ig2.l0;
                            int i38 = c0498Ig2.p;
                            if (i38 != -1) {
                                C0731Rg c0731Rg9 = (C0731Rg) sparseArray.get(i38);
                                if (c0731Rg9 != null) {
                                    float f4 = c0498Ig2.r;
                                    c0731RgH3.v(7, 7, c0498Ig2.q, 0, c0731Rg9);
                                    c0731RgH3.D = f4;
                                }
                                c0498Ig = c0498Ig2;
                            } else {
                                if (i32 != -1) {
                                    C0731Rg c0731Rg10 = (C0731Rg) sparseArray.get(i32);
                                    if (c0731Rg10 != null) {
                                        c0731RgH3.v(2, 2, ((ViewGroup.MarginLayoutParams) c0498Ig2).leftMargin, i36, c0731Rg10);
                                    }
                                } else {
                                    i4 = -1;
                                    if (i33 == -1) {
                                        if (i34 != i4) {
                                            c0731Rg6 = (C0731Rg) sparseArray.get(i34);
                                            if (c0731Rg6 != null) {
                                                c0731RgH3.v(4, 2, ((ViewGroup.MarginLayoutParams) c0498Ig2).rightMargin, i37, c0731Rg6);
                                            }
                                        } else if (i35 != i4 && (c0731Rg = (C0731Rg) sparseArray.get(i35)) != null) {
                                            c0731RgH3.v(4, 4, ((ViewGroup.MarginLayoutParams) c0498Ig2).rightMargin, i37, c0731Rg);
                                        }
                                        i5 = c0498Ig2.i;
                                        if (i5 != -1) {
                                            c0731Rg5 = (C0731Rg) sparseArray.get(i5);
                                            if (c0731Rg5 != null) {
                                                c0731RgH3.v(3, 3, ((ViewGroup.MarginLayoutParams) c0498Ig2).topMargin, c0498Ig2.x, c0731Rg5);
                                            }
                                        } else {
                                            i6 = c0498Ig2.j;
                                            if (i6 != -1 && (c0731Rg2 = (C0731Rg) sparseArray.get(i6)) != null) {
                                                c0731RgH3.v(3, 5, ((ViewGroup.MarginLayoutParams) c0498Ig2).topMargin, c0498Ig2.x, c0731Rg2);
                                            }
                                        }
                                        i7 = c0498Ig2.k;
                                        if (i7 != -1) {
                                            c0731Rg4 = (C0731Rg) sparseArray.get(i7);
                                            if (c0731Rg4 != null) {
                                                c0731RgH3.v(5, 3, ((ViewGroup.MarginLayoutParams) c0498Ig2).bottomMargin, c0498Ig2.z, c0731Rg4);
                                            }
                                        } else {
                                            i8 = c0498Ig2.l;
                                            if (i8 != -1 && (c0731Rg3 = (C0731Rg) sparseArray.get(i8)) != null) {
                                                c0731RgH3.v(5, 5, ((ViewGroup.MarginLayoutParams) c0498Ig2).bottomMargin, c0498Ig2.z, c0731Rg3);
                                            }
                                        }
                                        i9 = c0498Ig2.m;
                                        if (i9 != -1) {
                                            c0498Ig = c0498Ig2;
                                            l(c0731RgH3, c0498Ig2, sparseArray, i9, 6);
                                        } else {
                                            c0498Ig = c0498Ig2;
                                            i10 = c0498Ig.n;
                                            if (i10 != -1) {
                                                l(c0731RgH3, c0498Ig, sparseArray, i10, 3);
                                            } else {
                                                i11 = c0498Ig.f327o;
                                                if (i11 != -1) {
                                                    l(c0731RgH3, c0498Ig, sparseArray, i11, 5);
                                                }
                                            }
                                        }
                                        if (f3 >= 0.0f) {
                                            c0731RgH3.d0 = f3;
                                        }
                                        f = c0498Ig.F;
                                        if (f >= 0.0f) {
                                            c0731RgH3.e0 = f;
                                        }
                                    } else {
                                        C0731Rg c0731Rg11 = (C0731Rg) sparseArray.get(i33);
                                        if (c0731Rg11 != null) {
                                            c0731RgH3.v(2, 4, ((ViewGroup.MarginLayoutParams) c0498Ig2).leftMargin, i36, c0731Rg11);
                                        }
                                    }
                                }
                                i4 = -1;
                                if (i34 != i4) {
                                    c0731Rg6 = (C0731Rg) sparseArray.get(i34);
                                    if (c0731Rg6 != null) {
                                        c0731RgH3.v(4, 2, ((ViewGroup.MarginLayoutParams) c0498Ig2).rightMargin, i37, c0731Rg6);
                                    }
                                } else if (i35 != i4) {
                                    c0731RgH3.v(4, 4, ((ViewGroup.MarginLayoutParams) c0498Ig2).rightMargin, i37, c0731Rg);
                                }
                                i5 = c0498Ig2.i;
                                if (i5 != -1) {
                                    c0731Rg5 = (C0731Rg) sparseArray.get(i5);
                                    if (c0731Rg5 != null) {
                                        c0731RgH3.v(3, 3, ((ViewGroup.MarginLayoutParams) c0498Ig2).topMargin, c0498Ig2.x, c0731Rg5);
                                    }
                                } else {
                                    i6 = c0498Ig2.j;
                                    if (i6 != -1) {
                                        c0731RgH3.v(3, 5, ((ViewGroup.MarginLayoutParams) c0498Ig2).topMargin, c0498Ig2.x, c0731Rg2);
                                    }
                                }
                                i7 = c0498Ig2.k;
                                if (i7 != -1) {
                                    c0731Rg4 = (C0731Rg) sparseArray.get(i7);
                                    if (c0731Rg4 != null) {
                                        c0731RgH3.v(5, 3, ((ViewGroup.MarginLayoutParams) c0498Ig2).bottomMargin, c0498Ig2.z, c0731Rg4);
                                    }
                                } else {
                                    i8 = c0498Ig2.l;
                                    if (i8 != -1) {
                                        c0731RgH3.v(5, 5, ((ViewGroup.MarginLayoutParams) c0498Ig2).bottomMargin, c0498Ig2.z, c0731Rg3);
                                    }
                                }
                                i9 = c0498Ig2.m;
                                if (i9 != -1) {
                                    c0498Ig = c0498Ig2;
                                    l(c0731RgH3, c0498Ig2, sparseArray, i9, 6);
                                } else {
                                    c0498Ig = c0498Ig2;
                                    i10 = c0498Ig.n;
                                    if (i10 != -1) {
                                        l(c0731RgH3, c0498Ig, sparseArray, i10, 3);
                                    } else {
                                        i11 = c0498Ig.f327o;
                                        if (i11 != -1) {
                                            l(c0731RgH3, c0498Ig, sparseArray, i11, 5);
                                        }
                                    }
                                }
                                if (f3 >= 0.0f) {
                                    c0731RgH3.d0 = f3;
                                }
                                f = c0498Ig.F;
                                if (f >= 0.0f) {
                                    c0731RgH3.e0 = f;
                                }
                            }
                            if (zIsInEditMode && ((i14 = c0498Ig.T) != -1 || c0498Ig.U != -1)) {
                                int i39 = c0498Ig.U;
                                c0731RgH3.Y = i14;
                                c0731RgH3.Z = i39;
                            }
                            if (c0498Ig.a0) {
                                c0731RgH3.M(1);
                                c0731RgH3.O(((ViewGroup.MarginLayoutParams) c0498Ig).width);
                                if (((ViewGroup.MarginLayoutParams) c0498Ig).width == -2) {
                                    c0731RgH3.M(2);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) c0498Ig).width == -1) {
                                if (c0498Ig.W) {
                                    c0731RgH3.M(3);
                                } else {
                                    c0731RgH3.M(4);
                                }
                                c0731RgH3.i(2).g = ((ViewGroup.MarginLayoutParams) c0498Ig).leftMargin;
                                c0731RgH3.i(4).g = ((ViewGroup.MarginLayoutParams) c0498Ig).rightMargin;
                            } else {
                                c0731RgH3.M(3);
                                c0731RgH3.O(0);
                            }
                            if (c0498Ig.b0) {
                                c0731RgH3.N(1);
                                c0731RgH3.L(((ViewGroup.MarginLayoutParams) c0498Ig).height);
                                if (((ViewGroup.MarginLayoutParams) c0498Ig).height == -2) {
                                    c0731RgH3.N(2);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) c0498Ig).height == -1) {
                                if (c0498Ig.X) {
                                    c0731RgH3.N(3);
                                } else {
                                    c0731RgH3.N(4);
                                }
                                c0731RgH3.i(3).g = ((ViewGroup.MarginLayoutParams) c0498Ig).topMargin;
                                c0731RgH3.i(5).g = ((ViewGroup.MarginLayoutParams) c0498Ig).bottomMargin;
                            } else {
                                c0731RgH3.N(3);
                                c0731RgH3.L(0);
                            }
                            String str2 = c0498Ig.G;
                            if (str2 == null || str2.length() == 0) {
                                c0731RgH3.W = 0.0f;
                            } else {
                                int length = str2.length();
                                int iIndexOf3 = str2.indexOf(44);
                                if (iIndexOf3 <= 0 || iIndexOf3 >= length - 1) {
                                    i12 = 0;
                                    i13 = -1;
                                } else {
                                    String strSubstring = str2.substring(0, iIndexOf3);
                                    i13 = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                                    i12 = iIndexOf3 + 1;
                                }
                                int iIndexOf4 = str2.indexOf(58);
                                if (iIndexOf4 < 0 || iIndexOf4 >= length - 1) {
                                    String strSubstring2 = str2.substring(i12);
                                    if (strSubstring2.length() > 0) {
                                        try {
                                            fAbs = Float.parseFloat(strSubstring2);
                                        } catch (NumberFormatException unused2) {
                                            fAbs = 0.0f;
                                        }
                                    } else {
                                        fAbs = 0.0f;
                                    }
                                } else {
                                    String strSubstring3 = str2.substring(i12, iIndexOf4);
                                    String strSubstring4 = str2.substring(iIndexOf4 + 1);
                                    if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                                        fAbs = 0.0f;
                                    } else {
                                        try {
                                            float f5 = Float.parseFloat(strSubstring3);
                                            float f6 = Float.parseFloat(strSubstring4);
                                            if (f5 <= 0.0f || f6 <= 0.0f) {
                                                fAbs = 0.0f;
                                            } else {
                                                fAbs = i13 == 1 ? Math.abs(f6 / f5) : Math.abs(f5 / f6);
                                            }
                                        } catch (NumberFormatException unused3) {
                                        }
                                    }
                                }
                                if (fAbs > 0.0f) {
                                    c0731RgH3.W = fAbs;
                                    c0731RgH3.X = i13;
                                }
                            }
                            float f7 = c0498Ig.H;
                            float[] fArr = c0731RgH3.k0;
                            fArr[0] = f7;
                            fArr[1] = c0498Ig.I;
                            c0731RgH3.i0 = c0498Ig.J;
                            c0731RgH3.j0 = c0498Ig.K;
                            int i40 = c0498Ig.Z;
                            if (i40 >= 0 && i40 <= 3) {
                                c0731RgH3.q = i40;
                            }
                            int i41 = c0498Ig.L;
                            int i42 = c0498Ig.N;
                            int i43 = c0498Ig.P;
                            float f8 = c0498Ig.R;
                            c0731RgH3.r = i41;
                            c0731RgH3.u = i42;
                            if (i43 == Integer.MAX_VALUE) {
                                i43 = 0;
                            }
                            c0731RgH3.v = i43;
                            c0731RgH3.w = f8;
                            if (f8 > 0.0f && f8 < 1.0f && i41 == 0) {
                                c0731RgH3.r = 2;
                            }
                            int i44 = c0498Ig.M;
                            int i45 = c0498Ig.O;
                            int i46 = c0498Ig.Q;
                            float f9 = c0498Ig.S;
                            c0731RgH3.s = i44;
                            c0731RgH3.x = i45;
                            if (i46 == Integer.MAX_VALUE) {
                                i46 = 0;
                            }
                            c0731RgH3.y = i46;
                            c0731RgH3.z = f9;
                            if (f9 > 0.0f && f9 < 1.0f && i44 == 0) {
                                c0731RgH3.s = 2;
                            }
                        }
                    }
                    i29++;
                    constraintLayout = this;
                    childCount3 = i3;
                }
            }
            if (z) {
                c0757Sg.r0.W(c0757Sg);
            }
        }
        k(c0757Sg, this.t, i, i2);
        int iQ = c0757Sg.q();
        int iK = c0757Sg.k();
        boolean z3 = c0757Sg.E0;
        boolean z4 = c0757Sg.F0;
        K30 k30 = this.z;
        int i47 = k30.d;
        int iResolveSizeAndState = View.resolveSizeAndState(iQ + k30.c, i, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(iK + i47, i2, 0) & 16777215;
        int iMin = Math.min(this.q, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.r, iResolveSizeAndState2);
        if (z3) {
            iMin |= 16777216;
        }
        if (z4) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        C0731Rg c0731RgH = h(view);
        if ((view instanceof Guideline) && !(c0731RgH instanceof HA)) {
            C0498Ig c0498Ig = (C0498Ig) view.getLayoutParams();
            HA ha = new HA();
            c0498Ig.p0 = ha;
            c0498Ig.d0 = true;
            ha.S(c0498Ig.V);
        }
        if (view instanceof AbstractC0446Gg) {
            AbstractC0446Gg abstractC0446Gg = (AbstractC0446Gg) view;
            abstractC0446Gg.k();
            ((C0498Ig) view.getLayoutParams()).e0 = true;
            ArrayList arrayList = this.m;
            if (!arrayList.contains(abstractC0446Gg)) {
                arrayList.add(abstractC0446Gg);
            }
        }
        this.l.put(view.getId(), view);
        this.s = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.l.remove(view.getId());
        C0731Rg c0731RgH = h(view);
        this.n.q0.remove(c0731RgH);
        c0731RgH.C();
        this.m.remove(view);
        this.s = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.s = true;
        super.requestLayout();
    }

    public void setConstraintSet(C0705Qg c0705Qg) {
        this.u = c0705Qg;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.l;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.r) {
            return;
        }
        this.r = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.q) {
            return;
        }
        this.q = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.p) {
            return;
        }
        this.p = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.f13o) {
            return;
        }
        this.f13o = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC0783Tg abstractC0783Tg) {
        C2720s4 c2720s4 = this.v;
        if (c2720s4 != null) {
            c2720s4.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.t = i;
        C0757Sg c0757Sg = this.n;
        c0757Sg.D0 = i;
        C2742sK.p = c0757Sg.W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.l = new SparseArray();
        this.m = new ArrayList(4);
        this.n = new C0757Sg();
        this.f13o = 0;
        this.p = 0;
        this.q = Integer.MAX_VALUE;
        this.r = Integer.MAX_VALUE;
        this.s = true;
        this.t = C3080vp0.F0;
        this.u = null;
        this.v = null;
        this.w = -1;
        this.x = new HashMap();
        this.y = new SparseArray();
        this.z = new K30(this, this);
        this.A = 0;
        this.B = 0;
        i(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C0498Ig c0498Ig = new C0498Ig(layoutParams);
        c0498Ig.a = -1;
        c0498Ig.b = -1;
        c0498Ig.c = -1.0f;
        c0498Ig.d = true;
        c0498Ig.e = -1;
        c0498Ig.f = -1;
        c0498Ig.g = -1;
        c0498Ig.h = -1;
        c0498Ig.i = -1;
        c0498Ig.j = -1;
        c0498Ig.k = -1;
        c0498Ig.l = -1;
        c0498Ig.m = -1;
        c0498Ig.n = -1;
        c0498Ig.f327o = -1;
        c0498Ig.p = -1;
        c0498Ig.q = 0;
        c0498Ig.r = 0.0f;
        c0498Ig.s = -1;
        c0498Ig.t = -1;
        c0498Ig.u = -1;
        c0498Ig.v = -1;
        c0498Ig.w = Integer.MIN_VALUE;
        c0498Ig.x = Integer.MIN_VALUE;
        c0498Ig.y = Integer.MIN_VALUE;
        c0498Ig.z = Integer.MIN_VALUE;
        c0498Ig.A = Integer.MIN_VALUE;
        c0498Ig.B = Integer.MIN_VALUE;
        c0498Ig.C = Integer.MIN_VALUE;
        c0498Ig.D = 0;
        c0498Ig.E = 0.5f;
        c0498Ig.F = 0.5f;
        c0498Ig.G = null;
        c0498Ig.H = -1.0f;
        c0498Ig.I = -1.0f;
        c0498Ig.J = 0;
        c0498Ig.K = 0;
        c0498Ig.L = 0;
        c0498Ig.M = 0;
        c0498Ig.N = 0;
        c0498Ig.O = 0;
        c0498Ig.P = 0;
        c0498Ig.Q = 0;
        c0498Ig.R = 1.0f;
        c0498Ig.S = 1.0f;
        c0498Ig.T = -1;
        c0498Ig.U = -1;
        c0498Ig.V = -1;
        c0498Ig.W = false;
        c0498Ig.X = false;
        c0498Ig.Y = null;
        c0498Ig.Z = 0;
        c0498Ig.a0 = true;
        c0498Ig.b0 = true;
        c0498Ig.c0 = false;
        c0498Ig.d0 = false;
        c0498Ig.e0 = false;
        c0498Ig.f0 = -1;
        c0498Ig.g0 = -1;
        c0498Ig.h0 = -1;
        c0498Ig.i0 = -1;
        c0498Ig.j0 = Integer.MIN_VALUE;
        c0498Ig.k0 = Integer.MIN_VALUE;
        c0498Ig.l0 = 0.5f;
        c0498Ig.p0 = new C0731Rg();
        return c0498Ig;
    }
}
