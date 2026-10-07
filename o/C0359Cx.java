package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.leanback.widget.VerticalGridView;

/* JADX INFO: renamed from: o.Cx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0359Cx implements InterfaceC2604qt0 {
    public final /* synthetic */ int l;
    public final ConstraintLayout m;
    public final C2303no0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final VerticalGridView f208o;

    public /* synthetic */ C0359Cx(ConstraintLayout constraintLayout, C2303no0 c2303no0, VerticalGridView verticalGridView, int i) {
        this.l = i;
        this.m = constraintLayout;
        this.n = c2303no0;
        this.f208o = verticalGridView;
    }

    @Override // o.InterfaceC2604qt0
    public final View b() {
        switch (this.l) {
            case 0:
                break;
        }
        return this.m;
    }
}
