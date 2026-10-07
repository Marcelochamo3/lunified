package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.leanback.widget.HorizontalGridView;

/* JADX INFO: renamed from: o.vh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3063vh implements InterfaceC2604qt0 {
    public final ConstraintLayout l;
    public final HorizontalGridView m;

    public C3063vh(ConstraintLayout constraintLayout, HorizontalGridView horizontalGridView) {
        this.l = constraintLayout;
        this.m = horizontalGridView;
    }

    @Override // o.InterfaceC2604qt0
    public final View b() {
        return this.l;
    }
}
