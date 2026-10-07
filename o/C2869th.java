package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.leanback.widget.HorizontalGridView;

/* JADX INFO: renamed from: o.th, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2869th implements InterfaceC2604qt0 {
    public final ConstraintLayout l;
    public final HorizontalGridView m;

    public C2869th(ConstraintLayout constraintLayout, HorizontalGridView horizontalGridView) {
        this.l = constraintLayout;
        this.m = horizontalGridView;
    }

    @Override // o.InterfaceC2604qt0
    public final View b() {
        return this.l;
    }
}
