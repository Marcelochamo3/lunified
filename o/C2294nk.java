package o;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: o.nk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2294nk implements InterfaceC0621Na {
    public final Executor l;
    public final InterfaceC0621Na m;

    public C2294nk(Executor executor, InterfaceC0621Na interfaceC0621Na) {
        this.l = executor;
        this.m = interfaceC0621Na;
    }

    @Override // o.InterfaceC0621Na
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final InterfaceC0621Na clone() {
        return new C2294nk(this.l, this.m.clone());
    }

    @Override // o.InterfaceC0621Na
    public final void cancel() {
        this.m.cancel();
    }

    @Override // o.InterfaceC0621Na
    public final void f(InterfaceC0777Ta interfaceC0777Ta) {
        this.m.f(new C2720s4(this, interfaceC0777Ta, 19, false));
    }

    @Override // o.InterfaceC0621Na
    public final C1951k70 i() {
        return this.m.i();
    }

    @Override // o.InterfaceC0621Na
    public final boolean l() {
        return this.m.l();
    }
}
