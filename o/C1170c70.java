package o;

/* JADX INFO: renamed from: o.c70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1170c70 extends Ph0 implements InterfaceC0775Sy {
    public IF m;
    public IF n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f709o;
    public final /* synthetic */ C1478fK p;
    public final /* synthetic */ TJ q;
    public final /* synthetic */ InterfaceC1608gi r;
    public final /* synthetic */ InterfaceC0775Sy s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1170c70(C1478fK c1478fK, TJ tj, InterfaceC1608gi interfaceC1608gi, InterfaceC0775Sy interfaceC0775Sy, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.p = c1478fK;
        this.q = tj;
        this.r = interfaceC1608gi;
        this.s = interfaceC0775Sy;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C1170c70) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C1170c70(this.p, this.q, this.r, this.s, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0091 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x0092  */
    /* JADX WARN: Code duplicated, block: B:33:0x009a  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bb  */
    @Override // o.R7
    public final Object r(Object obj) throws Throwable {
        IF r6;
        IF r2;
        SJ sj;
        SJ sj2;
        AH ah;
        ZJ zj;
        AH ah2;
        ZJ zj2;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.f709o;
        C2985uq0 c2985uq0 = C2985uq0.a;
        C1478fK c1478fK = this.p;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r2 = this.n;
            r6 = this.m;
            try {
                Jp0.O(obj);
                ah2 = (AH) r6.m;
                if (ah2 != null) {
                    ah2.f(null);
                }
                zj2 = (ZJ) r2.m;
                if (zj2 != null) {
                    c1478fK.f(zj2);
                }
                return c2985uq0;
            } catch (Throwable th) {
                th = th;
                ah = (AH) r6.m;
                if (ah != null) {
                    ah.f(null);
                }
                zj = (ZJ) r2.m;
                if (zj != null) {
                    c1478fK.f(zj);
                }
                throw th;
            }
        }
        Jp0.O(obj);
        if (c1478fK.d == TJ.l) {
            return c2985uq0;
        }
        IF r3 = new IF();
        IF r7 = new IF();
        try {
            TJ tj = this.q;
            InterfaceC1608gi interfaceC1608gi = this.r;
            InterfaceC0775Sy interfaceC0775Sy = this.s;
            this.m = r3;
            this.n = r7;
            this.f709o = 1;
            C1692hb c1692hb = new C1692hb(1, Ou0.p(this));
            c1692hb.y();
            SJ.Companion.getClass();
            AbstractC1474fG.j(tj, "state");
            int iOrdinal = tj.ordinal();
            if (iOrdinal == 2) {
                sj = SJ.ON_CREATE;
            } else {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        sj2 = null;
                    } else {
                        sj = SJ.ON_RESUME;
                    }
                    C1073b70 c1073b70 = new C1073b70(sj2, r3, interfaceC1608gi, QJ.a(tj), c1692hb, AbstractC1923jt0.a(), interfaceC0775Sy);
                    r7.m = c1073b70;
                    c1478fK.a(c1073b70);
                    if (c1692hb.x() == enumC1706hi) {
                        return enumC1706hi;
                    }
                    r6 = r3;
                    r2 = r7;
                    ah2 = (AH) r6.m;
                    if (ah2 != null) {
                        ah2.f(null);
                    }
                    zj2 = (ZJ) r2.m;
                    if (zj2 != null) {
                        c1478fK.f(zj2);
                    }
                    return c2985uq0;
                }
                sj = SJ.ON_START;
            }
            sj2 = sj;
            C1073b70 c1073b71 = new C1073b70(sj2, r3, interfaceC1608gi, QJ.a(tj), c1692hb, AbstractC1923jt0.a(), interfaceC0775Sy);
            r7.m = c1073b71;
            c1478fK.a(c1073b71);
            if (c1692hb.x() == enumC1706hi) {
                return enumC1706hi;
            }
            r6 = r3;
            r2 = r7;
            ah2 = (AH) r6.m;
            if (ah2 != null) {
                ah2.f(null);
            }
            zj2 = (ZJ) r2.m;
            if (zj2 != null) {
                c1478fK.f(zj2);
            }
            return c2985uq0;
        } catch (Throwable th2) {
            th = th2;
            r6 = r3;
            r2 = r7;
            ah = (AH) r6.m;
            if (ah != null) {
                ah.f(null);
            }
            zj = (ZJ) r2.m;
            if (zj != null) {
                c1478fK.f(zj);
            }
            throw th;
        }
    }
}
