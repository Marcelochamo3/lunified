package o;

import com.skidush.clonex.database.AppDatabase;

/* JADX INFO: renamed from: o.ju, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1924ju extends Ph0 implements InterfaceC0827Uy {
    public final /* synthetic */ int m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ InterfaceC1734hw f856o;
    public /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1924ju(Object obj, InterfaceC0473Hh interfaceC0473Hh, int i) {
        super(3, interfaceC0473Hh);
        this.m = i;
        this.q = obj;
    }

    @Override // o.InterfaceC0827Uy
    public final Object f(Object obj, Object obj2, Object obj3) {
        InterfaceC1734hw interfaceC1734hw = (InterfaceC1734hw) obj;
        switch (this.m) {
            case 0:
                C1924ju c1924ju = new C1924ju((InterfaceC0473Hh) obj3, (C2314nu) this.q, 0);
                c1924ju.f856o = interfaceC1734hw;
                c1924ju.p = (Object[]) obj2;
                return c1924ju.r(C2985uq0.a);
            case 1:
                C1924ju c1924ju2 = new C1924ju((InterfaceC0473Hh) obj3, (InterfaceC0853Vy) this.q, 1);
                c1924ju2.f856o = interfaceC1734hw;
                c1924ju2.p = (Object[]) obj2;
                return c1924ju2.r(C2985uq0.a);
            case 2:
                C1924ju c1924ju3 = new C1924ju((InterfaceC0473Hh) obj3, this.q, 2);
                c1924ju3.f856o = interfaceC1734hw;
                c1924ju3.p = (Object[]) obj2;
                return c1924ju3.r(C2985uq0.a);
            case 3:
                C1924ju c1924ju4 = new C1924ju((InterfaceC0473Hh) obj3, this.q, 3);
                c1924ju4.f856o = interfaceC1734hw;
                c1924ju4.p = (Object[]) obj2;
                return c1924ju4.r(C2985uq0.a);
            case 4:
                C1924ju c1924ju5 = new C1924ju((InterfaceC0827Uy) this.q, (InterfaceC0473Hh) obj3, 4);
                c1924ju5.f856o = interfaceC1734hw;
                c1924ju5.p = (Object[]) obj2;
                return c1924ju5.r(C2985uq0.a);
            case 5:
                C1924ju c1924ju6 = new C1924ju((InterfaceC0473Hh) obj3, (IB) this.q, 5);
                c1924ju6.f856o = interfaceC1734hw;
                c1924ju6.p = (Object[]) obj2;
                return c1924ju6.r(C2985uq0.a);
            case 6:
                C1924ju c1924ju7 = new C1924ju((InterfaceC0473Hh) obj3, (RC) this.q, 6);
                c1924ju7.f856o = interfaceC1734hw;
                c1924ju7.p = (Object[]) obj2;
                return c1924ju7.r(C2985uq0.a);
            case 7:
                C1924ju c1924ju8 = new C1924ju((AppDatabase) this.q, (InterfaceC0473Hh) obj3, 7);
                c1924ju8.f856o = interfaceC1734hw;
                c1924ju8.p = (AbstractC2169mS) obj2;
                return c1924ju8.r(C2985uq0.a);
            case 8:
                C1924ju c1924ju9 = new C1924ju((C1302db0) this.q, (InterfaceC0473Hh) obj3, 8);
                c1924ju9.f856o = interfaceC1734hw;
                c1924ju9.p = (AbstractC1107bb0) obj2;
                return c1924ju9.r(C2985uq0.a);
            default:
                C1924ju c1924ju10 = new C1924ju((AppDatabase) this.q, (InterfaceC0473Hh) obj3, 9);
                c1924ju10.f856o = interfaceC1734hw;
                c1924ju10.p = (AbstractC1818ip0) obj2;
                return c1924ju10.r(C2985uq0.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:120:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:121:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:133:0x02df  */
    /* JADX WARN: Code duplicated, block: B:134:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:228:0x0541  */
    /* JADX WARN: Code duplicated, block: B:255:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:92:0x0200  */
    /* JADX WARN: Code duplicated, block: B:93:0x0204  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r25v4 java.lang.Object, still in use, count: 2, list:
          (r25v4 java.lang.Object) from 0x01fc: PHI (r25 I:??) = (r25v1 java.lang.Object), (r25v4 java.lang.Object) binds: [B:89:0x01fa, B:420:0x01fc] A[DONT_GENERATE, DONT_INLINE]
          (r25v4 java.lang.Object) from 0x01eb: CHECK_CAST (o.Q30) (r25v4 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // o.R7
    public final java.lang.Object r(java.lang.Object r31) {
        /*
            Method dump skipped, instruction units count: 2266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1924ju.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1924ju(InterfaceC0473Hh interfaceC0473Hh, Object obj, int i) {
        super(3, interfaceC0473Hh);
        this.m = i;
        this.q = obj;
    }
}
