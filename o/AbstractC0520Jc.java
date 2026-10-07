package o;

import java.util.ArrayList;

/* JADX INFO: renamed from: o.Jc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0520Jc implements InterfaceC1538fw {
    public final InterfaceC1022ai l;
    public final int m;
    public final int n;

    public AbstractC0520Jc(InterfaceC1022ai interfaceC1022ai, int i, int i2) {
        this.l = interfaceC1022ai;
        this.m = i;
        this.n = i2;
    }

    @Override // o.InterfaceC1538fw
    public Object a(InterfaceC1734hw interfaceC1734hw, InterfaceC0473Hh interfaceC0473Hh) {
        Object objN = zy0.n(new C0468Hc(interfaceC1734hw, this, null), interfaceC0473Hh);
        return objN == EnumC1706hi.l ? objN : C2985uq0.a;
    }

    public String b() {
        return null;
    }

    public abstract Object c(InterfaceC2622r30 interfaceC2622r30, InterfaceC0473Hh interfaceC0473Hh);

    public G50 d(InterfaceC1608gi interfaceC1608gi) {
        int i = this.m;
        if (i == -3) {
            i = -2;
        }
        InterfaceC0775Sy c0494Ic = new C0494Ic(this, null);
        C2526q30 c2526q30 = new C2526q30(AbstractC1923jt0.t(interfaceC1608gi, this.l), UK.a(i, this.n, 4));
        c2526q30.k0(3, c2526q30, c0494Ic);
        return c2526q30;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strB = b();
        if (strB != null) {
            arrayList.add(strB);
        }
        C1038aq c1038aq = C1038aq.l;
        InterfaceC1022ai interfaceC1022ai = this.l;
        if (interfaceC1022ai != c1038aq) {
            arrayList.add("context=" + interfaceC1022ai);
        }
        int i = this.m;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        int i2 = this.n;
        if (i2 != 1) {
            arrayList.add("onBufferOverflow=".concat(AbstractC1701hf0.x(i2)));
        }
        return getClass().getSimpleName() + '[' + AbstractC0911Ye.h0(arrayList, ", ", null, null, null, 62) + ']';
    }
}
