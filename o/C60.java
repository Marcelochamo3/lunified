package o;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class C60 extends AbstractC3177wp0 {
    public final Map a;

    public C60(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    @Override // o.AbstractC3177wp0
    public final Object a(WH wh) throws IOException {
        if (wh.j0() == 9) {
            wh.f0();
            return null;
        }
        Object objC = c();
        try {
            wh.f();
            while (wh.W()) {
                B60 b60 = (B60) this.a.get(wh.d0());
                if (b60 == null || !b60.e) {
                    wh.p0();
                } else {
                    e(objC, wh, b60);
                }
            }
            wh.q();
            return d(objC);
        } catch (IllegalAccessException e) {
            AbstractC2506pt abstractC2506pt = A60.a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (IllegalStateException e2) {
            throw new XH(e2);
        }
    }

    @Override // o.AbstractC3177wp0
    public final void b(C1183cI c1183cI, Object obj) throws IOException {
        if (obj == null) {
            c1183cI.Q();
            return;
        }
        c1183cI.i();
        try {
            Iterator it = this.a.values().iterator();
            while (it.hasNext()) {
                ((B60) it.next()).a(c1183cI, obj);
            }
            c1183cI.q();
        } catch (IllegalAccessException e) {
            AbstractC2506pt abstractC2506pt = A60.a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        }
    }

    public abstract Object c();

    public abstract Object d(Object obj);

    public abstract void e(Object obj, WH wh, B60 b60);
}
