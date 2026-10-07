package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public final class QG implements InterfaceC2604qt0 {
    public final ConstraintLayout l;
    public final ImageView m;
    public final LinearLayout n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f471o;
    public final TextView p;

    public QG(ConstraintLayout constraintLayout, ImageView imageView, LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.l = constraintLayout;
        this.m = imageView;
        this.n = linearLayout;
        this.f471o = textView;
        this.p = textView2;
    }

    @Override // o.InterfaceC2604qt0
    public final View b() {
        return this.l;
    }
}
