package j$.util;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: j$.util.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0147m {
    private static final C0147m c = new C0147m();
    private final boolean a;
    private final long b;

    private C0147m() {
        this.a = false;
        this.b = 0L;
    }

    private C0147m(long j) {
        this.a = true;
        this.b = j;
    }

    public static C0147m a() {
        return c;
    }

    public static C0147m d(long j) {
        return new C0147m(j);
    }

    public final long b() {
        if (this.a) {
            return this.b;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0147m)) {
            return false;
        }
        C0147m c0147m = (C0147m) obj;
        boolean z = this.a;
        if (z && c0147m.a) {
            if (this.b == c0147m.b) {
                return true;
            }
        } else if (z == c0147m.a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (!this.a) {
            return 0;
        }
        long j = this.b;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        if (!this.a) {
            return "OptionalLong.empty";
        }
        return "OptionalLong[" + this.b + "]";
    }
}
