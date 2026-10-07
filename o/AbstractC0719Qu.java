package o;

import android.content.Context;
import java.io.File;

/* JADX INFO: renamed from: o.Qu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0719Qu {
    public static File[] a(Context context) {
        return context.getExternalMediaDirs();
    }
}
