package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: o.h30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1651h30 {
    public static final EnumC1651h30 l;
    public static final EnumC1651h30 m;
    public static final EnumC1651h30 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final EnumC1651h30 f807o;
    public static final /* synthetic */ EnumC1651h30[] p;

    static {
        EnumC1651h30 enumC1651h30 = new EnumC1651h30("IMMEDIATE", 0);
        l = enumC1651h30;
        EnumC1651h30 enumC1651h31 = new EnumC1651h30("HIGH", 1);
        m = enumC1651h31;
        EnumC1651h30 enumC1651h32 = new EnumC1651h30("NORMAL", 2);
        n = enumC1651h32;
        EnumC1651h30 enumC1651h33 = new EnumC1651h30("LOW", 3);
        f807o = enumC1651h33;
        p = new EnumC1651h30[]{enumC1651h30, enumC1651h31, enumC1651h32, enumC1651h33};
    }

    public static EnumC1651h30 valueOf(String str) {
        return (EnumC1651h30) Enum.valueOf(EnumC1651h30.class, str);
    }

    public static EnumC1651h30[] values() {
        return (EnumC1651h30[]) p.clone();
    }
}
