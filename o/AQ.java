package o;

import j$.util.Optional;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class AQ implements Cloneable {
    static final int A = 3;
    static final int B = 4;
    private static final H50[] C = new H50[0];
    public static final int w = 65535;
    static final int x = 0;
    static final int y = 1;
    static final int z = 2;
    private C1763iB l;
    private List<H50>[] m;
    private int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private C1511fi0 f171o;
    private C1609gi0 p;
    private C1609gi0 q;
    private int r;
    private H70 s;
    int t;
    int u;
    int v;

    private AQ(C1763iB c1763iB) {
        this.m = new List[4];
        this.l = c1763iB;
    }

    private static boolean B(H50 h50, H50 h51) {
        return h50.w() == h51.w() && h50.t() == h51.t() && h50.v().equals(h51.v());
    }

    private void D(StringBuilder sb, int i) {
        if (i > 3) {
            return;
        }
        for (H50 h50 : q(i)) {
            if (i == 0) {
                sb.append(";;\t");
                sb.append(h50.l);
                sb.append(", type = ");
                sb.append(C3080vp0.e(h50.m));
                sb.append(", class = ");
                sb.append(C0344Ci.b(h50.n));
            } else if (!(h50 instanceof C3141wV)) {
                sb.append(h50);
            }
            sb.append("\n");
        }
    }

    private int E(C0578Li c0578Li, int i, C1799ig c1799ig, int i2) {
        int size = this.m[i].size();
        int iB = c0578Li.b();
        H50 h50 = null;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            H50 h51 = this.m[i].get(i5);
            if (i != 3 || !(h51 instanceof C3141wV)) {
                if (h50 != null && !B(h51, h50)) {
                    iB = c0578Li.b();
                    i4 = i3;
                }
                h51.M(c0578Li, i, c1799ig);
                if (c0578Li.b() > i2) {
                    c0578Li.c(iB);
                    return size - i4;
                }
                i3++;
                h50 = h51;
            }
        }
        return size - i3;
    }

    private void K(C0578Li c0578Li, int i) {
        byte[] bArrN;
        if (i < 12) {
            return;
        }
        C1511fi0 c1511fi0 = this.f171o;
        if (c1511fi0 != null) {
            i -= c1511fi0.D();
        }
        C3141wV c3141wVM = m();
        if (c3141wVM != null) {
            bArrN = c3141wVM.N(3);
            i -= bArrN.length;
        } else {
            bArrN = null;
        }
        int iB = c0578Li.b();
        this.l.y(c0578Li);
        C1799ig c1799ig = new C1799ig();
        int iJ = this.l.j();
        int iE = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            if (this.m[i2] != null) {
                int iE2 = E(c0578Li, i2, c1799ig, i);
                if (iE2 != 0 && i2 != 3) {
                    iJ = C1763iB.s(iJ, 6, true);
                    int iE3 = this.l.e(i2) - iE2;
                    int i3 = iB + 4;
                    c0578Li.m(iE3, (i2 * 2) + i3);
                    for (int i4 = i2 + 1; i4 < 3; i4++) {
                        c0578Li.m(0, (i4 * 2) + i3);
                    }
                    break;
                }
                if (i2 == 3) {
                    iE = this.l.e(i2) - iE2;
                }
            }
        }
        if (bArrN != null) {
            c0578Li.i(bArrN);
            iE++;
        }
        if (iJ != this.l.j()) {
            c0578Li.m(iJ, iB + 2);
        }
        if (iE != this.l.e(3)) {
            c0578Li.m(iE, iB + 10);
        }
        C1511fi0 c1511fi1 = this.f171o;
        if (c1511fi1 != null) {
            C1609gi0 c1609gi0Q = c1511fi1.q(this, c0578Li.g(), this.r, this.q);
            c1609gi0Q.M(c0578Li, 3, c1799ig);
            this.p = c1609gi0Q;
            c0578Li.m(iE + 1, iB + 10);
        }
    }

    public static AQ w(H50 h50) {
        AQ aq = new AQ();
        aq.l.v(0);
        aq.l.t(7);
        aq.b(h50, 0);
        return aq;
    }

    public static AQ x(C2848tT c2848tT) {
        return new Oq0(c2848tT);
    }

    public boolean A(H50 h50, int i) {
        List<H50> list = this.m[i];
        if (list == null || !list.remove(h50)) {
            return false;
        }
        this.l.d(i);
        return true;
    }

    public String C(int i) {
        if (i > 3) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        D(sb, i);
        return sb.toString();
    }

    public void F(C1763iB c1763iB) {
        this.l = c1763iB;
    }

    public void G(H70 h70) {
        this.s = h70;
    }

    public void H(C1511fi0 c1511fi0) {
        I(c1511fi0, 0, null);
    }

    public void I(C1511fi0 c1511fi0, int i, C1609gi0 c1609gi0) {
        this.f171o = c1511fi0;
        this.r = i;
        this.q = c1609gi0;
    }

    public void J(C0578Li c0578Li) {
        this.l.y(c0578Li);
        C1799ig c1799ig = new C1799ig();
        int i = 0;
        while (true) {
            List<H50>[] listArr = this.m;
            if (i >= listArr.length) {
                return;
            }
            List<H50> list = listArr[i];
            if (list != null) {
                Iterator<H50> it = list.iterator();
                while (it.hasNext()) {
                    it.next().M(c0578Li, i, c1799ig);
                }
            }
            i++;
        }
    }

    public byte[] L() {
        C0578Li c0578Li = new C0578Li();
        J(c0578Li);
        this.n = c0578Li.b();
        return c0578Li.g();
    }

    public byte[] M(int i) {
        C0578Li c0578Li = new C0578Li();
        K(c0578Li, i);
        this.n = c0578Li.b();
        return c0578Li.g();
    }

    public void b(H50 h50, int i) {
        List<H50>[] listArr = this.m;
        if (listArr[i] == null) {
            listArr[i] = new LinkedList();
        }
        this.l.o(i);
        this.m[i].add(h50);
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public AQ clone() {
        AQ aq = (AQ) super.clone();
        aq.m = new List[this.m.length];
        int i = 0;
        while (true) {
            List<H50>[] listArr = this.m;
            if (i >= listArr.length) {
                break;
            }
            if (listArr[i] != null) {
                aq.m[i] = new LinkedList(this.m[i]);
            }
            i++;
        }
        aq.l = this.l.clone();
        C1609gi0 c1609gi0 = this.q;
        if (c1609gi0 != null) {
            aq.q = (C1609gi0) c1609gi0.k();
        }
        C1609gi0 c1609gi1 = this.p;
        if (c1609gi1 != null) {
            aq.p = (C1609gi0) c1609gi1.k();
        }
        return aq;
    }

    public boolean d(C2848tT c2848tT, int i) {
        return e(c2848tT, i, 1) || e(c2848tT, i, 2) || e(c2848tT, i, 3);
    }

    public boolean e(C2848tT c2848tT, int i, int i2) {
        if (this.m[i2] == null) {
            return false;
        }
        for (int i3 = 0; i3 < this.m[i2].size(); i3++) {
            H50 h50 = this.m[i2].get(i3);
            if (h50.y() == i && c2848tT.equals(h50.v())) {
                return true;
            }
        }
        return false;
    }

    public boolean g(H50 h50) {
        for (int i = 1; i <= 3; i++) {
            List<H50> list = this.m[i];
            if (list != null && list.contains(h50)) {
                return true;
            }
        }
        return false;
    }

    public boolean h(H50 h50, int i) {
        List<H50> list = this.m[i];
        return list != null && list.contains(h50);
    }

    public C1609gi0 j() {
        return this.p;
    }

    public C1763iB k() {
        return this.l;
    }

    public C3141wV m() {
        for (H50 h50 : q(3)) {
            if (h50 instanceof C3141wV) {
                return (C3141wV) h50;
            }
        }
        return null;
    }

    public H50 n() {
        List<H50> list = this.m[0];
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public int o() {
        int iN = this.l.n();
        C3141wV c3141wVM = m();
        return c3141wVM != null ? iN + (c3141wVM.U() << 4) : iN;
    }

    public Optional<H70> p() {
        return Optional.ofNullable(this.s);
    }

    public List<H50> q(int i) {
        List<H50> list = this.m[i];
        return list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
    }

    @Deprecated
    public H50[] r(int i) {
        List<H50> list = this.m[i];
        return list == null ? C : (H50[]) list.toArray(new H50[0]);
    }

    public List<X40> s(int i) {
        if (this.m[i] == null) {
            return Collections.emptyList();
        }
        LinkedList linkedList = new LinkedList();
        HashSet hashSet = new HashSet();
        for (H50 h50 : q(i)) {
            C2848tT c2848tTV = h50.v();
            if (hashSet.contains(c2848tTV)) {
                int size = linkedList.size() - 1;
                while (true) {
                    if (size >= 0) {
                        X40 x40 = (X40) linkedList.get(size);
                        if (x40.getType() == h50.w() && x40.n() == h50.t() && x40.o().equals(c2848tTV)) {
                            x40.d(h50);
                            break;
                        }
                        size--;
                    }
                }
            }
            linkedList.add(new X40(h50));
            hashSet.add(c2848tTV);
        }
        return linkedList;
    }

    public C1609gi0 t() {
        int iE = this.l.e(3);
        if (iE == 0) {
            return null;
        }
        H50 h50 = this.m[3].get(iE - 1);
        if (h50.m != 250) {
            return null;
        }
        return (C1609gi0) h50;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        C3141wV c3141wVM = m();
        if (c3141wVM != null) {
            sb.append(this.l.x(o()));
            sb.append("\n\n");
            c3141wVM.a0(sb);
            sb.append('\n');
        } else {
            sb.append(this.l);
            sb.append('\n');
        }
        if (u()) {
            sb.append(";; TSIG ");
            if (v()) {
                sb.append("ok");
            } else {
                sb.append("invalid");
            }
            sb.append('\n');
        }
        for (int i = 0; i < 4; i++) {
            if (this.l.m() != 5) {
                sb.append(";; ");
                sb.append(C1399eb0.a(i));
                sb.append(":\n");
            } else {
                sb.append(";; ");
                sb.append(C1399eb0.c(i));
                sb.append(":\n");
            }
            D(sb, i);
            sb.append("\n");
        }
        sb.append(";; Message size: ");
        sb.append(y());
        sb.append(" bytes");
        return sb.toString();
    }

    public boolean u() {
        int i = this.u;
        return i == 3 || i == 1 || i == 4;
    }

    public boolean v() {
        return this.u == 1;
    }

    public int y() {
        return this.n;
    }

    public void z(int i) {
        this.m[i] = null;
        this.l.r(i, 0);
    }

    public AQ(int i) {
        this(new C1763iB(i));
    }

    public AQ() {
        this(new C1763iB());
    }

    public AQ(C0474Hi c0474Hi) throws Rw0 {
        this(new C1763iB(c0474Hi));
        boolean z2 = this.l.m() == 5;
        boolean zG = this.l.g(6);
        for (int i = 0; i < 4; i++) {
            try {
                int iE = this.l.e(i);
                if (iE > 0) {
                    this.m[i] = new ArrayList(iE);
                }
                for (int i2 = 0; i2 < iE; i2++) {
                    int iB = c0474Hi.b();
                    H50 h50Q = H50.q(c0474Hi, i, z2);
                    this.m[i].add(h50Q);
                    if (i == 3) {
                        if (h50Q.y() == 250) {
                            this.t = iB;
                            if (i2 != iE - 1) {
                                throw new Rw0("TSIG is not the last record in the message");
                            }
                        }
                        if (h50Q.y() == 24 && ((C1174c90) h50Q).c0() == 0) {
                            this.v = iB;
                        }
                    }
                }
            } catch (Rw0 e) {
                if (!zG) {
                    throw e;
                }
            }
        }
        this.n = c0474Hi.b();
    }

    public AQ(byte[] bArr) {
        this(new C0474Hi(bArr));
    }

    public AQ(ByteBuffer byteBuffer) {
        this(new C0474Hi(byteBuffer));
    }
}
