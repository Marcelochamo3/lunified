package o;

import java.io.Serializable;

/* JADX INFO: renamed from: o.Eq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0404Eq extends J implements Serializable {
    public final Enum[] m;

    public C0404Eq(Enum[] enumArr) {
        this.m = enumArr;
    }

    private final Object writeReplace() {
        return new C0430Fq(this.m);
    }

    @Override // o.Vp0
    public final int a() {
        return this.m.length;
    }

    @Override // o.Vp0, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r6 = (Enum) obj;
        AbstractC1474fG.j(r6, "element");
        int iOrdinal = r6.ordinal();
        Enum[] enumArr = this.m;
        AbstractC1474fG.j(enumArr, "<this>");
        return ((iOrdinal < 0 || iOrdinal > enumArr.length - 1) ? null : enumArr[iOrdinal]) == r6;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.m;
        int length = enumArr.length;
        if (i < 0 || i >= length) {
            throw new IndexOutOfBoundsException(AbstractC1674hK.m(i, length, "index: ", ", size: "));
        }
        return enumArr[i];
    }

    @Override // o.J, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r5 = (Enum) obj;
        AbstractC1474fG.j(r5, "element");
        int iOrdinal = r5.ordinal();
        Enum[] enumArr = this.m;
        AbstractC1474fG.j(enumArr, "<this>");
        if (((iOrdinal < 0 || iOrdinal > enumArr.length + (-1)) ? null : enumArr[iOrdinal]) == r5) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // o.J, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r2 = (Enum) obj;
        AbstractC1474fG.j(r2, "element");
        return indexOf(r2);
    }
}
