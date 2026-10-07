package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: o.a30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0967a30 {
    public static final EnumC0967a30 l;
    public static final /* synthetic */ EnumC0967a30[] m;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0967a30 EF2;

    static {
        EnumC0967a30 enumC0967a30 = new EnumC0967a30("SRGB", 0);
        EnumC0967a30 enumC0967a31 = new EnumC0967a30("DISPLAY_P3", 1);
        l = enumC0967a31;
        m = new EnumC0967a30[]{enumC0967a30, enumC0967a31};
    }

    public static EnumC0967a30 valueOf(String str) {
        return (EnumC0967a30) Enum.valueOf(EnumC0967a30.class, str);
    }

    public static EnumC0967a30[] values() {
        return (EnumC0967a30[]) m.clone();
    }
}
