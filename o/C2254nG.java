package o;

import java.util.Set;

/* JADX INFO: renamed from: o.nG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2254nG {
    public final C2720s4 a;
    public final int[] b;
    public final String[] c;
    public final Set d;

    public C2254nG(C2720s4 c2720s4, int[] iArr, String[] strArr) {
        AbstractC1474fG.j(c2720s4, "observer");
        this.a = c2720s4;
        this.b = iArr;
        this.c = strArr;
        this.d = (strArr.length == 0) ^ true ? AbstractC1370eA.O(strArr[0]) : C1722hq.l;
        if (iArr.length != strArr.length) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final void a(Set set) {
        AbstractC1474fG.j(set, "invalidatedTablesIds");
        int[] iArr = this.b;
        int length = iArr.length;
        Set setC = C1722hq.l;
        if (length != 0) {
            int i = 0;
            if (length != 1) {
                Fc0 fc0 = new Fc0();
                int length2 = iArr.length;
                int i2 = 0;
                while (i < length2) {
                    int i3 = i2 + 1;
                    if (set.contains(Integer.valueOf(iArr[i]))) {
                        fc0.add(this.c[i2]);
                    }
                    i++;
                    i2 = i3;
                }
                setC = AbstractC1370eA.c(fc0);
            } else if (set.contains(Integer.valueOf(iArr[0]))) {
                setC = this.d;
            }
        }
        if (!setC.isEmpty()) {
            this.a.d0(setC);
        }
    }
}
