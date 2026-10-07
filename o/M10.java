package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class M10 extends O10 {
    public final List a;

    public M10(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof M10) && AbstractC1474fG.b(this.a, ((M10) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SuccessLoadingSubtitles(subtitles=" + this.a + ")";
    }
}
