package o;

import android.view.View;

/* JADX INFO: renamed from: o.vn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnKeyListenerC3075vn implements View.OnKeyListener {
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;

    public /* synthetic */ ViewOnKeyListenerC3075vn(int i, Object obj) {
        this.l = i;
        this.m = obj;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0073  */
    /* JADX WARN: Code duplicated, block: B:65:0x0155  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v16 java.lang.Object, still in use, count: 2, list:
          (r9v16 java.lang.Object) from 0x006f: PHI (r9 I:??) = (r9v9 java.lang.Object), (r9v16 java.lang.Object) binds: [B:31:0x006e, B:81:0x006f] A[DONT_GENERATE, DONT_INLINE]
          (r9v16 java.lang.Object) from 0x0061: CHECK_CAST (java.lang.Number) (r9v16 java.lang.Object)
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
    @Override // android.view.View.OnKeyListener
    public final boolean onKey(android.view.View r7, int r8, android.view.KeyEvent r9) {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ViewOnKeyListenerC3075vn.onKey(android.view.View, int, android.view.KeyEvent):boolean");
    }
}
