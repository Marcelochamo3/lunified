package o;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: o.xm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3267xm implements InterfaceC2604qt0 {
    public final /* synthetic */ int l;
    public final ConstraintLayout m;
    public final Button n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final LinearLayout f1123o;

    public /* synthetic */ C3267xm(ConstraintLayout constraintLayout, Button button, LinearLayout linearLayout, int i) {
        this.l = i;
        this.m = constraintLayout;
        this.n = button;
        this.f1123o = linearLayout;
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
