package o;

/* JADX INFO: renamed from: o.y5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C3304y5 {

    @InterfaceC1695hc0("iv")
    private final String a;

    @InterfaceC1695hc0("tag")
    private final String b;

    @InterfaceC1695hc0("data")
    private final String c;

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3304y5)) {
            return false;
        }
        C3304y5 c3304y5 = (C3304y5) obj;
        return AbstractC1474fG.b(this.a, c3304y5.a) && AbstractC1474fG.b(this.b, c3304y5.b) && AbstractC1474fG.b(this.c, c3304y5.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + AbstractC1674hK.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        StringBuilder sb = new StringBuilder("EncryptedField(iv=");
        sb.append(str);
        sb.append(", tag=");
        sb.append(str2);
        sb.append(", data=");
        return AbstractC1701hf0.h(sb, str3, ")");
    }
}
