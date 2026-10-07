package o;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* JADX INFO: renamed from: o.b2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1062b2 {
    public static final int a = 1;
    public static final int b = 2;

    private C1062b2() {
    }

    private static InetAddress a(String str, H50 h50) {
        return InetAddress.getByAddress(str, (h50 instanceof C1837j ? ((C1837j) h50).V() : ((C1545g) h50).U()).getAddress());
    }

    public static int b(int i) {
        if (i == 1) {
            return 4;
        }
        if (i == 2) {
            return 16;
        }
        throw new IllegalArgumentException("unknown address family");
    }

    public static int c(InetAddress inetAddress) {
        if (inetAddress instanceof Inet4Address) {
            return 1;
        }
        if (inetAddress instanceof Inet6Address) {
            return 2;
        }
        throw new IllegalArgumentException("unknown address family");
    }

    public static InetAddress[] d(String str) throws UnknownHostException {
        try {
            return new InetAddress[]{e(str)};
        } catch (UnknownHostException unused) {
            H50[] h50ArrJ = j(str, true);
            InetAddress[] inetAddressArr = new InetAddress[h50ArrJ.length];
            for (int i = 0; i < h50ArrJ.length; i++) {
                inetAddressArr[i] = a(str, h50ArrJ[i]);
            }
            return inetAddressArr;
        }
    }

    public static InetAddress e(String str) throws UnknownHostException {
        byte[] bArrO = o(str, 1);
        if (bArrO != null) {
            return InetAddress.getByAddress(str, bArrO);
        }
        byte[] bArrO2 = o(str, 2);
        if (bArrO2 != null) {
            return InetAddress.getByAddress(str, bArrO2);
        }
        throw new UnknownHostException(AbstractC1701hf0.t("Invalid address: ", str));
    }

    public static InetAddress f(String str, int i) throws UnknownHostException {
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException("unknown address family");
        }
        byte[] bArrO = o(str, i);
        if (bArrO != null) {
            return InetAddress.getByAddress(str, bArrO);
        }
        throw new UnknownHostException(AbstractC1701hf0.t("Invalid address: ", str));
    }

    public static InetAddress g(String str) {
        try {
            return e(str);
        } catch (UnknownHostException unused) {
            return a(str, j(str, false)[0]);
        }
    }

    public static String h(InetAddress inetAddress) throws UnknownHostException {
        C2848tT c2848tTC = C3020v80.c(inetAddress);
        H50[] h50ArrU = new C1578gM(c2848tTC, 12).u();
        if (h50ArrU != null) {
            return ((RW) h50ArrU[0]).V().toString();
        }
        throw new UnknownHostException("unknown address: " + c2848tTC);
    }

    public static boolean i(String str) {
        return o(str, 1) != null;
    }

    private static H50[] j(String str, boolean z) throws UnknownHostException {
        H50[] h50ArrU;
        H50[] h50ArrU2;
        try {
            C1578gM c1578gM = new C1578gM(str, 1);
            H50[] h50ArrU3 = c1578gM.u();
            if (h50ArrU3 != null) {
                if (!z || (h50ArrU = new C1578gM(str, 28).u()) == null) {
                    return h50ArrU3;
                }
                H50[] h50Arr = new H50[h50ArrU3.length + h50ArrU.length];
                System.arraycopy(h50ArrU3, 0, h50Arr, 0, h50ArrU3.length);
                System.arraycopy(h50ArrU, 0, h50Arr, h50ArrU3.length, h50ArrU.length);
                return h50Arr;
            }
            if (c1578gM.m() == 4 && (h50ArrU2 = new C1578gM(str, 28).u()) != null) {
                return h50ArrU2;
            }
            throw new UnknownHostException("<" + str + "> could not be resolved: " + c1578gM.k());
        } catch (Ri0 e) {
            StringBuilder sbL = AbstractC1701hf0.l("<", str, "> is invalid: ");
            sbL.append(e.getMessage());
            throw new UnknownHostException(sbL.toString());
        }
    }

    private static byte[] k(String str) {
        byte[] bArr = new byte[4];
        int length = str.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            char cCharAt = str.charAt(i4);
            if (cCharAt < '0' || cCharAt > '9') {
                if (cCharAt != '.' || i == 3 || i2 == 0) {
                    return null;
                }
                bArr[i] = (byte) i3;
                i++;
                i2 = 0;
                i3 = 0;
            } else {
                if (i2 == 3) {
                    return null;
                }
                if (i2 > 0 && i3 == 0) {
                    return null;
                }
                i2++;
                int i5 = (cCharAt - '0') + (i3 * 10);
                if (i5 > 255) {
                    return null;
                }
                i3 = i5;
            }
        }
        if (i != 3 || i2 == 0) {
            return null;
        }
        bArr[i] = (byte) i3;
        return bArr;
    }

    private static byte[] l(String str) {
        int i;
        byte[] bArrO;
        byte[] bArr = new byte[16];
        int i2 = -1;
        String[] strArrSplit = str.split(":", -1);
        int length = strArrSplit.length;
        int i3 = length - 1;
        if (strArrSplit[0].length() != 0) {
            i = 0;
        } else {
            if (i3 <= 0 || strArrSplit[1].length() != 0) {
                return null;
            }
            i = 1;
        }
        if (strArrSplit[i3].length() == 0) {
            if (i3 - i <= 0 || strArrSplit[length - 2].length() != 0) {
                return null;
            }
            i3 = length - 2;
        }
        if ((i3 - i) + 1 > 8) {
            return null;
        }
        int i4 = 0;
        while (i <= i3) {
            if (strArrSplit[i].length() != 0) {
                if (strArrSplit[i].indexOf(46) >= 0) {
                    if (i < i3 || i > 6 || (bArrO = o(strArrSplit[i], 1)) == null) {
                        return null;
                    }
                    int i5 = 0;
                    while (i5 < 4) {
                        bArr[i4] = bArrO[i5];
                        i5++;
                        i4++;
                    }
                    break;
                }
                for (int i6 = 0; i6 < strArrSplit[i].length(); i6++) {
                    try {
                        if (Character.digit(strArrSplit[i].charAt(i6), 16) < 0) {
                            return null;
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
                int i7 = Integer.parseInt(strArrSplit[i], 16);
                if (i7 <= 65535 && i7 >= 0) {
                    int i8 = i4 + 1;
                    bArr[i4] = (byte) (i7 >>> 8);
                    i4 += 2;
                    bArr[i8] = (byte) (i7 & 255);
                }
                return null;
            }
            if (i2 >= 0) {
                return null;
            }
            i2 = i4;
            i++;
        }
        if (i4 < 16 && i2 < 0) {
            return null;
        }
        if (i2 >= 0) {
            int i9 = (16 - i4) + i2;
            System.arraycopy(bArr, i2, bArr, i9, i4 - i2);
            while (i2 < i9) {
                bArr[i2] = 0;
                i2++;
            }
        }
        return bArr;
    }

    public static int[] m(String str) {
        return n(str, 1);
    }

    public static int[] n(String str, int i) {
        byte[] bArrO = o(str, i);
        if (bArrO == null) {
            return null;
        }
        int[] iArr = new int[bArrO.length];
        for (int i2 = 0; i2 < bArrO.length; i2++) {
            iArr[i2] = bArrO[i2] & 255;
        }
        return iArr;
    }

    public static byte[] o(String str, int i) {
        if (i == 1) {
            return k(str);
        }
        if (i == 2) {
            return l(str);
        }
        throw new IllegalArgumentException("unknown address family");
    }

    public static String p(byte[] bArr) {
        return (bArr[0] & 255) + "." + (bArr[1] & 255) + "." + (bArr[2] & 255) + "." + (bArr[3] & 255);
    }

    public static String q(int[] iArr) {
        return iArr[0] + "." + iArr[1] + "." + iArr[2] + "." + iArr[3];
    }

    public static InetAddress r(InetAddress inetAddress, int i) {
        int i2;
        int iB = b(c(inetAddress)) * 8;
        if (i < 0 || i > iB) {
            throw new IllegalArgumentException("invalid mask length");
        }
        if (i == iB) {
            return inetAddress;
        }
        byte[] address = inetAddress.getAddress();
        int i3 = i / 8;
        int i4 = i3 + 1;
        while (true) {
            if (i4 >= address.length) {
                break;
            }
            address[i4] = 0;
            i4++;
        }
        int i5 = 0;
        for (i2 = 0; i2 < i % 8; i2++) {
            i5 |= 1 << (7 - i2);
        }
        address[i3] = (byte) (address[i3] & i5);
        try {
            return InetAddress.getByAddress(address);
        } catch (UnknownHostException unused) {
            throw new IllegalArgumentException("invalid address");
        }
    }
}
