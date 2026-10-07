package o;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: o.fc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1498fc extends AbstractC2144m60 {
    public final InterfaceC2604qt0 u;
    public final Context v;
    public C0882Xb w;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1498fc(InterfaceC2604qt0 interfaceC2604qt0) {
        View viewB = interfaceC2604qt0.b();
        super(viewB);
        this.u = interfaceC2604qt0;
        this.v = viewB.getContext();
    }

    public final C1205cc u(C3300y3 c3300y3) {
        Object next;
        Q30 q30;
        String strB = Cr0.m.b();
        if (AbstractC1474fG.b(strB, "PPV.TO")) {
            q30 = QW.b;
        } else {
            Q30.a.getClass();
            Iterator it = P30.b.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AbstractC1474fG.b(((Q30) next).getName(), strB));
            Q30 q31 = (Q30) next;
            q30 = q31 == null ? C1816io0.b : q31;
        }
        if (!(q30 instanceof C1816io0)) {
            return null;
        }
        C0882Xb c0882Xb = this.w;
        if (c0882Xb == null) {
            AbstractC1474fG.U("category");
            throw null;
        }
        List list = c0882Xb.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C1387eR) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (AbstractC1899jh0.U(((C1387eR) it2.next()).a, "fctvevent-", false)) {
                    return null;
                }
            }
        }
        List list2 = (List) C1816io0.e.get(c0882Xb.a);
        if (list2 == null) {
            list2 = C1233cq.l;
        }
        List list3 = list2;
        if (list3.isEmpty() || c0882Xb.e >= list3.size()) {
            return null;
        }
        return new C1205cc(c0882Xb, list3, c3300y3, this, 0);
    }

    public final RecyclerView v() {
        InterfaceC2604qt0 interfaceC2604qt0 = this.u;
        if (interfaceC2604qt0 instanceof C2835tG) {
            return ((C2835tG) interfaceC2604qt0).m;
        }
        if (interfaceC2604qt0 instanceof C3029vG) {
            return ((C3029vG) interfaceC2604qt0).m;
        }
        if (interfaceC2604qt0 instanceof C0913Yg) {
            View childAt = ((C0913Yg) interfaceC2604qt0).n.getChildAt(0);
            if (childAt instanceof RecyclerView) {
                return (RecyclerView) childAt;
            }
        }
        return null;
    }
}
