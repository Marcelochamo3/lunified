package o;

import java.io.Serializable;

/* JADX INFO: renamed from: o.p80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2439p80 implements Serializable {
    public final Throwable l;

    public C2439p80(Throwable th) {
        AbstractC1474fG.j(th, "exception");
        this.l = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2439p80) {
            if (AbstractC1474fG.b(this.l, ((C2439p80) obj).l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.l.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.l + ')';
    }
}
