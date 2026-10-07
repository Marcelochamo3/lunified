package o;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class Fe0 extends AbstractC0973a60 {
    public boolean a = false;
    public final /* synthetic */ XW b;

    public Fe0(XW xw) {
        this.b = xw;
    }

    @Override // o.AbstractC0973a60
    public final void a(int i, RecyclerView recyclerView) {
        if (i == 0 && this.a) {
            this.a = false;
            this.b.h();
        }
    }

    @Override // o.AbstractC0973a60
    public final void b(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.a = true;
    }
}
