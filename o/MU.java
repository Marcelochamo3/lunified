package o;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class MU implements Runnable {
    public final /* synthetic */ int l;
    public final /* synthetic */ C1583gR m;

    public /* synthetic */ MU(C1583gR c1583gR, int i) {
        this.l = i;
        this.m = c1583gR;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.l) {
            case 0:
                C1583gR c1583gR = this.m;
                AbstractC1474fG.j(c1583gR, "this$0");
                Iterator it = ((ArrayList) c1583gR.n).iterator();
                while (it.hasNext()) {
                    ((OJ) it.next()).a();
                }
                break;
            default:
                C1583gR c1583gR2 = this.m;
                AbstractC1474fG.j(c1583gR2, "this$0");
                Iterator it2 = ((ArrayList) c1583gR2.n).iterator();
                while (it2.hasNext()) {
                    ((OJ) it2.next()).getClass();
                }
                break;
        }
    }
}
