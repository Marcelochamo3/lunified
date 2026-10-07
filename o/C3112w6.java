package o;

/* JADX INFO: renamed from: o.w6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3112w6 {
    public final int a;
    public int b;
    public int c;
    public long d;
    public final boolean e;
    public final C2562qX f;
    public final C2562qX g;
    public int h;
    public int i;

    public C3112w6(C2562qX c2562qX, C2562qX c2562qX2, boolean z) throws C2949uX {
        this.g = c2562qX;
        this.f = c2562qX2;
        this.e = z;
        c2562qX2.F(12);
        this.a = c2562qX2.x();
        c2562qX.F(12);
        this.i = c2562qX.x();
        AbstractC2506pt.i("first_chunk must be 1", c2562qX.g() == 1);
        this.b = -1;
    }

    public final boolean a() {
        int i = this.b + 1;
        this.b = i;
        if (i == this.a) {
            return false;
        }
        boolean z = this.e;
        C2562qX c2562qX = this.f;
        this.d = z ? c2562qX.y() : c2562qX.v();
        if (this.b == this.h) {
            C2562qX c2562qX2 = this.g;
            this.c = c2562qX2.x();
            c2562qX2.G(4);
            int i2 = this.i - 1;
            this.i = i2;
            this.h = i2 > 0 ? c2562qX2.x() - 1 : -1;
        }
        return true;
    }
}
