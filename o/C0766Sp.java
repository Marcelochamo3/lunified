package o;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: o.Sp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0766Sp {
    public int a = 1;
    public final HQ b;
    public HQ c;
    public HQ d;
    public int e;
    public int f;
    public final boolean g;
    public final int[] h;

    public C0766Sp(HQ hq, boolean z, int[] iArr) {
        this.b = hq;
        this.c = hq;
        this.g = z;
        this.h = iArr;
    }

    public final void a() {
        this.a = 1;
        this.c = this.b;
        this.f = 0;
    }

    public final boolean b() {
        int[] iArr;
        EQ eqC = this.c.b.c();
        int iA = eqC.a(6);
        if ((iA == 0 || ((ByteBuffer) eqC.f969o).get(iA + eqC.l) == 0) && this.e != 65039) {
            return this.g && ((iArr = this.h) == null || Arrays.binarySearch(iArr, this.c.b.a(0)) < 0);
        }
        return true;
    }
}
