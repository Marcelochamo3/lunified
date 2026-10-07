package o;

import java.util.ArrayList;

/* JADX INFO: renamed from: o.He, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0470He extends Ww0 {
    public final long l;
    public final long m;
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f308o;
    public final boolean p;
    public final ArrayList q;
    public final Ej0 r;
    public C0418Fe s;
    public C0444Ge t;
    public long u;
    public long v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0470He(AbstractC1464f8 abstractC1464f8, long j, long j2, boolean z, boolean z2, boolean z3) {
        super(abstractC1464f8);
        abstractC1464f8.getClass();
        AbstractC0397Ej.c(j >= 0);
        this.l = j;
        this.m = j2;
        this.n = z;
        this.f308o = z2;
        this.p = z3;
        this.q = new ArrayList();
        this.r = new Ej0();
    }

    public final void A(Fj0 fj0) {
        long j;
        long j2;
        long j3;
        Ej0 ej0 = this.r;
        fj0.o(0, ej0);
        long j4 = ej0.B;
        C0418Fe c0418Fe = this.s;
        ArrayList arrayList = this.q;
        long j5 = this.m;
        if (c0418Fe == null || arrayList.isEmpty() || this.f308o) {
            boolean z = this.p;
            long j6 = this.l;
            if (z) {
                long j7 = ej0.x;
                j6 += j7;
                j = j7 + j5;
            } else {
                j = j5;
            }
            this.u = j4 + j6;
            this.v = j5 != Long.MIN_VALUE ? j4 + j : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C0392Ee c0392Ee = (C0392Ee) arrayList.get(i);
                long j8 = this.u;
                long j9 = this.v;
                c0392Ee.p = j8;
                c0392Ee.q = j9;
            }
            j2 = j6;
            j3 = j;
        } else {
            long j10 = this.u - j4;
            j3 = j5 != Long.MIN_VALUE ? this.v - j4 : Long.MIN_VALUE;
            j2 = j10;
        }
        try {
            C0418Fe c0418Fe2 = new C0418Fe(fj0, j2, j3);
            this.s = c0418Fe2;
            m(c0418Fe2);
        } catch (C0444Ge e) {
            this.t = e;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((C0392Ee) arrayList.get(i2)).r = this.t;
            }
        }
    }

    @Override // o.AbstractC1464f8
    public final InterfaceC2941uP b(CP cp, C1562g8 c1562g8, long j) {
        C0392Ee c0392Ee = new C0392Ee(this.k.b(cp, c1562g8, j), this.n, this.u, this.v);
        this.q.add(c0392Ee);
        return c0392Ee;
    }

    @Override // o.AbstractC1506fg, o.AbstractC1464f8
    public final void j() throws C0444Ge {
        C0444Ge c0444Ge = this.t;
        if (c0444Ge != null) {
            throw c0444Ge;
        }
        super.j();
    }

    @Override // o.AbstractC1464f8
    public final void n(InterfaceC2941uP interfaceC2941uP) {
        ArrayList arrayList = this.q;
        AbstractC0397Ej.f(arrayList.remove(interfaceC2941uP));
        this.k.n(((C0392Ee) interfaceC2941uP).l);
        if (!arrayList.isEmpty() || this.f308o) {
            return;
        }
        C0418Fe c0418Fe = this.s;
        c0418Fe.getClass();
        A(c0418Fe.m);
    }

    @Override // o.AbstractC1506fg, o.AbstractC1464f8
    public final void p() {
        super.p();
        this.t = null;
        this.s = null;
    }

    @Override // o.Ww0
    public final void y(Fj0 fj0) {
        if (this.t != null) {
            return;
        }
        A(fj0);
    }
}
