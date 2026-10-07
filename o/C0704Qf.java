package o;

/* JADX INFO: renamed from: o.Qf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0704Qf {
    public final Object a;
    public final InterfaceC0412Ey b;

    public C0704Qf(Object obj, InterfaceC0412Ey interfaceC0412Ey) {
        this.a = obj;
        this.b = interfaceC0412Ey;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0704Qf)) {
            return false;
        }
        C0704Qf c0704Qf = (C0704Qf) obj;
        return AbstractC1474fG.b(this.a, c0704Qf.a) && AbstractC1474fG.b(this.b, c0704Qf.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.a + ", onCancellation=" + this.b + ')';
    }
}
