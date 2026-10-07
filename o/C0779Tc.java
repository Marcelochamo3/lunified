package o;

/* JADX INFO: renamed from: o.Tc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0779Tc {
    public static final C0753Sc b = new C0753Sc();
    public final Object a;

    public /* synthetic */ C0779Tc(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0779Tc) {
            return AbstractC1474fG.b(this.a, ((C0779Tc) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof C0727Rc) {
            return ((C0727Rc) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
