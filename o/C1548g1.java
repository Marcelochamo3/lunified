package o;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* JADX INFO: renamed from: o.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1548g1 extends AbstractViewOnTouchListenerC0747Rw {
    public final /* synthetic */ int u = 0;
    public final /* synthetic */ View v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1548g1(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.v = actionMenuItemView;
    }

    @Override // o.AbstractViewOnTouchListenerC0747Rw
    public final Id0 b() {
        C1744i1 c1744i1;
        switch (this.u) {
            case 0:
                AbstractC1646h1 abstractC1646h1 = ((ActionMenuItemView) this.v).x;
                if (abstractC1646h1 == null || (c1744i1 = ((C1840j1) abstractC1646h1).a.F) == null) {
                    return null;
                }
                return c1744i1.a();
            default:
                C1744i1 c1744i2 = ((C2036l1) this.v).f885o.E;
                if (c1744i2 == null) {
                    return null;
                }
                return c1744i2.a();
        }
    }

    @Override // o.AbstractViewOnTouchListenerC0747Rw
    public final boolean c() {
        Id0 id0B;
        switch (this.u) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.v;
                YP yp = actionMenuItemView.v;
                return yp != null && yp.c(actionMenuItemView.s) && (id0B = b()) != null && id0B.b();
            default:
                ((C2036l1) this.v).f885o.o();
                return true;
        }
    }

    @Override // o.AbstractViewOnTouchListenerC0747Rw
    public boolean d() {
        switch (this.u) {
            case 1:
                C2424p1 c2424p1 = ((C2036l1) this.v).f885o;
                if (c2424p1.G != null) {
                    return false;
                }
                c2424p1.e();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1548g1(C2036l1 c2036l1, View view) {
        super(view);
        this.v = c2036l1;
    }
}
