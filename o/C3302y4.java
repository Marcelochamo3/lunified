package o;

import android.view.View;

/* JADX INFO: renamed from: o.y4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3302y4 extends AbstractViewOnTouchListenerC0747Rw {
    public final /* synthetic */ F4 u;
    public final /* synthetic */ I4 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3302y4(I4 i4, View view, F4 f4) {
        super(view);
        this.v = i4;
        this.u = f4;
    }

    @Override // o.AbstractViewOnTouchListenerC0747Rw
    public final Id0 b() {
        return this.u;
    }

    @Override // o.AbstractViewOnTouchListenerC0747Rw
    public final boolean c() {
        I4 i4 = this.v;
        if (i4.getInternalPopup().b()) {
            return true;
        }
        i4.q.n(i4.getTextDirection(), i4.getTextAlignment());
        return true;
    }
}
