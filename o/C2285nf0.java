package o;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: o.nf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2285nf0 extends U50 {
    public final int a;
    public final int b;

    public C2285nf0(int i) {
        this.a = i;
        this.b = i;
    }

    @Override // o.U50
    public final void a(Rect rect, View view, RecyclerView recyclerView, C1755i60 c1755i60) {
        AbstractC1474fG.j(rect, "outRect");
        AbstractC1474fG.j(view, "view");
        AbstractC1474fG.j(recyclerView, "parent");
        AbstractC1474fG.j(c1755i60, "state");
        AbstractC2144m60 abstractC2144m60L = RecyclerView.L(view);
        int iC = abstractC2144m60L != null ? abstractC2144m60L.c() : -1;
        O50 adapter = recyclerView.getAdapter();
        int iA = adapter != null ? adapter.a() : 0;
        X50 layoutManager = recyclerView.getLayoutManager();
        boolean z = layoutManager instanceof GridLayoutManager;
        int i = this.a;
        int i2 = this.b;
        if (z) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            int i3 = gridLayoutManager.F;
            int i4 = gridLayoutManager.K.i(iC);
            int iH = gridLayoutManager.K.h(iC, i3);
            rect.left = (iH * i2) / i3;
            rect.right = i2 - (((i4 + iH) * i2) / i3);
            if (iC != iH) {
                rect.top = i;
                return;
            }
            return;
        }
        if (!(layoutManager instanceof LinearLayoutManager) || iC == iA - 1) {
            return;
        }
        int i5 = ((LinearLayoutManager) layoutManager).p;
        if (i5 == 0) {
            rect.right = i2;
        } else {
            if (i5 != 1) {
                return;
            }
            rect.bottom = i;
        }
    }
}
