package o;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: o.Lk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0580Lk implements InterfaceC0380Ds {
    public static final int[] b = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};
    public static final C2720s4 c = new C2720s4(new C0838Vj(28));
    public static final C2720s4 d = new C2720s4(new C0838Vj(29));
    public M60 a;

    @Override // o.InterfaceC0380Ds
    public final synchronized InterfaceC0302As[] a(Uri uri, Map map) {
        ArrayList arrayList;
        try {
            int[] iArr = b;
            arrayList = new ArrayList(16);
            List list = (List) map.get("Content-Type");
            int iA = AbstractC1474fG.A((list == null || list.isEmpty()) ? null : (String) list.get(0));
            if (iA != -1) {
                b(iA, arrayList);
            }
            int iB = AbstractC1474fG.B(uri);
            if (iB != -1 && iB != iA) {
                b(iB, arrayList);
            }
            for (int i = 0; i < 16; i++) {
                int i2 = iArr[i];
                if (i2 != iA && i2 != iB) {
                    b(i2, arrayList);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (InterfaceC0302As[]) arrayList.toArray(new InterfaceC0302As[arrayList.size()]);
    }

    public final void b(int i, ArrayList arrayList) {
        switch (i) {
            case 0:
                arrayList.add(new C2422p0());
                break;
            case 1:
                arrayList.add(new C2615r0());
                break;
            case 2:
                arrayList.add(new C1354e2());
                break;
            case 3:
                arrayList.add(new C3104w2());
                break;
            case 4:
                InterfaceC0302As interfaceC0302AsY = c.Y(0);
                if (interfaceC0302AsY == null) {
                    arrayList.add(new C2703rv());
                } else {
                    arrayList.add(interfaceC0302AsY);
                }
                break;
            case 5:
                arrayList.add(new C2899tw());
                break;
            case 6:
                arrayList.add(new C2649rO(0));
                break;
            case 7:
                arrayList.add(new C2653rS());
                break;
            case 8:
                arrayList.add(new C1932jy(0, null, Collections.emptyList(), null));
                arrayList.add(new C2847tS());
                break;
            case 9:
                arrayList.add(new EV());
                break;
            case 10:
                arrayList.add(new C2721s40());
                break;
            case 11:
                if (this.a == null) {
                    XE xe = AbstractC0985aF.m;
                    this.a = M60.p;
                }
                arrayList.add(new Wm0(1, new Oj0(0L), new C1225cm(0, this.a)));
                break;
            case 12:
                C2801sv0 c2801sv0 = new C2801sv0();
                c2801sv0.c = 0;
                c2801sv0.d = -1L;
                c2801sv0.f = -1;
                c2801sv0.g = -1L;
                arrayList.add(c2801sv0);
                break;
            case 14:
                arrayList.add(new KH());
                break;
            case 15:
                InterfaceC0302As interfaceC0302AsY2 = d.Y(new Object[0]);
                if (interfaceC0302AsY2 != null) {
                    arrayList.add(interfaceC0302AsY2);
                }
                break;
            case 16:
                arrayList.add(new C3211x7());
                break;
        }
    }
}
