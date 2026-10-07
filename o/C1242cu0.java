package o;

import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: renamed from: o.cu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1242cu0 extends Q50 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C1242cu0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // o.Q50
    public final void a() {
        switch (this.a) {
            case 0:
                ViewPager2 viewPager2 = (ViewPager2) this.b;
                viewPager2.p = true;
                viewPager2.w.l = true;
                break;
            default:
                ((C1583gR) this.b).J();
                break;
        }
    }

    @Override // o.Q50
    public final void b(int i, int i2, Object obj) {
        a();
    }

    @Override // o.Q50
    public final void c(int i, int i2) {
        a();
    }

    @Override // o.Q50
    public final void d(int i, int i2) {
        a();
    }

    @Override // o.Q50
    public final void e(int i, int i2) {
        a();
    }
}
