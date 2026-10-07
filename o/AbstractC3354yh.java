package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.io.File;

/* JADX INFO: renamed from: o.yh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3354yh {
    public static File a(Context context) {
        return context.getCodeCacheDir();
    }

    public static Drawable b(Context context, int i) {
        return context.getDrawable(i);
    }

    public static File c(Context context) {
        return context.getNoBackupFilesDir();
    }
}
