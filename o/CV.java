package o;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class CV extends AbstractC3177wp0 {
    public static final InterfaceC3274xp0 c = new BV(EnumC1417ek0.l);
    public final BA a;
    public final EnumC1417ek0 b;

    public CV(BA ba, EnumC1417ek0 enumC1417ek0) {
        this.a = ba;
        this.b = enumC1417ek0;
    }

    public static InterfaceC3274xp0 c(C1027ak0 c1027ak0) {
        return c1027ak0 == EnumC1417ek0.l ? c : new BV(c1027ak0);
    }

    @Override // o.AbstractC3177wp0
    public final Object a(WH wh) throws IOException {
        Object arrayList;
        Serializable arrayList2;
        int iJ0 = wh.j0();
        int iW = AbstractC1701hf0.w(iJ0);
        if (iW == 0) {
            wh.a();
            arrayList = new ArrayList();
        } else if (iW != 2) {
            arrayList = null;
        } else {
            wh.f();
            arrayList = new C3227xK(true);
        }
        if (arrayList == null) {
            return d(wh, iJ0);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (wh.W()) {
                String strD0 = arrayList instanceof Map ? wh.d0() : null;
                int iJ1 = wh.j0();
                int iW2 = AbstractC1701hf0.w(iJ1);
                if (iW2 == 0) {
                    wh.a();
                    arrayList2 = new ArrayList();
                } else if (iW2 != 2) {
                    arrayList2 = null;
                } else {
                    wh.f();
                    arrayList2 = new C3227xK(true);
                }
                boolean z = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = d(wh, iJ1);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(strD0, arrayList2);
                }
                if (z) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    wh.p();
                } else {
                    wh.q();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    @Override // o.AbstractC3177wp0
    public final void b(C1183cI c1183cI, Object obj) throws IOException {
        if (obj == null) {
            c1183cI.Q();
            return;
        }
        Class<?> cls = obj.getClass();
        BA ba = this.a;
        ba.getClass();
        AbstractC3177wp0 abstractC3177wp0E = ba.e(new Kp0(cls));
        if (!(abstractC3177wp0E instanceof CV)) {
            abstractC3177wp0E.b(c1183cI, obj);
        } else {
            c1183cI.i();
            c1183cI.q();
        }
    }

    public final Serializable d(WH wh, int i) throws IOException {
        int iW = AbstractC1701hf0.w(i);
        if (iW == 5) {
            return wh.h0();
        }
        if (iW == 6) {
            return this.b.a(wh);
        }
        if (iW == 7) {
            return Boolean.valueOf(wh.Z());
        }
        if (iW != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(AbstractC1701hf0.E(i)));
        }
        wh.f0();
        return null;
    }
}
