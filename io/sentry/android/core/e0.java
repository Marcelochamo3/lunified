package io.sentry.android.core;

/* JADX INFO: loaded from: classes.dex */
public final class e0 implements Comparable {
    public final long l;
    public final long m;
    public final long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f74o;
    public final boolean p;
    public final boolean q;
    public final long r;

    public e0(long j) {
        this(j, j, 0L, 0L, false, false, 0L);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.m, ((e0) obj).m);
    }

    public e0(long j, long j2, long j3, long j4, boolean z, boolean z2, long j5) {
        this.l = j;
        this.m = j2;
        this.n = j3;
        this.f74o = j4;
        this.p = z;
        this.q = z2;
        this.r = j5;
    }
}
