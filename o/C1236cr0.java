package o;

/* JADX INFO: renamed from: o.cr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1236cr0 {
    public final String a;
    public final String b;

    public C1236cr0(String str, String str2) {
        AbstractC1474fG.j(str, "authToken");
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1236cr0)) {
            return false;
        }
        C1236cr0 c1236cr0 = (C1236cr0) obj;
        return AbstractC1474fG.b(this.a, c1236cr0.a) && AbstractC1474fG.b(this.b, c1236cr0.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SecuritySession(authToken=");
        sb.append(this.a);
        sb.append(", securityToken=");
        return AbstractC1701hf0.h(sb, this.b, ")");
    }
}
