package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class FS implements InterfaceC1610gj, InterfaceC1512fj {
    public final List l;
    public final InterfaceC1941k20 m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public EnumC1651h30 f259o;
    public InterfaceC1512fj p;
    public List q;
    public boolean r;

    public FS(ArrayList arrayList, InterfaceC1941k20 interfaceC1941k20) {
        this.m = interfaceC1941k20;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.l = arrayList;
        this.n = 0;
    }

    @Override // o.InterfaceC1610gj
    public final void a() {
        List list = this.q;
        if (list != null) {
            this.m.e(list);
        }
        this.q = null;
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            ((InterfaceC1610gj) it.next()).a();
        }
    }

    @Override // o.InterfaceC1610gj
    public final Class b() {
        return ((InterfaceC1610gj) this.l.get(0)).b();
    }

    @Override // o.InterfaceC1610gj
    public final int c() {
        return ((InterfaceC1610gj) this.l.get(0)).c();
    }

    @Override // o.InterfaceC1610gj
    public final void cancel() {
        this.r = true;
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            ((InterfaceC1610gj) it.next()).cancel();
        }
    }

    @Override // o.InterfaceC1512fj
    public final void d(Exception exc) {
        List list = this.q;
        AbstractC3045vW.k(list, "Argument must not be null");
        list.add(exc);
        g();
    }

    @Override // o.InterfaceC1610gj
    public final void e(EnumC1651h30 enumC1651h30, InterfaceC1512fj interfaceC1512fj) {
        this.f259o = enumC1651h30;
        this.p = interfaceC1512fj;
        this.q = (List) this.m.n();
        ((InterfaceC1610gj) this.l.get(this.n)).e(enumC1651h30, this);
        if (this.r) {
            cancel();
        }
    }

    @Override // o.InterfaceC1512fj
    public final void f(Object obj) {
        if (obj != null) {
            this.p.f(obj);
        } else {
            g();
        }
    }

    public final void g() {
        if (this.r) {
            return;
        }
        if (this.n < this.l.size() - 1) {
            this.n++;
            e(this.f259o, this.p);
        } else {
            AbstractC3045vW.j(this.q);
            this.p.d(new C1762iA("Fetch failed", new ArrayList(this.q)));
        }
    }
}
