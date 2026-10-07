package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class XK {
    public final DV l;
    public boolean m;
    public int n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ TS f615o;

    public XK(TS ts, DV dv) {
        this.f615o = ts;
        this.l = dv;
    }

    public final void b(boolean z) {
        if (z == this.m) {
            return;
        }
        this.m = z;
        int i = z ? 1 : -1;
        TS ts = this.f615o;
        int i2 = ts.c;
        ts.c = i + i2;
        if (!ts.d) {
            ts.d = true;
            while (true) {
                try {
                    int i3 = ts.c;
                    if (i2 == i3) {
                        break;
                    } else {
                        i2 = i3;
                    }
                } catch (Throwable th) {
                    ts.d = false;
                    throw th;
                }
            }
            ts.d = false;
        }
        if (this.m) {
            ts.c(this);
        }
    }

    public boolean d(InterfaceC1283dK interfaceC1283dK) {
        return false;
    }

    public abstract boolean e();

    public void c() {
    }
}
