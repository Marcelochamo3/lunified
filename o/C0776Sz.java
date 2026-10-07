package o;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;

/* JADX INFO: renamed from: o.Sz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0776Sz implements InterfaceC2872ti0 {
    public final int l;
    public final int m;
    public InterfaceC2049l70 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Handler f523o;
    public final int p;
    public final long q;
    public Bitmap r;

    public C0776Sz(Handler handler, int i, long j) {
        if (!Kr0.i(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        }
        this.l = Integer.MIN_VALUE;
        this.m = Integer.MIN_VALUE;
        this.f523o = handler;
        this.p = i;
        this.q = j;
    }

    @Override // o.InterfaceC2872ti0
    public final void c(InterfaceC2049l70 interfaceC2049l70) {
        this.n = interfaceC2049l70;
    }

    @Override // o.InterfaceC2872ti0
    public final void d(InterfaceC2574qe0 interfaceC2574qe0) {
        ((Wd0) interfaceC2574qe0).l(this.l, this.m);
    }

    @Override // o.InterfaceC2872ti0
    public final InterfaceC2049l70 e() {
        return this.n;
    }

    @Override // o.InterfaceC2872ti0
    public final void h(Drawable drawable) {
        this.r = null;
    }

    @Override // o.InterfaceC2872ti0
    public final void i(Object obj) {
        this.r = (Bitmap) obj;
        Handler handler = this.f523o;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.q);
    }

    @Override // o.InterfaceC1088bK
    public final void b() {
    }

    @Override // o.InterfaceC1088bK
    public final void j() {
    }

    @Override // o.InterfaceC1088bK
    public final void k() {
    }

    @Override // o.InterfaceC2872ti0
    public final void a(Drawable drawable) {
    }

    @Override // o.InterfaceC2872ti0
    public final void f(InterfaceC2574qe0 interfaceC2574qe0) {
    }

    @Override // o.InterfaceC2872ti0
    public final void g(Drawable drawable) {
    }
}
