package o;

import android.window.BackEvent;

/* JADX INFO: renamed from: o.r3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2621r3 {
    public static final C2621r3 a = new C2621r3();

    public final BackEvent a(float f, float f2, float f3, int i) {
        return new BackEvent(f, f2, f3, i);
    }

    public final float b(BackEvent backEvent) {
        AbstractC1474fG.j(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        AbstractC1474fG.j(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        AbstractC1474fG.j(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        AbstractC1474fG.j(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
