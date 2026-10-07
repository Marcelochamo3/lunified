package o;

import android.view.View;

/* JADX INFO: renamed from: o.zl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3459zl implements Runnable {
    public final /* synthetic */ int l;
    public final /* synthetic */ C0581Ll m;
    public final /* synthetic */ C3157wf0 n;

    public /* synthetic */ RunnableC3459zl(C0581Ll c0581Ll, C3157wf0 c3157wf0, int i) {
        this.l = i;
        this.m = c0581Ll;
        this.n = c3157wf0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.l) {
            case 0:
                C0581Ll c0581Ll = this.m;
                AbstractC1474fG.j(c0581Ll, "this$0");
                C3157wf0 c3157wf0 = this.n;
                AbstractC1474fG.j(c3157wf0, "$operation");
                c0581Ll.a(c3157wf0);
                break;
            case 1:
                C0581Ll c0581Ll2 = this.m;
                AbstractC1474fG.j(c0581Ll2, "this$0");
                C3157wf0 c3157wf1 = this.n;
                AbstractC1474fG.j(c3157wf1, "$operation");
                if (c0581Ll2.b.contains(c3157wf1)) {
                    int i = c3157wf1.a;
                    View view = c3157wf1.c.S;
                    AbstractC1474fG.i(view, "operation.fragment.mView");
                    AbstractC1674hK.d(i, view, c0581Ll2.a);
                }
                break;
            default:
                C0581Ll c0581Ll3 = this.m;
                AbstractC1474fG.j(c0581Ll3, "this$0");
                C3157wf0 c3157wf2 = this.n;
                AbstractC1474fG.j(c3157wf2, "$operation");
                c0581Ll3.b.remove(c3157wf2);
                c0581Ll3.c.remove(c3157wf2);
                break;
        }
    }
}
