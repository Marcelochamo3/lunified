package o;

/* JADX INFO: renamed from: o.pf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2478pf extends AbstractC3226xJ implements InterfaceC0775Sy {
    public static final C2478pf n = new C2478pf(2, 0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C2478pf f976o = new C2478pf(2, 1);
    public static final C2478pf p = new C2478pf(2, 2);
    public static final C2478pf q = new C2478pf(2, 3);
    public static final C2478pf r = new C2478pf(2, 4);
    public static final C2478pf s = new C2478pf(2, 5);
    public static final C2478pf t = new C2478pf(2, 6);
    public static final C2478pf u = new C2478pf(2, 7);
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2478pf(int i, int i2) {
        super(i);
        this.m = i2;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        C2671rf c2671rf;
        switch (this.m) {
            case 0:
                String str = (String) obj;
                InterfaceC0914Yh interfaceC0914Yh = (InterfaceC0914Yh) obj2;
                AbstractC1474fG.j(str, "acc");
                AbstractC1474fG.j(interfaceC0914Yh, "element");
                if (str.length() == 0) {
                    return interfaceC0914Yh.toString();
                }
                return str + ", " + interfaceC0914Yh;
            case 1:
                InterfaceC1022ai interfaceC1022ai = (InterfaceC1022ai) obj;
                InterfaceC0914Yh interfaceC0914Yh2 = (InterfaceC0914Yh) obj2;
                AbstractC1474fG.j(interfaceC1022ai, "acc");
                AbstractC1474fG.j(interfaceC0914Yh2, "element");
                InterfaceC1022ai interfaceC1022aiP = interfaceC1022ai.p(interfaceC0914Yh2.getKey());
                C1038aq c1038aq = C1038aq.l;
                if (interfaceC1022aiP == c1038aq) {
                    return interfaceC0914Yh2;
                }
                C2691rp c2691rp = C2691rp.p;
                InterfaceC0525Jh interfaceC0525Jh = (InterfaceC0525Jh) interfaceC1022aiP.q(c2691rp);
                if (interfaceC0525Jh == null) {
                    c2671rf = new C2671rf(interfaceC0914Yh2, interfaceC1022aiP);
                } else {
                    InterfaceC1022ai interfaceC1022aiP2 = interfaceC1022aiP.p(c2691rp);
                    if (interfaceC1022aiP2 == c1038aq) {
                        return new C2671rf(interfaceC0525Jh, interfaceC0914Yh2);
                    }
                    c2671rf = new C2671rf(interfaceC0525Jh, new C2671rf(interfaceC0914Yh2, interfaceC1022aiP2));
                }
                return c2671rf;
            case 2:
                return ((InterfaceC1022ai) obj).Q((InterfaceC0914Yh) obj2);
            case 3:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 4:
                return Integer.valueOf(((Number) obj).intValue() + 1);
            case 5:
                InterfaceC0914Yh interfaceC0914Yh3 = (InterfaceC0914Yh) obj2;
                if (!(interfaceC0914Yh3 instanceof InterfaceC1318dj0)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? interfaceC0914Yh3 : Integer.valueOf(iIntValue + 1);
            case 6:
                InterfaceC1318dj0 interfaceC1318dj0 = (InterfaceC1318dj0) obj;
                InterfaceC0914Yh interfaceC0914Yh4 = (InterfaceC0914Yh) obj2;
                if (interfaceC1318dj0 != null) {
                    return interfaceC1318dj0;
                }
                if (interfaceC0914Yh4 instanceof InterfaceC1318dj0) {
                    return (InterfaceC1318dj0) interfaceC0914Yh4;
                }
                return null;
            case 7:
                return (C1611gj0) obj;
            default:
                return ((InterfaceC1022ai) obj).Q((InterfaceC0914Yh) obj2);
        }
    }
}
