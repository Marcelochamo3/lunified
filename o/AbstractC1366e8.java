package o;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: o.e8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1366e8 implements InterfaceC2940uO {
    public final long l;
    public final long m;
    public long n;

    public AbstractC1366e8(long j, long j2) {
        this.l = j;
        this.m = j2;
        this.n = j - 1;
    }

    public final void b() {
        long j = this.n;
        if (j < this.l || j > this.m) {
            throw new NoSuchElementException();
        }
    }

    @Override // o.InterfaceC2940uO
    public final boolean next() {
        long j = this.n + 1;
        this.n = j;
        return !(j > this.m);
    }
}
