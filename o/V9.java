package o;

/* JADX INFO: loaded from: classes.dex */
public final class V9 implements InterfaceC1324dm0 {
    public final int a;
    public final C0643Nw b;
    public final C0921Yo c = new C0921Yo();
    public C0643Nw d;
    public InterfaceC1324dm0 e;
    public long f;

    public V9(int i, int i2, C0643Nw c0643Nw) {
        this.a = i2;
        this.b = c0643Nw;
    }

    @Override // o.InterfaceC1324dm0
    public final void a(C0643Nw c0643Nw) {
        C0643Nw c0643Nw2 = this.b;
        if (c0643Nw2 != null) {
            c0643Nw = c0643Nw.d(c0643Nw2);
        }
        this.d = c0643Nw;
        InterfaceC1324dm0 interfaceC1324dm0 = this.e;
        int i = Lr0.a;
        interfaceC1324dm0.a(c0643Nw);
    }

    @Override // o.InterfaceC1324dm0
    public final int b(InterfaceC2000kj interfaceC2000kj, int i, boolean z) {
        return f(interfaceC2000kj, i, z);
    }

    @Override // o.InterfaceC1324dm0
    public final void c(int i, C2562qX c2562qX) {
        InterfaceC1324dm0 interfaceC1324dm0 = this.e;
        int i2 = Lr0.a;
        interfaceC1324dm0.e(i, c2562qX);
    }

    @Override // o.InterfaceC1324dm0
    public final void d(long j, int i, int i2, int i3, C1226cm0 c1226cm0) {
        long j2 = this.f;
        if (j2 != -9223372036854775807L && j >= j2) {
            this.e = this.c;
        }
        InterfaceC1324dm0 interfaceC1324dm0 = this.e;
        int i4 = Lr0.a;
        interfaceC1324dm0.d(j, i, i2, i3, c1226cm0);
    }

    @Override // o.InterfaceC1324dm0
    public final /* synthetic */ void e(int i, C2562qX c2562qX) {
        AbstractC1674hK.c(this, c2562qX, i);
    }

    public final int f(InterfaceC2000kj interfaceC2000kj, int i, boolean z) {
        InterfaceC1324dm0 interfaceC1324dm0 = this.e;
        int i2 = Lr0.a;
        return interfaceC1324dm0.b(interfaceC2000kj, i, z);
    }
}
