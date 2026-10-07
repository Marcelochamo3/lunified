package o;

import java.util.List;

/* JADX INFO: renamed from: o.Kz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0569Kz extends Ph0 implements InterfaceC0853Vy {
    public final /* synthetic */ int m;
    public /* synthetic */ List n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ List f373o;
    public /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0569Kz(int i, InterfaceC0473Hh interfaceC0473Hh, int i2) {
        super(i, interfaceC0473Hh);
        this.m = i2;
    }

    @Override // o.InterfaceC0853Vy
    public final Object n(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.m) {
            case 0:
                C0569Kz c0569Kz = new C0569Kz(4, (InterfaceC0473Hh) obj4, 0);
                c0569Kz.p = (AbstractC0439Fz) obj;
                c0569Kz.n = (List) obj2;
                c0569Kz.f373o = (List) obj3;
                return c0569Kz.r(C2985uq0.a);
            case 1:
                C0569Kz c0569Kz2 = new C0569Kz(4, (InterfaceC0473Hh) obj4, 1);
                c0569Kz2.p = (AbstractC3338yY) obj;
                c0569Kz2.n = (List) obj2;
                c0569Kz2.f373o = (List) obj3;
                return c0569Kz2.r(C2985uq0.a);
            default:
                C0569Kz c0569Kz3 = new C0569Kz(4, (InterfaceC0473Hh) obj4, 2);
                c0569Kz3.p = (Ea0) obj;
                c0569Kz3.n = (List) obj2;
                c0569Kz3.f373o = (List) obj3;
                return c0569Kz3.r(C2985uq0.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0210  */
    /* JADX WARN: Code duplicated, block: B:119:0x021b  */
    /* JADX WARN: Code duplicated, block: B:121:0x021e  */
    /* JADX WARN: Code duplicated, block: B:122:0x0228  */
    /* JADX WARN: Code duplicated, block: B:134:0x0253  */
    /* JADX WARN: Code duplicated, block: B:136:0x025c  */
    /* JADX WARN: Code duplicated, block: B:137:0x025e  */
    /* JADX WARN: Code duplicated, block: B:140:0x0262  */
    /* JADX WARN: Code duplicated, block: B:142:0x0265  */
    /* JADX WARN: Code duplicated, block: B:143:0x027a  */
    /* JADX WARN: Code duplicated, block: B:20:0x005f  */
    /* JADX WARN: Code duplicated, block: B:23:0x006a  */
    /* JADX WARN: Code duplicated, block: B:25:0x006d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0077  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:67:0x0132  */
    /* JADX WARN: Code duplicated, block: B:70:0x013d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0140  */
    /* JADX WARN: Code duplicated, block: B:73:0x014a  */
    /* JADX WARN: Code duplicated, block: B:85:0x0175  */
    /* JADX WARN: Code duplicated, block: B:87:0x017e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0180  */
    /* JADX WARN: Code duplicated, block: B:91:0x0184  */
    /* JADX WARN: Code duplicated, block: B:93:0x0187  */
    /* JADX WARN: Code duplicated, block: B:94:0x019c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [o.eR] */
    /* JADX WARN: Type inference failed for: r6v12, types: [o.eR] */
    /* JADX WARN: Type inference failed for: r6v6, types: [o.w3] */
    /* JADX WARN: Type inference failed for: r6v7, types: [o.lo0] */
    /* JADX WARN: Type inference failed for: r6v8, types: [o.lo0] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10, types: [o.eR] */
    /* JADX WARN: Type inference failed for: r7v16, types: [o.lo0] */
    /* JADX WARN: Type inference failed for: r7v17, types: [o.lo0] */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v19, types: [o.eR] */
    /* JADX WARN: Type inference failed for: r7v21, types: [o.eR] */
    /* JADX WARN: Type inference failed for: r7v5, types: [o.lo0] */
    /* JADX WARN: Type inference failed for: r7v6, types: [o.lo0] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8, types: [o.eR] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v11 java.lang.Object, still in use, count: 2, list:
          (r11v11 java.lang.Object) from 0x020c: PHI (r11 I:??) = (r11v6 java.lang.Object), (r11v11 java.lang.Object) binds: [B:113:0x020b, B:180:0x020c] A[DONT_GENERATE, DONT_INLINE]
          (r11v11 java.lang.Object) from 0x01fb: CHECK_CAST (o.eR) (r11v11 java.lang.Object)
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
    public final java.lang.Object r(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 670
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0569Kz.r(java.lang.Object):java.lang.Object");
    }
}
