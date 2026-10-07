package o;

/* JADX INFO: renamed from: o.iZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1787iZ {
    public final int a;
    public final boolean b;

    public C1787iZ(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1787iZ)) {
            return false;
        }
        C1787iZ c1787iZ = (C1787iZ) obj;
        return this.a == c1787iZ.a && this.b == c1787iZ.b;
    }

    public final int hashCode() {
        return (this.a * 31) + (this.b ? 1231 : 1237);
    }

    public final String toString() {
        return "Decision(consecutiveStalls=" + this.a + ", shouldSwitchServer=" + this.b + ")";
    }
}
