package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public final class LG implements InterfaceC2604qt0 {
    public final ConstraintLayout l;
    public final ImageView m;
    public final TextView n;

    public LG(ConstraintLayout constraintLayout, ImageView imageView, TextView textView) {
        this.l = constraintLayout;
        this.m = imageView;
        this.n = textView;
    }

    @Override // o.InterfaceC2604qt0
    public final View b() {
        return this.l;
    }
}
