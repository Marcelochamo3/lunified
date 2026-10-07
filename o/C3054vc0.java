package o;

/* JADX INFO: renamed from: o.vc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3054vc0 extends AbstractC3151wc0 {
    public final String a;

    public C3054vc0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3054vc0) && AbstractC1474fG.b(this.a, ((C3054vc0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return AbstractC1701hf0.h(new StringBuilder("Inactive(message="), this.a, ")");
    }
}
