package o;

import java.io.Serializable;

/* JADX INFO: renamed from: o.x80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3214x80 extends HW implements Serializable {
    private static final long serialVersionUID = 0;
    public final HW l;

    public C3214x80(HW hw) {
        hw.getClass();
        this.l = hw;
    }

    @Override // o.HW
    public final HW a() {
        return this.l;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.l.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3214x80) {
            return this.l.equals(((C3214x80) obj).l);
        }
        return false;
    }

    public final int hashCode() {
        return -this.l.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.l);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 10);
        sb.append(strValueOf);
        sb.append(".reverse()");
        return sb.toString();
    }
}
