package o;

import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class R60 extends AbstractC1278dF {
    public static final R60 r = new R60(null, new Object[0], 0);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final transient Object f481o;
    public final transient Object[] p;
    public final transient int q;

    public R60(Object obj, Object[] objArr, int i) {
        this.f481o = obj;
        this.p = objArr;
        this.q = i;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // o.AbstractC1278dF, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            Object[] objArr = this.p;
            if (this.q == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.f481o;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iP = AbstractC1370eA.P(obj.hashCode());
                    while (true) {
                        int i = iP & length;
                        int i2 = bArr[i] & 255;
                        if (i2 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i2])) {
                            obj2 = objArr[i2 ^ 1];
                        } else {
                            iP = i + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iP2 = AbstractC1370eA.P(obj.hashCode());
                    while (true) {
                        int i3 = iP2 & length2;
                        int i4 = sArr[i3] & 65535;
                        if (i4 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[i4])) {
                            obj2 = objArr[i4 ^ 1];
                        } else {
                            iP2 = i3 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iP3 = AbstractC1370eA.P(obj.hashCode());
                    while (true) {
                        int i5 = iP3 & length3;
                        int i6 = iArr[i5];
                        if (i6 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i6])) {
                            obj2 = objArr[i6 ^ 1];
                        } else {
                            iP3 = i5 + 1;
                        }
                    }
                    obj2 = null;
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.q;
    }
}
