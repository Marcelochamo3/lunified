package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: o.ok, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2391ok extends AbstractC0647Oa {
    public final Executor a;

    public C2391ok(F2 f2) {
        this.a = f2;
    }

    @Override // o.AbstractC0647Oa
    public final InterfaceC0673Pa a(Type type, Annotation[] annotationArr) {
        if (UK.w(type) != InterfaceC0621Na.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new C2720s4(UK.u(0, (ParameterizedType) type), 18, UK.A(annotationArr, InterfaceC2670re0.class) ? null : this.a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
