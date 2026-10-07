package o;

import java.util.ArrayList;
import java.util.UUID;

/* JADX INFO: renamed from: o.qu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2605qu implements VO {
    public final byte[] a;

    public C2605qu(int i, byte[] bArr) {
        switch (i) {
            case 1:
                bArr.getClass();
                this.a = bArr;
                break;
            default:
                this.a = bArr;
                break;
        }
    }

    public ArrayList a() {
        byte[] bArr = this.a;
        ArrayList arrayList = new ArrayList();
        int iIntValue = 0;
        while (iIntValue < bArr.length) {
            try {
                C1101bX c1101bXD = d(iIntValue);
                long jLongValue = ((Number) c1101bXD.l).longValue();
                int iIntValue2 = ((Number) c1101bXD.m).intValue();
                int i = (int) (jLongValue >>> 3);
                int i2 = (int) (jLongValue & 7);
                if (i2 == 0) {
                    C1101bX c1101bXD2 = d(iIntValue2);
                    long jLongValue2 = ((Number) c1101bXD2.l).longValue();
                    iIntValue = ((Number) c1101bXD2.m).intValue();
                    arrayList.add(new C2411ou(jLongValue2, null, i, 0));
                } else if (i2 == 1) {
                    iIntValue = iIntValue2 + 8;
                    arrayList.add(new C2411ou(0L, null, i, 1));
                } else if (i2 == 2) {
                    C1101bX c1101bXD3 = d(iIntValue2);
                    long jLongValue3 = ((Number) c1101bXD3.l).longValue();
                    int iIntValue3 = ((Number) c1101bXD3.m).intValue();
                    int i3 = iIntValue3 + ((int) jLongValue3);
                    if (i3 > bArr.length || i3 < iIntValue3) {
                        break;
                        break;
                    }
                    arrayList.add(new C2411ou(0L, X5.M(bArr, iIntValue3, i3), i, 2));
                    iIntValue = i3;
                } else {
                    if (i2 != 5) {
                        break;
                    }
                    iIntValue = iIntValue2 + 4;
                    arrayList.add(new C2411ou(0L, null, i, 5));
                }
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    @Override // o.VO
    public byte[] b(UUID uuid, C0509Ir c0509Ir) {
        return this.a;
    }

    @Override // o.VO
    public byte[] c(UUID uuid, C0535Jr c0535Jr) {
        throw new UnsupportedOperationException();
    }

    public C1101bX d(int i) {
        int i2 = 0;
        long j = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i >= bArr.length) {
                break;
            }
            byte b = bArr[i];
            i++;
            j |= ((long) (b & 127)) << i2;
            if ((b & 128) == 0) {
                break;
            }
            i2 += 7;
        }
        return new C1101bX(Long.valueOf(j), Integer.valueOf(i));
    }
}
