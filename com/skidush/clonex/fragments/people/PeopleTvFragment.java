package com.skidush.clonex.fragments.people;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
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
import o.C2272nY;
import o.C2303no0;
import o.C2369oY;
import o.C2466pY;
import o.C3182ws;
import o.C3300y3;
import o.C3376ys;
import o.CJ;
import o.CY;
import o.IJ;
import o.RN;
import o.Rh0;
import o.Sr0;

/* JADX INFO: loaded from: classes.dex */
public final class PeopleTvFragment extends AbstractComponentCallbacksC1247cx {
    public C0560Kq l0;
    public final RN m0 = new RN(AbstractC2822t60.a(C2466pY.class), 4, new C3182ws(8, this));
    public final Rh0 n0 = new Rh0(new C2272nY(this, 0));
    public final C0560Kq o0;
    public final C3300y3 p0;

    public PeopleTvFragment() {
        C2272nY c2272nY = new C2272nY(this, 2);
        CJ cjN = AbstractC1701hf0.n(new C3182ws(0, this), IJ.n);
        this.o0 = new C0560Kq(AbstractC2822t60.a(CY.class), new C3376ys(cjN, 0), c2272nY, new C3376ys(cjN, 1));
        this.p0 = new C3300y3();
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final View A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC1474fG.j(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.fragment_people_tv, viewGroup, false);
        int i = R.id.barrier1;
        if (((Barrier) Sr0.g(viewInflate, R.id.barrier1)) != null) {
            i = R.id.is_loading;
            View viewG = Sr0.g(viewInflate, R.id.is_loading);
            if (viewG != null) {
                C2303no0 c2303no0A = C2303no0.a(viewG);
                i = R.id.iv_people_image;
                ImageView imageView = (ImageView) Sr0.g(viewInflate, R.id.iv_people_image);
                if (imageView != null) {
                    i = R.id.tv_people_name;
                    TextView textView = (TextView) Sr0.g(viewInflate, R.id.tv_people_name);
                    if (textView != null) {
                        i = R.id.vgv_people_filmography;
                        VerticalGridView verticalGridView = (VerticalGridView) Sr0.g(viewInflate, R.id.vgv_people_filmography);
                        if (verticalGridView != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                            this.l0 = new C0560Kq(constraintLayout, c2303no0A, imageView, textView, verticalGridView, 4);
                            AbstractC1474fG.i(constraintLayout, "getRoot(...)");
                            return constraintLayout;
                        }
                    }
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
        C0560Kq c0560Kq = this.l0;
        AbstractC1474fG.g(c0560Kq);
        C3300y3 c3300y3 = this.p0;
        c3300y3.j();
        VerticalGridView verticalGridView = (VerticalGridView) c0560Kq.q;
        verticalGridView.setAdapter(c3300y3);
        verticalGridView.setItemSpacing(20);
        AbstractC1376eG.w(AbstractC1459f50.y(q()), null, 0, new C2369oY(this, null), 3);
    }
}
