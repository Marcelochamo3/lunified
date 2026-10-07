package com.skidush.clonex.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.skidush.clonex.R;
import o.AbstractC1474fG;
import o.AbstractC1856j9;
import o.AbstractC1923jt0;
import o.AbstractC3409z9;
import o.C2691rp;
import o.H40;
import o.RN;

/* JADX INFO: loaded from: classes.dex */
public final class SixItemBottomNavigationView extends AbstractC1856j9 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SixItemBottomNavigationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.bottomNavigationStyle);
        AbstractC1474fG.j(context, "context");
        RN rnV = AbstractC1923jt0.v(getContext(), attributeSet, H40.b, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView, new int[0]);
        TypedArray typedArray = (TypedArray) rnV.n;
        setItemHorizontalTranslationEnabled(typedArray.getBoolean(2, true));
        if (typedArray.hasValue(0)) {
            setMinimumHeight(typedArray.getDimensionPixelSize(0, 0));
        }
        typedArray.getBoolean(1, true);
        rnV.A();
        AbstractC3409z9.k(this, new C2691rp(25));
    }

    @Override // o.AbstractC1856j9, o.AbstractC3043vU
    public int getMaxItemCount() {
        return 6;
    }
}
