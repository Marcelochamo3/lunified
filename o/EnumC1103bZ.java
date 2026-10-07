package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: o.bZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1103bZ {
    public static final EnumC1103bZ l;
    public static final EnumC1103bZ m;
    public static final EnumC1103bZ n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ EnumC1103bZ[] f697o;

    static {
        EnumC1103bZ enumC1103bZ = new EnumC1103bZ("NORMAL", 0);
        l = enumC1103bZ;
        EnumC1103bZ enumC1103bZ2 = new EnumC1103bZ("LOW_RESOURCE", 1);
        m = enumC1103bZ2;
        EnumC1103bZ enumC1103bZ3 = new EnumC1103bZ("VERY_LOW_RESOURCE", 2);
        n = enumC1103bZ3;
        f697o = new EnumC1103bZ[]{enumC1103bZ, enumC1103bZ2, enumC1103bZ3};
    }

    public static EnumC1103bZ valueOf(String str) {
        return (EnumC1103bZ) Enum.valueOf(EnumC1103bZ.class, str);
    }

    public static EnumC1103bZ[] values() {
        return (EnumC1103bZ[]) f697o.clone();
    }
}
