package o;

/* JADX INFO: renamed from: o.am0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1031am0 implements T9 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C1031am0 f678o = new C1031am0(new Zl0[0]);
    public static final String p;
    public final int l;
    public final M60 m;
    public int n;

    static {
        int i = Lr0.a;
        p = Integer.toString(0, 36);
    }

    public C1031am0(Zl0... zl0Arr) {
        this.m = AbstractC0985aF.m(zl0Arr);
        this.l = zl0Arr.length;
        int i = 0;
        while (true) {
            M60 m60 = this.m;
            if (i >= m60.size()) {
                return;
            }
            int i2 = i + 1;
            for (int i3 = i2; i3 < m60.size(); i3++) {
                if (((Zl0) m60.get(i)).equals(m60.get(i3))) {
                    AP.g("", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final Zl0 a(int i) {
        return (Zl0) this.m.get(i);
    }

    public final int b(Zl0 zl0) {
        int iIndexOf = this.m.indexOf(zl0);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1031am0.class != obj.getClass()) {
            return false;
        }
        C1031am0 c1031am0 = (C1031am0) obj;
        return this.l == c1031am0.l && this.m.equals(c1031am0.m);
    }

    public final int hashCode() {
        if (this.n == 0) {
            this.n = this.m.hashCode();
        }
        return this.n;
    }
}
