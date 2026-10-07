package o;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: renamed from: o.Bm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0322Bm extends zy0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ zy0 f188o;
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0348Cm p;

    public C0322Bm(DialogInterfaceOnCancelListenerC0348Cm dialogInterfaceOnCancelListenerC0348Cm, C0929Yw c0929Yw) {
        this.p = dialogInterfaceOnCancelListenerC0348Cm;
        this.f188o = c0929Yw;
    }

    @Override // o.zy0
    public final View v(int i) {
        zy0 zy0Var = this.f188o;
        if (zy0Var.w()) {
            return zy0Var.v(i);
        }
        Dialog dialog = this.p.w0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // o.zy0
    public final boolean w() {
        return this.f188o.w() || this.p.A0;
    }
}
