package o;

import android.os.Bundle;

/* JADX INFO: renamed from: o.Xw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0903Xw extends AbstractC1150bx {
    public final /* synthetic */ AbstractComponentCallbacksC1247cx a;

    public C0903Xw(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx) {
        this.a = abstractComponentCallbacksC1247cx;
    }

    @Override // o.AbstractC1150bx
    public final void a() {
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = this.a;
        abstractComponentCallbacksC1247cx.f0.g();
        AbstractC1474fG.n(abstractComponentCallbacksC1247cx);
        Bundle bundle = abstractComponentCallbacksC1247cx.m;
        abstractComponentCallbacksC1247cx.f0.h(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
