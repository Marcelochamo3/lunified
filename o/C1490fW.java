package o;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: renamed from: o.fW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1490fW {
    public final Runnable a;
    public final M5 b = new M5();
    public WV c;
    public final OnBackInvokedCallback d;
    public OnBackInvokedDispatcher e;
    public boolean f;
    public boolean g;

    public C1490fW(Runnable runnable) {
        this.a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.d = i >= 34 ? C1100bW.a.a(new XV(this, 0), new XV(this, 1), new YV(this, 0), new YV(this, 1)) : ZV.a.a(new YV(this, 2));
        }
    }

    public final void a(InterfaceC1283dK interfaceC1283dK, WV wv) {
        AbstractC1474fG.j(interfaceC1283dK, "owner");
        AbstractC1474fG.j(wv, "onBackPressedCallback");
        C1478fK c1478fKF = interfaceC1283dK.f();
        if (c1478fKF.d == TJ.l) {
            return;
        }
        wv.b.add(new C1197cW(this, c1478fKF, wv));
        d();
        wv.c = new C1392eW(0, this, C1490fW.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0);
    }

    public final void b() {
        Object objPrevious;
        WV wv = this.c;
        if (wv == null) {
            M5 m5 = this.b;
            ListIterator<E> listIterator = m5.listIterator(m5.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((WV) objPrevious).a);
            wv = (WV) objPrevious;
        }
        this.c = null;
        if (wv != null) {
            wv.b();
            return;
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.e;
        OnBackInvokedCallback onBackInvokedCallback = this.d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        ZV zv = ZV.a;
        if (z && !this.f) {
            zv.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f = true;
        } else {
            if (z || !this.f) {
                return;
            }
            zv.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f = false;
        }
    }

    public final void d() {
        boolean z = this.g;
        M5 m5 = this.b;
        boolean z2 = false;
        if (!(m5 instanceof Collection) || !m5.isEmpty()) {
            Iterator it = m5.iterator();
            while (it.hasNext()) {
                if (((WV) it.next()).a) {
                    z2 = true;
                    break;
                }
            }
        }
        this.g = z2;
        if (z2 == z || Build.VERSION.SDK_INT < 33) {
            return;
        }
        c(z2);
    }
}
