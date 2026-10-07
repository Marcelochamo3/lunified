package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class Hr0 {
    public static Drawable a(Context context, Resources resources, int i) {
        return resources.getDrawable(i, context.getTheme());
    }
}
