package o;

import android.view.View;

/* JADX INFO: renamed from: o.s9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2730s9 extends AbstractC2343o9 {
    public final /* synthetic */ DialogC2924u9 a;

    public C2730s9(DialogC2924u9 dialogC2924u9) {
        this.a = dialogC2924u9;
    }

    @Override // o.AbstractC2343o9
    public final void c(View view, int i) {
        if (i == 5) {
            this.a.cancel();
        }
    }

    @Override // o.AbstractC2343o9
    public final void b(View view) {
    }
}
