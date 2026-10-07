package o;

/* JADX INFO: renamed from: o.wP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3135wP {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public C3135wP(Object obj) {
        this(-1L, obj);
    }

    public final boolean a() {
        return this.b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3135wP)) {
            return false;
        }
        C3135wP c3135wP = (C3135wP) obj;
        return this.a.equals(c3135wP.a) && this.b == c3135wP.b && this.c == c3135wP.c && this.d == c3135wP.d && this.e == c3135wP.e;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public C3135wP(long j, Object obj) {
        this(obj, -1, -1, j, -1);
    }

    public C3135wP(C3135wP c3135wP) {
        this.a = c3135wP.a;
        this.b = c3135wP.b;
        this.c = c3135wP.c;
        this.d = c3135wP.d;
        this.e = c3135wP.e;
    }

    public C3135wP(Object obj, int i, int i2, long j, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }
}
