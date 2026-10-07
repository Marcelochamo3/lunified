package o;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class Kf0 {
    public final C2133m1 d;
    public float a = 0.0f;
    public float b = Float.MAX_VALUE;
    public boolean c = false;
    public boolean e = false;
    public float f = Float.MAX_VALUE;
    public float g = -3.4028235E38f;
    public long h = 0;
    public final ArrayList j = new ArrayList();
    public final ArrayList k = new ArrayList();
    public float i = 1.0f;
    public Lf0 l = null;
    public float m = Float.MAX_VALUE;

    public Kf0(C1245cw c1245cw) {
        this.d = new C2133m1(20, c1245cw);
    }

    public final void a(float f) {
        if (this.e) {
            this.m = f;
            return;
        }
        if (this.l == null) {
            this.l = new Lf0(f);
        }
        Lf0 lf0 = this.l;
        double d = f;
        lf0.i = d;
        double d2 = (float) d;
        if (d2 > this.f) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d2 < this.g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double dAbs = Math.abs(this.i * 0.75f);
        lf0.d = dAbs;
        lf0.e = dAbs * 62.5d;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        boolean z = this.e;
        if (z || z) {
            return;
        }
        this.e = true;
        if (!this.c) {
            this.b = ((C1245cw) this.d.m).a;
        }
        float f2 = this.b;
        if (f2 > this.f || f2 < this.g) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        ThreadLocal threadLocal = C1064b3.f;
        if (threadLocal.get() == null) {
            threadLocal.set(new C1064b3());
        }
        C1064b3 c1064b3 = (C1064b3) threadLocal.get();
        ArrayList arrayList = c1064b3.b;
        if (arrayList.size() == 0) {
            if (c1064b3.d == null) {
                c1064b3.d = new Na0(c1064b3.c);
            }
            Na0 na0 = c1064b3.d;
            ((Choreographer) na0.n).postFrameCallback((ChoreographerFrameCallbackC0966a3) na0.f414o);
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public final void b(float f) {
        ArrayList arrayList;
        ((C1245cw) this.d.m).a = f;
        int i = 0;
        while (true) {
            arrayList = this.k;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                Am0 am0 = (Am0) arrayList.get(i);
                float f2 = this.b;
                Cm0 cm0 = am0.g;
                long jMax = Math.max(-1L, Math.min(cm0.H + 1, Math.round(f2)));
                cm0.I(jMax, am0.a);
                am0.a = jMax;
            }
            i++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }
}
