package com.skidush.clonex.fragments.history;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.skidush.clonex.R;
import io.sentry.android.replay.f;
import o.AbstractC0397Ej;
import o.AbstractC1376eG;
import o.AbstractC1459f50;
import o.AbstractC1474fG;
import o.AbstractC1701hf0;
import o.AbstractC2822t60;
import o.AbstractC3021v9;
import o.AbstractComponentCallbacksC1247cx;
import o.C0560Kq;
import o.C1703hg0;
import o.C1736hx;
import o.C2285nf0;
import o.C2830tB;
import o.C3182ws;
import o.C3300y3;
import o.C3376ys;
import o.CJ;
import o.HB;
import o.IB;
import o.IJ;
import o.Sr0;

/* JADX INFO: loaded from: classes.dex */
public final class HistoryMobileFragment extends AbstractComponentCallbacksC1247cx {
    public C1736hx l0;
    public final C3300y3 m0 = new C3300y3();
    public final C0560Kq n0;

    public HistoryMobileFragment() {
        f fVar = new f(9, this);
        CJ cjN = AbstractC1701hf0.n(new C3182ws(0, this), IJ.n);
        this.n0 = new C0560Kq(AbstractC2822t60.a(IB.class), new C3376ys(cjN, 0), fVar, new C3376ys(cjN, 1));
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final View A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC1474fG.j(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.fragment_history_mobile, viewGroup, false);
        int i = R.id.pb_history;
        ProgressBar progressBar = (ProgressBar) Sr0.g(viewInflate, R.id.pb_history);
        if (progressBar != null) {
            i = R.id.rv_history;
            RecyclerView recyclerView = (RecyclerView) Sr0.g(viewInflate, R.id.rv_history);
            if (recyclerView != null) {
                i = R.id.tv_history_status;
                TextView textView = (TextView) Sr0.g(viewInflate, R.id.tv_history_status);
                if (textView != null) {
                    i = R.id.tv_history_title;
                    if (((TextView) Sr0.g(viewInflate, R.id.tv_history_title)) != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        this.l0 = new C1736hx(constraintLayout, progressBar, recyclerView, textView, 1);
                        AbstractC1474fG.i(constraintLayout, "getRoot(...)");
                        return constraintLayout;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final void B() {
        C1736hx c1736hx = this.l0;
        AbstractC1474fG.g(c1736hx);
        RecyclerView recyclerView = c1736hx.f821o;
        AbstractC1474fG.i(recyclerView, "rvHistory");
        this.m0.k(recyclerView);
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
        C1736hx c1736hx = this.l0;
        AbstractC1474fG.g(c1736hx);
        C3300y3 c3300y3 = this.m0;
        c3300y3.j();
        RecyclerView recyclerView = c1736hx.f821o;
        recyclerView.setAdapter(c3300y3);
        recyclerView.g(new C2285nf0(AbstractC0397Ej.k(Q(), 20)));
        AbstractC1376eG.w(AbstractC1459f50.y(q()), null, 0, new C2830tB(this, null), 3);
    }
}
