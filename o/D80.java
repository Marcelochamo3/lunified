package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.TypedValue;
import com.skidush.clonex.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class D80 {
    /* JADX INFO: Access modifiers changed from: private */
    public static Drawable b(Context context, int i) {
        ColorStateList colorStateListV;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setShape(1);
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) gradientDrawable, i, i, i, i);
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(0);
        TypedValue typedValueY = zy0.y(context, R.attr.colorControlHighlight);
        if (typedValueY != null) {
            int i2 = typedValueY.resourceId;
            colorStateListV = i2 != 0 ? AbstractC1459f50.v(context, i2) : ColorStateList.valueOf(typedValueY.data);
        } else {
            colorStateListV = null;
        }
        if (colorStateListV != null) {
            colorStateListValueOf = colorStateListV;
        }
        return new RippleDrawable(colorStateListValueOf, null, insetDrawable);
    }
}
