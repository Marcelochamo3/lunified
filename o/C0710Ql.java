package o;

import android.media.Spatializer;
import io.sentry.C0032c;

/* JADX INFO: renamed from: o.Ql, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0710Ql implements I20 {
    public final /* synthetic */ C1128bm l;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:16:0x0027  */
    /* JADX WARN: Code duplicated, block: B:40:0x0062 A[Catch: all -> 0x008f, FALL_THROUGH, TryCatch #0 {all -> 0x008f, blocks: (B:4:0x0007, B:6:0x000e, B:8:0x0012, B:10:0x0017, B:34:0x0056, B:36:0x005a, B:38:0x005e, B:40:0x0062, B:42:0x0066, B:44:0x006a, B:46:0x006e, B:48:0x0078, B:50:0x0084, B:56:0x0092), top: B:60:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0091  */
    @Override // o.I20
    public final boolean apply(Object obj) {
        boolean z;
        C0032c c0032c;
        C0032c c0032c2;
        C1128bm c1128bm = this.l;
        C0643Nw c0643Nw = (C0643Nw) obj;
        synchronized (c1128bm.c) {
            try {
                z = true;
                if (c1128bm.g.U && !c1128bm.f) {
                    if (c0643Nw.J > 2) {
                        String str = c0643Nw.w;
                        if (str != null) {
                            switch (str) {
                                case "audio/eac3-joc":
                                case "audio/ac3":
                                case "audio/ac4":
                                case "audio/eac3":
                                    if (Lr0.a >= 32 && (c0032c2 = c1128bm.h) != null && c0032c2.b) {
                                    }
                                default:
                                    if (Lr0.a < 32) {
                                        z = false;
                                        break;
                                    } else {
                                        z = false;
                                        break;
                                    }
                                    break;
                            }
                        } else if (Lr0.a < 32 || (c0032c = c1128bm.h) == null || !c0032c.b || !((Spatializer) c0032c.c).isAvailable() || !((Spatializer) c1128bm.h.c).isEnabled() || !c1128bm.h.g(c1128bm.i, c0643Nw)) {
                            z = false;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}
