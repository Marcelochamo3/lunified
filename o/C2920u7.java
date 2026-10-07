package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: o.u7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2920u7 {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final float h;
    public final String i;

    public C2920u7(ArrayList arrayList, int i, int i2, int i3, int i4, int i5, int i6, float f, String str) {
        this.a = arrayList;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = f;
        this.i = str;
    }

    public static C2920u7 a(C2562qX c2562qX) throws C2949uX {
        byte[] bArr;
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        try {
            c2562qX.G(4);
            int iU = (c2562qX.u() & 3) + 1;
            if (iU == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iU2 = c2562qX.u() & 31;
            int i6 = 0;
            while (true) {
                bArr = AbstractC3045vW.a;
                if (i6 >= iU2) {
                    break;
                }
                int iZ = c2562qX.z();
                int i7 = c2562qX.b;
                c2562qX.G(iZ);
                byte[] bArr2 = c2562qX.a;
                byte[] bArr3 = new byte[iZ + 4];
                System.arraycopy(bArr, 0, bArr3, 0, 4);
                System.arraycopy(bArr2, i7, bArr3, 4, iZ);
                arrayList.add(bArr3);
                i6++;
            }
            int iU3 = c2562qX.u();
            for (int i8 = 0; i8 < iU3; i8++) {
                int iZ2 = c2562qX.z();
                int i9 = c2562qX.b;
                c2562qX.G(iZ2);
                byte[] bArr4 = c2562qX.a;
                byte[] bArr5 = new byte[iZ2 + 4];
                System.arraycopy(bArr, 0, bArr5, 0, 4);
                System.arraycopy(bArr4, i9, bArr5, 4, iZ2);
                arrayList.add(bArr5);
            }
            if (iU2 > 0) {
                C2751sT c2751sTV = Ou0.v((byte[]) arrayList.get(0), iU, ((byte[]) arrayList.get(0)).length);
                int i10 = c2751sTV.e;
                int i11 = c2751sTV.f;
                int i12 = c2751sTV.n;
                int i13 = c2751sTV.f1026o;
                int i14 = c2751sTV.p;
                float f2 = c2751sTV.g;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(c2751sTV.a), Integer.valueOf(c2751sTV.b), Integer.valueOf(c2751sTV.c));
                i4 = i13;
                i5 = i14;
                f = f2;
                i = i10;
                i2 = i11;
                i3 = i12;
            } else {
                str = null;
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                f = 1.0f;
            }
            return new C2920u7(arrayList, iU, i, i2, i3, i4, i5, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw C2949uX.a("Error parsing AVC config", e);
        }
    }
}
