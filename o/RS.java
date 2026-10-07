package o;

import java.io.EOFException;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class RS extends AbstractC2340o70 {
    public static final TP e;
    public static final TP f;
    public static final byte[] g;
    public static final byte[] h;
    public static final byte[] i;
    public final C2468pa a;
    public final List b;
    public final TP c;
    public long d;

    static {
        Pattern pattern = TP.e;
        e = AbstractC1474fG.o("multipart/mixed");
        AbstractC1474fG.o("multipart/alternative");
        AbstractC1474fG.o("multipart/digest");
        AbstractC1474fG.o("multipart/parallel");
        f = AbstractC1474fG.o("multipart/form-data");
        g = new byte[]{58, 32};
        h = new byte[]{13, 10};
        i = new byte[]{45, 45};
    }

    public RS(C2468pa c2468pa, TP tp, List list) {
        AbstractC1474fG.j(c2468pa, "boundaryByteString");
        AbstractC1474fG.j(tp, "type");
        this.a = c2468pa;
        this.b = list;
        Pattern pattern = TP.e;
        this.c = AbstractC1474fG.o(tp + "; boundary=" + c2468pa.k());
        this.d = -1L;
    }

    @Override // o.AbstractC2340o70
    public final long a() throws EOFException {
        long j = this.d;
        if (j != -1) {
            return j;
        }
        long jD = d(null, true);
        this.d = jD;
        return jD;
    }

    @Override // o.AbstractC2340o70
    public final TP b() {
        return this.c;
    }

    @Override // o.AbstractC2340o70
    public final void c(M9 m9) throws EOFException {
        d(m9, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long d(M9 m9, boolean z) throws EOFException {
        E9 e9;
        M9 e10;
        if (z) {
            e10 = new E9();
            e9 = e10;
        } else {
            e9 = 0;
            e10 = m9;
        }
        List list = this.b;
        int size = list.size();
        long j = 0;
        int i2 = 0;
        while (true) {
            C2468pa c2468pa = this.a;
            byte[] bArr = i;
            byte[] bArr2 = h;
            if (i2 >= size) {
                AbstractC1474fG.g(e10);
                e10.G(bArr);
                e10.E(c2468pa);
                e10.G(bArr);
                e10.G(bArr2);
                if (!z) {
                    return j;
                }
                AbstractC1474fG.g(e9);
                long j2 = j + e9.m;
                e9.p();
                return j2;
            }
            QS qs = (QS) list.get(i2);
            C2152mB c2152mB = qs.a;
            AbstractC1474fG.g(e10);
            e10.G(bArr);
            e10.E(c2468pa);
            e10.G(bArr2);
            if (c2152mB != null) {
                int size2 = c2152mB.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    e10.N(c2152mB.d(i3)).G(g).N(c2152mB.h(i3)).G(bArr2);
                }
            }
            AbstractC2340o70 abstractC2340o70 = qs.b;
            TP tpB = abstractC2340o70.b();
            if (tpB != null) {
                e10.N("Content-Type: ").N(tpB.a).G(bArr2);
            }
            long jA = abstractC2340o70.a();
            if (jA != -1) {
                e10.N("Content-Length: ").O(jA).G(bArr2);
            } else if (z) {
                AbstractC1474fG.g(e9);
                e9.p();
                return -1L;
            }
            e10.G(bArr2);
            if (z) {
                j += jA;
            } else {
                abstractC2340o70.c(e10);
            }
            e10.G(bArr2);
            i2++;
        }
    }
}
