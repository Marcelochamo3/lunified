package j$.time;

/* JADX INFO: loaded from: classes2.dex */
public class TimeConversions {
    public static Duration convert(java.time.Duration duration) {
        if (duration == null) {
            return null;
        }
        return Duration.C(duration.getSeconds(), duration.getNano());
    }

    public static Instant convert(java.time.Instant instant) {
        if (instant == null) {
            return null;
        }
        return Instant.V(instant.getEpochSecond(), instant.getNano());
    }

    public static java.time.Duration convert(Duration duration) {
        if (duration == null) {
            return null;
        }
        return java.time.Duration.ofSeconds(duration.getSeconds(), duration.t());
    }
}
