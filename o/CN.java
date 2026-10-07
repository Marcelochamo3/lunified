package o;

/* JADX INFO: loaded from: classes.dex */
public final class CN extends AbstractC0825Uw {
    public static final Object p = new Object();
    public final Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f197o;

    public CN(Fj0 fj0, Object obj, Object obj2) {
        super(fj0);
        this.n = obj;
        this.f197o = obj2;
    }

    @Override // o.AbstractC0825Uw, o.Fj0
    public final int b(Object obj) {
        Object obj2;
        if (p.equals(obj) && (obj2 = this.f197o) != null) {
            obj = obj2;
        }
        return this.m.b(obj);
    }

    @Override // o.AbstractC0825Uw, o.Fj0
    public final Dj0 g(int i, Dj0 dj0, boolean z) {
        this.m.g(i, dj0, z);
        if (Lr0.a(dj0.m, this.f197o) && z) {
            dj0.m = p;
        }
        return dj0;
    }

    @Override // o.AbstractC0825Uw, o.Fj0
    public final Object m(int i) {
        Object objM = this.m.m(i);
        return Lr0.a(objM, this.f197o) ? p : objM;
    }

    @Override // o.AbstractC0825Uw, o.Fj0
    public final Ej0 n(int i, Ej0 ej0, long j) {
        this.m.n(i, ej0, j);
        if (Lr0.a(ej0.l, this.n)) {
            ej0.l = Ej0.C;
        }
        return ej0;
    }
}
