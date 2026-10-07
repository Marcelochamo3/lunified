package o;

import java.util.IdentityHashMap;

/* JADX INFO: renamed from: o.Vq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0845Vq extends AbstractC1332dr {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public AbstractC0845Vq(String str, String str2, boolean z) {
        this.a = 0;
        Sr0.u(str);
        Sr0.u(str2);
        this.b = AP.p(str);
        boolean z2 = (str2.startsWith("'") && str2.endsWith("'")) || (str2.startsWith("\"") && str2.endsWith("\""));
        str2 = z2 ? str2.substring(1, str2.length() - 1) : str2;
        String strO = (!z && z2) ? AP.o(str2) : AP.p(str2);
        this.c = strO;
    }

    @Override // o.AbstractC1332dr
    public void c() {
        switch (this.a) {
            case 1:
                ((IdentityHashMap) ((Zg0) this.c).get()).clear();
                break;
        }
    }

    public boolean d(C3176wp c3176wp, C3176wp c3176wp2) {
        IdentityHashMap identityHashMap = (IdentityHashMap) ((Zg0) this.c).get();
        IdentityHashMap identityHashMap2 = (IdentityHashMap) identityHashMap.get(c3176wp);
        if (identityHashMap2 == null) {
            identityHashMap2 = new IdentityHashMap();
            identityHashMap.put(c3176wp, identityHashMap2);
        }
        Boolean boolValueOf = (Boolean) identityHashMap2.get(c3176wp2);
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(((AbstractC1332dr) this.b).b(c3176wp, c3176wp2));
            identityHashMap2.put(c3176wp2, boolValueOf);
        }
        return boolValueOf.booleanValue();
    }

    public AbstractC0845Vq(AbstractC1332dr abstractC1332dr) {
        this.a = 1;
        this.c = new Zg0(new C1504ff(10), 1);
        this.b = abstractC1332dr;
    }
}
