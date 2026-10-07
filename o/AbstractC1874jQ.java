package o;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: o.jQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1874jQ implements Id0, InterfaceC2651rQ, AdapterView.OnItemClickListener {
    public Rect l;

    public static int p(WP wp, Context context, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = wp.getCount();
        FrameLayout frameLayout = null;
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = wp.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = wp.getView(i4, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    public static boolean x(ZP zp) {
        int size = zp.f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = zp.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // o.InterfaceC2651rQ
    public final boolean f(C1386eQ c1386eQ) {
        return false;
    }

    @Override // o.InterfaceC2651rQ
    public final int i() {
        return 0;
    }

    @Override // o.InterfaceC2651rQ
    public final boolean n(C1386eQ c1386eQ) {
        return false;
    }

    public abstract void o(ZP zp);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (WP) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (WP) listAdapter).a.q((MenuItem) listAdapter.getItem(i), this, (this instanceof ViewOnKeyListenerC0752Sb) ^ true ? 0 : 4);
    }

    public abstract void q(View view);

    public abstract void r(boolean z);

    public abstract void s(int i);

    public abstract void t(int i);

    public abstract void u(PopupWindow.OnDismissListener onDismissListener);

    public abstract void v(boolean z);

    public abstract void w(int i);

    @Override // o.InterfaceC2651rQ
    public final void j(Context context, ZP zp) {
    }
}
