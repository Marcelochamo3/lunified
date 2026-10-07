package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.ui.DefaultTimeBar;

/* JADX INFO: renamed from: o.ch, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1215ch implements InterfaceC2604qt0 {
    public final /* synthetic */ int l = 2;
    public final ViewGroup m;
    public final View n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ImageView f722o;
    public final View p;
    public final View q;
    public final TextView r;
    public final TextView s;
    public final View t;
    public final View u;
    public final View v;

    public C1215ch(LinearLayout linearLayout, TextView textView, TextView textView2, View view, ImageView imageView, FrameLayout frameLayout, RecyclerView recyclerView, LinearLayout linearLayout2, TextView textView3, TextView textView4) {
        this.m = linearLayout;
        this.r = textView;
        this.s = textView2;
        this.q = view;
        this.f722o = imageView;
        this.t = frameLayout;
        this.u = recyclerView;
        this.v = linearLayout2;
        this.n = textView3;
        this.p = textView4;
    }

    @Override // o.InterfaceC2604qt0
    public final View b() {
        switch (this.l) {
            case 0:
                return (ConstraintLayout) this.m;
            case 1:
                return (ConstraintLayout) this.m;
            default:
                return (LinearLayout) this.m;
        }
    }

    public C1215ch(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageButton imageButton, ImageView imageView3, DefaultTimeBar defaultTimeBar, ImageView imageView4, ImageView imageView5, TextView textView, TextView textView2) {
        this.m = constraintLayout;
        this.f722o = imageView;
        this.q = imageView2;
        this.n = imageButton;
        this.t = imageView3;
        this.p = defaultTimeBar;
        this.u = imageView4;
        this.v = imageView5;
        this.r = textView;
        this.s = textView2;
    }

    public C1215ch(ConstraintLayout constraintLayout, ImageButton imageButton, ImageView imageView, ImageButton imageButton2, ImageButton imageButton3, ImageButton imageButton4, DefaultTimeBar defaultTimeBar, ImageView imageView2, TextView textView, TextView textView2) {
        this.m = constraintLayout;
        this.n = imageButton;
        this.f722o = imageView;
        this.t = imageButton2;
        this.u = imageButton3;
        this.v = imageButton4;
        this.p = defaultTimeBar;
        this.q = imageView2;
        this.r = textView;
        this.s = textView2;
    }
}
