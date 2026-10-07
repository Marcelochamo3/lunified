package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: o.pg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2481pg0 {
    public static final EnumC2481pg0 l;
    public static final EnumC2481pg0 m;
    public static final EnumC2481pg0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final EnumC2481pg0 f977o;
    public static final /* synthetic */ EnumC2481pg0[] p;

    static {
        EnumC2481pg0 enumC2481pg0 = new EnumC2481pg0("Ready", 0);
        l = enumC2481pg0;
        EnumC2481pg0 enumC2481pg1 = new EnumC2481pg0("NotReady", 1);
        m = enumC2481pg1;
        EnumC2481pg0 enumC2481pg2 = new EnumC2481pg0("Done", 2);
        n = enumC2481pg2;
        EnumC2481pg0 enumC2481pg3 = new EnumC2481pg0("Failed", 3);
        f977o = enumC2481pg3;
        p = new EnumC2481pg0[]{enumC2481pg0, enumC2481pg1, enumC2481pg2, enumC2481pg3};
    }

    public static EnumC2481pg0 valueOf(String str) {
        return (EnumC2481pg0) Enum.valueOf(EnumC2481pg0.class, str);
    }

    public static EnumC2481pg0[] values() {
        return (EnumC2481pg0[]) p.clone();
    }
}
