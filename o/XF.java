package o;

/* JADX INFO: loaded from: classes.dex */
public class XF implements Iterable, InterfaceC1770iI {
    public final int l;
    public final int m;
    public final int n;

    public XF(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.l = i;
        this.m = Sr0.n(i, i2, i3);
        this.n = i3;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final YF iterator() {
        return new YF(this.l, this.m, this.n);
    }

    public boolean equals(Object obj) {
        if (obj instanceof XF) {
            if (!isEmpty() || !((XF) obj).isEmpty()) {
                XF xf = (XF) obj;
                if (this.l != xf.l || this.m != xf.m || this.n != xf.n) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.l * 31) + this.m) * 31) + this.n;
    }

    public boolean isEmpty() {
        int i = this.n;
        int i2 = this.m;
        int i3 = this.l;
        if (i > 0) {
            if (i3 <= i2) {
                return false;
            }
        } else if (i3 >= i2) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb;
        int i = this.m;
        int i2 = this.l;
        int i3 = this.n;
        if (i3 > 0) {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i3);
        } else {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i3);
        }
        return sb.toString();
    }
}
