package o;

/* JADX INFO: loaded from: classes.dex */
public final class Su0 {
    public final C2446pE a;
    public final C2446pE b;
    public final String c;
    public final String d;

    public Su0(C2446pE c2446pE, C2446pE c2446pE2, String str, String str2) {
        this.a = c2446pE;
        this.b = c2446pE2;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Su0)) {
            return false;
        }
        Su0 su0 = (Su0) obj;
        return AbstractC1474fG.b(this.a, su0.a) && AbstractC1474fG.b(this.b, su0.b) && AbstractC1474fG.b(this.c, su0.c) && AbstractC1474fG.b(this.d, su0.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + AbstractC1674hK.i(AbstractC1674hK.i(this.a.i.hashCode() * 31, this.b.i, 31), this.c, 31);
    }

    public final String toString() {
        return "Gate(challengeUrl=" + this.a + ", actionUrl=" + this.b + ", csrf=" + this.c + ", access=" + this.d + ")";
    }
}
