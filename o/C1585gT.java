package o;

import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: o.gT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1585gT extends H50 {
    private byte[] r;

    public C1585gT() {
    }

    private static byte[] U(String str) {
        if (!str.substring(0, 2).equalsIgnoreCase("0x")) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        boolean z = false;
        int i = 0;
        for (int i2 = 2; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt != '.') {
                int iDigit = Character.digit(cCharAt, 16);
                if (iDigit == -1) {
                    return null;
                }
                if (z) {
                    i += iDigit;
                    byteArrayOutputStream.write(i);
                    z = false;
                } else {
                    i = iDigit << 4;
                    z = true;
                }
            }
        }
        if (z) {
            return null;
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // o.H50
    public void E(Fl0 fl0, C2848tT c2848tT) throws Ri0 {
        String strE0 = fl0.e0();
        byte[] bArrU = U(strE0);
        this.r = bArrU;
        if (bArrU != null) {
            return;
        }
        throw fl0.f("invalid NSAP address " + strE0);
    }

    @Override // o.H50
    public void H(C0474Hi c0474Hi) {
        this.r = c0474Hi.e();
    }

    @Override // o.H50
    public String I() {
        return "0x" + Ay0.b(this.r);
    }

    @Override // o.H50
    public void J(C0578Li c0578Li, C1799ig c1799ig, boolean z) {
        c0578Li.i(this.r);
    }

    public String V() {
        return H50.c(this.r, false);
    }

    public C1585gT(C2848tT c2848tT, int i, long j, String str) {
        super(c2848tT, 22, i, j);
        byte[] bArrU = U(str);
        this.r = bArrU;
        if (bArrU == null) {
            throw new IllegalArgumentException(AbstractC1701hf0.t("invalid NSAP address ", str));
        }
    }
}
