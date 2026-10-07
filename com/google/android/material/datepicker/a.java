package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import o.C1287dO;
import o.XQ;

/* JADX INFO: loaded from: classes.dex */
public final class a implements AdapterView.OnItemClickListener {
    public final /* synthetic */ MaterialCalendarGridView l;
    public final /* synthetic */ c m;

    public a(c cVar, MaterialCalendarGridView materialCalendarGridView) {
        this.m = cVar;
        this.l = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.l;
        XQ xqA = materialCalendarGridView.a();
        if (i < xqA.a() || i > xqA.c()) {
            return;
        }
        if (materialCalendarGridView.a().getItem(i).longValue() >= ((C1287dO) this.m.e.m).n0.n.l) {
            throw null;
        }
    }
}
