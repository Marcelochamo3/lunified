package o;

/* JADX INFO: loaded from: classes.dex */
public final class Pc0 {
    public final String a;
    public final String b;
    public final Integer c;

    public Pc0(String str, String str2, Integer num) {
        AbstractC1474fG.j(str, "title");
        this.a = str;
        this.b = str2;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pc0)) {
            return false;
        }
        Pc0 pc0 = (Pc0) obj;
        return AbstractC1474fG.b(this.a, pc0.a) && AbstractC1474fG.b(this.b, pc0.b) && AbstractC1474fG.b(this.c, pc0.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "SettingsDialogOption(title=" + this.a + ", summary=" + this.b + ", accentColor=" + this.c + ")";
    }
}
