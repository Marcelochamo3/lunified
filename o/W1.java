package o;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class W1 implements InterfaceC1056az, Serializable {
    public final Object l;
    public final Class m;
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f585o = false;
    public final int p = 2;

    public W1(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx, Class cls, String str) {
        this.l = abstractComponentCallbacksC1247cx;
        this.m = cls;
        this.n = str;
    }

    @Override // o.InterfaceC1056az
    public final int e() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W1)) {
            return false;
        }
        W1 w1 = (W1) obj;
        return this.f585o == w1.f585o && this.p == w1.p && AbstractC1474fG.b(this.l, w1.l) && AbstractC1474fG.b(this.m, w1.m) && this.n.equals(w1.n);
    }

    public final int hashCode() {
        Object obj = this.l;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.m;
        return ((((AbstractC1674hK.i((((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31) - 934592106) * 31, this.n, 31) + (this.f585o ? 1231 : 1237)) * 31) + 2) * 31) + this.p;
    }

    public final String toString() {
        AbstractC2822t60.a.getClass();
        return C3210x60.a(this);
    }
}
