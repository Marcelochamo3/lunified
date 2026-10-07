package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: o.nu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2315nu0 implements InterfaceC2604qt0 {
    public final ConstraintLayout l;
    public final ImageView m;
    public final ImageView n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final RecyclerView f945o;
    public final TextView p;

    public C2315nu0(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, RecyclerView recyclerView, TextView textView) {
        this.l = constraintLayout;
        this.m = imageView;
        this.n = imageView2;
        this.f945o = recyclerView;
        this.p = textView;
    }

    @Override // o.InterfaceC2604qt0
    public final View b() {
        return this.l;
    }
}
