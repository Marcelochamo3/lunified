package o;

import com.skidush.clonex.database.AppDatabase;
import com.skidush.clonex.models.Video$Type;
import com.skidush.clonex.utils.BlindajeCrypto;
import io.sentry.AbstractC0031b1;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLException;

/* JADX INFO: loaded from: classes.dex */
public final class Z10 extends Ut0 {
    public Video$Type b;
    public String c;
    public final AppDatabase d;
    public final I9 e;
    public final C0442Gc f;
    public long g;
    public C1703hg0 h;
    public C1703hg0 i;

    public Z10(Video$Type video$Type, String str, AppDatabase appDatabase) {
        AbstractC1474fG.j(video$Type, "videoType");
        AbstractC1474fG.j(str, "id");
        AbstractC1474fG.j(appDatabase, "database");
        this.b = video$Type;
        this.c = str;
        this.d = appDatabase;
        I9 i9A = UK.a(Integer.MAX_VALUE, 0, 6);
        this.e = i9A;
        this.f = new C0442Gc(i9A);
        i9A.o(H10.a);
        i(this.b, this.c);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0069  */
    /* JADX WARN: Code duplicated, block: B:35:0x0078  */
    /* JADX WARN: Code duplicated, block: B:36:0x007d  */
    /* JADX WARN: Code duplicated, block: B:43:0x008d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0097  */
    /* JADX WARN: Code duplicated, block: B:71:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:? A[LOOP:3: B:44:0x0091->B:76:?, LOOP_END, SYNTHETIC] */
    public static final void e(Z10 z10, Js0 js0) {
        Iterator it;
        Object next;
        Es0 es0;
        String strA;
        String strA0;
        Object next2;
        String strA2;
        z10.getClass();
        List<Es0> list = js0.u;
        if (list.isEmpty()) {
            return;
        }
        String strB = Cr0.w.b();
        Object obj = null;
        if (strB == null || !(!AbstractC1899jh0.O(strB))) {
            strB = null;
        }
        if (strB != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                String str = ((Es0) next2).l;
                String strA3 = AbstractC3355yh0.a(strB);
                if (strA3 != null && (strA2 = AbstractC3355yh0.a(str)) != null && (AbstractC1474fG.b(strA2, strA3) || AbstractC1474fG.b(AbstractC1119bh0.A0(strA2, '-', strA2), AbstractC1119bh0.A0(strA3, '-', strA3)))) {
                    break;
                }
            }
            es0 = (Es0) next2;
            if (es0 == null) {
                it = list.iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    strA = AbstractC3355yh0.a(((Es0) next).l);
                    if (strA != null) {
                        strA0 = AbstractC1119bh0.A0(strA, '-', strA);
                    } else {
                        strA0 = null;
                    }
                } while (!AbstractC1474fG.b(strA0, "es"));
                es0 = (Es0) next;
                if (es0 == null) {
                    for (Object obj2 : list) {
                        if (((Es0) obj2).n) {
                            obj = obj2;
                            break;
                        }
                    }
                    es0 = (Es0) obj;
                }
            }
        } else {
            it = list.iterator();
            do {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                strA = AbstractC3355yh0.a(((Es0) next).l);
                if (strA != null) {
                    strA0 = AbstractC1119bh0.A0(strA, '-', strA);
                } else {
                    strA0 = null;
                }
            } while (!AbstractC1474fG.b(strA0, "es"));
            es0 = (Es0) next;
            if (es0 == null) {
                while (r9.hasNext()) {
                    if (((Es0) obj2).n) {
                        obj = obj2;
                        break;
                    }
                }
                es0 = (Es0) obj;
            }
        }
        for (Es0 es1 : list) {
            es1.n = es1 == es0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0091  */
    /* JADX WARN: Code duplicated, block: B:38:0x009b  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00af  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:72:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:? A[LOOP:1: B:36:0x0095->B:73:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:? A[LOOP:2: B:45:0x00b3->B:76:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:? A[LOOP:3: B:60:0x00e7->B:79:?, LOOP_END, SYNTHETIC] */
    public static final void f(Z10 z10, String str, Exception exc) {
        Object next;
        Q30 q30;
        String str2;
        Iterator it;
        Iterator it2;
        Iterator it3;
        z10.getClass();
        String strB = Cr0.m.b();
        if (AbstractC1474fG.b(strB, "PPV.TO")) {
            q30 = QW.b;
        } else {
            Q30.a.getClass();
            Iterator it4 = P30.b.iterator();
            do {
                if (!it4.hasNext()) {
                    next = null;
                    break;
                }
                next = it4.next();
            } while (!AbstractC1474fG.b(((Q30) next).getName(), strB));
            Q30 q31 = (Q30) next;
            q30 = q31 == null ? C1816io0.b : q31;
        }
        if (q30 == C1816io0.b) {
            if (AbstractC1899jh0.U(z10.c, "lumix-movie-", false) || AbstractC1899jh0.U(z10.c, "lumix-episode-", false)) {
                List listQ = Vb0.Q(Vb0.P(Vb0.K(exc, X10.n), 12));
                if (!listQ.isEmpty()) {
                    Iterator it5 = listQ.iterator();
                    while (it5.hasNext()) {
                        if (((Throwable) it5.next()) instanceof UnknownHostException) {
                            str2 = "dns";
                        }
                    }
                    if (listQ.isEmpty()) {
                        it3 = listQ.iterator();
                        while (it3.hasNext()) {
                            if (((Throwable) it3.next()) instanceof SocketTimeoutException) {
                                str2 = "timeout";
                            }
                        }
                        if (listQ.isEmpty()) {
                            it2 = listQ.iterator();
                            while (it2.hasNext()) {
                                if (((Throwable) it2.next()) instanceof SSLException) {
                                    str2 = "tls";
                                }
                            }
                            if (AbstractC1474fG.b(str, "servers")) {
                                str2 = "no_servers";
                            } else if (AbstractC1474fG.b(str, "parallel_extraction")) {
                                str2 = "all_extractors_failed";
                            } else if (listQ.isEmpty()) {
                                str2 = "unexpected";
                            } else {
                                it = listQ.iterator();
                                while (it.hasNext()) {
                                    if (((Throwable) it.next()) instanceof IOException) {
                                        str2 = "io";
                                    }
                                }
                                str2 = "unexpected";
                            }
                        } else if (AbstractC1474fG.b(str, "servers")) {
                            str2 = "no_servers";
                        } else if (AbstractC1474fG.b(str, "parallel_extraction")) {
                            str2 = "all_extractors_failed";
                        } else if (listQ.isEmpty()) {
                            str2 = "unexpected";
                        } else {
                            it = listQ.iterator();
                            while (it.hasNext()) {
                                if (((Throwable) it.next()) instanceof IOException) {
                                    str2 = "io";
                                }
                            }
                            str2 = "unexpected";
                        }
                    } else if (listQ.isEmpty()) {
                        it2 = listQ.iterator();
                        while (it2.hasNext()) {
                            if (((Throwable) it2.next()) instanceof SSLException) {
                                str2 = "tls";
                            }
                        }
                        if (AbstractC1474fG.b(str, "servers")) {
                            str2 = "no_servers";
                        } else if (AbstractC1474fG.b(str, "parallel_extraction")) {
                            str2 = "all_extractors_failed";
                        } else if (listQ.isEmpty()) {
                            str2 = "unexpected";
                        } else {
                            it = listQ.iterator();
                            while (it.hasNext()) {
                                if (((Throwable) it.next()) instanceof IOException) {
                                    str2 = "io";
                                }
                            }
                            str2 = "unexpected";
                        }
                    } else if (AbstractC1474fG.b(str, "servers")) {
                        str2 = "no_servers";
                    } else if (AbstractC1474fG.b(str, "parallel_extraction")) {
                        str2 = "all_extractors_failed";
                    } else if (listQ.isEmpty()) {
                        str2 = "unexpected";
                    } else {
                        it = listQ.iterator();
                        while (it.hasNext()) {
                            if (((Throwable) it.next()) instanceof IOException) {
                                str2 = "io";
                            }
                        }
                        str2 = "unexpected";
                    }
                } else if (listQ.isEmpty()) {
                    it3 = listQ.iterator();
                    while (it3.hasNext()) {
                        if (((Throwable) it3.next()) instanceof SocketTimeoutException) {
                            str2 = "timeout";
                        }
                    }
                    if (listQ.isEmpty()) {
                        it2 = listQ.iterator();
                        while (it2.hasNext()) {
                            if (((Throwable) it2.next()) instanceof SSLException) {
                                str2 = "tls";
                            }
                        }
                        if (AbstractC1474fG.b(str, "servers")) {
                            str2 = "no_servers";
                        } else if (AbstractC1474fG.b(str, "parallel_extraction")) {
                            str2 = "all_extractors_failed";
                        } else if (listQ.isEmpty()) {
                            str2 = "unexpected";
                        } else {
                            it = listQ.iterator();
                            while (it.hasNext()) {
                                if (((Throwable) it.next()) instanceof IOException) {
                                    str2 = "io";
                                }
                            }
                            str2 = "unexpected";
                        }
                    } else if (AbstractC1474fG.b(str, "servers")) {
                        str2 = "no_servers";
                    } else if (AbstractC1474fG.b(str, "parallel_extraction")) {
                        str2 = "all_extractors_failed";
                    } else if (listQ.isEmpty()) {
                        str2 = "unexpected";
                    } else {
                        it = listQ.iterator();
                        while (it.hasNext()) {
                            if (((Throwable) it.next()) instanceof IOException) {
                                str2 = "io";
                            }
                        }
                        str2 = "unexpected";
                    }
                } else if (listQ.isEmpty()) {
                    it2 = listQ.iterator();
                    while (it2.hasNext()) {
                        if (((Throwable) it2.next()) instanceof SSLException) {
                            str2 = "tls";
                        }
                    }
                    if (AbstractC1474fG.b(str, "servers")) {
                        str2 = "no_servers";
                    } else if (AbstractC1474fG.b(str, "parallel_extraction")) {
                        str2 = "all_extractors_failed";
                    } else if (listQ.isEmpty()) {
                        str2 = "unexpected";
                    } else {
                        it = listQ.iterator();
                        while (it.hasNext()) {
                            if (((Throwable) it.next()) instanceof IOException) {
                                str2 = "io";
                            }
                        }
                        str2 = "unexpected";
                    }
                } else if (AbstractC1474fG.b(str, "servers")) {
                    str2 = "no_servers";
                } else if (AbstractC1474fG.b(str, "parallel_extraction")) {
                    str2 = "all_extractors_failed";
                } else if (listQ.isEmpty()) {
                    str2 = "unexpected";
                } else {
                    it = listQ.iterator();
                    while (it.hasNext()) {
                        if (((Throwable) it.next()) instanceof IOException) {
                            str2 = "io";
                        }
                    }
                    str2 = "unexpected";
                }
                AbstractC0031b1.h(new C1054ay(str, str2, exc, 1));
            }
        }
    }

    public final void g(Ds0 ds0, Long l) {
        AbstractC1474fG.j(ds0, "server");
        if (l != null) {
            this.g = U9.f(l.longValue(), 0L);
        }
        C1703hg0 c1703hg0 = this.h;
        if (c1703hg0 != null) {
            c1703hg0.f(null);
        }
        this.h = null;
        C1703hg0 c1703hg1 = this.i;
        if (c1703hg1 != null) {
            c1703hg1.f(null);
        }
        this.i = null;
        this.i = AbstractC1376eG.w(AbstractC3021v9.o(this), AbstractC1910jn.b, 0, new V10(this, ds0, null), 2);
    }

    public final void h(List list, Long l) {
        AbstractC1474fG.j(list, "servers");
        if (list.isEmpty()) {
            return;
        }
        if (l != null) {
            this.g = U9.f(l.longValue(), 0L);
        }
        C1703hg0 c1703hg0 = this.h;
        if (c1703hg0 != null) {
            c1703hg0.f(null);
        }
        this.h = null;
        C1703hg0 c1703hg1 = this.i;
        if (c1703hg1 != null) {
            c1703hg1.f(null);
        }
        this.i = null;
        this.i = AbstractC1376eG.w(AbstractC3021v9.o(this), AbstractC1910jn.b, 0, new W10(list, this, null), 2);
    }

    public final void i(Video$Type video$Type, String str) {
        AbstractC1474fG.j(video$Type, "newVideoType");
        AbstractC1474fG.j(str, "newId");
        C1703hg0 c1703hg0 = this.h;
        if (c1703hg0 != null) {
            c1703hg0.f(null);
        }
        this.h = null;
        C1703hg0 c1703hg1 = this.i;
        if (c1703hg1 != null) {
            c1703hg1.f(null);
        }
        this.i = null;
        this.b = video$Type;
        this.c = str;
        C1703hg0 c1703hg2 = this.h;
        if (c1703hg2 != null) {
            c1703hg2.f(null);
        }
        this.h = null;
        C0548Ke c0548KeO = AbstractC3021v9.o(this);
        ExecutorC0891Xk executorC0891Xk = AbstractC1910jn.b;
        this.h = AbstractC1376eG.w(c0548KeO, executorC0891Xk, 0, new T10(this, str, video$Type, null), 2);
        AbstractC1376eG.w(AbstractC3021v9.o(this), executorC0891Xk, 0, new U10(video$Type, this, null), 2);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0071 A[PHI: r3
  0x0071: PHI (r3v16 java.lang.String) = (r3v9 java.lang.String), (r3v12 java.lang.String), (r3v19 java.lang.String) binds: [B:27:0x0060, B:32:0x006d, B:23:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    public final void j(Ds0 ds0) {
        Object next;
        Q30 q30;
        String str;
        boolean zG;
        if (ds0 != null) {
            String strB = Cr0.m.b();
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
                Q30 q31 = (Q30) next;
                q30 = q31 == null ? C1816io0.b : q31;
            }
            if (q30 == C1816io0.b) {
                Map map = ds0.f223o;
                if (map == null || (str = (String) map.get("_channel_flow_original_url")) == null) {
                    str = map != null ? (String) map.get("_channel_stream_url") : null;
                    if (str == null) {
                        String str2 = ds0.n;
                        str = str2.length() > 0 ? str2 : null;
                        if (str == null) {
                            zG = false;
                        } else {
                            zG = BlindajeCrypto.a.g(str);
                        }
                    } else {
                        zG = BlindajeCrypto.a.g(str);
                    }
                } else {
                    zG = BlindajeCrypto.a.g(str);
                }
                if (zG) {
                    g(ds0, null);
                    return;
                }
            }
        }
        C1703hg0 c1703hg0 = this.i;
        if (c1703hg0 != null) {
            c1703hg0.f(null);
        }
        this.i = null;
        Video$Type video$Type = this.b;
        String str3 = this.c;
        C1703hg0 c1703hg1 = this.h;
        if (c1703hg1 != null) {
            c1703hg1.f(null);
        }
        this.h = null;
        this.h = AbstractC1376eG.w(AbstractC3021v9.o(this), AbstractC1910jn.b, 0, new T10(this, str3, video$Type, null), 2);
    }

    public final void k(long j, long j2) {
        AbstractC1376eG.w(AbstractC3021v9.o(this), AbstractC1910jn.b, 0, new Y10(this, j, j2, null), 2);
    }
}
