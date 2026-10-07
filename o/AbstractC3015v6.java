package o;

/* JADX INFO: renamed from: o.v6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3015v6 {
    public final /* synthetic */ int l;
    public int m;

    public /* synthetic */ AbstractC3015v6() {
        this.l = 1;
    }

    public static int B(int i) {
        return (i >> 24) & 255;
    }

    public static void D(StringBuilder sb) {
        if (sb != null) {
            sb.delete(0, sb.length());
        }
    }

    public static String g(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    public abstract io.sentry.android.core.F A(C2903ty c2903ty);

    public abstract void C();

    public void b(int i) {
        this.m = i | this.m;
    }

    public abstract void c(C2903ty c2903ty);

    public abstract void d(C2903ty c2903ty);

    public boolean j(int i) {
        return (this.m & i) == i;
    }

    public abstract int k();

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public abstract int p();

    public boolean q() {
        return this.m == 5;
    }

    public boolean r() {
        return this.m == 4;
    }

    public boolean s() {
        return this.m == 1;
    }

    public String toString() {
        switch (this.l) {
            case 0:
                return g(this.m);
            default:
                return super.toString();
        }
    }

    public boolean u() {
        return this.m == 6;
    }

    public boolean v() {
        return this.m == 3;
    }

    public boolean w() {
        return this.m == 2;
    }

    public abstract void x(C2903ty c2903ty);

    public abstract void y(C2903ty c2903ty);

    public abstract void z(C2903ty c2903ty);

    public /* synthetic */ AbstractC3015v6(int i, int i2) {
        this.l = i2;
        this.m = i;
    }
}
