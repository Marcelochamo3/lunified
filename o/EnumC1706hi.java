package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: o.hi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1706hi {
    public static final EnumC1706hi l;
    public static final /* synthetic */ EnumC1706hi[] m;

    static {
        EnumC1706hi enumC1706hi = new EnumC1706hi("COROUTINE_SUSPENDED", 0);
        l = enumC1706hi;
        m = new EnumC1706hi[]{enumC1706hi, new EnumC1706hi("UNDECIDED", 1), new EnumC1706hi("RESUMED", 2)};
    }

    public static EnumC1706hi valueOf(String str) {
        return (EnumC1706hi) Enum.valueOf(EnumC1706hi.class, str);
    }

    public static EnumC1706hi[] values() {
        return (EnumC1706hi[]) m.clone();
    }
}
