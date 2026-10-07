package o;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: o.fz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1544fz implements Runnable {
    public static final ThreadLocal p = new ThreadLocal();
    public static final N2 q = new N2(16);
    public ArrayList l;
    public long m;
    public long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f787o;

    public static AbstractC2144m60 c(RecyclerView recyclerView, int i, long j) {
        int iE = recyclerView.q.E();
        for (int i2 = 0; i2 < iE; i2++) {
            AbstractC2144m60 abstractC2144m60L = RecyclerView.L(recyclerView.q.D(i2));
            if (abstractC2144m60L.c == i && !abstractC2144m60L.j()) {
                return null;
            }
        }
        C1266d60 c1266d60 = recyclerView.n;
        try {
            recyclerView.T();
            AbstractC2144m60 abstractC2144m60L2 = c1266d60.l(i, j);
            if (abstractC2144m60L2 != null) {
                if (!abstractC2144m60L2.i() || abstractC2144m60L2.j()) {
                    c1266d60.a(abstractC2144m60L2, false);
                } else {
                    c1266d60.i(abstractC2144m60L2.a);
                }
            }
            return abstractC2144m60L2;
        } finally {
            recyclerView.U(false);
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.E && this.m == 0) {
            this.m = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0702Qd c0702Qd = recyclerView.s0;
        c0702Qd.a = i;
        c0702Qd.b = i2;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0139  */
    public final void b(long j) {
        C1446ez c1446ez;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C1446ez c1446ez2;
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                C0702Qd c0702Qd = recyclerView3.s0;
                c0702Qd.c(recyclerView3, false);
                i += c0702Qd.c;
            }
        }
        ArrayList arrayList2 = this.f787o;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                C0702Qd c0702Qd2 = recyclerView4.s0;
                int iAbs = Math.abs(c0702Qd2.b) + Math.abs(c0702Qd2.a);
                for (int i5 = 0; i5 < c0702Qd2.c * 2; i5 += 2) {
                    if (i3 >= arrayList2.size()) {
                        c1446ez2 = new C1446ez();
                        arrayList2.add(c1446ez2);
                    } else {
                        c1446ez2 = (C1446ez) arrayList2.get(i3);
                    }
                    int[] iArr = (int[]) c0702Qd2.d;
                    int i6 = iArr[i5 + 1];
                    c1446ez2.a = i6 <= iAbs;
                    c1446ez2.b = iAbs;
                    c1446ez2.c = i6;
                    c1446ez2.d = recyclerView4;
                    c1446ez2.e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList2, q);
        for (int i7 = 0; i7 < arrayList2.size() && (recyclerView = (c1446ez = (C1446ez) arrayList2.get(i7)).d) != null; i7++) {
            AbstractC2144m60 abstractC2144m60C = c(recyclerView, c1446ez.e, c1446ez.a ? Long.MAX_VALUE : j);
            if (abstractC2144m60C != null && abstractC2144m60C.b != null && abstractC2144m60C.i() && !abstractC2144m60C.j() && (recyclerView2 = (RecyclerView) abstractC2144m60C.b.get()) != null) {
                if (recyclerView2.P && recyclerView2.q.E() != 0) {
                    T50 t50 = recyclerView2.b0;
                    if (t50 != null) {
                        t50.e();
                    }
                    X50 x50 = recyclerView2.y;
                    C1266d60 c1266d60 = recyclerView2.n;
                    if (x50 != null) {
                        x50.x0(c1266d60);
                        recyclerView2.y.y0(c1266d60);
                    }
                    c1266d60.a.clear();
                    c1266d60.g();
                }
                C0702Qd c0702Qd3 = recyclerView2.s0;
                c0702Qd3.c(recyclerView2, true);
                if (c0702Qd3.c != 0) {
                    try {
                        int i8 = Vl0.a;
                        Trace.beginSection("RV Nested Prefetch");
                        C1755i60 c1755i60 = recyclerView2.t0;
                        O50 o50 = recyclerView2.x;
                        c1755i60.d = 1;
                        c1755i60.e = o50.a();
                        c1755i60.g = false;
                        c1755i60.h = false;
                        c1755i60.i = false;
                        for (int i9 = 0; i9 < c0702Qd3.c * 2; i9 += 2) {
                            c(recyclerView2, ((int[]) c0702Qd3.d)[i9], j);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        int i10 = Vl0.a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            c1446ez.a = false;
            c1446ez.b = 0;
            c1446ez.c = 0;
            c1446ez.d = null;
            c1446ez.e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = Vl0.a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.l;
            if (arrayList.isEmpty()) {
                this.m = 0L;
                return;
            }
            int size = arrayList.size();
            long jMax = 0;
            for (int i2 = 0; i2 < size; i2++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i2);
                if (recyclerView.getWindowVisibility() == 0) {
                    jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                }
            }
            if (jMax == 0) {
                this.m = 0L;
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.n);
                this.m = 0L;
            }
        } finally {
            this.m = 0L;
            int i3 = Vl0.a;
            Trace.endSection();
        }
    }
}
