package io.sentry.android.core;

import android.graphics.Bitmap;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.core.app.FrameMetricsAggregator;
import io.sentry.C0068o;
import io.sentry.C0072p0;
import io.sentry.EnumC0094u1;
import io.sentry.I1;
import io.sentry.L0;
import io.sentry.android.replay.ReplayIntegration;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import o.AbstractC1474fG;

/* JADX INFO: renamed from: io.sentry.android.core.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0006c implements Runnable {
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;

    public /* synthetic */ RunnableC0006c(int i, Object obj) {
        this.l = i;
        this.m = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException {
        Field field;
        Bitmap bitmap;
        ReplayIntegration replayIntegration;
        switch (this.l) {
            case 0:
                ((FrameMetricsAggregator) ((L0) this.m).a).a.H();
                break;
            case 1:
                ((r) this.m).a(null, true);
                break;
            case 2:
                ((AppLifecycleIntegration) this.m).f();
                break;
            case 3:
                io.sentry.android.replay.n nVar = (io.sentry.android.replay.n) this.m;
                AbstractC1474fG.j(nVar, "$this_apply");
                try {
                    Object value = io.sentry.android.replay.s.b.getValue();
                    if (value != null && (field = (Field) io.sentry.android.replay.s.c.getValue()) != null) {
                        Object obj = field.get(value);
                        AbstractC1474fG.h(obj, "null cannot be cast to non-null type java.util.ArrayList<android.view.View>{ kotlin.collections.TypeAliasesKt.ArrayList<android.view.View> }");
                        io.sentry.android.replay.l lVar = nVar.b;
                        lVar.addAll((ArrayList) obj);
                        field.set(value, lVar);
                        break;
                    }
                } catch (Throwable unused) {
                    return;
                }
                break;
            case 4:
                io.sentry.android.replay.w wVar = (io.sentry.android.replay.w) this.m;
                AbstractC1474fG.j(wVar, "this$0");
                io.sentry.android.replay.q qVar = wVar.s;
                if (qVar != null) {
                    boolean z = qVar.x.get();
                    I1 i1 = qVar.m;
                    if (z) {
                        if (qVar.w.get() || (bitmap = qVar.y) == null || bitmap.isRecycled()) {
                            WeakReference weakReference = qVar.q;
                            View view = weakReference != null ? (View) weakReference.get() : null;
                            if (view != null && view.getWidth() > 0 && view.getHeight() > 0 && view.isShown()) {
                                Window windowN = io.sentry.config.a.n(view);
                                if (windowN != null) {
                                    io.sentry.android.replay.r rVar = qVar.l;
                                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rVar.a, rVar.b, Bitmap.Config.ARGB_8888);
                                    AbstractC1474fG.i(bitmapCreateBitmap, "createBitmap(\n          …onfig.ARGB_8888\n        )");
                                    O o2 = new O(qVar, windowN, bitmapCreateBitmap, view, 3);
                                    C0072p0 c0072p0 = qVar.n;
                                    c0072p0.getClass();
                                    ((Handler) c0072p0.l).post(o2);
                                } else {
                                    i1.getLogger().h(EnumC0094u1.DEBUG, "Window is invalid, not capturing screenshot", new Object[0]);
                                }
                            } else {
                                i1.getLogger().h(EnumC0094u1.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
                            }
                            break;
                        } else {
                            i1.getLogger().h(EnumC0094u1.DEBUG, "Content hasn't changed, repeating last known frame", new Object[0]);
                            Bitmap bitmap2 = qVar.y;
                            if (bitmap2 != null && (replayIntegration = qVar.f102o) != null) {
                                Bitmap bitmapCopy = bitmap2.copy(Bitmap.Config.ARGB_8888, false);
                                AbstractC1474fG.i(bitmapCopy, "it.copy(ARGB_8888, false)");
                                io.sentry.android.replay.capture.g gVar = replayIntegration.s;
                                if (gVar != null) {
                                    gVar.f(bitmapCopy, new io.sentry.android.replay.j(0, bitmapCopy));
                                }
                                break;
                            }
                        }
                    } else {
                        i1.getLogger().h(EnumC0094u1.DEBUG, "ScreenshotRecorder is paused, not capturing screenshot", new Object[0]);
                        break;
                    }
                }
                break;
            default:
                io.sentry.android.replay.capture.g gVar2 = (io.sentry.android.replay.capture.g) this.m;
                AbstractC1474fG.j(gVar2, "this$0");
                String cacheDirPath = gVar2.a.getCacheDirPath();
                if (cacheDirPath != null) {
                    new File(cacheDirPath).listFiles(new C0068o(1, gVar2));
                }
                break;
        }
    }
}
