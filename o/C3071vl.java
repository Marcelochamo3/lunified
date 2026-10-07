package o;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* JADX INFO: renamed from: o.vl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3071vl {
    public static final C2877tl h = new C2877tl(0);
    public static final Random i = new Random();
    public C2747sP d;
    public String f;
    public final Ej0 a = new Ej0();
    public final Dj0 b = new Dj0();
    public final HashMap c = new HashMap();
    public Fj0 e = Fj0.l;
    public long g = -1;

    public final void a(C2974ul c2974ul) {
        long j = c2974ul.c;
        if (j != -1) {
            this.g = j;
        }
        this.f = null;
    }

    public final synchronized void b(C3201x2 c3201x2) {
        C2747sP c2747sP;
        try {
            String str = this.f;
            if (str != null) {
                C2974ul c2974ul = (C2974ul) this.c.get(str);
                c2974ul.getClass();
                a(c2974ul);
            }
            Iterator it = this.c.values().iterator();
            while (it.hasNext()) {
                C2974ul c2974ul2 = (C2974ul) it.next();
                it.remove();
                if (c2974ul2.e && (c2747sP = this.d) != null) {
                    c2747sP.d(c3201x2, c2974ul2.a);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0045  */
    /* JADX WARN: Code duplicated, block: B:39:0x0086  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public final C2974ul c(int i2, CP cp) {
        long j;
        long j2;
        HashMap map = this.c;
        C2974ul c2974ul = null;
        long j3 = Long.MAX_VALUE;
        for (C2974ul c2974ul2 : map.values()) {
            if (c2974ul2.c == -1 && i2 == c2974ul2.b && cp != null) {
                C3071vl c3071vl = c2974ul2.g;
                C2974ul c2974ul3 = (C2974ul) c3071vl.c.get(c3071vl.f);
                if (c2974ul3 != null) {
                    j2 = c2974ul3.c;
                    if (j2 == -1) {
                        j2 = 1 + c3071vl.g;
                    }
                } else {
                    j2 = 1 + c3071vl.g;
                }
                long j4 = cp.d;
                if (j4 >= j2) {
                    c2974ul2.c = j4;
                }
            }
            CP cp2 = c2974ul2.d;
            if (cp != null) {
                long j5 = cp.d;
                if (cp2 == null) {
                    if (!cp.a() && j5 == c2974ul2.c) {
                        j = c2974ul2.c;
                        if (j != -1) {
                        }
                        c2974ul = c2974ul2;
                        j3 = j;
                    }
                } else if (j5 == cp2.d && cp.b == cp2.b && cp.c == cp2.c) {
                    j = c2974ul2.c;
                    if (j != -1) {
                    }
                    c2974ul = c2974ul2;
                    j3 = j;
                }
            } else if (i2 == c2974ul2.b) {
                j = c2974ul2.c;
                if (j != -1 || j < j3) {
                    c2974ul = c2974ul2;
                    j3 = j;
                } else if (j == j3) {
                    int i3 = Lr0.a;
                    if (c2974ul.d != null && cp2 != null) {
                        c2974ul = c2974ul2;
                    }
                }
            }
        }
        if (c2974ul != null) {
            return c2974ul;
        }
        String str = (String) h.get();
        C2974ul c2974ul4 = new C2974ul(this, str, i2, cp);
        map.put(str, c2974ul4);
        return c2974ul4;
    }

    public final synchronized String d(Fj0 fj0, CP cp) {
        return c(fj0.h(cp.a, this.b).n, cp).a;
    }

    public final void e(C3201x2 c3201x2) {
        CP cp;
        boolean zQ = c3201x2.b.q();
        HashMap map = this.c;
        if (zQ) {
            String str = this.f;
            if (str != null) {
                C2974ul c2974ul = (C2974ul) map.get(str);
                c2974ul.getClass();
                a(c2974ul);
                return;
            }
            return;
        }
        C2974ul c2974ul2 = (C2974ul) map.get(this.f);
        int i2 = c3201x2.c;
        CP cp2 = c3201x2.d;
        this.f = c(i2, cp2).a;
        f(c3201x2);
        if (cp2 == null || !cp2.a()) {
            return;
        }
        long j = cp2.d;
        if (c2974ul2 != null && c2974ul2.c == j && (cp = c2974ul2.d) != null && cp.b == cp2.b && cp.c == cp2.c) {
            return;
        }
        c(i2, new CP(j, cp2.a));
        this.d.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002b A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0010, B:9:0x0014, B:11:0x0024, B:20:0x0036, B:22:0x0042, B:24:0x0048, B:14:0x002b, B:30:0x0053, B:32:0x005f, B:33:0x0063, B:35:0x0068, B:37:0x006e, B:39:0x0085, B:40:0x00b3, B:42:0x00b7, B:43:0x00be, B:45:0x00c8, B:47:0x00cc, B:49:0x00d9, B:52:0x00e0), top: B:57:0x0001 }] */
    public final synchronized void f(C3201x2 c3201x2) {
        long j;
        this.d.getClass();
        if (c3201x2.b.q()) {
            return;
        }
        CP cp = c3201x2.d;
        if (cp != null) {
            long j2 = cp.d;
            C2974ul c2974ul = (C2974ul) this.c.get(this.f);
            if (c2974ul != null) {
                j = c2974ul.c;
                if (j == -1) {
                    j = this.g + 1;
                }
            } else {
                j = this.g + 1;
            }
            if (j2 < j) {
                return;
            }
            C2974ul c2974ul2 = (C2974ul) this.c.get(this.f);
            if (c2974ul2 != null && c2974ul2.c == -1 && c2974ul2.b != c3201x2.c) {
                return;
            }
        }
        C2974ul c2974ulC = c(c3201x2.c, c3201x2.d);
        if (this.f == null) {
            this.f = c2974ulC.a;
        }
        CP cp2 = c3201x2.d;
        if (cp2 != null && cp2.a()) {
            CP cp3 = c3201x2.d;
            C2974ul c2974ulC2 = c(c3201x2.c, new CP(cp3.a, cp3.d, cp3.b));
            if (!c2974ulC2.e) {
                c2974ulC2.e = true;
                c3201x2.b.h(c3201x2.d.a, this.b);
                Math.max(0L, Lr0.X(this.b.d(c3201x2.d.b)) + Lr0.X(this.b.p));
                this.d.getClass();
            }
        }
        if (!c2974ulC.e) {
            c2974ulC.e = true;
            this.d.getClass();
        }
        if (c2974ulC.a.equals(this.f) && !c2974ulC.f) {
            c2974ulC.f = true;
            C2747sP c2747sP = this.d;
            String str = c2974ulC.a;
            c2747sP.getClass();
            CP cp4 = c3201x2.d;
            if (cp4 == null || !cp4.a()) {
                c2747sP.b();
                c2747sP.i = str;
                c2747sP.j = AbstractC2457pP.e().setPlayerName("ExoPlayerLib").setPlayerVersion("2.19.1");
                c2747sP.c(c3201x2.b, c3201x2.d);
            }
        }
    }

    public final synchronized void g(C3201x2 c3201x2, int i2) {
        try {
            this.d.getClass();
            boolean z = i2 == 0;
            Iterator it = this.c.values().iterator();
            while (it.hasNext()) {
                C2974ul c2974ul = (C2974ul) it.next();
                if (c2974ul.a(c3201x2)) {
                    it.remove();
                    if (c2974ul.e) {
                        boolean zEquals = c2974ul.a.equals(this.f);
                        if (z && zEquals) {
                            boolean z2 = c2974ul.f;
                        }
                        if (zEquals) {
                            a(c2974ul);
                        }
                        this.d.d(c3201x2, c2974ul.a);
                    }
                }
            }
            e(c3201x2);
        } catch (Throwable th) {
            throw th;
        }
    }
}
