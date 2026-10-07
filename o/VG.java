package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public final class VG implements InterfaceC2604qt0 {
    public final ConstraintLayout l;
    public final CardView m;
    public final ImageView n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f569o;
    public final TextView p;
    public final TextView q;

    public VG(ConstraintLayout constraintLayout, CardView cardView, ImageView imageView, TextView textView, TextView textView2, TextView textView3) {
        this.l = constraintLayout;
        this.m = cardView;
        this.n = imageView;
        this.f569o = textView;
        this.p = textView2;
        this.q = textView3;
    }

    @Override // o.InterfaceC2604qt0
    public final View b() {
        return this.l;
    }
}
