package o;

/* JADX INFO: loaded from: classes.dex */
public class Yw0 extends H50 {
    private byte[] r;

    public Yw0() {
    }

    private static byte[] U(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (!Character.isDigit(cCharAt)) {
                return null;
            }
            bArr[i] = (byte) cCharAt;
        }
        return bArr;
    }

    @Override // o.H50
    public void E(Fl0 fl0, C2848tT c2848tT) throws Ri0 {
        String strE0 = fl0.e0();
        byte[] bArrU = U(strE0);
        this.r = bArrU;
        if (bArrU != null) {
            return;
        }
        throw fl0.f("invalid PSDN address " + strE0);
    }

    @Override // o.H50
    public void H(C0474Hi c0474Hi) {
        this.r = c0474Hi.g();
    }

    @Override // o.H50
    public String I() {
        return H50.c(this.r, true);
    }

    @Override // o.H50
    public void J(C0578Li c0578Li, C1799ig c1799ig, boolean z) {
        c0578Li.k(this.r);
    }

    public String V() {
        return H50.c(this.r, false);
    }

    public Yw0(C2848tT c2848tT, int i, long j, String str) {
        super(c2848tT, 19, i, j);
        byte[] bArrU = U(str);
        this.r = bArrU;
        if (bArrU == null) {
            throw new IllegalArgumentException(AbstractC1701hf0.t("invalid PSDN address ", str));
        }
    }
}
