package o;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: o.Pk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0683Pk implements InterfaceC1284dL {
    public static final C0633Nm z = new C0633Nm(0);
    public final C2681rk l;
    public final InterfaceC1958kC m;
    public final C0622Nb n;
    public C2613qy q;
    public Na0 r;
    public Handler s;
    public InterfaceC2153mC t;
    public C1568gC u;
    public Uri v;
    public C1177cC w;
    public boolean x;
    public final CopyOnWriteArrayList p = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final HashMap f461o = new HashMap();
    public long y = -9223372036854775807L;

    public C0683Pk(C2681rk c2681rk, C0622Nb c0622Nb, InterfaceC1958kC interfaceC1958kC) {
        this.l = c2681rk;
        this.m = interfaceC1958kC;
        this.n = c0622Nb;
    }

    public final C1177cC a(Uri uri, boolean z2) {
        HashMap map = this.f461o;
        C1177cC c1177cC = ((C0657Ok) map.get(uri)).f440o;
        if (c1177cC != null && z2 && !uri.equals(this.v)) {
            List list = this.u.e;
            for (int i = 0; i < list.size(); i++) {
                if (uri.equals(((C1470fC) list.get(i)).a)) {
                    C1177cC c1177cC2 = this.w;
                    if (c1177cC2 != null && c1177cC2.f710o) {
                        break;
                    }
                    this.v = uri;
                    C0657Ok c0657Ok = (C0657Ok) map.get(uri);
                    C1177cC c1177cC3 = c0657Ok.f440o;
                    if (c1177cC3 != null && c1177cC3.f710o) {
                        this.w = c1177cC3;
                        ((C1275dC) this.t).t(c1177cC3);
                        break;
                    }
                    c0657Ok.c(b(uri));
                    break;
                }
            }
        }
        return c1177cC;
    }

    public final Uri b(Uri uri) {
        YB yb;
        C1177cC c1177cC = this.w;
        if (c1177cC == null || !c1177cC.v.e || (yb = (YB) ((R60) c1177cC.t).get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(yb.b));
        int i = yb.c;
        if (i != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
        }
        return builderBuildUpon.build();
    }

    public final boolean c(Uri uri) {
        int i;
        C0657Ok c0657Ok = (C0657Ok) this.f461o.get(uri);
        if (c0657Ok.f440o == null) {
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jMax = Math.max(30000L, Lr0.X(c0657Ok.f440o.u));
        C1177cC c1177cC = c0657Ok.f440o;
        return c1177cC.f710o || (i = c1177cC.d) == 2 || i == 1 || c0657Ok.p + jMax > jElapsedRealtime;
    }

    @Override // o.InterfaceC1284dL
    public final void h(InterfaceC1479fL interfaceC1479fL, long j, long j2, boolean z2) {
        C3143wX c3143wX = (C3143wX) interfaceC1479fL;
        long j3 = c3143wX.l;
        Uri uri = c3143wX.f1093o.n;
        C0991aL c0991aL = new C0991aL();
        this.n.getClass();
        this.q.x(c0991aL, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // o.InterfaceC1284dL
    public final ZK k(InterfaceC1479fL interfaceC1479fL, IOException iOException, int i) {
        long jMin;
        C3143wX c3143wX = (C3143wX) interfaceC1479fL;
        long j = c3143wX.l;
        Uri uri = c3143wX.f1093o.n;
        C0991aL c0991aL = new C0991aL();
        this.n.getClass();
        if (!(iOException instanceof C2949uX) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof C1179cE) && !(iOException instanceof C1675hL)) {
            int i2 = C2679rj.m;
            Throwable cause = iOException;
            while (true) {
                if (cause == null) {
                    jMin = Math.min((i - 1) * 1000, 5000);
                    break;
                }
                if ((cause instanceof C2679rj) && ((C2679rj) cause).l == 2008) {
                    jMin = -9223372036854775807L;
                    break;
                }
                cause = cause.getCause();
            }
        } else {
            jMin = -9223372036854775807L;
            break;
        }
        boolean z2 = jMin == -9223372036854775807L;
        this.q.D(c0991aL, c3143wX.n, iOException, z2);
        return z2 ? Na0.u : new ZK(0, jMin, false);
    }

    @Override // o.InterfaceC1284dL
    public final void l(InterfaceC1479fL interfaceC1479fL, long j, long j2) {
        C1568gC c1568gC;
        C3143wX c3143wX = (C3143wX) interfaceC1479fL;
        AbstractC1666hC abstractC1666hC = (AbstractC1666hC) c3143wX.q;
        boolean z2 = abstractC1666hC instanceof C1177cC;
        if (z2) {
            String str = abstractC1666hC.a;
            C1568gC c1568gC2 = C1568gC.l;
            Uri uri = Uri.parse(str);
            C0617Mw c0617Mw = new C0617Mw();
            c0617Mw.a = "0";
            c0617Mw.j = "application/x-mpegURL";
            c1568gC = new C1568gC("", Collections.emptyList(), Collections.singletonList(new C1470fC(uri, new C0643Nw(c0617Mw), null, null, null, null)), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
        } else {
            c1568gC = (C1568gC) abstractC1666hC;
        }
        this.u = c1568gC;
        this.v = ((C1470fC) c1568gC.e.get(0)).a;
        this.p.add(new C0631Nk(this));
        List list = c1568gC.d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Uri uri2 = (Uri) list.get(i);
            this.f461o.put(uri2, new C0657Ok(this, uri2));
        }
        Uri uri3 = c3143wX.f1093o.n;
        C0991aL c0991aL = new C0991aL();
        C0657Ok c0657Ok = (C0657Ok) this.f461o.get(this.v);
        if (z2) {
            c0657Ok.d((C1177cC) abstractC1666hC);
        } else {
            c0657Ok.c(c0657Ok.l);
        }
        this.n.getClass();
        this.q.A(c0991aL, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
