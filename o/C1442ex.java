package o;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: o.ex, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1442ex extends zy0 implements InterfaceC1978kW, InterfaceC2657rW, InterfaceC2270nW, InterfaceC2367oW, InterfaceC1047au0, InterfaceC1588gW, Q1, K90, InterfaceC0592Lx, InterfaceC1094bQ {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Activity f765o;
    public final Context p;
    public final Handler q;
    public final C3289xx r;
    public final /* synthetic */ AbstractActivityC1540fx s;

    public C1442ex(AbstractActivityC1540fx abstractActivityC1540fx) {
        this.s = abstractActivityC1540fx;
        Handler handler = new Handler();
        this.f765o = abstractActivityC1540fx;
        this.p = abstractActivityC1540fx;
        this.q = handler;
        this.r = new C3289xx();
    }

    public final void E(C2514px c2514px) {
        this.s.h(c2514px);
    }

    public final void F(InterfaceC0835Vg interfaceC0835Vg) {
        this.s.i(interfaceC0835Vg);
    }

    public final void G(C2320nx c2320nx) {
        this.s.k(c2320nx);
    }

    public final void H(C2320nx c2320nx) {
        this.s.l(c2320nx);
    }

    public final void I(C2320nx c2320nx) {
        this.s.m(c2320nx);
    }

    public final void J(C2514px c2514px) {
        this.s.p(c2514px);
    }

    public final void K(C2320nx c2320nx) {
        this.s.q(c2320nx);
    }

    public final void L(C2320nx c2320nx) {
        this.s.r(c2320nx);
    }

    public final void M(C2320nx c2320nx) {
        this.s.s(c2320nx);
    }

    public final void N(C2320nx c2320nx) {
        this.s.t(c2320nx);
    }

    @Override // o.K90
    public final K3 a() {
        return (K3) this.s.p.f832o;
    }

    @Override // o.InterfaceC0592Lx
    public final void b(C3289xx c3289xx, AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx) {
        this.s.getClass();
    }

    @Override // o.InterfaceC1047au0
    public final Zt0 e() {
        return this.s.e();
    }

    @Override // o.InterfaceC1283dK
    public final C1478fK f() {
        return this.s.E;
    }

    @Override // o.zy0
    public final View v(int i) {
        return this.s.findViewById(i);
    }

    @Override // o.zy0
    public final boolean w() {
        Window window = this.s.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }
}
