package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class TB {
    public static final TB l;
    public static final TB m;
    public static final TB n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final TB f529o;
    public static final TB p;
    public static final TB q;
    public static final TB r;
    public static final /* synthetic */ TB[] s;

    static {
        TB tb = new TB("NETWORK", 0);
        l = tb;
        TB tb2 = new TB("FETCH", 1);
        m = tb2;
        TB tb3 = new TB("XHR", 2);
        n = tb3;
        TB tb4 = new TB("DOM", 3);
        f529o = tb4;
        TB tb5 = new TB("PLAYER", 4);
        p = tb5;
        TB tb6 = new TB("PERFORMANCE", 5);
        q = tb6;
        TB tb7 = new TB("HTML", 6);
        r = tb7;
        s = new TB[]{tb, tb2, tb3, tb4, tb5, tb6, tb7};
    }

    public static TB valueOf(String str) {
        return (TB) Enum.valueOf(TB.class, str);
    }

    public static TB[] values() {
        return (TB[]) s.clone();
    }
}
