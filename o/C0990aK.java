package o;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: o.aK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0990aK implements UJ, InterfaceC1185cK {
    public final HashSet l = new HashSet();
    public final C1478fK m;

    public C0990aK(C1478fK c1478fK) {
        this.m = c1478fK;
        c1478fK.a(this);
    }

    @Override // o.UJ
    public final void c(InterfaceC1088bK interfaceC1088bK) {
        this.l.add(interfaceC1088bK);
        TJ tj = this.m.d;
        if (tj == TJ.l) {
            interfaceC1088bK.k();
        } else if (tj.compareTo(TJ.f532o) >= 0) {
            interfaceC1088bK.j();
        } else {
            interfaceC1088bK.b();
        }
    }

    @Override // o.UJ
    public final void j(InterfaceC1088bK interfaceC1088bK) {
        this.l.remove(interfaceC1088bK);
    }

    @InterfaceC2173mW(SJ.ON_DESTROY)
    public void onDestroy(InterfaceC1283dK interfaceC1283dK) {
        Iterator it = Kr0.e(this.l).iterator();
        while (it.hasNext()) {
            ((InterfaceC1088bK) it.next()).k();
        }
        interfaceC1283dK.f().f(this);
    }

    @InterfaceC2173mW(SJ.ON_START)
    public void onStart(InterfaceC1283dK interfaceC1283dK) {
        Iterator it = Kr0.e(this.l).iterator();
        while (it.hasNext()) {
            ((InterfaceC1088bK) it.next()).j();
        }
    }

    @InterfaceC2173mW(SJ.ON_STOP)
    public void onStop(InterfaceC1283dK interfaceC1283dK) {
        Iterator it = Kr0.e(this.l).iterator();
        while (it.hasNext()) {
            ((InterfaceC1088bK) it.next()).b();
        }
    }
}
