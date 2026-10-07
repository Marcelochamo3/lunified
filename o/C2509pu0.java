package o;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: o.pu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2509pu0 {
    public final WeakReference a;

    public C2509pu0(View view) {
        this.a = new WeakReference(view);
    }

    public final void a(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void b() {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void d(InterfaceC2702ru0 interfaceC2702ru0) {
        View view = (View) this.a.get();
        if (view != null) {
            if (interfaceC2702ru0 != null) {
                view.animate().setListener(new C0962a1(interfaceC2702ru0, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }
}
