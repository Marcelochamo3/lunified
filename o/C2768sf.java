package o;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: o.sf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2768sf extends AbstractC2962uf {
    public C2768sf(List list) {
        this.a.addAll(list);
        d();
    }

    @Override // o.AbstractC1332dr
    public final boolean b(C3176wp c3176wp, C3176wp c3176wp2) {
        for (int i = 0; i < this.c; i++) {
            if (!((AbstractC1332dr) this.b.get(i)).b(c3176wp, c3176wp2)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return AbstractC1021ah0.g("", this.a);
    }

    public C2768sf(AbstractC1332dr... abstractC1332drArr) {
        this(Arrays.asList(abstractC1332drArr));
    }
}
