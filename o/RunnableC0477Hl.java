package o;

import android.util.Log;

/* JADX INFO: renamed from: o.Hl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0477Hl implements Runnable {
    public final /* synthetic */ int l;
    public final /* synthetic */ C3157wf0 m;
    public final /* synthetic */ C0529Jl n;

    public /* synthetic */ RunnableC0477Hl(C3157wf0 c3157wf0, C0529Jl c0529Jl, int i) {
        this.l = i;
        this.m = c3157wf0;
        this.n = c0529Jl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.l) {
            case 0:
                C3157wf0 c3157wf0 = this.m;
                AbstractC1474fG.j(c3157wf0, "$operation");
                C0529Jl c0529Jl = this.n;
                AbstractC1474fG.j(c0529Jl, "this$0");
                if (Log.isLoggable("FragmentManager", 2)) {
                    c3157wf0.toString();
                }
                c3157wf0.c(c0529Jl);
                break;
            default:
                C3157wf0 c3157wf1 = this.m;
                AbstractC1474fG.j(c3157wf1, "$operation");
                C0529Jl c0529Jl2 = this.n;
                AbstractC1474fG.j(c0529Jl2, "this$0");
                if (Log.isLoggable("FragmentManager", 2)) {
                    c3157wf1.toString();
                }
                c3157wf1.c(c0529Jl2);
                break;
        }
    }
}
