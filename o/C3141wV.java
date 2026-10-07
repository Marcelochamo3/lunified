package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: o.wV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3141wV extends H50 {
    private List<AbstractC2304np> r;

    public C3141wV() {
    }

    @Override // o.H50
    public void E(Fl0 fl0, C2848tT c2848tT) throws Ri0 {
        throw fl0.f("no text format defined for OPT");
    }

    @Override // o.H50
    public void H(C0474Hi c0474Hi) throws Rw0 {
        if (c0474Hi.k() > 0) {
            this.r = new ArrayList();
        }
        while (c0474Hi.k() > 0) {
            this.r.add(AbstractC2304np.a(c0474Hi));
        }
    }

    @Override // o.H50
    public String I() {
        StringBuilder sb = new StringBuilder();
        List<AbstractC2304np> list = this.r;
        if (list != null) {
            sb.append(list);
            sb.append(" ");
        }
        sb.append(" ; payload ");
        sb.append(Y());
        sb.append(", xrcode ");
        sb.append(U());
        sb.append(", version ");
        sb.append(Z());
        sb.append(", flags ");
        sb.append(V());
        return sb.toString();
    }

    @Override // o.H50
    public void J(C0578Li c0578Li, C1799ig c1799ig, boolean z) {
        List<AbstractC2304np> list = this.r;
        if (list == null) {
            return;
        }
        Iterator<AbstractC2304np> it = list.iterator();
        while (it.hasNext()) {
            it.next().h(c0578Li);
        }
    }

    public int U() {
        return (int) (this.f295o >>> 24);
    }

    public int V() {
        return (int) (this.f295o & 65535);
    }

    public List<AbstractC2304np> W() {
        List<AbstractC2304np> list = this.r;
        return list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
    }

    public List<AbstractC2304np> X(int i) {
        if (this.r == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (AbstractC2304np abstractC2304np : this.r) {
            if (abstractC2304np.c() == i) {
                arrayList.add(abstractC2304np);
            }
        }
        return arrayList;
    }

    public int Y() {
        return this.n;
    }

    public int Z() {
        return (int) ((this.f295o >>> 16) & 255);
    }

    public void a0(StringBuilder sb) {
        sb.append(";; OPT PSEUDOSECTION: \n; EDNS: version: ");
        sb.append(Z());
        sb.append("; flags: ");
        for (int i = 0; i < 16; i++) {
            if ((V() & (1 << (15 - i))) != 0) {
                sb.append(C2310ns.b(i));
                sb.append(" ");
            }
        }
        sb.append("; udp: ");
        sb.append(Y());
        List<AbstractC2304np> list = this.r;
        if (list != null) {
            for (AbstractC2304np abstractC2304np : list) {
                sb.append("\n; ");
                sb.append(AbstractC2304np.a.a(abstractC2304np.c()));
                sb.append(": ");
                sb.append(abstractC2304np.f());
            }
        }
    }

    @Override // o.H50
    public boolean equals(Object obj) {
        return super.equals(obj) && this.f295o == ((C3141wV) obj).f295o;
    }

    @Override // o.H50
    public int hashCode() {
        int i = 0;
        for (byte b : P()) {
            i += (i << 3) + (b & 255);
        }
        return i;
    }

    @Override // o.H50
    public String toString() {
        return C2848tT.v + "\t\t\t\t" + C3080vp0.e(this.m) + "\t" + I();
    }

    public C3141wV(int i, int i2, int i3, int i4, AbstractC2304np... abstractC2304npArr) {
        this(i, i2, i3, i4);
        if (abstractC2304npArr != null) {
            this.r = new ArrayList(Arrays.asList(abstractC2304npArr));
        }
    }

    public C3141wV(int i, int i2, int i3, int i4, List<AbstractC2304np> list) {
        this(i, i2, i3, i4);
        if (list != null) {
            this.r = new ArrayList(list);
        }
    }

    public C3141wV(int i, int i2, int i3, int i4) {
        super(C2848tT.v, 41, i, 0L);
        H50.g("payloadSize", i);
        H50.j("xrcode", i2);
        H50.j("version", i3);
        H50.g("flags", i4);
        this.f295o = (((long) i2) << 24) + (((long) i3) << 16) + ((long) i4);
    }

    public C3141wV(int i, int i2, int i3) {
        this(i, i2, i3, 0);
    }
}
