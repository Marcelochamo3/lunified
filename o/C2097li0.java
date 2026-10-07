package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: o.li0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2097li0 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    public C2097li0(String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
        this.e = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2097li0)) {
            return false;
        }
        C2097li0 c2097li0 = (C2097li0) obj;
        if (AbstractC1474fG.b(this.a, c2097li0.a) && AbstractC1474fG.b(this.b, c2097li0.b) && AbstractC1474fG.b(this.c, c2097li0.c) && AbstractC1474fG.b(this.d, c2097li0.d)) {
            return AbstractC1474fG.b(this.e, c2097li0.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + AbstractC1674hK.j(this.d, AbstractC1674hK.i(AbstractC1674hK.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31);
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.a + "', onDelete='" + this.b + " +', onUpdate='" + this.c + "', columnNames=" + this.d + ", referenceColumnNames=" + this.e + '}';
    }
}
