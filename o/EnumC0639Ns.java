package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: o.Ns, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0639Ns {
    public static final EnumC0639Ns l;
    public static final EnumC0639Ns m;
    public static final /* synthetic */ EnumC0639Ns[] n;

    static {
        EnumC0639Ns enumC0639Ns = new EnumC0639Ns("CONTENT", 0);
        l = enumC0639Ns;
        EnumC0639Ns enumC0639Ns2 = new EnumC0639Ns("EVENT", 1);
        m = enumC0639Ns2;
        n = new EnumC0639Ns[]{enumC0639Ns, enumC0639Ns2};
    }

    public static EnumC0639Ns valueOf(String str) {
        return (EnumC0639Ns) Enum.valueOf(EnumC0639Ns.class, str);
    }

    public static EnumC0639Ns[] values() {
        return (EnumC0639Ns[]) n.clone();
    }
}
