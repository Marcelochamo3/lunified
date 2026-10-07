package o;

import android.os.Handler;
import android.view.View;
import android.widget.LinearLayout;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: o.ec, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1400ec extends AbstractC1633gu0 {
    public final /* synthetic */ C1498fc a;
    public final /* synthetic */ List b;
    public final /* synthetic */ C0913Yg c;
    public final /* synthetic */ Handler d;

    public C1400ec(C1498fc c1498fc, ArrayList arrayList, C0913Yg c0913Yg, Handler handler) {
        this.a = c1498fc;
        this.b = arrayList;
        this.c = c0913Yg;
        this.d = handler;
    }

    @Override // o.AbstractC1633gu0
    public final void a(int i) {
        if (i == 0) {
            C0913Yg c0913Yg = this.c;
            int currentItem = c0913Yg.n.getCurrentItem();
            ViewPager2 viewPager2 = c0913Yg.n;
            List list = this.b;
            if (currentItem == 0) {
                viewPager2.b(AbstractC0937Ze.J(list) - 1, false);
            } else if (currentItem == AbstractC0937Ze.J(list)) {
                viewPager2.b(1, false);
            }
        }
    }

    @Override // o.AbstractC1633gu0
    public final void c(int i) {
        int iJ;
        if (i == 0) {
            C0882Xb c0882Xb = this.a.w;
            if (c0882Xb == null) {
                AbstractC1474fG.U("category");
                throw null;
            }
            iJ = AbstractC0937Ze.J(c0882Xb.b);
        } else {
            iJ = i == AbstractC0937Ze.J(this.b) ? 0 : i - 1;
        }
        C0913Yg c0913Yg = this.c;
        LinearLayout linearLayout = c0913Yg.m;
        AbstractC1474fG.i(linearLayout, "llDotsIndicator");
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (!(i3 < linearLayout.getChildCount())) {
                Handler handler = this.d;
                handler.removeCallbacksAndMessages(null);
                handler.postDelayed(new RunnableC1303dc(c0913Yg, 1), 8000L);
                return;
            }
            int i4 = i3 + 1;
            View childAt = linearLayout.getChildAt(i3);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            int i5 = i2 + 1;
            if (i2 < 0) {
                AbstractC0937Ze.N();
                throw null;
            }
            childAt.setSelected(iJ == i2);
            i3 = i4;
            i2 = i5;
        }
    }
}
