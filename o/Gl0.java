package o;

import androidx.appcompat.widget.Toolbar;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Gl0 implements Runnable {
    public final /* synthetic */ int l;
    public final /* synthetic */ Toolbar m;

    public /* synthetic */ Gl0(Toolbar toolbar, int i) {
        this.l = i;
        this.m = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.l) {
            case 0:
                Jl0 jl0 = this.m.W;
                C1386eQ c1386eQ = jl0 == null ? null : jl0.m;
                if (c1386eQ != null) {
                    c1386eQ.collapseActionView();
                }
                break;
            default:
                this.m.n();
                break;
        }
    }
}
