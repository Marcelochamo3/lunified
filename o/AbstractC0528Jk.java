package o;

/* JADX INFO: renamed from: o.Jk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0528Jk {
    public static final InterfaceC1714hm a;

    static {
        String property;
        InterfaceC1714hm interfaceC1714hm;
        int i = Vh0.a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            C3362yl c3362yl = AbstractC1910jn.a;
            InterfaceC1022ai interfaceC1022ai = FM.a;
            C1079bB c1079bB = ((C1079bB) interfaceC1022ai).q;
            interfaceC1714hm = !(interfaceC1022ai instanceof InterfaceC1714hm) ? RunnableC0502Ik.u : (InterfaceC1714hm) interfaceC1022ai;
        } else {
            interfaceC1714hm = RunnableC0502Ik.u;
        }
        a = interfaceC1714hm;
    }
}
