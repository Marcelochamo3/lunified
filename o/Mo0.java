package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Mo0 extends AbstractC2506pt {
    public final C2109lo0 m;
    public final Ma0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f402o;

    public Mo0(C2109lo0 c2109lo0, Ma0 ma0, List list) {
        AbstractC1474fG.j(c2109lo0, "tvShow");
        AbstractC1474fG.j(ma0, "season");
        this.m = c2109lo0;
        this.n = ma0;
        this.f402o = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Mo0)) {
            return false;
        }
        Mo0 mo0 = (Mo0) obj;
        return AbstractC1474fG.b(this.m, mo0.m) && AbstractC1474fG.b(this.n, mo0.n) && AbstractC1474fG.b(this.f402o, mo0.f402o);
    }

    public final int hashCode() {
        return this.f402o.hashCode() + ((this.n.hashCode() + (this.m.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SuccessLoading(tvShow=" + this.m + ", season=" + this.n + ", episodes=" + this.f402o + ")";
    }
}
