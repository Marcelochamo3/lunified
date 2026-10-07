package o;

/* JADX INFO: loaded from: classes.dex */
public final class J5 extends AbstractC1468fA {
    public static volatile J5 W;
    public static final I5 X = new I5(0);
    public final C0632Nl V = new C0632Nl();

    public static J5 F() {
        if (W != null) {
            return W;
        }
        synchronized (J5.class) {
            try {
                if (W == null) {
                    W = new J5();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return W;
    }
}
