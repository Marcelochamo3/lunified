package o;

import java.net.InetSocketAddress;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: o.m8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2147m8 implements Comparator {
    public final /* synthetic */ int l;

    public /* synthetic */ C2147m8(int i) {
        this.l = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = 10;
        int iK = -1;
        int i2 = 11;
        switch (this.l) {
            case 0:
                return AbstractC2341o8.i((InetSocketAddress) obj, (InetSocketAddress) obj2);
            case 1:
                return ((C0643Nw) obj2).s - ((C0643Nw) obj).s;
            case 2:
                C2922u8 c2922u8 = (C2922u8) obj;
                C2922u8 c2922u9 = (C2922u8) obj2;
                int iCompare = Integer.compare(c2922u8.c, c2922u9.c);
                return iCompare != 0 ? iCompare : c2922u8.b.compareTo(c2922u9.b);
            case 3:
                return Integer.compare(((C1888jc) obj2).b, ((C1888jc) obj).b);
            case 4:
                return ((AbstractC1332dr) obj).a() - ((AbstractC1332dr) obj2).a();
            case 5:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 6:
                HW hw = C1128bm.j;
                return 0;
            case 7:
                List list = (List) obj;
                List list2 = (List) obj2;
                return C0341Cf.f(C1030am.d((C1030am) Collections.max(list, new C2147m8(i)), (C1030am) Collections.max(list2, new C2147m8(i)))).a(list.size(), list2.size()).b((C1030am) Collections.max(list, new C2147m8(i2)), (C1030am) Collections.max(list2, new C2147m8(i2)), new C2147m8(i2)).e();
            case 8:
                return ((C0736Rl) Collections.max((List) obj)).compareTo((C0736Rl) Collections.max((List) obj2));
            case 9:
                return ((C0892Xl) ((List) obj).get(0)).compareTo((C0892Xl) ((List) obj2).get(0));
            case 10:
                return C1030am.d((C1030am) obj, (C1030am) obj2);
            case 11:
                return C1030am.c((C1030am) obj, (C1030am) obj2);
            case 12:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    byte b = bArr[i3];
                    byte b2 = bArr2[i3];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 13:
                return ((C3252xe0) obj).a - ((C3252xe0) obj2).a;
            case 14:
                return Float.compare(((C3252xe0) obj).c, ((C3252xe0) obj2).c);
            case 15:
                C2576qf0 c2576qf0 = (C2576qf0) obj;
                C2576qf0 c2576qf1 = (C2576qf0) obj2;
                int iCompare2 = Integer.compare(c2576qf1.b, c2576qf0.b);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompareTo = c2576qf0.c.compareTo(c2576qf1.c);
                return iCompareTo != 0 ? iCompareTo : c2576qf0.d.compareTo(c2576qf1.d);
            case 16:
                C2576qf0 c2576qf2 = (C2576qf0) obj;
                C2576qf0 c2576qf3 = (C2576qf0) obj2;
                int iCompare3 = Integer.compare(c2576qf3.a, c2576qf2.a);
                if (iCompare3 != 0) {
                    return iCompare3;
                }
                int iCompareTo2 = c2576qf3.c.compareTo(c2576qf2.c);
                return iCompareTo2 != 0 ? iCompareTo2 : c2576qf3.d.compareTo(c2576qf2.d);
            case 17:
                Ma0 ma0 = (Ma0) obj2;
                int i4 = ((Ma0) obj).b;
                if (i4 == 0 && ma0.b == 0) {
                    iK = 0;
                } else if (i4 == 0) {
                    iK = 1;
                } else {
                    int i5 = ma0.b;
                    if (i5 != 0) {
                        iK = AbstractC1474fG.k(i4, i5);
                    }
                }
                return Integer.valueOf(iK).intValue();
            case 18:
                return Integer.compare(((Xv0) obj).a.b, ((Xv0) obj2).a.b);
            default:
                return Long.compare(((Wv0) obj).b, ((Wv0) obj2).b);
        }
    }
}
