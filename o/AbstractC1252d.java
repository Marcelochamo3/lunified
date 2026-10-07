package o;

/* JADX INFO: renamed from: o.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1252d {
    public static final byte[] a;
    public static final byte[] b;

    static {
        C2468pa c2468pa = C2468pa.f972o;
        a = C2691rp.t("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").l;
        b = C2691rp.t("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").l;
    }

    public static final String a(byte[] bArr, byte[] bArr2) {
        AbstractC1474fG.j(bArr, "<this>");
        AbstractC1474fG.j(bArr2, "map");
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b2 = bArr[i];
            int i3 = i + 2;
            byte b3 = bArr[i + 1];
            i += 3;
            byte b4 = bArr[i3];
            bArr3[i2] = bArr2[(b2 & 255) >> 2];
            bArr3[i2 + 1] = bArr2[((b2 & 3) << 4) | ((b3 & 255) >> 4)];
            int i4 = i2 + 3;
            bArr3[i2 + 2] = bArr2[((b3 & 15) << 2) | ((b4 & 255) >> 6)];
            i2 += 4;
            bArr3[i4] = bArr2[b4 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b5 = bArr[i];
            bArr3[i2] = bArr2[(b5 & 255) >> 2];
            bArr3[i2 + 1] = bArr2[(b5 & 3) << 4];
            bArr3[i2 + 2] = 61;
            bArr3[i2 + 3] = 61;
        } else if (length2 == 2) {
            int i5 = i + 1;
            byte b6 = bArr[i];
            byte b7 = bArr[i5];
            bArr3[i2] = bArr2[(b6 & 255) >> 2];
            bArr3[i2 + 1] = bArr2[((b6 & 3) << 4) | ((b7 & 255) >> 4)];
            bArr3[i2 + 2] = bArr2[(b7 & 15) << 2];
            bArr3[i2 + 3] = 61;
        }
        return new String(bArr3, AbstractC1305dd.a);
    }
}
