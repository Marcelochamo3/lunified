package o;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public abstract class O50 {
    public final P50 a = new P50();
    public boolean b = false;
    public int c = 1;

    public abstract int a();

    public long b(int i) {
        return -1L;
    }

    public int c(int i) {
        return 0;
    }

    public final void d(int i) {
        this.a.d(i, 1, null);
    }

    public abstract void e(AbstractC2144m60 abstractC2144m60, int i);

    public abstract AbstractC2144m60 f(int i, RecyclerView recyclerView);

    public final void i(boolean z) {
        if (this.a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.b = z;
    }

    public final void j() {
        this.c = 2;
        this.a.g();
    }

    public void g(AbstractC2144m60 abstractC2144m60) {
    }

    public void h(AbstractC2144m60 abstractC2144m60) {
    }
}
