package o;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: o.fg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1506fg extends AbstractC1464f8 {
    public final HashMap h = new HashMap();
    public Handler i;
    public InterfaceC2590qm0 j;

    @Override // o.AbstractC1464f8
    public final void d() {
        for (C1408eg c1408eg : this.h.values()) {
            c1408eg.a.c(c1408eg.b);
        }
    }

    @Override // o.AbstractC1464f8
    public final void f() {
        for (C1408eg c1408eg : this.h.values()) {
            c1408eg.a.e(c1408eg.b);
        }
    }

    @Override // o.AbstractC1464f8
    public void j() {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((C1408eg) it.next()).a.j();
        }
    }

    @Override // o.AbstractC1464f8
    public void p() {
        HashMap map = this.h;
        for (C1408eg c1408eg : map.values()) {
            c1408eg.a.o(c1408eg.b);
            AbstractC1464f8 abstractC1464f8 = c1408eg.a;
            C2303no0 c2303no0 = c1408eg.c;
            abstractC1464f8.r(c2303no0);
            abstractC1464f8.q(c2303no0);
        }
        map.clear();
    }

    public abstract CP s(Object obj, CP cp);

    public abstract void v(Object obj, AbstractC1464f8 abstractC1464f8, Fj0 fj0);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [o.DP, o.dg] */
    public final void w(final Object obj, AbstractC1464f8 abstractC1464f8) {
        HashMap map = this.h;
        AbstractC0397Ej.c(!map.containsKey(obj));
        ?? r1 = new DP() { // from class: o.dg
            @Override // o.DP
            public final void a(AbstractC1464f8 abstractC1464f9, Fj0 fj0) {
                this.a.v(obj, abstractC1464f9, fj0);
            }
        };
        C2303no0 c2303no0 = new C2303no0(this, obj);
        map.put(obj, new C1408eg(abstractC1464f8, r1, c2303no0));
        Handler handler = this.i;
        handler.getClass();
        C2613qy c2613qy = abstractC1464f8.c;
        c2613qy.getClass();
        HP hp = new HP();
        hp.a = handler;
        hp.b = c2303no0;
        ((CopyOnWriteArrayList) c2613qy.f996o).add(hp);
        Handler handler2 = this.i;
        handler2.getClass();
        C0350Co c0350Co = abstractC1464f8.d;
        c0350Co.getClass();
        C0324Bo c0324Bo = new C0324Bo();
        c0324Bo.a = handler2;
        c0324Bo.b = c2303no0;
        c0350Co.c.add(c0324Bo);
        InterfaceC2590qm0 interfaceC2590qm0 = this.j;
        C3436zZ c3436zZ = this.g;
        AbstractC0397Ej.g(c3436zZ);
        abstractC1464f8.k(r1, interfaceC2590qm0, c3436zZ);
        if (!this.b.isEmpty()) {
            return;
        }
        abstractC1464f8.c(r1);
    }

    public long t(long j, Object obj) {
        return j;
    }

    public int u(int i, Object obj) {
        return i;
    }
}
