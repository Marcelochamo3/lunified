package io.sentry.android.replay.capture;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import o.AbstractC0937Ze;
import o.AbstractC1406ef;
import o.AbstractC1474fG;
import o.C0633Nm;
import o.C0942Zj;
import o.C1042as;
import o.C1364e7;
import o.C2278nc;
import o.C2532q60;
import o.C3201x2;
import o.I7;
import o.InterfaceC0775Sy;
import o.Lr0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int l;
    public final /* synthetic */ long m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f95o;

    public /* synthetic */ k(long j, Context context) {
        this.l = 1;
        I7 i7 = I7.a;
        this.m = j;
        this.n = i7;
        this.f95o = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        long j = this.m;
        Object obj = this.f95o;
        Object obj2 = this.n;
        switch (this.l) {
            case 0:
                m mVar = (m) obj2;
                AbstractC1474fG.j(mVar, "this$0");
                InterfaceC0775Sy interfaceC0775Sy = (InterfaceC0775Sy) obj;
                AbstractC1474fG.j(interfaceC0775Sy, "$store");
                io.sentry.android.replay.h hVar = mVar.f;
                if (hVar != null) {
                    interfaceC0775Sy.i(hVar, Long.valueOf(j));
                }
                long jB = mVar.t.b() - mVar.r.getExperimental().a.h;
                io.sentry.android.replay.h hVar2 = mVar.f;
                if (hVar2 != null) {
                    AbstractC1406ef.S(hVar2.s, new io.sentry.android.replay.g(jB, hVar2));
                }
                C2532q60 c2532q60 = new C2532q60();
                ArrayList arrayList = mVar.v;
                AbstractC1406ef.S(arrayList, new l(jB, mVar, c2532q60));
                if (c2532q60.l) {
                    for (Object obj3 : arrayList) {
                        int i2 = i + 1;
                        if (i < 0) {
                            AbstractC0937Ze.N();
                            throw null;
                        }
                        b bVar = (b) obj3;
                        bVar.b.E = i;
                        List<io.sentry.rrweb.b> list = bVar.c.m;
                        if (list != null) {
                            for (io.sentry.rrweb.b bVar2 : list) {
                                if (bVar2 instanceof io.sentry.rrweb.l) {
                                    ((io.sentry.rrweb.l) bVar2).f146o = i;
                                }
                            }
                        }
                        i = i2;
                    }
                    return;
                }
                return;
            case 1:
                I7 i7 = (I7) obj2;
                AbstractC1474fG.j(i7, "$this_runCatching");
                Context context = (Context) obj;
                AbstractC1474fG.j(context, "$context");
                try {
                    Thread.sleep(300000L);
                    if (I7.e.get() == j && I7.d.compareAndSet(true, false)) {
                        Context applicationContext = context.getApplicationContext();
                        AbstractC1474fG.i(applicationContext, "getApplicationContext(...)");
                        i7.b(applicationContext);
                        return;
                    }
                    return;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            default:
                C1364e7 c1364e7 = (C1364e7) obj2;
                c1364e7.getClass();
                int i3 = Lr0.a;
                C1042as c1042as = c1364e7.c.l;
                C0942Zj c0942Zj = c1042as.r;
                C3201x2 c3201x2S = c0942Zj.S();
                c0942Zj.T(c3201x2S, 26, new C2278nc(c3201x2S, obj, j));
                if (c1042as.R == obj) {
                    c1042as.l.e(26, new C0633Nm(4));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ k(Object obj, Object obj2, long j, int i) {
        this.l = i;
        this.n = obj;
        this.f95o = obj2;
        this.m = j;
    }
}
