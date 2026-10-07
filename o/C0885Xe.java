package o;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;

/* JADX INFO: renamed from: o.Xe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0885Xe implements InterfaceC3274xp0 {
    public final C1797ie0 l;

    public C0885Xe(C1797ie0 c1797ie0) {
        this.l = c1797ie0;
    }

    @Override // o.InterfaceC3274xp0
    public final AbstractC3177wp0 b(BA ba, Kp0 kp0) {
        Type type = kp0.b;
        Class cls = kp0.a;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        U9.c(Collection.class.isAssignableFrom(cls));
        Type typeP = UK.P(type, cls, UK.r(type, cls, Collection.class), new HashMap());
        Type type2 = typeP instanceof ParameterizedType ? ((ParameterizedType) typeP).getActualTypeArguments()[0] : Object.class;
        return new W5(ba, type2, ba.e(new Kp0(type2)), this.l.e(kp0));
    }
}
