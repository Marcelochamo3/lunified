package o;

import java.util.Arrays;

/* JADX INFO: renamed from: o.Qk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0709Qk implements InterfaceC2486pj, K8 {
    public int l;
    public int m;
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f477o;

    public C0709Qk(int i) {
        switch (i) {
            case 4:
                this.n = new long[10];
                this.f477o = new Object[10];
                break;
            default:
                this.n = new C2994uv(8);
                this.l = 8000;
                this.m = 8000;
                break;
        }
    }

    @Override // o.InterfaceC2486pj
    public InterfaceC2583qj H() {
        return new C0787Tk((String) this.f477o, this.l, this.m, (C2994uv) this.n);
    }

    public synchronized void a(long j, Object obj) {
        int i = this.m;
        if (i > 0) {
            if (j <= ((long[]) this.n)[((this.l + i) - 1) % ((Object[]) this.f477o).length]) {
                b();
            }
        }
        c();
        int i2 = this.l;
        int i3 = this.m;
        Object[] objArr = (Object[]) this.f477o;
        int length = (i2 + i3) % objArr.length;
        ((long[]) this.n)[length] = j;
        objArr[length] = obj;
        this.m = i3 + 1;
    }

    public synchronized void b() {
        this.l = 0;
        this.m = 0;
        Arrays.fill((Object[]) this.f477o, (Object) null);
    }

    public void c() {
        int length = ((Object[]) this.f477o).length;
        if (this.m < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        Object[] objArr = new Object[i];
        int i2 = this.l;
        int i3 = length - i2;
        System.arraycopy((long[]) this.n, i2, jArr, 0, i3);
        System.arraycopy((Object[]) this.f477o, this.l, objArr, 0, i3);
        int i4 = this.l;
        if (i4 > 0) {
            System.arraycopy((long[]) this.n, 0, jArr, i3, i4);
            System.arraycopy((Object[]) this.f477o, 0, objArr, i3, this.l);
        }
        this.n = jArr;
        this.f477o = objArr;
        this.l = 0;
    }

    public Object d(long j, boolean z) {
        Object objF = null;
        long j2 = Long.MAX_VALUE;
        while (this.m > 0) {
            long j3 = j - ((long[]) this.n)[this.l];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            objF = f();
            j2 = j3;
        }
        return objF;
    }

    public synchronized Object e(long j) {
        return d(j, true);
    }

    public Object f() {
        AbstractC0397Ej.f(this.m > 0);
        Object[] objArr = (Object[]) this.f477o;
        int i = this.l;
        Object obj = objArr[i];
        objArr[i] = null;
        this.l = (i + 1) % objArr.length;
        this.m--;
        return obj;
    }

    @Override // o.K8
    public J8 i(C0554Kk c0554Kk, long j) {
        long j2 = c0554Kk.f369o;
        int iMin = (int) Math.min(this.m, c0554Kk.n - j2);
        C2562qX c2562qX = (C2562qX) this.f477o;
        c2562qX.C(iMin);
        c0554Kk.x(c2562qX.a, 0, iMin, false);
        int i = c2562qX.c;
        long j3 = -1;
        long j4 = -1;
        long j5 = -9223372036854775807L;
        while (c2562qX.a() >= 188) {
            byte[] bArr = c2562qX.a;
            int i2 = c2562qX.b;
            while (i2 < i && bArr[i2] != 71) {
                i2++;
            }
            int i3 = i2 + 188;
            if (i3 > i) {
                break;
            }
            long jZ = AbstractC3409z9.z(c2562qX, i2, this.l);
            if (jZ != -9223372036854775807L) {
                long jB = ((Oj0) this.n).b(jZ);
                if (jB > j) {
                    return j5 == -9223372036854775807L ? new J8(-1, jB, j2) : new J8(0, -9223372036854775807L, j2 + j4);
                }
                if (100000 + jB > j) {
                    return new J8(0, -9223372036854775807L, j2 + ((long) i2));
                }
                j5 = jB;
                j4 = i2;
            }
            c2562qX.F(i3);
            j3 = i3;
        }
        return j5 != -9223372036854775807L ? new J8(-2, j5, j2 + j3) : J8.d;
    }

    @Override // o.K8
    public void q() {
        byte[] bArr = Lr0.e;
        C2562qX c2562qX = (C2562qX) this.f477o;
        c2562qX.getClass();
        c2562qX.D(bArr.length, bArr);
    }

    public C0709Qk(int i, float[] fArr, float[] fArr2, int i2) {
        this.l = i;
        AbstractC0397Ej.c(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
        this.n = fArr;
        this.f477o = fArr2;
        this.m = i2;
    }

    public C0709Qk(C0709Qk c0709Qk) {
        float[] fArr = (float[]) c0709Qk.n;
        this.l = fArr.length / 3;
        this.n = AbstractC3409z9.i(fArr);
        this.f477o = AbstractC3409z9.i((float[]) c0709Qk.f477o);
        int i = c0709Qk.m;
        if (i == 1) {
            this.m = 5;
        } else if (i != 2) {
            this.m = 4;
        } else {
            this.m = 6;
        }
    }
}
