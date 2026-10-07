package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public final class RG implements InterfaceC2604qt0 {
    public final ConstraintLayout l;
    public final ImageView m;
    public final LinearLayout n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f485o;
    public final TextView p;

    public RG(ConstraintLayout constraintLayout, ImageView imageView, LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.l = constraintLayout;
        this.m = imageView;
        this.n = linearLayout;
        this.f485o = textView;
        this.p = textView2;
    }

    @Override // o.InterfaceC2604qt0
    public final View b() {
        return this.l;
    }
}
