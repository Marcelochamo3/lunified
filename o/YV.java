package o;

/* JADX INFO: loaded from: classes.dex */
public final class YV extends AbstractC3226xJ implements InterfaceC0360Cy {
    public final /* synthetic */ int m;
    public final /* synthetic */ C1490fW n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ YV(C1490fW c1490fW, int i) {
        super(0);
        this.m = i;
        this.n = c1490fW;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v4 java.lang.Object, still in use, count: 2, list:
          (r3v4 java.lang.Object) from 0x0031: PHI (r3 I:??) = (r3v2 java.lang.Object), (r3v4 java.lang.Object) binds: [B:14:0x0030, B:24:0x0031] A[DONT_GENERATE, DONT_INLINE]
          (r3v4 java.lang.Object) from 0x0029: CHECK_CAST (o.WV) (r3v4 java.lang.Object)
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
    @Override // o.InterfaceC0360Cy
    public final java.lang.Object c() {
        /*
            r5 = this;
            int r0 = r5.m
            switch(r0) {
                case 0: goto L3e;
                case 1: goto Ld;
                default: goto L5;
            }
        L5:
            o.fW r0 = r5.n
            r0.b()
            o.uq0 r0 = o.C2985uq0.a
            return r0
        Ld:
            o.fW r0 = r5.n
            o.WV r1 = r0.c
            r2 = 0
            if (r1 != 0) goto L34
            o.M5 r1 = r0.b
            int r3 = r1.size()
            java.util.ListIterator r1 = r1.listIterator(r3)
        L1e:
            boolean r3 = r1.hasPrevious()
            if (r3 == 0) goto L30
            java.lang.Object r3 = r1.previous()
            r4 = r3
            o.WV r4 = (o.WV) r4
            boolean r4 = r4.a
            if (r4 == 0) goto L1e
            goto L31
        L30:
            r3 = r2
        L31:
            r1 = r3
            o.WV r1 = (o.WV) r1
        L34:
            r0.c = r2
            if (r1 == 0) goto L3b
            r1.a()
        L3b:
            o.uq0 r0 = o.C2985uq0.a
            return r0
        L3e:
            o.fW r0 = r5.n
            r0.b()
            o.uq0 r0 = o.C2985uq0.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.YV.c():java.lang.Object");
    }
}
