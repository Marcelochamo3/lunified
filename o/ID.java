package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class ID {
    public static final C2468pa a;
    public static final String[] b;
    public static final String[] c;
    public static final String[] d;

    static {
        C2468pa c2468pa = C2468pa.f972o;
        a = C2691rp.t("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        c = new String[64];
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            AbstractC1474fG.i(binaryString, "toBinaryString(it)");
            strArr[i] = AbstractC1899jh0.S(Mr0.i("%8s", binaryString), ' ', '0');
        }
        d = strArr;
        String[] strArr2 = c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i2 = iArr[0];
        strArr2[i2 | 8] = AbstractC1701hf0.h(new StringBuilder(), strArr2[i2], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr2[i3];
            int i5 = iArr[0];
            String[] strArr3 = c;
            int i6 = i5 | i4;
            strArr3[i6] = strArr3[i5] + '|' + strArr3[i4];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i5]);
            sb.append('|');
            strArr3[i6 | 8] = AbstractC1701hf0.h(sb, strArr3[i4], "|PADDED");
        }
        int length = c.length;
        for (int i7 = 0; i7 < length; i7++) {
            String[] strArr4 = c;
            if (strArr4[i7] == null) {
                strArr4[i7] = d[i7];
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0068  */
    public static String a(boolean z, int i, int i2, int i3, int i4) {
        String strR;
        String str;
        String[] strArr = b;
        String strI = i3 < strArr.length ? strArr[i3] : Mr0.i("0x%02x", Integer.valueOf(i3));
        if (i4 == 0) {
            strR = "";
        } else {
            String[] strArr2 = d;
            if (i3 == 2 || i3 == 3) {
                strR = strArr2[i4];
            } else if (i3 == 4 || i3 == 6) {
                strR = i4 == 1 ? "ACK" : strArr2[i4];
            } else if (i3 == 7 || i3 == 8) {
                strR = strArr2[i4];
            } else {
                String[] strArr3 = c;
                if (i4 < strArr3.length) {
                    str = strArr3[i4];
                    AbstractC1474fG.g(str);
                } else {
                    str = strArr2[i4];
                }
                if (i3 != 5 || (i4 & 4) == 0) {
                    strR = (i3 != 0 || (i4 & 32) == 0) ? str : AbstractC1899jh0.R(str, "PRIORITY", "COMPRESSED", false);
                } else {
                    strR = AbstractC1899jh0.R(str, "HEADERS", "PUSH_PROMISE", false);
                }
            }
        }
        return Mr0.i("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), strI, strR);
    }
}
