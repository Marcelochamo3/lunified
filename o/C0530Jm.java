package o;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: o.Jm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0530Jm {
    public final List a;
    public final int[] b;
    public final int[] c;
    public final C2720s4 d;
    public final int e;
    public final int f;
    public final boolean g;

    public C0530Jm(C2720s4 c2720s4, ArrayList arrayList, int[] iArr, int[] iArr2) {
        int[] iArr3;
        int[] iArr4;
        C2720s4 c2720s5;
        int i;
        int i2;
        this.a = arrayList;
        this.b = iArr;
        this.c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.d = c2720s4;
        int iA0 = c2720s4.a0();
        this.e = iA0;
        int size = ((List) c2720s4.n).size();
        this.f = size;
        this.g = true;
        C0504Im c0504Im = arrayList.isEmpty() ? null : (C0504Im) arrayList.get(0);
        if (c0504Im == null || c0504Im.a != 0 || c0504Im.b != 0) {
            arrayList.add(0, new C0504Im(0, 0, 0));
        }
        arrayList.add(new C0504Im(iA0, size, 0));
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            iArr3 = this.c;
            iArr4 = this.b;
            c2720s5 = this.d;
            if (!zHasNext) {
                break;
            }
            C0504Im c0504Im2 = (C0504Im) it.next();
            for (int i3 = 0; i3 < c0504Im2.c; i3++) {
                int i4 = c0504Im2.a + i3;
                int i5 = c0504Im2.b + i3;
                int i6 = c2720s5.T(i4, i5) ? 1 : 2;
                iArr4[i4] = (i5 << 4) | i6;
                iArr3[i5] = (i4 << 4) | i6;
            }
        }
        if (this.g) {
            Iterator it2 = arrayList.iterator();
            int i7 = 0;
            while (it2.hasNext()) {
                C0504Im c0504Im3 = (C0504Im) it2.next();
                while (true) {
                    i = c0504Im3.a;
                    if (i7 < i) {
                        if (iArr4[i7] == 0) {
                            int size2 = arrayList.size();
                            int i8 = 0;
                            for (int i9 = 0; i9 < size2; i9++) {
                                C0504Im c0504Im4 = (C0504Im) arrayList.get(i9);
                                while (true) {
                                    i2 = c0504Im4.b;
                                    if (i8 < i2) {
                                        if (iArr3[i8] == 0 && c2720s5.U(i7, i8)) {
                                            int i10 = c2720s5.T(i7, i8) ? 8 : 4;
                                            iArr4[i7] = (i8 << 4) | i10;
                                            iArr3[i8] = i10 | (i7 << 4);
                                            break;
                                        }
                                        i8++;
                                    }
                                }
                                i8 = c0504Im4.c + i2;
                            }
                        }
                        i7++;
                    }
                }
                i7 = c0504Im3.c + i;
            }
        }
    }

    public static C0556Km a(ArrayDeque arrayDeque, int i, boolean z) {
        C0556Km c0556Km;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                c0556Km = null;
                break;
            }
            c0556Km = (C0556Km) it.next();
            if (c0556Km.a == i && c0556Km.c == z) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            C0556Km c0556Km2 = (C0556Km) it.next();
            if (z) {
                c0556Km2.b--;
            } else {
                c0556Km2.b++;
            }
        }
        return c0556Km;
    }
}
