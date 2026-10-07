package o;

/* JADX INFO: renamed from: o.m20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2136m20 extends C2039l20 {
    public final Object n;

    public C2136m20(int i) {
        super(i);
        this.n = new Object();
    }

    @Override // o.C2039l20, o.InterfaceC1941k20
    public final boolean e(Object obj) {
        boolean zE;
        AbstractC1474fG.j(obj, "instance");
        synchronized (this.n) {
            zE = super.e(obj);
        }
        return zE;
    }

    @Override // o.C2039l20, o.InterfaceC1941k20
    public final Object n() {
        Object objN;
        synchronized (this.n) {
            objN = super.n();
        }
        return objN;
    }
}
