package o;

/* JADX INFO: renamed from: o.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1058b0 {
    public transient P l;
    public transient C0960a0 m;
    public transient O n;

    public abstract O a();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1058b0) {
            return ((K) this).a().equals(((K) ((AbstractC1058b0) obj)).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().n.hashCode();
    }

    public final String toString() {
        return a().n.toString();
    }
}
