package o;

/* JADX INFO: renamed from: o.hr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1725hr0 extends AbstractC1822ir0 {
    public final String a;

    public C1725hr0(String str) {
        AbstractC1474fG.j(str, "reason");
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1725hr0) && AbstractC1474fG.b(this.a, ((C1725hr0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return AbstractC1701hf0.h(new StringBuilder("Error(reason="), this.a, ")");
    }
}
