package o;

import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: o.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC3294y0 {
    public static /* bridge */ /* synthetic */ ImageDecoder.Source f(Object obj) {
        return (ImageDecoder.Source) obj;
    }

    public static /* bridge */ /* synthetic */ AnimatedImageDrawable h(Drawable drawable) {
        return (AnimatedImageDrawable) drawable;
    }

    public static /* bridge */ /* synthetic */ void v(Object obj) {
    }

    public static /* bridge */ /* synthetic */ boolean w(Drawable drawable) {
        return drawable instanceof AnimatedImageDrawable;
    }
}
