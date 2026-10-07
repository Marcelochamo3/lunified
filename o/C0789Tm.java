package o;

/* JADX INFO: renamed from: o.Tm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0789Tm {
    public static final C0789Tm b = new C0789Tm(0);
    public static final C0789Tm c = new C0789Tm(1);
    public static final C0789Tm d = new C0789Tm(2);
    public static final C0789Tm e = new C0789Tm(3);
    public static final C0789Tm f = new C0789Tm(4);
    public final /* synthetic */ int a;

    public /* synthetic */ C0789Tm(int i) {
        this.a = i;
    }

    public final boolean a() {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return false;
            case 2:
                return true;
            case 3:
                return false;
            default:
                return true;
        }
    }

    public final boolean b() {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return false;
            case 2:
                return false;
            case 3:
                return true;
            default:
                return true;
        }
    }

    public final boolean c(int i) {
        switch (this.a) {
            case 0:
                return i == 2;
            case 1:
                return false;
            case 2:
                return (i == 3 || i == 5) ? false : true;
            case 3:
                return false;
            default:
                return i == 2;
        }
    }

    public final boolean d(int i, int i2, boolean z) {
        switch (this.a) {
            case 0:
                return (i == 4 || i == 5) ? false : true;
            case 1:
                return false;
            case 2:
                return false;
            case 3:
                return (i == 4 || i == 5) ? false : true;
            default:
                return ((z && i == 3) || i == 1) && i2 == 2;
        }
    }
}
