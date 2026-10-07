package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class Y1 {
    public int a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;

    public Y1(View view) {
        this.a = -1;
        this.b = view;
        this.c = C1846j4.a();
    }

    public void a() {
        View view = (View) this.b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((C2673rg) this.d) != null) {
                if (((C2673rg) this.f) == null) {
                    this.f = new C2673rg();
                }
                C2673rg c2673rg = (C2673rg) this.f;
                c2673rg.c = null;
                c2673rg.b = false;
                c2673rg.d = null;
                c2673rg.a = false;
                WeakHashMap weakHashMap = It0.a;
                ColorStateList colorStateListG = AbstractC3185wt0.g(view);
                if (colorStateListG != null) {
                    c2673rg.b = true;
                    c2673rg.c = colorStateListG;
                }
                PorterDuff.Mode modeH = AbstractC3185wt0.h(view);
                if (modeH != null) {
                    c2673rg.a = true;
                    c2673rg.d = modeH;
                }
                if (c2673rg.b || c2673rg.a) {
                    C1846j4.e(background, c2673rg, view.getDrawableState());
                    return;
                }
            }
            C2673rg c2673rg2 = (C2673rg) this.e;
            if (c2673rg2 != null) {
                C1846j4.e(background, c2673rg2, view.getDrawableState());
                return;
            }
            C2673rg c2673rg3 = (C2673rg) this.d;
            if (c2673rg3 != null) {
                C1846j4.e(background, c2673rg3, view.getDrawableState());
            }
        }
    }

    public boolean b(int i) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            X1 x1 = (X1) arrayList.get(i2);
            int i3 = x1.a;
            if (i3 == 8) {
                if (g(x1.d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = x1.b;
                int i5 = x1.d + i4;
                while (i4 < i5) {
                    if (g(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public void c() {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((N50) this.e).a((X1) arrayList.get(i));
        }
        r(arrayList);
        this.a = 0;
    }

    public void d() {
        c();
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            X1 x1 = (X1) arrayList.get(i);
            int i2 = x1.a;
            N50 n50 = (N50) this.e;
            if (i2 == 1) {
                n50.a(x1);
                n50.c(x1.b, x1.d);
            } else if (i2 == 2) {
                n50.a(x1);
                int i3 = x1.b;
                int i4 = x1.d;
                RecyclerView recyclerView = n50.a;
                recyclerView.S(i3, i4, true);
                recyclerView.w0 = true;
                recyclerView.t0.c += i4;
            } else if (i2 == 4) {
                n50.a(x1);
                n50.b(x1.b, x1.d, x1.c);
            } else if (i2 == 8) {
                n50.a(x1);
                n50.d(x1.b, x1.d);
            }
        }
        r(arrayList);
        this.a = 0;
    }

    public void e(X1 x1) {
        int i;
        int i2 = x1.a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iV = v(x1.b, i2);
        int i3 = x1.b;
        int i4 = x1.a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + x1);
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < x1.d; i6++) {
            int iV2 = v((i * i6) + x1.b, x1.a);
            int i7 = x1.a;
            if (i7 == 2 ? iV2 != iV : !(i7 == 4 && iV2 == iV + 1)) {
                X1 x1L = l(x1.c, i7, iV, i5);
                f(x1L, i3);
                x1L.c = null;
                ((C2039l20) this.b).e(x1L);
                if (x1.a == 4) {
                    i3 += i5;
                }
                iV = iV2;
                i5 = 1;
            } else {
                i5++;
            }
        }
        Object obj = x1.c;
        x1.c = null;
        ((C2039l20) this.b).e(x1);
        if (i5 > 0) {
            X1 x1L2 = l(obj, x1.a, iV, i5);
            f(x1L2, i3);
            x1L2.c = null;
            ((C2039l20) this.b).e(x1L2);
        }
    }

    public void f(X1 x1, int i) {
        N50 n50 = (N50) this.e;
        n50.a(x1);
        int i2 = x1.a;
        if (i2 != 2) {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            n50.b(i, x1.d, x1.c);
        } else {
            int i3 = x1.d;
            RecyclerView recyclerView = n50.a;
            recyclerView.S(i, i3, true);
            recyclerView.w0 = true;
            recyclerView.t0.c += i3;
        }
    }

    public int g(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (i2 < size) {
            X1 x1 = (X1) arrayList.get(i2);
            int i3 = x1.a;
            if (i3 == 8) {
                int i4 = x1.b;
                if (i4 == i) {
                    i = x1.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (x1.d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = x1.b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = x1.d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += x1.d;
                }
            }
            i2++;
        }
        return i;
    }

    public ColorStateList h() {
        C2673rg c2673rg = (C2673rg) this.e;
        if (c2673rg != null) {
            return (ColorStateList) c2673rg.c;
        }
        return null;
    }

    public PorterDuff.Mode i() {
        C2673rg c2673rg = (C2673rg) this.e;
        if (c2673rg != null) {
            return (PorterDuff.Mode) c2673rg.d;
        }
        return null;
    }

    public boolean j() {
        return ((ArrayList) this.c).size() > 0;
    }

    public void k(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListI;
        View view = (View) this.b;
        Context context = view.getContext();
        int[] iArr = T40.z;
        RN rnY = RN.y(context, attributeSet, iArr, i, 0);
        TypedArray typedArray = (TypedArray) rnY.n;
        View view2 = (View) this.b;
        It0.o(view2, view2.getContext(), iArr, attributeSet, (TypedArray) rnY.n, i);
        try {
            if (typedArray.hasValue(0)) {
                this.a = typedArray.getResourceId(0, -1);
                C1846j4 c1846j4 = (C1846j4) this.c;
                Context context2 = view.getContext();
                int i2 = this.a;
                synchronized (c1846j4) {
                    colorStateListI = c1846j4.a.i(context2, i2);
                }
                if (colorStateListI != null) {
                    s(colorStateListI);
                }
            }
            if (typedArray.hasValue(1)) {
                AbstractC3185wt0.q(view, rnY.s(1));
            }
            if (typedArray.hasValue(2)) {
                AbstractC3185wt0.r(view, AbstractC3077vo.c(typedArray.getInt(2, -1), null));
            }
            rnY.A();
        } catch (Throwable th) {
            rnY.A();
            throw th;
        }
    }

    public X1 l(Object obj, int i, int i2, int i3) {
        X1 x1 = (X1) ((C2039l20) this.b).n();
        if (x1 != null) {
            x1.a = i;
            x1.b = i2;
            x1.d = i3;
            x1.c = obj;
            return x1;
        }
        X1 x2 = new X1();
        x2.a = i;
        x2.b = i2;
        x2.d = i3;
        x2.c = obj;
        return x2;
    }

    public void m() {
        this.a = -1;
        s(null);
        a();
    }

    public void n(int i) {
        ColorStateList colorStateListI;
        this.a = i;
        C1846j4 c1846j4 = (C1846j4) this.c;
        if (c1846j4 != null) {
            Context context = ((View) this.b).getContext();
            synchronized (c1846j4) {
                colorStateListI = c1846j4.a.i(context, i);
            }
        } else {
            colorStateListI = null;
        }
        s(colorStateListI);
        a();
    }

    public void o(X1 x1) {
        ((ArrayList) this.d).add(x1);
        int i = x1.a;
        N50 n50 = (N50) this.e;
        if (i == 1) {
            n50.c(x1.b, x1.d);
            return;
        }
        if (i == 2) {
            int i2 = x1.b;
            int i3 = x1.d;
            RecyclerView recyclerView = n50.a;
            recyclerView.S(i2, i3, false);
            recyclerView.w0 = true;
            return;
        }
        if (i == 4) {
            n50.b(x1.b, x1.d, x1.c);
        } else if (i == 8) {
            n50.d(x1.b, x1.d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + x1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x018f  */
    /* JADX WARN: Code duplicated, block: B:105:0x019d  */
    /* JADX WARN: Code duplicated, block: B:106:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:198:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x01a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x000d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x000d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x006f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0074  */
    /* JADX WARN: Code duplicated, block: B:33:0x0079  */
    /* JADX WARN: Code duplicated, block: B:37:0x0090  */
    /* JADX WARN: Code duplicated, block: B:38:0x0094  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:77:0x0137  */
    /* JADX WARN: Code duplicated, block: B:78:0x0139  */
    /* JADX WARN: Code duplicated, block: B:80:0x013f  */
    /* JADX WARN: Code duplicated, block: B:83:0x014a  */
    /* JADX WARN: Code duplicated, block: B:86:0x0155  */
    /* JADX WARN: Code duplicated, block: B:89:0x0160  */
    /* JADX WARN: Code duplicated, block: B:90:0x0166  */
    /* JADX WARN: Code duplicated, block: B:91:0x0168  */
    /* JADX WARN: Code duplicated, block: B:93:0x016e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0179  */
    /* JADX WARN: Code duplicated, block: B:99:0x0184  */
    public void p() {
        byte b;
        int i;
        AbstractC2144m60 abstractC2144m60;
        int i2;
        boolean z;
        byte b2;
        X1 x1L;
        int i3;
        int i4;
        int i5;
        X1 x1L2;
        boolean z2;
        boolean z3;
        X1 x1L3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        ArrayList arrayList = (ArrayList) this.c;
        C0334By c0334By = (C0334By) this.f;
        c0334By.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z4 = false;
            while (true) {
                b = -1;
                i = 8;
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((X1) arrayList.get(size)).a != 8) {
                    z4 = true;
                } else if (z4) {
                    break;
                }
                size--;
            }
            abstractC2144m60 = null;
            i2 = 2;
            if (size == -1) {
                break;
            }
            int i14 = size + 1;
            X1 x1 = (X1) arrayList.get(size);
            X1 x2 = (X1) arrayList.get(i14);
            int i15 = x2.a;
            if (i15 != 1) {
                Y1 y1 = (Y1) c0334By.m;
                if (i15 == 2) {
                    int i16 = x1.b;
                    int i17 = x1.d;
                    if (i16 < i17) {
                        z2 = x2.b == i16 && x2.d == i17 - i16;
                        z3 = false;
                    } else {
                        z2 = x2.b == i17 + 1 && x2.d == i16 - i17;
                        z3 = true;
                    }
                    int i18 = x2.b;
                    if (i17 < i18) {
                        x2.b = i18 - 1;
                    } else {
                        int i19 = x2.d;
                        if (i17 < i18 + i19) {
                            x2.d = i19 - 1;
                            x1.a = 2;
                            x1.d = 1;
                            if (x2.d == 0) {
                                arrayList.remove(i14);
                                y1.getClass();
                                x2.c = null;
                                ((C2039l20) y1.b).e(x2);
                            }
                        }
                    }
                    int i20 = x1.b;
                    int i21 = x2.b;
                    if (i20 <= i21) {
                        x2.b = i21 + 1;
                    } else {
                        int i22 = i21 + x2.d;
                        if (i20 < i22) {
                            x1L3 = y1.l(null, 2, i20 + 1, i22 - i20);
                            x2.d = x1.b - x2.b;
                        }
                        if (z2) {
                            arrayList.set(size, x2);
                            arrayList.remove(i14);
                            y1.getClass();
                            x1.c = null;
                            ((C2039l20) y1.b).e(x1);
                        } else {
                            if (z3) {
                                if (x1L3 != null) {
                                    i12 = x1.b;
                                    if (i12 > x1L3.b) {
                                        x1.b = i12 - x1L3.d;
                                    }
                                    i13 = x1.d;
                                    if (i13 > x1L3.b) {
                                        x1.d = i13 - x1L3.d;
                                    }
                                }
                                i10 = x1.b;
                                if (i10 > x2.b) {
                                    x1.b = i10 - x2.d;
                                }
                                i11 = x1.d;
                                if (i11 > x2.b) {
                                    x1.d = i11 - x2.d;
                                }
                            } else {
                                if (x1L3 != null) {
                                    i8 = x1.b;
                                    if (i8 >= x1L3.b) {
                                        x1.b = i8 - x1L3.d;
                                    }
                                    i9 = x1.d;
                                    if (i9 >= x1L3.b) {
                                        x1.d = i9 - x1L3.d;
                                    }
                                }
                                i6 = x1.b;
                                if (i6 >= x2.b) {
                                    x1.b = i6 - x2.d;
                                }
                                i7 = x1.d;
                                if (i7 >= x2.b) {
                                    x1.d = i7 - x2.d;
                                }
                            }
                            arrayList.set(size, x2);
                            if (x1.b != x1.d) {
                                arrayList.set(i14, x1);
                            } else {
                                arrayList.remove(i14);
                            }
                            if (x1L3 != null) {
                                arrayList.add(size, x1L3);
                            }
                        }
                    }
                    x1L3 = null;
                    if (z2) {
                        arrayList.set(size, x2);
                        arrayList.remove(i14);
                        y1.getClass();
                        x1.c = null;
                        ((C2039l20) y1.b).e(x1);
                    } else {
                        if (z3) {
                            if (x1L3 != null) {
                                i12 = x1.b;
                                if (i12 > x1L3.b) {
                                    x1.b = i12 - x1L3.d;
                                }
                                i13 = x1.d;
                                if (i13 > x1L3.b) {
                                    x1.d = i13 - x1L3.d;
                                }
                            }
                            i10 = x1.b;
                            if (i10 > x2.b) {
                                x1.b = i10 - x2.d;
                            }
                            i11 = x1.d;
                            if (i11 > x2.b) {
                                x1.d = i11 - x2.d;
                            }
                        } else {
                            if (x1L3 != null) {
                                i8 = x1.b;
                                if (i8 >= x1L3.b) {
                                    x1.b = i8 - x1L3.d;
                                }
                                i9 = x1.d;
                                if (i9 >= x1L3.b) {
                                    x1.d = i9 - x1L3.d;
                                }
                            }
                            i6 = x1.b;
                            if (i6 >= x2.b) {
                                x1.b = i6 - x2.d;
                            }
                            i7 = x1.d;
                            if (i7 >= x2.b) {
                                x1.d = i7 - x2.d;
                            }
                        }
                        arrayList.set(size, x2);
                        if (x1.b != x1.d) {
                            arrayList.set(i14, x1);
                        } else {
                            arrayList.remove(i14);
                        }
                        if (x1L3 != null) {
                            arrayList.add(size, x1L3);
                        }
                    }
                } else if (i15 == 4) {
                    int i23 = x1.d;
                    int i24 = x2.b;
                    if (i23 < i24) {
                        x2.b = i24 - 1;
                    } else {
                        int i25 = x2.d;
                        if (i23 < i24 + i25) {
                            x2.d = i25 - 1;
                            x1L = y1.l(x2.c, 4, x1.b, 1);
                        }
                        i3 = x1.b;
                        i4 = x2.b;
                        if (i3 <= i4) {
                            x2.b = i4 + 1;
                        } else {
                            i5 = i4 + x2.d;
                            if (i3 < i5) {
                                int i26 = i5 - i3;
                                x1L2 = y1.l(x2.c, 4, i3 + 1, i26);
                                x2.d -= i26;
                            }
                            arrayList.set(i14, x1);
                            if (x2.d > 0) {
                                arrayList.set(size, x2);
                            } else {
                                arrayList.remove(size);
                                y1.getClass();
                                x2.c = null;
                                ((C2039l20) y1.b).e(x2);
                            }
                            if (x1L != null) {
                                arrayList.add(size, x1L);
                            }
                            if (x1L2 != null) {
                                arrayList.add(size, x1L2);
                            }
                        }
                        x1L2 = null;
                        arrayList.set(i14, x1);
                        if (x2.d > 0) {
                            arrayList.set(size, x2);
                        } else {
                            arrayList.remove(size);
                            y1.getClass();
                            x2.c = null;
                            ((C2039l20) y1.b).e(x2);
                        }
                        if (x1L != null) {
                            arrayList.add(size, x1L);
                        }
                        if (x1L2 != null) {
                            arrayList.add(size, x1L2);
                        }
                    }
                    x1L = null;
                    i3 = x1.b;
                    i4 = x2.b;
                    if (i3 <= i4) {
                        x2.b = i4 + 1;
                    } else {
                        i5 = i4 + x2.d;
                        if (i3 < i5) {
                            int i27 = i5 - i3;
                            x1L2 = y1.l(x2.c, 4, i3 + 1, i27);
                            x2.d -= i27;
                        }
                        arrayList.set(i14, x1);
                        if (x2.d > 0) {
                            arrayList.set(size, x2);
                        } else {
                            arrayList.remove(size);
                            y1.getClass();
                            x2.c = null;
                            ((C2039l20) y1.b).e(x2);
                        }
                        if (x1L != null) {
                            arrayList.add(size, x1L);
                        }
                        if (x1L2 != null) {
                            arrayList.add(size, x1L2);
                        }
                    }
                    x1L2 = null;
                    arrayList.set(i14, x1);
                    if (x2.d > 0) {
                        arrayList.set(size, x2);
                    } else {
                        arrayList.remove(size);
                        y1.getClass();
                        x2.c = null;
                        ((C2039l20) y1.b).e(x2);
                    }
                    if (x1L != null) {
                        arrayList.add(size, x1L);
                    }
                    if (x1L2 != null) {
                        arrayList.add(size, x1L2);
                    }
                }
            } else {
                int i28 = x1.d;
                int i29 = x2.b;
                int i30 = i28 < i29 ? -1 : 0;
                int i31 = x1.b;
                if (i31 < i29) {
                    i30++;
                }
                if (i29 <= i31) {
                    x1.b = i31 + x2.d;
                }
                int i32 = x2.b;
                if (i32 <= i28) {
                    x1.d = i28 + x2.d;
                }
                x2.b = i32 + i30;
                arrayList.set(size, x2);
                arrayList.set(i14, x1);
            }
        }
        int size2 = arrayList.size();
        int i33 = 0;
        while (i33 < size2) {
            X1 x1L4 = (X1) arrayList.get(i33);
            int i34 = x1L4.a;
            if (i34 != 1) {
                N50 n50 = (N50) this.e;
                if (i34 == i2) {
                    int i35 = x1L4.b;
                    int i36 = x1L4.d + i35;
                    int i37 = i35;
                    int i38 = 0;
                    byte b3 = -1;
                    while (i37 < i36) {
                        RecyclerView recyclerView = n50.a;
                        AbstractC2144m60 abstractC2144m60H = recyclerView.H(i37, true);
                        if (abstractC2144m60H == null || recyclerView.q.L(abstractC2144m60H.a)) {
                            abstractC2144m60H = null;
                        }
                        if (abstractC2144m60H != null || b(i37)) {
                            if (b3 == 0) {
                                e(l(null, 2, i35, i38));
                                z = true;
                            } else {
                                z = false;
                            }
                            b2 = 1;
                        } else {
                            if (b3 == 1) {
                                o(l(null, 2, i35, i38));
                                z = true;
                            } else {
                                z = false;
                            }
                            b2 = 0;
                        }
                        if (z) {
                            i37 -= i38;
                            i36 -= i38;
                            i38 = 1;
                        } else {
                            i38++;
                        }
                        i37++;
                        b3 = b2;
                    }
                    if (i38 != x1L4.d) {
                        abstractC2144m60 = null;
                        x1L4.c = null;
                        ((C2039l20) this.b).e(x1L4);
                        x1L4 = l(null, 2, i35, i38);
                    } else {
                        abstractC2144m60 = null;
                    }
                    if (b3 == 0) {
                        e(x1L4);
                    } else {
                        o(x1L4);
                    }
                } else if (i34 == 4) {
                    int i39 = x1L4.b;
                    int i40 = x1L4.d + i39;
                    int i41 = i39;
                    int i42 = 0;
                    while (i39 < i40) {
                        RecyclerView recyclerView2 = n50.a;
                        AbstractC2144m60 abstractC2144m60H2 = recyclerView2.H(i39, true);
                        if (abstractC2144m60H2 == null) {
                            abstractC2144m60H2 = abstractC2144m60;
                        } else if (recyclerView2.q.L(abstractC2144m60H2.a)) {
                            abstractC2144m60H2 = null;
                        }
                        if (abstractC2144m60H2 != null || b(i39)) {
                            if (b == 0) {
                                e(l(x1L4.c, 4, i41, i42));
                                i41 = i39;
                                i42 = 0;
                            }
                            b = 1;
                        } else {
                            if (b == 1) {
                                o(l(x1L4.c, 4, i41, i42));
                                i41 = i39;
                                i42 = 0;
                            }
                            b = 0;
                        }
                        i42++;
                        i39++;
                        abstractC2144m60 = null;
                    }
                    if (i42 != x1L4.d) {
                        Object obj = x1L4.c;
                        x1L4.c = null;
                        ((C2039l20) this.b).e(x1L4);
                        x1L4 = l(obj, 4, i41, i42);
                    }
                    if (b == 0) {
                        e(x1L4);
                    } else {
                        o(x1L4);
                    }
                    abstractC2144m60 = null;
                } else if (i34 == i) {
                    o(x1L4);
                }
            } else {
                o(x1L4);
            }
            i33++;
            b = -1;
            i = 8;
            i2 = 2;
        }
        arrayList.clear();
    }

    public void q(X1 x1) {
        x1.c = null;
        ((C2039l20) this.b).e(x1);
    }

    public void r(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            q((X1) arrayList.get(i));
        }
        arrayList.clear();
    }

    public void s(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((C2673rg) this.d) == null) {
                this.d = new C2673rg();
            }
            C2673rg c2673rg = (C2673rg) this.d;
            c2673rg.c = colorStateList;
            c2673rg.b = true;
        } else {
            this.d = null;
        }
        a();
    }

    public void t(ColorStateList colorStateList) {
        if (((C2673rg) this.e) == null) {
            this.e = new C2673rg();
        }
        C2673rg c2673rg = (C2673rg) this.e;
        c2673rg.c = colorStateList;
        c2673rg.b = true;
        a();
    }

    public void u(PorterDuff.Mode mode) {
        if (((C2673rg) this.e) == null) {
            this.e = new C2673rg();
        }
        C2673rg c2673rg = (C2673rg) this.e;
        c2673rg.d = mode;
        c2673rg.a = true;
        a();
    }

    public int v(int i, int i2) {
        int i3;
        int i4;
        ArrayList arrayList = (ArrayList) this.d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            X1 x1 = (X1) arrayList.get(size);
            int i5 = x1.a;
            if (i5 == 8) {
                int i6 = x1.b;
                int i7 = x1.d;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            x1.b = i6 + 1;
                            x1.d = i7 + 1;
                        } else if (i2 == 2) {
                            x1.b = i6 - 1;
                            x1.d = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        x1.d = i7 + 1;
                    } else if (i2 == 2) {
                        x1.d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        x1.b = i6 + 1;
                    } else if (i2 == 2) {
                        x1.b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = x1.b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= x1.d;
                    } else if (i5 == 2) {
                        i += x1.d;
                    }
                } else if (i2 == 1) {
                    x1.b = i8 + 1;
                } else if (i2 == 2) {
                    x1.b = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            X1 x2 = (X1) arrayList.get(size2);
            if (x2.a == 8) {
                int i9 = x2.d;
                if (i9 == x2.b || i9 < 0) {
                    arrayList.remove(size2);
                    q(x2);
                }
            } else if (x2.d <= 0) {
                arrayList.remove(size2);
                q(x2);
            }
        }
        return i;
    }

    public Y1(N50 n50) {
        this.b = new C2039l20(30);
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.a = 0;
        this.e = n50;
        this.f = new C0334By(23, this);
    }
}
