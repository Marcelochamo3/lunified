package o;

import java.io.IOException;

/* JADX INFO: renamed from: o.qV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2560qV extends AbstractC3177wp0 {
    public static final InterfaceC3274xp0 b = c(EnumC1417ek0.m);
    public final EnumC1417ek0 a;

    public C2560qV(C1125bk0 c1125bk0) {
        this.a = c1125bk0;
    }

    public static InterfaceC3274xp0 c(C1125bk0 c1125bk0) {
        return new C2463pV(new C2560qV(c1125bk0));
    }

    @Override // o.AbstractC3177wp0
    public final Object a(WH wh) throws IOException {
        int iJ0 = wh.j0();
        int iW = AbstractC1701hf0.w(iJ0);
        if (iW == 5 || iW == 6) {
            return this.a.a(wh);
        }
        if (iW == 8) {
            wh.f0();
            return null;
        }
        throw new XH("Expecting number, got: " + AbstractC1701hf0.E(iJ0) + "; at path " + wh.K());
    }

    @Override // o.AbstractC3177wp0
    public final void b(C1183cI c1183cI, Object obj) throws IOException {
        c1183cI.a0((Number) obj);
    }
}
