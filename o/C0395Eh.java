package o;

/* JADX INFO: renamed from: o.Eh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0395Eh implements Zb0 {
    public final Zb0 a;
    public final InterfaceC1476fI b;
    public final String c;

    public C0395Eh(C1011ac0 c1011ac0, InterfaceC1476fI interfaceC1476fI) {
        this.a = c1011ac0;
        this.b = interfaceC1476fI;
        this.c = c1011ac0.a + '<' + ((C2766se) interfaceC1476fI).b() + '>';
    }

    @Override // o.Zb0
    public final String a() {
        return this.c;
    }

    @Override // o.Zb0
    public final U9 b() {
        return this.a.b();
    }

    @Override // o.Zb0
    public final int c() {
        return this.a.c();
    }

    @Override // o.Zb0
    public final String d(int i) {
        return this.a.d(i);
    }

    public final boolean equals(Object obj) {
        C0395Eh c0395Eh = obj instanceof C0395Eh ? (C0395Eh) obj : null;
        return c0395Eh != null && AbstractC1474fG.b(this.a, c0395Eh.a) && AbstractC1474fG.b(c0395Eh.b, this.b);
    }

    @Override // o.Zb0
    public final Zb0 f(int i) {
        return this.a.f(i);
    }

    @Override // o.Zb0
    public final boolean g(int i) {
        return this.a.g(i);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.b + ", original: " + this.a + ')';
    }
}
