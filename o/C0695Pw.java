package o;

import j$.time.Instant;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.time.format.DateTimeParseException;

/* JADX INFO: renamed from: o.Pw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0695Pw {
    private static final DateTimeFormatter a = DateTimeFormatter.ofPattern("yyyyMMddHHmmss").withZone(ZoneOffset.UTC);

    private C0695Pw() {
    }

    public static String a(Instant instant) {
        return a.format(instant);
    }

    public static Instant b(String str) {
        if (str.length() == 14) {
            return (Instant) a.parse(str, new C0669Ow());
        }
        if (str.length() <= 10) {
            return Instant.ofEpochSecond(Long.parseLong(str));
        }
        throw new DateTimeParseException("Invalid time encoding: ", str, 0);
    }
}
