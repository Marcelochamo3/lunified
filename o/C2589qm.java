package o;

/* JADX INFO: renamed from: o.qm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2589qm {
    public final String a;
    public final String b;
    public final String c;

    public C2589qm(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2589qm.class != obj.getClass()) {
            return false;
        }
        C2589qm c2589qm = (C2589qm) obj;
        return Lr0.a(this.a, c2589qm.a) && Lr0.a(this.b, c2589qm.b) && Lr0.a(this.c, c2589qm.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
