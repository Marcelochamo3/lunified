package j$.time.temporal;

import j$.time.EnumC0125d;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class t implements Serializable {
    private static final ConcurrentHashMap g = new ConcurrentHashMap(4, 2);
    public static final TemporalUnit h;
    private static final long serialVersionUID = -1177360819670808121L;
    private final EnumC0125d a;
    private final int b;
    private final transient p c = s.e(this);
    private final transient p d = s.h(this);
    private final transient p e;
    private final transient p f;

    static {
        new t(EnumC0125d.MONDAY, 4);
        g(EnumC0125d.SUNDAY, 1);
        h = i.d;
    }

    private t(EnumC0125d enumC0125d, int i) {
        ChronoUnit chronoUnit = ChronoUnit.NANOS;
        this.e = s.i(this);
        this.f = s.g(this);
        Objects.requireNonNull(enumC0125d, "firstDayOfWeek");
        if (i < 1 || i > 7) {
            throw new IllegalArgumentException("Minimal number of days is invalid");
        }
        this.a = enumC0125d;
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static t g(EnumC0125d enumC0125d, int i) {
        String str = enumC0125d.toString() + i;
        ConcurrentHashMap concurrentHashMap = g;
        t tVar = (t) concurrentHashMap.get(str);
        if (tVar != null) {
            return tVar;
        }
        concurrentHashMap.putIfAbsent(str, new t(enumC0125d, i));
        return (t) concurrentHashMap.get(str);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        if (this.a == null) {
            throw new InvalidObjectException("firstDayOfWeek is null");
        }
        int i = this.b;
        if (i < 1 || i > 7) {
            throw new InvalidObjectException("Minimal number of days is invalid");
        }
    }

    private Object readResolve() throws InvalidObjectException {
        try {
            return g(this.a, this.b);
        } catch (IllegalArgumentException e) {
            throw new InvalidObjectException("Invalid serialized WeekFields: " + e.getMessage());
        }
    }

    public final p d() {
        return this.c;
    }

    public final EnumC0125d e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && hashCode() == obj.hashCode();
    }

    public final int f() {
        return this.b;
    }

    public final p h() {
        return this.f;
    }

    public final int hashCode() {
        return (this.a.ordinal() * 7) + this.b;
    }

    public final p i() {
        return this.d;
    }

    public final p j() {
        return this.e;
    }

    public final String toString() {
        return "WeekFields[" + this.a + "," + this.b + "]";
    }
}
