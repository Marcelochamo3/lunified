package o;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: o.Pz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0698Pz implements M70, FF {
    public final Drawable l;
    public final /* synthetic */ int m;

    public C0698Pz(Drawable drawable, int i) {
        this.m = i;
        AbstractC3045vW.k(drawable, "Argument must not be null");
        this.l = drawable;
    }

    @Override // o.FF
    public void a() {
        switch (this.m) {
            case 0:
                ((C0854Vz) ((C0672Oz) this.l).l.b).l.prepareToDraw();
                break;
            default:
                c();
                break;
        }
    }

    @Override // o.M70
    public final int b() {
        switch (this.m) {
            case 0:
                C0854Vz c0854Vz = (C0854Vz) ((C0672Oz) this.l).l.b;
                C1897jg0 c1897jg0 = c0854Vz.a;
                return (c1897jg0.j.length * 4) + c1897jg0.d.limit() + c1897jg0.i.length + c0854Vz.n;
            default:
                Drawable drawable = this.l;
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
        }
    }

    public final void c() {
        Drawable drawable = this.l;
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (drawable instanceof C0672Oz) {
            ((C0854Vz) ((C0672Oz) drawable).l.b).l.prepareToDraw();
        }
    }

    @Override // o.M70
    public final Class d() {
        switch (this.m) {
            case 0:
                return C0672Oz.class;
            default:
                return this.l.getClass();
        }
    }

    @Override // o.M70
    public final void e() {
        C1813in c1813in;
        C1813in c1813in2;
        C1813in c1813in3;
        switch (this.m) {
            case 0:
                C0672Oz c0672Oz = (C0672Oz) this.l;
                c0672Oz.stop();
                c0672Oz.f445o = true;
                C0854Vz c0854Vz = (C0854Vz) c0672Oz.l.b;
                c0854Vz.c.clear();
                Bitmap bitmap = c0854Vz.l;
                if (bitmap != null) {
                    c0854Vz.e.d(bitmap);
                    c0854Vz.l = null;
                }
                c0854Vz.f = false;
                C0776Sz c0776Sz = c0854Vz.i;
                ComponentCallbacks2C3406z70 componentCallbacks2C3406z70 = c0854Vz.d;
                if (c0776Sz != null) {
                    componentCallbacks2C3406z70.l(c0776Sz);
                    c0854Vz.i = null;
                }
                C0776Sz c0776Sz2 = c0854Vz.k;
                if (c0776Sz2 != null) {
                    componentCallbacks2C3406z70.l(c0776Sz2);
                    c0854Vz.k = null;
                }
                C0776Sz c0776Sz3 = c0854Vz.m;
                if (c0776Sz3 != null) {
                    componentCallbacks2C3406z70.l(c0776Sz3);
                    c0854Vz.m = null;
                }
                C1897jg0 c1897jg0 = c0854Vz.a;
                c1897jg0.l = null;
                byte[] bArr = c1897jg0.i;
                C2994uv c2994uv = c1897jg0.c;
                if (bArr != null && (c1813in3 = (C1813in) c2994uv.n) != null) {
                    c1813in3.l(bArr);
                }
                int[] iArr = c1897jg0.j;
                if (iArr != null && (c1813in2 = (C1813in) c2994uv.n) != null) {
                    c1813in2.l(iArr);
                }
                Bitmap bitmap2 = c1897jg0.m;
                if (bitmap2 != null) {
                    ((Q8) c2994uv.m).d(bitmap2);
                }
                c1897jg0.m = null;
                c1897jg0.d = null;
                c1897jg0.s = null;
                byte[] bArr2 = c1897jg0.e;
                if (bArr2 != null && (c1813in = (C1813in) c2994uv.n) != null) {
                    c1813in.l(bArr2);
                }
                c0854Vz.j = true;
                break;
        }
    }

    @Override // o.M70
    public final Object get() {
        Drawable drawable = this.l;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }

    private final void f() {
    }
}
