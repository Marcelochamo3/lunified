package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class M30 extends AbstractC0751Sa implements InterfaceC1378eI {
    public final boolean r;

    public M30(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.r = false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof M30) {
            M30 m30 = (M30) obj;
            return d().equals(m30.d()) && this.f514o.equals(m30.f514o) && this.p.equals(m30.p) && AbstractC1474fG.b(this.m, m30.m);
        }
        if (obj instanceof M30) {
            return obj.equals(g());
        }
        return false;
    }

    public final InterfaceC1378eI g() {
        if (this.r) {
            return this;
        }
        InterfaceC1378eI interfaceC1378eI = this.l;
        if (interfaceC1378eI != null) {
            return interfaceC1378eI;
        }
        InterfaceC1378eI interfaceC1378eIA = a();
        this.l = interfaceC1378eIA;
        return interfaceC1378eIA;
    }

    public final int hashCode() {
        return this.p.hashCode() + AbstractC1674hK.i(d().hashCode() * 31, this.f514o, 31);
    }

    public final String toString() {
        InterfaceC1378eI interfaceC1378eIG = g();
        return interfaceC1378eIG != this ? interfaceC1378eIG.toString() : AbstractC1701hf0.h(new StringBuilder("property "), this.f514o, " (Kotlin reflection is not available)");
    }
}
