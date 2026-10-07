package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j$.util.stream.f3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC0182f3 {
    public static final EnumC0182f3 DOUBLE_VALUE;
    public static final EnumC0182f3 INT_VALUE;
    public static final EnumC0182f3 LONG_VALUE;
    public static final EnumC0182f3 REFERENCE;
    private static final /* synthetic */ EnumC0182f3[] a;

    static {
        EnumC0182f3 enumC0182f3 = new EnumC0182f3("REFERENCE", 0);
        REFERENCE = enumC0182f3;
        EnumC0182f3 enumC0182f4 = new EnumC0182f3("INT_VALUE", 1);
        INT_VALUE = enumC0182f4;
        EnumC0182f3 enumC0182f5 = new EnumC0182f3("LONG_VALUE", 2);
        LONG_VALUE = enumC0182f5;
        EnumC0182f3 enumC0182f6 = new EnumC0182f3("DOUBLE_VALUE", 3);
        DOUBLE_VALUE = enumC0182f6;
        a = new EnumC0182f3[]{enumC0182f3, enumC0182f4, enumC0182f5, enumC0182f6};
    }

    public static EnumC0182f3 valueOf(String str) {
        return (EnumC0182f3) Enum.valueOf(EnumC0182f3.class, str);
    }

    public static EnumC0182f3[] values() {
        return (EnumC0182f3[]) a.clone();
    }
}
