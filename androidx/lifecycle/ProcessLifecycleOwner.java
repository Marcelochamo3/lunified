package androidx.lifecycle;

import android.os.Handler;
import o.AbstractC1474fG;
import o.C0334By;
import o.C1478fK;
import o.InterfaceC1283dK;
import o.Jj0;
import o.SJ;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleOwner implements InterfaceC1283dK {
    public static final ProcessLifecycleOwner t = new ProcessLifecycleOwner();
    public int l;
    public int m;
    public Handler p;
    public boolean n = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f29o = true;
    public final C1478fK q = new C1478fK(this);
    public final Jj0 r = new Jj0(22, this);
    public final C0334By s = new C0334By(27, this);

    private ProcessLifecycleOwner() {
    }

    public final void b() {
        int i = this.m + 1;
        this.m = i;
        if (i == 1) {
            if (this.n) {
                this.q.d(SJ.ON_RESUME);
                this.n = false;
            } else {
                Handler handler = this.p;
                AbstractC1474fG.g(handler);
                handler.removeCallbacks(this.r);
            }
        }
    }

    @Override // o.InterfaceC1283dK
    public final C1478fK f() {
        return this.q;
    }
}
