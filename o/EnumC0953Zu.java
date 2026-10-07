package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: o.Zu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0953Zu {
    public static final EnumC0953Zu l;
    public static final /* synthetic */ EnumC0953Zu[] m;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0953Zu EF2;

    static {
        EnumC0953Zu enumC0953Zu = new EnumC0953Zu("TOP_DOWN", 0);
        EnumC0953Zu enumC0953Zu2 = new EnumC0953Zu("BOTTOM_UP", 1);
        l = enumC0953Zu2;
        m = new EnumC0953Zu[]{enumC0953Zu, enumC0953Zu2};
    }

    public static EnumC0953Zu valueOf(String str) {
        return (EnumC0953Zu) Enum.valueOf(EnumC0953Zu.class, str);
    }

    public static EnumC0953Zu[] values() {
        return (EnumC0953Zu[]) m.clone();
    }
}
