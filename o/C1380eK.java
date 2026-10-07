package o;

/* JADX INFO: renamed from: o.eK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1380eK {
    public TJ a;
    public ZJ b;

    public final void a(InterfaceC1283dK interfaceC1283dK, SJ sj) {
        TJ tjA = sj.a();
        TJ tj = this.a;
        AbstractC1474fG.j(tj, "state1");
        if (tjA.compareTo(tj) < 0) {
            tj = tjA;
        }
        this.a = tj;
        this.b.a(interfaceC1283dK, sj);
        this.a = tjA;
    }
}
