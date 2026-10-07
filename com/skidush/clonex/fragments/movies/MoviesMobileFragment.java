package com.skidush.clonex.fragments.movies;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.skidush.clonex.R;
import o.AbstractC0397Ej;
import o.AbstractC1376eG;
import o.AbstractC1459f50;
import o.AbstractC1474fG;
import o.AbstractC1701hf0;
import o.AbstractC2822t60;
import o.AbstractComponentCallbacksC1247cx;
import o.C0333Bx;
import o.C0560Kq;
import o.C1193cS;
import o.C1291dS;
import o.C1583gR;
import o.C2285nf0;
import o.C2557qS;
import o.C3182ws;
import o.C3300y3;
import o.C3376ys;
import o.CJ;
import o.IJ;
import o.Rh0;
import o.Sr0;

/* JADX INFO: loaded from: classes.dex */
public final class MoviesMobileFragment extends AbstractComponentCallbacksC1247cx {
    public C0333Bx l0;
    public final Rh0 m0 = new Rh0(new C1193cS(this, 0));
    public final C0560Kq n0;
    public final C3300y3 o0;

    public MoviesMobileFragment() {
        C1193cS c1193cS = new C1193cS(this, 2);
        CJ cjN = AbstractC1701hf0.n(new C3182ws(0, this), IJ.n);
        this.n0 = new C0560Kq(AbstractC2822t60.a(C2557qS.class), new C3376ys(cjN, 0), c1193cS, new C3376ys(cjN, 1));
        this.o0 = new C3300y3();
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final View A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC1474fG.j(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.fragment_movies_mobile, viewGroup, false);
        int i = R.id.is_loading;
        View viewG = Sr0.g(viewInflate, R.id.is_loading);
        if (viewG != null) {
            C1583gR c1583gRG = C1583gR.g(viewG);
            RecyclerView recyclerView = (RecyclerView) Sr0.g(viewInflate, R.id.rv_movies);
            if (recyclerView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                this.l0 = new C0333Bx(constraintLayout, c1583gRG, recyclerView, 0);
                AbstractC1474fG.i(constraintLayout, "getRoot(...)");
                return constraintLayout;
            }
            i = R.id.rv_movies;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final void B() {
        this.Q = true;
        this.l0 = null;
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final void K(View view, Bundle bundle) {
        AbstractC1474fG.j(view, "view");
        C0333Bx c0333Bx = this.l0;
        AbstractC1474fG.g(c0333Bx);
        C3300y3 c3300y3 = this.o0;
        c3300y3.j();
        RecyclerView recyclerView = c0333Bx.f192o;
        recyclerView.setAdapter(c3300y3);
        recyclerView.g(new C2285nf0(AbstractC0397Ej.k(Q(), 10)));
        AbstractC1376eG.w(AbstractC1459f50.y(q()), null, 0, new C1291dS(this, null), 3);
    }
}
