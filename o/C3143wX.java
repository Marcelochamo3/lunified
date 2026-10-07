package o;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: o.wX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3143wX implements InterfaceC1479fL {
    public final long l;
    public final C2970uj m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C3256xg0 f1093o;
    public final InterfaceC3046vX p;
    public volatile Object q;

    public C3143wX(InterfaceC2583qj interfaceC2583qj, Uri uri, int i, InterfaceC3046vX interfaceC3046vX) {
        Map mapEmptyMap = Collections.emptyMap();
        AbstractC0397Ej.h(uri, "The uri must be set.");
        C2970uj c2970uj = new C2970uj(uri, 0L, 1, null, mapEmptyMap, 0L, -1L, null, 1, null);
        this.f1093o = new C3256xg0(interfaceC2583qj);
        this.m = c2970uj;
        this.n = i;
        this.p = interfaceC3046vX;
        this.l = C0991aL.a.getAndIncrement();
    }

    @Override // o.InterfaceC1479fL
    public final void b() {
        this.f1093o.m = 0L;
        C2776sj c2776sj = new C2776sj(this.f1093o, this.m);
        try {
            c2776sj.a();
            Uri uriW = this.f1093o.l.w();
            uriW.getClass();
            this.q = this.p.D(uriW, c2776sj);
        } finally {
            Lr0.h(c2776sj);
        }
    }

    @Override // o.InterfaceC1479fL
    public final void e() {
    }
}
