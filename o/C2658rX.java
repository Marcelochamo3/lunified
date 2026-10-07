package o;

/* JADX INFO: renamed from: o.rX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2658rX {
    public final /* synthetic */ int a = 1;
    public final String b;
    public final String c;

    public C2658rX(C1207cd c1207cd, String str) {
        c1207cd.getClass();
        this.b = c1207cd.y();
        this.c = str;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "<" + this.b + ">: " + this.c;
            default:
                return this.b + ", " + this.c;
        }
    }

    public C2658rX(C1207cd c1207cd, String str, Object[] objArr) {
        c1207cd.getClass();
        this.b = c1207cd.y();
        this.c = String.format(str, objArr);
    }

    public C2658rX(String str, String str2) {
        this.b = str;
        this.c = str2;
    }
}
