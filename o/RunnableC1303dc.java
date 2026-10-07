package o;

import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: renamed from: o.dc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1303dc implements Runnable {
    public final /* synthetic */ int l;
    public final /* synthetic */ C0913Yg m;

    public /* synthetic */ RunnableC1303dc(C0913Yg c0913Yg, int i) {
        this.l = i;
        this.m = c0913Yg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.l) {
            case 0:
                ViewPager2 viewPager2 = this.m.n;
                viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
                break;
            default:
                ViewPager2 viewPager3 = this.m.n;
                viewPager3.setCurrentItem(viewPager3.getCurrentItem() + 1);
                break;
        }
    }
}
