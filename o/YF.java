package o;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class YF extends VF {
    public final int l;
    public final int m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f634o;

    public YF(int i, int i2, int i3) {
        this.l = i3;
        this.m = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.n = z;
        this.f634o = z ? i : i2;
    }

    @Override // o.VF
    public final int a() {
        int i = this.f634o;
        if (i != this.m) {
            this.f634o = this.l + i;
        } else {
            if (!this.n) {
                throw new NoSuchElementException();
            }
            this.n = false;
        }
        return i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.n;
    }
}
