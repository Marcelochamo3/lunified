package o;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class Ft0 implements OnReceiveContentListener {
    public final InterfaceC2464pW a;

    public Ft0(InterfaceC2464pW interfaceC2464pW) {
        this.a = interfaceC2464pW;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        C1704hh c1704hh = new C1704hh(new C2133m1(contentInfo));
        C1704hh c1704hhA = ((Zi0) this.a).a(view, c1704hh);
        if (c1704hhA == null) {
            return null;
        }
        if (c1704hhA == c1704hh) {
            return contentInfo;
        }
        ContentInfo contentInfoY = c1704hhA.a.y();
        Objects.requireNonNull(contentInfoY);
        return AbstractC1954k9.l(contentInfoY);
    }
}
