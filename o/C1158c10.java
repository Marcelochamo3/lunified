package o;

import com.skidush.clonex.fragments.player.PlayerTvFragment;

/* JADX INFO: renamed from: o.c10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1158c10 extends AbstractC3226xJ implements InterfaceC0412Ey {
    public final /* synthetic */ int m;
    public final /* synthetic */ PlayerTvFragment n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1158c10(PlayerTvFragment playerTvFragment, int i) {
        super(1);
        this.m = i;
        this.n = playerTvFragment;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0052  */
    /* JADX WARN: Code duplicated, block: B:21:0x0058  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v5 java.lang.Object, still in use, count: 2, list:
          (r4v5 java.lang.Object) from 0x004e: PHI (r4 I:??) = (r4v2 java.lang.Object), (r4v5 java.lang.Object) binds: [B:16:0x004d, B:28:0x004e] A[DONT_GENERATE, DONT_INLINE]
          (r4v5 java.lang.Object) from 0x0040: CHECK_CAST (o.Ds0) (r4v5 java.lang.Object)
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
                case 0: goto L75;
                default: goto L5;
            }
        L5:
            o.u00 r10 = (o.C2907u00) r10
            java.lang.String r0 = "server"
            o.AbstractC1474fG.j(r10, r0)
            com.skidush.clonex.fragments.player.PlayerTvFragment r0 = r9.n
            o.as r1 = r0.D0
            r2 = 0
            if (r1 == 0) goto L1c
            long r4 = r1.C()
            long r2 = o.U9.f(r4, r2)
        L1c:
            o.as r1 = r0.D0
            if (r1 == 0) goto L2f
            o.Z10 r4 = r0.n0()
            long r5 = r1.C()
            long r7 = r1.H()
            r4.k(r5, r7)
        L2f:
            java.util.List r1 = r0.F0
            java.util.Iterator r1 = r1.iterator()
        L35:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L4d
            java.lang.Object r4 = r1.next()
            r5 = r4
            o.Ds0 r5 = (o.Ds0) r5
            java.lang.String r5 = r5.l
            java.lang.String r6 = r10.a
            boolean r5 = o.AbstractC1474fG.b(r5, r6)
            if (r5 == 0) goto L35
            goto L4e
        L4d:
            r4 = 0
        L4e:
            o.Ds0 r4 = (o.Ds0) r4
            if (r4 == 0) goto L72
            boolean r10 = r0.t0()
            if (r10 == 0) goto L5b
            r0.A0()
        L5b:
            com.skidush.clonex.fragments.player.PlayerTvFragment.Y(r0)
            long r5 = android.os.SystemClock.elapsedRealtime()
            r7 = 10000(0x2710, double:4.9407E-320)
            long r5 = r5 + r7
            r0.X0 = r5
            o.Z10 r10 = r0.n0()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r10.g(r4, r0)
        L72:
            o.uq0 r10 = o.C2985uq0.a
            return r10
        L75:
            o.z00 r10 = (o.C3392z00) r10
            java.lang.String r0 = "subtitle"
            o.AbstractC1474fG.j(r10, r0)
            com.skidush.clonex.fragments.player.PlayerTvFragment r1 = r9.n
            o.Z10 r1 = r1.n0()
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
        throw new UnsupportedOperationException("Method not decompiled: o.C1158c10.b(java.lang.Object):java.lang.Object");
    }
}
