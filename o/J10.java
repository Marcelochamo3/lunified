package o;

/* JADX INFO: loaded from: classes.dex */
public final class J10 extends O10 {
    public final Ds0 a;

    public J10(Ds0 ds0) {
        AbstractC1474fG.j(ds0, "server");
        this.a = ds0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof J10) && AbstractC1474fG.b(this.a, ((J10) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LoadingVideo(server=" + this.a + ")";
    }
}
