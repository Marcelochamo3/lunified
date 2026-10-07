package o;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: o.ui0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2969ui0 implements InterfaceC1088bK {
    public final Set l = Collections.newSetFromMap(new WeakHashMap());

    @Override // o.InterfaceC1088bK
    public final void b() {
        Iterator it = Kr0.e(this.l).iterator();
        while (it.hasNext()) {
            ((InterfaceC2872ti0) it.next()).b();
        }
    }

    @Override // o.InterfaceC1088bK
    public final void j() {
        Iterator it = Kr0.e(this.l).iterator();
        while (it.hasNext()) {
            ((InterfaceC2872ti0) it.next()).j();
        }
    }

    @Override // o.InterfaceC1088bK
    public final void k() {
        Iterator it = Kr0.e(this.l).iterator();
        while (it.hasNext()) {
            ((InterfaceC2872ti0) it.next()).k();
        }
    }
}
