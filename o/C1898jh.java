package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: o.jh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1898jh implements InterfaceC2604qt0 {
    public final ConstraintLayout l;
    public final RecyclerView m;

    public C1898jh(ConstraintLayout constraintLayout, RecyclerView recyclerView) {
        this.l = constraintLayout;
        this.m = recyclerView;
    }

    @Override // o.InterfaceC2604qt0
    public final View b() {
        return this.l;
    }
}
