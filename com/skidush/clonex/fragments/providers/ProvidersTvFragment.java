package com.skidush.clonex.fragments.providers;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.skidush.clonex.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import o.AP;
import o.AbstractC0911Ye;
import o.AbstractC1016af;
import o.AbstractC1376eG;
import o.AbstractC1459f50;
import o.AbstractC1474fG;
import o.AbstractC2822t60;
import o.AbstractComponentCallbacksC1247cx;
import o.C0560Kq;
import o.C1067b40;
import o.C1359e40;
import o.C1457f40;
import o.C1722hq;
import o.C1749i30;
import o.C2140m40;
import o.C2285nf0;
import o.C2303no0;
import o.C3182ws;
import o.C3279xs;
import o.C3300y3;
import o.C3376ys;
import o.CJ;
import o.IJ;
import o.OR;
import o.P30;
import o.Q30;
import o.Sr0;

/* JADX INFO: loaded from: classes.dex */
public final class ProvidersTvFragment extends AbstractComponentCallbacksC1247cx {
    public C2303no0 l0;
    public final C0560Kq m0;
    public final C3300y3 n0;
    public Set o0;

    public ProvidersTvFragment() {
        CJ cjM = AP.m(IJ.n, new C3279xs(new C3182ws(12, this), 5));
        this.m0 = new C0560Kq(AbstractC2822t60.a(C2140m40.class), new C3376ys(cjM, 8), new OR(this, cjM, 3), new C3376ys(cjM, 9));
        this.n0 = new C3300y3();
        this.o0 = C1722hq.l;
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final View A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC1474fG.j(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.fragment_providers_tv, viewGroup, false);
        int i = R.id.is_loading;
        View viewG = Sr0.g(viewInflate, R.id.is_loading);
        if (viewG != null) {
            C2303no0 c2303no0A = C2303no0.a(viewG);
            i = R.id.rv_providers;
            RecyclerView recyclerView = (RecyclerView) Sr0.g(viewInflate, R.id.rv_providers);
            if (recyclerView != null) {
                i = R.id.s_providers_language;
                Spinner spinner = (Spinner) Sr0.g(viewInflate, R.id.s_providers_language);
                if (spinner != null) {
                    i = R.id.tv_providers_label;
                    if (((TextView) Sr0.g(viewInflate, R.id.tv_providers_label)) != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        this.l0 = new C2303no0(constraintLayout, c2303no0A, recyclerView, spinner, 6);
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
        this.Q = true;
        this.l0 = null;
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final void G() {
        this.Q = true;
        Q30.a.getClass();
        ArrayList arrayListA = P30.a();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = arrayListA.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((Q30) it.next()).getName());
        }
        if (this.l0 == null || AbstractC1474fG.b(linkedHashSet, this.o0)) {
            return;
        }
        X();
        W().e(null);
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final void K(View view, Bundle bundle) {
        AbstractC1474fG.j(view, "view");
        X();
        C2303no0 c2303no0 = this.l0;
        AbstractC1474fG.g(c2303no0);
        Q();
        GridLayoutManager gridLayoutManager = new GridLayoutManager();
        RecyclerView recyclerView = (RecyclerView) c2303no0.f941o;
        recyclerView.setLayoutManager(gridLayoutManager);
        C3300y3 c3300y3 = this.n0;
        c3300y3.j();
        recyclerView.setAdapter(c3300y3);
        recyclerView.g(new C2285nf0((int) Q().getResources().getDimension(R.dimen.providers_spacing)));
        recyclerView.setFocusable(true);
        recyclerView.setFocusableInTouchMode(false);
        recyclerView.setDescendantFocusability(262144);
        AbstractC1376eG.w(AbstractC1459f50.y(q()), null, 0, new C1457f40(this, null), 3);
    }

    public final C2140m40 W() {
        return (C2140m40) this.m0.getValue();
    }

    public final void X() {
        Q30.a.getClass();
        ArrayList arrayListA = P30.a();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = arrayListA.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((Q30) it.next()).getName());
        }
        this.o0 = linkedHashSet;
        C2303no0 c2303no0 = this.l0;
        AbstractC1474fG.g(c2303no0);
        Q30.a.getClass();
        ArrayList arrayListA2 = P30.a();
        HashSet hashSet = new HashSet();
        ArrayList<Q30> arrayList = new ArrayList();
        for (Object obj : arrayListA2) {
            if (hashSet.add(((Q30) obj).m())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC1016af.O(arrayList, 10));
        for (Q30 q30 : arrayList) {
            Locale locale = new Locale(q30.m());
            String strM = q30.m();
            String displayLanguage = locale.getDisplayLanguage(locale);
            AbstractC1474fG.i(displayLanguage, "getDisplayLanguage(...)");
            arrayList2.add(new C1359e40(strM, displayLanguage));
        }
        List listR0 = AbstractC0911Ye.r0(arrayList2, new C1749i30(2));
        Spinner spinner = (Spinner) c2303no0.p;
        spinner.setFocusable(true);
        spinner.setFocusableInTouchMode(false);
        spinner.setOnItemSelectedListener(new C1067b40(this, listR0, 1));
        Context contextQ = Q();
        ArrayList arrayList3 = new ArrayList(AbstractC1016af.O(listR0, 10));
        Iterator it2 = listR0.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((C1359e40) it2.next()).b);
        }
        ArrayList arrayListY0 = AbstractC0911Ye.y0(arrayList3);
        String string = spinner.getContext().getString(R.string.providers_all_languages);
        AbstractC1474fG.i(string, "getString(...)");
        arrayListY0.add(0, string);
        ArrayAdapter arrayAdapter = new ArrayAdapter(contextQ, android.R.layout.simple_spinner_item, arrayListY0.toArray(new String[0]));
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter((SpinnerAdapter) arrayAdapter);
    }
}
