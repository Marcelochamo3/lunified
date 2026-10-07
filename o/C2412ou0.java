package o;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: o.ou0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2412ou0 implements InterfaceC2604qt0 {
    public final ConstraintLayout l;
    public final RecyclerView m;
    public final TextView n;

    public C2412ou0(ConstraintLayout constraintLayout, RecyclerView recyclerView, TextView textView) {
        this.l = constraintLayout;
        this.m = recyclerView;
        this.n = textView;
    }

    @Override // o.InterfaceC2604qt0
    public final View b() {
        return this.l;
    }
}
