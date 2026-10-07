package o;

import java.util.ArrayList;

/* JADX INFO: renamed from: o.h70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1659h70 extends AbstractC1853j70 implements InterfaceC1219cj {
    public final Ab0 q;

    public C1659h70(long j, C0643Nw c0643Nw, AbstractC0985aF abstractC0985aF, Ab0 ab0, ArrayList arrayList) {
        super(c0643Nw, abstractC0985aF, ab0, arrayList);
        this.q = ab0;
    }

    @Override // o.AbstractC1853j70
    public final String a() {
        return null;
    }

    @Override // o.InterfaceC1219cj
    public final long b(long j) {
        return this.q.g(j);
    }

    @Override // o.InterfaceC1219cj
    public final long c(long j, long j2) {
        return this.q.f(j, j2);
    }

    @Override // o.AbstractC1853j70
    public final C2433p50 e() {
        return null;
    }

    @Override // o.InterfaceC1219cj
    public final long g(long j, long j2) {
        return this.q.e(j, j2);
    }

    @Override // o.InterfaceC1219cj
    public final long j(long j, long j2) {
        return this.q.c(j, j2);
    }

    @Override // o.InterfaceC1219cj
    public final long m(long j, long j2) {
        Ab0 ab0 = this.q;
        if (ab0.f != null) {
            return -9223372036854775807L;
        }
        long jB = ab0.b(j, j2) + ab0.c(j, j2);
        return (ab0.e(jB, j) + ab0.g(jB)) - ab0.i;
    }

    @Override // o.InterfaceC1219cj
    public final C2433p50 n(long j) {
        return this.q.h(j, this);
    }

    @Override // o.InterfaceC1219cj
    public final boolean r() {
        return this.q.i();
    }

    @Override // o.InterfaceC1219cj
    public final long u() {
        return this.q.d;
    }

    @Override // o.InterfaceC1219cj
    public final long y(long j) {
        return this.q.d(j);
    }

    @Override // o.InterfaceC1219cj
    public final long z(long j, long j2) {
        return this.q.b(j, j2);
    }

    @Override // o.AbstractC1853j70
    public final InterfaceC1219cj d() {
        return this;
    }
}
