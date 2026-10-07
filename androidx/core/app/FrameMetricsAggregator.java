package androidx.core.app;

import android.os.Build;
import o.C0622Nb;
import o.C2128ly;

/* JADX INFO: loaded from: classes.dex */
public class FrameMetricsAggregator {
    public final C0622Nb a;

    public FrameMetricsAggregator() {
        this(1);
    }

    public FrameMetricsAggregator(int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.a = new C2128ly(i);
        } else {
            this.a = new C0622Nb(23);
        }
    }
}
