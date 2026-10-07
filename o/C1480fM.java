package o;

import java.util.Arrays;

/* JADX INFO: renamed from: o.fM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1480fM implements Cloneable {
    public /* synthetic */ boolean l;
    public /* synthetic */ long[] m;
    public /* synthetic */ Object[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ int f772o;

    public C1480fM() {
        int i;
        int i2 = 4;
        while (true) {
            i = 80;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (80 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 8;
        this.m = new long[i4];
        this.n = new Object[i4];
    }

    public final void b(long j, Long l) {
        int i = this.f772o;
        if (i != 0 && j <= this.m[i - 1]) {
            j(j, l);
            return;
        }
        if (this.l) {
            long[] jArr = this.m;
            if (i >= jArr.length) {
                Object[] objArr = this.n;
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    Object obj = objArr[i3];
                    if (obj != AbstractC3045vW.c) {
                        if (i3 != i2) {
                            jArr[i2] = jArr[i3];
                            objArr[i2] = obj;
                            objArr[i3] = null;
                        }
                        i2++;
                    }
                }
                this.l = false;
                this.f772o = i2;
            }
        }
        int i4 = this.f772o;
        if (i4 >= this.m.length) {
            int i5 = (i4 + 1) * 8;
            for (int i6 = 4; i6 < 32; i6++) {
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
            }
            int i8 = i5 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.m, i8);
            AbstractC1474fG.i(jArrCopyOf, "copyOf(this, newSize)");
            this.m = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.n, i8);
            AbstractC1474fG.i(objArrCopyOf, "copyOf(this, newSize)");
            this.n = objArrCopyOf;
        }
        this.m[i4] = j;
        this.n[i4] = l;
        this.f772o = i4 + 1;
    }

    public final void c() {
        int i = this.f772o;
        Object[] objArr = this.n;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f772o = 0;
        this.l = false;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final C1480fM clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        AbstractC1474fG.h(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        C1480fM c1480fM = (C1480fM) objClone;
        c1480fM.m = (long[]) this.m.clone();
        c1480fM.n = (Object[]) this.n.clone();
        return c1480fM;
    }

    public final Object e(long j) {
        Object obj;
        int iE = Nr0.e(this.m, this.f772o, j);
        if (iE < 0 || (obj = this.n[iE]) == AbstractC3045vW.c) {
            return null;
        }
        return obj;
    }

    public final Object g(long j) {
        Object obj;
        int iE = Nr0.e(this.m, this.f772o, j);
        if (iE < 0 || (obj = this.n[iE]) == AbstractC3045vW.c) {
            return -1L;
        }
        return obj;
    }

    public final long h(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f772o)) {
            throw new IllegalArgumentException(AbstractC1674hK.n(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        if (this.l) {
            long[] jArr = this.m;
            Object[] objArr = this.n;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != AbstractC3045vW.c) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.l = false;
            this.f772o = i3;
        }
        return this.m[i];
    }

    public final void j(long j, Object obj) {
        int iE = Nr0.e(this.m, this.f772o, j);
        if (iE >= 0) {
            this.n[iE] = obj;
            return;
        }
        int i = ~iE;
        int i2 = this.f772o;
        Object obj2 = AbstractC3045vW.c;
        if (i < i2) {
            Object[] objArr = this.n;
            if (objArr[i] == obj2) {
                this.m[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.l) {
            long[] jArr = this.m;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.n;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj3 = objArr2[i4];
                    if (obj3 != obj2) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj3;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.l = false;
                this.f772o = i3;
                i = ~Nr0.e(this.m, i3, j);
            }
        }
        int i5 = this.f772o;
        if (i5 >= this.m.length) {
            int i6 = (i5 + 1) * 8;
            for (int i7 = 4; i7 < 32; i7++) {
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
            }
            int i9 = i6 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.m, i9);
            AbstractC1474fG.i(jArrCopyOf, "copyOf(this, newSize)");
            this.m = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.n, i9);
            AbstractC1474fG.i(objArrCopyOf, "copyOf(this, newSize)");
            this.n = objArrCopyOf;
        }
        int i10 = this.f772o - i;
        if (i10 != 0) {
            long[] jArr2 = this.m;
            int i11 = i + 1;
            AbstractC1474fG.j(jArr2, "<this>");
            System.arraycopy(jArr2, i, jArr2, i11, i10);
            Object[] objArr3 = this.n;
            X5.K(i11, i, this.f772o, objArr3, objArr3);
        }
        this.m[i] = j;
        this.n[i] = obj;
        this.f772o++;
    }

    public final int k() {
        if (this.l) {
            int i = this.f772o;
            long[] jArr = this.m;
            Object[] objArr = this.n;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != AbstractC3045vW.c) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.l = false;
            this.f772o = i2;
        }
        return this.f772o;
    }

    public final Object m(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f772o)) {
            throw new IllegalArgumentException(AbstractC1674hK.n(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        if (this.l) {
            long[] jArr = this.m;
            Object[] objArr = this.n;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != AbstractC3045vW.c) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.l = false;
            this.f772o = i3;
        }
        return this.n[i];
    }

    public final String toString() {
        if (k() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f772o * 28);
        sb.append('{');
        int i = this.f772o;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(h(i2));
            sb.append('=');
            Object objM = m(i2);
            if (objM != sb) {
                sb.append(objM);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        AbstractC1474fG.i(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }
}
