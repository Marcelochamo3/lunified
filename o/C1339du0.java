package o;

import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: renamed from: o.du0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1339du0 extends AbstractC1633gu0 {
    public final /* synthetic */ int a;
    public final Object b;

    public C1339du0() {
        this.a = 2;
        this.b = new ArrayList(3);
    }

    @Override // o.AbstractC1633gu0
    public void a(int i) {
        switch (this.a) {
            case 0:
                if (i == 0) {
                    ((ViewPager2) this.b).d();
                    return;
                }
                return;
            case 1:
            default:
                return;
            case 2:
                try {
                    Iterator it = ((ArrayList) this.b).iterator();
                    while (it.hasNext()) {
                        ((AbstractC1633gu0) it.next()).a(i);
                    }
                    return;
                } catch (ConcurrentModificationException e) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                }
        }
    }

    @Override // o.AbstractC1633gu0
    public void b(int i, float f, int i2) {
        switch (this.a) {
            case 2:
                try {
                    Iterator it = ((ArrayList) this.b).iterator();
                    while (it.hasNext()) {
                        ((AbstractC1633gu0) it.next()).b(i, f, i2);
                    }
                    return;
                } catch (ConcurrentModificationException e) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                }
            default:
                return;
        }
    }

    @Override // o.AbstractC1633gu0
    public final void c(int i) {
        switch (this.a) {
            case 0:
                ViewPager2 viewPager2 = (ViewPager2) this.b;
                if (viewPager2.f33o != i) {
                    viewPager2.f33o = i;
                    viewPager2.E.J();
                    return;
                }
                return;
            case 1:
                ViewPager2 viewPager3 = (ViewPager2) this.b;
                viewPager3.clearFocus();
                if (viewPager3.hasFocus()) {
                    viewPager3.u.requestFocus(2);
                    return;
                }
                return;
            default:
                try {
                    Iterator it = ((ArrayList) this.b).iterator();
                    while (it.hasNext()) {
                        ((AbstractC1633gu0) it.next()).c(i);
                    }
                    return;
                } catch (ConcurrentModificationException e) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                }
        }
    }

    public /* synthetic */ C1339du0(ViewPager2 viewPager2, int i) {
        this.a = i;
        this.b = viewPager2;
    }
}
