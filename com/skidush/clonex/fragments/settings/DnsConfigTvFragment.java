package com.skidush.clonex.fragments.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.skidush.clonex.R;
import io.sentry.android.replay.v;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import o.AbstractC1474fG;
import o.AbstractComponentCallbacksC1247cx;
import o.C0323Bn;
import o.C3269xn;
import o.Jj0;
import o.ViewOnKeyListenerC3075vn;

/* JADX INFO: loaded from: classes.dex */
public final class DnsConfigTvFragment extends AbstractComponentCallbacksC1247cx {
    public RecyclerView l0;
    public C3269xn m0;

    @Override // o.AbstractComponentCallbacksC1247cx
    public final View A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC1474fG.j(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_dns_config_tv, viewGroup, false);
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final void K(View view, Bundle bundle) {
        AbstractC1474fG.j(view, "view");
        View viewFindViewById = view.findViewById(R.id.dns_grid_view);
        AbstractC1474fG.i(viewFindViewById, "findViewById(...)");
        this.l0 = (RecyclerView) viewFindViewById;
        Q();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        RecyclerView recyclerView = this.l0;
        if (recyclerView == null) {
            AbstractC1474fG.U("recyclerView");
            throw null;
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView2 = this.l0;
        if (recyclerView2 == null) {
            AbstractC1474fG.U("recyclerView");
            throw null;
        }
        recyclerView2.setFocusable(false);
        RecyclerView recyclerView3 = this.l0;
        if (recyclerView3 == null) {
            AbstractC1474fG.U("recyclerView");
            throw null;
        }
        recyclerView3.setDescendantFocusability(262144);
        C3269xn c3269xn = new C3269xn(new v(4, this));
        this.m0 = c3269xn;
        RecyclerView recyclerView4 = this.l0;
        if (recyclerView4 == null) {
            AbstractC1474fG.U("recyclerView");
            throw null;
        }
        recyclerView4.setAdapter(c3269xn);
        RecyclerView recyclerView5 = this.l0;
        if (recyclerView5 == null) {
            AbstractC1474fG.U("recyclerView");
            throw null;
        }
        recyclerView5.setNestedScrollingEnabled(false);
        ConcurrentHashMap concurrentHashMap = C0323Bn.a;
        List listD = C0323Bn.d();
        C3269xn c3269xn2 = this.m0;
        if (c3269xn2 == null) {
            AbstractC1474fG.U("adapter");
            throw null;
        }
        c3269xn2.e = listD;
        c3269xn2.a.b();
        RecyclerView recyclerView6 = this.l0;
        if (recyclerView6 == null) {
            AbstractC1474fG.U("recyclerView");
            throw null;
        }
        recyclerView6.post(new Jj0(15, this));
        view.setOnKeyListener(new ViewOnKeyListenerC3075vn(0, this));
    }
}
