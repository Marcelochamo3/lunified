package o;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v3 o.br0[], still in use, count: 1, list:
  (r2v3 o.br0[]) from 0x0023: CONSTRUCTOR (r2v3 o.br0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:36) call: o.Eq.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(Unknown Source)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: o.br0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1139br0 {
    f706o("HOLA", "Hola Proxy (peer)"),
    p("URBAN", "Urban VPN");

    public static final C3325yL n = new C3325yL();
    public static final /* synthetic */ C0404Eq r;
    public final String l;
    public final String m;

    static {
        r = new C0404Eq(new EnumC1139br0[]{r0, r1});
    }

    public EnumC1139br0(String str, String str2) {
        super(str, i);
        this.l = str;
        this.m = str2;
    }

    public static EnumC1139br0 valueOf(String str) {
        return (EnumC1139br0) Enum.valueOf(EnumC1139br0.class, str);
    }

    public static EnumC1139br0[] values() {
        return (EnumC1139br0[]) q.clone();
    }
}
