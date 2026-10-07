package o;

import android.view.View;
import java.util.List;

/* JADX INFO: renamed from: o.oK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2355oK {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public List k;
    public boolean l;

    public final void a(View view) {
        int iE;
        int size = this.k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((AbstractC2144m60) this.k.get(i2)).a;
            Y50 y50 = (Y50) view3.getLayoutParams();
            if (view3 != view && !y50.a.l() && (iE = (y50.a.e() - this.d) * this.e) >= 0 && iE < i) {
                view2 = view3;
                if (iE == 0) {
                    break;
                } else {
                    i = iE;
                }
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((Y50) view2.getLayoutParams()).a.e();
        }
    }

    public final View b(C1266d60 c1266d60) {
        List list = this.k;
        if (list == null) {
            View viewD = c1266d60.d(this.d);
            this.d += this.e;
            return viewD;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = ((AbstractC2144m60) this.k.get(i)).a;
            Y50 y50 = (Y50) view.getLayoutParams();
            if (!y50.a.l() && this.d == y50.a.e()) {
                a(view);
                return view;
            }
        }
        return null;
    }
}
