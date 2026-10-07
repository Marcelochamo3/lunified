package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class IJ {
    public static final IJ l;
    public static final IJ m;
    public static final IJ n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ IJ[] f322o;

    static {
        IJ ij = new IJ("SYNCHRONIZED", 0);
        l = ij;
        IJ ij2 = new IJ("PUBLICATION", 1);
        m = ij2;
        IJ ij3 = new IJ("NONE", 2);
        n = ij3;
        f322o = new IJ[]{ij, ij2, ij3};
    }

    public static IJ valueOf(String str) {
        return (IJ) Enum.valueOf(IJ.class, str);
    }

    public static IJ[] values() {
        return (IJ[]) f322o.clone();
    }
}
