package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: loaded from: classes.dex */
public final class LJ extends AbstractC1474fG {
    public final /* synthetic */ int m;
    public final SideSheetBehavior n;

    public /* synthetic */ LJ(SideSheetBehavior sideSheetBehavior, int i) {
        this.m = i;
        this.n = sideSheetBehavior;
    }

    @Override // o.AbstractC1474fG
    public final boolean F(float f) {
        switch (this.m) {
            case 0:
                return f > 0.0f;
            default:
                return f < 0.0f;
        }
    }

    @Override // o.AbstractC1474fG
    public final boolean H(View view) {
        switch (this.m) {
            case 0:
                return view.getRight() < (r() - s()) / 2;
            default:
                return view.getLeft() > (r() + this.n.m) / 2;
        }
    }

    @Override // o.AbstractC1474fG
    public final boolean I(float f, float f2) {
        switch (this.m) {
            case 0:
                if (Math.abs(f) > Math.abs(f2)) {
                    float fAbs = Math.abs(f);
                    this.n.getClass();
                    if (fAbs > 500) {
                        return true;
                    }
                }
                return false;
            default:
                if (Math.abs(f) > Math.abs(f2)) {
                    float fAbs2 = Math.abs(f);
                    this.n.getClass();
                    if (fAbs2 > 500) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // o.AbstractC1474fG
    public final boolean S(View view, float f) {
        switch (this.m) {
            case 0:
                return Math.abs((f * this.n.k) + ((float) view.getLeft())) > 0.5f;
            default:
                return Math.abs((f * this.n.k) + ((float) view.getRight())) > 0.5f;
        }
    }

    @Override // o.AbstractC1474fG
    public final void W(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        switch (this.m) {
            case 0:
                marginLayoutParams.leftMargin = i;
                break;
            default:
                marginLayoutParams.rightMargin = i;
                break;
        }
    }

    @Override // o.AbstractC1474fG
    public final void X(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        switch (this.m) {
            case 0:
                if (i <= this.n.m) {
                    marginLayoutParams.leftMargin = i2;
                }
                break;
            default:
                int i3 = this.n.m;
                if (i <= i3) {
                    marginLayoutParams.rightMargin = i3 - i;
                }
                break;
        }
    }

    @Override // o.AbstractC1474fG
    public final int d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.m) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // o.AbstractC1474fG
    public final float e(int i) {
        switch (this.m) {
            case 0:
                float fS = s();
                return (i - fS) / (r() - fS);
            default:
                float f = this.n.m;
                return (f - i) / (f - r());
        }
    }

    @Override // o.AbstractC1474fG
    public final int p(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.m) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // o.AbstractC1474fG
    public final int r() {
        switch (this.m) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.n;
                return Math.max(0, sideSheetBehavior.n + sideSheetBehavior.f44o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.n;
                return Math.max(0, (sideSheetBehavior2.m - sideSheetBehavior2.l) - sideSheetBehavior2.f44o);
        }
    }

    @Override // o.AbstractC1474fG
    public final int s() {
        switch (this.m) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.n;
                return (-sideSheetBehavior.l) - sideSheetBehavior.f44o;
            default:
                return this.n.m;
        }
    }

    @Override // o.AbstractC1474fG
    public final int t() {
        switch (this.m) {
            case 0:
                return this.n.f44o;
            default:
                return this.n.m;
        }
    }

    @Override // o.AbstractC1474fG
    public final int u() {
        switch (this.m) {
            case 0:
                return -this.n.l;
            default:
                return r();
        }
    }

    @Override // o.AbstractC1474fG
    public final int w(View view) {
        switch (this.m) {
            case 0:
                return view.getRight() + this.n.f44o;
            default:
                return view.getLeft() - this.n.f44o;
        }
    }

    @Override // o.AbstractC1474fG
    public final int x(CoordinatorLayout coordinatorLayout) {
        switch (this.m) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // o.AbstractC1474fG
    public final int z() {
        switch (this.m) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }
}
