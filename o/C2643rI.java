package o;

import lombok.Generated;

/* JADX INFO: renamed from: o.rI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C2643rI extends C1761i90 {

    @Generated
    private static final CL u = DL.d(C2643rI.class);
    private int r;
    private String s;
    private boolean t;

    private C2643rI(C1761i90 c1761i90) {
        super(c1761i90);
        this.r = -1;
    }

    public static C2643rI B(C2848tT c2848tT, int i, long j) {
        return new C2643rI(c2848tT, i, j, true);
    }

    public static C2643rI C(C1761i90 c1761i90) {
        return new C2643rI(c1761i90);
    }

    public static C2643rI D(C2848tT c2848tT, int i, long j) {
        return new C2643rI(c2848tT, i, j, false);
    }

    public boolean A() {
        return this.t && u() == EnumC1887jb0.UNCHECKED;
    }

    public void E(int i, String str) {
        this.r = i;
        this.s = str;
        u.M(str);
    }

    public C1281dI F(C2848tT c2848tT) {
        if (c2848tT == null) {
            u.M("No signerName");
            if (!A()) {
                return z() ? new C1281dI(EnumC1887jb0.BOGUS, 10, U40.a("validate.bogus.missingsig", new Object[0])) : new C1281dI(EnumC1887jb0.BOGUS, this.r, U40.a("validate.bogus", this.s));
            }
            String strA = this.s;
            if (strA == null) {
                strA = U40.a("validate.insecure_unsigned", new Object[0]);
            }
            return new C1281dI(EnumC1887jb0.INSECURE, this.r, strA);
        }
        if (y()) {
            return new C1281dI(EnumC1887jb0.BOGUS, this.r, U40.a("validate.bogus.badkey", o(), this.s));
        }
        if (!A()) {
            return null;
        }
        String strA2 = this.s;
        if (strA2 == null) {
            strA2 = U40.a("validate.insecure", new Object[0]);
        }
        return new C1281dI(EnumC1887jb0.INSECURE, this.r, strA2);
    }

    @Override // o.C1761i90, o.X40
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2643rI)) {
            return false;
        }
        C2643rI c2643rI = (C2643rI) obj;
        if (!c2643rI.h(this) || !super.equals(obj) || this.r != c2643rI.r || this.t != c2643rI.t) {
            return false;
        }
        String str = this.s;
        String str2 = c2643rI.s;
        return str != null ? str.equals(str2) : str2 == null;
    }

    @Override // o.C1761i90, o.X40
    @Generated
    public boolean h(Object obj) {
        return obj instanceof C2643rI;
    }

    @Override // o.C1761i90, o.X40
    @Generated
    public int hashCode() {
        int iHashCode = (((super.hashCode() * 59) + this.r) * 59) + (this.t ? 79 : 97);
        String str = this.s;
        return (iHashCode * 59) + (str == null ? 43 : str.hashCode());
    }

    public boolean y() {
        return this.t && u() == EnumC1887jb0.BOGUS;
    }

    public boolean z() {
        return !this.t && u() == EnumC1887jb0.SECURE;
    }

    private C2643rI(C2848tT c2848tT, int i, long j, boolean z) {
        super(new C1761i90(H50.A(c2848tT, 48, i, j)));
        this.r = -1;
        this.t = true;
        if (z) {
            x(EnumC1887jb0.BOGUS);
        }
    }
}
