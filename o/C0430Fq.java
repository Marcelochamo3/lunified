package o;

import java.io.Serializable;

/* JADX INFO: renamed from: o.Fq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0430Fq implements Serializable {
    private static final long serialVersionUID = 0;
    public final Class l;

    public C0430Fq(Enum[] enumArr) {
        AbstractC1474fG.j(enumArr, "entries");
        Class<?> componentType = enumArr.getClass().getComponentType();
        AbstractC1474fG.g(componentType);
        this.l = componentType;
    }

    private final Object readResolve() {
        Object[] enumConstants = this.l.getEnumConstants();
        AbstractC1474fG.i(enumConstants, "getEnumConstants(...)");
        return new C0404Eq((Enum[]) enumConstants);
    }
}
