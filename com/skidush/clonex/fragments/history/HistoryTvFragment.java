package com.skidush.clonex.fragments.history;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.leanback.widget.VerticalGridView;
import com.skidush.clonex.R;
import io.sentry.android.replay.f;
import o.AbstractC1376eG;
import o.AbstractC1459f50;
import o.AbstractC1474fG;
import o.AbstractC1701hf0;
import o.AbstractC2822t60;
import o.AbstractC3021v9;
import o.AbstractComponentCallbacksC1247cx;
import o.C0560Kq;
import o.C1703hg0;
import o.C1832ix;
import o.C3121wB;
import o.C3182ws;
import o.C3300y3;
import o.C3376ys;
import o.CJ;
import o.HB;
import o.IB;
import o.IJ;
import o.Sr0;

/* JADX INFO: loaded from: classes.dex */
public final class HistoryTvFragment extends AbstractComponentCallbacksC1247cx {
    public C1832ix l0;
    public final C3300y3 m0 = new C3300y3();
    public final C0560Kq n0;

    public HistoryTvFragment() {
        f fVar = new f(10, this);
        CJ cjN = AbstractC1701hf0.n(new C3182ws(0, this), IJ.n);
        this.n0 = new C0560Kq(AbstractC2822t60.a(IB.class), new C3376ys(cjN, 0), fVar, new C3376ys(cjN, 1));
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final View A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC1474fG.j(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.fragment_history_tv, viewGroup, false);
        int i = R.id.pb_history;
        ProgressBar progressBar = (ProgressBar) Sr0.g(viewInflate, R.id.pb_history);
        if (progressBar != null) {
            i = R.id.tv_history_status;
            TextView textView = (TextView) Sr0.g(viewInflate, R.id.tv_history_status);
            if (textView != null) {
                i = R.id.vgv_history;
                VerticalGridView verticalGridView = (VerticalGridView) Sr0.g(viewInflate, R.id.vgv_history);
                if (verticalGridView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                    this.l0 = new C1832ix(constraintLayout, progressBar, textView, verticalGridView, 1);
                    AbstractC1474fG.i(constraintLayout, "getRoot(...)");
                    return constraintLayout;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final void B() {
        C1832ix c1832ix = this.l0;
        AbstractC1474fG.g(c1832ix);
        VerticalGridView verticalGridView = c1832ix.p;
        AbstractC1474fG.i(verticalGridView, "vgvHistory");
        this.m0.k(verticalGridView);
        this.l0 = null;
        this.Q = true;
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final void G() {
        this.Q = true;
        IB ib = (IB) this.n0.getValue();
        C1703hg0 c1703hg0 = ib.e;
        if (c1703hg0 != null) {
            c1703hg0.f(null);
        }
        ib.e = AbstractC1376eG.w(AbstractC3021v9.o(ib), null, 0, new HB(ib, null), 3);
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final void K(View view, Bundle bundle) {
        AbstractC1474fG.j(view, "view");
        C1832ix c1832ix = this.l0;
        AbstractC1474fG.g(c1832ix);
        C3300y3 c3300y3 = this.m0;
        c3300y3.j();
        VerticalGridView verticalGridView = c1832ix.p;
        verticalGridView.setAdapter(c3300y3);
        verticalGridView.setItemSpacing(((int) verticalGridView.getResources().getDimension(R.dimen.home_spacing)) * 2);
        AbstractC1376eG.w(AbstractC1459f50.y(q()), null, 0, new C3121wB(this, null), 3);
    }
}
