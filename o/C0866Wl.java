package o;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* JADX INFO: renamed from: o.Wl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0866Wl implements Spatializer$OnSpatializerStateChangedListener {
    public final /* synthetic */ C1128bm a;

    public C0866Wl(C1128bm c1128bm) {
        this.a = c1128bm;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        C1128bm c1128bm = this.a;
        HW hw = C1128bm.j;
        c1128bm.j();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        C1128bm c1128bm = this.a;
        HW hw = C1128bm.j;
        c1128bm.j();
    }
}
