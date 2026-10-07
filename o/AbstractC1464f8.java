package o;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: o.f8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1464f8 {
    public final ArrayList a = new ArrayList(1);
    public final HashSet b = new HashSet(1);
    public final C2613qy c = new C2613qy(new CopyOnWriteArrayList(), 0, (CP) null);
    public final C0350Co d = new C0350Co(new CopyOnWriteArrayList(), 0, null);
    public Looper e;
    public Fj0 f;
    public C3436zZ g;

    public final C2613qy a(CP cp) {
        return new C2613qy((CopyOnWriteArrayList) this.c.f996o, 0, cp);
    }

    public abstract InterfaceC2941uP b(CP cp, C1562g8 c1562g8, long j);

    public final void c(DP dp) {
        HashSet hashSet = this.b;
        boolean z = !hashSet.isEmpty();
        hashSet.remove(dp);
        if (z && hashSet.isEmpty()) {
            d();
        }
    }

    public final void e(DP dp) {
        this.e.getClass();
        HashSet hashSet = this.b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(dp);
        if (zIsEmpty) {
            f();
        }
    }

    public Fj0 g() {
        return null;
    }

    public abstract C1971kP h();

    public boolean i() {
        return true;
    }

    public abstract void j();

    public final void k(DP dp, InterfaceC2590qm0 interfaceC2590qm0, C3436zZ c3436zZ) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.e;
        AbstractC0397Ej.c(looper == null || looper == looperMyLooper);
        this.g = c3436zZ;
        Fj0 fj0 = this.f;
        this.a.add(dp);
        if (this.e == null) {
            this.e = looperMyLooper;
            this.b.add(dp);
            l(interfaceC2590qm0);
        } else if (fj0 != null) {
            e(dp);
            dp.a(this, fj0);
        }
    }

    public abstract void l(InterfaceC2590qm0 interfaceC2590qm0);

    public final void m(Fj0 fj0) {
        this.f = fj0;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((DP) it.next()).a(this, fj0);
        }
    }

    public abstract void n(InterfaceC2941uP interfaceC2941uP);

    public final void o(DP dp) {
        ArrayList arrayList = this.a;
        arrayList.remove(dp);
        if (!arrayList.isEmpty()) {
            c(dp);
            return;
        }
        this.e = null;
        this.f = null;
        this.g = null;
        this.b.clear();
        p();
    }

    public abstract void p();

    public final void q(InterfaceC0376Do interfaceC0376Do) {
        CopyOnWriteArrayList<C0324Bo> copyOnWriteArrayList = this.d.c;
        for (C0324Bo c0324Bo : copyOnWriteArrayList) {
            if (c0324Bo.b == interfaceC0376Do) {
                copyOnWriteArrayList.remove(c0324Bo);
            }
        }
    }

    public final void r(IP ip) {
        CopyOnWriteArrayList<HP> copyOnWriteArrayList = (CopyOnWriteArrayList) this.c.f996o;
        for (HP hp : copyOnWriteArrayList) {
            if (hp.b == ip) {
                copyOnWriteArrayList.remove(hp);
            }
        }
    }

    public void d() {
    }

    public void f() {
    }
}
