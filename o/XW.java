package o;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class XW extends Z50 {
    public RecyclerView a;
    public final Fe0 b = new Fe0(this);
    public IW c;
    public IW d;

    public static int c(View view, AbstractC0351Cp abstractC0351Cp) {
        return ((abstractC0351Cp.c(view) / 2) + abstractC0351Cp.e(view)) - ((abstractC0351Cp.l() / 2) + abstractC0351Cp.k());
    }

    public static View d(X50 x50, AbstractC0351Cp abstractC0351Cp) {
        int iX = x50.x();
        View view = null;
        if (iX == 0) {
            return null;
        }
        int iL = (abstractC0351Cp.l() / 2) + abstractC0351Cp.k();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < iX; i2++) {
            View viewW = x50.w(i2);
            int iAbs = Math.abs(((abstractC0351Cp.c(viewW) / 2) + abstractC0351Cp.e(viewW)) - iL);
            if (iAbs < i) {
                view = viewW;
                i = iAbs;
            }
        }
        return view;
    }

    public final void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        Fe0 fe0 = this.b;
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.v0;
            if (arrayList != null) {
                arrayList.remove(fe0);
            }
            this.a.setOnFlingListener(null);
        }
        this.a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            this.a.h(fe0);
            this.a.setOnFlingListener(this);
            new Scroller(this.a.getContext(), new DecelerateInterpolator());
            h();
        }
    }

    public final int[] b(X50 x50, View view) {
        int[] iArr = new int[2];
        if (x50.e()) {
            iArr[0] = c(view, f(x50));
        } else {
            iArr[0] = 0;
        }
        if (x50.f()) {
            iArr[1] = c(view, g(x50));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public View e(X50 x50) {
        if (x50.f()) {
            return d(x50, g(x50));
        }
        if (x50.e()) {
            return d(x50, f(x50));
        }
        return null;
    }

    public final AbstractC0351Cp f(X50 x50) {
        IW iw = this.d;
        if (iw == null || ((X50) iw.b) != x50) {
            this.d = new IW(x50, 0);
        }
        return this.d;
    }

    public final AbstractC0351Cp g(X50 x50) {
        IW iw = this.c;
        if (iw == null || ((X50) iw.b) != x50) {
            this.c = new IW(x50, 1);
        }
        return this.c;
    }

    public final void h() {
        X50 layoutManager;
        View viewE;
        RecyclerView recyclerView = this.a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewE = e(layoutManager)) == null) {
            return;
        }
        int[] iArrB = b(layoutManager, viewE);
        int i = iArrB[0];
        if (i == 0 && iArrB[1] == 0) {
            return;
        }
        this.a.i0(i, iArrB[1]);
    }
}
