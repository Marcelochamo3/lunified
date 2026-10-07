package com.skidush.clonex.fragments.season;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
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
import o.C1302db0;
import o.C1583gR;
import o.C2285nf0;
import o.C3182ws;
import o.C3300y3;
import o.C3376ys;
import o.CJ;
import o.IJ;
import o.Oa0;
import o.Pa0;
import o.Qa0;
import o.RN;
import o.Rh0;
import o.Sr0;

/* JADX INFO: loaded from: classes.dex */
public final class SeasonMobileFragment extends AbstractComponentCallbacksC1247cx {
    public C1583gR l0;
    public final RN m0 = new RN(AbstractC2822t60.a(Qa0.class), 4, new C3182ws(13, this));
    public final Rh0 n0 = new Rh0(new Oa0(this, 0));
    public final C0560Kq o0;
    public final C3300y3 p0;

    public SeasonMobileFragment() {
        Oa0 oa0 = new Oa0(this, 1);
        CJ cjN = AbstractC1701hf0.n(new C3182ws(0, this), IJ.n);
        this.o0 = new C0560Kq(AbstractC2822t60.a(C1302db0.class), new C3376ys(cjN, 0), oa0, new C3376ys(cjN, 1));
        this.p0 = new C3300y3();
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final View A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC1474fG.j(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.fragment_season_mobile, viewGroup, false);
        int i = R.id.is_loading;
        View viewG = Sr0.g(viewInflate, R.id.is_loading);
        if (viewG != null) {
            C1583gR c1583gRG = C1583gR.g(viewG);
            i = R.id.rv_episodes;
            RecyclerView recyclerView = (RecyclerView) Sr0.g(viewInflate, R.id.rv_episodes);
            if (recyclerView != null) {
                i = R.id.tv_season_title;
                TextView textView = (TextView) Sr0.g(viewInflate, R.id.tv_season_title);
                if (textView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                    this.l0 = new C1583gR(constraintLayout, c1583gRG, recyclerView, textView, 7);
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
        this.l0 = null;
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final void K(View view, Bundle bundle) {
        AbstractC1474fG.j(view, "view");
        C1583gR c1583gR = this.l0;
        AbstractC1474fG.g(c1583gR);
        ((TextView) c1583gR.p).setText(W().g);
        C1583gR c1583gR2 = this.l0;
        AbstractC1474fG.g(c1583gR2);
        C3300y3 c3300y3 = this.p0;
        c3300y3.j();
        RecyclerView recyclerView = (RecyclerView) c1583gR2.f793o;
        recyclerView.setAdapter(c3300y3);
        recyclerView.g(new C2285nf0(AbstractC0397Ej.k(Q(), 20)));
        AbstractC1376eG.w(AbstractC1459f50.y(q()), null, 0, new Pa0(this, null), 3);
    }

    public final Qa0 W() {
        return (Qa0) this.m0.getValue();
    }
}
