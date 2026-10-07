package o;

/* JADX INFO: loaded from: classes.dex */
public final class J80 extends Nr0 {
    @Override // o.Nr0
    public final void m(C2765sd0 c2765sd0, float f, float f2) {
        c2765sd0.d(f2 * f, 180.0f, 90.0f);
        float f3 = f2 * 2.0f * f;
        C2378od0 c2378od0 = new C2378od0(0.0f, 0.0f, f3, f3);
        c2378od0.f = 180.0f;
        c2378od0.g = 90.0f;
        c2765sd0.g.add(c2378od0);
        C2184md0 c2184md0 = new C2184md0(c2378od0);
        c2765sd0.a(180.0f);
        c2765sd0.h.add(c2184md0);
        c2765sd0.e = 270.0f;
        float f4 = (0.0f + f3) * 0.5f;
        float f5 = (f3 - 0.0f) / 2.0f;
        double d = 270.0f;
        c2765sd0.c = (((float) Math.cos(Math.toRadians(d))) * f5) + f4;
        c2765sd0.d = (f5 * ((float) Math.sin(Math.toRadians(d)))) + f4;
    }
}
