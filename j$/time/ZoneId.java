package j$.time;

import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ZoneId implements Serializable {
    public static final Map a;
    private static final long serialVersionUID = 8352817235686L;

    static {
        Map.Entry[] entryArr = {j$.com.android.tools.r8.a.g("ACT", "Australia/Darwin"), j$.com.android.tools.r8.a.g("AET", "Australia/Sydney"), j$.com.android.tools.r8.a.g("AGT", "America/Argentina/Buenos_Aires"), j$.com.android.tools.r8.a.g("ART", "Africa/Cairo"), j$.com.android.tools.r8.a.g("AST", "America/Anchorage"), j$.com.android.tools.r8.a.g("BET", "America/Sao_Paulo"), j$.com.android.tools.r8.a.g("BST", "Asia/Dhaka"), j$.com.android.tools.r8.a.g("CAT", "Africa/Harare"), j$.com.android.tools.r8.a.g("CNT", "America/St_Johns"), j$.com.android.tools.r8.a.g("CST", "America/Chicago"), j$.com.android.tools.r8.a.g("CTT", "Asia/Shanghai"), j$.com.android.tools.r8.a.g("EAT", "Africa/Addis_Ababa"), j$.com.android.tools.r8.a.g("ECT", "Europe/Paris"), j$.com.android.tools.r8.a.g("IET", "America/Indiana/Indianapolis"), j$.com.android.tools.r8.a.g("IST", "Asia/Kolkata"), j$.com.android.tools.r8.a.g("JST", "Asia/Tokyo"), j$.com.android.tools.r8.a.g("MIT", "Pacific/Apia"), j$.com.android.tools.r8.a.g("NET", "Asia/Yerevan"), j$.com.android.tools.r8.a.g("NST", "Pacific/Auckland"), j$.com.android.tools.r8.a.g("PLT", "Asia/Karachi"), j$.com.android.tools.r8.a.g("PNT", "America/Phoenix"), j$.com.android.tools.r8.a.g("PRT", "America/Puerto_Rico"), j$.com.android.tools.r8.a.g("PST", "America/Los_Angeles"), j$.com.android.tools.r8.a.g("SST", "Pacific/Guadalcanal"), j$.com.android.tools.r8.a.g("VST", "Asia/Ho_Chi_Minh"), j$.com.android.tools.r8.a.g("EST", "-05:00"), j$.com.android.tools.r8.a.g("MST", "-07:00"), j$.com.android.tools.r8.a.g("HST", "-10:00")};
        HashMap map = new HashMap(28);
        for (int i = 0; i < 28; i++) {
            Map.Entry entry = entryArr[i];
            Object objRequireNonNull = Objects.requireNonNull(entry.getKey());
            if (map.put(objRequireNonNull, Objects.requireNonNull(entry.getValue())) != null) {
                throw new IllegalArgumentException("duplicate key: " + objRequireNonNull);
            }
        }
        a = Collections.unmodifiableMap(map);
    }

    ZoneId() {
        if (getClass() != ZoneOffset.class && getClass() != B.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public static ZoneId U(TemporalAccessor temporalAccessor) {
        ZoneId zoneId = (ZoneId) temporalAccessor.C(j$.time.temporal.l.k());
        if (zoneId != null) {
            return zoneId;
        }
        throw new C0111b("Unable to obtain ZoneId from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    static ZoneId W(String str, boolean z) {
        int i;
        Objects.requireNonNull(str, "zoneId");
        if (str.length() <= 1 || str.startsWith("+") || str.startsWith("-")) {
            return ZoneOffset.d0(str);
        }
        if (str.startsWith("UTC") || str.startsWith("GMT")) {
            i = 3;
        } else {
            if (!str.startsWith("UT")) {
                return B.a0(str, z);
            }
            i = 2;
        }
        return Y(str, i, z);
    }

    public static ZoneId X(String str, ZoneOffset zoneOffset) {
        Objects.requireNonNull(str, "prefix");
        Objects.requireNonNull(zoneOffset, "offset");
        if (str.isEmpty()) {
            return zoneOffset;
        }
        if (!str.equals("GMT") && !str.equals("UTC") && !str.equals("UT")) {
            throw new IllegalArgumentException("prefix should be GMT, UTC or UT, is: ".concat(str));
        }
        if (zoneOffset.c0() != 0) {
            str = str.concat(zoneOffset.o());
        }
        return new B(str, j$.time.zone.f.j(zoneOffset));
    }

    private static ZoneId Y(String str, int i, boolean z) {
        String strSubstring = str.substring(0, i);
        if (str.length() == i) {
            return X(strSubstring, ZoneOffset.UTC);
        }
        if (str.charAt(i) != '+' && str.charAt(i) != '-') {
            return B.a0(str, z);
        }
        try {
            ZoneOffset zoneOffsetD0 = ZoneOffset.d0(str.substring(i));
            return zoneOffsetD0 == ZoneOffset.UTC ? X(strSubstring, zoneOffsetD0) : X(strSubstring, zoneOffsetD0);
        } catch (C0111b e) {
            throw new C0111b("Invalid ID for offset-based ZoneId: ".concat(str), e);
        }
    }

    public static ZoneId of(String str) {
        return W(str, true);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new w((byte) 7, this);
    }

    public abstract j$.time.zone.f V();

    abstract void Z(DataOutput dataOutput);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneId) {
            return o().equals(((ZoneId) obj).o());
        }
        return false;
    }

    public int hashCode() {
        return o().hashCode();
    }

    public abstract String o();

    public String toString() {
        return o();
    }
}
