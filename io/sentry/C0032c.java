package io.sentry;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.Spatializer;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.opengl.Matrix;
import android.text.TextUtils;
import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.ref.ReferenceQueue;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import o.AbstractC0397Ej;
import o.AbstractC1474fG;
import o.AbstractC2661ra;
import o.C0509Ir;
import o.C0535Jr;
import o.C0643Nw;
import o.C0666Ot;
import o.C0709Qk;
import o.C0919Ym;
import o.C0945Zm;
import o.C1045at0;
import o.C1227cn;
import o.C1308de0;
import o.C1325dn;
import o.C1472fE;
import o.C1503fe0;
import o.C2597qq;
import o.C2776sj;
import o.C2873tj;
import o.C2970uj;
import o.C3256xg0;
import o.C3257xh;
import o.C3296y1;
import o.C3372yq;
import o.I6;
import o.InterfaceC1405ee0;
import o.InterfaceC1991ke0;
import o.InterfaceC2054lA;
import o.InterfaceC2450pI;
import o.InterfaceC2486pj;
import o.InterfaceC3275xq;
import o.Lr0;
import o.M70;
import o.R60;
import o.RunnableC3102w1;
import o.SO;
import o.T8;
import o.ThreadFactoryC3199x1;
import o.VO;
import o.WO;
import o.Xs0;

/* JADX INFO: renamed from: io.sentry.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0032c implements VO, InterfaceC1405ee0 {
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;
    public Object d;
    public Object e;

    public C0032c(int i, byte b) {
        this.a = i;
        switch (i) {
            case 5:
                this.c = new float[16];
                this.d = new float[16];
                this.e = new C0709Qk(4);
                break;
            default:
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC3199x1(0));
                this.c = new HashMap();
                this.d = new ReferenceQueue();
                this.b = false;
                executorServiceNewSingleThreadExecutor.execute(new RunnableC3102w1(1, this));
                break;
        }
    }

    public static void j(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        float f3 = fArr2[10];
        fArr[0] = f3 / fSqrt;
        float f4 = fArr2[8];
        fArr[2] = f4 / fSqrt;
        fArr[8] = (-f4) / fSqrt;
        fArr[10] = f3 / fSqrt;
    }

    public static byte[] l(InterfaceC2486pj interfaceC2486pj, String str, byte[] bArr, Map map) throws WO {
        Map map2;
        List list;
        C3256xg0 c3256xg0 = new C3256xg0(interfaceC2486pj.H());
        Collections.emptyMap();
        Uri uri = Uri.parse(str);
        AbstractC0397Ej.h(uri, "The uri must be set.");
        C2970uj c2970uj = new C2970uj(uri, 0L, 2, bArr, map, 0L, -1L, null, 1, null);
        C2970uj c2970ujA = c2970uj;
        int i = 0;
        while (true) {
            try {
                C2776sj c2776sj = new C2776sj(c3256xg0, c2970ujA);
                try {
                    try {
                        byte[] bArrW = Lr0.W(c2776sj);
                        Lr0.h(c2776sj);
                        return bArrW;
                    } catch (Throwable th) {
                        Lr0.h(c2776sj);
                        throw th;
                    }
                } catch (C1472fE e) {
                    int i2 = e.f770o;
                    String str2 = null;
                    if ((i2 == 307 || i2 == 308) && i < 5 && (map2 = e.p) != null && (list = (List) map2.get("Location")) != null && !list.isEmpty()) {
                        str2 = (String) list.get(0);
                    }
                    if (str2 == null) {
                        throw e;
                    }
                    i++;
                    C2873tj c2873tjA = c2970ujA.a();
                    c2873tjA.a = Uri.parse(str2);
                    c2970ujA = c2873tjA.a();
                    Lr0.h(c2776sj);
                }
            } catch (Exception e2) {
                Uri uri2 = c3256xg0.n;
                uri2.getClass();
                throw new WO(c2970uj, uri2, c3256xg0.l.l(), c3256xg0.m, e2);
            }
        }
    }

    public static C0032c m(C0083q1 c0083q1, I1 i1) {
        C0032c c0032c = new C0032c(i1.getLogger());
        U1 u1A = c0083q1.m.a();
        c0032c.u("sentry-trace_id", u1A != null ? u1A.l.toString() : null);
        c0032c.u("sentry-public_key", (String) new r(i1.getDsn()).b);
        c0032c.u("sentry-release", c0083q1.q);
        c0032c.u("sentry-environment", c0083q1.r);
        io.sentry.protocol.E e = c0083q1.t;
        c0032c.u("sentry-user_segment", e != null ? p(e) : null);
        c0032c.u("sentry-transaction", c0083q1.G);
        c0032c.u("sentry-sample_rate", null);
        c0032c.u("sentry-sampled", null);
        c0032c.b = false;
        return c0032c;
    }

    public static String p(io.sentry.protocol.E e) {
        String str = e.f120o;
        if (str != null) {
            return str;
        }
        Map map = e.s;
        if (map != null) {
            return (String) map.get("segment");
        }
        return null;
    }

    @Override // o.InterfaceC1405ee0
    public void a() {
        ((ConnectivityManager) ((InterfaceC2054lA) this.d).get()).unregisterNetworkCallback((C1503fe0) this.e);
    }

    @Override // o.VO
    public byte[] b(UUID uuid, C0509Ir c0509Ir) throws WO {
        String str;
        String str2 = c0509Ir.b;
        if (this.b || TextUtils.isEmpty(str2)) {
            str2 = (String) this.d;
        }
        if (TextUtils.isEmpty(str2)) {
            Map mapEmptyMap = Collections.emptyMap();
            Uri uri = Uri.EMPTY;
            AbstractC0397Ej.h(uri, "The uri must be set.");
            throw new WO(new C2970uj(uri, 0L, 1, null, mapEmptyMap, 0L, -1L, null, 0, null), uri, R60.r, 0L, new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        UUID uuid2 = AbstractC2661ra.e;
        if (uuid2.equals(uuid)) {
            str = "text/xml";
        } else {
            str = AbstractC2661ra.c.equals(uuid) ? "application/json" : "application/octet-stream";
        }
        map.put("Content-Type", str);
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (((HashMap) this.e)) {
            map.putAll((HashMap) this.e);
        }
        return l((InterfaceC2486pj) this.c, str2, c0509Ir.a, map);
    }

    @Override // o.VO
    public byte[] c(UUID uuid, C0535Jr c0535Jr) {
        return l((InterfaceC2486pj) this.c, c0535Jr.b + "&signedRequest=" + Lr0.o(c0535Jr.a), null, Collections.emptyMap());
    }

    @Override // o.InterfaceC1405ee0
    public boolean d() {
        InterfaceC2054lA interfaceC2054lA = (InterfaceC2054lA) this.d;
        this.b = ((ConnectivityManager) interfaceC2054lA.get()).getActiveNetwork() != null;
        try {
            ((ConnectivityManager) interfaceC2054lA.get()).registerDefaultNetworkCallback((C1503fe0) this.e);
            return true;
        } catch (RuntimeException unused) {
            Log.isLoggable("ConnectivityMonitor", 5);
            return false;
        }
    }

    public void e() {
        switch (this.a) {
            case 3:
                C1227cn c1227cn = (C1227cn) this.e;
                synchronized (c1227cn) {
                    try {
                        if (!(!this.b)) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                        if (AbstractC1474fG.b(((C0919Ym) this.c).g, this)) {
                            c1227cn.f(this, false);
                        }
                        this.b = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                C1325dn.a((C1325dn) this.e, this, false);
                return;
        }
    }

    public synchronized void f(InterfaceC2450pI interfaceC2450pI, C3372yq c3372yq) {
        C3296y1 c3296y1 = (C3296y1) ((HashMap) this.c).put(interfaceC2450pI, new C3296y1(interfaceC2450pI, c3372yq, (ReferenceQueue) this.d, this.b));
        if (c3296y1 != null) {
            c3296y1.c = null;
            c3296y1.clear();
        }
    }

    public boolean g(I6 i6, C0643Nw c0643Nw) {
        boolean zEquals = "audio/eac3-joc".equals(c0643Nw.w);
        int i = c0643Nw.J;
        if (zEquals && i == 16) {
            i = 12;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(Lr0.p(i));
        int i2 = c0643Nw.K;
        if (i2 != -1) {
            channelMask.setSampleRate(i2);
        }
        return ((Spatializer) this.c).canBeSpatialized((AudioAttributes) i6.a().m, channelMask.build());
    }

    public void h(C3296y1 c3296y1) {
        M70 m70;
        synchronized (this) {
            ((HashMap) this.c).remove(c3296y1.a);
            if (c3296y1.b && (m70 = c3296y1.c) != null) {
                ((C2597qq) ((InterfaceC3275xq) this.e)).e(c3296y1.a, new C3372yq(m70, true, false, c3296y1.a, (InterfaceC3275xq) this.e));
            }
        }
    }

    public void i() {
        C1227cn c1227cn = (C1227cn) this.e;
        synchronized (c1227cn) {
            try {
                if (!(!this.b)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (AbstractC1474fG.b(((C0919Ym) this.c).g, this)) {
                    c1227cn.f(this, true);
                }
                this.b = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void k() {
        C0919Ym c0919Ym = (C0919Ym) this.c;
        if (AbstractC1474fG.b(c0919Ym.g, this)) {
            C1227cn c1227cn = (C1227cn) this.e;
            if (c1227cn.w) {
                c1227cn.f(this, false);
            } else {
                c0919Ym.f = true;
            }
        }
    }

    public String n(String str) {
        return (String) ((Map) this.c).get(str);
    }

    public File o() {
        File file;
        synchronized (((C1325dn) this.e)) {
            try {
                C0945Zm c0945Zm = (C0945Zm) this.c;
                if (c0945Zm.f != this) {
                    throw new IllegalStateException();
                }
                if (!c0945Zm.e) {
                    ((boolean[]) this.d)[0] = true;
                }
                file = c0945Zm.d[0];
                ((C1325dn) this.e).l.mkdirs();
            } catch (Throwable th) {
                throw th;
            }
        }
        return file;
    }

    public int[] q() {
        synchronized (this) {
            try {
                if (!this.b) {
                    return null;
                }
                long[] jArr = (long[]) this.c;
                int length = jArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    int i4 = 1;
                    boolean z = jArr[i] > 0;
                    boolean[] zArr = (boolean[]) this.d;
                    if (z != zArr[i2]) {
                        int[] iArr = (int[]) this.e;
                        if (!z) {
                            i4 = 2;
                        }
                        iArr[i2] = i4;
                    } else {
                        ((int[]) this.e)[i2] = 0;
                    }
                    zArr[i2] = z;
                    i++;
                    i2 = i3;
                }
                this.b = false;
                return (int[]) ((int[]) this.e).clone();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public InterfaceC1991ke0 r(int i) {
        C1227cn c1227cn = (C1227cn) this.e;
        synchronized (c1227cn) {
            try {
                if (!(!this.b)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (!AbstractC1474fG.b(((C0919Ym) this.c).g, this)) {
                    return new T8();
                }
                if (!((C0919Ym) this.c).e) {
                    boolean[] zArr = (boolean[]) this.d;
                    AbstractC1474fG.g(zArr);
                    zArr[i] = true;
                }
                try {
                    return new C0666Ot(c1227cn.l.F((File) ((C0919Ym) this.c).d.get(i)), new io.sentry.android.replay.capture.e(c1227cn, 4, this));
                } catch (FileNotFoundException unused) {
                    return new T8();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean s(int... iArr) {
        boolean z;
        AbstractC1474fG.j(iArr, "tableIds");
        synchronized (this) {
            z = false;
            for (int i : iArr) {
                long[] jArr = (long[]) this.c;
                long j = jArr[i];
                jArr[i] = 1 + j;
                if (j == 0) {
                    z = true;
                    this.b = true;
                }
            }
        }
        return z;
    }

    public boolean t(int... iArr) {
        boolean z;
        AbstractC1474fG.j(iArr, "tableIds");
        synchronized (this) {
            z = false;
            for (int i : iArr) {
                long[] jArr = (long[]) this.c;
                long j = jArr[i];
                jArr[i] = j - 1;
                if (j == 1) {
                    z = true;
                    this.b = true;
                }
            }
        }
        return z;
    }

    public void u(String str, String str2) {
        if (this.b) {
            ((Map) this.c).put(str, str2);
        }
    }

    public void v(String str, String str2) {
        str.getClass();
        str2.getClass();
        synchronized (((HashMap) this.e)) {
            ((HashMap) this.e).put(str, str2);
        }
    }

    public void w(W w, io.sentry.protocol.E e, io.sentry.protocol.t tVar, I1 i1, e2 e2Var) {
        u("sentry-trace_id", w.k().l.toString());
        u("sentry-public_key", (String) new r(i1.getDsn()).b);
        u("sentry-release", i1.getRelease());
        u("sentry-environment", i1.getEnvironment());
        u("sentry-user_segment", e != null ? p(e) : null);
        io.sentry.protocol.C cS = w.s();
        u("sentry-transaction", (cS == null || io.sentry.protocol.C.URL.equals(cS)) ? null : w.getName());
        if (tVar != null && !io.sentry.protocol.t.m.equals(tVar)) {
            u("sentry-replay_id", tVar.toString());
        }
        Double d = e2Var == null ? null : (Double) e2Var.c;
        u("sentry-sample_rate", !io.sentry.config.a.x(d, false) ? null : new DecimalFormat("#.################", DecimalFormatSymbols.getInstance(Locale.ROOT)).format(d));
        Boolean bool = e2Var == null ? null : (Boolean) e2Var.a;
        u("sentry-sampled", bool != null ? bool.toString() : null);
    }

    public d2 x() {
        String strN = n("sentry-trace_id");
        String strN2 = n("sentry-replay_id");
        String strN3 = n("sentry-public_key");
        if (strN == null || strN3 == null) {
            return null;
        }
        d2 d2Var = new d2(new io.sentry.protocol.t(strN), strN3, n("sentry-release"), n("sentry-environment"), n("sentry-user_id"), n("sentry-user_segment"), n("sentry-transaction"), n("sentry-sample_rate"), n("sentry-sampled"), strN2 == null ? null : new io.sentry.protocol.t(strN2));
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry entry : ((Map) this.c).entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (!AbstractC0029b.a.contains(str) && str2 != null) {
                concurrentHashMap.put(str.replaceFirst("sentry-", ""), str2);
            }
        }
        d2Var.v = concurrentHashMap;
        return d2Var;
    }

    public C0032c(String str, boolean z, InterfaceC2486pj interfaceC2486pj) {
        this.a = 6;
        AbstractC0397Ej.c((z && TextUtils.isEmpty(str)) ? false : true);
        this.c = interfaceC2486pj;
        this.d = str;
        this.b = z;
        this.e = new HashMap();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0032c(ILogger iLogger) {
        this(new HashMap(), null, true, iLogger);
        this.a = 0;
    }

    public C0032c(Map map, String str, boolean z, ILogger iLogger) {
        this.a = 0;
        this.c = map;
        this.e = iLogger;
        this.b = z;
        this.d = str;
    }

    public C0032c(C3257xh c3257xh, C1308de0 c1308de0) {
        this.a = 9;
        this.e = new C1503fe0(this);
        this.d = c3257xh;
        this.c = c1308de0;
    }

    public C0032c(int i) {
        this.a = 7;
        this.c = new long[i];
        this.d = new boolean[i];
        this.e = new int[i];
    }

    public C0032c(C1325dn c1325dn, C0945Zm c0945Zm) {
        this.a = 4;
        this.e = c1325dn;
        this.c = c0945Zm;
        this.d = c0945Zm.e ? null : new boolean[c1325dn.r];
    }

    public C0032c(C1227cn c1227cn, C0919Ym c0919Ym) {
        boolean[] zArr;
        this.a = 3;
        this.e = c1227cn;
        this.c = c0919Ym;
        if (c0919Ym.e) {
            zArr = null;
        } else {
            c1227cn.getClass();
            zArr = new boolean[2];
        }
        this.d = zArr;
    }

    public C0032c(Xs0 xs0, SO so) {
        this.a = 8;
        this.c = so;
        new ArrayDeque();
        new ArrayDeque();
        this.b = true;
        C1045at0 c1045at0 = C1045at0.p;
    }

    public C0032c(Spatializer spatializer) {
        this.a = 2;
        this.c = spatializer;
        this.b = spatializer.getImmersiveAudioLevel() != 0;
    }
}
