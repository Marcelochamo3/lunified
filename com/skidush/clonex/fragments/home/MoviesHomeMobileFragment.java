package com.skidush.clonex.fragments.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import o.AP;
import o.AbstractC0397Ej;
import o.AbstractC1376eG;
import o.AbstractC1459f50;
import o.AbstractC1474fG;
import o.AbstractC2822t60;
import o.AbstractComponentCallbacksC1247cx;
import o.C0560Kq;
import o.C1096bS;
import o.C1816io0;
import o.C1930jx;
import o.C2285nf0;
import o.C3182ws;
import o.C3279xs;
import o.C3300y3;
import o.C3376ys;
import o.CJ;
import o.Cr0;
import o.IJ;
import o.NR;
import o.OR;
import o.P30;
import o.Q30;
import o.QW;

/* JADX INFO: loaded from: classes.dex */
public final class MoviesHomeMobileFragment extends AbstractComponentCallbacksC1247cx {
    public C1930jx l0;
    public final C0560Kq m0;
    public final C3300y3 n0;

    public MoviesHomeMobileFragment() {
        CJ cjM = AP.m(IJ.n, new C3279xs(new C3182ws(5, this), 2));
        this.m0 = new C0560Kq(AbstractC2822t60.a(C1096bS.class), new C3376ys(cjM, 2), new OR(this, cjM, 0), new C3376ys(cjM, 3));
        this.n0 = new C3300y3();
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final View A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC1474fG.j(layoutInflater, "inflater");
        C1930jx c1930jxA = C1930jx.a(layoutInflater, viewGroup);
        this.l0 = c1930jxA;
        ConstraintLayout constraintLayout = c1930jxA.m;
        AbstractC1474fG.i(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final void B() {
        this.Q = true;
        C1930jx c1930jx = this.l0;
        AbstractC1474fG.g(c1930jx);
        RecyclerView recyclerView = c1930jx.p;
        AbstractC1474fG.i(recyclerView, "rvHome");
        this.n0.k(recyclerView);
        this.l0 = null;
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final void K(View view, Bundle bundle) {
        Object next;
        Q30 q30;
        AbstractC1474fG.j(view, "view");
        String strB = Cr0.m.b();
        if (AbstractC1474fG.b(strB, "PPV.TO")) {
            q30 = QW.b;
        } else {
            Q30.a.getClass();
            Iterator it = P30.b.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AbstractC1474fG.b(((Q30) next).getName(), strB));
            Q30 q31 = (Q30) next;
            q30 = q31 == null ? C1816io0.b : q31;
        }
        C1816io0 c1816io0 = C1816io0.b;
        if (q30 == c1816io0) {
            c1816io0.B(Q());
        }
        C1930jx c1930jx = this.l0;
        AbstractC1474fG.g(c1930jx);
        c1930jx.f858o.setVisibility(8);
        C1930jx c1930jx2 = this.l0;
        AbstractC1474fG.g(c1930jx2);
        C3300y3 c3300y3 = this.n0;
        c3300y3.j();
        RecyclerView recyclerView = c1930jx2.p;
        recyclerView.setAdapter(c3300y3);
        recyclerView.g(new C2285nf0(AbstractC0397Ej.k(Q(), 20)));
        AbstractC1376eG.w(AbstractC1459f50.y(q()), null, 0, new NR(this, null), 3);
    }
}
