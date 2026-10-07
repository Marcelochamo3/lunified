package o;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class S3 implements Runnable {
    public final /* synthetic */ int l;
    public final /* synthetic */ LayoutInflaterFactory2C1456f4 m;

    public /* synthetic */ S3(LayoutInflaterFactory2C1456f4 layoutInflaterFactory2C1456f4, int i) {
        this.l = i;
        this.m = layoutInflaterFactory2C1456f4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.l) {
            case 0:
                LayoutInflaterFactory2C1456f4 layoutInflaterFactory2C1456f4 = this.m;
                if ((layoutInflaterFactory2C1456f4.l0 & 1) != 0) {
                    layoutInflaterFactory2C1456f4.r(0);
                }
                if ((layoutInflaterFactory2C1456f4.l0 & C1672hI.a.f) != 0) {
                    layoutInflaterFactory2C1456f4.r(C3080vp0.v0);
                }
                layoutInflaterFactory2C1456f4.k0 = false;
                layoutInflaterFactory2C1456f4.l0 = 0;
                break;
            default:
                LayoutInflaterFactory2C1456f4 layoutInflaterFactory2C1456f5 = this.m;
                layoutInflaterFactory2C1456f5.H.showAtLocation(layoutInflaterFactory2C1456f5.G, 55, 0, 0);
                C2509pu0 c2509pu0 = layoutInflaterFactory2C1456f5.J;
                if (c2509pu0 != null) {
                    c2509pu0.b();
                }
                if (!(layoutInflaterFactory2C1456f5.L && (viewGroup = layoutInflaterFactory2C1456f5.M) != null && viewGroup.isLaidOut())) {
                    layoutInflaterFactory2C1456f5.G.setAlpha(1.0f);
                    layoutInflaterFactory2C1456f5.G.setVisibility(0);
                } else {
                    layoutInflaterFactory2C1456f5.G.setAlpha(0.0f);
                    C2509pu0 c2509pu0A = It0.a(layoutInflaterFactory2C1456f5.G);
                    c2509pu0A.a(1.0f);
                    layoutInflaterFactory2C1456f5.J = c2509pu0A;
                    c2509pu0A.d(new U3(0, this));
                }
                break;
        }
    }
}
