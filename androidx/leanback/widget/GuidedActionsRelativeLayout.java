package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.skidush.clonex.R;
import o.Q40;

/* JADX INFO: loaded from: classes.dex */
class GuidedActionsRelativeLayout extends RelativeLayout {
    public final float l;
    public boolean m;

    public GuidedActionsRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.m = false;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(Q40.a);
        float f = typedArrayObtainStyledAttributes.getFloat(45, 40.0f);
        typedArrayObtainStyledAttributes.recycle();
        this.l = f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.m = false;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        View viewFindViewById;
        int size = View.MeasureSpec.getSize(i2);
        if (size > 0 && (viewFindViewById = findViewById(R.id.guidedactions_sub_list)) != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams();
            if (marginLayoutParams.topMargin < 0 && !this.m) {
                this.m = true;
            }
            if (this.m) {
                marginLayoutParams.topMargin = (int) ((this.l * size) / 100.0f);
            }
        }
        super.onMeasure(i, i2);
    }
}
