package io.sentry;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: io.sentry.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0044g implements Iterator {
    public int l;
    public int m = -1;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0047h f112o;

    public C0044g(C0047h c0047h) {
        this.f112o = c0047h;
        this.l = c0047h.m;
        this.n = c0047h.f113o;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.n || this.l != this.f112o.n;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.n = false;
        int i = this.l;
        this.m = i;
        int i2 = i + 1;
        C0047h c0047h = this.f112o;
        this.l = i2 < c0047h.p ? i2 : 0;
        return c0047h.l[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        int i2 = this.m;
        if (i2 == -1) {
            throw new IllegalStateException();
        }
        C0047h c0047h = this.f112o;
        int i3 = c0047h.m;
        if (i2 == i3) {
            c0047h.remove();
            this.m = -1;
            return;
        }
        int i4 = i2 + 1;
        int i5 = c0047h.p;
        if (i3 >= i2 || i4 >= (i = c0047h.n)) {
            while (i4 != c0047h.n) {
                if (i4 >= i5) {
                    Object[] objArr = c0047h.l;
                    objArr[i4 - 1] = objArr[0];
                } else {
                    Object[] objArr2 = c0047h.l;
                    int i6 = i4 - 1;
                    if (i6 < 0) {
                        i6 = i5 - 1;
                    }
                    objArr2[i6] = objArr2[i4];
                    i4++;
                    if (i4 >= i5) {
                    }
                }
                i4 = 0;
            }
        } else {
            Object[] objArr3 = c0047h.l;
            System.arraycopy(objArr3, i4, objArr3, i2, i - i4);
        }
        this.m = -1;
        int i7 = c0047h.n - 1;
        if (i7 < 0) {
            i7 = i5 - 1;
        }
        c0047h.n = i7;
        c0047h.l[i7] = null;
        c0047h.f113o = false;
        int i8 = this.l - 1;
        if (i8 < 0) {
            i8 = i5 - 1;
        }
        this.l = i8;
    }
}
