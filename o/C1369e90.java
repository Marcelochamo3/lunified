package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import lombok.Generated;

/* JADX INFO: renamed from: o.e90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1369e90 {

    @Generated
    private static final CL h = DL.d(C1369e90.class);
    private static final int i = 3;
    private static final int j = 16;
    private static final int k = 4;
    private final C1763iB a;
    private H50 b;
    private C3141wV c;
    private final List<C1761i90>[] d;
    private EnumC1887jb0 e;
    private String f;
    private int g;

    public C1369e90(C1763iB c1763iB) {
        this.g = -1;
        this.d = new List[3];
        this.a = c1763iB;
        this.e = EnumC1887jb0.UNCHECKED;
    }

    private void a(C1761i90 c1761i90, int i2) {
        b(i2);
        if (c1761i90.getType() == 41) {
            this.c = (C3141wV) c1761i90.m();
        } else {
            l(i2).add(c1761i90);
        }
    }

    private void b(int i2) {
        if (i2 <= 0 || i2 > 3) {
            throw new IllegalArgumentException("Invalid section");
        }
    }

    public C1761i90 c(C2848tT c2848tT, int i2, int i3) {
        return d(c2848tT, i2, i3, 1);
    }

    public C1761i90 d(C2848tT c2848tT, int i2, int i3, int i4) {
        b(i4);
        for (C1761i90 c1761i90 : l(i4)) {
            if (c1761i90.o().equals(c2848tT) && c1761i90.getType() == i2 && c1761i90.n() == i3) {
                return c1761i90;
            }
        }
        return null;
    }

    public String e() {
        return this.f;
    }

    public int f(int i2) {
        if (i2 == 0) {
            return 1;
        }
        List<C1761i90> listL = l(i2);
        int iT = 0;
        if (listL.isEmpty()) {
            return 0;
        }
        Iterator<C1761i90> it = listL.iterator();
        while (it.hasNext()) {
            iT += it.next().t();
        }
        return iT;
    }

    public int g() {
        return this.g;
    }

    public C1763iB h() {
        return this.a;
    }

    public AQ i() {
        AQ aq = new AQ(this.a.k());
        C1763iB c1763iBK = aq.k();
        c1763iBK.v(this.a.m());
        c1763iBK.w(this.a.n());
        for (int i2 = 0; i2 < 16; i2++) {
            if (C3285xv.a(i2) && this.a.g(i2)) {
                c1763iBK.t(i2);
            }
        }
        H50 h50 = this.b;
        if (h50 != null) {
            aq.b(h50, 0);
        }
        for (int i3 = 1; i3 <= 3; i3++) {
            for (C1761i90 c1761i90 : l(i3)) {
                Iterator<H50> it = c1761i90.q().iterator();
                while (it.hasNext()) {
                    aq.b(it.next(), i3);
                }
                Iterator<W40> it2 = c1761i90.s().iterator();
                while (it2.hasNext()) {
                    aq.b(it2.next(), i3);
                }
            }
        }
        C3141wV c3141wV = this.c;
        if (c3141wV != null) {
            aq.b(c3141wV, 3);
        }
        return aq;
    }

    public H50 j() {
        return this.b;
    }

    public int k() {
        int iN = this.a.n();
        C3141wV c3141wV = this.c;
        return c3141wV != null ? iN + (c3141wV.U() << 4) : iN;
    }

    public List<C1761i90> l(int i2) {
        b(i2);
        List<C1761i90>[] listArr = this.d;
        int i3 = i2 - 1;
        if (listArr[i3] == null) {
            listArr[i3] = new LinkedList();
        }
        return this.d[i3];
    }

    public List<C1761i90> m(int i2, int i3) {
        List<C1761i90> listL = l(i2);
        if (listL.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(listL.size());
        for (C1761i90 c1761i90 : listL) {
            if (c1761i90.getType() == i3) {
                arrayList.add(c1761i90);
            }
        }
        return arrayList;
    }

    public EnumC1887jb0 n() {
        return this.e;
    }

    public void o(String str) {
        r(EnumC1887jb0.BOGUS, 6, str);
    }

    public void p(String str, int i2) {
        r(EnumC1887jb0.BOGUS, i2, str);
    }

    public void q(EnumC1887jb0 enumC1887jb0, int i2) {
        r(enumC1887jb0, i2, null);
    }

    public void r(EnumC1887jb0 enumC1887jb0, int i2, String str) {
        this.e = enumC1887jb0;
        this.g = i2;
        this.f = str;
        if (str != null) {
            h.C(str, "Setting bad reason for message to {}");
        }
    }

    public C1369e90(int i2, H50 h50) {
        this(new C1763iB(i2));
        this.b = h50;
    }

    public C1369e90(AQ aq) {
        this(aq.k());
        this.b = aq.n();
        this.c = aq.m();
        for (int i2 = 1; i2 <= 3; i2++) {
            Iterator<X40> it = aq.s(i2).iterator();
            while (it.hasNext()) {
                a(new C1761i90(it.next()), i2);
            }
        }
    }
}
