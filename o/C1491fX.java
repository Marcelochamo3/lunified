package o;

import java.io.IOException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: o.fX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1491fX extends Pu0 {
    public final Method f;
    public final int g;
    public final InterfaceC0602Mh h;

    public C1491fX(Method method, int i, InterfaceC0602Mh interfaceC0602Mh) {
        this.f = method;
        this.g = i;
        this.h = interfaceC0602Mh;
    }

    @Override // o.Pu0
    public final void a(C2534q70 c2534q70, Object obj) {
        int i = this.g;
        Method method = this.f;
        if (obj == null) {
            throw UK.M(method, i, "Body parameter value must not be null.", new Object[0]);
        }
        try {
            c2534q70.k = (AbstractC2340o70) this.h.l(obj);
        } catch (IOException e) {
            throw UK.N(method, e, i, "Unable to convert " + obj + " to RequestBody", new Object[0]);
        }
    }
}
