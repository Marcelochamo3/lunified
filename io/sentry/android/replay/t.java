package io.sentry.android.replay;

import android.view.View;
import android.view.Window;
import io.sentry.EnumC0094u1;
import io.sentry.I1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import o.AbstractC0911Ye;
import o.AbstractC1406ef;
import o.AbstractC1474fG;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t {
    public final /* synthetic */ w a;

    public /* synthetic */ t(w wVar) {
        this.a = wVar;
    }

    public final void a(View view, boolean z) {
        q qVar;
        w wVar = this.a;
        AbstractC1474fG.j(wVar, "this$0");
        AbstractC1474fG.j(view, "root");
        ArrayList arrayList = wVar.r;
        I1 i1 = wVar.l;
        if (z) {
            arrayList.add(new WeakReference(view));
            q qVar2 = wVar.s;
            if (qVar2 != null) {
                qVar2.a(view);
            }
            Window windowN = io.sentry.config.a.n(view);
            if (windowN == null) {
                i1.getLogger().h(EnumC0094u1.DEBUG, "Window is invalid, not tracking gestures", new Object[0]);
                return;
            }
            ReplayIntegration replayIntegration = wVar.n;
            if (replayIntegration == null) {
                i1.getLogger().h(EnumC0094u1.DEBUG, "TouchRecorderCallback is null, not tracking gestures", new Object[0]);
                return;
            } else {
                windowN.setCallback(new u(i1, replayIntegration, windowN.getCallback()));
                return;
            }
        }
        Window windowN2 = io.sentry.config.a.n(view);
        if (windowN2 == null) {
            i1.getLogger().h(EnumC0094u1.DEBUG, "Window was null in stopGestureTracking", new Object[0]);
        } else if (windowN2.getCallback() instanceof u) {
            Window.Callback callback = windowN2.getCallback();
            AbstractC1474fG.h(callback, "null cannot be cast to non-null type io.sentry.android.replay.WindowRecorder.SentryReplayGestureRecorder");
            windowN2.setCallback(((u) callback).l);
        }
        q qVar3 = wVar.s;
        if (qVar3 != null) {
            qVar3.c(view);
        }
        AbstractC1406ef.S(arrayList, new v(0, view));
        WeakReference weakReference = (WeakReference) AbstractC0911Ye.j0(arrayList);
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 == null || AbstractC1474fG.b(view, view2) || (qVar = wVar.s) == null) {
            return;
        }
        qVar.a(view2);
    }
}
