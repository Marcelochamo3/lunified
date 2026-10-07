package o;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: renamed from: o.Ak, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0294Ak implements InterfaceC3465zo {
    public final List a;
    public final InterfaceC0561Kr b;
    public final C2720s4 c;
    public final C0320Bk d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final HashMap h;
    public final C0862Wh i;
    public final C0622Nb j;
    public final C3436zZ k;
    public final VO l;
    public final UUID m;
    public final Looper n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final HandlerC2232n2 f177o;
    public int p;
    public int q;
    public HandlerThread r;
    public HandlerC3360yk s;
    public InterfaceC2871ti t;
    public C3368yo u;
    public byte[] v;
    public byte[] w;
    public C0509Ir x;
    public C0535Jr y;

    public C0294Ak(UUID uuid, InterfaceC0561Kr interfaceC0561Kr, C2720s4 c2720s4, C0320Bk c0320Bk, List list, int i, boolean z, boolean z2, byte[] bArr, HashMap map, VO vo, Looper looper, C0622Nb c0622Nb, C3436zZ c3436zZ) {
        if (i == 1 || i == 3) {
            bArr.getClass();
        }
        this.m = uuid;
        this.c = c2720s4;
        this.d = c0320Bk;
        this.b = interfaceC0561Kr;
        this.e = i;
        this.f = z;
        this.g = z2;
        if (bArr != null) {
            this.w = bArr;
            this.a = null;
        } else {
            list.getClass();
            this.a = Collections.unmodifiableList(list);
        }
        this.h = map;
        this.l = vo;
        this.i = new C0862Wh();
        this.j = c0622Nb;
        this.k = c3436zZ;
        this.p = 2;
        this.n = looper;
        this.f177o = new HandlerC2232n2(this, looper, 2);
    }

    @Override // o.InterfaceC3465zo
    public final boolean a() {
        p();
        return this.f;
    }

    @Override // o.InterfaceC3465zo
    public final void b(C0350Co c0350Co) {
        p();
        if (this.q < 0) {
            AP.f();
            this.q = 0;
        }
        if (c0350Co != null) {
            C0862Wh c0862Wh = this.i;
            synchronized (c0862Wh.l) {
                try {
                    ArrayList arrayList = new ArrayList(c0862Wh.f601o);
                    arrayList.add(c0350Co);
                    c0862Wh.f601o = Collections.unmodifiableList(arrayList);
                    Integer num = (Integer) c0862Wh.m.get(c0350Co);
                    if (num == null) {
                        HashSet hashSet = new HashSet(c0862Wh.n);
                        hashSet.add(c0350Co);
                        c0862Wh.n = Collections.unmodifiableSet(hashSet);
                    }
                    c0862Wh.m.put(c0350Co, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        int i = this.q + 1;
        this.q = i;
        if (i == 1) {
            AbstractC0397Ej.f(this.p == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.r = handlerThread;
            handlerThread.start();
            this.s = new HandlerC3360yk(this, this.r.getLooper());
            if (m()) {
                i(true);
            }
        } else if (c0350Co != null && j() && this.i.a(c0350Co) == 1) {
            c0350Co.d(this.p);
        }
        C0398Ek c0398Ek = this.d.a;
        if (c0398Ek.v != -9223372036854775807L) {
            c0398Ek.y.remove(this);
            Handler handler = c0398Ek.E;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // o.InterfaceC3465zo
    public final UUID c() {
        p();
        return this.m;
    }

    @Override // o.InterfaceC3465zo
    public final void d(C0350Co c0350Co) {
        p();
        int i = this.q;
        if (i <= 0) {
            AP.f();
            return;
        }
        int i2 = i - 1;
        this.q = i2;
        if (i2 == 0) {
            this.p = 0;
            HandlerC2232n2 handlerC2232n2 = this.f177o;
            int i3 = Lr0.a;
            handlerC2232n2.removeCallbacksAndMessages(null);
            HandlerC3360yk handlerC3360yk = this.s;
            synchronized (handlerC3360yk) {
                handlerC3360yk.removeCallbacksAndMessages(null);
                handlerC3360yk.a = true;
            }
            this.s = null;
            this.r.quit();
            this.r = null;
            this.t = null;
            this.u = null;
            this.x = null;
            this.y = null;
            byte[] bArr = this.v;
            if (bArr != null) {
                this.b.h(bArr);
                this.v = null;
            }
        }
        if (c0350Co != null) {
            this.i.d(c0350Co);
            if (this.i.a(c0350Co) == 0) {
                c0350Co.f();
            }
        }
        C0320Bk c0320Bk = this.d;
        int i4 = this.q;
        C0398Ek c0398Ek = c0320Bk.a;
        if (i4 == 1 && c0398Ek.z > 0 && c0398Ek.v != -9223372036854775807L) {
            c0398Ek.y.add(this);
            Handler handler = c0398Ek.E;
            handler.getClass();
            handler.postAtTime(new Jj0(11, this), this, SystemClock.uptimeMillis() + c0398Ek.v);
        } else if (i4 == 0) {
            c0398Ek.w.remove(this);
            if (c0398Ek.B == this) {
                c0398Ek.B = null;
            }
            if (c0398Ek.C == this) {
                c0398Ek.C = null;
            }
            C2720s4 c2720s4 = c0398Ek.s;
            HashSet hashSet = (HashSet) c2720s4.m;
            hashSet.remove(this);
            if (((C0294Ak) c2720s4.n) == this) {
                c2720s4.n = null;
                if (!hashSet.isEmpty()) {
                    C0294Ak c0294Ak = (C0294Ak) hashSet.iterator().next();
                    c2720s4.n = c0294Ak;
                    C0535Jr c0535JrK = c0294Ak.b.k();
                    c0294Ak.y = c0535JrK;
                    HandlerC3360yk handlerC3360yk2 = c0294Ak.s;
                    int i5 = Lr0.a;
                    c0535JrK.getClass();
                    handlerC3360yk2.getClass();
                    handlerC3360yk2.obtainMessage(0, new C3457zk(C0991aL.a.getAndIncrement(), true, SystemClock.elapsedRealtime(), c0535JrK)).sendToTarget();
                }
            }
            if (c0398Ek.v != -9223372036854775807L) {
                Handler handler2 = c0398Ek.E;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                c0398Ek.y.remove(this);
            }
        }
        c0398Ek.h();
    }

    @Override // o.InterfaceC3465zo
    public final boolean e(String str) {
        p();
        byte[] bArr = this.v;
        AbstractC0397Ej.g(bArr);
        return this.b.w(str, bArr);
    }

    @Override // o.InterfaceC3465zo
    public final C3368yo f() {
        p();
        if (this.p == 1) {
            return this.u;
        }
        return null;
    }

    @Override // o.InterfaceC3465zo
    public final InterfaceC2871ti g() {
        p();
        return this.t;
    }

    @Override // o.InterfaceC3465zo
    public final int getState() {
        p();
        return this.p;
    }

    public final void h(C0838Vj c0838Vj) {
        Set set;
        C0862Wh c0862Wh = this.i;
        synchronized (c0862Wh.l) {
            set = c0862Wh.n;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((C0350Co) it.next()).a();
        }
    }

    public final void i(boolean z) {
        long j;
        Pair pair;
        long jMin;
        Set set;
        if (this.g) {
            return;
        }
        byte[] bArr = this.v;
        int i = Lr0.a;
        int i2 = this.e;
        if (i2 != 0 && i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                this.w.getClass();
                this.v.getClass();
                n(this.w, 3, z);
                return;
            }
            byte[] bArr2 = this.w;
            if (bArr2 != null) {
                try {
                    this.b.e(bArr, bArr2);
                } catch (Exception e) {
                    k(e, 1);
                    return;
                }
            }
            n(bArr, 2, z);
            return;
        }
        byte[] bArr3 = this.w;
        if (bArr3 == null) {
            n(bArr, 1, z);
            return;
        }
        if (this.p != 4) {
            try {
                this.b.e(bArr, bArr3);
            } catch (Exception e2) {
                k(e2, 1);
                return;
            }
        }
        if (AbstractC2661ra.d.equals(this.m)) {
            Map mapO = o();
            if (mapO == null) {
                pair = null;
            } else {
                long j2 = -9223372036854775807L;
                try {
                    String str = (String) mapO.get("LicenseDurationRemaining");
                    j = str != null ? Long.parseLong(str) : -9223372036854775807L;
                } catch (NumberFormatException unused) {
                }
                Long lValueOf = Long.valueOf(j);
                try {
                    String str2 = (String) mapO.get("PlaybackDurationRemaining");
                    if (str2 != null) {
                        j2 = Long.parseLong(str2);
                    }
                } catch (NumberFormatException unused2) {
                }
                pair = new Pair(lValueOf, Long.valueOf(j2));
            }
            pair.getClass();
            jMin = Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
        } else {
            jMin = Long.MAX_VALUE;
        }
        if (this.e == 0 && jMin <= 60) {
            AP.c();
            n(bArr, 2, z);
        } else {
            if (jMin <= 0) {
                k(new C2934uI(), 2);
                return;
            }
            this.p = 4;
            C0862Wh c0862Wh = this.i;
            synchronized (c0862Wh.l) {
                set = c0862Wh.n;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((C0350Co) it.next()).c();
            }
        }
    }

    public final boolean j() {
        int i = this.p;
        return i == 3 || i == 4;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    public final void k(Exception exc, int i) {
        int iB;
        Set set;
        int i2 = Lr0.a;
        if (i2 >= 21 && AbstractC0506Io.a(exc)) {
            iB = AbstractC0506Io.b(exc);
        } else if (i2 >= 23 && AbstractC0532Jo.a(exc)) {
            iB = 6006;
        } else if (i2 >= 18 && AbstractC0480Ho.b(exc)) {
            iB = 6002;
        } else if (i2 >= 18 && AbstractC0480Ho.a(exc)) {
            iB = 6007;
        } else if (exc instanceof Lq0) {
            iB = 6001;
        } else if (exc instanceof C0346Ck) {
            iB = 6003;
        } else if (exc instanceof C2934uI) {
            iB = 6008;
        } else if (i == 1) {
            iB = 6006;
        } else if (i == 2) {
            iB = 6004;
        } else {
            if (i != 3) {
                throw new IllegalArgumentException();
            }
            iB = 6002;
        }
        this.u = new C3368yo(iB, exc);
        AP.g("DRM session error", exc);
        C0862Wh c0862Wh = this.i;
        synchronized (c0862Wh.l) {
            set = c0862Wh.n;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((C0350Co) it.next()).e(exc);
        }
        if (this.p != 4) {
            this.p = 1;
        }
    }

    public final void l(Exception exc, boolean z) {
        if (!(exc instanceof NotProvisionedException)) {
            k(exc, z ? 1 : 2);
            return;
        }
        C2720s4 c2720s4 = this.c;
        ((HashSet) c2720s4.m).add(this);
        if (((C0294Ak) c2720s4.n) != null) {
            return;
        }
        c2720s4.n = this;
        C0535Jr c0535JrK = this.b.k();
        this.y = c0535JrK;
        HandlerC3360yk handlerC3360yk = this.s;
        int i = Lr0.a;
        c0535JrK.getClass();
        handlerC3360yk.getClass();
        handlerC3360yk.obtainMessage(0, new C3457zk(C0991aL.a.getAndIncrement(), true, SystemClock.elapsedRealtime(), c0535JrK)).sendToTarget();
    }

    public final boolean m() {
        Set set;
        if (j()) {
            return true;
        }
        try {
            byte[] bArrY = this.b.y();
            this.v = bArrY;
            this.b.d(bArrY, this.k);
            this.t = this.b.v(this.v);
            this.p = 3;
            C0862Wh c0862Wh = this.i;
            synchronized (c0862Wh.l) {
                set = c0862Wh.n;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((C0350Co) it.next()).d(3);
            }
            this.v.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            C2720s4 c2720s4 = this.c;
            ((HashSet) c2720s4.m).add(this);
            if (((C0294Ak) c2720s4.n) == null) {
                c2720s4.n = this;
                C0535Jr c0535JrK = this.b.k();
                this.y = c0535JrK;
                HandlerC3360yk handlerC3360yk = this.s;
                int i = Lr0.a;
                c0535JrK.getClass();
                handlerC3360yk.getClass();
                handlerC3360yk.obtainMessage(0, new C3457zk(C0991aL.a.getAndIncrement(), true, SystemClock.elapsedRealtime(), c0535JrK)).sendToTarget();
            }
            return false;
        } catch (Exception e) {
            k(e, 1);
            return false;
        }
    }

    public final void n(byte[] bArr, int i, boolean z) {
        try {
            C0509Ir c0509IrN = this.b.n(bArr, this.a, i, this.h);
            this.x = c0509IrN;
            HandlerC3360yk handlerC3360yk = this.s;
            int i2 = Lr0.a;
            c0509IrN.getClass();
            handlerC3360yk.getClass();
            handlerC3360yk.obtainMessage(1, new C3457zk(C0991aL.a.getAndIncrement(), z, SystemClock.elapsedRealtime(), c0509IrN)).sendToTarget();
        } catch (Exception e) {
            l(e, true);
        }
    }

    public final Map o() {
        p();
        byte[] bArr = this.v;
        if (bArr == null) {
            return null;
        }
        return this.b.g(bArr);
    }

    public final void p() {
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.n;
        if (threadCurrentThread != looper.getThread()) {
            AP.A("DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
