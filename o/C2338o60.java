package o;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: o.o60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2338o60 extends C3003v0 {
    public final RecyclerView d;
    public final C2241n60 e;

    public C2338o60(RecyclerView recyclerView) {
        this.d = recyclerView;
        C3003v0 c3003v0J = j();
        if (c3003v0J == null || !(c3003v0J instanceof C2241n60)) {
            this.e = new C2241n60(this);
        } else {
            this.e = (C2241n60) c3003v0J;
        }
    }

    @Override // o.C3003v0
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.d.N()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().d0(accessibilityEvent);
        }
    }

    @Override // o.C3003v0
    public final void d(View view, N0 n0) {
        this.a.onInitializeAccessibilityNodeInfo(view, n0.a);
        RecyclerView recyclerView = this.d;
        if (recyclerView.N() || recyclerView.getLayoutManager() == null) {
            return;
        }
        X50 layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.b;
        layoutManager.e0(recyclerView2.n, recyclerView2.t0, n0);
    }

    @Override // o.C3003v0
    public final boolean g(View view, int i, Bundle bundle) {
        if (super.g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.d;
        if (recyclerView.N() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        X50 layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.b;
        return layoutManager.v0(recyclerView2.n, recyclerView2.t0, i, bundle);
    }

    public C3003v0 j() {
        return this.e;
    }
}
