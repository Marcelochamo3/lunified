package o;

import android.view.MenuItem;

/* JADX INFO: renamed from: o.Qb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0700Qb implements Runnable {
    public final /* synthetic */ C0726Rb l;
    public final /* synthetic */ MenuItem m;
    public final /* synthetic */ ZP n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C2133m1 f475o;

    public RunnableC0700Qb(C2133m1 c2133m1, C0726Rb c0726Rb, C1386eQ c1386eQ, ZP zp) {
        this.f475o = c2133m1;
        this.l = c0726Rb;
        this.m = c1386eQ;
        this.n = zp;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0726Rb c0726Rb = this.l;
        if (c0726Rb != null) {
            C2133m1 c2133m1 = this.f475o;
            ((ViewOnKeyListenerC0752Sb) c2133m1.m).L = true;
            c0726Rb.b.c(false);
            ((ViewOnKeyListenerC0752Sb) c2133m1.m).L = false;
        }
        MenuItem menuItem = this.m;
        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
            this.n.q(menuItem, null, 4);
        }
    }
}
