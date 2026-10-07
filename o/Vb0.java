package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class Vb0 extends Wb0 {
    public static Rb0 G(Iterator it) {
        AbstractC1474fG.j(it, "<this>");
        Y5 y5 = new Y5(3, it);
        return y5 instanceof C0368Dg ? y5 : new C0368Dg(y5);
    }

    public static Rb0 H(Rb0 rb0, int i) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC1674hK.p("Requested element count ", i, " is less than zero.").toString());
        }
        if (i == 0) {
            return rb0;
        }
        return rb0 instanceof InterfaceC0791To ? ((InterfaceC0791To) rb0).b(i) : new C0765So(rb0, i, 0);
    }

    public static Object I(Rb0 rb0) {
        Iterator it = rb0.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static final C3479zv J(Rb0 rb0, InterfaceC0412Ey interfaceC0412Ey) {
        if (!(rb0 instanceof C3074vm0)) {
            return new C3479zv(rb0, X10.u, interfaceC0412Ey);
        }
        C3074vm0 c3074vm0 = (C3074vm0) rb0;
        return new C3479zv(c3074vm0.a, c3074vm0.b, interfaceC0412Ey);
    }

    public static Rb0 K(Object obj, InterfaceC0412Ey interfaceC0412Ey) {
        return obj == null ? C1624gq.a : new C0927Yu(new io.sentry.android.replay.f(19, obj), 1, interfaceC0412Ey);
    }

    public static String L(Rb0 rb0, String str) {
        AbstractC1474fG.j(rb0, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (Object obj : rb0) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) str);
            }
            AbstractC3021v9.b(sb, obj, null);
        }
        sb.append((CharSequence) "");
        String string = sb.toString();
        AbstractC1474fG.i(string, "toString(...)");
        return string;
    }

    public static C3074vm0 M(Rb0 rb0, InterfaceC0412Ey interfaceC0412Ey) {
        AbstractC1474fG.j(rb0, "<this>");
        return new C3074vm0(rb0, interfaceC0412Ey);
    }

    public static C1732hv N(Rb0 rb0, InterfaceC0412Ey interfaceC0412Ey) {
        return new C1732hv(new C3074vm0(rb0, interfaceC0412Ey), false, X10.w);
    }

    public static Rb0 O(Object... objArr) {
        int length = objArr.length;
        C1624gq c1624gq = C1624gq.a;
        return (length == 0 || objArr.length == 0) ? c1624gq : new Y5(0, objArr);
    }

    public static Rb0 P(Rb0 rb0, int i) {
        AbstractC1474fG.j(rb0, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC1674hK.p("Requested element count ", i, " is less than zero.").toString());
        }
        if (i == 0) {
            return C1624gq.a;
        }
        return rb0 instanceof InterfaceC0791To ? ((InterfaceC0791To) rb0).a(i) : new C0765So(rb0, i, 1);
    }

    public static List Q(Rb0 rb0) {
        AbstractC1474fG.j(rb0, "<this>");
        Iterator it = rb0.iterator();
        if (!it.hasNext()) {
            return C1233cq.l;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC2506pt.A(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static Set R(C3074vm0 c3074vm0) {
        Iterator it = c3074vm0.a.iterator();
        if (!it.hasNext()) {
            return C1722hq.l;
        }
        Object next = it.next();
        InterfaceC0412Ey interfaceC0412Ey = c3074vm0.b;
        Object objB = interfaceC0412Ey.b(next);
        if (!it.hasNext()) {
            return AbstractC1370eA.O(objB);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(objB);
        while (it.hasNext()) {
            linkedHashSet.add(interfaceC0412Ey.b(it.next()));
        }
        return linkedHashSet;
    }
}
