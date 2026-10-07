package o;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import java.util.Locale;

/* JADX INFO: renamed from: o.It, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0511It {
    public static final DateTimeFormatter a = DateTimeFormatter.ofPattern("dd/MM · HH:mm", new Locale("es", "AR")).withZone(ZoneId.of("America/Argentina/Buenos_Aires"));

    public static String a(String str) {
        Object objK;
        if (str == null) {
            return null;
        }
        if (!(!AbstractC1899jh0.O(str))) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        try {
            objK = a.format(Instant.parse(str));
        } catch (Throwable th) {
            objK = Jp0.k(th);
        }
        return (String) (objK instanceof C2439p80 ? null : objK);
    }
}
