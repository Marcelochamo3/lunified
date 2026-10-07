package o;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: o.oe0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2380oe0 implements InterfaceC1747i20 {
    public final C2551qM a;
    public int b;
    public Bitmap.Config c;

    public C2380oe0(C2551qM c2551qM) {
        this.a = c2551qM;
    }

    @Override // o.InterfaceC1747i20
    public final void a() {
        this.a.h(this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2380oe0)) {
            return false;
        }
        C2380oe0 c2380oe0 = (C2380oe0) obj;
        return this.b == c2380oe0.b && Kr0.b(this.c, c2380oe0.c);
    }

    public final int hashCode() {
        int i = this.b * 31;
        Bitmap.Config config = this.c;
        return i + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return C2477pe0.c(this.b, this.c);
    }
}
