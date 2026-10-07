package o;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class A80 extends J implements RandomAccess {
    public final Object[] m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f166o;
    public int p;

    public A80(int i, Object[] objArr) {
        this.m = objArr;
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC1674hK.n(i, "ring buffer filled size should not be negative but it is ").toString());
        }
        if (i <= objArr.length) {
            this.n = objArr.length;
            this.p = i;
        } else {
            StringBuilder sbR = AbstractC1674hK.r("ring buffer filled size: ", i, " cannot be larger than the buffer size: ");
            sbR.append(objArr.length);
            throw new IllegalArgumentException(sbR.toString().toString());
        }
    }

    @Override // o.Vp0
    public final int a() {
        return this.p;
    }

    public final void d(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC1674hK.n(i, "n shouldn't be negative but it is ").toString());
        }
        if (i > this.p) {
            StringBuilder sbR = AbstractC1674hK.r("n shouldn't be greater than the buffer size: n = ", i, ", size = ");
            sbR.append(this.p);
            throw new IllegalArgumentException(sbR.toString().toString());
        }
        if (i > 0) {
            int i2 = this.f166o;
            int i3 = this.n;
            int i4 = (i2 + i) % i3;
            Object[] objArr = this.m;
            if (i2 > i4) {
                X5.N(objArr, null, i2, i3);
                Arrays.fill(objArr, 0, i4, (Object) null);
            } else {
                X5.N(objArr, null, i2, i4);
            }
            this.f166o = i4;
            this.p -= i;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int iA = a();
        if (i < 0 || i >= iA) {
            throw new IndexOutOfBoundsException(AbstractC1674hK.m(i, iA, "index: ", ", size: "));
        }
        return this.m[(this.f166o + i) % this.n];
    }

    @Override // o.J, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C3408z80(this);
    }

    @Override // o.Vp0, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    @Override // o.Vp0, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        AbstractC1474fG.j(objArr, "array");
        int length = objArr.length;
        int i = this.p;
        if (length < i) {
            objArr = Arrays.copyOf(objArr, i);
            AbstractC1474fG.i(objArr, "copyOf(...)");
        }
        int i2 = this.p;
        int i3 = this.f166o;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            objArr2 = this.m;
            if (i5 >= i2 || i3 >= this.n) {
                break;
            }
            objArr[i5] = objArr2[i3];
            i5++;
            i3++;
        }
        while (i5 < i2) {
            objArr[i5] = objArr2[i4];
            i5++;
            i4++;
        }
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }
}
