package io.sentry;

import java.io.File;

/* JADX INFO: renamed from: io.sentry.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0089t extends AbstractC0081q implements J {
    public final K e;
    public final U f;
    public final ILogger g;

    public C0089t(K k, U u, ILogger iLogger, long j, int i) {
        super(k, iLogger, j, i);
        io.sentry.config.a.C(k, "Hub is required.");
        this.e = k;
        io.sentry.config.a.C(u, "Serializer is required.");
        this.f = u;
        io.sentry.config.a.C(iLogger, "Logger is required.");
        this.g = iLogger;
    }

    public static void d(C0089t c0089t, File file, io.sentry.hints.g gVar) {
        c0089t.getClass();
        boolean zA = gVar.a();
        ILogger iLogger = c0089t.g;
        if (zA) {
            iLogger.h(EnumC0094u1.INFO, "File not deleted since retry was marked. %s.", file.getAbsolutePath());
            return;
        }
        try {
            if (!file.delete()) {
                iLogger.h(EnumC0094u1.ERROR, "Failed to delete '%s' %s", file.getAbsolutePath(), "after trying to capture it");
            }
        } catch (Throwable th) {
            iLogger.s(EnumC0094u1.ERROR, th, "Failed to delete '%s' %s", file.getAbsolutePath(), "after trying to capture it");
        }
        iLogger.h(EnumC0094u1.DEBUG, "Deleted file %s.", file.getAbsolutePath());
    }

    @Override // io.sentry.J
    public final void a(String str, C0104y c0104y) {
        io.sentry.config.a.C(str, "Path is required.");
        c(new File(str), c0104y);
    }

    @Override // io.sentry.AbstractC0081q
    public final boolean b(String str) {
        return str.endsWith(".envelope");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b3, code lost:
    
        if (r0 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b5, code lost:
    
        d(r9, r10, (io.sentry.hints.g) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0116, code lost:
    
        if (r0 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0138, code lost:
    
        if (r0 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0159, code lost:
    
        if (r0 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x015d, code lost:
    
        return;
     */
    /* JADX WARN: Undo finally extract visitor
    java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "this.second" is null
    	at jadx.core.utils.Pair.hashCode(Pair.java:35)
    	at java.base/java.util.HashMap.hash(Unknown Source)
    	at java.base/java.util.HashMap.getNode(Unknown Source)
    	at java.base/java.util.HashMap.containsKey(Unknown Source)
    	at jadx.core.dex.visitors.finaly.traverser.state.TraverserGlobalCommonState.hasBlocksBeenCached(TraverserGlobalCommonState.java:35)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.MergePathActivePathTraverserHandler.handle(MergePathActivePathTraverserHandler.java:174)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.AbstractActivePathTraverserHandler.process(AbstractActivePathTraverserHandler.java:19)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.processHandlerImplementations(TraverserController.java:43)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.advance(TraverserController.java:156)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.process(TraverserController.java:79)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.findCommonInsns(MarkFinallyVisitor.java:404)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.extractFinally(MarkFinallyVisitor.java:284)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.processTryBlock(MarkFinallyVisitor.java:202)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.visit(MarkFinallyVisitor.java:135)
     */
    @Override // io.sentry.AbstractC0081q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.io.File r10, io.sentry.C0104y r11) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.C0089t.c(java.io.File, io.sentry.y):void");
    }
}
