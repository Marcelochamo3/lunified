package o;

/* JADX INFO: loaded from: classes.dex */
public final class DX implements InterfaceC2091lf0 {
    public final N9 l;
    public final E9 m;
    public C3343yb0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f215o;
    public boolean p;
    public long q;

    public DX(N9 n9) {
        AbstractC1474fG.j(n9, "upstream");
        this.l = n9;
        E9 e9B = n9.b();
        this.m = e9B;
        C3343yb0 c3343yb0 = e9B.l;
        this.n = c3343yb0;
        this.f215o = c3343yb0 != null ? c3343yb0.b : -1;
    }

    @Override // o.InterfaceC2091lf0
    public final Hj0 c() {
        return this.l.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.p = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (r3 == r5.b) goto L15;
     */
    @Override // o.InterfaceC2091lf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long y(o.E9 r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            o.AbstractC1474fG.j(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L76
            boolean r3 = r8.p
            r3 = r3 ^ 1
            if (r3 == 0) goto L6a
            o.yb0 r3 = r8.n
            o.E9 r4 = r8.m
            if (r3 == 0) goto L31
            o.yb0 r5 = r4.l
            if (r3 != r5) goto L25
            int r3 = r8.f215o
            o.AbstractC1474fG.g(r5)
            int r5 = r5.b
            if (r3 != r5) goto L25
            goto L31
        L25:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L31:
            if (r2 != 0) goto L34
            return r0
        L34:
            long r0 = r8.q
            r2 = 1
            long r0 = r0 + r2
            o.N9 r2 = r8.l
            boolean r0 = r2.s(r0)
            if (r0 != 0) goto L44
            r9 = -1
            return r9
        L44:
            o.yb0 r0 = r8.n
            if (r0 != 0) goto L52
            o.yb0 r0 = r4.l
            if (r0 == 0) goto L52
            r8.n = r0
            int r0 = r0.b
            r8.f215o = r0
        L52:
            long r0 = r4.m
            long r2 = r8.q
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            o.E9 r2 = r8.m
            long r4 = r8.q
            r3 = r9
            r6 = r10
            r2.t(r3, r4, r6)
            long r0 = r8.q
            long r0 = r0 + r10
            r8.q = r0
            return r10
        L6a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L76:
            java.lang.String r9 = "byteCount < 0: "
            java.lang.String r9 = o.AbstractC1674hK.o(r10, r9)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DX.y(o.E9, long):long");
    }
}
