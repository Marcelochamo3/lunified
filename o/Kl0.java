package o;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class Kl0 extends ViewGroup.MarginLayoutParams {
    public int a;
    public int b;

    public Kl0(Kl0 kl0) {
        super((ViewGroup.MarginLayoutParams) kl0);
        this.a = 0;
        this.a = kl0.a;
    }

    public Kl0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
    }
}
