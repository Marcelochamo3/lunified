package o;

/* JADX INFO: renamed from: o.hw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1735hw0 {
    public int c;
    public int d;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public int e = 2;
    public int f = 3;
    public int g = 0;
    public float h = 50.0f;
    public int b = Integer.MIN_VALUE;
    public int a = Integer.MAX_VALUE;

    public final int a() {
        if (this.l) {
            int i = this.g;
            int i2 = i >= 0 ? this.i - i : -i;
            float f = this.h;
            return f != -1.0f ? i2 - ((int) ((this.i * f) / 100.0f)) : i2;
        }
        int i3 = this.g;
        if (i3 < 0) {
            i3 += this.i;
        }
        float f2 = this.h;
        return f2 != -1.0f ? i3 + ((int) ((this.i * f2) / 100.0f)) : i3;
    }

    public final int b(int i) {
        int i2;
        int i3;
        int i4 = this.i;
        int iA = a();
        int i5 = this.b;
        boolean z = i5 == Integer.MIN_VALUE;
        int i6 = this.a;
        boolean z2 = i6 == Integer.MAX_VALUE;
        if (!z) {
            int i7 = this.j;
            int i8 = iA - i7;
            if (this.l ? (this.f & 2) != 0 : (this.f & 1) != 0) {
                if (i - i5 <= i8) {
                    int i9 = i5 - i7;
                    return (z2 || i9 <= (i3 = this.c)) ? i9 : i3;
                }
            }
        }
        if (!z2) {
            int i10 = this.k;
            int i11 = (i4 - iA) - i10;
            if (this.l ? (1 & this.f) != 0 : (this.f & 2) != 0) {
                if (i6 - i <= i11) {
                    int i12 = i6 - (i4 - i10);
                    return (z || i12 >= (i2 = this.d)) ? i12 : i2;
                }
            }
        }
        return i - iA;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        r6.d = r0 - r6.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0051, code lost:
    
        r6.c = (r4 - r6.j) - r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(int r7, int r8, int r9, int r10) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1735hw0.c(int, int, int, int):void");
    }

    public final String toString() {
        return " min:" + this.b + " " + this.d + " max:" + this.a + " " + this.c;
    }
}
