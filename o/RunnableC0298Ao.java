package o;

/* JADX INFO: renamed from: o.Ao, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0298Ao implements Runnable {
    public final /* synthetic */ int l;
    public final /* synthetic */ C0350Co m;
    public final /* synthetic */ InterfaceC0376Do n;

    public /* synthetic */ RunnableC0298Ao(C0350Co c0350Co, InterfaceC0376Do interfaceC0376Do, int i) {
        this.l = i;
        this.m = c0350Co;
        this.n = interfaceC0376Do;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.l) {
            case 0:
                C0350Co c0350Co = this.m;
                this.n.D(c0350Co.a, c0350Co.b);
                break;
            case 1:
                C0350Co c0350Co2 = this.m;
                this.n.j(c0350Co2.a, c0350Co2.b);
                break;
            case 2:
                C0350Co c0350Co3 = this.m;
                this.n.x(c0350Co3.a, c0350Co3.b);
                break;
            default:
                C0350Co c0350Co4 = this.m;
                this.n.c(c0350Co4.a, c0350Co4.b);
                break;
        }
    }
}
