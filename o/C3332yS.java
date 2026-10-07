package o;

/* JADX INFO: renamed from: o.yS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3332yS {
    public Class a;
    public Class b;
    public Class c;

    public C3332yS(Class cls, Class cls2, Class cls3) {
        this.a = cls;
        this.b = cls2;
        this.c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3332yS.class != obj.getClass()) {
            return false;
        }
        C3332yS c3332yS = (C3332yS) obj;
        return this.a.equals(c3332yS.a) && this.b.equals(c3332yS.b) && Kr0.b(this.c, c3332yS.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Class cls = this.c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.a + ", second=" + this.b + '}';
    }
}
