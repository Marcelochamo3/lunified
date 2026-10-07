package o;

/* JADX INFO: renamed from: o.zL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3422zL implements M70, InterfaceC0432Fs {
    public static final Na0 p = AbstractC2506pt.H(20, new C3325yL());
    public final C2965ug0 l = new C2965ug0();
    public M70 m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1152o;

    public final synchronized void a() {
        this.l.a();
        if (!this.n) {
            throw new IllegalStateException("Already unlocked");
        }
        this.n = false;
        if (this.f1152o) {
            e();
        }
    }

    @Override // o.M70
    public final int b() {
        return this.m.b();
    }

    @Override // o.InterfaceC0432Fs
    public final C2965ug0 c() {
        return this.l;
    }

    @Override // o.M70
    public final Class d() {
        return this.m.d();
    }

    @Override // o.M70
    public final synchronized void e() {
        this.l.a();
        this.f1152o = true;
        if (!this.n) {
            this.m.e();
            this.m = null;
            p.e(this);
        }
    }

    @Override // o.M70
    public final Object get() {
        return this.m.get();
    }
}
