package o;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class OF implements PF {
    public final InputContentInfo l;

    public OF(Object obj) {
        this.l = (InputContentInfo) obj;
    }

    @Override // o.PF
    public final Object f() {
        return this.l;
    }

    @Override // o.PF
    public final ClipDescription getDescription() {
        return this.l.getDescription();
    }

    @Override // o.PF
    public final Uri i() {
        return this.l.getContentUri();
    }

    @Override // o.PF
    public final void k() {
        this.l.requestPermission();
    }

    @Override // o.PF
    public final Uri l() {
        return this.l.getLinkUri();
    }

    public OF(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.l = new InputContentInfo(uri, clipDescription, uri2);
    }
}
