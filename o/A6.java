package o;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class A6 implements InterfaceC3403z6 {
    public int l = 0;
    public int m = -1;
    public int n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f163o;
    public Object p;

    public A6() {
        int[] iArr = new int[16];
        this.p = iArr;
        this.f163o = iArr.length - 1;
    }

    @Override // o.InterfaceC3403z6
    public int a() {
        return -1;
    }

    @Override // o.InterfaceC3403z6
    public int b() {
        return this.l;
    }

    @Override // o.InterfaceC3403z6
    public int c() {
        C2562qX c2562qX = (C2562qX) this.p;
        int i = this.m;
        if (i == 8) {
            return c2562qX.u();
        }
        if (i == 16) {
            return c2562qX.z();
        }
        int i2 = this.n;
        this.n = i2 + 1;
        if (i2 % 2 != 0) {
            return this.f163o & 15;
        }
        int iU = c2562qX.u();
        this.f163o = iU;
        return (iU & 240) >> 4;
    }

    public void d(int i) {
        int i2 = this.n;
        int[] iArr = (int[]) this.p;
        if (i2 == iArr.length) {
            int length = iArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i3 = this.l;
            int i4 = length2 - i3;
            System.arraycopy(iArr, i3, iArr2, 0, i4);
            System.arraycopy((int[]) this.p, 0, iArr2, i4, i3);
            this.l = 0;
            this.m = this.n - 1;
            this.p = iArr2;
            this.f163o = length - 1;
        }
        int i5 = (this.m + 1) & this.f163o;
        this.m = i5;
        ((int[]) this.p)[i5] = i;
        this.n++;
    }

    public int e() {
        int i = this.n;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = (int[]) this.p;
        int i2 = this.l;
        int i3 = iArr[i2];
        this.l = (i2 + 1) & this.f163o;
        this.n = i - 1;
        return i3;
    }
}
