package o;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import com.skidush.clonex.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class MN {
    public final TimeInterpolator a;
    public final View b;
    public final int c;
    public final int d;
    public final int e;
    public E7 f;

    public MN(View view) {
        this.b = view;
        Context context = view.getContext();
        this.a = AbstractC3045vW.E(context, R.attr.motionEasingStandardDecelerateInterpolator, BX.b(0.0f, 0.0f, 0.0f, 1.0f));
        this.c = AbstractC3045vW.D(context, R.attr.motionDurationMedium2, 300);
        this.d = AbstractC3045vW.D(context, R.attr.motionDurationShort3, 150);
        this.e = AbstractC3045vW.D(context, R.attr.motionDurationShort2, 100);
    }
}
