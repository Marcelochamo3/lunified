package o;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;

/* JADX INFO: renamed from: o.Vz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0854Vz {
    public final C1897jg0 a;
    public final Handler b;
    public final ArrayList c;
    public final ComponentCallbacks2C3406z70 d;
    public final Q8 e;
    public boolean f;
    public boolean g;
    public C2630r70 h;
    public C0776Sz i;
    public boolean j;
    public C0776Sz k;
    public Bitmap l;
    public C0776Sz m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f584o;
    public int p;

    public C0854Vz(com.bumptech.glide.a aVar, C1897jg0 c1897jg0, int i, int i2, C3373yq0 c3373yq0, Bitmap bitmap) {
        Q8 q8 = aVar.m;
        C1566gA c1566gA = aVar.f34o;
        ComponentCallbacks2C3406z70 componentCallbacks2C3406z70E = com.bumptech.glide.a.e(c1566gA.getBaseContext());
        ComponentCallbacks2C3406z70 componentCallbacks2C3406z70E2 = com.bumptech.glide.a.e(c1566gA.getBaseContext());
        componentCallbacks2C3406z70E2.getClass();
        C2630r70 c2630r70D = new C2630r70(componentCallbacks2C3406z70E2.l, componentCallbacks2C3406z70E2, Bitmap.class, componentCallbacks2C3406z70E2.m).b(ComponentCallbacks2C3406z70.v).b(((B70) ((B70) ((B70) new B70().g(C0789Tm.c)).B()).x()).p(i, i2));
        this.c = new ArrayList();
        this.d = componentCallbacks2C3406z70E;
        Handler handler = new Handler(Looper.getMainLooper(), new C0828Uz(0, this));
        this.e = q8;
        this.b = handler;
        this.h = c2630r70D;
        this.a = c1897jg0;
        c(c3373yq0, bitmap);
    }

    public final void a() {
        int i;
        int i2;
        if (!this.f || this.g) {
            return;
        }
        C0776Sz c0776Sz = this.m;
        if (c0776Sz != null) {
            this.m = null;
            b(c0776Sz);
            return;
        }
        this.g = true;
        C1897jg0 c1897jg0 = this.a;
        C0880Wz c0880Wz = c1897jg0.l;
        int i3 = c0880Wz.c;
        if (i3 <= 0 || (i2 = c1897jg0.k) < 0) {
            i = 0;
        } else {
            i = (i2 < 0 || i2 >= i3) ? -1 : ((C0750Rz) c0880Wz.e.get(i2)).i;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) i);
        int i4 = (c1897jg0.k + 1) % c1897jg0.l.c;
        c1897jg0.k = i4;
        this.k = new C0776Sz(this.b, i4, jUptimeMillis);
        C2630r70 c2630r70J = this.h.b((B70) new B70().v(new AV(Double.valueOf(Math.random())))).J(c1897jg0);
        c2630r70J.I(this.k, c2630r70J);
    }

    public final void b(C0776Sz c0776Sz) {
        this.g = false;
        boolean z = this.j;
        Handler handler = this.b;
        if (z) {
            handler.obtainMessage(2, c0776Sz).sendToTarget();
            return;
        }
        if (!this.f) {
            this.m = c0776Sz;
            return;
        }
        if (c0776Sz.r != null) {
            Bitmap bitmap = this.l;
            if (bitmap != null) {
                this.e.d(bitmap);
                this.l = null;
            }
            C0776Sz c0776Sz2 = this.i;
            this.i = c0776Sz;
            ArrayList arrayList = this.c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C0672Oz c0672Oz = (C0672Oz) ((InterfaceC0802Tz) arrayList.get(size));
                Object callback = c0672Oz.getCallback();
                while (callback instanceof Drawable) {
                    callback = ((Drawable) callback).getCallback();
                }
                if (callback == null) {
                    c0672Oz.stop();
                    c0672Oz.invalidateSelf();
                } else {
                    c0672Oz.invalidateSelf();
                    C0854Vz c0854Vz = (C0854Vz) c0672Oz.l.b;
                    C0776Sz c0776Sz3 = c0854Vz.i;
                    if ((c0776Sz3 != null ? c0776Sz3.p : -1) == c0854Vz.a.l.c - 1) {
                        c0672Oz.q++;
                    }
                    int i = c0672Oz.r;
                    if (i != -1 && c0672Oz.q >= i) {
                        c0672Oz.stop();
                    }
                }
            }
            if (c0776Sz2 != null) {
                handler.obtainMessage(2, c0776Sz2).sendToTarget();
            }
        }
        a();
    }

    public final void c(InterfaceC2686rm0 interfaceC2686rm0, Bitmap bitmap) {
        AbstractC3045vW.k(interfaceC2686rm0, "Argument must not be null");
        AbstractC3045vW.k(bitmap, "Argument must not be null");
        this.l = bitmap;
        this.h = this.h.b(new B70().A(interfaceC2686rm0, true));
        this.n = Kr0.c(bitmap);
        this.f584o = bitmap.getWidth();
        this.p = bitmap.getHeight();
    }
}
