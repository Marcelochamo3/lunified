package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: o.Fj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0423Fj {
    public static final EnumC0423Fj l;
    public static final EnumC0423Fj m;
    public static final EnumC0423Fj n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ EnumC0423Fj[] f264o;

    static {
        EnumC0423Fj enumC0423Fj = new EnumC0423Fj("PREFER_ARGB_8888", 0);
        l = enumC0423Fj;
        EnumC0423Fj enumC0423Fj2 = new EnumC0423Fj("PREFER_RGB_565", 1);
        m = enumC0423Fj2;
        f264o = new EnumC0423Fj[]{enumC0423Fj, enumC0423Fj2};
        n = enumC0423Fj;
    }

    public static EnumC0423Fj valueOf(String str) {
        return (EnumC0423Fj) Enum.valueOf(EnumC0423Fj.class, str);
    }

    public static EnumC0423Fj[] values() {
        return (EnumC0423Fj[]) f264o.clone();
    }
}
