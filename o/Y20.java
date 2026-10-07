package o;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class Y20 extends C2338o60 {
    public final RecyclerView f;
    public final C2241n60 g;
    public final C2633r9 h;

    public Y20(RecyclerView recyclerView) {
        super(recyclerView);
        this.g = this.e;
        this.h = new C2633r9(5, this);
        this.f = recyclerView;
    }

    @Override // o.C2338o60
    public final C3003v0 j() {
        return this.h;
    }
}
