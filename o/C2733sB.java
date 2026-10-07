package o;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: o.sB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2733sB {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final String g;

    public C2733sB(List list, int i, int i2, int i3, int i4, float f, String str) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = f;
        this.g = str;
    }

    public static C2733sB a(C2562qX c2562qX) throws C2949uX {
        try {
            c2562qX.G(21);
            int iU = c2562qX.u() & 3;
            int iU2 = c2562qX.u();
            int i = c2562qX.b;
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < iU2; i4++) {
                c2562qX.G(1);
                int iZ = c2562qX.z();
                for (int i5 = 0; i5 < iZ; i5++) {
                    int iZ2 = c2562qX.z();
                    i3 += iZ2 + 4;
                    c2562qX.G(iZ2);
                }
            }
            c2562qX.F(i);
            byte[] bArr = new byte[i3];
            String strF = null;
            int i6 = 0;
            int i7 = 0;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            float f = 1.0f;
            while (i6 < iU2) {
                int iU3 = c2562qX.u() & 63;
                int iZ3 = c2562qX.z();
                int i11 = 0;
                while (i11 < iZ3) {
                    int iZ4 = c2562qX.z();
                    int i12 = iU2;
                    System.arraycopy(Ou0.b, i2, bArr, i7, 4);
                    int i13 = i7 + 4;
                    System.arraycopy(c2562qX.a, c2562qX.b, bArr, i13, iZ4);
                    if (iU3 == 33 && i11 == 0) {
                        C2558qT c2558qTU = Ou0.u(bArr, i13, i13 + iZ4);
                        int i14 = c2558qTU.j;
                        i9 = c2558qTU.k;
                        i10 = c2558qTU.l;
                        f = c2558qTU.i;
                        i8 = i14;
                        strF = AbstractC3045vW.f(c2558qTU.a, c2558qTU.b, c2558qTU.c, c2558qTU.d, c2558qTU.e, c2558qTU.f);
                    }
                    i7 = i13 + iZ4;
                    c2562qX.G(iZ4);
                    i11++;
                    iU2 = i12;
                    iU3 = iU3;
                    iZ3 = iZ3;
                    i2 = 0;
                }
                i6++;
                i2 = 0;
            }
            return new C2733sB(i3 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), iU + 1, i8, i9, i10, f, strF);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw C2949uX.a("Error parsing HEVC config", e);
        }
    }
}
