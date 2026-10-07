package com.skidush.clonex.fragments.tv_show;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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
import o.C0560Kq;
import o.C1583gR;
import o.C1930jx;
import o.C2285nf0;
import o.C2400oo0;
import o.C2497po0;
import o.C2594qo0;
import o.C3182ws;
import o.C3300y3;
import o.C3376ys;
import o.CJ;
import o.IJ;
import o.RN;
import o.Rh0;
import o.Sr0;
import o.Wo0;

/* JADX INFO: loaded from: classes.dex */
public final class TvShowMobileFragment extends AbstractComponentCallbacksC1247cx {
    public C1930jx l0;
    public final RN m0 = new RN(AbstractC2822t60.a(C2594qo0.class), 4, new C3182ws(15, this));
    public final Rh0 n0 = new Rh0(new C2400oo0(this, 0));
    public final C0560Kq o0;
    public final C3300y3 p0;

    public TvShowMobileFragment() {
        C2400oo0 c2400oo0 = new C2400oo0(this, 1);
        CJ cjN = AbstractC1701hf0.n(new C3182ws(0, this), IJ.n);
        this.o0 = new C0560Kq(AbstractC2822t60.a(Wo0.class), new C3376ys(cjN, 0), c2400oo0, new C3376ys(cjN, 1));
        this.p0 = new C3300y3();
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final View A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC1474fG.j(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.fragment_tv_show_mobile, viewGroup, false);
        int i = R.id.is_loading;
        View viewG = Sr0.g(viewInflate, R.id.is_loading);
        if (viewG != null) {
            C1583gR c1583gRG = C1583gR.g(viewG);
            i = R.id.iv_tv_show_banner;
            ImageView imageView = (ImageView) Sr0.g(viewInflate, R.id.iv_tv_show_banner);
            if (imageView != null) {
                i = R.id.rv_tv_show;
                RecyclerView recyclerView = (RecyclerView) Sr0.g(viewInflate, R.id.rv_tv_show);
                if (recyclerView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                    this.l0 = new C1930jx(constraintLayout, c1583gRG, imageView, recyclerView, 2);
                    AbstractC1474fG.i(constraintLayout, "getRoot(...)");
                    return constraintLayout;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final void B() {
        this.Q = true;
        C1930jx c1930jx = this.l0;
        AbstractC1474fG.g(c1930jx);
        RecyclerView recyclerView = c1930jx.p;
        AbstractC1474fG.i(recyclerView, "rvTvShow");
        this.p0.k(recyclerView);
        this.l0 = null;
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final void K(View view, Bundle bundle) {
        AbstractC1474fG.j(view, "view");
        C1930jx c1930jx = this.l0;
        AbstractC1474fG.g(c1930jx);
        C3300y3 c3300y3 = this.p0;
        c3300y3.j();
        RecyclerView recyclerView = c1930jx.p;
        recyclerView.setAdapter(c3300y3);
        recyclerView.g(new C2285nf0(AbstractC0397Ej.k(Q(), 20)));
        AbstractC1376eG.w(AbstractC1459f50.y(q()), null, 0, new C2497po0(this, null), 3);
    }
}
