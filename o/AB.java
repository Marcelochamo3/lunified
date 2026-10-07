package o;

import com.skidush.clonex.database.AppDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class AB {
    public final String a;
    public final AppDatabase b;

    public AB(String str, AppDatabase appDatabase) {
        AbstractC1474fG.j(str, "providerName");
        this.a = str;
        this.b = appDatabase;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AB)) {
            return false;
        }
        AB ab = (AB) obj;
        return AbstractC1474fG.b(this.a, ab.a) && AbstractC1474fG.b(this.b, ab.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ProviderSource(providerName=" + this.a + ", database=" + this.b + ")";
    }
}
