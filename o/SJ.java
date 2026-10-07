package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class SJ {
    private static final /* synthetic */ SJ[] $VALUES;
    public static final QJ Companion;
    public static final SJ ON_ANY;
    public static final SJ ON_CREATE;
    public static final SJ ON_DESTROY;
    public static final SJ ON_PAUSE;
    public static final SJ ON_RESUME;
    public static final SJ ON_START;
    public static final SJ ON_STOP;

    static {
        SJ sj = new SJ("ON_CREATE", 0);
        ON_CREATE = sj;
        SJ sj2 = new SJ("ON_START", 1);
        ON_START = sj2;
        SJ sj3 = new SJ("ON_RESUME", 2);
        ON_RESUME = sj3;
        SJ sj4 = new SJ("ON_PAUSE", 3);
        ON_PAUSE = sj4;
        SJ sj5 = new SJ("ON_STOP", 4);
        ON_STOP = sj5;
        SJ sj6 = new SJ("ON_DESTROY", 5);
        ON_DESTROY = sj6;
        SJ sj7 = new SJ("ON_ANY", 6);
        ON_ANY = sj7;
        $VALUES = new SJ[]{sj, sj2, sj3, sj4, sj5, sj6, sj7};
        Companion = new QJ();
    }

    public static SJ valueOf(String str) {
        return (SJ) Enum.valueOf(SJ.class, str);
    }

    public static SJ[] values() {
        return (SJ[]) $VALUES.clone();
    }

    public final TJ a() {
        switch (RJ.a[ordinal()]) {
            case 1:
            case 2:
                return TJ.n;
            case 3:
            case 4:
                return TJ.f532o;
            case 5:
                return TJ.p;
            case 6:
                return TJ.l;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
