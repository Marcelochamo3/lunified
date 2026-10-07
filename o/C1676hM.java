package o;

/* JADX INFO: renamed from: o.hM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1676hM extends RuntimeException {
    private final C2848tT l;
    private final int m;

    public C1676hM() {
        this((String) null, (Throwable) null);
    }

    public C2848tT a() {
        return this.l;
    }

    public int b() {
        return this.m;
    }

    public C1676hM(String str) {
        this(str, (Throwable) null);
    }

    public C1676hM(String str, Throwable th) {
        super(str, th);
        this.l = null;
        this.m = 0;
    }

    public C1676hM(C2848tT c2848tT, int i) {
        this.l = c2848tT;
        this.m = i;
    }
}
