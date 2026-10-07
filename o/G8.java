package o;

/* JADX INFO: loaded from: classes.dex */
public final class G8 implements InterfaceC2664rb0 {
    public final I8 a;
    public final long b;
    public final long c = 0;
    public final long d;
    public final long e;
    public final long f;
    public final long g;

    public G8(I8 i8, long j, long j2, long j3, long j4, long j5) {
        this.a = i8;
        this.b = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = j5;
    }

    @Override // o.InterfaceC2664rb0
    public final boolean g() {
        return true;
    }

    @Override // o.InterfaceC2664rb0
    public final C2568qb0 i(long j) {
        C2858tb0 c2858tb0 = new C2858tb0(j, H8.a(this.a.f(j), this.c, this.d, this.e, this.f, this.g));
        return new C2568qb0(c2858tb0, c2858tb0);
    }

    @Override // o.InterfaceC2664rb0
    public final long j() {
        return this.b;
    }
}
