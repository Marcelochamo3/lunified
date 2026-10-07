package o;

/* JADX INFO: renamed from: o.vy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3097vy extends RuntimeException {
    public final int l;
    public final Throwable m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3097vy(int i, Throwable th) {
        super(th);
        AbstractC1701hf0.q(i, "callbackName");
        this.l = i;
        this.m = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.m;
    }
}
