package com.skidush.clonex.fragments.movie;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.leanback.widget.VerticalGridView;
import com.skidush.clonex.R;
import o.AbstractC1376eG;
import o.AbstractC1459f50;
import o.AbstractC1474fG;
import o.AbstractC1701hf0;
import o.AbstractC2822t60;
import o.AbstractComponentCallbacksC1247cx;
import o.C0560Kq;
import o.C2028kx;
import o.C2303no0;
import o.C2362oR;
import o.C2459pR;
import o.C2556qR;
import o.C3182ws;
import o.C3300y3;
import o.C3376ys;
import o.CJ;
import o.IJ;
import o.MR;
import o.RN;
import o.Rh0;
import o.Sr0;

/* JADX INFO: loaded from: classes.dex */
public final class MovieTvFragment extends AbstractComponentCallbacksC1247cx {
    public C2028kx l0;
    public final RN m0 = new RN(AbstractC2822t60.a(C2556qR.class), 4, new C3182ws(4, this));
    public final Rh0 n0 = new Rh0(new C2362oR(this, 0));
    public final C0560Kq o0;
    public final C3300y3 p0;

    public MovieTvFragment() {
        C2362oR c2362oR = new C2362oR(this, 1);
        CJ cjN = AbstractC1701hf0.n(new C3182ws(0, this), IJ.n);
        this.o0 = new C0560Kq(AbstractC2822t60.a(MR.class), new C3376ys(cjN, 0), c2362oR, new C3376ys(cjN, 1));
        this.p0 = new C3300y3();
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final View A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC1474fG.j(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.fragment_movie_tv, viewGroup, false);
        int i = R.id.is_loading;
        View viewG = Sr0.g(viewInflate, R.id.is_loading);
        if (viewG != null) {
            C2303no0 c2303no0A = C2303no0.a(viewG);
            i = R.id.iv_movie_banner;
            ImageView imageView = (ImageView) Sr0.g(viewInflate, R.id.iv_movie_banner);
            if (imageView != null) {
                i = R.id.vgv_movie;
                VerticalGridView verticalGridView = (VerticalGridView) Sr0.g(viewInflate, R.id.vgv_movie);
                if (verticalGridView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                    this.l0 = new C2028kx(constraintLayout, c2303no0A, imageView, verticalGridView, 1);
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
        C2028kx c2028kx = this.l0;
        AbstractC1474fG.g(c2028kx);
        VerticalGridView verticalGridView = c2028kx.p;
        AbstractC1474fG.i(verticalGridView, "vgvMovie");
        this.p0.k(verticalGridView);
        this.l0 = null;
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final void K(View view, Bundle bundle) {
        AbstractC1474fG.j(view, "view");
        C2028kx c2028kx = this.l0;
        AbstractC1474fG.g(c2028kx);
        C3300y3 c3300y3 = this.p0;
        c3300y3.j();
        VerticalGridView verticalGridView = c2028kx.p;
        verticalGridView.setAdapter(c3300y3);
        verticalGridView.setItemSpacing(80);
        AbstractC1376eG.w(AbstractC1459f50.y(q()), null, 0, new C2459pR(this, null), 3);
    }
}
