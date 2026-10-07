package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import o.AbstractC0976a8;
import o.C3217xA;
import o.It0;
import o.Q40;

/* JADX INFO: loaded from: classes.dex */
public class VerticalGridView extends AbstractC0976a8 {
    public VerticalGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.U0.y1(1);
        q0(context, attributeSet);
        int[] iArr = Q40.j;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        It0.o(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        setColumnWidth(typedArrayObtainStyledAttributes);
        setNumColumns(typedArrayObtainStyledAttributes.getInt(1, 1));
        typedArrayObtainStyledAttributes.recycle();
    }

    public void setColumnWidth(TypedArray typedArray) {
        if (typedArray.peekValue(0) != null) {
            setColumnWidth(typedArray.getLayoutDimension(0, 0));
        }
    }

    public void setNumColumns(int i) {
        C3217xA c3217xA = this.U0;
        if (i < 0) {
            c3217xA.getClass();
            throw new IllegalArgumentException();
        }
        c3217xA.V = i;
        requestLayout();
    }

    public void setColumnWidth(int i) {
        this.U0.z1(i);
        requestLayout();
    }
}
