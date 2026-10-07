package o;

import java.util.List;

/* JADX INFO: renamed from: o.Ts, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0795Ts {
    public final String a;
    public final List b;
    public final int c;

    public C0795Ts(int i, String str, List list) {
        this.a = str;
        this.b = list;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0795Ts)) {
            return false;
        }
        C0795Ts c0795Ts = (C0795Ts) obj;
        return AbstractC1474fG.b(this.a, c0795Ts.a) && AbstractC1474fG.b(this.b, c0795Ts.b) && this.c == c0795Ts.c;
    }

    public final int hashCode() {
        String str = this.a;
        return AbstractC1674hK.j(this.b, (str == null ? 0 : str.hashCode()) * 31, 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FanaPlaylistPage(title=");
        sb.append(this.a);
        sb.append(", items=");
        sb.append(this.b);
        sb.append(", lastPage=");
        return AbstractC1701hf0.g(sb, this.c, ")");
    }
}
