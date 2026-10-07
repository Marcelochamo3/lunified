package o;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Cf0 extends AP {
    public final C2562qX d = new C2562qX();
    public final C2084lc e = new C2084lc();
    public Oj0 f;

    @Override // o.AP
    public final CQ e(DQ dq, ByteBuffer byteBuffer) {
        BQ ff0;
        int i;
        long j;
        ArrayList arrayList;
        long j2;
        long j3;
        boolean z;
        boolean z2;
        boolean z3;
        int iZ;
        int iU;
        int iU2;
        long jV;
        boolean z4;
        List list;
        long j4;
        long j5;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        int i2;
        int i3;
        int iU3;
        boolean z9;
        int i4 = 32;
        Oj0 oj0 = this.f;
        if (oj0 == null || dq.u != oj0.d()) {
            Oj0 oj1 = new Oj0(dq.q);
            this.f = oj1;
            oj1.a(dq.q - dq.u);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        C2562qX c2562qX = this.d;
        c2562qX.D(iLimit, bArrArray);
        C2084lc c2084lc = this.e;
        c2084lc.n(iLimit, bArrArray);
        c2084lc.s(39);
        long jI = (((long) c2084lc.i(1)) << 32) | ((long) c2084lc.i(32));
        c2084lc.s(20);
        int i5 = c2084lc.i(12);
        int i6 = c2084lc.i(8);
        c2562qX.G(14);
        if (i6 == 0) {
            ff0 = new Ff0();
        } else if (i6 != 255) {
            long j6 = 1;
            long jV2 = -9223372036854775807L;
            if (i6 == 4) {
                int iU4 = c2562qX.u();
                ArrayList arrayList2 = new ArrayList(iU4);
                int i7 = 0;
                while (i7 < iU4) {
                    long jV3 = c2562qX.v();
                    boolean z10 = (c2562qX.u() & 128) != 0;
                    ArrayList arrayList3 = new ArrayList();
                    if (z10) {
                        i = i7;
                        j = j6;
                        arrayList = arrayList3;
                        j2 = -9223372036854775807L;
                        j3 = -9223372036854775807L;
                        z = false;
                        z2 = false;
                        z3 = false;
                        iZ = 0;
                        iU = 0;
                        iU2 = 0;
                    } else {
                        int iU5 = c2562qX.u();
                        boolean z11 = (iU5 & 128) != 0;
                        boolean z12 = (iU5 & 64) != 0;
                        boolean z13 = (iU5 & i4) != 0;
                        long jV4 = z12 ? c2562qX.v() : -9223372036854775807L;
                        if (z12) {
                            i = i7;
                        } else {
                            int iU6 = c2562qX.u();
                            ArrayList arrayList4 = new ArrayList(iU6);
                            int i8 = 0;
                            while (i8 < iU6) {
                                arrayList4.add(new Gf0(c2562qX.u(), c2562qX.v()));
                                i8++;
                                i7 = i7;
                            }
                            i = i7;
                            arrayList3 = arrayList4;
                        }
                        if (z13) {
                            long jU = c2562qX.u();
                            z4 = (jU & 128) != 0;
                            j = 1;
                            jV = ((((jU & 1) << 32) | c2562qX.v()) * 1000) / 90;
                        } else {
                            j = 1;
                            jV = -9223372036854775807L;
                            z4 = false;
                        }
                        j3 = jV;
                        z3 = z4;
                        arrayList = arrayList3;
                        z = z11;
                        z2 = z12;
                        j2 = jV4;
                        iZ = c2562qX.z();
                        iU = c2562qX.u();
                        iU2 = c2562qX.u();
                    }
                    arrayList2.add(new Hf0(jV3, z10, z, z2, arrayList, j2, z3, j3, iZ, iU, iU2));
                    i7 = i + 1;
                    j6 = j;
                    i4 = 32;
                }
                ff0 = new If0(arrayList2);
            } else if (i6 == 5) {
                Oj0 oj2 = this.f;
                long jV5 = c2562qX.v();
                boolean z14 = (c2562qX.u() & 128) != 0;
                List listEmptyList = Collections.emptyList();
                if (z14) {
                    list = listEmptyList;
                    j4 = -9223372036854775807L;
                    j5 = -9223372036854775807L;
                    z5 = false;
                    z6 = false;
                    z7 = false;
                    z8 = false;
                    i2 = 0;
                    i3 = 0;
                    iU3 = 0;
                } else {
                    int iU7 = c2562qX.u();
                    boolean z15 = (iU7 & 128) != 0;
                    boolean z16 = (iU7 & 64) != 0;
                    boolean z17 = (iU7 & 32) != 0;
                    boolean z18 = (iU7 & 16) != 0;
                    long jA = (!z16 || z18) ? -9223372036854775807L : Aj0.a(jI, c2562qX);
                    if (!z16) {
                        int iU8 = c2562qX.u();
                        ArrayList arrayList5 = new ArrayList(iU8);
                        for (int i9 = 0; i9 < iU8; i9++) {
                            int iU9 = c2562qX.u();
                            long jA2 = !z18 ? Aj0.a(jI, c2562qX) : -9223372036854775807L;
                            arrayList5.add(new Df0(iU9, jA2, oj2.b(jA2)));
                        }
                        listEmptyList = arrayList5;
                    }
                    if (z17) {
                        long jU2 = c2562qX.u();
                        z9 = (jU2 & 128) != 0;
                        jV2 = ((((jU2 & 1) << 32) | c2562qX.v()) * 1000) / 90;
                    } else {
                        z9 = false;
                    }
                    int iZ2 = c2562qX.z();
                    int iU10 = c2562qX.u();
                    z8 = z9;
                    i2 = iZ2;
                    list = listEmptyList;
                    iU3 = c2562qX.u();
                    i3 = iU10;
                    z5 = z15;
                    j5 = jV2;
                    j4 = jA;
                    z7 = z18;
                    z6 = z16;
                }
                ff0 = new Ef0(jV5, z14, z5, z6, z7, j4, oj2.b(j4), list, z8, j5, i2, i3, iU3);
            } else if (i6 != 6) {
                ff0 = null;
            } else {
                Oj0 oj3 = this.f;
                long jA3 = Aj0.a(jI, c2562qX);
                ff0 = new Aj0(jA3, oj3.b(jA3));
            }
        } else {
            long jV6 = c2562qX.v();
            int i10 = i5 - 4;
            byte[] bArr = new byte[i10];
            c2562qX.e(bArr, 0, i10);
            ff0 = new C2041l30(jV6, bArr, jI);
        }
        return ff0 == null ? new CQ(new BQ[0]) : new CQ(ff0);
    }
}
