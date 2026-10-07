package j$.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: j$.time.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0110a extends Clock implements Serializable {
    static final C0110a b;
    private static final long serialVersionUID = 6740630888130243051L;
    private final ZoneId a;

    static {
        System.currentTimeMillis();
        b = new C0110a(ZoneOffset.UTC);
    }

    C0110a(ZoneId zoneId) {
        this.a = zoneId;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
    }

    @Override // j$.time.Clock
    public final ZoneId a() {
        return this.a;
    }

    @Override // j$.time.Clock
    public final long b() {
        return System.currentTimeMillis();
    }

    @Override // j$.time.Clock
    public final boolean equals(Object obj) {
        if (!(obj instanceof C0110a)) {
            return false;
        }
        return this.a.equals(((C0110a) obj).a);
    }

    @Override // j$.time.Clock
    public final int hashCode() {
        return this.a.hashCode() + 1;
    }

    @Override // j$.time.Clock
    public final Instant instant() {
        return Instant.ofEpochMilli(System.currentTimeMillis());
    }

    public final String toString() {
        return "SystemClock[" + this.a + "]";
    }
}
