package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: o.t10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2812t10 implements Runnable {
    public final /* synthetic */ int l;
    public final /* synthetic */ RecyclerView m;

    public /* synthetic */ RunnableC2812t10(int i, RecyclerView recyclerView) {
        this.l = i;
        this.m = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        View viewS;
        View view2;
        switch (this.l) {
            case 0:
                RecyclerView recyclerView = this.m;
                AbstractC2144m60 abstractC2144m60G = recyclerView.G(0);
                if (abstractC2144m60G == null || (view = abstractC2144m60G.a) == null) {
                    recyclerView.requestFocus();
                } else {
                    view.requestFocus();
                }
                break;
            case 1:
                RecyclerView recyclerView2 = this.m;
                AbstractC1474fG.j(recyclerView2, "$this_apply");
                O50 adapter = recyclerView2.getAdapter();
                if ((adapter != null ? adapter.a() : 0) > 0) {
                    recyclerView2.requestFocus();
                    X50 layoutManager = recyclerView2.getLayoutManager();
                    if (layoutManager != null && (viewS = layoutManager.s(0)) != null) {
                        viewS.requestFocus();
                        break;
                    }
                }
                break;
            default:
                RecyclerView recyclerView3 = this.m;
                AbstractC1474fG.j(recyclerView3, "$rv");
                boolean zRequestFocus = false;
                AbstractC2144m60 abstractC2144m60G2 = recyclerView3.G(0);
                if (abstractC2144m60G2 != null && (view2 = abstractC2144m60G2.a) != null) {
                    zRequestFocus = view2.requestFocus();
                }
                if (!zRequestFocus) {
                    recyclerView3.requestFocus();
                }
                break;
        }
    }
}
