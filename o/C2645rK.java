package o;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: o.rK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2645rK {
    public int a = -1;
    public RecyclerView b;
    public X50 c;
    public boolean d;
    public boolean e;
    public View f;
    public final C1562g8 g;
    public final LinearInterpolator h;
    public final DecelerateInterpolator i;
    public PointF j;
    public final DisplayMetrics k;
    public boolean l;
    public float m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1000o;

    public C2645rK(Context context) {
        C1562g8 c1562g8 = new C1562g8(2);
        c1562g8.f = -1;
        c1562g8.b = false;
        c1562g8.c = 0;
        c1562g8.d = 0;
        c1562g8.e = Integer.MIN_VALUE;
        c1562g8.g = null;
        this.g = c1562g8;
        this.h = new LinearInterpolator();
        this.i = new DecelerateInterpolator();
        this.l = false;
        this.n = 0;
        this.f1000o = 0;
        this.k = context.getResources().getDisplayMetrics();
    }

    public static int a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    public int b(View view, int i) {
        X50 x50 = this.c;
        if (x50 == null || !x50.e()) {
            return 0;
        }
        Y50 y50 = (Y50) view.getLayoutParams();
        return a(x50.C(view) - ((ViewGroup.MarginLayoutParams) y50).leftMargin, x50.F(view) + ((ViewGroup.MarginLayoutParams) y50).rightMargin, x50.K(), x50.n - x50.L(), i);
    }

    public int c(View view, int i) {
        X50 x50 = this.c;
        if (x50 == null || !x50.f()) {
            return 0;
        }
        Y50 y50 = (Y50) view.getLayoutParams();
        return a(x50.G(view) - ((ViewGroup.MarginLayoutParams) y50).topMargin, x50.A(view) + ((ViewGroup.MarginLayoutParams) y50).bottomMargin, x50.M(), x50.f613o - x50.J(), i);
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int e(int i) {
        float fAbs = Math.abs(i);
        if (!this.l) {
            this.m = d(this.k);
            this.l = true;
        }
        return (int) Math.ceil(fAbs * this.m);
    }

    public PointF f(int i) {
        Object obj = this.c;
        if (obj instanceof InterfaceC1657h60) {
            return ((InterfaceC1657h60) obj).a(i);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00fa  */
    public final void g(int i, int i2) {
        PointF pointFF;
        RecyclerView recyclerView = this.b;
        if (this.a == -1 || recyclerView == null) {
            j();
        }
        if (this.d && this.f == null && this.c != null && (pointFF = f(this.a)) != null) {
            float f = pointFF.x;
            if (f != 0.0f || pointFF.y != 0.0f) {
                recyclerView.f0((int) Math.signum(f), (int) Math.signum(pointFF.y), null);
            }
        }
        this.d = false;
        View view = this.f;
        C1562g8 c1562g8 = this.g;
        if (view != null) {
            this.b.getClass();
            AbstractC2144m60 abstractC2144m60L = RecyclerView.L(view);
            if ((abstractC2144m60L != null ? abstractC2144m60L.e() : -1) == this.a) {
                View view2 = this.f;
                C1755i60 c1755i60 = recyclerView.t0;
                i(view2, c1562g8);
                c1562g8.a(recyclerView);
                j();
            } else {
                this.f = null;
            }
        }
        if (this.e) {
            C1755i60 c1755i61 = recyclerView.t0;
            if (this.b.y.x() == 0) {
                j();
            } else {
                int i3 = this.n;
                int i4 = i3 - i;
                if (i3 * i4 <= 0) {
                    i4 = 0;
                }
                this.n = i4;
                int i5 = this.f1000o;
                int i6 = i5 - i2;
                if (i5 * i6 <= 0) {
                    i6 = 0;
                }
                this.f1000o = i6;
                if (i4 == 0 && i6 == 0) {
                    PointF pointFF2 = f(this.a);
                    if (pointFF2 != null) {
                        float f2 = pointFF2.x;
                        if (f2 == 0.0f && pointFF2.y == 0.0f) {
                            c1562g8.f = this.a;
                            j();
                        } else {
                            float f3 = pointFF2.y;
                            float fSqrt = (float) Math.sqrt((f3 * f3) + (f2 * f2));
                            float f4 = pointFF2.x / fSqrt;
                            pointFF2.x = f4;
                            float f5 = pointFF2.y / fSqrt;
                            pointFF2.y = f5;
                            this.j = pointFF2;
                            this.n = (int) (f4 * 10000.0f);
                            this.f1000o = (int) (f5 * 10000.0f);
                            int iE = e(10000);
                            int i7 = (int) (this.n * 1.2f);
                            int i8 = (int) (this.f1000o * 1.2f);
                            LinearInterpolator linearInterpolator = this.h;
                            c1562g8.c = i7;
                            c1562g8.d = i8;
                            c1562g8.e = (int) (iE * 1.2f);
                            c1562g8.g = linearInterpolator;
                            c1562g8.b = true;
                        }
                    } else {
                        c1562g8.f = this.a;
                        j();
                    }
                }
            }
            boolean z = c1562g8.f >= 0;
            c1562g8.a(recyclerView);
            if (z && this.e) {
                this.d = true;
                recyclerView.q0.b();
            }
        }
    }

    public void h() {
        this.f1000o = 0;
        this.n = 0;
        this.j = null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0015  */
    public void i(View view, C1562g8 c1562g8) {
        int i;
        PointF pointF = this.j;
        int i2 = 0;
        if (pointF != null) {
            float f = pointF.x;
            if (f == 0.0f) {
                i = 0;
            } else {
                i = f > 0.0f ? 1 : -1;
            }
        } else {
            i = 0;
        }
        int iB = b(view, i);
        PointF pointF2 = this.j;
        if (pointF2 != null) {
            float f2 = pointF2.y;
            if (f2 != 0.0f) {
                i2 = f2 > 0.0f ? 1 : -1;
            }
        }
        int iC = c(view, i2);
        int iCeil = (int) Math.ceil(((double) e((int) Math.sqrt((iC * iC) + (iB * iB)))) / 0.3356d);
        if (iCeil > 0) {
            DecelerateInterpolator decelerateInterpolator = this.i;
            c1562g8.c = -iB;
            c1562g8.d = -iC;
            c1562g8.e = iCeil;
            c1562g8.g = decelerateInterpolator;
            c1562g8.b = true;
        }
    }

    public final void j() {
        if (this.e) {
            this.e = false;
            h();
            this.b.t0.a = -1;
            this.f = null;
            this.a = -1;
            this.d = false;
            X50 x50 = this.c;
            if (x50.e == this) {
                x50.e = null;
            }
            this.c = null;
            this.b = null;
        }
    }
}
