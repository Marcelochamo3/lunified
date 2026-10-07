package o;

import android.view.View;
import androidx.leanback.widget.VerticalGridView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.skidush.clonex.fragments.search.SearchTvFragment;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class R6 implements Runnable {
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    public /* synthetic */ R6(int i, int i2, Object obj) {
        this.l = i2;
        this.n = obj;
        this.m = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        switch (this.l) {
            case 0:
                T6 t6 = ((S6) this.n).b;
                t6.getClass();
                int i = this.m;
                if (i == -3 || i == -2) {
                    if (i != -2) {
                        I6 i6 = t6.d;
                        if (!(i6 != null && i6.l == 1)) {
                            t6.c(3);
                        }
                    }
                    SurfaceHolderCallbackC0898Xr surfaceHolderCallbackC0898Xr = t6.c;
                    if (surfaceHolderCallbackC0898Xr != null) {
                        C1042as c1042as = surfaceHolderCallbackC0898Xr.l;
                        boolean zI = c1042as.I();
                        c1042as.f0(0, zI ? 2 : 1, zI);
                    }
                    t6.c(2);
                } else if (i == -1) {
                    SurfaceHolderCallbackC0898Xr surfaceHolderCallbackC0898Xr2 = t6.c;
                    if (surfaceHolderCallbackC0898Xr2 != null) {
                        C1042as c1042as2 = surfaceHolderCallbackC0898Xr2.l;
                        boolean zI2 = c1042as2.I();
                        c1042as2.f0(-1, zI2 ? 2 : 1, zI2);
                    }
                    t6.a();
                } else if (i == 1) {
                    t6.c(1);
                    SurfaceHolderCallbackC0898Xr surfaceHolderCallbackC0898Xr3 = t6.c;
                    if (surfaceHolderCallbackC0898Xr3 != null) {
                        C1042as c1042as3 = surfaceHolderCallbackC0898Xr3.l;
                        c1042as3.f0(1, 1, c1042as3.I());
                    }
                } else {
                    AP.z();
                }
                break;
            case 1:
                ((AP) this.n).q(this.m);
                break;
            case 2:
                SearchTvFragment searchTvFragment = (SearchTvFragment) this.n;
                AbstractC1474fG.j(searchTvFragment, "this$0");
                if (searchTvFragment.l0 != null && searchTvFragment.o0.a() != 0) {
                    Tl0 tl0 = searchTvFragment.l0;
                    AbstractC1474fG.g(tl0);
                    VerticalGridView verticalGridView = (VerticalGridView) tl0.r;
                    int i2 = this.m;
                    verticalGridView.setSelectedPosition(i2);
                    Tl0 tl1 = searchTvFragment.l0;
                    AbstractC1474fG.g(tl1);
                    ((VerticalGridView) tl1.r).g0(i2);
                    break;
                }
                break;
            case 3:
                C1111bd0 c1111bd0 = (C1111bd0) this.n;
                AbstractC1474fG.j(c1111bd0, "this$0");
                AbstractC2144m60 abstractC2144m60G = ((RecyclerView) c1111bd0.g.u).G(this.m);
                if (abstractC2144m60G != null && (view = abstractC2144m60G.a) != null) {
                    view.requestFocus();
                    break;
                }
                break;
            case 4:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.n;
                View view2 = (View) sideSheetBehavior.p.get();
                if (view2 != null) {
                    sideSheetBehavior.y(view2, this.m, false);
                }
                break;
            default:
                C1521fn0 c1521fn0 = (C1521fn0) this.n;
                AbstractC1474fG.j(c1521fn0, "this$0");
                c1521fn0.e.b(c1521fn0.d.get(this.m));
                break;
        }
    }
}
