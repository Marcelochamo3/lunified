package o;

import java.util.Map;

/* JADX INFO: renamed from: o.qC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2541qC extends C90 {
    public final Map H;
    public C3271xo I;

    public C2541qC(C1562g8 c1562g8, InterfaceC0428Fo interfaceC0428Fo, C0350Co c0350Co, Map map) {
        super(c1562g8, interfaceC0428Fo, c0350Co);
        this.H = map;
    }

    @Override // o.C90, o.InterfaceC1324dm0
    public final void d(long j, int i, int i2, int i3, C1226cm0 c1226cm0) {
        super.d(j, i, i2, i3, c1226cm0);
    }

    @Override // o.C90
    public final C0643Nw m(C0643Nw c0643Nw) {
        C3271xo c3271xo;
        C3271xo c3271xo2 = this.I;
        if (c3271xo2 == null) {
            c3271xo2 = c0643Nw.z;
        }
        if (c3271xo2 != null && (c3271xo = (C3271xo) this.H.get(c3271xo2.n)) != null) {
            c3271xo2 = c3271xo;
        }
        CQ cq = c0643Nw.u;
        CQ cq2 = null;
        if (cq == null) {
            cq = cq2;
        } else {
            BQ[] bqArr = cq.l;
            int length = bqArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                }
                BQ bq = bqArr[i2];
                if ((bq instanceof C1943k30) && "com.apple.streaming.transportStreamTimestamp".equals(((C1943k30) bq).m)) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                if (length != 1) {
                    BQ[] bqArr2 = new BQ[length - 1];
                    while (i < length) {
                        if (i != i2) {
                            bqArr2[i < i2 ? i : i - 1] = bqArr[i];
                        }
                        i++;
                    }
                    cq2 = new CQ(bqArr2);
                }
                cq = cq2;
            }
        }
        if (c3271xo2 != c0643Nw.z || cq != c0643Nw.u) {
            C0617Mw c0617MwA = c0643Nw.a();
            c0617MwA.n = c3271xo2;
            c0617MwA.i = cq;
            c0643Nw = c0617MwA.a();
        }
        return super.m(c0643Nw);
    }
}
