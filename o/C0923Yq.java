package o;

/* JADX INFO: renamed from: o.Yq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0923Yq extends AbstractC1332dr {
    public final int a;
    public final /* synthetic */ int b;

    public C0923Yq(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    @Override // o.AbstractC1332dr
    public final boolean b(C3176wp c3176wp, C3176wp c3176wp2) {
        switch (this.b) {
            case 0:
                return c3176wp2.O() == this.a;
            case 1:
                return c3176wp2.O() > this.a;
            default:
                return c3176wp != c3176wp2 && c3176wp2.O() < this.a;
        }
    }

    public final String toString() {
        int i = this.a;
        switch (this.b) {
            case 0:
                return String.format(":eq(%d)", Integer.valueOf(i));
            case 1:
                return String.format(":gt(%d)", Integer.valueOf(i));
            default:
                return String.format(":lt(%d)", Integer.valueOf(i));
        }
    }
}
