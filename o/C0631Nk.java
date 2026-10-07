package o;

import android.net.Uri;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: o.Nk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0631Nk implements InterfaceC2056lC {
    public final /* synthetic */ C0683Pk l;

    public C0631Nk(C0683Pk c0683Pk) {
        this.l = c0683Pk;
    }

    @Override // o.InterfaceC2056lC
    public final void a() {
        this.l.p.remove(this);
    }

    @Override // o.InterfaceC2056lC
    public final boolean d(Uri uri, C2295nk0 c2295nk0, boolean z) {
        HashMap map;
        C0657Ok c0657Ok;
        C0683Pk c0683Pk = this.l;
        if (c0683Pk.w == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            C1568gC c1568gC = c0683Pk.u;
            int i = Lr0.a;
            List list = c1568gC.e;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int size = list.size();
                map = c0683Pk.f461o;
                if (i2 >= size) {
                    break;
                }
                C0657Ok c0657Ok2 = (C0657Ok) map.get(((C1470fC) list.get(i2)).a);
                if (c0657Ok2 != null && jElapsedRealtime < c0657Ok2.s) {
                    i3++;
                }
                i2++;
            }
            YK yk = new YK(1, 0, c0683Pk.u.e.size(), i3);
            c0683Pk.n.getClass();
            ZK zkN = C0622Nb.n(yk, c2295nk0);
            if (zkN != null && zkN.a == 2 && (c0657Ok = (C0657Ok) map.get(uri)) != null) {
                C0657Ok.a(c0657Ok, zkN.b);
            }
        }
        return false;
    }
}
