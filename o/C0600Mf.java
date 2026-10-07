package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: o.Mf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0600Mf extends AbstractC0647Oa {
    @Override // o.AbstractC0647Oa
    public final InterfaceC0673Pa a(Type type, Annotation[] annotationArr) {
        if (UK.w(type) != F70.e()) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type typeU = UK.u(0, (ParameterizedType) type);
        if (UK.w(typeU) != C1759i80.class) {
            return new C0549Kf(0, typeU);
        }
        if (typeU instanceof ParameterizedType) {
            return new C0549Kf(1, UK.u(0, (ParameterizedType) typeU));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
