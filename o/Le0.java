package o;

/* JADX INFO: loaded from: classes.dex */
public final class Le0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public Le0(String str, String str2, String str3, String str4) {
        AbstractC1474fG.j(str, "playerUrl");
        AbstractC1474fG.j(str2, "outerReferer");
        AbstractC1474fG.j(str3, "label");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Le0)) {
            return false;
        }
        Le0 le0 = (Le0) obj;
        return AbstractC1474fG.b(this.a, le0.a) && AbstractC1474fG.b(this.b, le0.b) && AbstractC1474fG.b(this.c, le0.c) && AbstractC1474fG.b(this.d, le0.d);
    }

    public final int hashCode() {
        int i = AbstractC1674hK.i(AbstractC1674hK.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
        String str = this.d;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServerKey(playerUrl=");
        sb.append(this.a);
        sb.append(", outerReferer=");
        sb.append(this.b);
        sb.append(", label=");
        sb.append(this.c);
        sb.append(", language=");
        return AbstractC1701hf0.h(sb, this.d, ")");
    }
}
