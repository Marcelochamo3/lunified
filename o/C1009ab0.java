package o;

import java.util.List;

/* JADX INFO: renamed from: o.ab0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1009ab0 extends AbstractC1107bb0 {
    public final List a;

    public C1009ab0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1009ab0) && AbstractC1474fG.b(this.a, ((C1009ab0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SuccessLoadingEpisodes(episodes=" + this.a + ")";
    }
}
