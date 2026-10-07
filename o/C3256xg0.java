package o;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: o.xg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3256xg0 implements InterfaceC2583qj {
    public final InterfaceC2583qj l;
    public long m;
    public Uri n;

    public C3256xg0(InterfaceC2583qj interfaceC2583qj) {
        interfaceC2583qj.getClass();
        this.l = interfaceC2583qj;
        this.n = Uri.EMPTY;
        Collections.emptyMap();
    }

    @Override // o.InterfaceC2000kj
    public final int D(byte[] bArr, int i, int i2) {
        int iD = this.l.D(bArr, i, i2);
        if (iD != -1) {
            this.m += (long) iD;
        }
        return iD;
    }

    @Override // o.InterfaceC2583qj
    public final void close() {
        this.l.close();
    }

    @Override // o.InterfaceC2583qj
    public final void k(InterfaceC2590qm0 interfaceC2590qm0) {
        interfaceC2590qm0.getClass();
        this.l.k(interfaceC2590qm0);
    }

    @Override // o.InterfaceC2583qj
    public final Map l() {
        return this.l.l();
    }

    @Override // o.InterfaceC2583qj
    public final long v(C2970uj c2970uj) {
        this.n = c2970uj.a;
        Collections.emptyMap();
        InterfaceC2583qj interfaceC2583qj = this.l;
        long jV = interfaceC2583qj.v(c2970uj);
        Uri uriW = interfaceC2583qj.w();
        uriW.getClass();
        this.n = uriW;
        interfaceC2583qj.l();
        return jV;
    }

    @Override // o.InterfaceC2583qj
    public final Uri w() {
        return this.l.w();
    }
}
