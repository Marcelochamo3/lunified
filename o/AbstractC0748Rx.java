package o;

import android.util.Log;

/* JADX INFO: renamed from: o.Rx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0748Rx {
    public static final C0722Qx a = C0722Qx.a;

    public static C0722Qx a(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx) {
        while (abstractComponentCallbacksC1247cx != null) {
            if (abstractComponentCallbacksC1247cx.t()) {
                abstractComponentCallbacksC1247cx.l();
            }
            abstractComponentCallbacksC1247cx = abstractComponentCallbacksC1247cx.I;
        }
        return a;
    }

    public static void b(Ju0 ju0) {
        if (Log.isLoggable("FragmentManager", 3)) {
            ju0.l.getClass();
        }
    }

    public static final void c(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx, String str) {
        AbstractC1474fG.j(abstractComponentCallbacksC1247cx, "fragment");
        AbstractC1474fG.j(str, "previousFragmentId");
        b(new C0618Mx(abstractComponentCallbacksC1247cx, "Attempting to reuse fragment " + abstractComponentCallbacksC1247cx + " with previous ID " + str));
        a(abstractComponentCallbacksC1247cx).getClass();
        Object obj = EnumC0696Px.l;
        if (obj instanceof Void) {
        }
    }
}
