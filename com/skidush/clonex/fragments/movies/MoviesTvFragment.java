package com.skidush.clonex.fragments.movies;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.leanback.widget.VerticalGridView;
import com.skidush.clonex.R;
import o.AbstractC1376eG;
import o.AbstractC1459f50;
import o.AbstractC1474fG;
import o.AbstractC1701hf0;
import o.AbstractC2822t60;
import o.AbstractComponentCallbacksC1247cx;
import o.C0359Cx;
import o.C0560Kq;
import o.C1486fS;
import o.C1584gS;
import o.C2303no0;
import o.C2557qS;
import o.C3182ws;
import o.C3300y3;
import o.C3376ys;
import o.CJ;
import o.IJ;
import o.Rh0;
import o.Sr0;

/* JADX INFO: loaded from: classes.dex */
public final class MoviesTvFragment extends AbstractComponentCallbacksC1247cx {
    public C0359Cx l0;
    public final Rh0 m0 = new Rh0(new C1486fS(this, 0));
    public final C0560Kq n0;
    public final C3300y3 o0;

    public MoviesTvFragment() {
        C1486fS c1486fS = new C1486fS(this, 2);
        CJ cjN = AbstractC1701hf0.n(new C3182ws(0, this), IJ.n);
        this.n0 = new C0560Kq(AbstractC2822t60.a(C2557qS.class), new C3376ys(cjN, 0), c1486fS, new C3376ys(cjN, 1));
        this.o0 = new C3300y3();
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final View A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC1474fG.j(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.fragment_movies_tv, viewGroup, false);
        int i = R.id.is_loading;
        View viewG = Sr0.g(viewInflate, R.id.is_loading);
        if (viewG != null) {
            C2303no0 c2303no0A = C2303no0.a(viewG);
            VerticalGridView verticalGridView = (VerticalGridView) Sr0.g(viewInflate, R.id.vgv_movies);
            if (verticalGridView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                this.l0 = new C0359Cx(constraintLayout, c2303no0A, verticalGridView, 0);
                AbstractC1474fG.i(constraintLayout, "getRoot(...)");
                return constraintLayout;
            }
            i = R.id.vgv_movies;
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
        C0359Cx c0359Cx = this.l0;
        AbstractC1474fG.g(c0359Cx);
        C3300y3 c3300y3 = this.o0;
        c3300y3.j();
        VerticalGridView verticalGridView = c0359Cx.f208o;
        verticalGridView.setAdapter(c3300y3);
        verticalGridView.setItemSpacing((int) Q().getResources().getDimension(R.dimen.movies_spacing));
        verticalGridView.setItemViewCacheSize(20);
        C0359Cx c0359Cx2 = this.l0;
        AbstractC1474fG.g(c0359Cx2);
        c0359Cx2.m.requestFocus();
        AbstractC1376eG.w(AbstractC1459f50.y(q()), null, 0, new C1584gS(this, null), 3);
    }
}
