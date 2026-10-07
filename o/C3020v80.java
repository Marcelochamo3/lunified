package o;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* JADX INFO: renamed from: o.v80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3020v80 {
    private static final C2848tT a = C2848tT.k("in-addr.arpa.");
    private static final C2848tT b = C2848tT.k("ip6.arpa.");

    private C3020v80() {
    }

    public static C2848tT a(String str) throws UnknownHostException {
        byte[] bArrO = C1062b2.o(str, 1);
        if (bArrO == null) {
            bArrO = C1062b2.o(str, 2);
        }
        if (bArrO != null) {
            return d(bArrO);
        }
        throw new UnknownHostException(AbstractC1701hf0.t("Invalid IP address: ", str));
    }

    public static C2848tT b(String str, int i) throws UnknownHostException {
        byte[] bArrO = C1062b2.o(str, i);
        if (bArrO != null) {
            return d(bArrO);
        }
        throw new UnknownHostException(AbstractC1701hf0.t("Invalid IP address: ", str));
    }

    public static C2848tT c(InetAddress inetAddress) {
        return d(inetAddress.getAddress());
    }

    public static C2848tT d(byte[] bArr) {
        if (bArr.length != 4 && bArr.length != 16) {
            throw new IllegalArgumentException("array must contain 4 or 16 elements");
        }
        StringBuilder sb = new StringBuilder();
        if (bArr.length == 4) {
            for (int length = bArr.length - 1; length >= 0; length--) {
                sb.append(bArr[length] & 255);
                if (length > 0) {
                    sb.append(".");
                }
            }
        } else {
            for (int length2 = bArr.length - 1; length2 >= 0; length2--) {
                int i = bArr[length2];
                int[] iArr = {(i & 255) >> 4, i & 15};
                for (int i2 = 1; i2 >= 0; i2--) {
                    sb.append(Integer.toHexString(iArr[i2]));
                    if (length2 > 0 || i2 > 0) {
                        sb.append(".");
                    }
                }
            }
        }
        try {
            return bArr.length == 4 ? C2848tT.n(sb.toString(), a) : C2848tT.n(sb.toString(), b);
        } catch (Ri0 unused) {
            throw new IllegalStateException("name cannot be invalid");
        }
    }

    public static C2848tT e(int[] iArr) {
        byte[] bArr = new byte[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            if (i2 < 0 || i2 > 255) {
                throw new IllegalArgumentException("array must contain values between 0 and 255");
            }
            bArr[i] = (byte) i2;
        }
        return d(bArr);
    }

    public static InetAddress f(String str) {
        return g(C2848tT.m(str));
    }

    public static InetAddress g(C2848tT c2848tT) throws UnknownHostException {
        if (c2848tT.s() <= 3) {
            throw new UnknownHostException("Not an arpa address: " + c2848tT.toString());
        }
        C2848tT c2848tT2 = a;
        if (c2848tT.y(c2848tT2)) {
            C2848tT c2848tTW = c2848tT.w(c2848tT2);
            if (c2848tTW.s() > 4) {
                throw new UnknownHostException("Invalid IPv4 arpa address: " + c2848tT.toString());
            }
            byte[] bArr = new byte[4];
            for (int i = 0; i < c2848tTW.s(); i++) {
                try {
                    bArr[(c2848tTW.s() - i) - 1] = (byte) Integer.parseInt(c2848tTW.p(i));
                } catch (NumberFormatException unused) {
                    throw new UnknownHostException("Invalid IPv4 arpa address: " + c2848tT.toString());
                }
            }
            return InetAddress.getByAddress(bArr);
        }
        C2848tT c2848tT3 = b;
        if (!c2848tT.y(c2848tT3)) {
            throw new UnknownHostException("Not an arpa address: " + c2848tT.toString());
        }
        C2848tT c2848tTW2 = c2848tT.w(c2848tT3);
        if (c2848tTW2.s() > 32) {
            throw new UnknownHostException("Invalid IPv6 arpa address: " + c2848tT.toString());
        }
        byte[] bArr2 = new byte[16];
        for (int i2 = 0; i2 < c2848tTW2.s(); i2++) {
            try {
                int iS = ((c2848tTW2.s() - i2) - 1) / 2;
                bArr2[iS] = (byte) (bArr2[iS] | (Byte.parseByte(c2848tTW2.p(i2), 16) << ((c2848tTW2.s() - i2) % 2 == 0 ? (byte) 0 : (byte) 4)));
            } catch (NumberFormatException unused2) {
                throw new UnknownHostException("Invalid IPv6 arpa address: " + c2848tT.toString());
            }
        }
        return InetAddress.getByAddress(bArr2);
    }
}
