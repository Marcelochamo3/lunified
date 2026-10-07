package o;

/* JADX INFO: loaded from: classes.dex */
public final class XV extends AbstractC3226xJ implements InterfaceC0412Ey {
    public final /* synthetic */ int m;
    public final /* synthetic */ C1490fW n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ XV(C1490fW c1490fW, int i) {
        super(1);
        this.m = i;
        this.n = c1490fW;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0065  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v5 java.lang.Object, still in use, count: 2, list:
          (r2v5 java.lang.Object) from 0x005f: PHI (r2 I:??) = (r2v2 java.lang.Object), (r2v5 java.lang.Object) binds: [B:24:0x005e, B:34:0x005f] A[DONT_GENERATE, DONT_INLINE]
          (r2v5 java.lang.Object) from 0x0057: CHECK_CAST (o.WV) (r2v5 java.lang.Object)
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
    @Override // o.InterfaceC0412Ey
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.m
            switch(r0) {
                case 0: goto L39;
                default: goto L5;
            }
        L5:
            o.E7 r5 = (o.E7) r5
            java.lang.String r0 = "backEvent"
            o.AbstractC1474fG.j(r5, r0)
            o.fW r0 = r4.n
            o.WV r1 = r0.c
            if (r1 != 0) goto L31
            o.M5 r0 = r0.b
            int r1 = r0.size()
            java.util.ListIterator r0 = r0.listIterator(r1)
        L1c:
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r0.previous()
            r2 = r1
            o.WV r2 = (o.WV) r2
            boolean r2 = r2.a
            if (r2 == 0) goto L1c
            goto L2f
        L2e:
            r1 = 0
        L2f:
            o.WV r1 = (o.WV) r1
        L31:
            if (r1 == 0) goto L36
            r1.c(r5)
        L36:
            o.uq0 r5 = o.C2985uq0.a
            return r5
        L39:
            o.E7 r5 = (o.E7) r5
            java.lang.String r0 = "backEvent"
            o.AbstractC1474fG.j(r5, r0)
            o.fW r0 = r4.n
            o.M5 r1 = r0.b
            int r2 = r1.size()
            java.util.ListIterator r1 = r1.listIterator(r2)
        L4c:
            boolean r2 = r1.hasPrevious()
            if (r2 == 0) goto L5e
            java.lang.Object r2 = r1.previous()
            r3 = r2
            o.WV r3 = (o.WV) r3
            boolean r3 = r3.a
            if (r3 == 0) goto L4c
            goto L5f
        L5e:
            r2 = 0
        L5f:
            o.WV r2 = (o.WV) r2
            r0.c = r2
            if (r2 == 0) goto L68
            r2.d(r5)
        L68:
            o.uq0 r5 = o.C2985uq0.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.XV.b(java.lang.Object):java.lang.Object");
    }
}
