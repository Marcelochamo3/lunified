package o;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class G10 extends O10 {
    public final Exception a;
    public final Ds0 b;
    public final Set c;

    public G10(Exception exc, Ds0 ds0, Set set) {
        AbstractC1474fG.j(ds0, "server");
        AbstractC1474fG.j(set, "attemptedServerIds");
        this.a = exc;
        this.b = ds0;
        this.c = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G10)) {
            return false;
        }
        G10 g10 = (G10) obj;
        return AbstractC1474fG.b(this.a, g10.a) && AbstractC1474fG.b(this.b, g10.b) && AbstractC1474fG.b(this.c, g10.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "FailedLoadingVideo(error=" + this.a + ", server=" + this.b + ", attemptedServerIds=" + this.c + ")";
    }

    public G10(Exception exc, Ds0 ds0) {
        this(exc, ds0, AbstractC1370eA.O(ds0.l));
    }
}
