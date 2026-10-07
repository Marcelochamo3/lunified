package j$.util;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: j$.util.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0146l {
    private static final C0146l c = new C0146l();
    private final boolean a;
    private final double b;

    private C0146l() {
        this.a = false;
        this.b = Double.NaN;
    }

    private C0146l(double d) {
        this.a = true;
        this.b = d;
    }

    public static C0146l a() {
        return c;
    }

    public static C0146l d(double d) {
        return new C0146l(d);
    }

    public final double b() {
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
        if (!(obj instanceof C0146l)) {
            return false;
        }
        C0146l c0146l = (C0146l) obj;
        boolean z = this.a;
        if (z && c0146l.a) {
            if (Double.compare(this.b, c0146l.b) == 0) {
                return true;
            }
        } else if (z == c0146l.a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (!this.a) {
            return 0;
        }
        long jDoubleToLongBits = Double.doubleToLongBits(this.b);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public final String toString() {
        if (!this.a) {
            return "OptionalDouble.empty";
        }
        return "OptionalDouble[" + this.b + "]";
    }
}
