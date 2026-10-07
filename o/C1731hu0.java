package o;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: renamed from: o.hu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1731hu0 implements X0 {
    public final /* synthetic */ int l;
    public final /* synthetic */ C1583gR m;

    public /* synthetic */ C1731hu0(C1583gR c1583gR, int i) {
        this.l = i;
        this.m = c1583gR;
    }

    @Override // o.X0
    public final boolean d(View view) {
        switch (this.l) {
            case 0:
                int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
                ViewPager2 viewPager2 = (ViewPager2) this.m.p;
                if (viewPager2.C) {
                    viewPager2.c(currentItem, true);
                }
                break;
            default:
                int currentItem2 = ((ViewPager2) view).getCurrentItem() - 1;
                ViewPager2 viewPager3 = (ViewPager2) this.m.p;
                if (viewPager3.C) {
                    viewPager3.c(currentItem2, true);
                }
                break;
        }
        return true;
    }
}
