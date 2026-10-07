package o;

/* JADX INFO: renamed from: o.pn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2495pn0 {
    public final Js0 a;
    public final Ds0 b;

    public C2495pn0(Js0 js0, Ds0 ds0) {
        AbstractC1474fG.j(js0, "video");
        AbstractC1474fG.j(ds0, "server");
        this.a = js0;
        this.b = ds0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2495pn0)) {
            return false;
        }
        C2495pn0 c2495pn0 = (C2495pn0) obj;
        return AbstractC1474fG.b(this.a, c2495pn0.a) && AbstractC1474fG.b(this.b, c2495pn0.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ResolvedVideo(video=" + this.a + ", server=" + this.b + ")";
    }
}
