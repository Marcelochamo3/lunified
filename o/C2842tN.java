package o;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: o.tN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2842tN extends AbstractC3177wp0 {
    public final C3371yp0 a;
    public final C3371yp0 b;
    public final InterfaceC3432zV c;
    public final /* synthetic */ C2939uN d;

    public C2842tN(C2939uN c2939uN, BA ba, Type type, AbstractC3177wp0 abstractC3177wp0, Type type2, AbstractC3177wp0 abstractC3177wp1, InterfaceC3432zV interfaceC3432zV) {
        this.d = c2939uN;
        this.a = new C3371yp0(ba, abstractC3177wp0, type);
        this.b = new C3371yp0(ba, abstractC3177wp1, type2);
        this.c = interfaceC3432zV;
    }

    @Override // o.AbstractC3177wp0
    public final Object a(WH wh) throws IOException {
        int iJ0 = wh.j0();
        if (iJ0 == 9) {
            wh.f0();
            return null;
        }
        Map map = (Map) this.c.M();
        C3371yp0 c3371yp0 = this.b;
        C3371yp0 c3371yp1 = this.a;
        if (iJ0 == 1) {
            wh.a();
            while (wh.W()) {
                wh.a();
                Object objA = ((AbstractC3177wp0) c3371yp1.c).a(wh);
                if (map.put(objA, ((AbstractC3177wp0) c3371yp0.c).a(wh)) != null) {
                    throw new XH("duplicate key: " + objA);
                }
                wh.p();
            }
            wh.p();
        } else {
            wh.f();
            while (wh.W()) {
                O9.v.getClass();
                O9.B(wh);
                Object objA2 = ((AbstractC3177wp0) c3371yp1.c).a(wh);
                if (map.put(objA2, ((AbstractC3177wp0) c3371yp0.c).a(wh)) != null) {
                    throw new XH("duplicate key: " + objA2);
                }
            }
            wh.q();
        }
        return map;
    }

    @Override // o.AbstractC3177wp0
    public final void b(C1183cI c1183cI, Object obj) throws IOException {
        String strH;
        Map map = (Map) obj;
        if (map == null) {
            c1183cI.Q();
            return;
        }
        boolean z = this.d.m;
        C3371yp0 c3371yp0 = this.b;
        if (!z) {
            c1183cI.i();
            for (Map.Entry entry : map.entrySet()) {
                c1183cI.t(String.valueOf(entry.getKey()));
                c3371yp0.b(c1183cI, entry.getValue());
            }
            c1183cI.q();
            return;
        }
        ArrayList arrayList = new ArrayList(map.size());
        ArrayList arrayList2 = new ArrayList(map.size());
        int i = 0;
        boolean z2 = false;
        for (Map.Entry entry2 : map.entrySet()) {
            Object key = entry2.getKey();
            C3371yp0 c3371yp1 = this.a;
            c3371yp1.getClass();
            try {
                C1086bI c1086bI = new C1086bI();
                c3371yp1.b(c1086bI, key);
                ArrayList arrayList3 = c1086bI.x;
                if (!arrayList3.isEmpty()) {
                    throw new IllegalStateException("Expected one JSON element but was " + arrayList3);
                }
                QH qh = c1086bI.z;
                arrayList.add(qh);
                arrayList2.add(entry2.getValue());
                qh.getClass();
                z2 |= (qh instanceof OH) || (qh instanceof TH);
            } catch (IOException e) {
                throw new RH(e);
            }
        }
        if (z2) {
            c1183cI.f();
            int size = arrayList.size();
            while (i < size) {
                c1183cI.f();
                QH qh2 = (QH) arrayList.get(i);
                InterfaceC3274xp0 interfaceC3274xp0 = Hp0.a;
                C3411zA.d(c1183cI, qh2);
                c3371yp0.b(c1183cI, arrayList2.get(i));
                c1183cI.p();
                i++;
            }
            c1183cI.p();
            return;
        }
        c1183cI.i();
        int size2 = arrayList.size();
        while (i < size2) {
            QH qh3 = (QH) arrayList.get(i);
            qh3.getClass();
            if (qh3 instanceof VH) {
                VH vhG = qh3.g();
                Serializable serializable = vhG.l;
                if (serializable instanceof Number) {
                    strH = String.valueOf(vhG.i());
                } else if (serializable instanceof Boolean) {
                    strH = Boolean.toString(vhG.a());
                } else {
                    if (!(serializable instanceof String)) {
                        throw new AssertionError();
                    }
                    strH = vhG.h();
                }
            } else {
                if (!(qh3 instanceof SH)) {
                    throw new AssertionError();
                }
                strH = "null";
            }
            c1183cI.t(strH);
            c3371yp0.b(c1183cI, arrayList2.get(i));
            i++;
        }
        c1183cI.q();
    }
}
