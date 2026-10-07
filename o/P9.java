package o;

import j$.util.Optional;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public final class P9 extends AbstractC0577Lh {
    public final /* synthetic */ int a;

    public /* synthetic */ P9(int i) {
        this.a = i;
    }

    @Override // o.AbstractC0577Lh
    public InterfaceC0602Mh a(Type type) {
        switch (this.a) {
            case 0:
                if (AbstractC2340o70.class.isAssignableFrom(UK.w(type))) {
                    return C2691rp.n;
                }
                return null;
            case 3:
                if (type == String.class || type == Boolean.TYPE || type == Boolean.class || type == Byte.TYPE || type == Byte.class || type == Character.TYPE || type == Character.class || type == Double.TYPE || type == Double.class || type == Float.TYPE || type == Float.class || type == Integer.TYPE || type == Integer.class || type == Long.TYPE || type == Long.class || type == Short.TYPE || type == Short.class) {
                    return N90.l;
                }
                return null;
            default:
                return super.a(type);
        }
    }

    @Override // o.AbstractC0577Lh
    public final InterfaceC0602Mh b(Type type, Annotation[] annotationArr, C2923u80 c2923u80) {
        switch (this.a) {
            case 0:
                if (type == AbstractC2051l80.class) {
                    return UK.A(annotationArr, Ng0.class) ? O9.f428o : O9.n;
                }
                if (type == Void.class) {
                    return O9.p;
                }
                if (UK.G(type)) {
                    return C2691rp.f1012o;
                }
                return null;
            case 1:
                AbstractC1474fG.j(type, "type");
                AbstractC1474fG.j(annotationArr, "annotations");
                AbstractC1474fG.j(c2923u80, "retrofit");
                if (!AbstractC1474fG.b(type, C0660On.class)) {
                    return null;
                }
                String str = c2923u80.c.i;
                AbstractC1474fG.i(str, "toString(...)");
                return new J2(7, str, false);
            case 2:
                if (UK.w(type) != Optional.class) {
                    return null;
                }
                return new C0334By(24, c2923u80.e(UK.u(0, (ParameterizedType) type), annotationArr));
            case 3:
                if (type == String.class) {
                    return C2691rp.D;
                }
                if (type == Boolean.class || type == Boolean.TYPE) {
                    return C2691rp.z;
                }
                if (type == Byte.class || type == Byte.TYPE) {
                    return O9.A;
                }
                if (type == Character.class || type == Character.TYPE) {
                    return C2691rp.A;
                }
                if (type == Double.class || type == Double.TYPE) {
                    return O9.B;
                }
                if (type == Float.class || type == Float.TYPE) {
                    return C2691rp.B;
                }
                if (type == Integer.class || type == Integer.TYPE) {
                    return O9.C;
                }
                if (type == Long.class || type == Long.TYPE) {
                    return C2691rp.C;
                }
                if (type == Short.class || type == Short.TYPE) {
                    return O9.D;
                }
                return null;
            default:
                AbstractC1474fG.j(type, "type");
                AbstractC1474fG.j(annotationArr, "annotations");
                AbstractC1474fG.j(c2923u80, "retrofit");
                if (AbstractC1474fG.b(type, String.class)) {
                    return new C2743sL(15);
                }
                return null;
        }
    }
}
