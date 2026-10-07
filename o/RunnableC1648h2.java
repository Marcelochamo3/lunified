package o;

import android.view.View;

/* JADX INFO: renamed from: o.h2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1648h2 implements Runnable {
    public final /* synthetic */ int l;
    public final /* synthetic */ View m;
    public final /* synthetic */ View n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C2426p2 f805o;

    public /* synthetic */ RunnableC1648h2(C2426p2 c2426p2, View view, View view2, int i) {
        this.l = i;
        this.f805o = c2426p2;
        this.m = view;
        this.n = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.l) {
            case 0:
                C2426p2.b(this.f805o.w, this.m, this.n);
                break;
            default:
                C2426p2.b(this.f805o.g, this.m, this.n);
                break;
        }
    }
}
