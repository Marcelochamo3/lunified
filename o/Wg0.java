package o;

/* JADX INFO: loaded from: classes.dex */
public final class Wg0 {
    public final int a;
    public final String b;
    public final String c;

    public Wg0(String str, int i, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Wg0)) {
            return false;
        }
        Wg0 wg0 = (Wg0) obj;
        return this.a == wg0.a && AbstractC1474fG.b(this.b, wg0.b) && AbstractC1474fG.b(this.c, wg0.c);
    }

    public final int hashCode() {
        int i = AbstractC1674hK.i(this.a * 31, this.b, 31);
        String str = this.c;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StringHttpResponse(code=");
        sb.append(this.a);
        sb.append(", body=");
        sb.append(this.b);
        sb.append(", encryptionMode=");
        return AbstractC1701hf0.h(sb, this.c, ")");
    }
}
