package o;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class B30 implements InterfaceC1479fL {
    public final Uri l;
    public final C3256xg0 m;
    public final Na0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final InterfaceC0354Cs f181o;
    public final io.sentry.X1 p;
    public volatile boolean r;
    public long t;
    public C2970uj u;
    public C90 v;
    public boolean w;
    public final /* synthetic */ E30 x;
    public final C2800sv q = new C2800sv();
    public boolean s = true;

    public B30(E30 e30, Uri uri, InterfaceC2583qj interfaceC2583qj, Na0 na0, InterfaceC0354Cs interfaceC0354Cs, io.sentry.X1 x1) {
        this.x = e30;
        this.l = uri;
        this.m = new C3256xg0(interfaceC2583qj);
        this.n = na0;
        this.f181o = interfaceC0354Cs;
        this.p = x1;
        C0991aL.a.getAndIncrement();
        this.u = a(0L);
    }

    public final C2970uj a(long j) {
        Collections.emptyMap();
        String str = this.x.t;
        Map map = E30.X;
        Uri uri = this.l;
        AbstractC0397Ej.h(uri, "The uri must be set.");
        return new C2970uj(uri, 0L, 1, null, map, j, -1L, str, 6, null);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0031 */
    @Override // o.InterfaceC1479fL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.B30.b():void");
    }

    @Override // o.InterfaceC1479fL
    public final void e() {
        this.r = true;
    }
}
