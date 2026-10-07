package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: o.ph, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2482ph implements InterfaceC2604qt0 {
    public final ConstraintLayout l;
    public final RecyclerView m;

    public C2482ph(ConstraintLayout constraintLayout, RecyclerView recyclerView) {
        this.l = constraintLayout;
        this.m = recyclerView;
    }

    @Override // o.InterfaceC2604qt0
    public final View b() {
        return this.l;
    }
}
