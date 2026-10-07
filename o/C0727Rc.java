package o;

/* JADX INFO: renamed from: o.Rc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0727Rc extends C0753Sc {
    public final Throwable a;

    public C0727Rc(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0727Rc) {
            if (AbstractC1474fG.b(this.a, ((C0727Rc) obj).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // o.C0753Sc
    public final String toString() {
        return "Closed(" + this.a + ')';
    }
}
