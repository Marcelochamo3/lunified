package o;

/* JADX INFO: renamed from: o.ej0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1415ej0 {
    public static final ThreadLocal a = new ThreadLocal();

    public static AbstractC1918jr a() {
        ThreadLocal threadLocal = a;
        AbstractC1918jr abstractC1918jr = (AbstractC1918jr) threadLocal.get();
        if (abstractC1918jr != null) {
            return abstractC1918jr;
        }
        Z8 z8 = new Z8(Thread.currentThread());
        threadLocal.set(z8);
        return z8;
    }
}
