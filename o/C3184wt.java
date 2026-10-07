package o;

import java.util.Map;

/* JADX INFO: renamed from: o.wt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3184wt {
    public final String a;
    public final int b;
    public final Map c;

    public C3184wt(String str, int i, Map map) {
        AbstractC1474fG.j(str, "id");
        this.a = str;
        this.b = i;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3184wt)) {
            return false;
        }
        C3184wt c3184wt = (C3184wt) obj;
        return AbstractC1474fG.b(this.a, c3184wt.a) && this.b == c3184wt.b && AbstractC1474fG.b(this.c, c3184wt.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.a.hashCode() * 31) + this.b) * 31);
    }

    public final String toString() {
        return "PlaylistRequest(id=" + this.a + ", page=" + this.b + ", params=" + this.c + ")";
    }
}
