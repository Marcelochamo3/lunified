package o;

/* JADX INFO: renamed from: o.vi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3066vi0 {
    public final String a;
    public final boolean b;
    public C3357yi0 c;
    public long d;

    public AbstractC3066vi0(String str, boolean z) {
        AbstractC1474fG.j(str, "name");
        this.a = str;
        this.b = z;
        this.d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.a;
    }
}
