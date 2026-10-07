package o;

import java.lang.reflect.Field;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class D60 extends C60 {
    public final InterfaceC3432zV b;

    public D60(InterfaceC3432zV interfaceC3432zV, LinkedHashMap linkedHashMap) {
        super(linkedHashMap);
        this.b = interfaceC3432zV;
    }

    @Override // o.C60
    public final Object c() {
        return this.b.M();
    }

    @Override // o.C60
    public final void e(Object obj, WH wh, B60 b60) throws IllegalAccessException {
        Object objA = b60.i.a(wh);
        if (objA == null && b60.l) {
            return;
        }
        boolean z = b60.f;
        Field field = b60.b;
        if (z) {
            F60.a(obj, field);
        } else if (b60.m) {
            throw new RH(AbstractC1701hf0.t("Cannot set value of 'static final' ", A60.d(field, false)));
        }
        field.set(obj, objA);
    }

    @Override // o.C60
    public final Object d(Object obj) {
        return obj;
    }
}
