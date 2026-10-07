package o;

/* JADX INFO: loaded from: classes.dex */
public final class Ke0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public Ke0(String str, String str2, String str3, String str4, String str5) {
        AbstractC1474fG.j(str, "playerUrl");
        AbstractC1474fG.j(str4, "routingToken");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ke0)) {
            return false;
        }
        Ke0 ke0 = (Ke0) obj;
        return AbstractC1474fG.b(this.a, ke0.a) && AbstractC1474fG.b(this.b, ke0.b) && AbstractC1474fG.b(this.c, ke0.c) && AbstractC1474fG.b(this.d, ke0.d) && AbstractC1474fG.b(this.e, ke0.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + AbstractC1674hK.i(AbstractC1674hK.i(AbstractC1674hK.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PageState(playerUrl=");
        sb.append(this.a);
        sb.append(", origin=");
        sb.append(this.b);
        sb.append(", token=");
        sb.append(this.c);
        sb.append(", routingToken=");
        sb.append(this.d);
        sb.append(", clickToken=");
        return AbstractC1701hf0.h(sb, this.e, ")");
    }
}
