package o;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: o.te, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2863te {
    public final String a;
    public final ArrayList b;
    public final HashSet c;
    public final ArrayList d;
    public final ArrayList e;
    public final ArrayList f;

    public C2863te(String str) {
        AbstractC1474fG.j(str, "serialName");
        this.a = str;
        this.b = new ArrayList();
        this.c = new HashSet();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
    }

    public static void a(C2863te c2863te, String str, Zb0 zb0) {
        C1233cq c1233cq = C1233cq.l;
        c2863te.getClass();
        AbstractC1474fG.j(zb0, "descriptor");
        if (!c2863te.c.add(str)) {
            StringBuilder sbL = AbstractC1701hf0.l("Element with name '", str, "' is already registered in ");
            sbL.append(c2863te.a);
            throw new IllegalArgumentException(sbL.toString().toString());
        }
        c2863te.b.add(str);
        c2863te.d.add(zb0);
        c2863te.e.add(c1233cq);
        c2863te.f.add(false);
    }
}
