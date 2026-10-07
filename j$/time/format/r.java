package j$.time.format;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class r implements InterfaceC0131f {
    private final j$.time.temporal.p a;
    private final G b;
    private final B c;
    private volatile j d;

    r(j$.time.temporal.p pVar, G g, B b) {
        this.a = pVar;
        this.b = g;
        this.c = b;
    }

    @Override // j$.time.format.InterfaceC0131f
    public final boolean p(y yVar, StringBuilder sb) {
        String strF;
        Long lE = yVar.e(this.a);
        if (lE == null) {
            return false;
        }
        j$.time.chrono.n nVar = (j$.time.chrono.n) yVar.d().C(j$.time.temporal.l.e());
        if (nVar == null || nVar == j$.time.chrono.u.d) {
            strF = this.c.f(this.a, lE.longValue(), this.b, yVar.c());
        } else {
            strF = this.c.e(nVar, this.a, lE.longValue(), this.b, yVar.c());
        }
        if (strF != null) {
            sb.append(strF);
            return true;
        }
        if (this.d == null) {
            this.d = new j(this.a, 1, 19, F.NORMAL);
        }
        return this.d.p(yVar, sb);
    }

    @Override // j$.time.format.InterfaceC0131f
    public final int r(w wVar, CharSequence charSequence, int i) {
        int length = charSequence.length();
        if (i < 0 || i > length) {
            throw new IndexOutOfBoundsException();
        }
        G g = wVar.l() ? this.b : null;
        j$.time.chrono.n nVarH = wVar.h();
        B b = this.c;
        j$.time.temporal.p pVar = this.a;
        Iterator itH = (nVarH == null || nVarH == j$.time.chrono.u.d) ? b.h(pVar, g, wVar.i()) : b.g(nVarH, pVar, g, wVar.i());
        if (itH != null) {
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                String str = (String) entry.getKey();
                if (wVar.s(str, 0, charSequence, i, str.length())) {
                    return wVar.o(this.a, ((Long) entry.getValue()).longValue(), i, str.length() + i);
                }
            }
            if (pVar == j$.time.temporal.a.ERA && !wVar.l()) {
                for (j$.time.chrono.o oVar : nVarH.O()) {
                    String string = oVar.toString();
                    if (wVar.s(string, 0, charSequence, i, string.length())) {
                        return wVar.o(this.a, oVar.getValue(), i, string.length() + i);
                    }
                }
            }
            if (wVar.l()) {
                return ~i;
            }
        }
        if (this.d == null) {
            this.d = new j(this.a, 1, 19, F.NORMAL);
        }
        return this.d.r(wVar, charSequence, i);
    }

    public final String toString() {
        StringBuilder sb;
        G g = G.FULL;
        j$.time.temporal.p pVar = this.a;
        G g2 = this.b;
        if (g2 == g) {
            sb = new StringBuilder("Text(");
            sb.append(pVar);
        } else {
            sb = new StringBuilder("Text(");
            sb.append(pVar);
            sb.append(",");
            sb.append(g2);
        }
        sb.append(")");
        return sb.toString();
    }
}
