package o;

import java.util.List;

/* JADX INFO: renamed from: o.vQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3039vQ implements InterfaceC1920js {
    public final InterfaceC1920js a;
    public final Zl0 b;

    public C3039vQ(InterfaceC1920js interfaceC1920js, Zl0 zl0) {
        this.a = interfaceC1920js;
        this.b = zl0;
    }

    @Override // o.InterfaceC1920js
    public final int a(C0643Nw c0643Nw) {
        return this.a.a(c0643Nw);
    }

    @Override // o.InterfaceC1920js
    public final void b(boolean z) {
        this.a.b(z);
    }

    @Override // o.InterfaceC1920js
    public final boolean c(int i, long j) {
        return this.a.c(i, j);
    }

    @Override // o.InterfaceC1920js
    public final C0643Nw d(int i) {
        return this.a.d(i);
    }

    @Override // o.InterfaceC1920js
    public final void e() {
        this.a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3039vQ)) {
            return false;
        }
        C3039vQ c3039vQ = (C3039vQ) obj;
        return this.a.equals(c3039vQ.a) && this.b.equals(c3039vQ.b);
    }

    @Override // o.InterfaceC1920js
    public final int f(int i) {
        return this.a.f(i);
    }

    @Override // o.InterfaceC1920js
    public final int g(long j, List list) {
        return this.a.g(j, list);
    }

    @Override // o.InterfaceC1920js
    public final void h() {
        this.a.h();
    }

    public final int hashCode() {
        return this.a.hashCode() + ((this.b.hashCode() + 527) * 31);
    }

    @Override // o.InterfaceC1920js
    public final int i() {
        return this.a.i();
    }

    @Override // o.InterfaceC1920js
    public final Zl0 j() {
        return this.b;
    }

    @Override // o.InterfaceC1920js
    public final C0643Nw k() {
        return this.a.k();
    }

    @Override // o.InterfaceC1920js
    public final boolean l(long j, AbstractC2764sd abstractC2764sd, List list) {
        return this.a.l(j, abstractC2764sd, list);
    }

    @Override // o.InterfaceC1920js
    public final int length() {
        return this.a.length();
    }

    @Override // o.InterfaceC1920js
    public final int m() {
        return this.a.m();
    }

    @Override // o.InterfaceC1920js
    public final int n() {
        return this.a.n();
    }

    @Override // o.InterfaceC1920js
    public final boolean o(int i, long j) {
        return this.a.o(i, j);
    }

    @Override // o.InterfaceC1920js
    public final void p(float f) {
        this.a.p(f);
    }

    @Override // o.InterfaceC1920js
    public final Object q() {
        return this.a.q();
    }

    @Override // o.InterfaceC1920js
    public final void r() {
        this.a.r();
    }

    @Override // o.InterfaceC1920js
    public final void s(long j, long j2, long j3, List list, InterfaceC2940uO[] interfaceC2940uOArr) {
        this.a.s(j, j2, j3, list, interfaceC2940uOArr);
    }

    @Override // o.InterfaceC1920js
    public final void t() {
        this.a.t();
    }

    @Override // o.InterfaceC1920js
    public final int u(int i) {
        return this.a.u(i);
    }
}
