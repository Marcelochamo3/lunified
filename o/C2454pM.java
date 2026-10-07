package o;

/* JADX INFO: renamed from: o.pM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2454pM implements InterfaceC1747i20 {
    public final C2551qM a;
    public int b;
    public Class c;

    public C2454pM(C2551qM c2551qM) {
        this.a = c2551qM;
    }

    @Override // o.InterfaceC1747i20
    public final void a() {
        this.a.h(this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2454pM)) {
            return false;
        }
        C2454pM c2454pM = (C2454pM) obj;
        return this.b == c2454pM.b && this.c == c2454pM.c;
    }

    public final int hashCode() {
        int i = this.b * 31;
        Class cls = this.c;
        return i + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "Key{size=" + this.b + "array=" + this.c + '}';
    }
}
