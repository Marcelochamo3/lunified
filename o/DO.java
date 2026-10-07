package o;

import android.media.MediaCodecInfo;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class DO {
    public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        List supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
            String str = Lr0.b;
            if (!str.equals("sabrina") && !str.equals("boreal")) {
                String str2 = Lr0.d;
                if (!str2.startsWith("Lenovo TB-X605") && !str2.startsWith("Lenovo TB-X606") && !str2.startsWith("Lenovo TB-X616")) {
                    D0.i();
                    MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointE = D0.e(i, i2, (int) d);
                    for (int i3 = 0; i3 < supportedPerformancePoints.size(); i3++) {
                        if (CO.d(supportedPerformancePoints.get(i3)).covers(performancePointE)) {
                            return 2;
                        }
                    }
                    return 1;
                }
            }
        }
        return 0;
    }
}
