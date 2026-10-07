package o;

import android.content.Context;
import android.os.Looper;
import java.util.HashMap;

/* JADX INFO: renamed from: o.Nr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0638Nr {
    public final Context a;
    public final Sh0 b;
    public Gh0 c;
    public final Gh0 d;
    public Gh0 e;
    public Gh0 f;
    public final Gh0 g;
    public final InterfaceC0671Oy h;
    public final Looper i;
    public final I6 j;
    public final int k;
    public final boolean l;
    public final C2761sb0 m;
    public final long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f418o;
    public final C1809il p;
    public final long q;
    public final long r;
    public final boolean s;
    public boolean t;

    public C0638Nr(final Context context) {
        final int i = 2;
        final int i2 = 0;
        Gh0 gh0 = new Gh0() { // from class: o.Mr
            @Override // o.Gh0
            public final Object get() {
                C2197mk c2197mk;
                switch (i2) {
                    case 0:
                        return new C3168wl(context);
                    case 1:
                        return new C2393ol(new C2720s4(context, new C0709Qk(0)), new C0580Lk());
                    case 2:
                        return new C1128bm(context);
                    default:
                        Context context2 = context;
                        M60 m60 = C2197mk.n;
                        synchronized (C2197mk.class) {
                            try {
                                if (C2197mk.t == null) {
                                    C2100lk c2100lk = new C2100lk(context2);
                                    C2197mk.t = new C2197mk((Context) c2100lk.c, (HashMap) c2100lk.d, c2100lk.a, (Sh0) c2100lk.e, c2100lk.b);
                                }
                                c2197mk = C2197mk.t;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return c2197mk;
                }
            }
        };
        final int i3 = 1;
        Gh0 gh1 = new Gh0() { // from class: o.Mr
            @Override // o.Gh0
            public final Object get() {
                C2197mk c2197mk;
                switch (i3) {
                    case 0:
                        return new C3168wl(context);
                    case 1:
                        return new C2393ol(new C2720s4(context, new C0709Qk(0)), new C0580Lk());
                    case 2:
                        return new C1128bm(context);
                    default:
                        Context context2 = context;
                        M60 m60 = C2197mk.n;
                        synchronized (C2197mk.class) {
                            try {
                                if (C2197mk.t == null) {
                                    C2100lk c2100lk = new C2100lk(context2);
                                    C2197mk.t = new C2197mk((Context) c2100lk.c, (HashMap) c2100lk.d, c2100lk.a, (Sh0) c2100lk.e, c2100lk.b);
                                }
                                c2197mk = C2197mk.t;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return c2197mk;
                }
            }
        };
        Gh0 gh2 = new Gh0() { // from class: o.Mr
            @Override // o.Gh0
            public final Object get() {
                C2197mk c2197mk;
                switch (i) {
                    case 0:
                        return new C3168wl(context);
                    case 1:
                        return new C2393ol(new C2720s4(context, new C0709Qk(0)), new C0580Lk());
                    case 2:
                        return new C1128bm(context);
                    default:
                        Context context2 = context;
                        M60 m60 = C2197mk.n;
                        synchronized (C2197mk.class) {
                            try {
                                if (C2197mk.t == null) {
                                    C2100lk c2100lk = new C2100lk(context2);
                                    C2197mk.t = new C2197mk((Context) c2100lk.c, (HashMap) c2100lk.d, c2100lk.a, (Sh0) c2100lk.e, c2100lk.b);
                                }
                                c2197mk = C2197mk.t;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return c2197mk;
                }
            }
        };
        C2877tl c2877tl = new C2877tl(1);
        final int i4 = 3;
        Gh0 gh3 = new Gh0() { // from class: o.Mr
            @Override // o.Gh0
            public final Object get() {
                C2197mk c2197mk;
                switch (i4) {
                    case 0:
                        return new C3168wl(context);
                    case 1:
                        return new C2393ol(new C2720s4(context, new C0709Qk(0)), new C0580Lk());
                    case 2:
                        return new C1128bm(context);
                    default:
                        Context context2 = context;
                        M60 m60 = C2197mk.n;
                        synchronized (C2197mk.class) {
                            try {
                                if (C2197mk.t == null) {
                                    C2100lk c2100lk = new C2100lk(context2);
                                    C2197mk.t = new C2197mk((Context) c2100lk.c, (HashMap) c2100lk.d, c2100lk.a, (Sh0) c2100lk.e, c2100lk.b);
                                }
                                c2197mk = C2197mk.t;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return c2197mk;
                }
            }
        };
        C0633Nm c0633Nm = new C0633Nm(2);
        this.a = context;
        this.c = gh0;
        this.d = gh1;
        this.e = gh2;
        this.f = c2877tl;
        this.g = gh3;
        this.h = c0633Nm;
        int i5 = Lr0.a;
        Looper looperMyLooper = Looper.myLooper();
        this.i = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
        this.j = I6.r;
        this.k = 1;
        this.l = true;
        this.m = C2761sb0.d;
        this.n = 5000L;
        this.f418o = 15000L;
        this.p = new C1809il(Lr0.K(20L), Lr0.K(500L), 0.999f);
        this.b = Sh0.a;
        this.q = 500L;
        this.r = 2000L;
        this.s = true;
    }
}
