package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Px0 {
    public final int a;
    public final String b;
    public final List c;

    public Px0(int i, String str, List list) {
        this.a = i;
        this.b = str;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Px0)) {
            return false;
        }
        Px0 px0 = (Px0) obj;
        return this.a == px0.a && AbstractC1474fG.b(this.b, px0.b) && AbstractC1474fG.b(this.c, px0.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + AbstractC1674hK.i(this.a * 31, this.b, 31);
    }

    public final String toString() {
        return "LoadedCategory(id=" + this.a + ", name=" + this.b + ", channels=" + this.c + ")";
    }
}
