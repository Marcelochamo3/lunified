package o;

/* JADX INFO: renamed from: o.ng0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2287ng0 implements InterfaceC2664rb0 {
    public final /* synthetic */ InterfaceC2664rb0 a;
    public final /* synthetic */ C3306y6 b;

    public C2287ng0(C3306y6 c3306y6, InterfaceC2664rb0 interfaceC2664rb0) {
        this.b = c3306y6;
        this.a = interfaceC2664rb0;
    }

    @Override // o.InterfaceC2664rb0
    public final boolean g() {
        return this.a.g();
    }

    @Override // o.InterfaceC2664rb0
    public final C2568qb0 i(long j) {
        C2568qb0 c2568qb0I = this.a.i(j);
        C2858tb0 c2858tb0 = c2568qb0I.a;
        long j2 = c2858tb0.a;
        long j3 = c2858tb0.b;
        long j4 = this.b.m;
        C2858tb0 c2858tb1 = new C2858tb0(j2, j3 + j4);
        C2858tb0 c2858tb2 = c2568qb0I.b;
        return new C2568qb0(c2858tb1, new C2858tb0(c2858tb2.a, c2858tb2.b + j4));
    }

    @Override // o.InterfaceC2664rb0
    public final long j() {
        return this.a.j();
    }
}
