package o;

import android.content.Context;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class Jl0 implements InterfaceC2651rQ {
    public ZP l;
    public C1386eQ m;
    public final /* synthetic */ Toolbar n;

    public Jl0(Toolbar toolbar) {
        this.n = toolbar;
    }

    @Override // o.InterfaceC2651rQ
    public final void d(boolean z) {
        if (this.m != null) {
            ZP zp = this.l;
            if (zp != null) {
                int size = zp.f.size();
                for (int i = 0; i < size; i++) {
                    if (this.l.getItem(i) == this.m) {
                        return;
                    }
                }
            }
            n(this.m);
        }
    }

    @Override // o.InterfaceC2651rQ
    public final boolean f(C1386eQ c1386eQ) {
        Toolbar toolbar = this.n;
        toolbar.c();
        ViewParent parent = toolbar.s.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.s);
            }
            toolbar.addView(toolbar.s);
        }
        View actionView = c1386eQ.getActionView();
        toolbar.t = actionView;
        this.m = c1386eQ;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.t);
            }
            Kl0 kl0H = Toolbar.h();
            kl0H.a = (toolbar.y & 112) | 8388611;
            kl0H.b = 2;
            toolbar.t.setLayoutParams(kl0H);
            toolbar.addView(toolbar.t);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((Kl0) childAt.getLayoutParams()).b != 2 && childAt != toolbar.l) {
                toolbar.removeViewAt(childCount);
                toolbar.P.add(childAt);
            }
        }
        toolbar.requestLayout();
        c1386eQ.C = true;
        c1386eQ.n.p(false);
        KeyEvent.Callback callback = toolbar.t;
        if (callback instanceof InterfaceC0833Ve) {
            ((C1582gQ) ((InterfaceC0833Ve) callback)).l.onActionViewExpanded();
        }
        toolbar.u();
        return true;
    }

    @Override // o.InterfaceC2651rQ
    public final int i() {
        return 0;
    }

    @Override // o.InterfaceC2651rQ
    public final void j(Context context, ZP zp) {
        C1386eQ c1386eQ;
        ZP zp2 = this.l;
        if (zp2 != null && (c1386eQ = this.m) != null) {
            zp2.d(c1386eQ);
        }
        this.l = zp;
    }

    @Override // o.InterfaceC2651rQ
    public final boolean k() {
        return false;
    }

    @Override // o.InterfaceC2651rQ
    public final Parcelable l() {
        return null;
    }

    @Override // o.InterfaceC2651rQ
    public final boolean m(SubMenuC2483ph0 subMenuC2483ph0) {
        return false;
    }

    @Override // o.InterfaceC2651rQ
    public final boolean n(C1386eQ c1386eQ) {
        Toolbar toolbar = this.n;
        KeyEvent.Callback callback = toolbar.t;
        if (callback instanceof InterfaceC0833Ve) {
            ((C1582gQ) ((InterfaceC0833Ve) callback)).l.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.t);
        toolbar.removeView(toolbar.s);
        toolbar.t = null;
        ArrayList arrayList = toolbar.P;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.m = null;
        toolbar.requestLayout();
        c1386eQ.C = false;
        c1386eQ.n.p(false);
        toolbar.u();
        return true;
    }

    @Override // o.InterfaceC2651rQ
    public final void c(Parcelable parcelable) {
    }

    @Override // o.InterfaceC2651rQ
    public final void a(ZP zp, boolean z) {
    }
}
