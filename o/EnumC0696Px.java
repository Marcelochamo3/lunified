package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: o.Px, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0696Px {
    public static final EnumC0696Px l;
    public static final EnumC0696Px m;
    public static final EnumC0696Px n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final EnumC0696Px f465o;
    public static final EnumC0696Px p;
    public static final /* synthetic */ EnumC0696Px[] q;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0696Px EF9;

    static {
        EnumC0696Px enumC0696Px = new EnumC0696Px("PENALTY_LOG", 0);
        EnumC0696Px enumC0696Px2 = new EnumC0696Px("PENALTY_DEATH", 1);
        EnumC0696Px enumC0696Px3 = new EnumC0696Px("DETECT_FRAGMENT_REUSE", 2);
        l = enumC0696Px3;
        EnumC0696Px enumC0696Px4 = new EnumC0696Px("DETECT_FRAGMENT_TAG_USAGE", 3);
        m = enumC0696Px4;
        EnumC0696Px enumC0696Px5 = new EnumC0696Px("DETECT_WRONG_NESTED_HIERARCHY", 4);
        n = enumC0696Px5;
        EnumC0696Px enumC0696Px6 = new EnumC0696Px("DETECT_RETAIN_INSTANCE_USAGE", 5);
        EnumC0696Px enumC0696Px7 = new EnumC0696Px("DETECT_SET_USER_VISIBLE_HINT", 6);
        EnumC0696Px enumC0696Px8 = new EnumC0696Px("DETECT_TARGET_FRAGMENT_USAGE", 7);
        f465o = enumC0696Px8;
        EnumC0696Px enumC0696Px9 = new EnumC0696Px("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
        p = enumC0696Px9;
        q = new EnumC0696Px[]{enumC0696Px, enumC0696Px2, enumC0696Px3, enumC0696Px4, enumC0696Px5, enumC0696Px6, enumC0696Px7, enumC0696Px8, enumC0696Px9};
    }

    public static EnumC0696Px valueOf(String str) {
        return (EnumC0696Px) Enum.valueOf(EnumC0696Px.class, str);
    }

    public static EnumC0696Px[] values() {
        return (EnumC0696Px[]) q.clone();
    }
}
