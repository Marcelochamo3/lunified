package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.skidush.clonex.R;
import java.util.WeakHashMap;
import o.AbstractC2144m60;
import o.C2797st0;
import o.It0;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC2144m60 {
    public final TextView u;
    public final MaterialCalendarGridView v;

    public b(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.u = textView;
        WeakHashMap weakHashMap = It0.a;
        new C2797st0(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3).g(textView, Boolean.TRUE);
        this.v = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z) {
            return;
        }
        textView.setVisibility(8);
    }
}
