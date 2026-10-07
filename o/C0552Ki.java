package o;

import java.security.PublicKey;

/* JADX INFO: renamed from: o.Ki, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0552Ki extends AbstractC1574gI {

    /* JADX INFO: renamed from: o.Ki$a */
    public static class a {
        public static final int a = 256;
        public static final int b = 1;
        public static final int c = 128;

        private a() {
        }
    }

    /* JADX INFO: renamed from: o.Ki$b */
    public static class b {
        public static final int a = 3;

        private b() {
        }
    }

    public C0552Ki() {
    }

    @Override // o.H50
    public void E(Fl0 fl0, C2848tT c2848tT) throws Ri0 {
        this.r = fl0.h0();
        this.s = fl0.j0();
        String strE0 = fl0.e0();
        int iB = C0629Ni.a.b(strE0);
        this.t = iB;
        if (iB >= 0) {
            this.u = fl0.K();
        } else {
            throw fl0.f("Invalid algorithm: " + strE0);
        }
    }

    @Override // o.AbstractC1574gI
    public /* bridge */ /* synthetic */ int U() {
        return super.U();
    }

    @Override // o.AbstractC1574gI
    public /* bridge */ /* synthetic */ int V() {
        return super.V();
    }

    @Override // o.AbstractC1574gI
    public /* bridge */ /* synthetic */ int W() {
        return super.W();
    }

    @Override // o.AbstractC1574gI
    public /* bridge */ /* synthetic */ byte[] X() {
        return super.X();
    }

    @Override // o.AbstractC1574gI
    public /* bridge */ /* synthetic */ int Y() {
        return super.Y();
    }

    @Override // o.AbstractC1574gI
    public /* bridge */ /* synthetic */ PublicKey Z() {
        return super.Z();
    }

    public C0552Ki(C2848tT c2848tT, int i, int i2, long j, int i3, int i4, int i5, byte[] bArr) {
        super(c2848tT, i, i2, j, i3, i4, i5, bArr);
    }

    public C0552Ki(C2848tT c2848tT, int i, long j, int i2, int i3, int i4, byte[] bArr) {
        this(c2848tT, 48, i, j, i2, i3, i4, bArr);
    }

    public C0552Ki(C2848tT c2848tT, int i, long j, int i2, int i3, int i4, PublicKey publicKey) {
        super(c2848tT, 48, i, j, i2, i3, i4, C0629Ni.o(publicKey, i4));
        this.w = publicKey;
    }
}
