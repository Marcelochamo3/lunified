package o;

import androidx.leanback.widget.SearchBar;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: o.Ya, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0907Ya implements Runnable {
    public final /* synthetic */ int l;
    public final int m;
    public final Object n;

    public /* synthetic */ RunnableC0907Ya(int i, int i2, Object obj) {
        this.l = i2;
        this.n = obj;
        this.m = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.l) {
            case 0:
                AP ap = (AP) ((L80) this.n).l;
                if (ap != null) {
                    ap.q(this.m);
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) this.n;
                int size = arrayList.size();
                int i = 0;
                if (this.m == 1) {
                    while (i < size) {
                        ((AbstractC0403Ep) arrayList.get(i)).b();
                        i++;
                    }
                } else {
                    while (i < size) {
                        ((AbstractC0403Ep) arrayList.get(i)).a();
                        i++;
                    }
                }
                break;
            case 2:
                ((C1287dO) this.n).s0.l0(this.m);
                break;
            case 3:
                ((AbstractC2268nU) this.n).j(this.m);
                break;
            case 4:
                SearchBar searchBar = (SearchBar) this.n;
                searchBar.E.play(searchBar.F.get(this.m), 1.0f, 1.0f, 1, 0, 1.0f);
                break;
            default:
                ((RecyclerView) this.n).l0(this.m);
                break;
        }
    }

    public RunnableC0907Ya(int i, RecyclerView recyclerView) {
        this.l = 5;
        this.m = i;
        this.n = recyclerView;
    }

    public RunnableC0907Ya(List list, int i, Throwable th) {
        this.l = 1;
        Jp0.h(list, "initCallbacks cannot be null");
        this.n = new ArrayList(list);
        this.m = i;
    }
}
