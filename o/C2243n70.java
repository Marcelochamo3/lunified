package o;

/* JADX INFO: renamed from: o.n70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2243n70 extends AbstractC2340o70 {
    public final /* synthetic */ TP a;
    public final /* synthetic */ int b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ int d;

    public C2243n70(int i, int i2, TP tp, byte[] bArr) {
        this.a = tp;
        this.b = i;
        this.c = bArr;
        this.d = i2;
    }

    @Override // o.AbstractC2340o70
    public final long a() {
        return this.b;
    }

    @Override // o.AbstractC2340o70
    public final TP b() {
        return this.a;
    }

    @Override // o.AbstractC2340o70
    public final void c(M9 m9) {
        m9.h(this.c, this.d, this.b);
    }
}
