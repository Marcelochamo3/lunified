package o;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: renamed from: o.Vr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0846Vr implements QK, X0 {
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;

    public /* synthetic */ C0846Vr(int i, Object obj) {
        this.m = obj;
        this.l = i;
    }

    @Override // o.QK
    public void b(Object obj) {
        ((InterfaceC2176mZ) obj).J((C1971kP) this.m, this.l);
    }

    @Override // o.X0
    public boolean d(View view) {
        ((SideSheetBehavior) this.m).v(this.l);
        return true;
    }
}
