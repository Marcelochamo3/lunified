package o;

/* JADX INFO: renamed from: o.mi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2194mi0 implements Comparable {
    public final int l;
    public final int m;
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f918o;

    public C2194mi0(int i, int i2, String str, String str2) {
        this.l = i;
        this.m = i2;
        this.n = str;
        this.f918o = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C2194mi0 c2194mi0 = (C2194mi0) obj;
        AbstractC1474fG.j(c2194mi0, "other");
        int i = this.l - c2194mi0.l;
        return i == 0 ? this.m - c2194mi0.m : i;
    }
}
