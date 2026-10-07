package o;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.view.View;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: o.v70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3018v70 implements Runnable {
    public final /* synthetic */ int l = 0;
    public Object m;
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f1070o;

    public /* synthetic */ RunnableC3018v70() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        switch (this.l) {
            case 0:
                try {
                    objCall = ((Callable) this.m).call();
                } catch (Exception unused) {
                    objCall = null;
                }
                ((Handler) this.f1070o).post(new RunnableC1938k1((InterfaceC0835Vg) this.n, objCall, 11, false));
                break;
            case 1:
                if (!((AtomicBoolean) this.m).get() && ((InterfaceC1594gb) this.n).a()) {
                    ((InterfaceC0360Cy) this.f1070o).c();
                    break;
                }
                break;
            default:
                C2706rw0.h((View) this.m, (Vm0) this.n);
                ((ValueAnimator) this.f1070o).start();
                break;
        }
    }

    public RunnableC3018v70(AtomicBoolean atomicBoolean, InterfaceC1594gb interfaceC1594gb, InterfaceC0360Cy interfaceC0360Cy) {
        this.m = atomicBoolean;
        this.n = interfaceC1594gb;
        this.f1070o = interfaceC0360Cy;
    }

    public RunnableC3018v70(View view, C3094vw0 c3094vw0, Vm0 vm0, ValueAnimator valueAnimator) {
        this.m = view;
        this.n = vm0;
        this.f1070o = valueAnimator;
    }
}
