package o;

/* JADX INFO: renamed from: o.kB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1957kB {
    public static final C2468pa d;
    public static final C2468pa e;
    public static final C2468pa f;
    public static final C2468pa g;
    public static final C2468pa h;
    public static final C2468pa i;
    public final C2468pa a;
    public final C2468pa b;
    public final int c;

    static {
        C2468pa c2468pa = C2468pa.f972o;
        d = C2691rp.t(":");
        e = C2691rp.t(":status");
        f = C2691rp.t(":method");
        g = C2691rp.t(":path");
        h = C2691rp.t(":scheme");
        i = C2691rp.t(":authority");
    }

    public C1957kB(C2468pa c2468pa, C2468pa c2468pa2) {
        AbstractC1474fG.j(c2468pa, "name");
        AbstractC1474fG.j(c2468pa2, "value");
        this.a = c2468pa;
        this.b = c2468pa2;
        this.c = c2468pa2.d() + c2468pa.d() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1957kB)) {
            return false;
        }
        C1957kB c1957kB = (C1957kB) obj;
        return AbstractC1474fG.b(this.a, c1957kB.a) && AbstractC1474fG.b(this.b, c1957kB.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.a.k() + ": " + this.b.k();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1957kB(String str, String str2) {
        this(C2691rp.t(str), C2691rp.t(str2));
        AbstractC1474fG.j(str, "name");
        AbstractC1474fG.j(str2, "value");
        C2468pa c2468pa = C2468pa.f972o;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1957kB(String str, C2468pa c2468pa) {
        this(c2468pa, C2691rp.t(str));
        AbstractC1474fG.j(c2468pa, "name");
        AbstractC1474fG.j(str, "value");
        C2468pa c2468pa2 = C2468pa.f972o;
    }
}
