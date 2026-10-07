package o;

import java.util.Arrays;

/* JADX INFO: renamed from: o.td, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2861td implements InterfaceC2664rb0 {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    public final long f;

    public C2861td(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length > 0) {
            this.f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f = 0L;
        }
    }

    @Override // o.InterfaceC2664rb0
    public final boolean g() {
        return true;
    }

    @Override // o.InterfaceC2664rb0
    public final C2568qb0 i(long j) {
        long[] jArr = this.e;
        int iF = Lr0.f(jArr, j, true);
        long j2 = jArr[iF];
        long[] jArr2 = this.c;
        C2858tb0 c2858tb0 = new C2858tb0(j2, jArr2[iF]);
        if (j2 >= j || iF == this.a - 1) {
            return new C2568qb0(c2858tb0, c2858tb0);
        }
        int i = iF + 1;
        return new C2568qb0(c2858tb0, new C2858tb0(jArr[i], jArr2[i]));
    }

    @Override // o.InterfaceC2664rb0
    public final long j() {
        return this.f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.a + ", sizes=" + Arrays.toString(this.b) + ", offsets=" + Arrays.toString(this.c) + ", timeUs=" + Arrays.toString(this.e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
