package o;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: renamed from: o.sd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2765sd0 {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public C2765sd0() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f) {
        float f2 = this.e;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.c;
        float f5 = this.d;
        C2378od0 c2378od0 = new C2378od0(f4, f5, f4, f5);
        c2378od0.f = this.e;
        c2378od0.g = f3;
        this.h.add(new C2184md0(c2378od0));
        this.e = f;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC2572qd0) arrayList.get(i)).a(matrix, path);
        }
    }

    public final void c(float f, float f2) {
        C2475pd0 c2475pd0 = new C2475pd0();
        c2475pd0.b = f;
        c2475pd0.c = f2;
        this.g.add(c2475pd0);
        C2281nd0 c2281nd0 = new C2281nd0(c2475pd0, this.c, this.d);
        float fB = c2281nd0.b() + 270.0f;
        float fB2 = c2281nd0.b() + 270.0f;
        a(fB);
        this.h.add(c2281nd0);
        this.e = fB2;
        this.c = f;
        this.d = f2;
    }

    public final void d(float f, float f2, float f3) {
        this.a = 0.0f;
        this.b = f;
        this.c = 0.0f;
        this.d = f;
        this.e = f2;
        this.f = (f2 + f3) % 360.0f;
        this.g.clear();
        this.h.clear();
    }
}
