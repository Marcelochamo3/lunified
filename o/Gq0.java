package o;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class Gq0 extends Jq0 {
    public final /* synthetic */ Method b;
    public final /* synthetic */ int c;

    public Gq0(Method method, int i) {
        this.b = method;
        this.c = i;
    }

    @Override // o.Jq0
    public final Object a(Class cls) {
        String strA = C1797ie0.a(cls);
        if (strA == null) {
            return this.b.invoke(null, cls, Integer.valueOf(this.c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strA));
    }
}
