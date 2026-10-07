package o;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: renamed from: o.Wf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0860Wf implements ZJ {
    public final /* synthetic */ int l;
    public final /* synthetic */ AbstractActivityC1116bg m;

    public /* synthetic */ C0860Wf(AbstractActivityC1116bg abstractActivityC1116bg, int i) {
        this.l = i;
        this.m = abstractActivityC1116bg;
    }

    @Override // o.ZJ
    public final void a(InterfaceC1283dK interfaceC1283dK, SJ sj) {
        switch (this.l) {
            case 0:
                if (sj == SJ.ON_STOP) {
                    Window window = this.m.getWindow();
                    View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                    if (viewPeekDecorView != null) {
                        viewPeekDecorView.cancelPendingInputEvents();
                    }
                }
                break;
            case 1:
                if (sj == SJ.ON_DESTROY) {
                    this.m.m.m = null;
                    if (!this.m.isChangingConfigurations()) {
                        this.m.e().a();
                    }
                    ExecutorC0938Zf executorC0938Zf = this.m.t;
                    AbstractActivityC1116bg abstractActivityC1116bg = executorC0938Zf.f660o;
                    abstractActivityC1116bg.getWindow().getDecorView().removeCallbacks(executorC0938Zf);
                    abstractActivityC1116bg.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(executorC0938Zf);
                }
                break;
            case 2:
                AbstractActivityC1116bg abstractActivityC1116bg2 = this.m;
                if (abstractActivityC1116bg2.q == null) {
                    C0912Yf c0912Yf = (C0912Yf) abstractActivityC1116bg2.getLastNonConfigurationInstance();
                    if (c0912Yf != null) {
                        abstractActivityC1116bg2.q = c0912Yf.a;
                    }
                    if (abstractActivityC1116bg2.q == null) {
                        abstractActivityC1116bg2.q = new Zt0();
                    }
                }
                abstractActivityC1116bg2.f702o.f(this);
                break;
            default:
                if (sj == SJ.ON_CREATE && Build.VERSION.SDK_INT >= 33) {
                    C1490fW c1490fW = this.m.s;
                    OnBackInvokedDispatcher onBackInvokedDispatcherA = AbstractC0886Xf.a((AbstractActivityC1116bg) interfaceC1283dK);
                    c1490fW.getClass();
                    AbstractC1474fG.j(onBackInvokedDispatcherA, "invoker");
                    c1490fW.e = onBackInvokedDispatcherA;
                    c1490fW.c(c1490fW.g);
                    break;
                }
                break;
        }
    }
}
