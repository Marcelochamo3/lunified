package o;

import io.sentry.android.core.C0019p;

/* JADX INFO: renamed from: o.kl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2004kl implements InterfaceC3037vO {
    public final C0019p l;
    public final C1628gs m;
    public AbstractC1952k8 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public InterfaceC3037vO f873o;
    public boolean p = true;
    public boolean q;

    public C2004kl(C1628gs c1628gs, Sh0 sh0) {
        this.m = c1628gs;
        this.l = new C0019p(sh0);
    }

    @Override // o.InterfaceC3037vO
    public final void a(C1591gZ c1591gZ) {
        InterfaceC3037vO interfaceC3037vO = this.f873o;
        if (interfaceC3037vO != null) {
            interfaceC3037vO.a(c1591gZ);
            c1591gZ = this.f873o.b();
        }
        this.l.a(c1591gZ);
    }

    @Override // o.InterfaceC3037vO
    public final C1591gZ b() {
        InterfaceC3037vO interfaceC3037vO = this.f873o;
        return interfaceC3037vO != null ? interfaceC3037vO.b() : (C1591gZ) this.l.p;
    }

    @Override // o.InterfaceC3037vO
    public final long d() {
        if (this.p) {
            return this.l.d();
        }
        InterfaceC3037vO interfaceC3037vO = this.f873o;
        interfaceC3037vO.getClass();
        return interfaceC3037vO.d();
    }
}
