package o;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.leanback.widget.VerticalGridView;

/* JADX INFO: renamed from: o.ix, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1832ix implements InterfaceC2604qt0 {
    public final /* synthetic */ int l;
    public final ConstraintLayout m;
    public final ProgressBar n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f837o;
    public final VerticalGridView p;

    public /* synthetic */ C1832ix(ConstraintLayout constraintLayout, ProgressBar progressBar, TextView textView, VerticalGridView verticalGridView, int i) {
        this.l = i;
        this.m = constraintLayout;
        this.n = progressBar;
        this.f837o = textView;
        this.p = verticalGridView;
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
