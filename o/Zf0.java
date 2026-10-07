package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class Zf0 {
    public static final /* synthetic */ int a = 0;

    static {
        Object objK;
        Object objK2;
        Exception exc = new Exception();
        String simpleName = zy0.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            objK = R7.class.getCanonicalName();
        } catch (Throwable th) {
            objK = Jp0.k(th);
        }
        if (C2536q80.a(objK) != null) {
            objK = "o.R7";
        }
        try {
            objK2 = Zf0.class.getCanonicalName();
        } catch (Throwable th2) {
            objK2 = Jp0.k(th2);
        }
        if (C2536q80.a(objK2) != null) {
            objK2 = "o.Zf0";
        }
    }
}
