package o;

/* JADX INFO: renamed from: o.nh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2289nh0 extends AbstractC0845Vq {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2289nh0(AbstractC1332dr abstractC1332dr, int i) {
        super(abstractC1332dr);
        this.d = i;
    }

    @Override // o.AbstractC1332dr
    public final int a() {
        switch (this.d) {
            case 0:
                return ((AbstractC1332dr) this.b).a() + 2;
            case 1:
                return ((AbstractC1332dr) this.b).a() + 2;
            case 2:
                return ((AbstractC1332dr) this.b).a() + 2;
            case 3:
                return ((AbstractC1332dr) this.b).a() * 2;
            default:
                return ((AbstractC1332dr) this.b).a() * 3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [o.wp] */
    /* JADX WARN: Type inference failed for: r1v7, types: [o.wp] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v0, types: [o.Vq, o.nh0] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, o.bV, o.wp] */
    /* JADX WARN: Type inference failed for: r5v1, types: [o.bV] */
    /* JADX WARN: Type inference failed for: r5v2, types: [o.bV] */
    @Override // o.AbstractC1332dr
    public final boolean b(C3176wp c3176wp, C3176wp c3176wp2) {
        C3176wp c3176wp3;
        switch (this.d) {
            case 0:
                if (c3176wp == c3176wp2) {
                    return false;
                }
                c3176wp2.getClass();
                while (true) {
                    c3176wp2 = c3176wp2.C();
                    if (c3176wp2 == 0) {
                        c3176wp3 = null;
                    } else if (c3176wp2 instanceof C3176wp) {
                        c3176wp3 = (C3176wp) c3176wp2;
                    }
                }
                return c3176wp3 != null && d(c3176wp, c3176wp3);
            case 1:
                return ((AbstractC1332dr) this.b).b(c3176wp, c3176wp2);
            case 2:
                return !d(c3176wp, c3176wp2);
            case 3:
                if (c3176wp == c3176wp2) {
                    return false;
                }
                for (C3176wp c3176wp4 = (C3176wp) c3176wp2.l; c3176wp4 != null; c3176wp4 = (C3176wp) c3176wp4.l) {
                    if (d(c3176wp, c3176wp4)) {
                        return true;
                    }
                    if (c3176wp4 == c3176wp) {
                        return false;
                    }
                }
                return false;
            default:
                if (c3176wp == c3176wp2) {
                    return false;
                }
                C3176wp c3176wp5 = (C3176wp) c3176wp2.l;
                for (?? P = c3176wp5 != null ? c3176wp5.P() : c3176wp2; P != 0 && P != c3176wp2; P = P.T()) {
                    if (d(c3176wp, P)) {
                        return true;
                    }
                }
                return false;
        }
    }

    public final String toString() {
        Object obj = this.b;
        switch (this.d) {
            case 0:
                return String.format("%s + ", (AbstractC1332dr) obj);
            case 1:
                return String.format(":is(%s)", (AbstractC1332dr) obj);
            case 2:
                return String.format(":not(%s)", (AbstractC1332dr) obj);
            case 3:
                return String.format("%s ", (AbstractC1332dr) obj);
            default:
                return String.format("%s ~ ", (AbstractC1332dr) obj);
        }
    }
}
