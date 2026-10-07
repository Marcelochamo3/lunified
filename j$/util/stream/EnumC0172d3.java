package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j$.util.stream.d3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class EnumC0172d3 {
    public static final EnumC0172d3 OP;
    public static final EnumC0172d3 SPLITERATOR;
    public static final EnumC0172d3 STREAM;
    public static final EnumC0172d3 TERMINAL_OP;
    public static final EnumC0172d3 UPSTREAM_TERMINAL_OP;
    private static final /* synthetic */ EnumC0172d3[] a;

    static {
        EnumC0172d3 enumC0172d3 = new EnumC0172d3("SPLITERATOR", 0);
        SPLITERATOR = enumC0172d3;
        EnumC0172d3 enumC0172d4 = new EnumC0172d3("STREAM", 1);
        STREAM = enumC0172d4;
        EnumC0172d3 enumC0172d5 = new EnumC0172d3("OP", 2);
        OP = enumC0172d5;
        EnumC0172d3 enumC0172d6 = new EnumC0172d3("TERMINAL_OP", 3);
        TERMINAL_OP = enumC0172d6;
        EnumC0172d3 enumC0172d7 = new EnumC0172d3("UPSTREAM_TERMINAL_OP", 4);
        UPSTREAM_TERMINAL_OP = enumC0172d7;
        a = new EnumC0172d3[]{enumC0172d3, enumC0172d4, enumC0172d5, enumC0172d6, enumC0172d7};
    }

    public static EnumC0172d3 valueOf(String str) {
        return (EnumC0172d3) Enum.valueOf(EnumC0172d3.class, str);
    }

    public static EnumC0172d3[] values() {
        return (EnumC0172d3[]) a.clone();
    }
}
