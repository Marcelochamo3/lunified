package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: o.cM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1187cM implements Iterator, InterfaceC1770iI {
    public final long l;
    public final long m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f713o;

    public C1187cM(long j, long j2, long j3) {
        this.l = j3;
        this.m = j2;
        boolean z = false;
        if (j3 <= 0 ? j >= j2 : j <= j2) {
            z = true;
        }
        this.n = z;
        this.f713o = z ? j : j2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.n;
    }

    @Override // java.util.Iterator
    public final Object next() {
        long j = this.f713o;
        if (j != this.m) {
            this.f713o = this.l + j;
        } else {
            if (!this.n) {
                throw new NoSuchElementException();
            }
            this.n = false;
        }
        return Long.valueOf(j);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
