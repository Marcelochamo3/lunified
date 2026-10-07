package o;

/* JADX INFO: renamed from: o.z8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3407z8 extends C0656Oj {
    public long u;
    public int v;
    public int w;

    @Override // o.C0656Oj
    public final void E() {
        super.E();
        this.v = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        if ((r0.remaining() + r3.position()) > 3072000) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean J(o.C0656Oj r6) {
        /*
            r5 = this;
            r0 = 1073741824(0x40000000, float:2.0)
            boolean r0 = r6.j(r0)
            r1 = 1
            r0 = r0 ^ r1
            o.AbstractC0397Ej.c(r0)
            r0 = 268435456(0x10000000, float:2.524355E-29)
            boolean r0 = r6.j(r0)
            r0 = r0 ^ r1
            o.AbstractC0397Ej.c(r0)
            r0 = 4
            boolean r0 = r6.j(r0)
            r0 = r0 ^ r1
            o.AbstractC0397Ej.c(r0)
            int r0 = r5.v
            r2 = 0
            if (r0 <= 0) goto L25
            r3 = 1
            goto L26
        L25:
            r3 = 0
        L26:
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != 0) goto L2b
            goto L52
        L2b:
            int r3 = r5.w
            if (r0 < r3) goto L30
            goto L51
        L30:
            boolean r0 = r6.j(r4)
            boolean r3 = r5.j(r4)
            if (r0 == r3) goto L3b
            goto L51
        L3b:
            java.nio.ByteBuffer r0 = r6.f439o
            if (r0 == 0) goto L52
            java.nio.ByteBuffer r3 = r5.f439o
            if (r3 == 0) goto L52
            int r3 = r3.position()
            int r0 = r0.remaining()
            int r0 = r0 + r3
            r3 = 3072000(0x2ee000, float:4.304789E-39)
            if (r0 <= r3) goto L52
        L51:
            return r2
        L52:
            int r0 = r5.v
            int r2 = r0 + 1
            r5.v = r2
            if (r0 != 0) goto L66
            long r2 = r6.q
            r5.q = r2
            boolean r0 = r6.j(r1)
            if (r0 == 0) goto L66
            r5.m = r1
        L66:
            boolean r0 = r6.j(r4)
            if (r0 == 0) goto L6e
            r5.m = r4
        L6e:
            java.nio.ByteBuffer r0 = r6.f439o
            if (r0 == 0) goto L7e
            int r2 = r0.remaining()
            r5.H(r2)
            java.nio.ByteBuffer r2 = r5.f439o
            r2.put(r0)
        L7e:
            long r2 = r6.q
            r5.u = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3407z8.J(o.Oj):boolean");
    }
}
