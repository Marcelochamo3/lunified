package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j$.util.stream.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC0188h {
    public static final EnumC0188h CONCURRENT;
    public static final EnumC0188h IDENTITY_FINISH;
    public static final EnumC0188h UNORDERED;
    private static final /* synthetic */ EnumC0188h[] a;

    static {
        EnumC0188h enumC0188h = new EnumC0188h("CONCURRENT", 0);
        CONCURRENT = enumC0188h;
        EnumC0188h enumC0188h2 = new EnumC0188h("UNORDERED", 1);
        UNORDERED = enumC0188h2;
        EnumC0188h enumC0188h3 = new EnumC0188h("IDENTITY_FINISH", 2);
        IDENTITY_FINISH = enumC0188h3;
        a = new EnumC0188h[]{enumC0188h, enumC0188h2, enumC0188h3};
    }

    public static EnumC0188h valueOf(String str) {
        return (EnumC0188h) Enum.valueOf(EnumC0188h.class, str);
    }

    public static EnumC0188h[] values() {
        return (EnumC0188h[]) a.clone();
    }
}
