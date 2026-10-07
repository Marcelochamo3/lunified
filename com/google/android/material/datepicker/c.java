package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.skidush.clonex.R;
import java.util.Calendar;
import o.AbstractC1674hK;
import o.AbstractC2144m60;
import o.C0334By;
import o.C0570La;
import o.C1776iO;
import o.Er0;
import o.O50;
import o.WQ;
import o.XQ;
import o.Y50;

/* JADX INFO: loaded from: classes.dex */
public final class c extends O50 {
    public final C0570La d;
    public final C0334By e;
    public final int f;

    public c(ContextThemeWrapper contextThemeWrapper, C0570La c0570La, C0334By c0334By) {
        WQ wq = c0570La.l;
        WQ wq2 = c0570La.f383o;
        if (wq.l.compareTo(wq2.l) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (wq2.l.compareTo(c0570La.m.l) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * XQ.d) + (C1776iO.c0(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.d = c0570La;
        this.e = c0334By;
        i(true);
    }

    @Override // o.O50
    public final int a() {
        return this.d.r;
    }

    @Override // o.O50
    public final long b(int i) {
        Calendar calendarB = Er0.b(this.d.l.l);
        calendarB.add(2, i);
        return new WQ(calendarB).l.getTimeInMillis();
    }

    @Override // o.O50
    public final void e(AbstractC2144m60 abstractC2144m60, int i) {
        b bVar = (b) abstractC2144m60;
        C0570La c0570La = this.d;
        Calendar calendarB = Er0.b(c0570La.l.l);
        calendarB.add(2, i);
        WQ wq = new WQ(calendarB);
        bVar.u.setText(wq.f());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !wq.equals(materialCalendarGridView.a().a)) {
            new XQ(wq, c0570La);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    @Override // o.O50
    public final AbstractC2144m60 f(int i, RecyclerView recyclerView) {
        LinearLayout linearLayout = (LinearLayout) AbstractC1674hK.k(recyclerView, R.layout.mtrl_calendar_month_labeled, recyclerView, false);
        if (!C1776iO.c0(recyclerView.getContext(), android.R.attr.windowFullscreen)) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new Y50(-1, this.f));
        return new b(linearLayout, true);
    }
}
