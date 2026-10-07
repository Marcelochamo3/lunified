package com.skidush.clonex.fragments.season;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.leanback.widget.HorizontalGridView;
import com.skidush.clonex.R;
import o.AbstractC1376eG;
import o.AbstractC1459f50;
import o.AbstractC1474fG;
import o.AbstractC1701hf0;
import o.AbstractC2822t60;
import o.AbstractComponentCallbacksC1247cx;
import o.C0560Kq;
import o.C1302db0;
import o.C2303no0;
import o.C3182ws;
import o.C3300y3;
import o.C3376ys;
import o.CJ;
import o.IJ;
import o.RN;
import o.Rh0;
import o.Sa0;
import o.Sr0;
import o.Ta0;
import o.Ua0;

/* JADX INFO: loaded from: classes.dex */
public final class SeasonTvFragment extends AbstractComponentCallbacksC1247cx {
    public C2303no0 l0;
    public final RN m0 = new RN(AbstractC2822t60.a(Ua0.class), 4, new C3182ws(14, this));
    public final Rh0 n0 = new Rh0(new Sa0(this, 0));
    public final C0560Kq o0;
    public final C3300y3 p0;

    public SeasonTvFragment() {
        Sa0 sa0 = new Sa0(this, 1);
        CJ cjN = AbstractC1701hf0.n(new C3182ws(0, this), IJ.n);
        this.o0 = new C0560Kq(AbstractC2822t60.a(C1302db0.class), new C3376ys(cjN, 0), sa0, new C3376ys(cjN, 1));
        this.p0 = new C3300y3();
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final View A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC1474fG.j(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.fragment_season_tv, viewGroup, false);
        int i = R.id.hgv_episodes;
        HorizontalGridView horizontalGridView = (HorizontalGridView) Sr0.g(viewInflate, R.id.hgv_episodes);
        if (horizontalGridView != null) {
            i = R.id.is_loading;
            View viewG = Sr0.g(viewInflate, R.id.is_loading);
            if (viewG != null) {
                C2303no0 c2303no0A = C2303no0.a(viewG);
                i = R.id.tv_season_title;
                TextView textView = (TextView) Sr0.g(viewInflate, R.id.tv_season_title);
                if (textView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                    this.l0 = new C2303no0(constraintLayout, horizontalGridView, c2303no0A, textView, 7);
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
        C2303no0 c2303no0 = this.l0;
        AbstractC1474fG.g(c2303no0);
        ((TextView) c2303no0.p).setText(W().g);
        C2303no0 c2303no1 = this.l0;
        AbstractC1474fG.g(c2303no1);
        C3300y3 c3300y3 = this.p0;
        c3300y3.j();
        HorizontalGridView horizontalGridView = (HorizontalGridView) c2303no1.n;
        horizontalGridView.setAdapter(c3300y3);
        horizontalGridView.setItemSpacing((int) horizontalGridView.getResources().getDimension(R.dimen.season_episodes_spacing));
        AbstractC1376eG.w(AbstractC1459f50.y(q()), null, 0, new Ta0(this, null), 3);
    }

    public final Ua0 W() {
        return (Ua0) this.m0.getValue();
    }
}
