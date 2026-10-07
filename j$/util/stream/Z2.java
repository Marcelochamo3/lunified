package j$.util.stream;

import j$.util.Spliterator;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
abstract class Z2 extends AbstractC0168d implements Iterable, j$.lang.a {
    Object e;
    Object[] f;

    Z2() {
        this.e = c(16);
    }

    Z2(int i) {
        super(i);
        this.e = c(1 << this.a);
    }

    public abstract Object c(int i);

    @Override // j$.util.stream.AbstractC0168d
    public final void clear() {
        Object[] objArr = this.f;
        if (objArr != null) {
            this.e = objArr[0];
            this.f = null;
            this.d = null;
        }
        this.b = 0;
        this.c = 0;
    }

    public void d(Object obj, int i) {
        long j = i;
        long jCount = count() + j;
        if (jCount > s(obj) || jCount < j) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.c == 0) {
            System.arraycopy(this.e, 0, obj, i, this.b);
            return;
        }
        for (int i2 = 0; i2 < this.c; i2++) {
            Object obj2 = this.f[i2];
            System.arraycopy(obj2, 0, obj, i, s(obj2));
            i += s(this.f[i2]);
        }
        int i3 = this.b;
        if (i3 > 0) {
            System.arraycopy(this.e, 0, obj, i, i3);
        }
    }

    public Object e() {
        long jCount = count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object objC = c((int) jCount);
        d(objC, 0);
        return objC;
    }

    public void f(Object obj) {
        for (int i = 0; i < this.c; i++) {
            Object obj2 = this.f[i];
            r(obj2, 0, s(obj2), obj);
        }
        r(this.e, 0, this.b, obj);
    }

    protected abstract void r(Object obj, int i, int i2, Object obj2);

    protected abstract int s(Object obj);

    public abstract Spliterator spliterator();

    @Override // java.lang.Iterable
    public final /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    protected final int t(long j) {
        if (this.c == 0) {
            if (j < this.b) {
                return 0;
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        if (j >= count()) {
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        for (int i = 0; i <= this.c; i++) {
            if (j < this.d[i] + ((long) s(this.f[i]))) {
                return i;
            }
        }
        throw new IndexOutOfBoundsException(Long.toString(j));
    }

    protected final void u(long j) {
        long jS;
        int i = this.c;
        if (i == 0) {
            jS = s(this.e);
        } else {
            jS = ((long) s(this.f[i])) + this.d[i];
        }
        if (j > jS) {
            if (this.f == null) {
                Object[] objArrV = v();
                this.f = objArrV;
                this.d = new long[8];
                objArrV[0] = this.e;
            }
            int i2 = this.c + 1;
            while (j > jS) {
                Object[] objArr = this.f;
                if (i2 >= objArr.length) {
                    int length = objArr.length * 2;
                    this.f = Arrays.copyOf(objArr, length);
                    this.d = Arrays.copyOf(this.d, length);
                }
                int iMin = this.a;
                if (i2 != 0 && i2 != 1) {
                    iMin = Math.min((iMin + i2) - 1, 30);
                }
                int i3 = 1 << iMin;
                this.f[i2] = c(i3);
                long[] jArr = this.d;
                int i4 = i2 - 1;
                jArr[i2] = jArr[i4] + ((long) s(this.f[i4]));
                jS += (long) i3;
                i2++;
            }
        }
    }

    protected abstract Object[] v();

    protected final void w() {
        long jS;
        if (this.b == s(this.e)) {
            if (this.f == null) {
                Object[] objArrV = v();
                this.f = objArrV;
                this.d = new long[8];
                objArrV[0] = this.e;
            }
            int i = this.c;
            int i2 = i + 1;
            Object[] objArr = this.f;
            if (i2 >= objArr.length || objArr[i2] == null) {
                if (i == 0) {
                    jS = s(this.e);
                } else {
                    jS = ((long) s(objArr[i])) + this.d[i];
                }
                u(jS + 1);
            }
            this.b = 0;
            int i3 = this.c + 1;
            this.c = i3;
            this.e = this.f[i3];
        }
    }
}
