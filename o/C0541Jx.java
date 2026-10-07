package o;

/* JADX INFO: renamed from: o.Jx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0541Jx implements DV, InterfaceC0957Zy {
    public final /* synthetic */ InterfaceC0412Ey l;

    public C0541Jx(io.sentry.android.replay.p pVar) {
        this.l = pVar;
    }

    @Override // o.InterfaceC0957Zy
    public final InterfaceC0801Ty a() {
        return this.l;
    }

    @Override // o.DV
    public final /* synthetic */ void b(Object obj) {
        this.l.b(obj);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DV) || !(obj instanceof InterfaceC0957Zy)) {
            return false;
        }
        return AbstractC1474fG.b(this.l, ((InterfaceC0957Zy) obj).a());
    }

    public final int hashCode() {
        return this.l.hashCode();
    }
}
