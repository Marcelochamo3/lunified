package o;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: o.jE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1862jE implements QQ {
    public static final CW b = CW.a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");
    public final C0334By a;

    public C1862jE(C0334By c0334By) {
        this.a = c0334By;
    }

    @Override // o.QQ
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return true;
    }

    @Override // o.QQ
    public final PQ b(Object obj, int i, int i2, FW fw) {
        C2151mA c2151mA = (C2151mA) obj;
        C0334By c0334By = this.a;
        if (c0334By != null) {
            OQ oqA = OQ.a(c2151mA);
            NQ nq = (NQ) c0334By.m;
            Object objA = nq.a(oqA);
            ArrayDeque arrayDeque = OQ.d;
            synchronized (arrayDeque) {
                arrayDeque.offer(oqA);
            }
            C2151mA c2151mA2 = (C2151mA) objA;
            if (c2151mA2 == null) {
                nq.d(OQ.a(c2151mA), c2151mA);
            } else {
                c2151mA = c2151mA2;
            }
        }
        return new PQ(c2151mA, new C2543qE(c2151mA, ((Integer) fw.c(b)).intValue()));
    }
}
