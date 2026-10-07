package o;

import android.database.Cursor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Level;

/* JADX INFO: renamed from: o.w1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3102w1 implements Runnable {
    public final /* synthetic */ int l;
    public final Object m;

    public /* synthetic */ RunnableC3102w1(int i, Object obj) {
        this.l = i;
        this.m = obj;
    }

    private final void b() {
        AbstractC3066vi0 abstractC3066vi0C;
        long jNanoTime;
        while (true) {
            C3454zi0 c3454zi0 = (C3454zi0) this.m;
            synchronized (c3454zi0) {
                abstractC3066vi0C = c3454zi0.c();
            }
            if (abstractC3066vi0C == null) {
                return;
            }
            C3357yi0 c3357yi0 = abstractC3066vi0C.c;
            AbstractC1474fG.g(c3357yi0);
            C3454zi0 c3454zi1 = (C3454zi0) this.m;
            boolean zIsLoggable = C3454zi0.j.isLoggable(Level.FINE);
            if (zIsLoggable) {
                c3357yi0.a.a.getClass();
                jNanoTime = System.nanoTime();
                AbstractC1376eG.b(abstractC3066vi0C, c3357yi0, "starting");
            } else {
                jNanoTime = -1;
            }
            try {
                C3454zi0.a(c3454zi1, abstractC3066vi0C);
                if (zIsLoggable) {
                    c3357yi0.a.a.getClass();
                    AbstractC1376eG.b(abstractC3066vi0C, c3357yi0, "finished run in ".concat(AbstractC1376eG.r(System.nanoTime() - jNanoTime)));
                }
            } catch (Throwable th) {
                try {
                    L80 l80 = c3454zi1.a;
                    l80.getClass();
                    ((ThreadPoolExecutor) l80.l).execute(this);
                    throw th;
                } catch (Throwable th2) {
                    if (zIsLoggable) {
                        c3357yi0.a.a.getClass();
                        AbstractC1376eG.b(abstractC3066vi0C, c3357yi0, "failed a run in ".concat(AbstractC1376eG.r(System.nanoTime() - jNanoTime)));
                    }
                    throw th2;
                }
            }
        }
    }

    public Fc0 a() {
        C2351oG c2351oG = (C2351oG) this.m;
        Fc0 fc0 = new Fc0();
        Cursor cursorL = c2351oG.a.l(new J2("SELECT * FROM room_table_modification_log WHERE invalidated = 1;", 8), null);
        while (cursorL.moveToNext()) {
            try {
                fc0.add(Integer.valueOf(cursorL.getInt(0)));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3409z9.g(cursorL, th);
                    throw th2;
                }
            }
        }
        AbstractC3409z9.g(cursorL, null);
        Fc0 fc0C = AbstractC1370eA.c(fc0);
        if (!fc0C.l.isEmpty()) {
            if (((C2351oG) this.m).h == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            C3485zy c3485zy = ((C2351oG) this.m).h;
            if (c3485zy == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            c3485zy.f();
        }
        return fc0C;
    }

    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    /* JADX WARN: Code duplicated, block: B:101:0x01db  */
    /* JADX WARN: Code duplicated, block: B:103:0x01de  */
    /* JADX WARN: Code duplicated, block: B:104:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:98:0x01bb  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v13 java.lang.Object, still in use, count: 2, list:
          (r5v13 java.lang.Object) from 0x01b7: PHI (r5 I:??) = (r5v9 java.lang.Object), (r5v13 java.lang.Object) binds: [B:95:0x01b6, B:198:0x01b7] A[DONT_GENERATE, DONT_INLINE]
          (r5v13 java.lang.Object) from 0x01a9: CHECK_CAST (o.Xb) (r5v13 java.lang.Object)
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
    @Override // java.lang.Runnable
    public final void run() {
        /*
            Method dump skipped, instruction units count: 954
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.RunnableC3102w1.run():void");
    }
}
