package o;

import io.sentry.C0032c;
import java.io.IOException;

/* JADX INFO: renamed from: o.Ca, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0336Ca {
    public final C0032c a;
    public final InterfaceC1991ke0 b;
    public final C0310Ba c;
    public boolean d;
    public final /* synthetic */ C0362Da e;

    public C0336Ca(C0362Da c0362Da, C0032c c0032c) {
        this.e = c0362Da;
        this.a = c0032c;
        InterfaceC1991ke0 interfaceC1991ke0R = c0032c.r(1);
        this.b = interfaceC1991ke0R;
        this.c = new C0310Ba(c0362Da, this, interfaceC1991ke0R);
    }

    public final void a() {
        synchronized (this.e) {
            if (this.d) {
                return;
            }
            this.d = true;
            Mr0.d(this.b);
            try {
                this.a.e();
            } catch (IOException unused) {
            }
        }
    }
}
