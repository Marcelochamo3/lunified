package o;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class K10 extends O10 {
    public final C3336yW a;
    public final Uri b;

    public K10(C3336yW c3336yW, Uri uri) {
        AbstractC1474fG.j(c3336yW, "subtitle");
        AbstractC1474fG.j(uri, "uri");
        this.a = c3336yW;
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K10)) {
            return false;
        }
        K10 k10 = (K10) obj;
        return AbstractC1474fG.b(this.a, k10.a) && AbstractC1474fG.b(this.b, k10.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SuccessDownloadingOpenSubtitle(subtitle=" + this.a + ", uri=" + this.b + ")";
    }
}
