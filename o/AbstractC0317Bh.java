package o;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: o.Bh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0317Bh {
    public static Executor a(Context context) {
        return context.getMainExecutor();
    }
}
