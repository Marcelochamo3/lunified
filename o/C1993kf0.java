package o;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: renamed from: o.kf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1993kf0 implements X6 {
    public int b;
    public float c;
    public float d;
    public V6 e;
    public V6 f;
    public V6 g;
    public V6 h;
    public boolean i;
    public C1895jf0 j;
    public ByteBuffer k;
    public ShortBuffer l;
    public ByteBuffer m;
    public long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f869o;
    public boolean p;

    @Override // o.X6
    public final boolean a() {
        return this.f.a != -1 && (Math.abs(this.c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f.a != this.e.a);
    }

    @Override // o.X6
    public final ByteBuffer b() {
        C1895jf0 c1895jf0 = this.j;
        if (c1895jf0 != null) {
            int i = c1895jf0.m;
            int i2 = c1895jf0.b;
            int i3 = i * i2 * 2;
            if (i3 > 0) {
                if (this.k.capacity() < i3) {
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i3).order(ByteOrder.nativeOrder());
                    this.k = byteBufferOrder;
                    this.l = byteBufferOrder.asShortBuffer();
                } else {
                    this.k.clear();
                    this.l.clear();
                }
                ShortBuffer shortBuffer = this.l;
                int iMin = Math.min(shortBuffer.remaining() / i2, c1895jf0.m);
                int i4 = iMin * i2;
                shortBuffer.put(c1895jf0.l, 0, i4);
                int i5 = c1895jf0.m - iMin;
                c1895jf0.m = i5;
                short[] sArr = c1895jf0.l;
                System.arraycopy(sArr, i4, sArr, 0, i5 * i2);
                this.f869o += (long) i3;
                this.k.limit(i3);
                this.m = this.k;
            }
        }
        ByteBuffer byteBuffer = this.m;
        this.m = X6.a;
        return byteBuffer;
    }

    @Override // o.X6
    public final void c() {
        C1895jf0 c1895jf0 = this.j;
        if (c1895jf0 != null) {
            int i = c1895jf0.k;
            float f = c1895jf0.c;
            float f2 = c1895jf0.d;
            int i2 = c1895jf0.m + ((int) ((((i / (f / f2)) + c1895jf0.f848o) / (c1895jf0.e * f2)) + 0.5f));
            short[] sArr = c1895jf0.j;
            int i3 = c1895jf0.h * 2;
            c1895jf0.j = c1895jf0.c(sArr, i, i3 + i);
            int i4 = 0;
            while (true) {
                int i5 = c1895jf0.b;
                if (i4 >= i3 * i5) {
                    break;
                }
                c1895jf0.j[(i5 * i) + i4] = 0;
                i4++;
            }
            c1895jf0.k = i3 + c1895jf0.k;
            c1895jf0.f();
            if (c1895jf0.m > i2) {
                c1895jf0.m = i2;
            }
            c1895jf0.k = 0;
            c1895jf0.r = 0;
            c1895jf0.f848o = 0;
        }
        this.p = true;
    }

    @Override // o.X6
    public final boolean d() {
        C1895jf0 c1895jf0;
        return this.p && ((c1895jf0 = this.j) == null || (c1895jf0.m * c1895jf0.b) * 2 == 0);
    }

    @Override // o.X6
    public final V6 e(V6 v6) throws W6 {
        if (v6.c != 2) {
            throw new W6(v6);
        }
        int i = this.b;
        if (i == -1) {
            i = v6.a;
        }
        this.e = v6;
        V6 v7 = new V6(i, v6.b, 2);
        this.f = v7;
        this.i = true;
        return v7;
    }

    @Override // o.X6
    public final void f(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            C1895jf0 c1895jf0 = this.j;
            c1895jf0.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.n += (long) iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i = c1895jf0.b;
            int i2 = iRemaining2 / i;
            short[] sArrC = c1895jf0.c(c1895jf0.j, c1895jf0.k, i2);
            c1895jf0.j = sArrC;
            shortBufferAsShortBuffer.get(sArrC, c1895jf0.k * i, ((i2 * i) * 2) / 2);
            c1895jf0.k += i2;
            c1895jf0.f();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // o.X6
    public final void flush() {
        if (a()) {
            V6 v6 = this.e;
            this.g = v6;
            V6 v7 = this.f;
            this.h = v7;
            if (this.i) {
                this.j = new C1895jf0(v6.a, v6.b, this.c, this.d, v7.a);
            } else {
                C1895jf0 c1895jf0 = this.j;
                if (c1895jf0 != null) {
                    c1895jf0.k = 0;
                    c1895jf0.m = 0;
                    c1895jf0.f848o = 0;
                    c1895jf0.p = 0;
                    c1895jf0.q = 0;
                    c1895jf0.r = 0;
                    c1895jf0.s = 0;
                    c1895jf0.t = 0;
                    c1895jf0.u = 0;
                    c1895jf0.v = 0;
                }
            }
        }
        this.m = X6.a;
        this.n = 0L;
        this.f869o = 0L;
        this.p = false;
    }

    @Override // o.X6
    public final void g() {
        this.c = 1.0f;
        this.d = 1.0f;
        V6 v6 = V6.e;
        this.e = v6;
        this.f = v6;
        this.g = v6;
        this.h = v6;
        ByteBuffer byteBuffer = X6.a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.b = -1;
        this.i = false;
        this.j = null;
        this.n = 0L;
        this.f869o = 0L;
        this.p = false;
    }
}
