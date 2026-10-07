package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
final class F3 {
    public static final F3 MAYBE_MORE;
    public static final F3 NO_MORE;
    public static final F3 UNLIMITED;
    private static final /* synthetic */ F3[] a;

    static {
        F3 f3 = new F3("NO_MORE", 0);
        NO_MORE = f3;
        F3 f4 = new F3("MAYBE_MORE", 1);
        MAYBE_MORE = f4;
        F3 f5 = new F3("UNLIMITED", 2);
        UNLIMITED = f5;
        a = new F3[]{f3, f4, f5};
    }

    public static F3 valueOf(String str) {
        return (F3) Enum.valueOf(F3.class, str);
    }

    public static F3[] values() {
        return (F3[]) a.clone();
    }
}
