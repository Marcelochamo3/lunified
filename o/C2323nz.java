package o;

/* JADX INFO: renamed from: o.nz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2323nz implements Cloneable {
    public C2743sL l;

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C2323nz clone() {
        try {
            return (C2323nz) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean c(Object obj) {
        if (obj instanceof C2323nz) {
            return Kr0.b(this.l, ((C2323nz) obj).l);
        }
        return false;
    }

    public final int d() {
        C2743sL c2743sL = this.l;
        if (c2743sL != null) {
            return c2743sL.hashCode();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2323nz) && c(obj);
    }

    public final int hashCode() {
        return d();
    }
}
