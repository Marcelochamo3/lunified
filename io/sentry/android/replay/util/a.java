package io.sentry.android.replay.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import io.sentry.EnumC0094u1;
import io.sentry.I1;
import io.sentry.android.core.RunnableC0006c;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.capture.g;
import io.sentry.android.replay.j;
import io.sentry.android.replay.p;
import io.sentry.android.replay.q;
import io.sentry.android.replay.viewhierarchy.d;
import o.AbstractC1474fG;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f103o;

    public /* synthetic */ a(RunnableC0006c runnableC0006c, I1 i1) {
        this.l = 0;
        this.m = runnableC0006c;
        this.n = i1;
        this.f103o = "WindowRecorder.capture";
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.l) {
            case 0:
                Runnable runnable = (Runnable) this.m;
                AbstractC1474fG.j(runnable, "$task");
                I1 i1 = (I1) this.n;
                AbstractC1474fG.j(i1, "$options");
                String str = (String) this.f103o;
                AbstractC1474fG.j(str, "$taskName");
                try {
                    runnable.run();
                } catch (Throwable th) {
                    i1.getLogger().v(EnumC0094u1.ERROR, "Failed to execute task ".concat(str), th);
                    return;
                }
                break;
            case 1:
                Runnable runnable2 = (Runnable) this.m;
                AbstractC1474fG.j(runnable2, "$task");
                I1 i2 = (I1) this.n;
                AbstractC1474fG.j(i2, "$options");
                String str2 = (String) this.f103o;
                AbstractC1474fG.j(str2, "$taskName");
                try {
                    runnable2.run();
                } catch (Throwable th2) {
                    i2.getLogger().v(EnumC0094u1.ERROR, "Failed to execute task ".concat(str2), th2);
                    return;
                }
                break;
            default:
                Bitmap bitmap = (Bitmap) this.m;
                AbstractC1474fG.j(bitmap, "$bitmap");
                q qVar = (q) this.n;
                AbstractC1474fG.j(qVar, "this$0");
                d dVar = (d) this.f103o;
                AbstractC1474fG.j(dVar, "$viewHierarchy");
                Canvas canvas = new Canvas(bitmap);
                canvas.setMatrix(qVar.v);
                dVar.a(new p(qVar, bitmap, canvas, 0));
                Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, false);
                ReplayIntegration replayIntegration = qVar.f102o;
                if (replayIntegration != null) {
                    AbstractC1474fG.i(bitmapCopy, "screenshot");
                    g gVar = replayIntegration.s;
                    if (gVar != null) {
                        gVar.f(bitmapCopy, new j(0, bitmapCopy));
                    }
                }
                Bitmap bitmap2 = qVar.y;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                qVar.y = bitmapCopy;
                qVar.w.set(false);
                bitmap.recycle();
                break;
        }
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i) {
        this.l = i;
        this.m = obj;
        this.n = obj2;
        this.f103o = obj3;
    }
}
