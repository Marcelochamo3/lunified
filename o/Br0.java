package o;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v1 o.Br0[], still in use, count: 1, list:
  (r4v1 o.Br0[]) from 0x001f: CONSTRUCTOR (r4v1 o.Br0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:32) call: o.Eq.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes.dex */
public final class Br0 {
    MOBILE(1),
    TV(2);

    public static final /* synthetic */ C0404Eq p;
    public final int l;

    static {
        p = new C0404Eq(br0Arr);
    }

    public Br0(int i) {
        super(str, i);
        this.l = i;
    }

    public static Br0 valueOf(String str) {
        return (Br0) Enum.valueOf(Br0.class, str);
    }

    public static Br0[] values() {
        return (Br0[]) f190o.clone();
    }
}
