package j$.time;

import j$.util.Objects;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Clock {
    protected Clock() {
    }

    public static Clock c() {
        String id = TimeZone.getDefault().getID();
        Objects.requireNonNull(id, "zoneId");
        Map map = ZoneId.a;
        Objects.requireNonNull(map, "aliasMap");
        Object objRequireNonNull = (String) map.get(id);
        if (objRequireNonNull == null) {
            objRequireNonNull = Objects.requireNonNull(id, "defaultObj");
        }
        return new C0110a(ZoneId.of((String) objRequireNonNull));
    }

    public static Clock systemUTC() {
        return C0110a.b;
    }

    public abstract ZoneId a();

    public long b() {
        return instant().toEpochMilli();
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public abstract Instant instant();
}
