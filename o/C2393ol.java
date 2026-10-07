package o;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;

/* JADX INFO: renamed from: o.ol, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2393ol implements BP {
    public final Tl0 a;
    public final InterfaceC2486pj b;
    public C0622Nb c;
    public final long d;
    public final long e;
    public final long f;
    public final float g;
    public final float h;

    public C2393ol(InterfaceC2486pj interfaceC2486pj) {
        this(interfaceC2486pj, new C0580Lk());
    }

    public static BP d(Class cls, InterfaceC2486pj interfaceC2486pj) {
        try {
            return (BP) cls.getConstructor(InterfaceC2486pj.class).newInstance(interfaceC2486pj);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // o.BP
    public final /* bridge */ /* synthetic */ BP a(InterfaceC0454Go interfaceC0454Go) {
        e(interfaceC0454Go);
        return this;
    }

    @Override // o.BP
    public final BP b(C0622Nb c0622Nb) {
        AbstractC0397Ej.e(c0622Nb, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.c = c0622Nb;
        Tl0 tl0 = this.a;
        tl0.r = c0622Nb;
        Iterator it = ((HashMap) tl0.f542o).values().iterator();
        while (it.hasNext()) {
            ((BP) it.next()).b(c0622Nb);
        }
        return this;
    }

    @Override // o.BP
    public final AbstractC1464f8 c(C1971kP c1971kP) {
        BP bp;
        BP bp2;
        C1093bP c1093bP;
        C1483fP c1483fP;
        C1971kP c1971kP2 = c1971kP;
        c1971kP2.m.getClass();
        C1483fP c1483fP2 = c1971kP2.m;
        String scheme = c1483fP2.l.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        String str = c1483fP2.m;
        Uri uri = c1483fP2.l;
        int iF = Lr0.F(uri, str);
        Tl0 tl0 = this.a;
        HashMap map = (HashMap) tl0.f542o;
        BP bp3 = (BP) map.get(Integer.valueOf(iF));
        if (bp3 == null) {
            Gh0 gh0F = tl0.f(iF);
            if (gh0F == null) {
                bp = null;
            } else {
                bp3 = (BP) gh0F.get();
                InterfaceC0454Go interfaceC0454Go = (InterfaceC0454Go) tl0.q;
                if (interfaceC0454Go != null) {
                    bp3.a(interfaceC0454Go);
                }
                C0622Nb c0622Nb = (C0622Nb) tl0.r;
                if (c0622Nb != null) {
                    bp3.b(c0622Nb);
                }
                map.put(Integer.valueOf(iF), bp3);
                bp = bp3;
            }
        } else {
            bp = bp3;
        }
        AbstractC0397Ej.h(bp, "No suitable media source factory found for content type: " + iF);
        C1385eP c1385eP = c1971kP2.n;
        C1288dP c1288dPA = c1385eP.a();
        if (c1385eP.l == -9223372036854775807L) {
            c1288dPA.a = this.d;
        }
        if (c1385eP.f752o == -3.4028235E38f) {
            c1288dPA.d = this.g;
        }
        if (c1385eP.p == -3.4028235E38f) {
            c1288dPA.e = this.h;
        }
        if (c1385eP.m == -9223372036854775807L) {
            c1288dPA.b = this.e;
        }
        if (c1385eP.n == -9223372036854775807L) {
            c1288dPA.c = this.f;
        }
        C1385eP c1385ePA = c1288dPA.a();
        if (c1385ePA.equals(c1385eP)) {
            bp2 = bp;
        } else {
            XE xe = AbstractC0985aF.m;
            M60 m60 = M60.p;
            Collections.emptyList();
            M60 m61 = M60.p;
            C1581gP c1581gP = C1581gP.n;
            YO yo = new YO();
            C0995aP c0995aP = c1971kP2.p;
            yo.a = c0995aP.l;
            yo.b = c0995aP.m;
            yo.c = c0995aP.n;
            yo.d = c0995aP.f655o;
            yo.e = c0995aP.p;
            c1385eP.a();
            C1190cP c1190cP = c1483fP2.n;
            if (c1190cP != null) {
                c1093bP = new C1093bP();
                c1093bP.a = c1190cP.l;
                c1093bP.b = c1190cP.m;
                c1093bP.c = c1190cP.n;
                c1093bP.d = c1190cP.f714o;
                c1093bP.e = c1190cP.p;
                c1093bP.f = c1190cP.q;
                c1093bP.g = c1190cP.r;
                c1093bP.h = c1190cP.s;
            } else {
                c1093bP = new C1093bP();
            }
            C1288dP c1288dPA2 = c1385ePA.a();
            Uri uri2 = c1093bP.b;
            UUID uuid = c1093bP.a;
            AbstractC0397Ej.f(uri2 == null || uuid != null);
            if (uri != null) {
                C1190cP c1190cP2 = uuid != null ? new C1190cP(c1093bP) : null;
                bp2 = bp;
                c1483fP = new C1483fP(uri, c1483fP2.m, c1190cP2, c1483fP2.f773o, c1483fP2.p, c1483fP2.q, c1483fP2.r, c1483fP2.s);
            } else {
                bp2 = bp;
                c1483fP = null;
            }
            String str2 = c1971kP2.l;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            C0995aP c0995aP2 = new C0995aP(yo);
            C1385eP c1385ePA2 = c1288dPA2.a();
            C2263nP c2263nP = c1971kP2.f866o;
            if (c2263nP == null) {
                c2263nP = C2263nP.T;
            }
            c1971kP2 = new C1971kP(str3, c0995aP2, c1483fP, c1385ePA2, c2263nP, c1971kP2.q);
        }
        AbstractC1464f8 abstractC1464f8C = bp2.c(c1971kP2);
        C1483fP c1483fP3 = c1971kP2.m;
        AbstractC0985aF abstractC0985aF = c1483fP3.r;
        if (!abstractC0985aF.isEmpty()) {
            AbstractC1464f8[] abstractC1464f8Arr = new AbstractC1464f8[abstractC0985aF.size() + 1];
            abstractC1464f8Arr[0] = abstractC1464f8C;
            int i = 0;
            while (i < abstractC0985aF.size()) {
                InterfaceC2486pj interfaceC2486pj = this.b;
                interfaceC2486pj.getClass();
                C0622Nb c0622Nb2 = new C0622Nb(false);
                C0622Nb c0622Nb3 = this.c;
                if (c0622Nb3 != null) {
                    c0622Nb2 = c0622Nb3;
                }
                int i2 = i + 1;
                abstractC1464f8Arr[i2] = new C1210ce0((C1873jP) abstractC0985aF.get(i), interfaceC2486pj, c0622Nb2);
                i = i2;
            }
            abstractC1464f8C = new C3427zQ(abstractC1464f8Arr);
        }
        AbstractC1464f8 c0470He = abstractC1464f8C;
        C0995aP c0995aP3 = c1971kP2.p;
        long j = c0995aP3.l;
        long j2 = c0995aP3.m;
        if (j != 0 || j2 != Long.MIN_VALUE || c0995aP3.f655o) {
            c0470He = new C0470He(c0470He, Lr0.K(j), Lr0.K(j2), !c0995aP3.p, c0995aP3.n, c0995aP3.f655o);
        }
        if (c1483fP3.f773o != null) {
            AP.z();
        }
        return c0470He;
    }

    public final void e(InterfaceC0454Go interfaceC0454Go) {
        AbstractC0397Ej.e(interfaceC0454Go, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        Tl0 tl0 = this.a;
        tl0.q = interfaceC0454Go;
        Iterator it = ((HashMap) tl0.f542o).values().iterator();
        while (it.hasNext()) {
            ((BP) it.next()).a(interfaceC0454Go);
        }
    }

    public C2393ol(InterfaceC2486pj interfaceC2486pj, C0580Lk c0580Lk) {
        this.b = interfaceC2486pj;
        Tl0 tl0 = new Tl0(c0580Lk);
        this.a = tl0;
        if (interfaceC2486pj != ((InterfaceC2486pj) tl0.p)) {
            tl0.p = interfaceC2486pj;
            ((HashMap) tl0.m).clear();
            ((HashMap) tl0.f542o).clear();
        }
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f = -9223372036854775807L;
        this.g = -3.4028235E38f;
        this.h = -3.4028235E38f;
    }
}
