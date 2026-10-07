package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Nx0 {
    public final int a;
    public final String b;
    public final List c;

    public Nx0(int i, String str, List list) {
        AbstractC1474fG.j(str, "name");
        this.a = i;
        this.b = str;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Nx0)) {
            return false;
        }
        Nx0 nx0 = (Nx0) obj;
        return this.a == nx0.a && AbstractC1474fG.b(this.b, nx0.b) && AbstractC1474fG.b(this.c, nx0.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + AbstractC1674hK.i(this.a * 31, this.b, 31);
    }

    public final String toString() {
        return "LiveCategory(id=" + this.a + ", name=" + this.b + ", channelCodes=" + this.c + ")";
    }
}
