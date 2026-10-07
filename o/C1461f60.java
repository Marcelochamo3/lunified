package o;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: o.f60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1461f60 extends Q50 {
    public final /* synthetic */ RecyclerView a;

    public C1461f60(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // o.Q50
    public final void a() {
        RecyclerView recyclerView = this.a;
        recyclerView.i(null);
        recyclerView.t0.f = true;
        recyclerView.Y(true);
        if (recyclerView.p.j()) {
            return;
        }
        recyclerView.requestLayout();
    }

    @Override // o.Q50
    public final void b(int i, int i2, Object obj) {
        RecyclerView recyclerView = this.a;
        recyclerView.i(null);
        Y1 y1 = recyclerView.p;
        if (i2 < 1) {
            y1.getClass();
            return;
        }
        ArrayList arrayList = (ArrayList) y1.c;
        arrayList.add(y1.l(obj, 4, i, i2));
        y1.a |= 4;
        if (arrayList.size() == 1) {
            g();
        }
    }

    @Override // o.Q50
    public final void c(int i, int i2) {
        RecyclerView recyclerView = this.a;
        recyclerView.i(null);
        Y1 y1 = recyclerView.p;
        if (i2 < 1) {
            y1.getClass();
            return;
        }
        ArrayList arrayList = (ArrayList) y1.c;
        arrayList.add(y1.l(null, 1, i, i2));
        y1.a |= 1;
        if (arrayList.size() == 1) {
            g();
        }
    }

    @Override // o.Q50
    public final void d(int i, int i2) {
        RecyclerView recyclerView = this.a;
        recyclerView.i(null);
        Y1 y1 = recyclerView.p;
        y1.getClass();
        if (i == i2) {
            return;
        }
        ArrayList arrayList = (ArrayList) y1.c;
        arrayList.add(y1.l(null, 8, i, i2));
        y1.a |= 8;
        if (arrayList.size() == 1) {
            g();
        }
    }

    @Override // o.Q50
    public final void e(int i, int i2) {
        RecyclerView recyclerView = this.a;
        recyclerView.i(null);
        Y1 y1 = recyclerView.p;
        if (i2 < 1) {
            y1.getClass();
            return;
        }
        ArrayList arrayList = (ArrayList) y1.c;
        arrayList.add(y1.l(null, 2, i, i2));
        y1.a |= 2;
        if (arrayList.size() == 1) {
            g();
        }
    }

    @Override // o.Q50
    public final void f() {
        O50 o50;
        RecyclerView recyclerView = this.a;
        if (recyclerView.f31o == null || (o50 = recyclerView.x) == null) {
            return;
        }
        int iW = AbstractC1701hf0.w(o50.c);
        if (iW != 1) {
            if (iW == 2) {
                return;
            }
        } else if (o50.a() <= 0) {
            return;
        }
        recyclerView.requestLayout();
    }

    public final void g() {
        boolean z = RecyclerView.P0;
        RecyclerView recyclerView = this.a;
        if (z && recyclerView.F && recyclerView.E) {
            WeakHashMap weakHashMap = It0.a;
            recyclerView.postOnAnimation(recyclerView.t);
        } else {
            recyclerView.M = true;
            recyclerView.requestLayout();
        }
    }
}
