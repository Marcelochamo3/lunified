package o;

import android.os.Build;
import android.view.View;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class Hw0 {
    public static final Kw0 b;
    public final Kw0 a;

    static {
        Aw0 c3385yw0;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            c3385yw0 = new C3482zw0();
        } else {
            c3385yw0 = i >= 29 ? new C3385yw0() : new C3288xw0();
        }
        b = c3385yw0.b().a.a().a.b().a.c();
    }

    public Hw0(Kw0 kw0) {
        this.a = kw0;
    }

    public Kw0 a() {
        return this.a;
    }

    public Kw0 b() {
        return this.a;
    }

    public Kw0 c() {
        return this.a;
    }

    public C2106ln e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Hw0)) {
            return false;
        }
        Hw0 hw0 = (Hw0) obj;
        return n() == hw0.n() && m() == hw0.m() && Objects.equals(j(), hw0.j()) && Objects.equals(h(), hw0.h()) && Objects.equals(e(), hw0.e());
    }

    public TF f(int i) {
        return TF.e;
    }

    public TF g() {
        return j();
    }

    public TF h() {
        return TF.e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
    }

    public TF i() {
        return j();
    }

    public TF j() {
        return TF.e;
    }

    public TF k() {
        return j();
    }

    public Kw0 l(int i, int i2, int i3, int i4) {
        return b;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public void d(View view) {
    }

    public void o(TF[] tfArr) {
    }

    public void p(Kw0 kw0) {
    }

    public void q(TF tf) {
    }
}
