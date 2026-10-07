package o;

import android.view.View;

/* JADX INFO: renamed from: o.Yw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0929Yw extends zy0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC1247cx f645o;

    public C0929Yw(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx) {
        this.f645o = abstractComponentCallbacksC1247cx;
    }

    @Override // o.zy0
    public final View v(int i) {
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = this.f645o;
        View view = abstractComponentCallbacksC1247cx.S;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException(AbstractC1701hf0.f("Fragment ", abstractComponentCallbacksC1247cx, " does not have a view"));
    }

    @Override // o.zy0
    public final boolean w() {
        return this.f645o.S != null;
    }
}
