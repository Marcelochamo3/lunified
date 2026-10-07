package o;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: o.cr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1235cr extends AbstractC1332dr {
    public final /* synthetic */ int a;
    public final Pattern b;

    public /* synthetic */ C1235cr(Pattern pattern, int i) {
        this.a = i;
        this.b = pattern;
    }

    @Override // o.AbstractC1332dr
    public final int a() {
        switch (this.a) {
            case 0:
                return 8;
            case 1:
                return 7;
            case 2:
                return 7;
            default:
                return 8;
        }
    }

    @Override // o.AbstractC1332dr
    public final boolean b(C3176wp c3176wp, C3176wp c3176wp2) {
        switch (this.a) {
            case 0:
                return this.b.matcher(c3176wp2.Z()).find();
            case 1:
                return this.b.matcher(c3176wp2.U()).find();
            case 2:
                return this.b.matcher(c3176wp2.a0()).find();
            default:
                c3176wp2.getClass();
                StringBuilder sbB = AbstractC1021ah0.b();
                AbstractC1474fG.T(c3176wp2, AbstractC1099bV.class).forEach(new WU(3, sbB));
                return this.b.matcher(AbstractC1021ah0.h(sbB)).find();
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return ":matches(" + this.b + ")";
            case 1:
                return ":matchesOwn(" + this.b + ")";
            case 2:
                return ":matchesWholeOwnText(" + this.b + ")";
            default:
                return ":matchesWholeText(" + this.b + ")";
        }
    }
}
