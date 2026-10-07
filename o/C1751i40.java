package o;

/* JADX INFO: renamed from: o.i40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1751i40 extends AbstractC1945k40 {
    public final String a;

    public C1751i40(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1751i40) && AbstractC1474fG.b(this.a, ((C1751i40) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return AbstractC1701hf0.h(new StringBuilder("SessionExpired(message="), this.a, ")");
    }
}
