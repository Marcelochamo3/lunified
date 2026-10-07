package o;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class Fq0 extends Jq0 {
    public final /* synthetic */ Method b;
    public final /* synthetic */ Object c;

    public Fq0(Method method, Object obj) {
        this.b = method;
        this.c = obj;
    }

    @Override // o.Jq0
    public final Object a(Class cls) {
        String strA = C1797ie0.a(cls);
        if (strA == null) {
            return this.b.invoke(this.c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strA));
    }
}
