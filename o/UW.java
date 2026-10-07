package o;

/* JADX INFO: loaded from: classes.dex */
public final class UW implements InterfaceC2669re {
    public final Class a;

    public UW(Class cls) {
        AbstractC1474fG.j(cls, "jClass");
        this.a = cls;
    }

    @Override // o.InterfaceC2669re
    public final Class a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof UW) {
            if (AbstractC1474fG.b(this.a, ((UW) obj).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}
