package o;

import com.skidush.clonex.database.AppDatabase;

/* JADX INFO: renamed from: o.au, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1046au {
    public final String a;
    public final AppDatabase b;

    public C1046au(String str, AppDatabase appDatabase) {
        AbstractC1474fG.j(str, "providerName");
        this.a = str;
        this.b = appDatabase;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1046au)) {
            return false;
        }
        C1046au c1046au = (C1046au) obj;
        return AbstractC1474fG.b(this.a, c1046au.a) && AbstractC1474fG.b(this.b, c1046au.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ProviderSource(providerName=" + this.a + ", database=" + this.b + ")";
    }
}
