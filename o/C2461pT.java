package o;

import java.util.BitSet;

/* JADX INFO: renamed from: o.pT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2461pT extends H50 {
    private C2848tT r;
    private BitSet s;

    public C2461pT() {
    }

    @Override // o.H50
    public void E(Fl0 fl0, C2848tT c2848tT) throws Ri0 {
        this.r = fl0.d0(c2848tT);
        this.s = new BitSet();
        while (true) {
            Fl0.b bVarI = fl0.i();
            if (!bVarI.b()) {
                fl0.n0();
                return;
            }
            int iG = C3080vp0.g(bVarI.d(), true);
            if (iG <= 0 || iG > 128) {
                throw fl0.f("Invalid type: " + bVarI.d());
            }
            this.s.set(iG);
        }
    }

    @Override // o.H50
    public void H(C0474Hi c0474Hi) throws Rw0 {
        this.r = new C2848tT(c0474Hi);
        this.s = new BitSet();
        int iK = c0474Hi.k();
        for (int i = 0; i < iK; i++) {
            int iJ = c0474Hi.j();
            for (int i2 = 0; i2 < 8; i2++) {
                if (((1 << (7 - i2)) & iJ) != 0) {
                    this.s.set((i * 8) + i2);
                }
            }
        }
    }

    @Override // o.H50
    public String I() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.r);
        int length = this.s.length();
        for (short s = 0; s < length; s = (short) (s + 1)) {
            if (this.s.get(s)) {
                sb.append(" ");
                sb.append(C3080vp0.e(s));
            }
        }
        return sb.toString();
    }

    @Override // o.H50
    public void J(C0578Li c0578Li, C1799ig c1799ig, boolean z) {
        this.r.B(c0578Li, null, z);
        int length = this.s.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            i |= this.s.get(i2) ? 1 << (7 - (i2 % 8)) : 0;
            if (i2 % 8 == 7 || i2 == length - 1) {
                c0578Li.o(i);
                i = 0;
            }
        }
    }

    public BitSet U() {
        return this.s;
    }

    public C2848tT V() {
        return this.r;
    }

    public C2461pT(C2848tT c2848tT, int i, long j, C2848tT c2848tT2, BitSet bitSet) {
        super(c2848tT, 30, i, j);
        this.r = H50.e("next", c2848tT2);
        this.s = bitSet;
    }
}
