package o;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: o.t80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2826t80 implements InvocationHandler {
    public final Object[] a = new Object[0];
    public final /* synthetic */ Class b;
    public final /* synthetic */ C2923u80 c;

    public C2826t80(C2923u80 c2923u80, Class cls) {
        this.c = c2923u80;
        this.b = cls;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (method.getDeclaringClass() == Object.class) {
            return method.invoke(this, objArr);
        }
        if (objArr == null) {
            objArr = this.a;
        }
        C2743sL c2743sL = WY.b;
        boolean zU = c2743sL.u(method);
        Class cls = this.b;
        if (zU) {
            return c2743sL.s(method, cls, obj, objArr);
        }
        AbstractC2252nE abstractC2252nEC = this.c.c(cls, method);
        return abstractC2252nEC.a(new MV(abstractC2252nEC.a, obj, objArr, abstractC2252nEC.b, abstractC2252nEC.c), objArr);
    }
}
