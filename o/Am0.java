package o;

import android.view.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class Am0 extends Dm0 {
    public long a = -1;
    public boolean b;
    public boolean c;
    public Kf0 d;
    public final C2613qy e;
    public Runnable f;
    public final /* synthetic */ Cm0 g;

    public Am0(Im0 im0) {
        this.g = im0;
        C2613qy c2613qy = new C2613qy();
        long[] jArr = new long[20];
        c2613qy.n = jArr;
        c2613qy.f996o = new float[20];
        c2613qy.m = 0;
        Arrays.fill(jArr, Long.MIN_VALUE);
        this.e = c2613qy;
    }

    @Override // o.Dm0, o.Bm0
    public final void a(Cm0 cm0) {
        this.c = true;
    }

    public final void h() {
        float fSqrt;
        if (this.d != null) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        float f = this.a;
        C2613qy c2613qy = this.e;
        int i = (c2613qy.m + 1) % 20;
        c2613qy.m = i;
        ((long[]) c2613qy.n)[i] = jCurrentAnimationTimeMillis;
        ((float[]) c2613qy.f996o)[i] = f;
        C1245cw c1245cw = new C1245cw();
        float f2 = 0.0f;
        c1245cw.a = 0.0f;
        this.d = new Kf0(c1245cw);
        Lf0 lf0 = new Lf0();
        lf0.b = 1.0f;
        int i2 = 0;
        lf0.c = false;
        lf0.a = Math.sqrt(200.0f);
        lf0.c = false;
        Kf0 kf0 = this.d;
        kf0.l = lf0;
        kf0.b = this.a;
        kf0.c = true;
        if (kf0.e) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        ArrayList arrayList = kf0.k;
        if (!arrayList.contains(this)) {
            arrayList.add(this);
        }
        Kf0 kf1 = this.d;
        int i3 = c2613qy.m;
        long[] jArr = (long[]) c2613qy.n;
        long j = Long.MIN_VALUE;
        if (i3 != 0 || jArr[i3] != Long.MIN_VALUE) {
            long j2 = jArr[i3];
            long j3 = j2;
            while (true) {
                long j4 = jArr[i3];
                if (j4 == j) {
                    break;
                }
                float f3 = j2 - j4;
                float fAbs = Math.abs(j4 - j3);
                if (f3 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                if (i3 == 0) {
                    i3 = 20;
                }
                i3--;
                i2++;
                if (i2 >= 20) {
                    break;
                }
                j3 = j4;
                j = Long.MIN_VALUE;
            }
            if (i2 >= 2) {
                float[] fArr = (float[]) c2613qy.f996o;
                if (i2 == 2) {
                    int i4 = c2613qy.m;
                    int i5 = i4 == 0 ? 19 : i4 - 1;
                    float f4 = jArr[i4] - jArr[i5];
                    if (f4 != 0.0f) {
                        fSqrt = (fArr[i4] - fArr[i5]) / f4;
                    }
                } else {
                    int i6 = c2613qy.m;
                    int i7 = ((i6 - i2) + 21) % 20;
                    int i8 = (i6 + 21) % 20;
                    long j5 = jArr[i7];
                    float f5 = fArr[i7];
                    int i9 = i7 + 1;
                    int i10 = i9 % 20;
                    float f6 = 0.0f;
                    while (i10 != i8) {
                        long j6 = jArr[i10];
                        long[] jArr2 = jArr;
                        float f7 = j6 - j5;
                        if (f7 != f2) {
                            float f8 = fArr[i10];
                            float f9 = (f8 - f5) / f7;
                            float fAbs2 = (Math.abs(f9) * (f9 - ((float) (Math.sqrt(2.0f * Math.abs(f6)) * ((double) Math.signum(f6)))))) + f6;
                            if (i10 == i9) {
                                fAbs2 *= 0.5f;
                            }
                            f6 = fAbs2;
                            f5 = f8;
                            j5 = j6;
                        }
                        i10 = (i10 + 1) % 20;
                        jArr = jArr2;
                        i8 = i8;
                        f2 = 0.0f;
                    }
                    fSqrt = (float) (Math.sqrt(Math.abs(f6) * 2.0f) * ((double) Math.signum(f6)));
                }
                f2 = fSqrt * 1000.0f;
            }
        }
        kf1.a = f2;
        Kf0 kf2 = this.d;
        kf2.f = this.g.H + 1;
        kf2.g = -1.0f;
        kf2.i = 4.0f;
        C3462zm0 c3462zm0 = new C3462zm0(this);
        ArrayList arrayList2 = kf2.j;
        if (arrayList2.contains(c3462zm0)) {
            return;
        }
        arrayList2.add(c3462zm0);
    }
}
