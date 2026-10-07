package o;

/* JADX INFO: renamed from: o.fU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1488fU extends C1878jU {
    public final Class s;

    public C1488fU(Class cls) {
        super(0, cls);
        if (cls.isEnum()) {
            this.s = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " is not an Enum type.").toString());
    }

    @Override // o.C1878jU, o.AbstractC1976kU
    public final String b() {
        return this.s.getName();
    }

    @Override // o.C1878jU
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final Enum h(String str) {
        Object obj;
        AbstractC1474fG.j(str, "value");
        Class cls = this.s;
        Object[] enumConstants = cls.getEnumConstants();
        AbstractC1474fG.i(enumConstants, "type.enumConstants");
        int length = enumConstants.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                obj = null;
                break;
            }
            obj = enumConstants[i];
            if (AbstractC1899jh0.N(((Enum) obj).name(), str, true)) {
                break;
            }
            i++;
        }
        Enum r4 = (Enum) obj;
        if (r4 != null) {
            return r4;
        }
        StringBuilder sbL = AbstractC1701hf0.l("Enum value ", str, " not found for type ");
        sbL.append(cls.getName());
        sbL.append('.');
        throw new IllegalArgumentException(sbL.toString());
    }
}
