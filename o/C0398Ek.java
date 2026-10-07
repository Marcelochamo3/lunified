package o;

import android.media.ResourceBusyException;
import android.media.UnsupportedSchemeException;
import android.os.Handler;
import android.os.Looper;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: renamed from: o.Ek, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0398Ek implements InterfaceC0428Fo {
    public InterfaceC0561Kr A;
    public C0294Ak B;
    public C0294Ak C;
    public Looper D;
    public Handler E;
    public int F;
    public byte[] G;
    public C3436zZ H;
    public volatile HandlerC2232n2 I;
    public final UUID l;
    public final C0633Nm m;
    public final VO n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final HashMap f246o;
    public final boolean p;
    public final int[] q;
    public final boolean r;
    public final C2720s4 s;
    public final C0622Nb t;
    public final C0320Bk u;
    public final long v;
    public final ArrayList w;
    public final Set x;
    public final Set y;
    public int z;

    public C0398Ek(UUID uuid, C0633Nm c0633Nm, VO vo, HashMap map, boolean z, int[] iArr, boolean z2, C0622Nb c0622Nb, long j) {
        uuid.getClass();
        AbstractC0397Ej.b("Use C.CLEARKEY_UUID instead", !AbstractC2661ra.b.equals(uuid));
        this.l = uuid;
        this.m = c0633Nm;
        this.n = vo;
        this.f246o = map;
        this.p = z;
        this.q = iArr;
        this.r = z2;
        this.t = c0622Nb;
        this.s = new C2720s4(21, (byte) 0);
        this.u = new C0320Bk(this);
        this.F = 0;
        this.w = new ArrayList();
        this.x = Collections.newSetFromMap(new IdentityHashMap());
        this.y = Collections.newSetFromMap(new IdentityHashMap());
        this.v = j;
    }

    public static boolean c(C0294Ak c0294Ak) {
        c0294Ak.p();
        if (c0294Ak.p == 1) {
            if (Lr0.a < 19) {
                return true;
            }
            C3368yo c3368yoF = c0294Ak.f();
            c3368yoF.getClass();
            if (c3368yoF.getCause() instanceof ResourceBusyException) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList g(C3271xo c3271xo, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(c3271xo.f1124o);
        for (int i = 0; i < c3271xo.f1124o; i++) {
            C3174wo c3174wo = c3271xo.l[i];
            if ((c3174wo.a(uuid) || (AbstractC2661ra.c.equals(uuid) && c3174wo.a(AbstractC2661ra.b))) && (c3174wo.p != null || z)) {
                arrayList.add(c3174wo);
            }
        }
        return arrayList;
    }

    @Override // o.InterfaceC0428Fo
    public final InterfaceC3465zo B(C0350Co c0350Co, C0643Nw c0643Nw) {
        i(false);
        AbstractC0397Ej.f(this.z > 0);
        AbstractC0397Ej.g(this.D);
        return b(this.D, c0350Co, c0643Nw, true);
    }

    @Override // o.InterfaceC0428Fo
    public final void a() {
        i(true);
        int i = this.z - 1;
        this.z = i;
        if (i != 0) {
            return;
        }
        if (this.v != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.w);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((C0294Ak) arrayList.get(i2)).d(null);
            }
        }
        Aq0 it = AbstractC1571gF.l(this.x).iterator();
        while (it.hasNext()) {
            ((C0372Dk) it.next()).a();
        }
        h();
    }

    public final InterfaceC3465zo b(Looper looper, C0350Co c0350Co, C0643Nw c0643Nw, boolean z) {
        ArrayList arrayListG;
        if (this.I == null) {
            this.I = new HandlerC2232n2(this, looper, 3);
        }
        C3271xo c3271xo = c0643Nw.z;
        int i = 0;
        C0294Ak c0294AkF = null;
        if (c3271xo == null) {
            int i2 = IQ.i(c0643Nw.w);
            InterfaceC0561Kr interfaceC0561Kr = this.A;
            interfaceC0561Kr.getClass();
            if (interfaceC0561Kr.o() == 2 && C2322ny.d) {
                return null;
            }
            int[] iArr = this.q;
            while (true) {
                if (i >= iArr.length) {
                    i = -1;
                    break;
                }
                if (iArr[i] == i2) {
                    break;
                }
                i++;
            }
            if (i == -1 || interfaceC0561Kr.o() == 1) {
                return null;
            }
            C0294Ak c0294Ak = this.B;
            if (c0294Ak == null) {
                XE xe = AbstractC0985aF.m;
                C0294Ak c0294AkF2 = f(M60.p, true, null, z);
                this.w.add(c0294AkF2);
                this.B = c0294AkF2;
            } else {
                c0294Ak.b(null);
            }
            return this.B;
        }
        if (this.G == null) {
            arrayListG = g(c3271xo, this.l, false);
            if (arrayListG.isEmpty()) {
                C0346Ck c0346Ck = new C0346Ck("Media does not support uuid: " + this.l);
                AP.g("DRM error", c0346Ck);
                if (c0350Co != null) {
                    c0350Co.e(c0346Ck);
                }
                return new C0741Rq(new C3368yo(6003, c0346Ck));
            }
        } else {
            arrayListG = null;
        }
        if (this.p) {
            for (C0294Ak c0294Ak2 : this.w) {
                if (Lr0.a(c0294Ak2.a, arrayListG)) {
                    c0294AkF = c0294Ak2;
                    break;
                }
            }
        } else {
            c0294AkF = this.C;
        }
        if (c0294AkF == null) {
            c0294AkF = f(arrayListG, false, c0350Co, z);
            if (!this.p) {
                this.C = c0294AkF;
            }
            this.w.add(c0294AkF);
        } else {
            c0294AkF.b(c0350Co);
        }
        return c0294AkF;
    }

    @Override // o.InterfaceC0428Fo
    public final void d(Looper looper, C3436zZ c3436zZ) {
        synchronized (this) {
            try {
                Looper looper2 = this.D;
                if (looper2 == null) {
                    this.D = looper;
                    this.E = new Handler(looper);
                } else {
                    AbstractC0397Ej.f(looper2 == looper);
                    this.E.getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.H = c3436zZ;
    }

    public final C0294Ak e(List list, boolean z, C0350Co c0350Co) {
        this.A.getClass();
        boolean z2 = this.r | z;
        InterfaceC0561Kr interfaceC0561Kr = this.A;
        int i = this.F;
        byte[] bArr = this.G;
        Looper looper = this.D;
        looper.getClass();
        C3436zZ c3436zZ = this.H;
        c3436zZ.getClass();
        C0294Ak c0294Ak = new C0294Ak(this.l, interfaceC0561Kr, this.s, this.u, list, i, z2, z, bArr, this.f246o, this.n, looper, this.t, c3436zZ);
        c0294Ak.b(c0350Co);
        if (this.v != -9223372036854775807L) {
            c0294Ak.b(null);
        }
        return c0294Ak;
    }

    public final C0294Ak f(List list, boolean z, C0350Co c0350Co, boolean z2) {
        C0294Ak c0294AkE = e(list, z, c0350Co);
        boolean zC = c(c0294AkE);
        long j = this.v;
        Set set = this.y;
        if (zC && !set.isEmpty()) {
            Aq0 it = AbstractC1571gF.l(set).iterator();
            while (it.hasNext()) {
                ((InterfaceC3465zo) it.next()).d(null);
            }
            c0294AkE.d(c0350Co);
            if (j != -9223372036854775807L) {
                c0294AkE.d(null);
            }
            c0294AkE = e(list, z, c0350Co);
        }
        if (!c(c0294AkE) || !z2) {
            return c0294AkE;
        }
        Set set2 = this.x;
        if (set2.isEmpty()) {
            return c0294AkE;
        }
        Aq0 it2 = AbstractC1571gF.l(set2).iterator();
        while (it2.hasNext()) {
            ((C0372Dk) it2.next()).a();
        }
        if (!set.isEmpty()) {
            Aq0 it3 = AbstractC1571gF.l(set).iterator();
            while (it3.hasNext()) {
                ((InterfaceC3465zo) it3.next()).d(null);
            }
        }
        c0294AkE.d(c0350Co);
        if (j != -9223372036854775807L) {
            c0294AkE.d(null);
        }
        return e(list, z, c0350Co);
    }

    public final void h() {
        if (this.A != null && this.z == 0 && this.w.isEmpty() && this.x.isEmpty()) {
            InterfaceC0561Kr interfaceC0561Kr = this.A;
            interfaceC0561Kr.getClass();
            interfaceC0561Kr.a();
            this.A = null;
        }
    }

    public final void i(boolean z) {
        if (z && this.D == null) {
            AP.A("DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.D;
        looper.getClass();
        if (threadCurrentThread != looper.getThread()) {
            AP.A("DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.D.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // o.InterfaceC0428Fo
    public final InterfaceC0402Eo k(C0350Co c0350Co, C0643Nw c0643Nw) {
        AbstractC0397Ej.f(this.z > 0);
        AbstractC0397Ej.g(this.D);
        C0372Dk c0372Dk = new C0372Dk(this, c0350Co);
        Handler handler = this.E;
        handler.getClass();
        handler.post(new O3(c0372Dk, 4, c0643Nw));
        return c0372Dk;
    }

    @Override // o.InterfaceC0428Fo
    public final int o(C0643Nw c0643Nw) {
        String str;
        i(false);
        InterfaceC0561Kr interfaceC0561Kr = this.A;
        interfaceC0561Kr.getClass();
        int iO = interfaceC0561Kr.o();
        C3271xo c3271xo = c0643Nw.z;
        if (c3271xo == null) {
            int i = IQ.i(c0643Nw.w);
            int i2 = 0;
            while (true) {
                int[] iArr = this.q;
                if (i2 >= iArr.length) {
                    i2 = -1;
                    break;
                }
                if (iArr[i2] == i) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                return iO;
            }
            return 0;
        }
        if (this.G != null) {
            return iO;
        }
        UUID uuid = this.l;
        if (!g(c3271xo, uuid, true).isEmpty()) {
            str = c3271xo.n;
            if (str == null && !"cenc".equals(str)) {
                if ("cbcs".equals(str)) {
                    if (Lr0.a >= 25) {
                        return iO;
                    }
                } else if (!"cbc1".equals(str) && !"cens".equals(str)) {
                    return iO;
                }
            }
        } else if (c3271xo.f1124o == 1 && c3271xo.l[0].a(AbstractC2661ra.b)) {
            Objects.toString(uuid);
            AP.z();
            str = c3271xo.n;
            return str == null ? iO : iO;
        }
        return 1;
    }

    @Override // o.InterfaceC0428Fo
    public final void r() {
        InterfaceC0561Kr c0519Jb;
        i(true);
        int i = this.z;
        this.z = i + 1;
        if (i != 0) {
            return;
        }
        if (this.A == null) {
            UUID uuid = this.l;
            this.m.getClass();
            try {
                try {
                    try {
                        c0519Jb = new C2613qy(uuid);
                    } catch (UnsupportedSchemeException e) {
                        throw new Lq0(e);
                    }
                } catch (Exception e2) {
                    throw new Lq0(e2);
                }
            } catch (Lq0 unused) {
                Objects.toString(uuid);
                AP.f();
                c0519Jb = new C0519Jb(13);
            }
            this.A = c0519Jb;
            c0519Jb.u(new C0320Bk(this));
            return;
        }
        if (this.v == -9223372036854775807L) {
            return;
        }
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.w;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((C0294Ak) arrayList.get(i2)).b(null);
            i2++;
        }
    }
}
