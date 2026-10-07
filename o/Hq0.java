package o;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class Hq0 extends Jq0 {
    public final /* synthetic */ Method b;

    public Hq0(Method method) {
        this.b = method;
    }

    @Override // o.Jq0
    public final Object a(Class cls) {
        String strA = C1797ie0.a(cls);
        if (strA == null) {
            return this.b.invoke(null, cls, Object.class);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strA));
    }
}
