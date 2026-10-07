package io.sentry.android.replay.capture;

import android.app.Dialog;
import android.os.Bundle;
import com.skidush.clonex.fragments.player.PlayerTvFragment;
import io.sentry.C0032c;
import io.sentry.C0104y;
import io.sentry.K;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import o.AbstractC1474fG;
import o.AbstractC3226xJ;
import o.C1000aU;
import o.C1079bB;
import o.C1098bU;
import o.C1182cH;
import o.C1195cU;
import o.C1227cn;
import o.C1387eR;
import o.C2743sL;
import o.C2850tV;
import o.C2985uq0;
import o.DT;
import o.DU;
import o.FT;
import o.InterfaceC0412Ey;
import o.Ou0;
import o.TT;
import o.Vb0;
import o.WT;
import o.YT;

/* JADX INFO: loaded from: classes.dex */
public final class e extends AbstractC3226xJ implements InterfaceC0412Ey {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f91o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p pVar, Date date) {
        super(1);
        this.m = 1;
        this.f91o = pVar;
        this.n = date;
    }

    @Override // o.InterfaceC0412Ey
    public final Object b(Object obj) {
        TT tt;
        TT ttH;
        switch (this.m) {
            case 0:
                io.sentry.rrweb.b bVar = (io.sentry.rrweb.b) obj;
                AbstractC1474fG.j(bVar, "event");
                if (bVar.m >= ((Date) this.n).getTime()) {
                    ((List) this.f91o).add(bVar);
                }
                return C2985uq0.a;
            case 1:
                d dVar = (d) obj;
                AbstractC1474fG.j(dVar, "segment");
                if (dVar instanceof b) {
                    b bVar2 = (b) dVar;
                    p pVar = (p) this.f91o;
                    bVar2.a(pVar.s, new C0104y());
                    pVar.k.getAndIncrement();
                    pVar.g.set(io.sentry.config.a.k(((Date) this.n).getTime() + bVar2.a));
                }
                return C2985uq0.a;
            case 2:
                d dVar2 = (d) obj;
                AbstractC1474fG.j(dVar2, "segment");
                if (dVar2 instanceof b) {
                    b bVar3 = (b) dVar2;
                    K k = ((p) this.n).s;
                    C0104y c0104y = (C0104y) this.f91o;
                    if (c0104y == null) {
                        c0104y = new C0104y();
                    }
                    bVar3.a(k, c0104y);
                }
                return C2985uq0.a;
            case 3:
                d dVar3 = (d) obj;
                AbstractC1474fG.j(dVar3, "segment");
                if (dVar3 instanceof b) {
                    ((b) dVar3).a(((p) this.n).s, new C0104y());
                }
                io.sentry.config.a.c((File) this.f91o);
                return C2985uq0.a;
            case 4:
                AbstractC1474fG.j((IOException) obj, "it");
                C1227cn c1227cn = (C1227cn) this.n;
                C0032c c0032c = (C0032c) this.f91o;
                synchronized (c1227cn) {
                    c0032c.k();
                }
                return C2985uq0.a;
            case 5:
                ((C1079bB) this.n).n.removeCallbacks((Runnable) this.f91o);
                return C2985uq0.a;
            case 6:
                C1195cU c1195cU = (C1195cU) obj;
                AbstractC1474fG.j(c1195cU, "$this$navOptions");
                C1000aU c1000aU = c1195cU.a;
                c1000aU.g = 0;
                c1000aU.h = 0;
                c1000aU.i = -1;
                c1000aU.j = -1;
                TT tt2 = (TT) this.n;
                if (tt2 instanceof WT) {
                    int i = TT.v;
                    AbstractC1474fG.j(tt2, "<this>");
                    Iterator it = Vb0.K(tt2, C1182cH.z).iterator();
                    do {
                        boolean zHasNext = it.hasNext();
                        YT yt = (YT) this.f91o;
                        if (zHasNext) {
                            tt = (TT) it.next();
                            ttH = yt.h();
                        } else {
                            int i2 = WT.A;
                            c1195cU.d = Ou0.j(yt.j()).s;
                            c1195cU.e = true;
                        }
                    } while (!AbstractC1474fG.b(tt, ttH != null ? ttH.m : null));
                }
                return C2985uq0.a;
            case 7:
                DT dt = (DT) obj;
                AbstractC1474fG.j(dt, "backStackEntry");
                TT tt3 = dt.m;
                if (!(tt3 instanceof TT)) {
                    tt3 = null;
                }
                if (tt3 == null) {
                    return null;
                }
                Bundle bundleB = dt.b();
                C1098bU c1098bU = (C1098bU) this.f91o;
                DU du = (DU) this.n;
                TT ttC = du.c(tt3, bundleB, c1098bU);
                if (ttC == null) {
                    return null;
                }
                if (AbstractC1474fG.b(ttC, tt3)) {
                    return dt;
                }
                FT ftB = du.b();
                Bundle bundleA = ttC.a(dt.b());
                YT yt2 = ftB.h;
                return C2743sL.n(yt2.a, ttC, bundleA, yt2.k(), yt2.f636o);
            case 8:
                String str = (String) obj;
                AbstractC1474fG.j(str, "it");
                ((C2850tV) this.n).getClass();
                return C2850tV.h(str, (String) this.f91o);
            default:
                C1387eR c1387eR = (C1387eR) obj;
                AbstractC1474fG.j(c1387eR, "channel");
                ((Dialog) this.n).dismiss();
                PlayerTvFragment.d0((PlayerTvFragment) this.f91o, c1387eR);
                return C2985uq0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, int i, Object obj2) {
        super(1);
        this.m = i;
        this.n = obj;
        this.f91o = obj2;
    }
}
