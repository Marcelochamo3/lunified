package o;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public final class Di0 extends AP {
    public final /* synthetic */ AbstractC1474fG d;
    public final /* synthetic */ Fi0 e;

    public Di0(Fi0 fi0, AbstractC1474fG abstractC1474fG) {
        this.e = fi0;
        this.d = abstractC1474fG;
    }

    @Override // o.AP
    public final void q(int i) {
        this.e.m = true;
        this.d.L(i);
    }

    @Override // o.AP
    public final void r(Typeface typeface) {
        Fi0 fi0 = this.e;
        fi0.n = Typeface.create(typeface, fi0.c);
        fi0.m = true;
        this.d.M(fi0.n, false);
    }
}
