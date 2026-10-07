package o;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: o.n60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2241n60 extends C3003v0 {
    public final C2338o60 d;
    public final WeakHashMap e = new WeakHashMap();

    public C2241n60(C2338o60 c2338o60) {
        this.d = c2338o60;
    }

    @Override // o.C3003v0
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        C3003v0 c3003v0 = (C3003v0) this.e.get(view);
        return c3003v0 != null ? c3003v0.a(view, accessibilityEvent) : this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // o.C3003v0
    public final L0 b(View view) {
        C3003v0 c3003v0 = (C3003v0) this.e.get(view);
        return c3003v0 != null ? c3003v0.b(view) : super.b(view);
    }

    @Override // o.C3003v0
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        C3003v0 c3003v0 = (C3003v0) this.e.get(view);
        if (c3003v0 != null) {
            c3003v0.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // o.C3003v0
    public final void d(View view, N0 n0) {
        C2338o60 c2338o60 = this.d;
        boolean zN = c2338o60.d.N();
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        AccessibilityNodeInfo accessibilityNodeInfo = n0.a;
        if (!zN) {
            RecyclerView recyclerView = c2338o60.d;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().f0(view, n0);
                C3003v0 c3003v0 = (C3003v0) this.e.get(view);
                if (c3003v0 != null) {
                    c3003v0.d(view, n0);
                    return;
                } else {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    return;
                }
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    @Override // o.C3003v0
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        C3003v0 c3003v0 = (C3003v0) this.e.get(view);
        if (c3003v0 != null) {
            c3003v0.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // o.C3003v0
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C3003v0 c3003v0 = (C3003v0) this.e.get(viewGroup);
        return c3003v0 != null ? c3003v0.f(viewGroup, view, accessibilityEvent) : this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // o.C3003v0
    public final boolean g(View view, int i, Bundle bundle) {
        C2338o60 c2338o60 = this.d;
        if (!c2338o60.d.N()) {
            RecyclerView recyclerView = c2338o60.d;
            if (recyclerView.getLayoutManager() != null) {
                C3003v0 c3003v0 = (C3003v0) this.e.get(view);
                if (c3003v0 != null) {
                    if (c3003v0.g(view, i, bundle)) {
                        return true;
                    }
                } else if (super.g(view, i, bundle)) {
                    return true;
                }
                C1266d60 c1266d60 = recyclerView.getLayoutManager().b.n;
                return false;
            }
        }
        return super.g(view, i, bundle);
    }

    @Override // o.C3003v0
    public final void h(View view, int i) {
        C3003v0 c3003v0 = (C3003v0) this.e.get(view);
        if (c3003v0 != null) {
            c3003v0.h(view, i);
        } else {
            super.h(view, i);
        }
    }

    @Override // o.C3003v0
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        C3003v0 c3003v0 = (C3003v0) this.e.get(view);
        if (c3003v0 != null) {
            c3003v0.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
