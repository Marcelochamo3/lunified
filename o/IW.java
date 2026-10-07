package o;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class IW extends AbstractC0351Cp {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IW(X50 x50, int i) {
        super(x50);
        this.d = i;
    }

    @Override // o.AbstractC0351Cp
    public final int b(View view) {
        switch (this.d) {
            case 0:
                return ((X50) this.b).F(view) + ((ViewGroup.MarginLayoutParams) ((Y50) view.getLayoutParams())).rightMargin;
            default:
                return ((X50) this.b).A(view) + ((ViewGroup.MarginLayoutParams) ((Y50) view.getLayoutParams())).bottomMargin;
        }
    }

    @Override // o.AbstractC0351Cp
    public final int c(View view) {
        switch (this.d) {
            case 0:
                Y50 y50 = (Y50) view.getLayoutParams();
                ((X50) this.b).getClass();
                return X50.E(view) + ((ViewGroup.MarginLayoutParams) y50).leftMargin + ((ViewGroup.MarginLayoutParams) y50).rightMargin;
            default:
                Y50 y51 = (Y50) view.getLayoutParams();
                ((X50) this.b).getClass();
                return X50.D(view) + ((ViewGroup.MarginLayoutParams) y51).topMargin + ((ViewGroup.MarginLayoutParams) y51).bottomMargin;
        }
    }

    @Override // o.AbstractC0351Cp
    public final int d(View view) {
        switch (this.d) {
            case 0:
                Y50 y50 = (Y50) view.getLayoutParams();
                ((X50) this.b).getClass();
                return X50.D(view) + ((ViewGroup.MarginLayoutParams) y50).topMargin + ((ViewGroup.MarginLayoutParams) y50).bottomMargin;
            default:
                Y50 y51 = (Y50) view.getLayoutParams();
                ((X50) this.b).getClass();
                return X50.E(view) + ((ViewGroup.MarginLayoutParams) y51).leftMargin + ((ViewGroup.MarginLayoutParams) y51).rightMargin;
        }
    }

    @Override // o.AbstractC0351Cp
    public final int e(View view) {
        switch (this.d) {
            case 0:
                return ((X50) this.b).C(view) - ((ViewGroup.MarginLayoutParams) ((Y50) view.getLayoutParams())).leftMargin;
            default:
                return ((X50) this.b).G(view) - ((ViewGroup.MarginLayoutParams) ((Y50) view.getLayoutParams())).topMargin;
        }
    }

    @Override // o.AbstractC0351Cp
    public final int f() {
        switch (this.d) {
            case 0:
                return ((X50) this.b).n;
            default:
                return ((X50) this.b).f613o;
        }
    }

    @Override // o.AbstractC0351Cp
    public final int g() {
        switch (this.d) {
            case 0:
                X50 x50 = (X50) this.b;
                return x50.n - x50.L();
            default:
                X50 x51 = (X50) this.b;
                return x51.f613o - x51.J();
        }
    }

    @Override // o.AbstractC0351Cp
    public final int h() {
        switch (this.d) {
            case 0:
                return ((X50) this.b).L();
            default:
                return ((X50) this.b).J();
        }
    }

    @Override // o.AbstractC0351Cp
    public final int i() {
        switch (this.d) {
            case 0:
                return ((X50) this.b).l;
            default:
                return ((X50) this.b).m;
        }
    }

    @Override // o.AbstractC0351Cp
    public final int j() {
        switch (this.d) {
            case 0:
                return ((X50) this.b).m;
            default:
                return ((X50) this.b).l;
        }
    }

    @Override // o.AbstractC0351Cp
    public final int k() {
        switch (this.d) {
            case 0:
                return ((X50) this.b).K();
            default:
                return ((X50) this.b).M();
        }
    }

    @Override // o.AbstractC0351Cp
    public final int l() {
        switch (this.d) {
            case 0:
                X50 x50 = (X50) this.b;
                return (x50.n - x50.K()) - x50.L();
            default:
                X50 x51 = (X50) this.b;
                return (x51.f613o - x51.M()) - x51.J();
        }
    }

    @Override // o.AbstractC0351Cp
    public final int n(View view) {
        switch (this.d) {
            case 0:
                X50 x50 = (X50) this.b;
                Rect rect = (Rect) this.c;
                x50.Q(view, rect);
                return rect.right;
            default:
                X50 x51 = (X50) this.b;
                Rect rect2 = (Rect) this.c;
                x51.Q(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // o.AbstractC0351Cp
    public final int o(View view) {
        switch (this.d) {
            case 0:
                X50 x50 = (X50) this.b;
                Rect rect = (Rect) this.c;
                x50.Q(view, rect);
                return rect.left;
            default:
                X50 x51 = (X50) this.b;
                Rect rect2 = (Rect) this.c;
                x51.Q(view, rect2);
                return rect2.top;
        }
    }

    @Override // o.AbstractC0351Cp
    public final void p(int i) {
        switch (this.d) {
            case 0:
                ((X50) this.b).W(i);
                break;
            default:
                ((X50) this.b).X(i);
                break;
        }
    }
}
