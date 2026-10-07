package o;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* JADX INFO: renamed from: o.c80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1172c80 {
    public final ColorStateList a;
    public final Configuration b;
    public final int c;

    public C1172c80(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.a = colorStateList;
        this.b = configuration;
        this.c = theme == null ? 0 : theme.hashCode();
    }
}
