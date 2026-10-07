package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import o.C1386eQ;
import o.InterfaceC2845tQ;
import o.RN;
import o.YP;
import o.ZP;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements YP, InterfaceC2845tQ, AdapterView.OnItemClickListener {
    public static final int[] m = {R.attr.background, R.attr.divider};
    public ZP l;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        RN rnY = RN.y(context, attributeSet, m, R.attr.listViewStyle, 0);
        TypedArray typedArray = (TypedArray) rnY.n;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(rnY.u(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(rnY.u(1));
        }
        rnY.A();
    }

    @Override // o.InterfaceC2845tQ
    public final void b(ZP zp) {
        this.l = zp;
    }

    @Override // o.YP
    public final boolean c(C1386eQ c1386eQ) {
        return this.l.q(c1386eQ, null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        c((C1386eQ) getAdapter().getItem(i));
    }
}
