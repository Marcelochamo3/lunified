package o;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class LW implements InterfaceC2604qt0 {
    public final /* synthetic */ int l;
    public final FrameLayout m;
    public final TextView n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Button f379o;
    public final ProgressBar p;
    public final ImageView q;
    public final TextView r;
    public final TextView s;

    public /* synthetic */ LW(FrameLayout frameLayout, TextView textView, Button button, ProgressBar progressBar, ImageView imageView, TextView textView2, TextView textView3, int i) {
        this.l = i;
        this.m = frameLayout;
        this.n = textView;
        this.f379o = button;
        this.p = progressBar;
        this.q = imageView;
        this.r = textView2;
        this.s = textView3;
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
