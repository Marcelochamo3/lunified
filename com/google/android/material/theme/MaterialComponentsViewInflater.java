package com.google.android.material.theme;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import com.skidush.clonex.R;
import o.AbstractC1459f50;
import o.AbstractC1604gg;
import o.AbstractC1923jt0;
import o.AbstractC3021v9;
import o.C1068b5;
import o.C1580gO;
import o.C1872jO;
import o.C2456pO;
import o.C2817t4;
import o.F3;
import o.G3;
import o.H40;
import o.I3;
import o.LN;
import o.T4;
import o.zy0;

/* JADX INFO: loaded from: classes.dex */
public class MaterialComponentsViewInflater extends C1068b5 {
    @Override // o.C1068b5
    public final F3 a(Context context, AttributeSet attributeSet) {
        return new LN(context, attributeSet);
    }

    @Override // o.C1068b5
    public final G3 b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // o.C1068b5
    public final I3 c(Context context, AttributeSet attributeSet) {
        return new C1580gO(context, attributeSet);
    }

    @Override // o.C1068b5
    public final C2817t4 d(Context context, AttributeSet attributeSet) {
        C1872jO c1872jO = new C1872jO(AbstractC1459f50.Q(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = c1872jO.getContext();
        TypedArray typedArrayU = AbstractC1923jt0.u(context2, attributeSet, H40.q, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayU.hasValue(0)) {
            AbstractC1604gg.c(c1872jO, AbstractC3021v9.l(context2, typedArrayU, 0));
        }
        c1872jO.q = typedArrayU.getBoolean(1, false);
        typedArrayU.recycle();
        return c1872jO;
    }

    @Override // o.C1068b5
    public final T4 e(Context context, AttributeSet attributeSet) {
        C2456pO c2456pO = new C2456pO(AbstractC1459f50.Q(context, attributeSet, android.R.attr.textViewStyle, 0), attributeSet, android.R.attr.textViewStyle);
        Context context2 = c2456pO.getContext();
        if (zy0.z(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = H40.t;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
            int iN = C2456pO.n(context2, typedArrayObtainStyledAttributes, 1, 2);
            typedArrayObtainStyledAttributes.recycle();
            if (iN == -1) {
                TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
                int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
                typedArrayObtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, H40.s);
                    int iN2 = C2456pO.n(c2456pO.getContext(), typedArrayObtainStyledAttributes3, 1, 2);
                    typedArrayObtainStyledAttributes3.recycle();
                    if (iN2 >= 0) {
                        c2456pO.setLineHeight(iN2);
                    }
                }
            }
        }
        return c2456pO;
    }
}
