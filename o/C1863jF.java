package o;

import java.util.List;

/* JADX INFO: renamed from: o.jF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1863jF implements Comparable {
    public final String l;

    public C1863jF(String str) {
        AbstractC1474fG.j(str, "name");
        this.l = str;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C1863jF c1863jF) {
        Integer numJ;
        Integer numJ2;
        AbstractC1474fG.j(c1863jF, "other");
        List listT0 = AbstractC1119bh0.t0(this.l, new String[]{"."}, 0, 6);
        List listT1 = AbstractC1119bh0.t0(c1863jF.l, new String[]{"."}, 0, 6);
        int iMax = Math.max(listT0.size(), listT1.size());
        for (int i = 0; i < iMax; i++) {
            String str = (String) AbstractC0911Ye.e0(i, listT0);
            int iIntValue = (str == null || (numJ2 = AbstractC1802ih0.J(str)) == null) ? 0 : numJ2.intValue();
            String str2 = (String) AbstractC0911Ye.e0(i, listT1);
            int iIntValue2 = (str2 == null || (numJ = AbstractC1802ih0.J(str2)) == null) ? 0 : numJ.intValue();
            if (iIntValue < iIntValue2) {
                return -1;
            }
            if (iIntValue > iIntValue2) {
                return 1;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1863jF) && AbstractC1474fG.b(this.l, ((C1863jF) obj).l);
    }

    public final int hashCode() {
        return this.l.hashCode();
    }

    public final String toString() {
        return AbstractC1701hf0.h(new StringBuilder("Version(name="), this.l, ")");
    }
}
