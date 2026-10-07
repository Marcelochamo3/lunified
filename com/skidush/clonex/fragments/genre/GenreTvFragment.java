package com.skidush.clonex.fragments.genre;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
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
import o.C0594Lz;
import o.C1583gR;
import o.C2303no0;
import o.C3001uz;
import o.C3098vz;
import o.C3182ws;
import o.C3195wz;
import o.C3300y3;
import o.C3376ys;
import o.CJ;
import o.IJ;
import o.RN;
import o.Rh0;
import o.Sr0;

/* JADX INFO: loaded from: classes.dex */
public final class GenreTvFragment extends AbstractComponentCallbacksC1247cx {
    public C1583gR l0;
    public final RN m0 = new RN(AbstractC2822t60.a(C3195wz.class), 4, new C3182ws(2, this));
    public final Rh0 n0 = new Rh0(new C3001uz(this, 0));
    public final C0560Kq o0;
    public final C3300y3 p0;

    public GenreTvFragment() {
        C3001uz c3001uz = new C3001uz(this, 2);
        CJ cjN = AbstractC1701hf0.n(new C3182ws(0, this), IJ.n);
        this.o0 = new C0560Kq(AbstractC2822t60.a(C0594Lz.class), new C3376ys(cjN, 0), c3001uz, new C3376ys(cjN, 1));
        this.p0 = new C3300y3();
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final View A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC1474fG.j(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.fragment_genre_tv, viewGroup, false);
        int i = R.id.is_loading;
        View viewG = Sr0.g(viewInflate, R.id.is_loading);
        if (viewG != null) {
            C2303no0 c2303no0A = C2303no0.a(viewG);
            i = R.id.tv_genre_name;
            TextView textView = (TextView) Sr0.g(viewInflate, R.id.tv_genre_name);
            if (textView != null) {
                i = R.id.vgv_genre;
                VerticalGridView verticalGridView = (VerticalGridView) Sr0.g(viewInflate, R.id.vgv_genre);
                if (verticalGridView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                    this.l0 = new C1583gR(constraintLayout, c2303no0A, textView, verticalGridView, 5);
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
        ((TextView) c1583gR.f793o).setText(o(R.string.genre_header_name, ((C3195wz) this.m0.getValue()).b));
        C1583gR c1583gR2 = this.l0;
        AbstractC1474fG.g(c1583gR2);
        C3300y3 c3300y3 = this.p0;
        c3300y3.j();
        VerticalGridView verticalGridView = (VerticalGridView) c1583gR2.p;
        verticalGridView.setAdapter(c3300y3);
        verticalGridView.setItemSpacing((int) Q().getResources().getDimension(R.dimen.genre_spacing));
        AbstractC1376eG.w(AbstractC1459f50.y(q()), null, 0, new C3098vz(this, null), 3);
    }
}
