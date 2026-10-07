package o;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: o.aD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0983aD {
    public static final C1957kB[] a;
    public static final Map b;

    static {
        C1957kB c1957kB = new C1957kB("", C1957kB.i);
        C2468pa c2468pa = C1957kB.f;
        C1957kB c1957kB2 = new C1957kB("GET", c2468pa);
        C1957kB c1957kB3 = new C1957kB("POST", c2468pa);
        C2468pa c2468pa2 = C1957kB.g;
        C1957kB c1957kB4 = new C1957kB("/", c2468pa2);
        C1957kB c1957kB5 = new C1957kB("/index.html", c2468pa2);
        C2468pa c2468pa3 = C1957kB.h;
        C1957kB c1957kB6 = new C1957kB("http", c2468pa3);
        C1957kB c1957kB7 = new C1957kB("https", c2468pa3);
        C2468pa c2468pa4 = C1957kB.e;
        C1957kB[] c1957kBArr = {c1957kB, c1957kB2, c1957kB3, c1957kB4, c1957kB5, c1957kB6, c1957kB7, new C1957kB("200", c2468pa4), new C1957kB("204", c2468pa4), new C1957kB("206", c2468pa4), new C1957kB("304", c2468pa4), new C1957kB("400", c2468pa4), new C1957kB("404", c2468pa4), new C1957kB("500", c2468pa4), new C1957kB("accept-charset", ""), new C1957kB("accept-encoding", "gzip, deflate"), new C1957kB("accept-language", ""), new C1957kB("accept-ranges", ""), new C1957kB("accept", ""), new C1957kB("access-control-allow-origin", ""), new C1957kB("age", ""), new C1957kB("allow", ""), new C1957kB("authorization", ""), new C1957kB("cache-control", ""), new C1957kB("content-disposition", ""), new C1957kB("content-encoding", ""), new C1957kB("content-language", ""), new C1957kB("content-length", ""), new C1957kB("content-location", ""), new C1957kB("content-range", ""), new C1957kB("content-type", ""), new C1957kB("cookie", ""), new C1957kB("date", ""), new C1957kB("etag", ""), new C1957kB("expect", ""), new C1957kB("expires", ""), new C1957kB("from", ""), new C1957kB("host", ""), new C1957kB("if-match", ""), new C1957kB("if-modified-since", ""), new C1957kB("if-none-match", ""), new C1957kB("if-range", ""), new C1957kB("if-unmodified-since", ""), new C1957kB("last-modified", ""), new C1957kB("link", ""), new C1957kB("location", ""), new C1957kB("max-forwards", ""), new C1957kB("proxy-authenticate", ""), new C1957kB("proxy-authorization", ""), new C1957kB("range", ""), new C1957kB("referer", ""), new C1957kB("refresh", ""), new C1957kB("retry-after", ""), new C1957kB("server", ""), new C1957kB("set-cookie", ""), new C1957kB("strict-transport-security", ""), new C1957kB("transfer-encoding", ""), new C1957kB("user-agent", ""), new C1957kB("vary", ""), new C1957kB("via", ""), new C1957kB("www-authenticate", "")};
        a = c1957kBArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(c1957kBArr[i].a)) {
                linkedHashMap.put(c1957kBArr[i].a, Integer.valueOf(i));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        AbstractC1474fG.i(mapUnmodifiableMap, "unmodifiableMap(result)");
        b = mapUnmodifiableMap;
    }

    public static void a(C2468pa c2468pa) {
        AbstractC1474fG.j(c2468pa, "name");
        int iD = c2468pa.d();
        for (int i = 0; i < iD; i++) {
            byte bG = c2468pa.g(i);
            if (65 <= bG && bG < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(c2468pa.k()));
            }
        }
    }
}
