package o;

import java.util.List;

/* JADX INFO: renamed from: o.pS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2460pS extends Ph0 implements InterfaceC0827Uy {
    public final /* synthetic */ int m;
    public /* synthetic */ List n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f970o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2460pS(int i, InterfaceC0473Hh interfaceC0473Hh, int i2) {
        super(i, interfaceC0473Hh);
        this.m = i2;
    }

    @Override // o.InterfaceC0827Uy
    public final Object f(Object obj, Object obj2, Object obj3) {
        switch (this.m) {
            case 0:
                C2460pS c2460pS = new C2460pS(3, (InterfaceC0473Hh) obj3, 0);
                c2460pS.f970o = (AbstractC2169mS) obj;
                c2460pS.n = (List) obj2;
                return c2460pS.r(C2985uq0.a);
            case 1:
                C2460pS c2460pS2 = new C2460pS(3, (InterfaceC0473Hh) obj3, 1);
                c2460pS2.f970o = (AbstractC1107bb0) obj;
                c2460pS2.n = (List) obj2;
                return c2460pS2.r(C2985uq0.a);
            default:
                C2460pS c2460pS3 = new C2460pS(3, (InterfaceC0473Hh) obj3, 2);
                c2460pS3.f970o = (AbstractC1818ip0) obj;
                c2460pS3.n = (List) obj2;
                return c2460pS3.r(C2985uq0.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x0054  */
    /* JADX WARN: Code duplicated, block: B:20:0x005b  */
    /* JADX WARN: Code duplicated, block: B:21:0x005d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0061  */
    /* JADX WARN: Code duplicated, block: B:25:0x0063  */
    /* JADX WARN: Code duplicated, block: B:27:0x0066  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:77:0x015b  */
    /* JADX WARN: Code duplicated, block: B:80:0x0164  */
    /* JADX WARN: Code duplicated, block: B:82:0x0167  */
    /* JADX WARN: Code duplicated, block: B:88:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0103 A[SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v6 java.lang.Object, still in use, count: 2, list:
          (r5v6 java.lang.Object) from 0x0157: PHI (r5 I:??) = (r5v1 java.lang.Object), (r5v6 java.lang.Object) binds: [B:74:0x0156, B:105:0x0157] A[DONT_GENERATE, DONT_INLINE]
          (r5v6 java.lang.Object) from 0x0149: CHECK_CAST (o.eR) (r5v6 java.lang.Object)
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
    public final java.lang.Object r(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2460pS.r(java.lang.Object):java.lang.Object");
    }
}
