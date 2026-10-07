package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public final class DA extends AbstractC0577Lh {
    public final BA a;

    public DA(BA ba) {
        this.a = ba;
    }

    public static DA c() {
        return new DA(new BA());
    }

    @Override // o.AbstractC0577Lh
    public final InterfaceC0602Mh a(Type type) {
        Kp0 kp0 = new Kp0(type);
        BA ba = this.a;
        return new EA(ba, ba.e(kp0));
    }

    @Override // o.AbstractC0577Lh
    public final InterfaceC0602Mh b(Type type, Annotation[] annotationArr, C2923u80 c2923u80) {
        Kp0 kp0 = new Kp0(type);
        BA ba = this.a;
        return new C2994uv(ba, 7, ba.e(kp0));
    }
}
