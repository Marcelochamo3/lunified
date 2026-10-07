package o;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class Rp0 {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final C1583gR b;
    public volatile int c = 0;

    public Rp0(C1583gR c1583gR, int i) {
        this.b = c1583gR;
        this.a = i;
    }

    public final int a(int i) {
        EQ eqC = c();
        int iA = eqC.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) eqC.f969o;
        int i2 = iA + eqC.l;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final int b() {
        EQ eqC = c();
        int iA = eqC.a(16);
        if (iA == 0) {
            return 0;
        }
        int i = iA + eqC.l;
        return ((ByteBuffer) eqC.f969o).getInt(((ByteBuffer) eqC.f969o).getInt(i) + i);
    }

    public final EQ c() {
        ThreadLocal threadLocal = d;
        EQ eq = (EQ) threadLocal.get();
        if (eq == null) {
            eq = new EQ();
            threadLocal.set(eq);
        }
        FQ fq = (FQ) this.b.m;
        int iA = fq.a(6);
        if (iA != 0) {
            int i = iA + fq.l;
            int i2 = (this.a * 4) + ((ByteBuffer) fq.f969o).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) fq.f969o).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) fq.f969o;
            eq.f969o = byteBuffer;
            if (byteBuffer != null) {
                eq.l = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                eq.m = i4;
                eq.n = ((ByteBuffer) eq.f969o).getShort(i4);
            } else {
                eq.l = 0;
                eq.m = 0;
                eq.n = 0;
            }
        }
        return eq;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        EQ eqC = c();
        int iA = eqC.a(4);
        sb.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) eqC.f969o).getInt(iA + eqC.l) : 0));
        sb.append(", codepoints:");
        int iB = b();
        for (int i = 0; i < iB; i++) {
            sb.append(Integer.toHexString(a(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
