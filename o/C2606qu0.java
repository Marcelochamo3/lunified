package o;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: o.qu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2606qu0 {
    public Interpolator c;
    public InterfaceC2702ru0 d;
    public boolean e;
    public long b = -1;
    public final Nl0 f = new Nl0(this);
    public final ArrayList a = new ArrayList();

    public final void a() {
        if (this.e) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((C2509pu0) it.next()).b();
            }
            this.e = false;
        }
    }

    public final void b() {
        View view;
        if (this.e) {
            return;
        }
        for (C2509pu0 c2509pu0 : this.a) {
            long j = this.b;
            if (j >= 0) {
                c2509pu0.c(j);
            }
            Interpolator interpolator = this.c;
            if (interpolator != null && (view = (View) c2509pu0.a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.d != null) {
                c2509pu0.d(this.f);
            }
            View view2 = (View) c2509pu0.a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.e = true;
    }
}
