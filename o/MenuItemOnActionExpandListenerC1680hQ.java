package o;

import android.view.MenuItem;

/* JADX INFO: renamed from: o.hQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemOnActionExpandListenerC1680hQ implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener a;
    public final /* synthetic */ MenuItemC1778iQ b;

    public MenuItemOnActionExpandListenerC1680hQ(MenuItemC1778iQ menuItemC1778iQ, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.b = menuItemC1778iQ;
        this.a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.a.onMenuItemActionCollapse(this.b.f(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.a.onMenuItemActionExpand(this.b.f(menuItem));
    }
}
