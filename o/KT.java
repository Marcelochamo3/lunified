package o;

import android.os.Bundle;
import androidx.preference.Preference;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class KT extends AbstractC3226xJ implements InterfaceC0412Ey {
    public final /* synthetic */ int m;
    public final /* synthetic */ Serializable n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f360o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ KT(Serializable serializable, Object obj, Object obj2, Object obj3, int i) {
        super(1);
        this.m = i;
        this.n = serializable;
        this.f360o = obj;
        this.p = obj2;
        this.q = obj3;
    }

    @Override // o.InterfaceC0412Ey
    public final Object b(Object obj) {
        switch (this.m) {
            case 0:
                DT dt = (DT) obj;
                AbstractC1474fG.j(dt, "it");
                ((C2532q60) this.n).l = true;
                ((YT) this.f360o).a((TT) this.p, (Bundle) this.q, dt, C1233cq.l);
                return C2985uq0.a;
            default:
                Set set = (Set) obj;
                AbstractC1474fG.j(set, "indices");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(((String[]) this.n)[((Number) it.next()).intValue()]);
                }
                Q30.a.getClass();
                List list = P30.b;
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    linkedHashSet2.add(((Q30) it2.next()).getName());
                }
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                for (Object obj2 : linkedHashSet) {
                    if (linkedHashSet2.contains((String) obj2)) {
                        linkedHashSet3.add(obj2);
                    }
                }
                if (!(!linkedHashSet3.isEmpty())) {
                    throw new IllegalArgumentException("Debe quedar al menos un proveedor visible".toString());
                }
                Cr0.E.e(2);
                Cr0.D.g(linkedHashSet3);
                UK.i((Preference) this.f360o, (List) this.q, (S20) this.p);
                return C2985uq0.a;
        }
    }
}
