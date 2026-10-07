package o;

import java.io.IOException;

/* JADX INFO: renamed from: o.tr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2889tr extends AbstractC3177wp0 {
    public AbstractC3177wp0 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ BA d;
    public final /* synthetic */ Kp0 e;
    public final /* synthetic */ C2986ur f;

    public C2889tr(C2986ur c2986ur, boolean z, boolean z2, BA ba, Kp0 kp0) {
        this.f = c2986ur;
        this.b = z;
        this.c = z2;
        this.d = ba;
        this.e = kp0;
    }

    @Override // o.AbstractC3177wp0
    public final Object a(WH wh) throws IOException {
        if (this.b) {
            wh.p0();
            return null;
        }
        AbstractC3177wp0 abstractC3177wp0F = this.a;
        if (abstractC3177wp0F == null) {
            abstractC3177wp0F = this.d.f(this.f, this.e);
            this.a = abstractC3177wp0F;
        }
        return abstractC3177wp0F.a(wh);
    }

    @Override // o.AbstractC3177wp0
    public final void b(C1183cI c1183cI, Object obj) throws IOException {
        if (this.c) {
            c1183cI.Q();
            return;
        }
        AbstractC3177wp0 abstractC3177wp0F = this.a;
        if (abstractC3177wp0F == null) {
            abstractC3177wp0F = this.d.f(this.f, this.e);
            this.a = abstractC3177wp0F;
        }
        abstractC3177wp0F.b(c1183cI, obj);
    }
}
