package o;

/* JADX INFO: renamed from: o.br, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1138br extends AbstractC1332dr {
    public final int a;
    public final int b;
    public final /* synthetic */ int c;

    public C1138br(int i, int i2, int i3) {
        this.c = i3;
        this.a = i;
        this.b = i2;
    }

    @Override // o.AbstractC1332dr
    public final boolean b(C3176wp c3176wp, C3176wp c3176wp2) {
        C3176wp c3176wp3 = (C3176wp) c3176wp2.l;
        if (c3176wp3 == null || (c3176wp3 instanceof C0660On)) {
            return false;
        }
        int iD = d(c3176wp2);
        int i = this.b;
        int i2 = this.a;
        if (i2 == 0) {
            return iD == i;
        }
        int i3 = iD - i;
        return i3 * i2 >= 0 && i3 % i2 == 0;
    }

    public final int d(C3176wp c3176wp) {
        switch (this.c) {
            case 0:
                return c3176wp.O() + 1;
            case 1:
                C3176wp c3176wp2 = (C3176wp) c3176wp.l;
                if (c3176wp2 == null) {
                    return 0;
                }
                return c3176wp2.K().size() - c3176wp.O();
            case 2:
                int i = 0;
                if (((C3176wp) c3176wp.l) != null) {
                    for (C3176wp c3176wpT = c3176wp; c3176wpT != null; c3176wpT = c3176wpT.T()) {
                        if (c3176wpT.f1103o.m.equals(c3176wp.f1103o.m)) {
                            i++;
                        }
                    }
                }
                return i;
            default:
                C3176wp c3176wp3 = (C3176wp) c3176wp.l;
                if (c3176wp3 == null) {
                    return 0;
                }
                int size = c3176wp3.q.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    AbstractC1099bV abstractC1099bVJ = c3176wp3.j(i3);
                    if (abstractC1099bVJ.x().equals(c3176wp.f1103o.m)) {
                        i2++;
                    }
                    if (abstractC1099bVJ == c3176wp) {
                        return i2;
                    }
                }
                return i2;
        }
    }

    public final String e() {
        switch (this.c) {
            case 0:
                return "nth-child";
            case 1:
                return "nth-last-child";
            case 2:
                return "nth-last-of-type";
            default:
                return "nth-of-type";
        }
    }

    public String toString() {
        int i = this.b;
        int i2 = this.a;
        if (i2 == 0) {
            return String.format(":%s(%d)", e(), Integer.valueOf(i));
        }
        return i == 0 ? String.format(":%s(%dn)", e(), Integer.valueOf(i2)) : String.format(":%s(%dn%+d)", e(), Integer.valueOf(i2), Integer.valueOf(i));
    }
}
