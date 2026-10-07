package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class T50 {
    public N50 a;
    public ArrayList b;
    public long c;
    public long d;
    public long e;
    public long f;

    public static void b(AbstractC2144m60 abstractC2144m60) {
        int i = abstractC2144m60.j;
        if (!abstractC2144m60.j() && (i & 4) == 0) {
            abstractC2144m60.c();
        }
    }

    public abstract boolean a(AbstractC2144m60 abstractC2144m60, AbstractC2144m60 abstractC2144m61, C2650rP c2650rP, C2650rP c2650rP2);

    public final void c(AbstractC2144m60 abstractC2144m60) {
        N50 n50 = this.a;
        if (n50 != null) {
            boolean z = true;
            abstractC2144m60.r(true);
            if (abstractC2144m60.h != null && abstractC2144m60.i == null) {
                abstractC2144m60.h = null;
            }
            abstractC2144m60.i = null;
            if ((abstractC2144m60.j & 16) != 0) {
                return;
            }
            RecyclerView recyclerView = n50.a;
            recyclerView.m0();
            Na0 na0 = recyclerView.q;
            N50 n51 = (N50) na0.m;
            RecyclerView recyclerView2 = n51.a;
            View view = abstractC2144m60.a;
            int iIndexOfChild = recyclerView2.indexOfChild(view);
            if (iIndexOfChild == -1) {
                na0.V(view);
            } else {
                C3306y6 c3306y6 = (C3306y6) na0.n;
                if (c3306y6.K(iIndexOfChild)) {
                    c3306y6.M(iIndexOfChild);
                    na0.V(view);
                    n51.g(iIndexOfChild);
                } else {
                    z = false;
                }
            }
            if (z) {
                AbstractC2144m60 abstractC2144m60L = RecyclerView.L(view);
                C1266d60 c1266d60 = recyclerView.n;
                c1266d60.m(abstractC2144m60L);
                c1266d60.j(abstractC2144m60L);
            }
            recyclerView.n0(!z);
            if (z || !abstractC2144m60.n()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    public abstract void d(AbstractC2144m60 abstractC2144m60);

    public abstract void e();

    public abstract boolean f();
}
