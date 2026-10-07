package o;

import com.skidush.clonex.fragments.player.PlayerMobileFragment;

/* JADX INFO: loaded from: classes.dex */
public final class QZ extends AbstractC3226xJ implements InterfaceC0412Ey {
    public final /* synthetic */ int m;
    public final /* synthetic */ PlayerMobileFragment n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ QZ(PlayerMobileFragment playerMobileFragment, int i) {
        super(1);
        this.m = i;
        this.n = playerMobileFragment;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0051  */
    /* JADX WARN: Code duplicated, block: B:22:0x0068  */
    /* JADX WARN: Code duplicated, block: B:23:0x007a  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v7 java.lang.Object, still in use, count: 2, list:
          (r2v7 java.lang.Object) from 0x0047: PHI (r2 I:??) = (r2v4 java.lang.Object), (r2v7 java.lang.Object) binds: [B:14:0x0046, B:34:0x0047] A[DONT_GENERATE, DONT_INLINE]
          (r2v7 java.lang.Object) from 0x0039: CHECK_CAST (o.Ds0) (r2v7 java.lang.Object)
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
    public final java.lang.Object b(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.m
            switch(r0) {
                case 0: goto L89;
                default: goto L5;
            }
        L5:
            o.u00 r10 = (o.C2907u00) r10
            java.lang.String r0 = "server"
            o.AbstractC1474fG.j(r10, r0)
            com.skidush.clonex.fragments.player.PlayerMobileFragment r0 = r9.n
            o.Z10 r1 = r0.k0()
            o.as r2 = r0.y0
            r3 = 0
            java.lang.String r4 = "player"
            if (r2 == 0) goto L85
            long r5 = r2.C()
            o.as r2 = r0.y0
            if (r2 == 0) goto L81
            long r7 = r2.H()
            r1.k(r5, r7)
            java.util.List r1 = r0.A0
            java.util.Iterator r1 = r1.iterator()
        L2e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L46
            java.lang.Object r2 = r1.next()
            r5 = r2
            o.Ds0 r5 = (o.Ds0) r5
            java.lang.String r5 = r5.l
            java.lang.String r6 = r10.a
            boolean r5 = o.AbstractC1474fG.b(r5, r6)
            if (r5 == 0) goto L2e
            goto L47
        L46:
            r2 = r3
        L47:
            o.Ds0 r2 = (o.Ds0) r2
            if (r2 == 0) goto L7e
            boolean r10 = r0.n0()
            if (r10 == 0) goto L54
            r0.r0()
        L54:
            r0.s0()
            long r5 = android.os.SystemClock.elapsedRealtime()
            r7 = 10000(0x2710, double:4.9407E-320)
            long r5 = r5 + r7
            r0.S0 = r5
            o.Z10 r10 = r0.k0()
            o.as r0 = r0.y0
            if (r0 == 0) goto L7a
            long r0 = r0.C()
            r3 = 0
            long r0 = o.U9.f(r0, r3)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r10.g(r2, r0)
            goto L7e
        L7a:
            o.AbstractC1474fG.U(r4)
            throw r3
        L7e:
            o.uq0 r10 = o.C2985uq0.a
            return r10
        L81:
            o.AbstractC1474fG.U(r4)
            throw r3
        L85:
            o.AbstractC1474fG.U(r4)
            throw r3
        L89:
            o.z00 r10 = (o.C3392z00) r10
            java.lang.String r0 = "subtitle"
            o.AbstractC1474fG.j(r10, r0)
            com.skidush.clonex.fragments.player.PlayerMobileFragment r1 = r9.n
            o.Z10 r1 = r1.k0()
            o.yW r10 = r10.a
            o.AbstractC1474fG.j(r10, r0)
            o.Ke r0 = o.AbstractC3021v9.o(r1)
            o.Xk r2 = o.AbstractC1910jn.b
            o.P10 r3 = new o.P10
            r4 = 0
            r3.<init>(r1, r10, r4)
            r10 = 2
            r1 = 0
            o.AbstractC1376eG.w(r0, r2, r1, r3, r10)
            o.uq0 r10 = o.C2985uq0.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o.QZ.b(java.lang.Object):java.lang.Object");
    }
}
