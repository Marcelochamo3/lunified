package o;

/* JADX INFO: loaded from: classes.dex */
public final class ZF extends XF {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ZF f654o = new ZF(1, 0, 1);

    @Override // o.XF
    public final boolean equals(Object obj) {
        if (obj instanceof ZF) {
            if (!isEmpty() || !((ZF) obj).isEmpty()) {
                ZF zf = (ZF) obj;
                if (this.l == zf.l) {
                    if (this.m == zf.m) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // o.XF
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.l * 31) + this.m;
    }

    @Override // o.XF
    public final boolean isEmpty() {
        return this.l > this.m;
    }

    @Override // o.XF
    public final String toString() {
        return this.l + ".." + this.m;
    }
}
