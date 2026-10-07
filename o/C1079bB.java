package o;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: o.bB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1079bB extends EM implements InterfaceC1714hm {
    private volatile C1079bB _immediate;
    public final Handler n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f690o;
    public final boolean p;
    public final C1079bB q;

    public C1079bB(Handler handler, String str, boolean z) {
        this.n = handler;
        this.f690o = str;
        this.p = z;
        this._immediate = z ? this : null;
        C1079bB c1079bB = this._immediate;
        if (c1079bB == null) {
            c1079bB = new C1079bB(handler, str, true);
            this._immediate = c1079bB;
        }
        this.q = c1079bB;
    }

    @Override // o.InterfaceC1714hm
    public final InterfaceC2300nn R(long j, final Runnable runnable, InterfaceC1022ai interfaceC1022ai) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.n.postDelayed(runnable, j)) {
            return new InterfaceC2300nn() { // from class: o.aB
                @Override // o.InterfaceC2300nn
                public final void d() {
                    this.l.n.removeCallbacks(runnable);
                }
            };
        }
        Z(interfaceC1022ai, runnable);
        return C1489fV.l;
    }

    @Override // o.AbstractC1217ci
    public final void W(InterfaceC1022ai interfaceC1022ai, Runnable runnable) {
        if (this.n.post(runnable)) {
            return;
        }
        Z(interfaceC1022ai, runnable);
    }

    @Override // o.AbstractC1217ci
    public final boolean Y() {
        return (this.p && AbstractC1474fG.b(Looper.myLooper(), this.n.getLooper())) ? false : true;
    }

    public final void Z(InterfaceC1022ai interfaceC1022ai, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        AH ah = (AH) interfaceC1022ai.q(C2691rp.v);
        if (ah != null) {
            ah.f(cancellationException);
        }
        AbstractC1910jn.b.W(interfaceC1022ai, runnable);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1079bB) && ((C1079bB) obj).n == this.n;
    }

    public final int hashCode() {
        return System.identityHashCode(this.n);
    }

    @Override // o.InterfaceC1714hm
    public final void t(long j, C1692hb c1692hb) {
        RunnableC1938k1 runnableC1938k1 = new RunnableC1938k1(c1692hb, this, 7, false);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.n.postDelayed(runnableC1938k1, j)) {
            c1692hb.A(new io.sentry.android.replay.capture.e(this, 5, runnableC1938k1));
        } else {
            Z(c1692hb.p, runnableC1938k1);
        }
    }

    @Override // o.AbstractC1217ci
    public final String toString() {
        C1079bB c1079bB;
        String str;
        C3362yl c3362yl = AbstractC1910jn.a;
        EM em = FM.a;
        if (this == em) {
            str = "Dispatchers.Main";
        } else {
            try {
                c1079bB = ((C1079bB) em).q;
            } catch (UnsupportedOperationException unused) {
                c1079bB = null;
            }
            str = this == c1079bB ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f690o;
        if (string == null) {
            string = this.n.toString();
        }
        return this.p ? AbstractC1701hf0.d(string, ".immediate") : string;
    }

    public C1079bB(Handler handler) {
        this(handler, null, false);
    }
}
