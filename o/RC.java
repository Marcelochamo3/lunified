package o;

import android.os.SystemClock;
import com.skidush.clonex.database.AppDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class RC extends Ut0 {
    public final AppDatabase b;
    public final Q30 c;
    public final Q30 d;
    public Q30 e;
    public long f;
    public Q30 g;
    public C1703hg0 h;
    public long i;
    public final C2771sg0 j;
    public final C2022ku k;

    public RC(AppDatabase appDatabase, Q30 q30) {
        Object next;
        Q30 q31;
        int i = 1;
        int i2 = 3;
        int i3 = 0;
        int i4 = 2;
        AbstractC1474fG.j(appDatabase, "database");
        this.b = appDatabase;
        this.c = q30;
        String strB = Cr0.m.b();
        InterfaceC0473Hh interfaceC0473Hh = null;
        if (AbstractC1474fG.b(strB, "PPV.TO")) {
            q31 = QW.b;
        } else {
            Q30.a.getClass();
            Iterator it = P30.b.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AbstractC1474fG.b(((Q30) next).getName(), strB));
            Q30 q32 = (Q30) next;
            q31 = q32 == null ? C1816io0.b : q32;
        }
        this.d = q31;
        C2771sg0 c2771sg0 = new C2771sg0(KC.a);
        this.j = c2771sg0;
        C1583gR c1583gRP = appDatabase.p();
        c1583gRP.getClass();
        C2538q90 c2538q90J = UK.j((F80) c1583gRP.m, new String[]{"movies"}, new CallableC1485fR(c1583gRP, G80.a(0, "SELECT * FROM movies WHERE lastEngagementTimeUtcMillis IS NOT NULL ORDER BY lastEngagementTimeUtcMillis DESC"), i2));
        C0560Kq c0560KqO = appDatabase.o();
        c0560KqO.getClass();
        C2802sw c2802sw = new C2802sw(c2538q90J, UK.j((F80) c0560KqO.m, new String[]{"episodes"}, new CallableC0534Jq(c0560KqO, G80.a(0, "SELECT * FROM episodes WHERE lastEngagementTimeUtcMillis IS NOT NULL ORDER BY lastEngagementTimeUtcMillis DESC"), i4)), new OC(this, null));
        C1583gR c1583gRP2 = appDatabase.p();
        c1583gRP2.getClass();
        C2538q90 c2538q90J2 = UK.j((F80) c1583gRP2.m, new String[]{"movies"}, new CallableC1485fR(c1583gRP2, G80.a(0, "SELECT * FROM movies WHERE isFavorite = 1"), i4));
        C2303no0 c2303no0R = appDatabase.r();
        c2303no0R.getClass();
        this.k = new C2022ku(new InterfaceC1538fw[]{c2771sg0, c2802sw, c2538q90J2, UK.j((F80) c2303no0R.m, new String[]{"tv_shows"}, new CallableC2206mo0(c2303no0R, G80.a(0, "SELECT * FROM tv_shows WHERE isFavorite = 1"), i4)), Nr0.H(new PC(this, interfaceC0473Hh, i3), c2771sg0), Nr0.H(new PC(this, interfaceC0473Hh, i), c2771sg0)}, 6, this);
        g(false);
    }

    public static final boolean e(RC rc, long j, Q30 q30) {
        synchronized (rc) {
            if (j == rc.i && rc.g == q30) {
                if (rc.h() != q30) {
                    return false;
                }
                rc.e = q30;
                rc.f = SystemClock.elapsedRealtime();
                return true;
            }
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [o.eR] */
    /* JADX WARN: Type inference failed for: r3v12, types: [o.eR] */
    /* JADX WARN: Type inference failed for: r3v6, types: [o.w3] */
    /* JADX WARN: Type inference failed for: r3v7, types: [o.lo0] */
    /* JADX WARN: Type inference failed for: r3v8, types: [o.lo0] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object] */
    public static final C0882Xb f(List list, List list2, C0882Xb c0882Xb) {
        Object next;
        Object next2;
        List<??> list3 = c0882Xb.b;
        ArrayList arrayList = new ArrayList(AbstractC1016af.O(list3, 10));
        for (?? A : list3) {
            if (A instanceof C1387eR) {
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                } while (!AbstractC1474fG.b(((C1387eR) next2).a, ((C1387eR) A).a));
                C1387eR c1387eR = (C1387eR) next2;
                if (c1387eR != null) {
                    C1387eR c1387eR2 = (C1387eR) A;
                    if (!(true ^ c1387eR2.g(c1387eR))) {
                        c1387eR = null;
                    }
                    if (c1387eR != null) {
                        A = C1387eR.f(c1387eR2, null, null, 32767);
                        A.h(c1387eR);
                    } else {
                        A = (C1387eR) A;
                    }
                } else {
                    A = (C1387eR) A;
                }
            } else if (A instanceof C2109lo0) {
                Iterator it2 = list2.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!AbstractC1474fG.b(((C2109lo0) next).a, ((C2109lo0) A).a));
                C2109lo0 c2109lo0 = (C2109lo0) next;
                if (c2109lo0 != null) {
                    C2109lo0 c2109lo1 = (C2109lo0) A;
                    C2109lo0 c2109lo2 = (c2109lo1.q == c2109lo0.q) ^ true ? c2109lo0 : null;
                    if (c2109lo2 != null) {
                        A = C2109lo0.a(c2109lo1, null, null, null, null, null, null, AQ.w);
                        A.q = c2109lo2.q;
                    } else {
                        A = (C2109lo0) A;
                    }
                } else {
                    A = (C2109lo0) A;
                }
            }
            arrayList.add(A);
        }
        String str = c0882Xb.a;
        AbstractC1474fG.j(str, "name");
        C0882Xb c0882Xb2 = new C0882Xb(str, arrayList);
        c0882Xb2.c = c0882Xb.c;
        c0882Xb2.d = c0882Xb.d;
        c0882Xb2.e = c0882Xb.e;
        c0882Xb2.f = c0882Xb.f;
        c0882Xb2.g = c0882Xb.g;
        if (c0882Xb.h != null) {
            c0882Xb2.h = c0882Xb.c();
        }
        return c0882Xb2;
    }

    public final synchronized void g(boolean z) {
        C1703hg0 c1703hg0;
        C1703hg0 c1703hg1;
        try {
            Q30 q30H = h();
            if (q30H == null) {
                return;
            }
            boolean z2 = q30H == this.e && (this.j.getValue() instanceof LC) && SystemClock.elapsedRealtime() - this.f < 60000;
            if (z || this.g != q30H || (c1703hg1 = this.h) == null || !c1703hg1.a()) {
                if (z || !z2) {
                    if (z || this.g != q30H || this.e == q30H) {
                        if ((z || this.g != q30H) && (c1703hg0 = this.h) != null) {
                            c1703hg0.f(null);
                        }
                        this.g = q30H;
                        long j = 1 + this.i;
                        this.i = j;
                        this.h = AbstractC1376eG.w(AbstractC3021v9.o(this), AbstractC1910jn.b, 0, new NC(this, q30H, j, null), 2);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Q30 h() {
        Object next;
        Q30 q30;
        Cr0 cr0 = Cr0.m;
        Object obj = null;
        Q30 q31 = this.c;
        if (q31 != null) {
            String strB = cr0.b();
            if (AbstractC1474fG.b(strB, "PPV.TO")) {
                q30 = QW.b;
            } else {
                Q30.a.getClass();
                Iterator it = P30.b.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!AbstractC1474fG.b(((Q30) next).getName(), strB));
                Q30 q32 = (Q30) next;
                q30 = q32 == null ? C1816io0.b : q32;
            }
            if (q30 != this.d) {
                return null;
            }
        }
        if (q31 != null) {
            return q31;
        }
        String strB2 = cr0.b();
        if (AbstractC1474fG.b(strB2, "PPV.TO")) {
            return QW.b;
        }
        Q30.a.getClass();
        for (Object obj2 : P30.b) {
            if (AbstractC1474fG.b(((Q30) obj2).getName(), strB2)) {
                obj = obj2;
                break;
            }
        }
        Q30 q33 = (Q30) obj;
        return q33 == null ? C1816io0.b : q33;
    }
}
