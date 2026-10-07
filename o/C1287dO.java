package o;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: renamed from: o.dO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1287dO<S> extends NY {
    public int m0;
    public C0570La n0;
    public WQ o0;
    public int p0;
    public C2720s4 q0;
    public RecyclerView r0;
    public RecyclerView s0;
    public View t0;
    public View u0;
    public View v0;
    public View w0;

    @Override // o.AbstractComponentCallbacksC1247cx
    public final View A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(j(), this.m0);
        this.q0 = new C2720s4(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        WQ wq = this.n0.l;
        if (C1776iO.c0(contextThemeWrapper, R.attr.windowFullscreen)) {
            i = com.skidush.clonex.R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = com.skidush.clonex.R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
        Resources resources = Q().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.skidush.clonex.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.skidush.clonex.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.skidush.clonex.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.skidush.clonex.R.dimen.mtrl_calendar_days_of_week_height);
        int i3 = XQ.d;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.skidush.clonex.R.dimen.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(com.skidush.clonex.R.dimen.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(com.skidush.clonex.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(com.skidush.clonex.R.id.mtrl_calendar_days_of_week);
        It0.p(gridView, new ZN(0));
        int i4 = this.n0.p;
        gridView.setAdapter((ListAdapter) (i4 > 0 ? new C0345Cj(i4) : new C0345Cj()));
        gridView.setNumColumns(wq.f594o);
        gridView.setEnabled(false);
        this.s0 = (RecyclerView) viewInflate.findViewById(com.skidush.clonex.R.id.mtrl_calendar_months);
        j();
        this.s0.setLayoutManager(new C0994aO(this, i2, i2));
        this.s0.setTag("MONTHS_VIEW_GROUP_TAG");
        com.google.android.material.datepicker.c cVar = new com.google.android.material.datepicker.c(contextThemeWrapper, this.n0, new C0334By(11, this));
        this.s0.setAdapter(cVar);
        int integer = contextThemeWrapper.getResources().getInteger(com.skidush.clonex.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(com.skidush.clonex.R.id.mtrl_calendar_year_selector_frame);
        this.r0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.r0.setLayoutManager(new GridLayoutManager(integer));
            this.r0.setAdapter(new C1347dy0(this));
            this.r0.g(new C1092bO(this));
        }
        if (viewInflate.findViewById(com.skidush.clonex.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(com.skidush.clonex.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            It0.p(materialButton, new C2633r9(3, this));
            View viewFindViewById = viewInflate.findViewById(com.skidush.clonex.R.id.month_navigation_previous);
            this.t0 = viewFindViewById;
            viewFindViewById.setTag("NAVIGATION_PREV_TAG");
            View viewFindViewById2 = viewInflate.findViewById(com.skidush.clonex.R.id.month_navigation_next);
            this.u0 = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.v0 = viewInflate.findViewById(com.skidush.clonex.R.id.mtrl_calendar_year_selector_frame);
            this.w0 = viewInflate.findViewById(com.skidush.clonex.R.id.mtrl_calendar_day_selector_frame);
            X(1);
            materialButton.setText(this.o0.f());
            this.s0.h(new C1189cO(this, cVar, materialButton));
            materialButton.setOnClickListener(new Z0(3, this));
            this.u0.setOnClickListener(new YN(this, cVar, 1));
            this.t0.setOnClickListener(new YN(this, cVar, 0));
        }
        if (!C1776iO.c0(contextThemeWrapper, R.attr.windowFullscreen)) {
            new XW().a(this.s0);
        }
        this.s0.g0(cVar.d.l.g(this.o0));
        It0.p(this.s0, new ZN(1));
        return viewInflate;
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final void H(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.m0);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.n0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.o0);
    }

    public final void W(WQ wq) {
        com.google.android.material.datepicker.c cVar = (com.google.android.material.datepicker.c) this.s0.getAdapter();
        int iG = cVar.d.l.g(wq);
        int iG2 = iG - cVar.d.l.g(this.o0);
        boolean z = Math.abs(iG2) > 3;
        boolean z2 = iG2 > 0;
        this.o0 = wq;
        if (z && z2) {
            this.s0.g0(iG - 3);
            this.s0.post(new RunnableC0907Ya(iG, 2, this));
        } else if (!z) {
            this.s0.post(new RunnableC0907Ya(iG, 2, this));
        } else {
            this.s0.g0(iG + 3);
            this.s0.post(new RunnableC0907Ya(iG, 2, this));
        }
    }

    public final void X(int i) {
        this.p0 = i;
        if (i == 2) {
            this.r0.getLayoutManager().H0(this.o0.n - ((C1347dy0) this.r0.getAdapter()).d.n0.l.n);
            this.v0.setVisibility(0);
            this.w0.setVisibility(8);
            this.t0.setVisibility(8);
            this.u0.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.v0.setVisibility(8);
            this.w0.setVisibility(0);
            this.t0.setVisibility(0);
            this.u0.setVisibility(0);
            W(this.o0);
        }
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final void z(Bundle bundle) {
        super.z(bundle);
        if (bundle == null) {
            bundle = this.q;
        }
        this.m0 = bundle.getInt("THEME_RES_ID_KEY");
        AbstractC1674hK.u(bundle.getParcelable("GRID_SELECTOR_KEY"));
        this.n0 = (C0570La) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        AbstractC1674hK.u(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.o0 = (WQ) bundle.getParcelable("CURRENT_MONTH_KEY");
    }
}
