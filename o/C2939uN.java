package o;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: renamed from: o.uN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2939uN implements InterfaceC3274xp0 {
    public final C1797ie0 l;
    public final boolean m = false;

    public C2939uN(C1797ie0 c1797ie0) {
        this.l = c1797ie0;
    }

    @Override // o.InterfaceC3274xp0
    public final AbstractC3177wp0 b(BA ba, Kp0 kp0) {
        Type[] actualTypeArguments;
        Type type = kp0.b;
        Class cls = kp0.a;
        if (!Map.class.isAssignableFrom(cls)) {
            return null;
        }
        if (type == Properties.class) {
            actualTypeArguments = new Type[]{String.class, String.class};
        } else {
            if (type instanceof WildcardType) {
                type = ((WildcardType) type).getUpperBounds()[0];
            }
            U9.c(Map.class.isAssignableFrom(cls));
            Type typeP = UK.P(type, cls, UK.r(type, cls, Map.class), new HashMap());
            actualTypeArguments = typeP instanceof ParameterizedType ? ((ParameterizedType) typeP).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        Type type2 = actualTypeArguments[0];
        return new C2842tN(this, ba, actualTypeArguments[0], (type2 == Boolean.TYPE || type2 == Boolean.class) ? Hp0.c : ba.e(new Kp0(type2)), actualTypeArguments[1], ba.e(new Kp0(actualTypeArguments[1])), this.l.e(kp0));
    }
}
