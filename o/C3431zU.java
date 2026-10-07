package o;

import android.content.Context;
import android.os.Parcelable;
import android.view.MenuItem;
import java.util.ArrayList;

/* JADX INFO: renamed from: o.zU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3431zU implements InterfaceC2651rQ {
    public C3334yU l;
    public boolean m;

    @Override // o.InterfaceC2651rQ
    public final void c(Parcelable parcelable) {
        throw new C1783iV("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC2651rQ
    public final void d(boolean z) {
        if (this.m) {
            return;
        }
        if (z) {
            C3334yU c3334yU = this.l;
            if (c3334yU != null) {
                c3334yU.a();
                return;
            } else {
                AbstractC1474fG.U("menuView");
                throw null;
            }
        }
        C3334yU c3334yU2 = this.l;
        if (c3334yU2 == null) {
            AbstractC1474fG.U("menuView");
            throw null;
        }
        ZP zp = c3334yU2.q;
        if (zp == null) {
            AbstractC1474fG.U("menu");
            throw null;
        }
        int size = zp.f.size();
        ArrayList arrayList = c3334yU2.m;
        if (size != arrayList.size()) {
            c3334yU2.a();
            return;
        }
        ZP zp2 = c3334yU2.q;
        if (zp2 == null) {
            AbstractC1474fG.U("menu");
            throw null;
        }
        int size2 = zp2.f.size();
        for (int i = 0; i < size2; i++) {
            MenuItem item = zp2.getItem(i);
            if (item.isChecked()) {
                c3334yU2.n = item.getItemId();
                c3334yU2.f1134o = i;
            }
        }
        int i2 = 0;
        for (Object obj : arrayList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC0937Ze.N();
                throw null;
            }
            C3140wU c3140wU = (C3140wU) obj;
            c3334yU2.getPresenter().m = true;
            ZP zp3 = c3334yU2.q;
            if (zp3 == null) {
                AbstractC1474fG.U("menu");
                throw null;
            }
            MenuItem item2 = zp3.getItem(i2);
            AbstractC1474fG.h(item2, "null cannot be cast to non-null type androidx.appcompat.view.menu.MenuItemImpl");
            c3140wU.a((C1386eQ) item2);
            c3334yU2.getPresenter().m = false;
            i2 = i3;
        }
        c3334yU2.getNavigationSlideView().a();
    }

    @Override // o.InterfaceC2651rQ
    public final boolean f(C1386eQ c1386eQ) {
        return false;
    }

    @Override // o.InterfaceC2651rQ
    public final int i() {
        return 1;
    }

    @Override // o.InterfaceC2651rQ
    public final void j(Context context, ZP zp) {
        AbstractC1474fG.j(context, "context");
        AbstractC1474fG.j(zp, "menu");
        C3334yU c3334yU = this.l;
        if (c3334yU != null) {
            c3334yU.q = zp;
        } else {
            AbstractC1474fG.U("menuView");
            throw null;
        }
    }

    @Override // o.InterfaceC2651rQ
    public final boolean k() {
        return false;
    }

    @Override // o.InterfaceC2651rQ
    public final Parcelable l() {
        throw new C1783iV("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC2651rQ
    public final boolean m(SubMenuC2483ph0 subMenuC2483ph0) {
        return false;
    }

    @Override // o.InterfaceC2651rQ
    public final boolean n(C1386eQ c1386eQ) {
        return false;
    }

    @Override // o.InterfaceC2651rQ
    public final void a(ZP zp, boolean z) {
    }
}
