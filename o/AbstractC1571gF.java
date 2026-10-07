package o;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: renamed from: o.gF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1571gF extends UE implements Set {
    public static final /* synthetic */ int n = 0;
    public transient AbstractC0985aF m;

    public static int j(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static AbstractC1571gF k(int i, Object... objArr) {
        if (i == 0) {
            return S60.u;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new C1893je0(obj);
        }
        int iJ = j(i);
        Object[] objArr2 = new Object[iJ];
        int i2 = iJ - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i5);
                throw new NullPointerException(sb.toString());
            }
            int iHashCode = obj2.hashCode();
            int iP = AbstractC1370eA.P(iHashCode);
            while (true) {
                int i6 = iP & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iP++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new C1893je0(obj4);
        }
        if (j(i4) < iJ / 2) {
            return k(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new S60(i3, i2, i4, objArr, objArr2);
    }

    public static AbstractC1571gF l(Set set) {
        if ((set instanceof AbstractC1571gF) && !(set instanceof SortedSet)) {
            AbstractC1571gF abstractC1571gF = (AbstractC1571gF) set;
            if (!abstractC1571gF.h()) {
                return abstractC1571gF;
            }
        }
        Object[] array = set.toArray();
        return k(array.length, array);
    }

    @Override // o.UE
    public AbstractC0985aF a() {
        AbstractC0985aF abstractC0985aF = this.m;
        if (abstractC0985aF != null) {
            return abstractC0985aF;
        }
        AbstractC0985aF abstractC0985aFM = m();
        this.m = abstractC0985aFM;
        return abstractC0985aFM;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC1571gF) && (this instanceof S60)) {
            AbstractC1571gF abstractC1571gF = (AbstractC1571gF) obj;
            abstractC1571gF.getClass();
            if ((abstractC1571gF instanceof S60) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return AbstractC2506pt.n(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return AbstractC2506pt.v(this);
    }

    public AbstractC0985aF m() {
        Object[] array = toArray(UE.l);
        XE xe = AbstractC0985aF.m;
        return AbstractC0985aF.j(array.length, array);
    }

    @Override // o.UE
    public Object writeReplace() {
        return new C1473fF(toArray(UE.l));
    }
}
