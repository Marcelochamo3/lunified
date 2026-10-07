package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class N50 {
    public final /* synthetic */ RecyclerView a;

    public /* synthetic */ N50(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public void a(X1 x1) {
        int i = x1.a;
        RecyclerView recyclerView = this.a;
        if (i == 1) {
            recyclerView.y.i0(x1.b, x1.d);
            return;
        }
        if (i == 2) {
            recyclerView.y.l0(x1.b, x1.d);
        } else if (i == 4) {
            recyclerView.y.n0(recyclerView, x1.b, x1.d);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.y.k0(x1.b, x1.d);
        }
    }

    public void b(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.a;
        int iE = recyclerView.q.E();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < iE; i6++) {
            View viewD = recyclerView.q.D(i6);
            AbstractC2144m60 abstractC2144m60L = RecyclerView.L(viewD);
            if (abstractC2144m60L != null && !abstractC2144m60L.s() && (i4 = abstractC2144m60L.c) >= i && i4 < i5) {
                abstractC2144m60L.b(2);
                abstractC2144m60L.a(obj);
                ((Y50) viewD.getLayoutParams()).c = true;
            }
        }
        C1266d60 c1266d60 = recyclerView.n;
        ArrayList arrayList = c1266d60.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC2144m60 abstractC2144m60 = (AbstractC2144m60) arrayList.get(size);
            if (abstractC2144m60 != null && (i3 = abstractC2144m60.c) >= i && i3 < i5) {
                abstractC2144m60.b(2);
                c1266d60.h(size);
            }
        }
        recyclerView.x0 = true;
    }

    public void c(int i, int i2) {
        RecyclerView recyclerView = this.a;
        int iE = recyclerView.q.E();
        for (int i3 = 0; i3 < iE; i3++) {
            AbstractC2144m60 abstractC2144m60L = RecyclerView.L(recyclerView.q.D(i3));
            if (abstractC2144m60L != null && !abstractC2144m60L.s() && abstractC2144m60L.c >= i) {
                abstractC2144m60L.p(i2, false);
                recyclerView.t0.f = true;
            }
        }
        ArrayList arrayList = recyclerView.n.c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC2144m60 abstractC2144m60 = (AbstractC2144m60) arrayList.get(i4);
            if (abstractC2144m60 != null && abstractC2144m60.c >= i) {
                abstractC2144m60.p(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.w0 = true;
    }

    public void d(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.a;
        int iE = recyclerView.q.E();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < iE; i11++) {
            AbstractC2144m60 abstractC2144m60L = RecyclerView.L(recyclerView.q.D(i11));
            if (abstractC2144m60L != null && (i9 = abstractC2144m60L.c) >= i4 && i9 <= i3) {
                if (i9 == i) {
                    abstractC2144m60L.p(i2 - i, false);
                } else {
                    abstractC2144m60L.p(i5, false);
                }
                recyclerView.t0.f = true;
            }
        }
        C1266d60 c1266d60 = recyclerView.n;
        c1266d60.getClass();
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        ArrayList arrayList = c1266d60.c;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            AbstractC2144m60 abstractC2144m60 = (AbstractC2144m60) arrayList.get(i12);
            if (abstractC2144m60 != null && (i8 = abstractC2144m60.c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    abstractC2144m60.p(i2 - i, false);
                } else {
                    abstractC2144m60.p(i10, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.w0 = true;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    public void e(AbstractC2144m60 abstractC2144m60, C2650rP c2650rP, C2650rP c2650rP2) {
        boolean zG;
        RecyclerView recyclerView = this.a;
        recyclerView.getClass();
        abstractC2144m60.r(false);
        C1418el c1418el = (C1418el) recyclerView.b0;
        if (c2650rP != null) {
            c1418el.getClass();
            int i = c2650rP.a;
            int i2 = c2650rP2.a;
            if (i == i2 && c2650rP.b == c2650rP2.b) {
                c1418el.l(abstractC2144m60);
                abstractC2144m60.a.setAlpha(0.0f);
                c1418el.i.add(abstractC2144m60);
                zG = true;
            } else {
                zG = c1418el.g(abstractC2144m60, i, c2650rP.b, i2, c2650rP2.b);
            }
        } else {
            c1418el.l(abstractC2144m60);
            abstractC2144m60.a.setAlpha(0.0f);
            c1418el.i.add(abstractC2144m60);
            zG = true;
        }
        if (zG) {
            recyclerView.W();
        }
    }

    public void f(AbstractC2144m60 abstractC2144m60, C2650rP c2650rP, C2650rP c2650rP2) {
        boolean zG;
        RecyclerView recyclerView = this.a;
        recyclerView.n.m(abstractC2144m60);
        recyclerView.f(abstractC2144m60);
        abstractC2144m60.r(false);
        C1418el c1418el = (C1418el) recyclerView.b0;
        c1418el.getClass();
        int i = c2650rP.a;
        int i2 = c2650rP.b;
        View view = abstractC2144m60.a;
        int left = c2650rP2 == null ? view.getLeft() : c2650rP2.a;
        int top = c2650rP2 == null ? view.getTop() : c2650rP2.b;
        if (abstractC2144m60.l() || (i == left && i2 == top)) {
            c1418el.l(abstractC2144m60);
            c1418el.h.add(abstractC2144m60);
            zG = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zG = c1418el.g(abstractC2144m60, i, i2, left, top);
        }
        if (zG) {
            recyclerView.W();
        }
    }

    public void g(int i) {
        RecyclerView recyclerView = this.a;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.p(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}
