package o;

import j$.time.Duration;
import j$.time.Instant;
import java.security.PrivateKey;
import java.util.Iterator;

/* JADX INFO: renamed from: o.a90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0979a90 {
    private static final Duration a = Duration.ofSeconds(300);

    private C0979a90() {
    }

    public static void a(AQ aq, C1672hI c1672hI, PrivateKey privateKey, C1174c90 c1174c90) {
        b(aq, c1672hI, privateKey, c1174c90, Instant.now());
    }

    public static void b(AQ aq, C1672hI c1672hI, PrivateKey privateKey, C1174c90 c1174c90, Instant instant) {
        int iC = EW.c("sig0validity");
        aq.b(C0629Ni.D(aq, c1174c90, c1672hI, privateKey, instant, instant.plus(iC < 0 ? a : Duration.ofSeconds(iC))), 3);
    }

    public static void c(AQ aq, byte[] bArr, C1672hI c1672hI, C1174c90 c1174c90) throws C0629Ni.b {
        d(aq, bArr, c1672hI, c1174c90, Instant.now());
    }

    public static void d(AQ aq, byte[] bArr, C1672hI c1672hI, C1174c90 c1174c90, Instant instant) throws C0629Ni.b {
        C1174c90 c1174c91;
        Iterator<H50> it = aq.q(3).iterator();
        while (true) {
            if (!it.hasNext()) {
                c1174c91 = null;
                break;
            }
            H50 next = it.next();
            if (next.y() == 24) {
                c1174c91 = (C1174c90) next;
                if (c1174c91.c0() == 0) {
                    break;
                }
            }
        }
        C0629Ni.R(aq, bArr, c1174c91, c1174c90, c1672hI, instant);
    }
}
