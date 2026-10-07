package o;

import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: o.ay0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1055ay0 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f686o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1055ay0(String str, int i, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = str;
        this.f686o = i;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C1055ay0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C1055ay0(this.n, this.f686o, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0041 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    /* JADX WARN: Code duplicated, block: B:24:0x0057 A[LOOP:0: B:22:0x0051->B:24:0x0057, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x006d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0093  */
    @Override // o.R7
    public final Object r(Object obj) {
        Mx0 mx0;
        String str;
        boolean zO;
        int i;
        C3421zK c3421zK;
        Iterator it;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = this.m;
        if (i2 != 0) {
            if (i2 == 1) {
                Jp0.O(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Jp0.O(obj);
            }
            mx0 = (Mx0) obj;
            str = this.n;
            zO = AbstractC1899jh0.O(str);
            i = this.f686o;
            if (zO) {
                String string = AbstractC1119bh0.E0(str).toString();
                Locale locale = Locale.ROOT;
                C1732hv c1732hv = new C1732hv(AbstractC0911Ye.U(mx0.b), true, new C5(AbstractC1701hf0.i(locale, "ROOT", string, locale, "toLowerCase(...)"), 9));
                if (i < 1) {
                    i = 1;
                }
                return Vb0.Q(Vb0.M(Vb0.P(Vb0.H(c1732hv, (i - 1) * 100), 100), Iu0.u));
            }
            if (i > 1) {
                return C1233cq.l;
            }
            c3421zK = new C3421zK();
            it = mx0.a.iterator();
            while (it.hasNext()) {
                String str2 = ((Nx0) it.next()).b;
                c3421zK.add(new C2420oz(str2, str2));
            }
            return AbstractC2506pt.h(c3421zK);
        }
        Jp0.O(obj);
        Lx0 lx0 = Lx0.b;
        this.m = 1;
        if (lx0.A(this) == enumC1706hi) {
            return enumC1706hi;
        }
        C1152by0 c1152by0 = C1152by0.b;
        this.m = 2;
        obj = C1152by0.q(c1152by0, this);
        if (obj == enumC1706hi) {
            return enumC1706hi;
        }
        mx0 = (Mx0) obj;
        str = this.n;
        zO = AbstractC1899jh0.O(str);
        i = this.f686o;
        if (zO) {
            String string2 = AbstractC1119bh0.E0(str).toString();
            Locale locale2 = Locale.ROOT;
            C1732hv c1732hv2 = new C1732hv(AbstractC0911Ye.U(mx0.b), true, new C5(AbstractC1701hf0.i(locale2, "ROOT", string2, locale2, "toLowerCase(...)"), 9));
            if (i < 1) {
                i = 1;
            }
            return Vb0.Q(Vb0.M(Vb0.P(Vb0.H(c1732hv2, (i - 1) * 100), 100), Iu0.u));
        }
        if (i > 1) {
            return C1233cq.l;
        }
        c3421zK = new C3421zK();
        it = mx0.a.iterator();
        while (it.hasNext()) {
            String str3 = ((Nx0) it.next()).b;
            c3421zK.add(new C2420oz(str3, str3));
        }
        return AbstractC2506pt.h(c3421zK);
    }
}
