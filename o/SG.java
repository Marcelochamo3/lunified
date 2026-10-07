package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public final class SG implements InterfaceC2604qt0 {
    public final ConstraintLayout l;
    public final ImageView m;
    public final TextView n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f508o;
    public final TextView p;

    public SG(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3) {
        this.l = constraintLayout;
        this.m = imageView;
        this.n = textView;
        this.f508o = textView2;
        this.p = textView3;
    }

    @Override // o.InterfaceC2604qt0
    public final View b() {
        return this.l;
    }
}
