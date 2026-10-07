package com.skidush.clonex.fragments.search;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.skidush.clonex.R;
import o.AbstractC0397Ej;
import o.AbstractC1376eG;
import o.AbstractC1459f50;
import o.AbstractC1474fG;
import o.AbstractC1701hf0;
import o.AbstractC2822t60;
import o.AbstractComponentCallbacksC1247cx;
import o.C0560Kq;
import o.C1495fa0;
import o.C1583gR;
import o.C1691ha0;
import o.C1750i4;
import o.C1789ia0;
import o.C1885ja0;
import o.C2183md;
import o.C2285nf0;
import o.C3182ws;
import o.C3300y3;
import o.C3376ys;
import o.CJ;
import o.IJ;
import o.La0;
import o.Rh0;
import o.Sr0;
import o.ViewOnClickListenerC1593ga0;
import o.X50;

/* JADX INFO: loaded from: classes.dex */
public final class SearchMobileFragment extends AbstractComponentCallbacksC1247cx {
    public C1750i4 l0;
    public final Rh0 m0 = new Rh0(new C1691ha0(this, 0));
    public final C0560Kq n0;
    public C3300y3 o0;
    public boolean p0;

    public SearchMobileFragment() {
        C1691ha0 c1691ha0 = new C1691ha0(this, 2);
        CJ cjN = AbstractC1701hf0.n(new C3182ws(0, this), IJ.n);
        this.n0 = new C0560Kq(AbstractC2822t60.a(La0.class), new C3376ys(cjN, 0), c1691ha0, new C3376ys(cjN, 1));
        this.o0 = new C3300y3();
    }

    public static final void W(SearchMobileFragment searchMobileFragment, boolean z) {
        C1750i4 c1750i4 = searchMobileFragment.l0;
        AbstractC1474fG.g(c1750i4);
        C1583gR c1583gR = (C1583gR) c1750i4.p;
        ((ConstraintLayout) c1583gR.m).setVisibility(0);
        ((ProgressBar) c1583gR.p).setVisibility(0);
        ((Group) c1583gR.f793o).setVisibility(8);
        C1750i4 c1750i5 = searchMobileFragment.l0;
        AbstractC1474fG.g(c1750i5);
        ((RecyclerView) c1750i5.q).p0();
        C1750i4 c1750i6 = searchMobileFragment.l0;
        AbstractC1474fG.g(c1750i6);
        C3300y3 c3300y3 = new C3300y3();
        searchMobileFragment.o0 = c3300y3;
        c3300y3.j();
        ((RecyclerView) c1750i6.q).setAdapter(c3300y3);
        searchMobileFragment.p0 = z;
        if (z) {
            C1750i4 c1750i7 = searchMobileFragment.l0;
            AbstractC1474fG.g(c1750i7);
            ((RecyclerView) c1750i7.q).g0(0);
        }
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final View A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC1474fG.j(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.fragment_search_mobile, viewGroup, false);
        int i = R.id.btn_search_clear;
        ImageView imageView = (ImageView) Sr0.g(viewInflate, R.id.btn_search_clear);
        if (imageView != null) {
            i = R.id.cl_search;
            if (((ConstraintLayout) Sr0.g(viewInflate, R.id.cl_search)) != null) {
                i = R.id.et_search;
                EditText editText = (EditText) Sr0.g(viewInflate, R.id.et_search);
                if (editText != null) {
                    i = R.id.ic_search;
                    if (((ImageView) Sr0.g(viewInflate, R.id.ic_search)) != null) {
                        i = R.id.is_loading;
                        View viewG = Sr0.g(viewInflate, R.id.is_loading);
                        if (viewG != null) {
                            C1583gR c1583gRG = C1583gR.g(viewG);
                            i = R.id.rv_search;
                            RecyclerView recyclerView = (RecyclerView) Sr0.g(viewInflate, R.id.rv_search);
                            if (recyclerView != null) {
                                i = R.id.sw_global_search;
                                SwitchMaterial switchMaterial = (SwitchMaterial) Sr0.g(viewInflate, R.id.sw_global_search);
                                if (switchMaterial != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                    this.l0 = new C1750i4(constraintLayout, imageView, editText, c1583gRG, recyclerView, switchMaterial, 2);
                                    AbstractC1474fG.i(constraintLayout, "getRoot(...)");
                                    return constraintLayout;
                                }
                            }
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
        C1750i4 c1750i4 = this.l0;
        AbstractC1474fG.g(c1750i4);
        ((EditText) c1750i4.f824o).setOnEditorActionListener(new C1495fa0(0, this));
        C1750i4 c1750i5 = this.l0;
        AbstractC1474fG.g(c1750i5);
        ((ImageView) c1750i5.n).setOnClickListener(new ViewOnClickListenerC1593ga0(this, 0));
        C1750i4 c1750i6 = this.l0;
        AbstractC1474fG.g(c1750i6);
        ((SwitchMaterial) c1750i6.r).setOnCheckedChangeListener(new C2183md(2, this));
        C1750i4 c1750i7 = this.l0;
        AbstractC1474fG.g(c1750i7);
        C3300y3 c3300y3 = this.o0;
        c3300y3.j();
        RecyclerView recyclerView = (RecyclerView) c1750i7.q;
        recyclerView.setAdapter(c3300y3);
        recyclerView.g(new C2285nf0(AbstractC0397Ej.k(Q(), 10)));
        X50 layoutManager = recyclerView.getLayoutManager();
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager != null) {
            gridLayoutManager.K = new C1789ia0(this);
        }
        AbstractC1376eG.w(AbstractC1459f50.y(q()), null, 0, new C1885ja0(this, null), 3);
    }

    public final La0 X() {
        return (La0) this.n0.getValue();
    }
}
