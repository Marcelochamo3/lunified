package o;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class GW extends Fg0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final byte[] f278o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean n;

    public static boolean e(C2562qX c2562qX, byte[] bArr) {
        if (c2562qX.a() < bArr.length) {
            return false;
        }
        int i = c2562qX.b;
        byte[] bArr2 = new byte[bArr.length];
        c2562qX.e(bArr2, 0, bArr.length);
        c2562qX.F(i);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // o.Fg0
    public final long b(C2562qX c2562qX) {
        byte[] bArr = c2562qX.a;
        return (((long) this.i) * Ou0.m(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // o.Fg0
    public final boolean c(C2562qX c2562qX, long j, C2994uv c2994uv) {
        if (e(c2562qX, f278o)) {
            byte[] bArrCopyOf = Arrays.copyOf(c2562qX.a, c2562qX.c);
            int i = bArrCopyOf[9] & 255;
            ArrayList arrayListA = Ou0.a(bArrCopyOf);
            if (((C0643Nw) c2994uv.m) != null) {
                return true;
            }
            C0617Mw c0617Mw = new C0617Mw();
            c0617Mw.k = "audio/opus";
            c0617Mw.x = i;
            c0617Mw.y = 48000;
            c0617Mw.m = arrayListA;
            c2994uv.m = new C0643Nw(c0617Mw);
            return true;
        }
        if (!e(c2562qX, p)) {
            AbstractC0397Ej.g((C0643Nw) c2994uv.m);
            return false;
        }
        AbstractC0397Ej.g((C0643Nw) c2994uv.m);
        if (this.n) {
            return true;
        }
        this.n = true;
        c2562qX.G(8);
        CQ cqI = AbstractC1370eA.I(AbstractC0985aF.m((String[]) AbstractC1370eA.L(c2562qX, false, false).l));
        if (cqI == null) {
            return true;
        }
        C0617Mw c0617MwA = ((C0643Nw) c2994uv.m).a();
        CQ cq = ((C0643Nw) c2994uv.m).u;
        if (cq != null) {
            cqI = cqI.a(cq.l);
        }
        c0617MwA.i = cqI;
        c2994uv.m = new C0643Nw(c0617MwA);
        return true;
    }

    @Override // o.Fg0
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = false;
        }
    }
}
