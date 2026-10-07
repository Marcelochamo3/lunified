package o;

import j$.time.Clock;
import j$.time.Instant;
import j$.time.temporal.ChronoUnit;
import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: renamed from: o.qI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C2547qI {
    public static final String e = "dnsjava.dnssec.keycache.max_ttl";
    public static final String f = "dnsjava.dnssec.keycache.max_size";
    private static final int g = 900;
    private static final int h = 1000;
    private final Map<String, b> a;
    private final Clock b;
    private long c;
    private int d;

    /* JADX INFO: renamed from: o.qI$a */
    public class a extends LinkedHashMap<String, b> {
        public a() {
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<String, b> entry) {
            return size() >= C2547qI.this.d;
        }
    }

    /* JADX INFO: renamed from: o.qI$b */
    public class b {
        private final Instant a;
        private final C2643rI b;

        public b(C2643rI c2643rI, long j) {
            long jP = c2643rI.p();
            this.a = C2547qI.this.b.instant().e(jP <= j ? jP : j, ChronoUnit.SECONDS);
            this.b = c2643rI;
        }
    }

    public C2547qI() {
        this(Clock.systemUTC());
    }

    private String e(C2848tT c2848tT, int i) {
        return "K" + i + "/" + c2848tT;
    }

    private C2643rI f(String str) {
        b bVar = this.a.get(str);
        if (bVar == null) {
            return null;
        }
        if (!bVar.a.isBefore(this.b.instant())) {
            return bVar.b;
        }
        this.a.remove(str);
        return null;
    }

    public C2643rI c(C2848tT c2848tT, int i) {
        while (c2848tT.s() > 0) {
            C2643rI c2643rIF = f(e(c2848tT, i));
            if (c2643rIF != null) {
                return c2643rIF;
            }
            c2848tT = new C2848tT(c2848tT, 1);
        }
        return null;
    }

    public void d(Properties properties) {
        if (properties == null) {
            return;
        }
        String property = properties.getProperty(e);
        if (property != null) {
            this.c = Long.parseLong(property);
        }
        String property2 = properties.getProperty(f);
        if (property2 != null) {
            this.d = Integer.parseInt(property2);
        }
    }

    public void g(C2643rI c2643rI) {
        if ((c2643rI.z() || c2643rI.A()) && c2643rI.getType() == 48) {
            this.a.put(e(c2643rI.o(), c2643rI.n()), new b(c2643rI, this.c));
        }
    }

    public C2547qI(Clock clock) {
        this.c = 900L;
        this.d = h;
        this.b = clock;
        this.a = DesugarCollections.synchronizedMap(new a());
    }
}
