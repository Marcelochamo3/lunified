package io.sentry;

import io.sentry.protocol.C0076c;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes.dex */
public final class G0 extends AbstractC0081q implements J {
    public static final Charset i = Charset.forName("UTF-8");
    public final K e;
    public final I f;
    public final U g;
    public final ILogger h;

    public G0(K k, I i2, U u, ILogger iLogger, long j, int i3) {
        super(k, iLogger, j, i3);
        io.sentry.config.a.C(k, "Hub is required.");
        this.e = k;
        io.sentry.config.a.C(i2, "Envelope reader is required.");
        this.f = i2;
        io.sentry.config.a.C(u, "Serializer is required.");
        this.g = u;
        io.sentry.config.a.C(iLogger, "Logger is required.");
        this.h = iLogger;
    }

    public static /* synthetic */ void d(G0 g0, File file, io.sentry.hints.g gVar) {
        ILogger iLogger = g0.h;
        if (gVar.a()) {
            return;
        }
        try {
            if (file.delete()) {
                return;
            }
            iLogger.h(EnumC0094u1.ERROR, "Failed to delete: %s", file.getAbsolutePath());
        } catch (RuntimeException e) {
            iLogger.s(EnumC0094u1.ERROR, e, "Failed to delete: %s", file.getAbsolutePath());
        }
    }

    @Override // io.sentry.J
    public final void a(String str, C0104y c0104y) {
        io.sentry.config.a.C(str, "Path is required.");
        c(new File(str), c0104y);
    }

    @Override // io.sentry.AbstractC0081q
    public final boolean b(String str) {
        return (str == null || str.startsWith("session") || str.startsWith("previous_session") || str.startsWith("startup_crash")) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0067, code lost:
    
        if (r0 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0069, code lost:
    
        d(r8, r9, (io.sentry.hints.g) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0095, code lost:
    
        if (r0 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0098, code lost:
    
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
    public final void c(java.io.File r9, io.sentry.C0104y r10) {
        /*
            r8 = this;
            r0 = 0
            r1 = 1
            java.lang.Class<io.sentry.hints.g> r2 = io.sentry.hints.g.class
            java.lang.String r3 = r9.getName()
            boolean r3 = r8.b(r3)
            io.sentry.ILogger r4 = r8.h
            if (r3 != 0) goto L20
            io.sentry.u1 r10 = io.sentry.EnumC0094u1.DEBUG
            java.lang.String r9 = r9.getAbsolutePath()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r9
            java.lang.String r9 = "File '%s' should be ignored."
            r4.h(r10, r9, r1)
            return
        L20:
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L75
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L75
            r5.<init>(r9)     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L75
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L75
            io.sentry.I r5 = r8.f     // Catch: java.lang.Throwable -> L42
            io.sentry.s1 r5 = r5.x(r3)     // Catch: java.lang.Throwable -> L42
            if (r5 != 0) goto L44
            io.sentry.u1 r5 = io.sentry.EnumC0094u1.ERROR     // Catch: java.lang.Throwable -> L42
            java.lang.String r6 = "Stream from path %s resulted in a null envelope."
            java.lang.String r7 = r9.getAbsolutePath()     // Catch: java.lang.Throwable -> L42
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L42
            r1[r0] = r7     // Catch: java.lang.Throwable -> L42
            r4.h(r5, r6, r1)     // Catch: java.lang.Throwable -> L42
            goto L56
        L42:
            r0 = move-exception
            goto L77
        L44:
            r8.f(r5, r10)     // Catch: java.lang.Throwable -> L42
            io.sentry.u1 r5 = io.sentry.EnumC0094u1.DEBUG     // Catch: java.lang.Throwable -> L42
            java.lang.String r6 = "File '%s' is done."
            java.lang.String r7 = r9.getAbsolutePath()     // Catch: java.lang.Throwable -> L42
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L42
            r1[r0] = r7     // Catch: java.lang.Throwable -> L42
            r4.h(r5, r6, r1)     // Catch: java.lang.Throwable -> L42
        L56:
            r3.close()     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L75
            java.lang.Object r0 = io.sentry.config.a.q(r10)
            java.lang.Object r10 = io.sentry.config.a.q(r10)
            boolean r10 = r2.isInstance(r10)
            if (r10 == 0) goto L6f
            if (r0 == 0) goto L6f
        L69:
            io.sentry.hints.g r0 = (io.sentry.hints.g) r0
            d(r8, r9, r0)
            goto L98
        L6f:
            io.sentry.config.a.y(r2, r0, r4)
            goto L98
        L73:
            r0 = move-exception
            goto L99
        L75:
            r0 = move-exception
            goto L80
        L77:
            r3.close()     // Catch: java.lang.Throwable -> L7b
            goto L7f
        L7b:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L75
        L7f:
            throw r0     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L75
        L80:
            io.sentry.u1 r1 = io.sentry.EnumC0094u1.ERROR     // Catch: java.lang.Throwable -> L73
            java.lang.String r3 = "Error processing envelope."
            r4.v(r1, r3, r0)     // Catch: java.lang.Throwable -> L73
            java.lang.Object r0 = io.sentry.config.a.q(r10)
            java.lang.Object r10 = io.sentry.config.a.q(r10)
            boolean r10 = r2.isInstance(r10)
            if (r10 == 0) goto L6f
            if (r0 == 0) goto L6f
            goto L69
        L98:
            return
        L99:
            java.lang.Object r1 = io.sentry.config.a.q(r10)
            java.lang.Object r10 = io.sentry.config.a.q(r10)
            boolean r10 = r2.isInstance(r10)
            if (r10 == 0) goto Laf
            if (r1 == 0) goto Laf
            io.sentry.hints.g r1 = (io.sentry.hints.g) r1
            d(r8, r9, r1)
            goto Lb2
        Laf:
            io.sentry.config.a.y(r2, r1, r4)
        Lb2:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.G0.c(java.io.File, io.sentry.y):void");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final e2 e(d2 d2Var) {
        String str;
        ILogger iLogger = this.h;
        if (d2Var != null && (str = d2Var.s) != null) {
            try {
                Double dValueOf = Double.valueOf(Double.parseDouble(str));
                if (io.sentry.config.a.x(dValueOf, false)) {
                    return new e2(Boolean.TRUE, dValueOf);
                }
                iLogger.h(EnumC0094u1.ERROR, "Invalid sample rate parsed from TraceContext: %s", str);
            } catch (Exception unused) {
                iLogger.h(EnumC0094u1.ERROR, "Unable to parse sample rate from TraceContext: %s", str);
            }
        }
        return new e2(Boolean.TRUE, null);
    }

    public final void f(C0088s1 c0088s1, C0104y c0104y) {
        int size;
        Iterator it;
        Throwable th;
        C0088s1 c0088s2 = c0088s1;
        char c = 0;
        int i2 = 1;
        EnumC0094u1 enumC0094u1 = EnumC0094u1.DEBUG;
        Iterable iterable = (Iterable) c0088s2.m;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            Iterator it2 = iterable.iterator();
            int i3 = 0;
            while (it2.hasNext()) {
                it2.next();
                i3++;
            }
            size = i3;
        }
        Object[] objArr = {Integer.valueOf(size)};
        ILogger iLogger = this.h;
        iLogger.h(enumC0094u1, "Processing Envelope with %d item(s)", objArr);
        Iterator it3 = iterable.iterator();
        int i4 = 0;
        while (it3.hasNext()) {
            C0070o1 c0070o1 = (C0070o1) it3.next();
            int i5 = i4 + 1;
            C0073p1 c0073p1 = c0070o1.a;
            if (c0073p1 == null) {
                EnumC0094u1 enumC0094u2 = EnumC0094u1.ERROR;
                Object[] objArr2 = new Object[i2];
                objArr2[c] = Integer.valueOf(i5);
                iLogger.h(enumC0094u2, "Item %d has no header", objArr2);
                it = it3;
            } else {
                boolean zEquals = EnumC0091t1.Event.equals(c0073p1.n);
                C0055j1 c0055j1 = (C0055j1) c0088s2.l;
                C0073p1 c0073p2 = c0070o1.a;
                U u = this.g;
                Charset charset = i;
                it = it3;
                K k = this.e;
                if (zEquals) {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(c0070o1.d()), charset));
                        try {
                            C0083q1 c0083q1 = (C0083q1) u.b(bufferedReader, C0083q1.class);
                            if (c0083q1 == null) {
                                iLogger.h(EnumC0094u1.ERROR, "Item %d of type %s returned null by the parser.", Integer.valueOf(i5), c0073p2.n);
                            } else {
                                io.sentry.protocol.r rVar = c0083q1.n;
                                if (rVar != null) {
                                    String str = rVar.l;
                                    if (str.startsWith("sentry.javascript") || str.startsWith("sentry.dart") || str.startsWith("sentry.dotnet")) {
                                        c0104y.c(Boolean.TRUE, "sentry:isFromHybridSdk");
                                    }
                                }
                                io.sentry.protocol.t tVar = c0055j1.l;
                                if (tVar == null || tVar.equals(c0083q1.l)) {
                                    k.w(c0083q1, c0104y);
                                    iLogger.h(EnumC0094u1.DEBUG, "Item %d is being captured.", Integer.valueOf(i5));
                                    if (!g(c0104y)) {
                                        iLogger.h(EnumC0094u1.WARNING, "Timed out waiting for event id submission: %s", c0083q1.l);
                                        bufferedReader.close();
                                        return;
                                    }
                                } else {
                                    iLogger.h(EnumC0094u1.ERROR, "Item %d of has a different event id (%s) to the envelope header (%s)", Integer.valueOf(i5), c0055j1.l, c0083q1.l);
                                    bufferedReader.close();
                                }
                                iLogger.v(EnumC0094u1.ERROR, "Item failed to process.", th);
                            }
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            try {
                                bufferedReader.close();
                                throw th2;
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                                throw th2;
                            }
                        }
                    } catch (Throwable th4) {
                        iLogger.v(EnumC0094u1.ERROR, "Item failed to process.", th4);
                    }
                } else if (EnumC0091t1.Transaction.equals(c0073p2.n)) {
                    try {
                        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(c0070o1.d()), charset));
                        try {
                            io.sentry.protocol.A a = (io.sentry.protocol.A) u.b(bufferedReader2, io.sentry.protocol.A.class);
                            try {
                                if (a != null) {
                                    C0076c c0076c = a.m;
                                    io.sentry.protocol.t tVar2 = c0055j1.l;
                                    if (tVar2 == null || tVar2.equals(a.l)) {
                                        d2 d2Var = c0055j1.n;
                                        if (c0076c.a() != null) {
                                            c0076c.a().f55o = e(d2Var);
                                        }
                                        k.l(a, d2Var, c0104y);
                                        iLogger.h(EnumC0094u1.DEBUG, "Item %d is being captured.", Integer.valueOf(i5));
                                        if (!g(c0104y)) {
                                            iLogger.h(EnumC0094u1.WARNING, "Timed out waiting for event id submission: %s", a.l);
                                            bufferedReader2.close();
                                            return;
                                        }
                                    } else {
                                        io.sentry.protocol.t tVar3 = a.l;
                                        try {
                                            iLogger.h(EnumC0094u1.ERROR, "Item %d of has a different event id (%s) to the envelope header (%s)", Integer.valueOf(i5), c0055j1.l, tVar3);
                                            bufferedReader2.close();
                                            c0088s2 = c0088s1;
                                            i4 = i5;
                                            it3 = it;
                                            c = 0;
                                            i2 = 1;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            th = th;
                                            bufferedReader2.close();
                                            throw th;
                                        }
                                    }
                                    th = th5;
                                    th = th;
                                    bufferedReader2.close();
                                    throw th;
                                }
                                try {
                                    iLogger.h(EnumC0094u1.ERROR, "Item %d of type %s returned null by the parser.", Integer.valueOf(i5), c0073p2.n);
                                } catch (Throwable th6) {
                                    th = th6;
                                    try {
                                        bufferedReader2.close();
                                        throw th;
                                    } catch (Throwable th7) {
                                        th.addSuppressed(th7);
                                        throw th;
                                    }
                                }
                                bufferedReader2.close();
                            } catch (Throwable th8) {
                                th = th8;
                                iLogger.v(EnumC0094u1.ERROR, "Item failed to process.", th);
                            }
                        } catch (Throwable th9) {
                            th = th9;
                        }
                    } catch (Throwable th10) {
                        th = th10;
                    }
                } else {
                    k.u(new C0088s1(c0055j1.l, c0055j1.m, c0070o1), c0104y);
                    EnumC0094u1 enumC0094u3 = EnumC0094u1.DEBUG;
                    EnumC0091t1 enumC0091t1 = c0073p2.n;
                    iLogger.h(enumC0094u3, "%s item %d is being captured.", enumC0091t1.getItemType(), Integer.valueOf(i5));
                    if (!g(c0104y)) {
                        iLogger.h(EnumC0094u1.WARNING, "Timed out waiting for item type submission: %s", enumC0091t1.getItemType());
                        return;
                    }
                }
                Object objQ = io.sentry.config.a.q(c0104y);
                if ((objQ instanceof io.sentry.hints.j) && !((io.sentry.hints.j) objQ).d()) {
                    iLogger.h(EnumC0094u1.WARNING, "Envelope had a failed capture at item %d. No more items will be sent.", Integer.valueOf(i5));
                    return;
                }
                Object objQ2 = io.sentry.config.a.q(c0104y);
                if (io.sentry.android.core.M.class.isInstance(io.sentry.config.a.q(c0104y)) && objQ2 != null) {
                    io.sentry.android.core.M m = (io.sentry.android.core.M) objQ2;
                    m.n = new CountDownLatch(1);
                    m.l = false;
                    m.m = false;
                }
                c0088s2 = c0088s1;
                i4 = i5;
                it3 = it;
                c = 0;
                i2 = 1;
            }
            c0088s2 = c0088s1;
            i4 = i5;
            it3 = it;
            c = 0;
            i2 = 1;
        }
    }

    public final boolean g(C0104y c0104y) {
        Object objQ = io.sentry.config.a.q(c0104y);
        if (objQ instanceof io.sentry.hints.f) {
            return ((io.sentry.hints.f) objQ).c();
        }
        io.sentry.config.a.y(io.sentry.hints.f.class, objQ, this.h);
        return true;
    }
}
