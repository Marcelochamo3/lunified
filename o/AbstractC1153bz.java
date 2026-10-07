package o;

/* JADX INFO: renamed from: o.bz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1153bz extends AbstractC0751Sa implements InterfaceC1056az, InterfaceC1378eI, InterfaceC0801Ty {
    public final int r;
    public final int s;

    public AbstractC1153bz(int i, Class cls, String str, String str2, int i2) {
        this(i, C0725Ra.l, cls, str, str2, i2);
    }

    @Override // o.AbstractC0751Sa
    public final InterfaceC1378eI a() {
        AbstractC2822t60.a.getClass();
        return this;
    }

    @Override // o.InterfaceC1056az
    public final int e() {
        return this.r;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1153bz) {
            AbstractC1153bz abstractC1153bz = (AbstractC1153bz) obj;
            return this.f514o.equals(abstractC1153bz.f514o) && this.p.equals(abstractC1153bz.p) && this.s == abstractC1153bz.s && this.r == abstractC1153bz.r && AbstractC1474fG.b(this.m, abstractC1153bz.m) && AbstractC1474fG.b(d(), abstractC1153bz.d());
        }
        if (!(obj instanceof AbstractC1153bz)) {
            return false;
        }
        InterfaceC1378eI interfaceC1378eI = this.l;
        if (interfaceC1378eI == null) {
            a();
            this.l = this;
            interfaceC1378eI = this;
        }
        return obj.equals(interfaceC1378eI);
    }

    public final int hashCode() {
        return this.p.hashCode() + AbstractC1674hK.i(d() == null ? 0 : d().hashCode() * 31, this.f514o, 31);
    }

    public final String toString() {
        InterfaceC1378eI interfaceC1378eI = this.l;
        if (interfaceC1378eI == null) {
            a();
            this.l = this;
            interfaceC1378eI = this;
        }
        if (interfaceC1378eI != this) {
            return interfaceC1378eI.toString();
        }
        String str = this.f514o;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : AbstractC1701hf0.u("function ", str, " (Kotlin reflection is not available)");
    }

    public AbstractC1153bz(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.r = i;
        this.s = 0;
    }
}
