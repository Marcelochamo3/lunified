package o;

/* JADX INFO: loaded from: classes.dex */
public final class TH extends QH {
    public final C3227xK l = new C3227xK(false);

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof TH) && ((TH) obj).l.equals(this.l));
    }

    public final int hashCode() {
        return this.l.hashCode();
    }

    public final QH i(String str) {
        return (QH) this.l.get(str);
    }
}
