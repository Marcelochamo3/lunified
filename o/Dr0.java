package o;

import com.skidush.clonex.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v2 o.Dr0[], still in use, count: 1, list:
  (r5v2 o.Dr0[]) from 0x0031: CONSTRUCTOR (r5v2 o.Dr0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:50) call: o.Eq.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class Dr0 {
    Fit(R.string.player_aspect_ratio_fit, 0),
    /* JADX INFO: Fake field, exist only in values array */
    Fill(R.string.player_aspect_ratio_fill, 3),
    /* JADX INFO: Fake field, exist only in values array */
    Zoom(R.string.player_aspect_ratio_zoom, 4);

    public static final /* synthetic */ C0404Eq p;
    public final int l;
    public final int m;

    static {
        p = new C0404Eq(dr0Arr);
    }

    public Dr0(int i, int i2) {
        super(str, i);
        this.l = i;
        this.m = i2;
    }

    public static Dr0 valueOf(String str) {
        return (Dr0) Enum.valueOf(Dr0.class, str);
    }

    public static Dr0[] values() {
        return (Dr0[]) f222o.clone();
    }
}
