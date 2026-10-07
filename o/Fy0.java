package o;

import java.net.InetAddress;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Fy0 implements Runnable {
    public final /* synthetic */ int l;
    public final /* synthetic */ Gy0 m;
    public final /* synthetic */ InetAddress n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f269o;

    public /* synthetic */ Fy0(Gy0 gy0, InetAddress inetAddress, int i, int i2) {
        this.l = i2;
        this.m = gy0;
        this.n = inetAddress;
        this.f269o = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.l) {
            case 0:
                this.m.A(this.n, this.f269o);
                break;
            default:
                this.m.B(this.n, this.f269o);
                break;
        }
    }
}
