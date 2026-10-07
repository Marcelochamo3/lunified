package o;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class Ox0 {
    public final String a;
    public final String b;
    public final String c;
    public final Integer d;
    public final String e;
    public final String f;
    public final String g;
    public final List h;
    public final Set i;

    public Ox0(String str, String str2, String str3, Integer num, String str4, String str5, String str6, List list, LinkedHashSet linkedHashSet) {
        AbstractC1474fG.j(str, "code");
        AbstractC1474fG.j(linkedHashSet, "categoryIds");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = num;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = list;
        this.i = linkedHashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ox0)) {
            return false;
        }
        Ox0 ox0 = (Ox0) obj;
        return AbstractC1474fG.b(this.a, ox0.a) && AbstractC1474fG.b(this.b, ox0.b) && AbstractC1474fG.b(this.c, ox0.c) && AbstractC1474fG.b(this.d, ox0.d) && AbstractC1474fG.b(this.e, ox0.e) && AbstractC1474fG.b(this.f, ox0.f) && AbstractC1474fG.b(this.g, ox0.g) && AbstractC1474fG.b(this.h, ox0.h) && AbstractC1474fG.b(this.i, ox0.i);
    }

    public final int hashCode() {
        int i = AbstractC1674hK.i(AbstractC1674hK.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
        Integer num = this.d;
        int i2 = AbstractC1674hK.i((i + (num == null ? 0 : num.hashCode())) * 31, this.e, 31);
        String str = this.f;
        return this.i.hashCode() + AbstractC1674hK.j(this.h, AbstractC1674hK.i((i2 + (str != null ? str.hashCode() : 0)) * 31, this.g, 31), 31);
    }

    public final String toString() {
        return "LiveChannel(code=" + this.a + ", name=" + this.b + ", alias=" + this.c + ", number=" + this.d + ", quality=" + this.e + ", poster=" + this.f + ", supportVideoType=" + this.g + ", addresses=" + this.h + ", categoryIds=" + this.i + ")";
    }
}
