package o;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.EnumSet;

/* JADX INFO: renamed from: o.Kf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0549Kf implements InterfaceC0673Pa, InterfaceC3432zV {
    public final /* synthetic */ int l;
    public final Type m;

    public /* synthetic */ C0549Kf(int i, Type type) {
        this.l = i;
        this.m = type;
    }

    @Override // o.InterfaceC0673Pa
    public Type G() {
        switch (this.l) {
            case 0:
                break;
        }
        return this.m;
    }

    @Override // o.InterfaceC3432zV
    public Object M() {
        switch (this.l) {
            case 2:
                Type type = this.m;
                if (!(type instanceof ParameterizedType)) {
                    throw new RH("Invalid EnumSet type: " + type.toString());
                }
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                throw new RH("Invalid EnumSet type: " + type.toString());
            default:
                Type type3 = this.m;
                if (!(type3 instanceof ParameterizedType)) {
                    throw new RH("Invalid EnumMap type: " + type3.toString());
                }
                Type type4 = ((ParameterizedType) type3).getActualTypeArguments()[0];
                if (type4 instanceof Class) {
                    return new EnumMap((Class) type4);
                }
                throw new RH("Invalid EnumMap type: " + type3.toString());
        }
    }

    @Override // o.InterfaceC0673Pa
    public Object l(MV mv) {
        switch (this.l) {
            case 0:
                C0575Lf c0575Lf = new C0575Lf(mv);
                mv.f(new C0523Jf(c0575Lf, 0));
                return c0575Lf;
            default:
                C0575Lf c0575Lf2 = new C0575Lf(mv);
                mv.f(new C0523Jf(c0575Lf2, 1));
                return c0575Lf2;
        }
    }
}
