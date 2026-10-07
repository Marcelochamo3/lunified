package o;

/* JADX INFO: renamed from: o.s00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2713s00 extends AbstractC2810t00 {
    public final int c;
    public final int d;
    public final InterfaceC0664Or e;

    public C2713s00(String str, int i, int i2, InterfaceC0664Or interfaceC0664Or) {
        AbstractC1474fG.j(interfaceC0664Or, "player");
        this.c = i;
        this.d = i2;
        this.e = interfaceC0664Or;
    }

    @Override // o.AbstractC2810t00
    public final boolean a() {
        return ((C1042as) this.e).L().f816o == this.d;
    }
}
