package o;

import android.content.Context;
import java.util.HashSet;

/* JADX INFO: renamed from: o.pk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2488pk implements InterfaceC3061vg {
    public final Context l;
    public final InterfaceC2964ug m;

    public C2488pk(Context context, C3309y70 c3309y70) {
        this.l = context.getApplicationContext();
        this.m = c3309y70;
    }

    @Override // o.InterfaceC1088bK
    public final void b() {
        C1797ie0 c1797ie0F = C1797ie0.f(this.l);
        InterfaceC2964ug interfaceC2964ug = this.m;
        synchronized (c1797ie0F) {
            ((HashSet) c1797ie0F.f832o).remove(interfaceC2964ug);
            if (c1797ie0F.m && ((HashSet) c1797ie0F.f832o).isEmpty()) {
                ((InterfaceC1405ee0) c1797ie0F.n).a();
                c1797ie0F.m = false;
            }
        }
    }

    @Override // o.InterfaceC1088bK
    public final void j() {
        C1797ie0 c1797ie0F = C1797ie0.f(this.l);
        InterfaceC2964ug interfaceC2964ug = this.m;
        synchronized (c1797ie0F) {
            ((HashSet) c1797ie0F.f832o).add(interfaceC2964ug);
            if (!c1797ie0F.m && !((HashSet) c1797ie0F.f832o).isEmpty()) {
                c1797ie0F.m = ((InterfaceC1405ee0) c1797ie0F.n).d();
            }
        }
    }

    @Override // o.InterfaceC1088bK
    public final void k() {
    }
}
