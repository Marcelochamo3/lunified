package o;

/* JADX INFO: renamed from: o.Yp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0922Yp implements InterfaceC3028vF {
    public final boolean l;

    public C0922Yp(boolean z) {
        this.l = z;
    }

    @Override // o.InterfaceC3028vF
    public final boolean a() {
        return this.l;
    }

    @Override // o.InterfaceC3028vF
    public final C1294dV h() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.l ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
