package o;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: o.hx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1736hx implements InterfaceC2604qt0 {
    public final /* synthetic */ int l;
    public final ConstraintLayout m;
    public final ProgressBar n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final RecyclerView f821o;
    public final TextView p;

    public /* synthetic */ C1736hx(ConstraintLayout constraintLayout, ProgressBar progressBar, RecyclerView recyclerView, TextView textView, int i) {
        this.l = i;
        this.m = constraintLayout;
        this.n = progressBar;
        this.f821o = recyclerView;
        this.p = textView;
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
