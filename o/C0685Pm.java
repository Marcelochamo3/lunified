package o;

/* JADX INFO: renamed from: o.Pm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0685Pm extends C2395om {
    public int m;

    public C0685Pm(AbstractC1637gw0 abstractC1637gw0) {
        super(abstractC1637gw0);
        if (abstractC1637gw0 instanceof TC) {
            this.e = 2;
        } else {
            this.e = 3;
        }
    }

    @Override // o.C2395om
    public final void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        for (InterfaceC2201mm interfaceC2201mm : this.k) {
            interfaceC2201mm.a(interfaceC2201mm);
        }
    }
}
