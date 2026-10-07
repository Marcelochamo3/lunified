package o;

import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: o.Ok, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0657Ok implements InterfaceC1284dL {
    public final Uri l;
    public final Na0 m = new Na0("DefaultHlsPlaylistTracker:MediaPlaylist");
    public final InterfaceC2583qj n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C1177cC f440o;
    public long p;
    public long q;
    public long r;
    public long s;
    public boolean t;
    public IOException u;
    public final /* synthetic */ C0683Pk v;

    public C0657Ok(C0683Pk c0683Pk, Uri uri) {
        this.v = c0683Pk;
        this.l = uri;
        this.n = c0683Pk.l.a.H();
    }

    public static boolean a(C0657Ok c0657Ok, long j) {
        c0657Ok.s = SystemClock.elapsedRealtime() + j;
        C0683Pk c0683Pk = c0657Ok.v;
        if (!c0657Ok.l.equals(c0683Pk.v)) {
            return false;
        }
        List list = c0683Pk.u.e;
        int size = list.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            C0657Ok c0657Ok2 = (C0657Ok) c0683Pk.f461o.get(((C1470fC) list.get(i)).a);
            c0657Ok2.getClass();
            if (jElapsedRealtime > c0657Ok2.s) {
                Uri uri = c0657Ok2.l;
                c0683Pk.v = uri;
                c0657Ok2.c(c0683Pk.b(uri));
                return false;
            }
        }
        return true;
    }

    public final void b(Uri uri) {
        C0683Pk c0683Pk = this.v;
        C3143wX c3143wX = new C3143wX(this.n, uri, 4, c0683Pk.m.J(c0683Pk.u, this.f440o));
        C0622Nb c0622Nb = c0683Pk.n;
        int i = c3143wX.n;
        this.m.S(c3143wX, this, c0622Nb.v(i));
        c0683Pk.q.G(new C0991aL(c3143wX.m), i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void c(Uri uri) {
        this.s = 0L;
        if (this.t) {
            return;
        }
        Na0 na0 = this.m;
        if (na0.M() || na0.F()) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.r;
        if (jElapsedRealtime >= j) {
            b(uri);
        } else {
            this.t = true;
            this.v.s.postDelayed(new O3(this, 5, uri), j - jElapsedRealtime);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0226  */
    /* JADX WARN: Code duplicated, block: B:104:0x023c  */
    /* JADX WARN: Code duplicated, block: B:108:0x024a  */
    /* JADX WARN: Code duplicated, block: B:110:0x0252  */
    /* JADX WARN: Code duplicated, block: B:113:0x0257  */
    /* JADX WARN: Code duplicated, block: B:115:0x0263  */
    /* JADX WARN: Code duplicated, block: B:117:0x027e  */
    /* JADX WARN: Code duplicated, block: B:119:0x028a  */
    /* JADX WARN: Code duplicated, block: B:125:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:127:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:128:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:55:0x0101  */
    /* JADX WARN: Code duplicated, block: B:56:0x0104  */
    /* JADX WARN: Code duplicated, block: B:59:0x0108  */
    /* JADX WARN: Code duplicated, block: B:61:0x0114  */
    /* JADX WARN: Code duplicated, block: B:62:0x011b  */
    /* JADX WARN: Code duplicated, block: B:64:0x011e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0130  */
    /* JADX WARN: Code duplicated, block: B:70:0x0188  */
    /* JADX WARN: Code duplicated, block: B:72:0x0195  */
    /* JADX WARN: Code duplicated, block: B:74:0x0199  */
    /* JADX WARN: Code duplicated, block: B:79:0x01b4 A[LOOP:0: B:77:0x01ae->B:79:0x01b4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:80:0x01be  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:84:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:85:0x01da  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:88:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:90:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:93:0x0209 A[LOOP:1: B:91:0x0203->B:93:0x0209, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:96:0x021b  */
    /* JADX WARN: Code duplicated, block: B:99:0x0220  */
    public final void d(C1177cC c1177cC) {
        long j;
        long j2;
        long j3;
        boolean z;
        AbstractC0985aF abstractC0985aF;
        C1177cC c1177cC2;
        int i;
        int i2;
        AbstractC0985aF abstractC0985aF2;
        ZB zb;
        boolean z2;
        int i3;
        C1177cC c1177cC3;
        CopyOnWriteArrayList copyOnWriteArrayList;
        Uri uriBuild;
        boolean z3;
        long size;
        C1177cC c1177cC4;
        C0811Ui c0811Ui;
        C2295nk0 c2295nk0;
        Iterator it;
        C1177cC c1177cC5;
        long j4;
        C1177cC c1177cC6;
        C1080bC c1080bC;
        Uri.Builder builderBuildUpon;
        C1177cC c1177cC7;
        C1080bC c1080bC2;
        String str;
        C1177cC c1177cC8;
        AbstractC0985aF abstractC0985aF3;
        int size2;
        long j5;
        Iterator it2;
        int size3;
        int size4;
        int size5;
        C1177cC c1177cC9 = this.f440o;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.p = jElapsedRealtime;
        C0683Pk c0683Pk = this.v;
        c0683Pk.getClass();
        if (c1177cC9 != null) {
            long j6 = c1177cC.k;
            long j7 = c1177cC9.k;
            if (j6 <= j7) {
                boolean z4 = c1177cC9.f710o;
                AbstractC0985aF abstractC0985aF4 = c1177cC9.s;
                AbstractC0985aF abstractC0985aF5 = c1177cC9.r;
                boolean z5 = c1177cC.f710o;
                if (j6 < j7 || ((size3 = c1177cC.r.size() - abstractC0985aF5.size()) == 0 ? !((size4 = c1177cC.s.size()) > (size5 = abstractC0985aF4.size()) || (size4 == size5 && z5 && !z4)) : size3 <= 0)) {
                    c1177cC3 = (!z5 || z4) ? c1177cC9 : new C1177cC(c1177cC9.d, c1177cC9.a, c1177cC9.b, c1177cC9.e, c1177cC9.g, c1177cC9.h, c1177cC9.i, c1177cC9.j, c1177cC9.k, c1177cC9.l, c1177cC9.m, c1177cC9.n, c1177cC9.c, true, c1177cC9.p, c1177cC9.q, abstractC0985aF5, abstractC0985aF4, c1177cC9.v, c1177cC9.t);
                    z2 = false;
                }
            }
            this.f440o = c1177cC3;
            copyOnWriteArrayList = c0683Pk.p;
            uriBuild = this.l;
            z3 = c1177cC3.f710o;
            if (c1177cC3 != c1177cC9) {
                this.u = null;
                this.q = jElapsedRealtime;
                if (uriBuild.equals(c0683Pk.v)) {
                    if (c0683Pk.w == null) {
                        c0683Pk.x = !z3;
                        c0683Pk.y = c1177cC3.h;
                    }
                    c0683Pk.w = c1177cC3;
                    ((C1275dC) c0683Pk.t).t(c1177cC3);
                }
                it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC2056lC) it2.next()).a();
                }
            } else if (!z3) {
                size = c1177cC.k + ((long) c1177cC.r.size());
                c1177cC4 = this.f440o;
                if (size < c1177cC4.k) {
                    c0811Ui = new C0811Ui();
                    z2 = true;
                } else if (jElapsedRealtime - this.q > Lr0.X(c1177cC4.m) * 3.5d) {
                    c0811Ui = new C0811Ui();
                } else {
                    c0811Ui = null;
                }
                if (c0811Ui != null) {
                    this.u = c0811Ui;
                    c2295nk0 = new C2295nk0(1, 5, c0811Ui);
                    it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC2056lC) it.next()).d(uriBuild, c2295nk0, z2);
                    }
                }
            }
            c1177cC5 = this.f440o;
            if (c1177cC5.v.e) {
                j4 = 0;
            } else {
                j5 = c1177cC5.m;
                if (c1177cC5 == c1177cC9) {
                    j5 /= 2;
                }
                j4 = j5;
            }
            this.r = Lr0.X(j4) + jElapsedRealtime;
            if (this.f440o.n == -9223372036854775807L || uriBuild.equals(c0683Pk.v)) {
                c1177cC6 = this.f440o;
                if (c1177cC6.f710o) {
                }
                c1080bC = c1177cC6.v;
                if (c1080bC.a == -9223372036854775807L || c1080bC.e) {
                    builderBuildUpon = uriBuild.buildUpon();
                    c1177cC7 = this.f440o;
                    if (c1177cC7.v.e) {
                        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c1177cC7.k + ((long) c1177cC7.r.size())));
                        c1177cC8 = this.f440o;
                        if (c1177cC8.n != -9223372036854775807L) {
                            abstractC0985aF3 = c1177cC8.s;
                            size2 = abstractC0985aF3.size();
                            if (!abstractC0985aF3.isEmpty() && ((XB) UK.t(abstractC0985aF3)).x) {
                                size2--;
                            }
                            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size2));
                        }
                    }
                    c1080bC2 = this.f440o.v;
                    if (c1080bC2.a != -9223372036854775807L) {
                        if (c1080bC2.b) {
                            str = "v2";
                        } else {
                            str = "YES";
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_skip", str);
                    }
                    uriBuild = builderBuildUpon.build();
                }
                c(uriBuild);
            }
            return;
        }
        c1177cC.getClass();
        boolean z6 = c1177cC.p;
        long j8 = c1177cC.k;
        if (!z6) {
            C1177cC c1177cC10 = c0683Pk.w;
            j = c1177cC10 != null ? c1177cC10.h : 0L;
            if (c1177cC9 != null) {
                AbstractC0985aF abstractC0985aF6 = c1177cC9.r;
                int size6 = abstractC0985aF6.size();
                long j9 = c1177cC9.k;
                int i4 = (int) (j8 - j9);
                ZB zb2 = i4 < abstractC0985aF6.size() ? (ZB) abstractC0985aF6.get(i4) : null;
                long j10 = c1177cC9.h;
                if (zb2 != null) {
                    j3 = zb2.p;
                } else if (size6 == j8 - j9) {
                    j3 = c1177cC9.u;
                } else {
                    j2 = j;
                }
                j = j10 + j3;
            }
            z = c1177cC.i;
            abstractC0985aF = c1177cC.r;
            if (z) {
                c1177cC2 = c0683Pk.w;
                if (c1177cC2 != null) {
                    i = c1177cC2.j;
                } else {
                    i = 0;
                }
                if (c1177cC9 == null) {
                    i2 = (int) (j8 - c1177cC9.k);
                    abstractC0985aF2 = c1177cC9.r;
                    if (i2 < abstractC0985aF2.size()) {
                        zb = (ZB) abstractC0985aF2.get(i2);
                    } else {
                        zb = null;
                    }
                    if (zb != null) {
                        int i5 = c1177cC9.j + zb.f674o;
                        z2 = false;
                        i = i5 - ((ZB) abstractC0985aF.get(0)).f674o;
                    } else {
                        z2 = false;
                    }
                    i3 = i;
                }
                c1177cC3 = new C1177cC(c1177cC.d, c1177cC.a, c1177cC.b, c1177cC.e, c1177cC.g, j2, true, i3, c1177cC.k, c1177cC.l, c1177cC.m, c1177cC.n, c1177cC.c, c1177cC.f710o, c1177cC.p, c1177cC.q, abstractC0985aF, c1177cC.s, c1177cC.v, c1177cC.t);
                this.f440o = c1177cC3;
                copyOnWriteArrayList = c0683Pk.p;
                uriBuild = this.l;
                z3 = c1177cC3.f710o;
                if (c1177cC3 != c1177cC9) {
                    this.u = null;
                    this.q = jElapsedRealtime;
                    if (uriBuild.equals(c0683Pk.v)) {
                        if (c0683Pk.w == null) {
                            c0683Pk.x = !z3;
                            c0683Pk.y = c1177cC3.h;
                        }
                        c0683Pk.w = c1177cC3;
                        ((C1275dC) c0683Pk.t).t(c1177cC3);
                    }
                    it2 = copyOnWriteArrayList.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC2056lC) it2.next()).a();
                    }
                } else if (!z3) {
                    size = c1177cC.k + ((long) c1177cC.r.size());
                    c1177cC4 = this.f440o;
                    if (size < c1177cC4.k) {
                        c0811Ui = new C0811Ui();
                        z2 = true;
                    } else if (jElapsedRealtime - this.q > Lr0.X(c1177cC4.m) * 3.5d) {
                        c0811Ui = new C0811Ui();
                    } else {
                        c0811Ui = null;
                    }
                    if (c0811Ui != null) {
                        this.u = c0811Ui;
                        c2295nk0 = new C2295nk0(1, 5, c0811Ui);
                        it = copyOnWriteArrayList.iterator();
                        while (it.hasNext()) {
                            ((InterfaceC2056lC) it.next()).d(uriBuild, c2295nk0, z2);
                        }
                    }
                }
                c1177cC5 = this.f440o;
                if (c1177cC5.v.e) {
                    j5 = c1177cC5.m;
                    if (c1177cC5 == c1177cC9) {
                        j5 /= 2;
                    }
                    j4 = j5;
                } else {
                    j4 = 0;
                }
                this.r = Lr0.X(j4) + jElapsedRealtime;
                if (this.f440o.n == -9223372036854775807L) {
                }
                c1177cC6 = this.f440o;
                if (c1177cC6.f710o) {
                    c1080bC = c1177cC6.v;
                    if (c1080bC.a == -9223372036854775807L) {
                        builderBuildUpon = uriBuild.buildUpon();
                        c1177cC7 = this.f440o;
                        if (c1177cC7.v.e) {
                            builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c1177cC7.k + ((long) c1177cC7.r.size())));
                            c1177cC8 = this.f440o;
                            if (c1177cC8.n != -9223372036854775807L) {
                                abstractC0985aF3 = c1177cC8.s;
                                size2 = abstractC0985aF3.size();
                                if (!abstractC0985aF3.isEmpty()) {
                                    size2--;
                                }
                                builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size2));
                            }
                        }
                        c1080bC2 = this.f440o.v;
                        if (c1080bC2.a != -9223372036854775807L) {
                            if (c1080bC2.b) {
                                str = "v2";
                            } else {
                                str = "YES";
                            }
                            builderBuildUpon.appendQueryParameter("_HLS_skip", str);
                        }
                        uriBuild = builderBuildUpon.build();
                    } else {
                        builderBuildUpon = uriBuild.buildUpon();
                        c1177cC7 = this.f440o;
                        if (c1177cC7.v.e) {
                            builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c1177cC7.k + ((long) c1177cC7.r.size())));
                            c1177cC8 = this.f440o;
                            if (c1177cC8.n != -9223372036854775807L) {
                                abstractC0985aF3 = c1177cC8.s;
                                size2 = abstractC0985aF3.size();
                                if (!abstractC0985aF3.isEmpty()) {
                                    size2--;
                                }
                                builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size2));
                            }
                        }
                        c1080bC2 = this.f440o.v;
                        if (c1080bC2.a != -9223372036854775807L) {
                            if (c1080bC2.b) {
                                str = "v2";
                            } else {
                                str = "YES";
                            }
                            builderBuildUpon.appendQueryParameter("_HLS_skip", str);
                        }
                        uriBuild = builderBuildUpon.build();
                    }
                    c(uriBuild);
                }
            }
            i = c1177cC.j;
            i3 = i;
            z2 = false;
            c1177cC3 = new C1177cC(c1177cC.d, c1177cC.a, c1177cC.b, c1177cC.e, c1177cC.g, j2, true, i3, c1177cC.k, c1177cC.l, c1177cC.m, c1177cC.n, c1177cC.c, c1177cC.f710o, c1177cC.p, c1177cC.q, abstractC0985aF, c1177cC.s, c1177cC.v, c1177cC.t);
            this.f440o = c1177cC3;
            copyOnWriteArrayList = c0683Pk.p;
            uriBuild = this.l;
            z3 = c1177cC3.f710o;
            if (c1177cC3 != c1177cC9) {
                this.u = null;
                this.q = jElapsedRealtime;
                if (uriBuild.equals(c0683Pk.v)) {
                    if (c0683Pk.w == null) {
                        c0683Pk.x = !z3;
                        c0683Pk.y = c1177cC3.h;
                    }
                    c0683Pk.w = c1177cC3;
                    ((C1275dC) c0683Pk.t).t(c1177cC3);
                }
                it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC2056lC) it2.next()).a();
                }
            } else if (!z3) {
                size = c1177cC.k + ((long) c1177cC.r.size());
                c1177cC4 = this.f440o;
                if (size < c1177cC4.k) {
                    c0811Ui = new C0811Ui();
                    z2 = true;
                } else if (jElapsedRealtime - this.q > Lr0.X(c1177cC4.m) * 3.5d) {
                    c0811Ui = new C0811Ui();
                } else {
                    c0811Ui = null;
                }
                if (c0811Ui != null) {
                    this.u = c0811Ui;
                    c2295nk0 = new C2295nk0(1, 5, c0811Ui);
                    it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC2056lC) it.next()).d(uriBuild, c2295nk0, z2);
                    }
                }
            }
            c1177cC5 = this.f440o;
            if (c1177cC5.v.e) {
                j5 = c1177cC5.m;
                if (c1177cC5 == c1177cC9) {
                    j5 /= 2;
                }
                j4 = j5;
            } else {
                j4 = 0;
            }
            this.r = Lr0.X(j4) + jElapsedRealtime;
            if (this.f440o.n == -9223372036854775807L) {
            }
            c1177cC6 = this.f440o;
            if (c1177cC6.f710o) {
                c1080bC = c1177cC6.v;
                if (c1080bC.a == -9223372036854775807L) {
                    builderBuildUpon = uriBuild.buildUpon();
                    c1177cC7 = this.f440o;
                    if (c1177cC7.v.e) {
                        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c1177cC7.k + ((long) c1177cC7.r.size())));
                        c1177cC8 = this.f440o;
                        if (c1177cC8.n != -9223372036854775807L) {
                            abstractC0985aF3 = c1177cC8.s;
                            size2 = abstractC0985aF3.size();
                            if (!abstractC0985aF3.isEmpty()) {
                                size2--;
                            }
                            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size2));
                        }
                    }
                    c1080bC2 = this.f440o.v;
                    if (c1080bC2.a != -9223372036854775807L) {
                        if (c1080bC2.b) {
                            str = "v2";
                        } else {
                            str = "YES";
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_skip", str);
                    }
                    uriBuild = builderBuildUpon.build();
                } else {
                    builderBuildUpon = uriBuild.buildUpon();
                    c1177cC7 = this.f440o;
                    if (c1177cC7.v.e) {
                        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c1177cC7.k + ((long) c1177cC7.r.size())));
                        c1177cC8 = this.f440o;
                        if (c1177cC8.n != -9223372036854775807L) {
                            abstractC0985aF3 = c1177cC8.s;
                            size2 = abstractC0985aF3.size();
                            if (!abstractC0985aF3.isEmpty()) {
                                size2--;
                            }
                            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size2));
                        }
                    }
                    c1080bC2 = this.f440o.v;
                    if (c1080bC2.a != -9223372036854775807L) {
                        if (c1080bC2.b) {
                            str = "v2";
                        } else {
                            str = "YES";
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_skip", str);
                    }
                    uriBuild = builderBuildUpon.build();
                }
                c(uriBuild);
            }
        }
        j = c1177cC.h;
        j2 = j;
        z = c1177cC.i;
        abstractC0985aF = c1177cC.r;
        if (z) {
            c1177cC2 = c0683Pk.w;
            if (c1177cC2 != null) {
                i = c1177cC2.j;
            } else {
                i = 0;
            }
            if (c1177cC9 == null) {
                i2 = (int) (j8 - c1177cC9.k);
                abstractC0985aF2 = c1177cC9.r;
                if (i2 < abstractC0985aF2.size()) {
                    zb = (ZB) abstractC0985aF2.get(i2);
                } else {
                    zb = null;
                }
                if (zb != null) {
                    int i6 = c1177cC9.j + zb.f674o;
                    z2 = false;
                    i = i6 - ((ZB) abstractC0985aF.get(0)).f674o;
                } else {
                    z2 = false;
                }
                i3 = i;
            }
            c1177cC3 = new C1177cC(c1177cC.d, c1177cC.a, c1177cC.b, c1177cC.e, c1177cC.g, j2, true, i3, c1177cC.k, c1177cC.l, c1177cC.m, c1177cC.n, c1177cC.c, c1177cC.f710o, c1177cC.p, c1177cC.q, abstractC0985aF, c1177cC.s, c1177cC.v, c1177cC.t);
            this.f440o = c1177cC3;
            copyOnWriteArrayList = c0683Pk.p;
            uriBuild = this.l;
            z3 = c1177cC3.f710o;
            if (c1177cC3 != c1177cC9) {
                this.u = null;
                this.q = jElapsedRealtime;
                if (uriBuild.equals(c0683Pk.v)) {
                    if (c0683Pk.w == null) {
                        c0683Pk.x = !z3;
                        c0683Pk.y = c1177cC3.h;
                    }
                    c0683Pk.w = c1177cC3;
                    ((C1275dC) c0683Pk.t).t(c1177cC3);
                }
                it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC2056lC) it2.next()).a();
                }
            } else if (!z3) {
                size = c1177cC.k + ((long) c1177cC.r.size());
                c1177cC4 = this.f440o;
                if (size < c1177cC4.k) {
                    c0811Ui = new C0811Ui();
                    z2 = true;
                } else if (jElapsedRealtime - this.q > Lr0.X(c1177cC4.m) * 3.5d) {
                    c0811Ui = new C0811Ui();
                } else {
                    c0811Ui = null;
                }
                if (c0811Ui != null) {
                    this.u = c0811Ui;
                    c2295nk0 = new C2295nk0(1, 5, c0811Ui);
                    it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC2056lC) it.next()).d(uriBuild, c2295nk0, z2);
                    }
                }
            }
            c1177cC5 = this.f440o;
            if (c1177cC5.v.e) {
                j5 = c1177cC5.m;
                if (c1177cC5 == c1177cC9) {
                    j5 /= 2;
                }
                j4 = j5;
            } else {
                j4 = 0;
            }
            this.r = Lr0.X(j4) + jElapsedRealtime;
            if (this.f440o.n == -9223372036854775807L) {
            }
            c1177cC6 = this.f440o;
            if (c1177cC6.f710o) {
                c1080bC = c1177cC6.v;
                if (c1080bC.a == -9223372036854775807L) {
                    builderBuildUpon = uriBuild.buildUpon();
                    c1177cC7 = this.f440o;
                    if (c1177cC7.v.e) {
                        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c1177cC7.k + ((long) c1177cC7.r.size())));
                        c1177cC8 = this.f440o;
                        if (c1177cC8.n != -9223372036854775807L) {
                            abstractC0985aF3 = c1177cC8.s;
                            size2 = abstractC0985aF3.size();
                            if (!abstractC0985aF3.isEmpty()) {
                                size2--;
                            }
                            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size2));
                        }
                    }
                    c1080bC2 = this.f440o.v;
                    if (c1080bC2.a != -9223372036854775807L) {
                        if (c1080bC2.b) {
                            str = "v2";
                        } else {
                            str = "YES";
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_skip", str);
                    }
                    uriBuild = builderBuildUpon.build();
                } else {
                    builderBuildUpon = uriBuild.buildUpon();
                    c1177cC7 = this.f440o;
                    if (c1177cC7.v.e) {
                        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c1177cC7.k + ((long) c1177cC7.r.size())));
                        c1177cC8 = this.f440o;
                        if (c1177cC8.n != -9223372036854775807L) {
                            abstractC0985aF3 = c1177cC8.s;
                            size2 = abstractC0985aF3.size();
                            if (!abstractC0985aF3.isEmpty()) {
                                size2--;
                            }
                            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size2));
                        }
                    }
                    c1080bC2 = this.f440o.v;
                    if (c1080bC2.a != -9223372036854775807L) {
                        if (c1080bC2.b) {
                            str = "v2";
                        } else {
                            str = "YES";
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_skip", str);
                    }
                    uriBuild = builderBuildUpon.build();
                }
                c(uriBuild);
            }
        }
        i = c1177cC.j;
        i3 = i;
        z2 = false;
        c1177cC3 = new C1177cC(c1177cC.d, c1177cC.a, c1177cC.b, c1177cC.e, c1177cC.g, j2, true, i3, c1177cC.k, c1177cC.l, c1177cC.m, c1177cC.n, c1177cC.c, c1177cC.f710o, c1177cC.p, c1177cC.q, abstractC0985aF, c1177cC.s, c1177cC.v, c1177cC.t);
        this.f440o = c1177cC3;
        copyOnWriteArrayList = c0683Pk.p;
        uriBuild = this.l;
        z3 = c1177cC3.f710o;
        if (c1177cC3 != c1177cC9) {
            this.u = null;
            this.q = jElapsedRealtime;
            if (uriBuild.equals(c0683Pk.v)) {
                if (c0683Pk.w == null) {
                    c0683Pk.x = !z3;
                    c0683Pk.y = c1177cC3.h;
                }
                c0683Pk.w = c1177cC3;
                ((C1275dC) c0683Pk.t).t(c1177cC3);
            }
            it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC2056lC) it2.next()).a();
            }
        } else if (!z3) {
            size = c1177cC.k + ((long) c1177cC.r.size());
            c1177cC4 = this.f440o;
            if (size < c1177cC4.k) {
                c0811Ui = new C0811Ui();
                z2 = true;
            } else if (jElapsedRealtime - this.q > Lr0.X(c1177cC4.m) * 3.5d) {
                c0811Ui = new C0811Ui();
            } else {
                c0811Ui = null;
            }
            if (c0811Ui != null) {
                this.u = c0811Ui;
                c2295nk0 = new C2295nk0(1, 5, c0811Ui);
                it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    ((InterfaceC2056lC) it.next()).d(uriBuild, c2295nk0, z2);
                }
            }
        }
        c1177cC5 = this.f440o;
        if (c1177cC5.v.e) {
            j5 = c1177cC5.m;
            if (c1177cC5 == c1177cC9) {
                j5 /= 2;
            }
            j4 = j5;
        } else {
            j4 = 0;
        }
        this.r = Lr0.X(j4) + jElapsedRealtime;
        if (this.f440o.n == -9223372036854775807L) {
        }
        c1177cC6 = this.f440o;
        if (c1177cC6.f710o) {
            c1080bC = c1177cC6.v;
            if (c1080bC.a == -9223372036854775807L) {
                builderBuildUpon = uriBuild.buildUpon();
                c1177cC7 = this.f440o;
                if (c1177cC7.v.e) {
                    builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c1177cC7.k + ((long) c1177cC7.r.size())));
                    c1177cC8 = this.f440o;
                    if (c1177cC8.n != -9223372036854775807L) {
                        abstractC0985aF3 = c1177cC8.s;
                        size2 = abstractC0985aF3.size();
                        if (!abstractC0985aF3.isEmpty()) {
                            size2--;
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size2));
                    }
                }
                c1080bC2 = this.f440o.v;
                if (c1080bC2.a != -9223372036854775807L) {
                    if (c1080bC2.b) {
                        str = "v2";
                    } else {
                        str = "YES";
                    }
                    builderBuildUpon.appendQueryParameter("_HLS_skip", str);
                }
                uriBuild = builderBuildUpon.build();
            } else {
                builderBuildUpon = uriBuild.buildUpon();
                c1177cC7 = this.f440o;
                if (c1177cC7.v.e) {
                    builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c1177cC7.k + ((long) c1177cC7.r.size())));
                    c1177cC8 = this.f440o;
                    if (c1177cC8.n != -9223372036854775807L) {
                        abstractC0985aF3 = c1177cC8.s;
                        size2 = abstractC0985aF3.size();
                        if (!abstractC0985aF3.isEmpty()) {
                            size2--;
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size2));
                    }
                }
                c1080bC2 = this.f440o.v;
                if (c1080bC2.a != -9223372036854775807L) {
                    if (c1080bC2.b) {
                        str = "v2";
                    } else {
                        str = "YES";
                    }
                    builderBuildUpon.appendQueryParameter("_HLS_skip", str);
                }
                uriBuild = builderBuildUpon.build();
            }
            c(uriBuild);
        }
    }

    @Override // o.InterfaceC1284dL
    public final void h(InterfaceC1479fL interfaceC1479fL, long j, long j2, boolean z) {
        C3143wX c3143wX = (C3143wX) interfaceC1479fL;
        long j3 = c3143wX.l;
        Uri uri = c3143wX.f1093o.n;
        C0991aL c0991aL = new C0991aL();
        C0683Pk c0683Pk = this.v;
        c0683Pk.n.getClass();
        c0683Pk.q.x(c0991aL, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0040  */
    /* JADX WARN: Code duplicated, block: B:22:0x0053 A[LOOP:0: B:20:0x004d->B:22:0x0053, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0064  */
    /* JADX WARN: Code duplicated, block: B:27:0x0074  */
    /* JADX WARN: Code duplicated, block: B:28:0x007b  */
    /* JADX WARN: Code duplicated, block: B:31:0x008a  */
    @Override // o.InterfaceC1284dL
    public final ZK k(InterfaceC1479fL interfaceC1479fL, IOException iOException, int i) {
        C2295nk0 c2295nk0;
        Iterator it;
        boolean z;
        C0622Nb c0622Nb;
        boolean z2;
        long jW;
        C3143wX c3143wX = (C3143wX) interfaceC1479fL;
        long j = c3143wX.l;
        Uri uri = c3143wX.f1093o.n;
        C0991aL c0991aL = new C0991aL();
        boolean z3 = uri.getQueryParameter("_HLS_msn") != null;
        boolean z4 = iOException instanceof C1764iC;
        ZK zk = Na0.t;
        Uri uri2 = this.l;
        C0683Pk c0683Pk = this.v;
        int i2 = c3143wX.n;
        if (z3 || z4) {
            int i3 = iOException instanceof C1472fE ? ((C1472fE) iOException).f770o : Integer.MAX_VALUE;
            if (z4 || i3 == 400 || i3 == 503) {
                this.r = SystemClock.elapsedRealtime();
                c(uri2);
                C2613qy c2613qy = c0683Pk.q;
                int i4 = Lr0.a;
                c2613qy.D(c0991aL, i2, iOException, true);
            } else {
                c2295nk0 = new C2295nk0(i, 5, iOException);
                it = c0683Pk.p.iterator();
                z = false;
                while (it.hasNext()) {
                    z |= !((InterfaceC2056lC) it.next()).d(uri2, c2295nk0, false);
                }
                c0622Nb = c0683Pk.n;
                if (z) {
                    c0622Nb.getClass();
                    jW = C0622Nb.w(c2295nk0);
                    if (jW != -9223372036854775807L) {
                        zk = new ZK(0, jW, false);
                    } else {
                        zk = Na0.u;
                    }
                }
                z2 = !zk.a();
                c0683Pk.q.D(c0991aL, i2, iOException, z2);
                if (z2) {
                    c0622Nb.getClass();
                }
            }
        } else {
            c2295nk0 = new C2295nk0(i, 5, iOException);
            it = c0683Pk.p.iterator();
            z = false;
            while (it.hasNext()) {
                z |= !((InterfaceC2056lC) it.next()).d(uri2, c2295nk0, false);
            }
            c0622Nb = c0683Pk.n;
            if (z) {
                c0622Nb.getClass();
                jW = C0622Nb.w(c2295nk0);
                if (jW != -9223372036854775807L) {
                    zk = new ZK(0, jW, false);
                } else {
                    zk = Na0.u;
                }
            }
            z2 = !zk.a();
            c0683Pk.q.D(c0991aL, i2, iOException, z2);
            if (z2) {
                c0622Nb.getClass();
            }
        }
        return zk;
    }

    @Override // o.InterfaceC1284dL
    public final void l(InterfaceC1479fL interfaceC1479fL, long j, long j2) {
        C3143wX c3143wX = (C3143wX) interfaceC1479fL;
        AbstractC1666hC abstractC1666hC = (AbstractC1666hC) c3143wX.q;
        Uri uri = c3143wX.f1093o.n;
        C0991aL c0991aL = new C0991aL();
        if (abstractC1666hC instanceof C1177cC) {
            d((C1177cC) abstractC1666hC);
            this.v.q.A(c0991aL, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            C2949uX c2949uXB = C2949uX.b("Loaded playlist has unexpected type.", null);
            this.u = c2949uXB;
            this.v.q.D(c0991aL, 4, c2949uXB, true);
        }
        this.v.n.getClass();
    }
}
