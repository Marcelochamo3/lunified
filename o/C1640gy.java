package o;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: o.gy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1640gy implements InterfaceC1665hB, K90, InterfaceC1047au0 {
    public final AbstractComponentCallbacksC1247cx l;
    public final Zt0 m;
    public final Runnable n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Yt0 f803o;
    public C1478fK p = null;
    public C1797ie0 q = null;

    public C1640gy(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx, Zt0 zt0, Jj0 jj0) {
        this.l = abstractComponentCallbacksC1247cx;
        this.m = zt0;
        this.n = jj0;
    }

    @Override // o.K90
    public final K3 a() {
        g();
        return (K3) this.q.f832o;
    }

    public final void b(SJ sj) {
        this.p.d(sj);
    }

    @Override // o.InterfaceC1665hB
    public final Yt0 c() {
        Application application;
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = this.l;
        Yt0 yt0C = abstractComponentCallbacksC1247cx.c();
        if (!yt0C.equals(abstractComponentCallbacksC1247cx.e0)) {
            this.f803o = yt0C;
            return yt0C;
        }
        if (this.f803o == null) {
            Context applicationContext = abstractComponentCallbacksC1247cx.Q().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.f803o = new L90(application, abstractComponentCallbacksC1247cx, abstractComponentCallbacksC1247cx.q);
        }
        return this.f803o;
    }

    @Override // o.InterfaceC1665hB
    public final SS d() {
        Application application;
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = this.l;
        Context applicationContext = abstractComponentCallbacksC1247cx.Q().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        SS ss = new SS(0);
        LinkedHashMap linkedHashMap = ss.a;
        if (application != null) {
            linkedHashMap.put(Xt0.e, application);
        }
        linkedHashMap.put(AbstractC1474fG.f, abstractComponentCallbacksC1247cx);
        linkedHashMap.put(AbstractC1474fG.g, this);
        Bundle bundle = abstractComponentCallbacksC1247cx.q;
        if (bundle != null) {
            linkedHashMap.put(AbstractC1474fG.h, bundle);
        }
        return ss;
    }

    @Override // o.InterfaceC1047au0
    public final Zt0 e() {
        g();
        return this.m;
    }

    @Override // o.InterfaceC1283dK
    public final C1478fK f() {
        g();
        return this.p;
    }

    public final void g() {
        if (this.p == null) {
            this.p = new C1478fK(this);
            C1797ie0 c1797ie0 = new C1797ie0(this);
            this.q = c1797ie0;
            c1797ie0.g();
            this.n.run();
        }
    }
}
