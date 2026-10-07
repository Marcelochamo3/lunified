package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class TJ {
    public static final TJ l;
    public static final TJ m;
    public static final TJ n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final TJ f532o;
    public static final TJ p;
    public static final /* synthetic */ TJ[] q;

    static {
        TJ tj = new TJ("DESTROYED", 0);
        l = tj;
        TJ tj2 = new TJ("INITIALIZED", 1);
        m = tj2;
        TJ tj3 = new TJ("CREATED", 2);
        n = tj3;
        TJ tj4 = new TJ("STARTED", 3);
        f532o = tj4;
        TJ tj5 = new TJ("RESUMED", 4);
        p = tj5;
        q = new TJ[]{tj, tj2, tj3, tj4, tj5};
    }

    public static TJ valueOf(String str) {
        return (TJ) Enum.valueOf(TJ.class, str);
    }

    public static TJ[] values() {
        return (TJ[]) q.clone();
    }
}
