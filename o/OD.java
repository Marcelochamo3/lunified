package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class OD implements InterfaceC0360Cy {
    public final WD l;
    public final /* synthetic */ TD m;

    public OD(TD td, WD wd) {
        this.m = td;
        this.l = wd;
    }

    @Override // o.InterfaceC0360Cy
    public final Object c() {
        TD td = this.m;
        WD wd = this.l;
        try {
            wd.f(this);
            do {
            } while (wd.a(false, this));
            td.a(1, 9, null);
        } catch (IOException e) {
            td.a(2, 2, e);
        } finally {
            td.a(3, 3, null);
            Mr0.d(wd);
        }
        return C2985uq0.a;
    }
}
