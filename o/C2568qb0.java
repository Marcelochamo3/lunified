package o;

/* JADX INFO: renamed from: o.qb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2568qb0 {
    public final C2858tb0 a;
    public final C2858tb0 b;

    public C2568qb0(C2858tb0 c2858tb0, C2858tb0 c2858tb1) {
        this.a = c2858tb0;
        this.b = c2858tb1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2568qb0.class != obj.getClass()) {
            return false;
        }
        C2568qb0 c2568qb0 = (C2568qb0) obj;
        return this.a.equals(c2568qb0.a) && this.b.equals(c2568qb0.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        C2858tb0 c2858tb0 = this.a;
        sb.append(c2858tb0);
        C2858tb0 c2858tb1 = this.b;
        if (c2858tb0.equals(c2858tb1)) {
            str = "";
        } else {
            str = ", " + c2858tb1;
        }
        return AbstractC1701hf0.h(sb, str, "]");
    }
}
