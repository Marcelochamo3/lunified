package o;

/* JADX INFO: loaded from: classes.dex */
public final class Y60 {
    public static final Y60 b = new Y60(false);
    public final boolean a;

    public Y60(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Y60.class == obj.getClass() && this.a == ((Y60) obj).a;
    }

    public final int hashCode() {
        return !this.a ? 1 : 0;
    }
}
