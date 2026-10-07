package o;

/* JADX INFO: loaded from: classes.dex */
public final class SK {
    public final Object a;
    public C2149m9 b = new C2149m9(2);
    public boolean c;
    public boolean d;

    public SK(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SK.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((SK) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
