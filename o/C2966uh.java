package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: o.uh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2966uh implements InterfaceC2604qt0 {
    public final ConstraintLayout l;
    public final RecyclerView m;

    public C2966uh(ConstraintLayout constraintLayout, RecyclerView recyclerView) {
        this.l = constraintLayout;
        this.m = recyclerView;
    }

    @Override // o.InterfaceC2604qt0
    public final View b() {
        return this.l;
    }
}
