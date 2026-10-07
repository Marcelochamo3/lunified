package o;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public abstract class Q7 implements X6 {
    public V6 b;
    public V6 c;
    public V6 d;
    public V6 e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public Q7() {
        ByteBuffer byteBuffer = X6.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        V6 v6 = V6.e;
        this.d = v6;
        this.e = v6;
        this.b = v6;
        this.c = v6;
    }

    @Override // o.X6
    public boolean a() {
        return this.e != V6.e;
    }

    @Override // o.X6
    public ByteBuffer b() {
        ByteBuffer byteBuffer = this.g;
        this.g = X6.a;
        return byteBuffer;
    }

    @Override // o.X6
    public final void c() {
        this.h = true;
        j();
    }

    @Override // o.X6
    public boolean d() {
        return this.h && this.g == X6.a;
    }

    @Override // o.X6
    public final V6 e(V6 v6) {
        this.d = v6;
        this.e = h(v6);
        return a() ? this.e : V6.e;
    }

    @Override // o.X6
    public final void flush() {
        this.g = X6.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        i();
    }

    @Override // o.X6
    public final void g() {
        flush();
        this.f = X6.a;
        V6 v6 = V6.e;
        this.d = v6;
        this.e = v6;
        this.b = v6;
        this.c = v6;
        k();
    }

    public abstract V6 h(V6 v6);

    public final ByteBuffer l(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    public void i() {
    }

    public void j() {
    }

    public void k() {
    }
}
