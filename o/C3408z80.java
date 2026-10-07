package o;

/* JADX INFO: renamed from: o.z80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3408z80 extends F {
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1148o;
    public final /* synthetic */ A80 p;

    public C3408z80(A80 a80) {
        this.p = a80;
        this.n = a80.a();
        this.f1148o = a80.f166o;
    }

    @Override // o.F
    public final void a() {
        int i = this.n;
        if (i == 0) {
            this.l = EnumC2481pg0.n;
            return;
        }
        A80 a80 = this.p;
        Object[] objArr = a80.m;
        int i2 = this.f1148o;
        this.m = objArr[i2];
        this.l = EnumC2481pg0.l;
        this.f1148o = (i2 + 1) % a80.n;
        this.n = i - 1;
    }
}
