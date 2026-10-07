package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: o.ph0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class SubMenuC2483ph0 extends ZP implements SubMenu {
    public final C1386eQ A;
    public final ZP z;

    public SubMenuC2483ph0(Context context, ZP zp, C1386eQ c1386eQ) {
        super(context);
        this.z = zp;
        this.A = c1386eQ;
    }

    @Override // o.ZP
    public final boolean d(C1386eQ c1386eQ) {
        return this.z.d(c1386eQ);
    }

    @Override // o.ZP
    public final boolean e(ZP zp, MenuItem menuItem) {
        return super.e(zp, menuItem) || this.z.e(zp, menuItem);
    }

    @Override // o.ZP
    public final boolean f(C1386eQ c1386eQ) {
        return this.z.f(c1386eQ);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // o.ZP
    public final String j() {
        C1386eQ c1386eQ = this.A;
        int i = c1386eQ != null ? c1386eQ.a : 0;
        if (i == 0) {
            return null;
        }
        return AbstractC1674hK.n(i, "android:menu:actionviewstates:");
    }

    @Override // o.ZP
    public final ZP k() {
        return this.z.k();
    }

    @Override // o.ZP
    public final boolean m() {
        return this.z.m();
    }

    @Override // o.ZP
    public final boolean n() {
        return this.z.n();
    }

    @Override // o.ZP
    public final boolean o() {
        return this.z.o();
    }

    @Override // o.ZP, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.z.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // o.ZP, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.z.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        u(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        u(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.A.setIcon(i);
        return this;
    }
}
