package o;

import android.content.Context;
import android.view.View;
import com.skidush.clonex.R;

/* JADX INFO: renamed from: o.i1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1744i1 extends C2070lQ {
    public final /* synthetic */ int m = 1;
    public final /* synthetic */ C2424p1 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1744i1(C2424p1 c2424p1, Context context, ZP zp, C2036l1 c2036l1) {
        super(R.attr.actionOverflowMenuStyle, 0, context, c2036l1, zp, true);
        this.n = c2424p1;
        this.g = 8388613;
        C2133m1 c2133m1 = c2424p1.I;
        this.i = c2133m1;
        AbstractC1874jQ abstractC1874jQ = this.j;
        if (abstractC1874jQ != null) {
            abstractC1874jQ.g(c2133m1);
        }
    }

    @Override // o.C2070lQ
    public final void c() {
        switch (this.m) {
            case 0:
                C2424p1 c2424p1 = this.n;
                c2424p1.F = null;
                c2424p1.J = 0;
                super.c();
                break;
            default:
                C2424p1 c2424p2 = this.n;
                ZP zp = c2424p2.n;
                if (zp != null) {
                    zp.c(true);
                }
                c2424p2.E = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1744i1(C2424p1 c2424p1, Context context, SubMenuC2483ph0 subMenuC2483ph0, View view) {
        super(R.attr.actionOverflowMenuStyle, 0, context, view, subMenuC2483ph0, false);
        this.n = c2424p1;
        if (!subMenuC2483ph0.A.f()) {
            View view2 = c2424p1.u;
            this.f = view2 == null ? (View) c2424p1.s : view2;
        }
        C2133m1 c2133m1 = c2424p1.I;
        this.i = c2133m1;
        AbstractC1874jQ abstractC1874jQ = this.j;
        if (abstractC1874jQ != null) {
            abstractC1874jQ.g(c2133m1);
        }
    }
}
