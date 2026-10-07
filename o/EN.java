package o;

import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class EN extends Ww0 {
    public final boolean l;
    public final Ej0 m;
    public final Dj0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CN f236o;
    public BN p;
    public boolean q;
    public boolean r;
    public boolean s;

    public EN(AbstractC1464f8 abstractC1464f8, boolean z) {
        super(abstractC1464f8);
        this.l = z && abstractC1464f8.i();
        this.m = new Ej0();
        this.n = new Dj0();
        Fj0 fj0G = abstractC1464f8.g();
        if (fj0G == null) {
            this.f236o = new CN(new DN(abstractC1464f8.h()), Ej0.C, CN.p);
        } else {
            this.f236o = new CN(fj0G, null, null);
            this.s = true;
        }
    }

    @Override // o.AbstractC1464f8
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final BN b(CP cp, C1562g8 c1562g8, long j) {
        BN bn = new BN(cp, c1562g8, j);
        AbstractC0397Ej.f(bn.f184o == null);
        AbstractC1464f8 abstractC1464f8 = this.k;
        bn.f184o = abstractC1464f8;
        if (this.r) {
            Object obj = this.f236o.f197o;
            Object obj2 = cp.a;
            if (obj != null && obj2.equals(CN.p)) {
                obj2 = this.f236o.f197o;
            }
            bn.a(cp.b(obj2));
        } else {
            this.p = bn;
            if (!this.q) {
                this.q = true;
                w(null, abstractC1464f8);
            }
        }
        return bn;
    }

    public final void B(long j) {
        BN bn = this.p;
        int iB = this.f236o.b(bn.l.a);
        if (iB == -1) {
            return;
        }
        CN cn = this.f236o;
        Dj0 dj0 = this.n;
        cn.g(iB, dj0, false);
        long j2 = dj0.f219o;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        bn.r = j;
    }

    @Override // o.AbstractC1464f8
    public final void n(InterfaceC2941uP interfaceC2941uP) {
        ((BN) interfaceC2941uP).f();
        if (interfaceC2941uP == this.p) {
            this.p = null;
        }
    }

    @Override // o.AbstractC1506fg, o.AbstractC1464f8
    public final void p() {
        this.r = false;
        this.q = false;
        super.p();
    }

    @Override // o.Ww0
    public final CP x(CP cp) {
        Object obj = cp.a;
        Object obj2 = this.f236o.f197o;
        if (obj2 != null && obj2.equals(obj)) {
            obj = CN.p;
        }
        return cp.b(obj);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006d  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // o.Ww0
    public final void y(Fj0 fj0) {
        long j;
        CN cn;
        CP cpB;
        CN cn2;
        if (this.r) {
            CN cn3 = this.f236o;
            this.f236o = new CN(fj0, cn3.n, cn3.f197o);
            BN bn = this.p;
            if (bn != null) {
                B(bn.r);
            }
        } else {
            if (!fj0.q()) {
                Ej0 ej0 = this.m;
                fj0.o(0, ej0);
                long j2 = ej0.x;
                Object obj = ej0.l;
                BN bn2 = this.p;
                if (bn2 != null) {
                    CN cn4 = this.f236o;
                    Object obj2 = bn2.l.a;
                    Dj0 dj0 = this.n;
                    cn4.h(obj2, dj0);
                    long j3 = dj0.p + bn2.m;
                    this.f236o.n(0, ej0, 0L);
                    if (j3 != ej0.x) {
                        j = j3;
                    } else {
                        j = j2;
                    }
                } else {
                    j = j2;
                }
                Pair pairJ = fj0.j(this.m, this.n, 0, j);
                Object obj3 = pairJ.first;
                long jLongValue = ((Long) pairJ.second).longValue();
                if (this.s) {
                    CN cn5 = this.f236o;
                    cn = new CN(fj0, cn5.n, cn5.f197o);
                } else {
                    cn = new CN(fj0, obj, obj3);
                }
                this.f236o = cn;
                BN bn3 = this.p;
                if (bn3 != null) {
                    B(jLongValue);
                    CP cp = bn3.l;
                    Object obj4 = cp.a;
                    if (this.f236o.f197o != null && obj4.equals(CN.p)) {
                        obj4 = this.f236o.f197o;
                    }
                    cpB = cp.b(obj4);
                }
                this.s = true;
                this.r = true;
                m(this.f236o);
                if (cpB != null) {
                    BN bn4 = this.p;
                    bn4.getClass();
                    bn4.a(cpB);
                }
            }
            if (this.s) {
                CN cn6 = this.f236o;
                cn2 = new CN(fj0, cn6.n, cn6.f197o);
            } else {
                cn2 = new CN(fj0, Ej0.C, CN.p);
            }
            this.f236o = cn2;
        }
        cpB = null;
        this.s = true;
        this.r = true;
        m(this.f236o);
        if (cpB != null) {
            BN bn5 = this.p;
            bn5.getClass();
            bn5.a(cpB);
        }
    }

    @Override // o.Ww0
    public final void z() {
        if (this.l) {
            return;
        }
        this.q = true;
        w(null, this.k);
    }

    @Override // o.AbstractC1506fg, o.AbstractC1464f8
    public final void j() {
    }
}
