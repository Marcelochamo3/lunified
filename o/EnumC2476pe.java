package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: o.pe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2476pe {
    public static final EnumC2476pe l;
    public static final EnumC2476pe m;
    public static final /* synthetic */ EnumC2476pe[] n;

    static {
        EnumC2476pe enumC2476pe = new EnumC2476pe("MEDIA_API", 0);
        l = enumC2476pe;
        EnumC2476pe enumC2476pe2 = new EnumC2476pe("LICENSE_API", 1);
        m = enumC2476pe2;
        n = new EnumC2476pe[]{enumC2476pe, enumC2476pe2};
    }

    public static EnumC2476pe valueOf(String str) {
        return (EnumC2476pe) Enum.valueOf(EnumC2476pe.class, str);
    }

    public static EnumC2476pe[] values() {
        return (EnumC2476pe[]) n.clone();
    }
}
