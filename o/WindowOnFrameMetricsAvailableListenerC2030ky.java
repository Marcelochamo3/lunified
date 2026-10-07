package o;

import android.view.FrameMetrics;
import android.view.Window;
import android.view.Window$OnFrameMetricsAvailableListener;

/* JADX INFO: renamed from: o.ky, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class WindowOnFrameMetricsAvailableListenerC2030ky implements Window$OnFrameMetricsAvailableListener {
    public final /* synthetic */ C2128ly a;

    public WindowOnFrameMetricsAvailableListenerC2030ky(C2128ly c2128ly) {
        this.a = c2128ly;
    }

    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        C2128ly c2128ly = this.a;
        if ((c2128ly.n & 1) != 0) {
            C2128ly.K(c2128ly.f906o[0], frameMetrics.getMetric(8));
        }
        C2128ly c2128ly2 = this.a;
        if ((c2128ly2.n & 2) != 0) {
            C2128ly.K(c2128ly2.f906o[1], frameMetrics.getMetric(1));
        }
        C2128ly c2128ly3 = this.a;
        if ((c2128ly3.n & 4) != 0) {
            C2128ly.K(c2128ly3.f906o[2], frameMetrics.getMetric(3));
        }
        C2128ly c2128ly4 = this.a;
        if ((c2128ly4.n & 8) != 0) {
            C2128ly.K(c2128ly4.f906o[3], frameMetrics.getMetric(4));
        }
        C2128ly c2128ly5 = this.a;
        if ((c2128ly5.n & 16) != 0) {
            C2128ly.K(c2128ly5.f906o[4], frameMetrics.getMetric(5));
        }
        C2128ly c2128ly6 = this.a;
        if ((c2128ly6.n & 64) != 0) {
            C2128ly.K(c2128ly6.f906o[6], frameMetrics.getMetric(7));
        }
        C2128ly c2128ly7 = this.a;
        if ((c2128ly7.n & 32) != 0) {
            C2128ly.K(c2128ly7.f906o[5], frameMetrics.getMetric(6));
        }
        C2128ly c2128ly8 = this.a;
        if ((c2128ly8.n & 128) != 0) {
            C2128ly.K(c2128ly8.f906o[7], frameMetrics.getMetric(0));
        }
        C2128ly c2128ly9 = this.a;
        if ((c2128ly9.n & 256) != 0) {
            C2128ly.K(c2128ly9.f906o[8], frameMetrics.getMetric(2));
        }
    }
}
