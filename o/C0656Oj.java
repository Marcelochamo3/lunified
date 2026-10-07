package o;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: o.Oj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0656Oj extends AbstractC3015v6 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ByteBuffer f439o;
    public boolean p;
    public long q;
    public ByteBuffer r;
    public final int s;
    public final C2968ui n = new C2968ui();
    public final int t = 0;

    static {
        AbstractC1726hs.a("goog.exo.decoder");
    }

    public C0656Oj(int i) {
        this.s = i;
    }

    public void E() {
        this.m = 0;
        ByteBuffer byteBuffer = this.f439o;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.r;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.p = false;
    }

    public final ByteBuffer F(int i) {
        int i2 = this.s;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f439o;
        throw new C0630Nj("Buffer too small (" + (byteBuffer == null ? 0 : byteBuffer.capacity()) + " < " + i + ")");
    }

    public final void H(int i) {
        int i2 = i + this.t;
        ByteBuffer byteBuffer = this.f439o;
        if (byteBuffer == null) {
            this.f439o = F(i2);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i3 = i2 + iPosition;
        if (iCapacity >= i3) {
            this.f439o = byteBuffer;
            return;
        }
        ByteBuffer byteBufferF = F(i3);
        byteBufferF.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferF.put(byteBuffer);
        }
        this.f439o = byteBufferF;
    }

    public final void I() {
        ByteBuffer byteBuffer = this.f439o;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.r;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
