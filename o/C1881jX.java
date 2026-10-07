package o;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: renamed from: o.jX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1881jX extends Pu0 {
    public final /* synthetic */ int f = 1;
    public final Method g;
    public final int h;
    public final InterfaceC0602Mh i;
    public final Object j;

    public C1881jX(Method method, int i, InterfaceC0602Mh interfaceC0602Mh, String str) {
        this.g = method;
        this.h = i;
        this.i = interfaceC0602Mh;
        this.j = str;
    }

    @Override // o.Pu0
    public final void a(C2534q70 c2534q70, Object obj) {
        InterfaceC0602Mh interfaceC0602Mh = this.i;
        Object obj2 = this.j;
        Method method = this.g;
        int i = this.h;
        switch (this.f) {
            case 0:
                if (obj == null) {
                    return;
                }
                try {
                    c2534q70.c((C2152mB) obj2, (AbstractC2340o70) interfaceC0602Mh.l(obj));
                    return;
                } catch (IOException e) {
                    throw UK.M(method, i, "Unable to convert " + obj + " to RequestBody", e);
                }
            default:
                Map map = (Map) obj;
                if (map == null) {
                    throw UK.M(method, i, "Part map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw UK.M(method, i, "Part map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw UK.M(method, i, AbstractC1701hf0.u("Part map contained null value for key '", str, "'."), new Object[0]);
                    }
                    c2534q70.c(AbstractC1468fA.v("Content-Disposition", AbstractC1701hf0.u("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", (String) obj2), (AbstractC2340o70) interfaceC0602Mh.l(value));
                }
                return;
        }
    }

    public C1881jX(Method method, int i, C2152mB c2152mB, InterfaceC0602Mh interfaceC0602Mh) {
        this.g = method;
        this.h = i;
        this.j = c2152mB;
        this.i = interfaceC0602Mh;
    }
}
