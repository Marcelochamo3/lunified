package io.sentry;

import android.app.Activity;
import io.sentry.android.core.ActivityLifecycleIntegration;
import io.sentry.android.core.C0007d;
import io.sentry.android.core.C0011h;
import io.sentry.android.core.RunnableC0005b;
import io.sentry.android.core.SentryAndroidOptions;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: io.sentry.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0040e1 implements R0, V1, S0 {
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    public /* synthetic */ C0040e1(Object obj, Object obj2, Object obj3) {
        this.l = obj;
        this.m = obj2;
        this.n = obj3;
    }

    @Override // io.sentry.R0
    public void a(S1 s1) {
        Map map;
        L0 l0 = (L0) this.l;
        if (s1 == null) {
            ((I1) l0.a).getLogger().h(EnumC0094u1.INFO, "Session is null on scope.withSession", new Object[0]);
            return;
        }
        l0.getClass();
        C0083q1 c0083q1 = (C0083q1) this.m;
        String strD = null;
        R1 r1 = c0083q1.b() != null ? R1.Crashed : null;
        boolean z = R1.Crashed == r1 || c0083q1.c();
        io.sentry.protocol.n nVar = c0083q1.f108o;
        String str = (nVar == null || (map = nVar.q) == null || !map.containsKey("user-agent")) ? null : (String) c0083q1.f108o.q.get("user-agent");
        Object objQ = io.sentry.config.a.q((C0104y) this.n);
        if (objQ instanceof io.sentry.hints.a) {
            strD = ((io.sentry.hints.a) objQ).d();
            r1 = R1.Abnormal;
        }
        if (!s1.c(r1, str, z, strD) || s1.r == R1.Ok) {
            return;
        }
        s1.b(io.sentry.config.a.j());
    }

    @Override // io.sentry.S0
    public void b(W w) {
        io.sentry.android.core.internal.gestures.f fVar = (io.sentry.android.core.internal.gestures.f) this.l;
        W w2 = (W) this.n;
        if (w != null) {
            fVar.n.getLogger().h(EnumC0094u1.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", w2.getName());
        } else {
            fVar.getClass();
            ((Q) this.m).o(w2);
        }
    }

    @Override // io.sentry.V1
    public void d(T1 t1) {
        C0007d c0007dE;
        int i;
        int i2 = 1;
        Q1 q1 = (Q1) this.l;
        V1 v1 = (V1) this.m;
        AtomicReference atomicReference = (AtomicReference) this.n;
        if (v1 != null) {
            q1.getClass();
            v1.d(t1);
        }
        C0011h c0011h = q1.r.g;
        if (c0011h != null) {
            ActivityLifecycleIntegration activityLifecycleIntegration = (ActivityLifecycleIntegration) c0011h.l;
            WeakReference weakReference = (WeakReference) c0011h.m;
            String str = (String) c0011h.n;
            activityLifecycleIntegration.getClass();
            Activity activity = (Activity) weakReference.get();
            if (activity != null) {
                L0 l0 = activityLifecycleIntegration.B;
                io.sentry.protocol.t tVar = q1.a;
                synchronized (l0) {
                    if (l0.n()) {
                        RunnableC0005b runnableC0005b = new RunnableC0005b(l0, activity, i2);
                        C0007d c0007d = null;
                        l0.q(runnableC0005b, null);
                        C0007d c0007d2 = (C0007d) ((WeakHashMap) l0.d).remove(activity);
                        if (c0007d2 != null && (c0007dE = l0.e()) != null) {
                            c0007d = new C0007d(c0007dE.a - c0007d2.a, c0007dE.b - c0007d2.b, c0007dE.c - c0007d2.c);
                        }
                        if (c0007d != null && ((i = c0007d.a) != 0 || c0007d.b != 0 || c0007d.c != 0)) {
                            io.sentry.protocol.i iVar = new io.sentry.protocol.i(Integer.valueOf(i), "none");
                            io.sentry.protocol.i iVar2 = new io.sentry.protocol.i(Integer.valueOf(c0007d.b), "none");
                            io.sentry.protocol.i iVar3 = new io.sentry.protocol.i(Integer.valueOf(c0007d.c), "none");
                            HashMap map = new HashMap();
                            map.put("frames_total", iVar);
                            map.put("frames_slow", iVar2);
                            map.put("frames_frozen", iVar3);
                            ((ConcurrentHashMap) l0.c).put(tVar, map);
                        }
                    }
                }
            } else {
                SentryAndroidOptions sentryAndroidOptions = activityLifecycleIntegration.f57o;
                if (sentryAndroidOptions != null) {
                    sentryAndroidOptions.getLogger().h(EnumC0094u1.WARNING, "Unable to track activity frames as the Activity %s has been destroyed.", str);
                }
            }
        }
        h2 h2Var = q1.q;
        if (h2Var != null) {
            atomicReference.set(h2Var.g(q1));
        }
    }
}
