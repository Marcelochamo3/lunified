package com.skidush.clonex.fragments.search;

import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.leanback.widget.HorizontalGridView;
import androidx.leanback.widget.SearchEditText;
import androidx.leanback.widget.VerticalGridView;
import androidx.recyclerview.widget.RecyclerView;
import com.skidush.clonex.R;
import java.util.List;
import o.AbstractC0911Ye;
import o.AbstractC1376eG;
import o.AbstractC1459f50;
import o.AbstractC1474fG;
import o.AbstractC1701hf0;
import o.AbstractC2144m60;
import o.AbstractC2822t60;
import o.AbstractComponentCallbacksC1247cx;
import o.C0560Kq;
import o.C0864Wj;
import o.C0882Xb;
import o.C1495fa0;
import o.C1498fc;
import o.C1634gv;
import o.C1732hv;
import o.C2278nc;
import o.C2303no0;
import o.C2662ra0;
import o.C2759sa0;
import o.C3182ws;
import o.C3300y3;
import o.C3376ys;
import o.CJ;
import o.IJ;
import o.La0;
import o.Rb0;
import o.Rh0;
import o.Sr0;
import o.Tl0;
import o.U9;
import o.Vb0;
import o.ViewOnClickListenerC2566qa0;
import o.ViewOnKeyListenerC3075vn;
import o.X10;
import o.XF;
import o.YF;

/* JADX INFO: loaded from: classes.dex */
public final class SearchTvFragment extends AbstractComponentCallbacksC1247cx {
    public Tl0 l0;
    public final Rh0 m0 = new Rh0(new C2662ra0(this, 0));
    public final C0560Kq n0;
    public C3300y3 o0;
    public boolean p0;
    public boolean q0;
    public boolean r0;

    public SearchTvFragment() {
        C2662ra0 c2662ra0 = new C2662ra0(this, 2);
        CJ cjN = AbstractC1701hf0.n(new C3182ws(0, this), IJ.n);
        this.n0 = new C0560Kq(AbstractC2822t60.a(La0.class), new C3376ys(cjN, 0), c2662ra0, new C3376ys(cjN, 1));
        this.o0 = new C3300y3();
        this.p0 = true;
    }

    public static final void W(SearchTvFragment searchTvFragment, boolean z) {
        Tl0 tl0 = searchTvFragment.l0;
        AbstractC1474fG.g(tl0);
        C2303no0 c2303no0 = (C2303no0) tl0.f542o;
        ((ConstraintLayout) c2303no0.m).setVisibility(0);
        ((ProgressBar) c2303no0.p).setVisibility(0);
        ((Group) c2303no0.f941o).setVisibility(8);
        Tl0 tl1 = searchTvFragment.l0;
        AbstractC1474fG.g(tl1);
        ((VerticalGridView) tl1.r).p0();
        Tl0 tl2 = searchTvFragment.l0;
        AbstractC1474fG.g(tl2);
        C3300y3 c3300y3 = new C3300y3();
        searchTvFragment.o0 = c3300y3;
        c3300y3.j();
        ((VerticalGridView) tl2.r).setAdapter(c3300y3);
        searchTvFragment.q0 = z;
        searchTvFragment.r0 = z;
        if (z) {
            Tl0 tl3 = searchTvFragment.l0;
            AbstractC1474fG.g(tl3);
            ((VerticalGridView) tl3.r).g0(0);
        }
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final View A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC1474fG.j(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.fragment_search_tv, viewGroup, false);
        int i = R.id.btn_search_clear;
        ImageView imageView = (ImageView) Sr0.g(viewInflate, R.id.btn_search_clear);
        if (imageView != null) {
            i = R.id.cl_search;
            if (((ConstraintLayout) Sr0.g(viewInflate, R.id.cl_search)) != null) {
                i = R.id.et_search;
                SearchEditText searchEditText = (SearchEditText) Sr0.g(viewInflate, R.id.et_search);
                if (searchEditText != null) {
                    i = R.id.is_loading;
                    View viewG = Sr0.g(viewInflate, R.id.is_loading);
                    if (viewG != null) {
                        C2303no0 c2303no0A = C2303no0.a(viewG);
                        i = R.id.iv_global_search_switch;
                        ImageView imageView2 = (ImageView) Sr0.g(viewInflate, R.id.iv_global_search_switch);
                        if (imageView2 != null) {
                            i = R.id.ll_global_search;
                            LinearLayout linearLayout = (LinearLayout) Sr0.g(viewInflate, R.id.ll_global_search);
                            if (linearLayout != null) {
                                i = R.id.vgv_search;
                                VerticalGridView verticalGridView = (VerticalGridView) Sr0.g(viewInflate, R.id.vgv_search);
                                if (verticalGridView != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                    this.l0 = new Tl0(constraintLayout, imageView, searchEditText, c2303no0A, imageView2, linearLayout, verticalGridView);
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
        Tl0 tl0 = this.l0;
        AbstractC1474fG.g(tl0);
        ((ImageView) tl0.p).setImageResource(this.p0 ? R.drawable.ic_switch_on : R.drawable.ic_switch_off);
        Tl0 tl1 = this.l0;
        AbstractC1474fG.g(tl1);
        ((LinearLayout) tl1.q).setOnClickListener(new ViewOnClickListenerC2566qa0(this, 0));
        Tl0 tl2 = this.l0;
        AbstractC1474fG.g(tl2);
        ((VerticalGridView) tl2.r).setOnKeyInterceptListener(new C2278nc(23, this));
        Tl0 tl3 = this.l0;
        AbstractC1474fG.g(tl3);
        ((LinearLayout) tl3.q).setOnKeyListener(new ViewOnKeyListenerC3075vn(2, this));
        Tl0 tl4 = this.l0;
        AbstractC1474fG.g(tl4);
        ((SearchEditText) tl4.n).setOnEditorActionListener(new C1495fa0(1, this));
        Tl0 tl5 = this.l0;
        AbstractC1474fG.g(tl5);
        ((ImageView) tl5.m).setOnClickListener(new ViewOnClickListenerC2566qa0(this, 1));
        Tl0 tl6 = this.l0;
        AbstractC1474fG.g(tl6);
        C3300y3 c3300y3 = this.o0;
        c3300y3.j();
        VerticalGridView verticalGridView = (VerticalGridView) tl6.r;
        verticalGridView.setAdapter(c3300y3);
        verticalGridView.setItemSpacing((int) Q().getResources().getDimension(R.dimen.search_spacing));
        Tl0 tl7 = this.l0;
        AbstractC1474fG.g(tl7);
        verticalGridView.setNextFocusUpId(((LinearLayout) tl7.q).getId());
        Tl0 tl8 = this.l0;
        AbstractC1474fG.g(tl8);
        ((ConstraintLayout) tl8.l).requestFocus();
        AbstractC1376eG.w(AbstractC1459f50.y(q()), null, 0, new C2759sa0(this, null), 3);
    }

    public final La0 X() {
        return (La0) this.n0.getValue();
    }

    public final boolean Y(int i) {
        List list;
        Object objE0 = AbstractC0911Ye.e0(i, this.o0.d);
        C0882Xb c0882Xb = objE0 instanceof C0882Xb ? (C0882Xb) objE0 : null;
        return (c0882Xb == null || (list = c0882Xb.b) == null || !(list.isEmpty() ^ true)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:8:0x002e  */
    public final void Z(int i) {
        AbstractC2144m60 abstractC2144m60K;
        Object next;
        Integer numValueOf;
        Object next2;
        View viewC;
        int i2 = 2;
        Tl0 tl0 = this.l0;
        AbstractC1474fG.g(tl0);
        View viewFindFocus = ((VerticalGridView) tl0.r).findFocus();
        Integer num = null;
        Object obj = null;
        if (viewFindFocus != null) {
            Tl0 tl1 = this.l0;
            AbstractC1474fG.g(tl1);
            VerticalGridView verticalGridView = (VerticalGridView) tl1.r;
            AbstractC1474fG.i(verticalGridView, "vgvSearch");
            View viewC2 = verticalGridView.C(viewFindFocus);
            if (viewC2 == null) {
                abstractC2144m60K = null;
            } else {
                abstractC2144m60K = verticalGridView.K(viewC2);
            }
        } else {
            abstractC2144m60K = null;
        }
        Integer numValueOf2 = abstractC2144m60K != null ? Integer.valueOf(abstractC2144m60K.d()) : null;
        Integer numValueOf3 = abstractC2144m60K != null ? Integer.valueOf(abstractC2144m60K.c()) : null;
        Integer numValueOf4 = abstractC2144m60K != null ? Integer.valueOf(abstractC2144m60K.e()) : null;
        Tl0 tl2 = this.l0;
        AbstractC1474fG.g(tl2);
        Rb0 rb0O = Vb0.O(numValueOf2, numValueOf3, numValueOf4, Integer.valueOf(((VerticalGridView) tl2.r).getSelectedPosition()));
        X10 x10 = X10.w;
        C1634gv c1634gv = new C1634gv(new C1732hv(rb0O, false, x10));
        while (true) {
            if (!c1634gv.hasNext()) {
                next = null;
                break;
            }
            next = c1634gv.next();
            int iIntValue = ((Number) next).intValue();
            if (iIntValue >= 0 && iIntValue < this.o0.d.size()) {
                break;
            }
        }
        Integer num2 = (Integer) next;
        C1498fc c1498fc = abstractC2144m60K instanceof C1498fc ? (C1498fc) abstractC2144m60K : null;
        RecyclerView recyclerViewV = c1498fc != null ? c1498fc.v() : null;
        HorizontalGridView horizontalGridView = recyclerViewV instanceof HorizontalGridView ? (HorizontalGridView) recyclerViewV : null;
        if (viewFindFocus == null) {
            numValueOf = null;
        } else {
            AbstractC2144m60 abstractC2144m60K2 = (horizontalGridView == null || (viewC = horizontalGridView.C(viewFindFocus)) == null) ? null : horizontalGridView.K(viewC);
            if (abstractC2144m60K2 != null) {
                numValueOf = Integer.valueOf(abstractC2144m60K2.d());
            } else {
                numValueOf = null;
            }
        }
        C1634gv c1634gv2 = new C1634gv(new C1732hv(Vb0.O(numValueOf, horizontalGridView != null ? Integer.valueOf(horizontalGridView.getSelectedPosition()) : null, 0), false, x10));
        do {
            if (!c1634gv2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = c1634gv2.next();
        } while (((Number) next2).intValue() < 0);
        Integer num3 = (Integer) next2;
        int iIntValue2 = num3 != null ? num3.intValue() : 0;
        if (num2 != null) {
            int iIntValue3 = num2.intValue();
            YF it = (i < 0 ? new XF(iIntValue3 - 1, 0, -1) : U9.L(iIntValue3 + 1, this.o0.d.size())).iterator();
            while (it.n) {
                Object next3 = it.next();
                if (Y(((Number) next3).intValue())) {
                    obj = next3;
                    break;
                }
            }
            num = (Integer) obj;
        }
        if (num != null) {
            int iIntValue4 = num.intValue();
            Tl0 tl3 = this.l0;
            AbstractC1474fG.g(tl3);
            ((VerticalGridView) tl3.r).p0();
            Tl0 tl4 = this.l0;
            AbstractC1474fG.g(tl4);
            ((VerticalGridView) tl4.r).r0(iIntValue4, new C0864Wj(iIntValue2, i2));
            return;
        }
        if (i > 0) {
            return;
        }
        Tl0 tl5 = this.l0;
        AbstractC1474fG.g(tl5);
        ((VerticalGridView) tl5.r).p0();
        Tl0 tl6 = this.l0;
        AbstractC1474fG.g(tl6);
        if (((LinearLayout) tl6.q).requestFocus()) {
            return;
        }
        Tl0 tl7 = this.l0;
        AbstractC1474fG.g(tl7);
        ((SearchEditText) tl7.n).requestFocus();
        Tl0 tl8 = this.l0;
        AbstractC1474fG.g(tl8);
        Tl0 tl9 = this.l0;
        AbstractC1474fG.g(tl9);
        Editable text = ((SearchEditText) tl9.n).getText();
        ((SearchEditText) tl8.n).setSelection(text != null ? text.length() : 0);
    }
}
