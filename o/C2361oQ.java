package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* JADX INFO: renamed from: o.oQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2361oQ extends C0687Po {
    public C1386eQ A;
    public final int x;
    public final int y;
    public InterfaceC1289dQ z;

    public C2361oQ(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.x = 21;
            this.y = 22;
        } else {
            this.x = 22;
            this.y = 21;
        }
    }

    @Override // o.C0687Po, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        WP wp;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.z != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                wp = (WP) headerViewListAdapter.getWrappedAdapter();
            } else {
                wp = (WP) adapter;
                headersCount = 0;
            }
            C1386eQ c1386eQB = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= wp.getCount()) ? null : wp.getItem(i);
            C1386eQ c1386eQ = this.A;
            if (c1386eQ != c1386eQB) {
                ZP zp = wp.a;
                if (c1386eQ != null) {
                    this.z.d(zp, c1386eQ);
                }
                this.A = c1386eQB;
                if (c1386eQB != null) {
                    this.z.g(zp, c1386eQB);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.x) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.y) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (WP) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (WP) adapter).a.c(false);
        return true;
    }

    public void setHoverListener(InterfaceC1289dQ interfaceC1289dQ) {
        this.z = interfaceC1289dQ;
    }

    @Override // o.C0687Po, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
