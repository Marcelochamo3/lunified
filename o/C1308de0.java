package o;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: o.de0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1308de0 implements InterfaceC2964ug {
    public final /* synthetic */ C1797ie0 a;

    public C1308de0(C1797ie0 c1797ie0) {
        this.a = c1797ie0;
    }

    @Override // o.InterfaceC2964ug
    public final void a(boolean z) {
        ArrayList arrayList;
        Kr0.a();
        synchronized (this.a) {
            arrayList = new ArrayList((HashSet) this.a.f832o);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC2964ug) it.next()).a(z);
        }
    }
}
