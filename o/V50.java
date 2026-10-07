package o;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class V50 {
    public final /* synthetic */ int a;
    public final /* synthetic */ X50 b;

    public /* synthetic */ V50(X50 x50, int i) {
        this.a = i;
        this.b = x50;
    }

    public final View a(int i) {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.w(i);
    }

    public final int b(View view) {
        switch (this.a) {
            case 0:
                return this.b.F(view) + ((ViewGroup.MarginLayoutParams) ((Y50) view.getLayoutParams())).rightMargin;
            default:
                return this.b.A(view) + ((ViewGroup.MarginLayoutParams) ((Y50) view.getLayoutParams())).bottomMargin;
        }
    }

    public final int c(View view) {
        switch (this.a) {
            case 0:
                return this.b.C(view) - ((ViewGroup.MarginLayoutParams) ((Y50) view.getLayoutParams())).leftMargin;
            default:
                return this.b.G(view) - ((ViewGroup.MarginLayoutParams) ((Y50) view.getLayoutParams())).topMargin;
        }
    }

    public final int d() {
        switch (this.a) {
            case 0:
                X50 x50 = this.b;
                return x50.n - x50.L();
            default:
                X50 x51 = this.b;
                return x51.f613o - x51.J();
        }
    }

    public final int e() {
        switch (this.a) {
            case 0:
                return this.b.K();
            default:
                return this.b.M();
        }
    }
}
