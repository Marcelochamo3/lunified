package o;

import android.os.Trace;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: o.d60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1266d60 {
    public final ArrayList a;
    public ArrayList b;
    public final ArrayList c;
    public final List d;
    public int e;
    public int f;
    public C1168c60 g;
    public final /* synthetic */ RecyclerView h;

    public C1266d60(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = null;
        this.c = new ArrayList();
        this.d = Collections.unmodifiableList(arrayList);
        this.e = 2;
        this.f = 2;
    }

    public final void a(AbstractC2144m60 abstractC2144m60, boolean z) {
        RecyclerView.j(abstractC2144m60);
        RecyclerView recyclerView = this.h;
        C2338o60 c2338o60 = recyclerView.A0;
        View view = abstractC2144m60.a;
        if (c2338o60 != null) {
            C3003v0 c3003v0J = c2338o60.j();
            It0.p(view, c3003v0J instanceof C2241n60 ? (C3003v0) ((C2241n60) c3003v0J).e.remove(view) : null);
        }
        if (z) {
            InterfaceC1363e60 interfaceC1363e60 = recyclerView.z;
            if (interfaceC1363e60 != null) {
                ((T7) interfaceC1363e60).a(abstractC2144m60);
            }
            ArrayList arrayList = recyclerView.A;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((T7) ((InterfaceC1363e60) arrayList.get(i))).a(abstractC2144m60);
            }
            O50 o50 = recyclerView.x;
            if (o50 != null) {
                o50.h(abstractC2144m60);
            }
            if (recyclerView.t0 != null) {
                recyclerView.r.h(abstractC2144m60);
            }
        }
        abstractC2144m60.s = null;
        abstractC2144m60.r = null;
        C1168c60 c1168c60C = c();
        c1168c60C.getClass();
        int i2 = abstractC2144m60.f;
        ArrayList arrayList2 = c1168c60C.a(i2).a;
        if (((C1071b60) c1168c60C.a.get(i2)).b <= arrayList2.size()) {
            AbstractC1376eG.e(view);
        } else {
            abstractC2144m60.q();
            arrayList2.add(abstractC2144m60);
        }
    }

    public final int b(int i) {
        RecyclerView recyclerView = this.h;
        if (i >= 0 && i < recyclerView.t0.b()) {
            return !recyclerView.t0.g ? i : recyclerView.p.g(i, 0);
        }
        StringBuilder sbR = AbstractC1674hK.r("invalid position ", i, ". State item count is ");
        sbR.append(recyclerView.t0.b());
        sbR.append(recyclerView.A());
        throw new IndexOutOfBoundsException(sbR.toString());
    }

    public final C1168c60 c() {
        if (this.g == null) {
            C1168c60 c1168c60 = new C1168c60();
            c1168c60.a = new SparseArray();
            c1168c60.b = 0;
            c1168c60.c = Collections.newSetFromMap(new IdentityHashMap());
            this.g = c1168c60;
            e();
        }
        return this.g;
    }

    public final View d(int i) {
        return l(i, Long.MAX_VALUE).a;
    }

    public final void e() {
        RecyclerView recyclerView;
        O50 o50;
        C1168c60 c1168c60 = this.g;
        if (c1168c60 == null || (o50 = (recyclerView = this.h).x) == null || !recyclerView.E) {
            return;
        }
        c1168c60.c.add(o50);
    }

    public final void f(O50 o50, boolean z) {
        C1168c60 c1168c60 = this.g;
        if (c1168c60 == null) {
            return;
        }
        Set set = c1168c60.c;
        set.remove(o50);
        if (set.size() != 0 || z) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = c1168c60.a;
            if (i >= sparseArray.size()) {
                return;
            }
            ArrayList arrayList = ((C1071b60) sparseArray.get(sparseArray.keyAt(i))).a;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                AbstractC1376eG.e(((AbstractC2144m60) arrayList.get(i2)).a);
            }
            i++;
        }
    }

    public final void g() {
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            h(size);
        }
        arrayList.clear();
        if (RecyclerView.Q0) {
            C0702Qd c0702Qd = this.h.s0;
            int[] iArr = (int[]) c0702Qd.d;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c0702Qd.c = 0;
        }
    }

    public final void h(int i) {
        ArrayList arrayList = this.c;
        a((AbstractC2144m60) arrayList.get(i), true);
        arrayList.remove(i);
    }

    public final void i(View view) {
        AbstractC2144m60 abstractC2144m60L = RecyclerView.L(view);
        boolean zN = abstractC2144m60L.n();
        RecyclerView recyclerView = this.h;
        if (zN) {
            recyclerView.removeDetachedView(view, false);
        }
        if (abstractC2144m60L.m()) {
            abstractC2144m60L.n.m(abstractC2144m60L);
        } else if (abstractC2144m60L.t()) {
            abstractC2144m60L.j &= -33;
        }
        j(abstractC2144m60L);
        if (recyclerView.b0 == null || abstractC2144m60L.k()) {
            return;
        }
        recyclerView.b0.d(abstractC2144m60L);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0030  */
    /* JADX WARN: Code duplicated, block: B:40:0x007c  */
    /* JADX WARN: Code duplicated, block: B:42:0x008c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x009e A[LOOP:2: B:43:0x0091->B:47:0x009e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x00a1 A[EDGE_INSN: B:73:0x00a1->B:48:0x00a1 BREAK  A[LOOP:1: B:39:0x007a->B:46:0x009b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00a1 A[EDGE_INSN: B:74:0x00a1->B:48:0x00a1 BREAK  A[LOOP:1: B:39:0x007a->B:46:0x009b, LOOP_LABEL: LOOP:1: B:39:0x007a->B:46:0x009b], SYNTHETIC] */
    public final void j(AbstractC2144m60 abstractC2144m60) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        C0702Qd c0702Qd;
        int i3;
        int i4;
        boolean zM = abstractC2144m60.m();
        boolean z3 = false;
        boolean z4 = true;
        RecyclerView recyclerView = this.h;
        View view = abstractC2144m60.a;
        if (zM || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(abstractC2144m60.m());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.A());
            throw new IllegalArgumentException(sb.toString());
        }
        if (abstractC2144m60.n()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + abstractC2144m60 + recyclerView.A());
        }
        if (abstractC2144m60.s()) {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + recyclerView.A());
        }
        if ((abstractC2144m60.j & 16) == 0) {
            WeakHashMap weakHashMap = It0.a;
            if (view.hasTransientState()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        O50 o50 = recyclerView.x;
        if (abstractC2144m60.k()) {
            if (this.f <= 0 || abstractC2144m60.g(526)) {
                z2 = false;
            } else {
                ArrayList arrayList = this.c;
                int size = arrayList.size();
                if (size >= this.f && size > 0) {
                    h(0);
                    size--;
                }
                if (RecyclerView.Q0 && size > 0) {
                    C0702Qd c0702Qd2 = recyclerView.s0;
                    int i5 = abstractC2144m60.c;
                    if (((int[]) c0702Qd2.d) != null) {
                        int i6 = c0702Qd2.c * 2;
                        int i7 = 0;
                        while (true) {
                            if (i7 >= i6) {
                                i = size - 1;
                                loop1: while (i >= 0) {
                                    i2 = ((AbstractC2144m60) arrayList.get(i)).c;
                                    c0702Qd = recyclerView.s0;
                                    if (((int[]) c0702Qd.d) != null) {
                                        break;
                                    }
                                    i3 = c0702Qd.c * 2;
                                    i4 = 0;
                                    while (true) {
                                        if (i4 < i3) {
                                            break loop1;
                                        } else if (((int[]) c0702Qd.d)[i4] == i2) {
                                            break;
                                        } else {
                                            i4 += 2;
                                        }
                                    }
                                    i--;
                                }
                                size = i + 1;
                            } else if (((int[]) c0702Qd2.d)[i7] != i5) {
                                i7 += 2;
                            }
                        }
                    } else {
                        i = size - 1;
                        loop1: while (i >= 0) {
                            i2 = ((AbstractC2144m60) arrayList.get(i)).c;
                            c0702Qd = recyclerView.s0;
                            if (((int[]) c0702Qd.d) != null) {
                                break;
                                break;
                            }
                            i3 = c0702Qd.c * 2;
                            i4 = 0;
                            while (true) {
                                if (i4 < i3) {
                                    break loop1;
                                    break loop1;
                                } else if (((int[]) c0702Qd.d)[i4] == i2) {
                                    break;
                                } else {
                                    i4 += 2;
                                }
                            }
                            i--;
                        }
                        size = i + 1;
                    }
                }
                arrayList.add(size, abstractC2144m60);
                z2 = true;
            }
            if (z2) {
                z3 = z2;
                z4 = false;
            } else {
                a(abstractC2144m60, true);
                z3 = z2;
            }
        } else {
            z4 = false;
        }
        recyclerView.r.h(abstractC2144m60);
        if (z3 || z4 || !z) {
            return;
        }
        AbstractC1376eG.e(view);
        abstractC2144m60.s = null;
        abstractC2144m60.r = null;
    }

    public final void k(View view) {
        T50 t50;
        AbstractC2144m60 abstractC2144m60L = RecyclerView.L(view);
        boolean zG = abstractC2144m60L.g(12);
        RecyclerView recyclerView = this.h;
        if (!zG && abstractC2144m60L.o() && (t50 = recyclerView.b0) != null) {
            C1418el c1418el = (C1418el) t50;
            if (abstractC2144m60L.f().isEmpty() && c1418el.g && !abstractC2144m60L.j()) {
                if (this.b == null) {
                    this.b = new ArrayList();
                }
                abstractC2144m60L.n = this;
                abstractC2144m60L.f909o = true;
                this.b.add(abstractC2144m60L);
                return;
            }
        }
        if (abstractC2144m60L.j() && !abstractC2144m60L.l() && !recyclerView.x.b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.A());
        }
        abstractC2144m60L.n = this;
        abstractC2144m60L.f909o = false;
        this.a.add(abstractC2144m60L);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:172:0x0308 A[EDGE_INSN: B:172:0x0308->B:173:0x0309 BREAK  A[LOOP:6: B:167:0x02f0->B:171:0x0305]] */
    /* JADX WARN: Code duplicated, block: B:237:0x0418  */
    /* JADX WARN: Code duplicated, block: B:239:0x042d  */
    /* JADX WARN: Code duplicated, block: B:245:0x0447  */
    /* JADX WARN: Code duplicated, block: B:246:0x0449  */
    /* JADX WARN: Code duplicated, block: B:248:0x044c  */
    /* JADX WARN: Code duplicated, block: B:250:0x0452  */
    /* JADX WARN: Code duplicated, block: B:254:0x0471  */
    /* JADX WARN: Code duplicated, block: B:256:0x0475  */
    /* JADX WARN: Code duplicated, block: B:259:0x0486  */
    /* JADX WARN: Code duplicated, block: B:264:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:270:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:272:0x04be  */
    /* JADX WARN: Code duplicated, block: B:274:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:275:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:279:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:281:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:284:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:286:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:287:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:292:0x0501  */
    /* JADX WARN: Code duplicated, block: B:295:0x0506  */
    /* JADX WARN: Code duplicated, block: B:299:0x050f  */
    /* JADX WARN: Code duplicated, block: B:300:0x0519  */
    /* JADX WARN: Code duplicated, block: B:302:0x051f  */
    /* JADX WARN: Code duplicated, block: B:303:0x0529  */
    /* JADX WARN: Code duplicated, block: B:308:0x0534  */
    /* JADX WARN: Code duplicated, block: B:35:0x007d A[EDGE_INSN: B:35:0x007d->B:36:0x007e BREAK  A[LOOP:0: B:14:0x0027->B:20:0x0041]] */
    public final AbstractC2144m60 l(int i, long j) {
        boolean z;
        AbstractC2144m60 abstractC2144m60F;
        int iG;
        C3003v0 c3003v0;
        int i2;
        O50 o50;
        boolean z2;
        long nanoTime;
        long j2;
        AccessibilityManager accessibilityManager;
        boolean z3;
        boolean z4;
        C2338o60 c2338o60;
        C3003v0 c3003v0J;
        C2241n60 c2241n60;
        View.AccessibilityDelegate accessibilityDelegateC;
        ArrayList arrayList;
        ViewGroup.LayoutParams layoutParams;
        long j3;
        ViewGroup.LayoutParams layoutParams2;
        Y50 y50;
        boolean z5;
        RecyclerView recyclerViewF;
        AbstractC2144m60 abstractC2144m60;
        AbstractC2144m60 abstractC2144m61;
        View view;
        boolean z6;
        int size;
        int iG2;
        RecyclerView recyclerView = this.h;
        if (i < 0 || i >= recyclerView.t0.b()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i + "(" + i + "). Item count:" + recyclerView.t0.b() + recyclerView.A());
        }
        C1755i60 c1755i60 = recyclerView.t0;
        if (c1755i60.g) {
            ArrayList arrayList2 = this.b;
            if (arrayList2 != null && (size = arrayList2.size()) != 0) {
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        if (recyclerView.x.b && (iG2 = recyclerView.p.g(i, 0)) > 0 && iG2 < recyclerView.x.a()) {
                            long jB = recyclerView.x.b(iG2);
                            int i4 = 0;
                            while (true) {
                                if (i4 >= size) {
                                    abstractC2144m60F = null;
                                    break;
                                }
                                AbstractC2144m60 abstractC2144m62 = (AbstractC2144m60) this.b.get(i4);
                                if (!abstractC2144m62.t() && abstractC2144m62.e == jB) {
                                    abstractC2144m62.b(32);
                                    abstractC2144m60F = abstractC2144m62;
                                    break;
                                }
                                i4++;
                            }
                        } else {
                            abstractC2144m60F = null;
                            break;
                        }
                    } else {
                        abstractC2144m60F = (AbstractC2144m60) this.b.get(i3);
                        if (!abstractC2144m60F.t() && abstractC2144m60F.e() == i) {
                            abstractC2144m60F.b(32);
                            break;
                        }
                        i3++;
                    }
                }
            } else {
                abstractC2144m60F = null;
                break;
            }
            z = abstractC2144m60F != null;
        } else {
            z = false;
            abstractC2144m60F = null;
        }
        ArrayList arrayList3 = this.c;
        ArrayList arrayList4 = this.a;
        if (abstractC2144m60F == null) {
            int size2 = arrayList4.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size2) {
                    Na0 na0 = recyclerView.q;
                    ArrayList arrayList5 = (ArrayList) na0.f414o;
                    int size3 = arrayList5.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size3) {
                            view = null;
                            break;
                        }
                        View view2 = (View) arrayList5.get(i6);
                        ((N50) na0.m).getClass();
                        AbstractC2144m60 abstractC2144m60L = RecyclerView.L(view2);
                        if (abstractC2144m60L.e() == i && !abstractC2144m60L.j() && !abstractC2144m60L.l()) {
                            view = view2;
                            break;
                        }
                        i6++;
                    }
                    if (view == null) {
                        int size4 = arrayList3.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size4) {
                                abstractC2144m60F = null;
                                break;
                            }
                            abstractC2144m60F = (AbstractC2144m60) arrayList3.get(i7);
                            if (!abstractC2144m60F.j() && abstractC2144m60F.e() == i && !abstractC2144m60F.h()) {
                                arrayList3.remove(i7);
                                break;
                            }
                            i7++;
                        }
                    } else {
                        AbstractC2144m60 abstractC2144m60L2 = RecyclerView.L(view);
                        Na0 na1 = recyclerView.q;
                        int iIndexOfChild = ((N50) na1.m).a.indexOfChild(view);
                        if (iIndexOfChild < 0) {
                            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                        }
                        C3306y6 c3306y6 = (C3306y6) na1.n;
                        if (!c3306y6.K(iIndexOfChild)) {
                            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                        }
                        c3306y6.H(iIndexOfChild);
                        na1.V(view);
                        int iJ = recyclerView.q.J(view);
                        if (iJ == -1) {
                            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + abstractC2144m60L2 + recyclerView.A());
                        }
                        recyclerView.q.u(iJ);
                        k(view);
                        abstractC2144m60L2.b(8224);
                        abstractC2144m60F = abstractC2144m60L2;
                        break;
                    }
                } else {
                    AbstractC2144m60 abstractC2144m63 = (AbstractC2144m60) arrayList4.get(i5);
                    if (!abstractC2144m63.t() && abstractC2144m63.e() == i && !abstractC2144m63.j() && (c1755i60.g || !abstractC2144m63.l())) {
                        abstractC2144m63.b(32);
                        abstractC2144m60F = abstractC2144m63;
                        break;
                    }
                    i5++;
                }
            }
            if (abstractC2144m60F != null) {
                if (abstractC2144m60F.l()) {
                    z6 = c1755i60.g;
                } else {
                    int i8 = abstractC2144m60F.c;
                    if (i8 < 0 || i8 >= recyclerView.x.a()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + abstractC2144m60F + recyclerView.A());
                    }
                    if (c1755i60.g || recyclerView.x.c(abstractC2144m60F.c) == abstractC2144m60F.f) {
                        O50 o51 = recyclerView.x;
                        if (!o51.b || abstractC2144m60F.e == o51.b(abstractC2144m60F.c)) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    } else {
                        z6 = false;
                    }
                }
                if (z6) {
                    z = true;
                } else {
                    abstractC2144m60F.b(4);
                    if (abstractC2144m60F.m()) {
                        recyclerView.removeDetachedView(abstractC2144m60F.a, false);
                        abstractC2144m60F.n.m(abstractC2144m60F);
                    } else if (abstractC2144m60F.t()) {
                        abstractC2144m60F.j &= -33;
                    }
                    j(abstractC2144m60F);
                    abstractC2144m60F = null;
                }
            }
        }
        if (abstractC2144m60F == null) {
            int iG3 = recyclerView.p.g(i, 0);
            if (iG3 < 0 || iG3 >= recyclerView.x.a()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + iG3 + ").state:" + c1755i60.b() + recyclerView.A());
            }
            int iC = recyclerView.x.c(iG3);
            O50 o52 = recyclerView.x;
            if (o52.b) {
                long jB2 = o52.b(iG3);
                int size5 = arrayList4.size() - 1;
                while (true) {
                    if (size5 < 0) {
                        int size6 = arrayList3.size() - 1;
                        while (true) {
                            if (size6 >= 0) {
                                AbstractC2144m60 abstractC2144m64 = (AbstractC2144m60) arrayList3.get(size6);
                                if (abstractC2144m64.e != jB2 || abstractC2144m64.h()) {
                                    size6--;
                                } else {
                                    if (iC == abstractC2144m64.f) {
                                        arrayList3.remove(size6);
                                        abstractC2144m61 = abstractC2144m64;
                                        break;
                                    }
                                    h(size6);
                                }
                            }
                            abstractC2144m61 = null;
                            break;
                        }
                    }
                    abstractC2144m61 = (AbstractC2144m60) arrayList4.get(size5);
                    if (abstractC2144m61.e == jB2 && !abstractC2144m61.t()) {
                        if (iC == abstractC2144m61.f) {
                            abstractC2144m61.b(32);
                            if (!abstractC2144m61.l() || c1755i60.g) {
                                break;
                                break;
                            }
                            abstractC2144m61.j = (abstractC2144m61.j & (-15)) | 2;
                            break;
                        }
                        arrayList4.remove(size5);
                        View view3 = abstractC2144m61.a;
                        recyclerView.removeDetachedView(view3, false);
                        AbstractC2144m60 abstractC2144m60L3 = RecyclerView.L(view3);
                        abstractC2144m60L3.n = null;
                        abstractC2144m60L3.f909o = false;
                        abstractC2144m60L3.j &= -33;
                        j(abstractC2144m60L3);
                    }
                    size5--;
                }
                if (abstractC2144m61 != null) {
                    abstractC2144m61.c = iG3;
                    abstractC2144m60F = abstractC2144m61;
                    z = true;
                } else {
                    abstractC2144m60F = abstractC2144m61;
                }
            }
            if (abstractC2144m60F == null) {
                C1071b60 c1071b60 = (C1071b60) c().a.get(iC);
                if (c1071b60 == null) {
                    abstractC2144m60 = null;
                    break;
                }
                ArrayList arrayList6 = c1071b60.a;
                if (!arrayList6.isEmpty()) {
                    int size7 = arrayList6.size() - 1;
                    while (true) {
                        if (size7 < 0) {
                            abstractC2144m60 = null;
                            break;
                        }
                        if (!((AbstractC2144m60) arrayList6.get(size7)).h()) {
                            abstractC2144m60 = (AbstractC2144m60) arrayList6.remove(size7);
                            break;
                        }
                        size7--;
                    }
                } else {
                    abstractC2144m60 = null;
                    break;
                }
                if (abstractC2144m60 != null) {
                    abstractC2144m60.q();
                    int[] iArr = RecyclerView.M0;
                }
                abstractC2144m60F = abstractC2144m60;
            }
            if (abstractC2144m60F == null) {
                long nanoTime2 = recyclerView.getNanoTime();
                if (j != Long.MAX_VALUE) {
                    long j4 = this.g.a(iC).c;
                    if (!(j4 == 0 || j4 + nanoTime2 < j)) {
                        return null;
                    }
                }
                O50 o53 = recyclerView.x;
                o53.getClass();
                try {
                    int i9 = Vl0.a;
                    Trace.beginSection("RV CreateView");
                    abstractC2144m60F = o53.f(iC, recyclerView);
                    View view4 = abstractC2144m60F.a;
                    if (view4.getParent() != null) {
                        throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                    }
                    abstractC2144m60F.f = iC;
                    Trace.endSection();
                    if (RecyclerView.Q0 && (recyclerViewF = RecyclerView.F(view4)) != null) {
                        abstractC2144m60F.b = new WeakReference(recyclerViewF);
                    }
                    long nanoTime3 = recyclerView.getNanoTime() - nanoTime2;
                    C1071b60 c1071b60A = this.g.a(iC);
                    long j5 = c1071b60A.c;
                    if (j5 != 0) {
                        nanoTime3 = (nanoTime3 / 4) + ((j5 / 4) * 3);
                    }
                    c1071b60A.c = nanoTime3;
                } catch (Throwable th) {
                    int i10 = Vl0.a;
                    Trace.endSection();
                    throw th;
                }
            }
        }
        if (z && !c1755i60.g && abstractC2144m60F.g(C1672hI.a.e)) {
            abstractC2144m60F.j &= -8193;
            if (c1755i60.j) {
                T50.b(abstractC2144m60F);
                T50 t50 = recyclerView.b0;
                abstractC2144m60F.f();
                t50.getClass();
                C2650rP c2650rP = new C2650rP();
                c2650rP.b(abstractC2144m60F);
                recyclerView.Z(abstractC2144m60F, c2650rP);
            }
        }
        boolean z7 = c1755i60.g;
        View view5 = abstractC2144m60F.a;
        if (!z7 || !abstractC2144m60F.i()) {
            if (abstractC2144m60F.i()) {
                if (((abstractC2144m60F.j & 2) != 0) || abstractC2144m60F.j()) {
                    iG = recyclerView.p.g(i, 0);
                    c3003v0 = null;
                    abstractC2144m60F.s = null;
                    abstractC2144m60F.r = recyclerView;
                    i2 = abstractC2144m60F.f;
                    long nanoTime4 = recyclerView.getNanoTime();
                    if (j != Long.MAX_VALUE) {
                        j3 = this.g.a(i2).d;
                        if (j3 != 0) {
                        }
                    }
                    o50 = recyclerView.x;
                    o50.getClass();
                    if (abstractC2144m60F.s == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        abstractC2144m60F.c = iG;
                        if (o50.b) {
                            abstractC2144m60F.e = o50.b(iG);
                        }
                        abstractC2144m60F.j = (abstractC2144m60F.j & (-520)) | 1;
                        int i11 = Vl0.a;
                        Trace.beginSection("RV OnBindView");
                    }
                    abstractC2144m60F.s = o50;
                    abstractC2144m60F.f();
                    o50.e(abstractC2144m60F, iG);
                    if (z2) {
                        arrayList = abstractC2144m60F.k;
                        if (arrayList != null) {
                            arrayList.clear();
                        }
                        abstractC2144m60F.j &= -1025;
                        layoutParams = view5.getLayoutParams();
                        if (layoutParams instanceof Y50) {
                            ((Y50) layoutParams).c = true;
                        }
                        int i12 = Vl0.a;
                        Trace.endSection();
                    }
                    nanoTime = recyclerView.getNanoTime() - nanoTime4;
                    C1071b60 c1071b60A2 = this.g.a(abstractC2144m60F.f);
                    j2 = c1071b60A2.d;
                    if (j2 != 0) {
                        nanoTime = (nanoTime / 4) + ((j2 / 4) * 3);
                    }
                    c1071b60A2.d = nanoTime;
                    accessibilityManager = recyclerView.N;
                    if (accessibilityManager == null) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        WeakHashMap weakHashMap = It0.a;
                        if (view5.getImportantForAccessibility() == 0) {
                            view5.setImportantForAccessibility(1);
                        }
                        c2338o60 = recyclerView.A0;
                        if (c2338o60 != null) {
                            c3003v0J = c2338o60.j();
                            if (c3003v0J instanceof C2241n60) {
                                c2241n60 = (C2241n60) c3003v0J;
                                c2241n60.getClass();
                                accessibilityDelegateC = It0.c(view5);
                                if (accessibilityDelegateC != null) {
                                    if (accessibilityDelegateC instanceof C2906u0) {
                                        c3003v0 = ((C2906u0) accessibilityDelegateC).a;
                                    } else {
                                        c3003v0 = new C3003v0(accessibilityDelegateC);
                                    }
                                }
                                if (c3003v0 != null) {
                                    c2241n60.e.put(view5, c3003v0);
                                }
                            }
                            It0.p(view5, c3003v0J);
                        }
                    }
                    if (c1755i60.g) {
                        abstractC2144m60F.g = i;
                    }
                    z4 = true;
                }
            } else {
                iG = recyclerView.p.g(i, 0);
                c3003v0 = null;
                abstractC2144m60F.s = null;
                abstractC2144m60F.r = recyclerView;
                i2 = abstractC2144m60F.f;
                long nanoTime5 = recyclerView.getNanoTime();
                if (j != Long.MAX_VALUE) {
                    j3 = this.g.a(i2).d;
                    if (j3 != 0 || j3 + nanoTime5 < j) {
                    }
                }
                o50 = recyclerView.x;
                o50.getClass();
                if (abstractC2144m60F.s == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    abstractC2144m60F.c = iG;
                    if (o50.b) {
                        abstractC2144m60F.e = o50.b(iG);
                    }
                    abstractC2144m60F.j = (abstractC2144m60F.j & (-520)) | 1;
                    int i13 = Vl0.a;
                    Trace.beginSection("RV OnBindView");
                }
                abstractC2144m60F.s = o50;
                abstractC2144m60F.f();
                o50.e(abstractC2144m60F, iG);
                if (z2) {
                    arrayList = abstractC2144m60F.k;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    abstractC2144m60F.j &= -1025;
                    layoutParams = view5.getLayoutParams();
                    if (layoutParams instanceof Y50) {
                        ((Y50) layoutParams).c = true;
                    }
                    int i14 = Vl0.a;
                    Trace.endSection();
                }
                nanoTime = recyclerView.getNanoTime() - nanoTime5;
                C1071b60 c1071b60A3 = this.g.a(abstractC2144m60F.f);
                j2 = c1071b60A3.d;
                if (j2 != 0) {
                    nanoTime = (nanoTime / 4) + ((j2 / 4) * 3);
                }
                c1071b60A3.d = nanoTime;
                accessibilityManager = recyclerView.N;
                if (accessibilityManager == null && accessibilityManager.isEnabled()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    WeakHashMap weakHashMap2 = It0.a;
                    if (view5.getImportantForAccessibility() == 0) {
                        view5.setImportantForAccessibility(1);
                    }
                    c2338o60 = recyclerView.A0;
                    if (c2338o60 != null) {
                        c3003v0J = c2338o60.j();
                        if (c3003v0J instanceof C2241n60) {
                            c2241n60 = (C2241n60) c3003v0J;
                            c2241n60.getClass();
                            accessibilityDelegateC = It0.c(view5);
                            if (accessibilityDelegateC != null) {
                                if (accessibilityDelegateC instanceof C2906u0) {
                                    c3003v0 = ((C2906u0) accessibilityDelegateC).a;
                                } else {
                                    c3003v0 = new C3003v0(accessibilityDelegateC);
                                }
                            }
                            if (c3003v0 != null && c3003v0 != c2241n60) {
                                c2241n60.e.put(view5, c3003v0);
                            }
                        }
                        It0.p(view5, c3003v0J);
                    }
                }
                if (c1755i60.g) {
                    abstractC2144m60F.g = i;
                }
                z4 = true;
            }
            layoutParams2 = view5.getLayoutParams();
            if (layoutParams2 == null) {
                y50 = (Y50) recyclerView.generateDefaultLayoutParams();
                view5.setLayoutParams(y50);
            } else if (recyclerView.checkLayoutParams(layoutParams2)) {
                y50 = (Y50) layoutParams2;
            } else {
                y50 = (Y50) recyclerView.generateLayoutParams(layoutParams2);
                view5.setLayoutParams(y50);
            }
            y50.a = abstractC2144m60F;
            if (z || !z4) {
                z5 = false;
            } else {
                z5 = true;
            }
            y50.d = z5;
            return abstractC2144m60F;
        }
        abstractC2144m60F.g = i;
        z4 = false;
        layoutParams2 = view5.getLayoutParams();
        if (layoutParams2 == null) {
            y50 = (Y50) recyclerView.generateDefaultLayoutParams();
            view5.setLayoutParams(y50);
        } else if (recyclerView.checkLayoutParams(layoutParams2)) {
            y50 = (Y50) recyclerView.generateLayoutParams(layoutParams2);
            view5.setLayoutParams(y50);
        } else {
            y50 = (Y50) layoutParams2;
        }
        y50.a = abstractC2144m60F;
        if (z) {
            z5 = false;
        } else {
            z5 = false;
        }
        y50.d = z5;
        return abstractC2144m60F;
    }

    public final void m(AbstractC2144m60 abstractC2144m60) {
        if (abstractC2144m60.f909o) {
            this.b.remove(abstractC2144m60);
        } else {
            this.a.remove(abstractC2144m60);
        }
        abstractC2144m60.n = null;
        abstractC2144m60.f909o = false;
        abstractC2144m60.j &= -33;
    }

    public final void n() {
        X50 x50 = this.h.y;
        this.f = this.e + (x50 != null ? x50.j : 0);
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f; size--) {
            h(size);
        }
    }
}
