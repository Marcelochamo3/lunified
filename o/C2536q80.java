package o;

import java.io.Serializable;

/* JADX INFO: renamed from: o.q80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2536q80 implements Serializable {
    public final Object l;

    public static final Throwable a(Object obj) {
        if (obj instanceof C2439p80) {
            return ((C2439p80) obj).l;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2536q80) {
            return AbstractC1474fG.b(this.l, ((C2536q80) obj).l);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.l;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.l;
        if (obj instanceof C2439p80) {
            return ((C2439p80) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
