package o;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: o.j5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1848j5 extends AP {
    public final /* synthetic */ int d;

    public /* synthetic */ C1848j5(int i) {
        this.d = i;
    }

    public static C2016kr B(C2562qX c2562qX) {
        String strP = c2562qX.p();
        strP.getClass();
        String strP2 = c2562qX.p();
        strP2.getClass();
        return new C2016kr(c2562qX.o(), strP, strP2, Arrays.copyOfRange(c2562qX.a, c2562qX.b, c2562qX.c), c2562qX.o());
    }

    @Override // o.AP
    public final CQ e(DQ dq, ByteBuffer byteBuffer) {
        switch (this.d) {
            case 0:
                if (byteBuffer.get() == 116) {
                    C2084lc c2084lc = new C2084lc(byteBuffer.limit(), byteBuffer.array());
                    int i = 12;
                    c2084lc.s(12);
                    int iF = (c2084lc.f() + c2084lc.i(12)) - 4;
                    c2084lc.s(44);
                    c2084lc.t(c2084lc.i(12));
                    c2084lc.s(16);
                    ArrayList arrayList = new ArrayList();
                    while (c2084lc.f() < iF) {
                        c2084lc.s(48);
                        int i2 = c2084lc.i(8);
                        c2084lc.s(4);
                        int iF2 = c2084lc.f() + c2084lc.i(i);
                        String str = null;
                        String str2 = null;
                        while (c2084lc.f() < iF2) {
                            int i3 = c2084lc.i(8);
                            int i4 = c2084lc.i(8);
                            int iF3 = c2084lc.f() + i4;
                            if (i3 == 2) {
                                int i5 = c2084lc.i(16);
                                c2084lc.s(8);
                                if (i5 == 3) {
                                    while (c2084lc.f() < iF3) {
                                        int i6 = c2084lc.i(8);
                                        Charset charset = AbstractC1402ed.a;
                                        byte[] bArr = new byte[i6];
                                        c2084lc.k(i6, bArr);
                                        String str3 = new String(bArr, charset);
                                        int i7 = c2084lc.i(8);
                                        for (int i8 = 0; i8 < i7; i8++) {
                                            c2084lc.t(c2084lc.i(8));
                                        }
                                        str = str3;
                                    }
                                }
                            } else if (i3 == 21) {
                                Charset charset2 = AbstractC1402ed.a;
                                byte[] bArr2 = new byte[i4];
                                c2084lc.k(i4, bArr2);
                                str2 = new String(bArr2, charset2);
                            }
                            c2084lc.p(iF3 * 8);
                        }
                        c2084lc.p(iF2 * 8);
                        if (str != null && str2 != null) {
                            arrayList.add(new C1752i5(i2, str.concat(str2)));
                        }
                        i = 12;
                    }
                    if (!arrayList.isEmpty()) {
                        return new CQ(arrayList);
                    }
                }
                return null;
            default:
                return new CQ(B(new C2562qX(byteBuffer.limit(), byteBuffer.array())));
        }
    }
}
