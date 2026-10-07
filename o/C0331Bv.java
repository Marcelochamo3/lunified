package o;

/* JADX INFO: renamed from: o.Bv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0331Bv {
    public final Js0 a;
    public final Ds0 b;

    public C0331Bv(Js0 js0, Ds0 ds0) {
        AbstractC1474fG.j(js0, "video");
        AbstractC1474fG.j(ds0, "server");
        this.a = js0;
        this.b = ds0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0331Bv)) {
            return false;
        }
        C0331Bv c0331Bv = (C0331Bv) obj;
        return AbstractC1474fG.b(this.a, c0331Bv.a) && AbstractC1474fG.b(this.b, c0331Bv.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ResolvedVideo(video=" + this.a + ", server=" + this.b + ")";
    }
}
