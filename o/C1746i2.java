package o;

import android.view.View;
import android.widget.AbsListView;

/* JADX INFO: renamed from: o.i2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1746i2 implements AbsListView.OnScrollListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ View b;

    public C1746i2(View view, View view2) {
        this.a = view;
        this.b = view2;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        C2426p2.b(absListView, this.a, this.b);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
    }
}
