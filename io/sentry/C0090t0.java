package io.sentry;

import io.sentry.protocol.C0077d;
import io.sentry.protocol.DebugImage;
import java.io.Closeable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.sentry.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0090t0 implements InterfaceC0092u, Closeable {
    public final I1 l;
    public final C0088s1 m;
    public final C0072p0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile C f147o = null;

    public C0090t0(I1 i1) {
        io.sentry.config.a.C(i1, "The SentryOptions is required.");
        this.l = i1;
        C0072p0 c0072p0 = new C0072p0(i1);
        this.n = new C0072p0(c0072p0);
        this.m = new C0088s1(c0072p0, i1);
    }

    @Override // io.sentry.InterfaceC0092u
    public final K1 a(K1 k1, C0104y c0104y) {
        if (k1.s == null) {
            k1.s = "java";
        }
        if (q(k1, c0104y)) {
            l(k1);
        }
        return k1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f147o != null) {
            this.f147o.f.shutdown();
        }
    }

    @Override // io.sentry.InterfaceC0092u
    public final io.sentry.protocol.A f(io.sentry.protocol.A a, C0104y c0104y) {
        if (a.s == null) {
            a.s = "java";
        }
        p(a);
        if (q(a, c0104y)) {
            l(a);
        }
        return a;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // io.sentry.InterfaceC0092u
    public final C0083q1 i(C0083q1 c0083q1, C0104y c0104y) {
        ArrayList arrayList;
        Thread threadCurrentThread;
        io.sentry.protocol.j jVar;
        boolean z;
        if (c0083q1.s == null) {
            c0083q1.s = "java";
        }
        Throwable cause = c0083q1.u;
        if (cause != null) {
            C0072p0 c0072p0 = this.n;
            c0072p0.getClass();
            ArrayDeque arrayDeque = new ArrayDeque();
            HashSet hashSet = new HashSet();
            while (cause != null && hashSet.add(cause)) {
                if (cause instanceof io.sentry.exception.a) {
                    io.sentry.exception.a aVar = (io.sentry.exception.a) cause;
                    io.sentry.protocol.j jVar2 = aVar.l;
                    Throwable th = aVar.m;
                    threadCurrentThread = aVar.n;
                    z = aVar.f110o;
                    cause = th;
                    jVar = jVar2;
                } else {
                    threadCurrentThread = Thread.currentThread();
                    jVar = null;
                    z = false;
                }
                arrayDeque.addFirst(C0072p0.b(cause, jVar, Long.valueOf(threadCurrentThread.getId()), ((C0072p0) c0072p0.l).c(cause.getStackTrace(), jVar != null && Boolean.FALSE.equals(jVar.f126o)), z));
                cause = cause.getCause();
            }
            c0083q1.E = new C0066n0(new ArrayList(arrayDeque));
        }
        p(c0083q1);
        I1 i1 = this.l;
        Map mapA = i1.getModulesLoader().a();
        if (mapA != null) {
            Map map = c0083q1.J;
            if (map == null) {
                c0083q1.J = new HashMap(mapA);
            } else {
                map.putAll(mapA);
            }
        }
        if (q(c0083q1, c0104y)) {
            l(c0083q1);
            C0066n0 c0066n0 = c0083q1.D;
            if ((c0066n0 != null ? c0066n0.a : null) == null) {
                C0066n0 c0066n1 = c0083q1.E;
                ArrayList<io.sentry.protocol.s> arrayList2 = c0066n1 == null ? null : c0066n1.a;
                if (arrayList2 == null || arrayList2.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = null;
                    for (io.sentry.protocol.s sVar : arrayList2) {
                        if (sVar.q != null && sVar.f134o != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(sVar.f134o);
                        }
                    }
                }
                boolean zIsAttachThreads = i1.isAttachThreads();
                C0088s1 c0088s1 = this.m;
                if (zIsAttachThreads || io.sentry.hints.a.class.isInstance(io.sentry.config.a.q(c0104y))) {
                    Object objQ = io.sentry.config.a.q(c0104y);
                    boolean zB = objQ instanceof io.sentry.hints.a ? ((io.sentry.hints.a) objQ).b() : false;
                    c0088s1.getClass();
                    c0083q1.D = new C0066n0(c0088s1.i(Thread.getAllStackTraces(), arrayList, zB));
                } else if (i1.isAttachStacktrace() && ((arrayList2 == null || arrayList2.isEmpty()) && !io.sentry.hints.d.class.isInstance(io.sentry.config.a.q(c0104y)))) {
                    c0088s1.getClass();
                    HashMap map2 = new HashMap();
                    Thread threadCurrentThread2 = Thread.currentThread();
                    map2.put(threadCurrentThread2, threadCurrentThread2.getStackTrace());
                    c0083q1.D = new C0066n0(c0088s1.i(map2, null, false));
                }
            }
        }
        return c0083q1;
    }

    public final void l(AbstractC0037d1 abstractC0037d1) {
        if (abstractC0037d1.q == null) {
            abstractC0037d1.q = this.l.getRelease();
        }
        if (abstractC0037d1.r == null) {
            abstractC0037d1.r = this.l.getEnvironment();
        }
        if (abstractC0037d1.v == null) {
            abstractC0037d1.v = this.l.getServerName();
        }
        if (this.l.isAttachServerName() && abstractC0037d1.v == null) {
            if (this.f147o == null) {
                synchronized (this) {
                    try {
                        if (this.f147o == null) {
                            if (C.i == null) {
                                C.i = new C();
                            }
                            this.f147o = C.i;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (this.f147o != null) {
                C c = this.f147o;
                if (c.c < System.currentTimeMillis() && c.d.compareAndSet(false, true)) {
                    c.a();
                }
                abstractC0037d1.v = c.b;
            }
        }
        if (abstractC0037d1.w == null) {
            abstractC0037d1.w = this.l.getDist();
        }
        if (abstractC0037d1.n == null) {
            abstractC0037d1.n = this.l.getSdkVersion();
        }
        Map map = abstractC0037d1.p;
        I1 i1 = this.l;
        if (map == null) {
            abstractC0037d1.p = new HashMap(new HashMap(i1.getTags()));
        } else {
            for (Map.Entry<String, String> entry : i1.getTags().entrySet()) {
                if (!abstractC0037d1.p.containsKey(entry.getKey())) {
                    abstractC0037d1.a(entry.getKey(), entry.getValue());
                }
            }
        }
        io.sentry.protocol.E e = abstractC0037d1.t;
        if (e == null) {
            e = new io.sentry.protocol.E();
            abstractC0037d1.t = e;
        }
        if (e.p == null) {
            e.p = "{{auto}}";
        }
    }

    public final void p(AbstractC0037d1 abstractC0037d1) {
        ArrayList arrayList = new ArrayList();
        I1 i1 = this.l;
        if (i1.getProguardUuid() != null) {
            DebugImage debugImage = new DebugImage();
            debugImage.setType(DebugImage.PROGUARD);
            debugImage.setUuid(i1.getProguardUuid());
            arrayList.add(debugImage);
        }
        for (String str : i1.getBundleIds()) {
            DebugImage debugImage2 = new DebugImage();
            debugImage2.setType(DebugImage.JVM);
            debugImage2.setDebugId(str);
            arrayList.add(debugImage2);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        C0077d c0077d = abstractC0037d1.y;
        if (c0077d == null) {
            c0077d = new C0077d();
        }
        List list = c0077d.m;
        if (list == null) {
            c0077d.m = new ArrayList(arrayList);
        } else {
            list.addAll(arrayList);
        }
        abstractC0037d1.y = c0077d;
    }

    public final boolean q(AbstractC0037d1 abstractC0037d1, C0104y c0104y) {
        if (io.sentry.config.a.E(c0104y)) {
            return true;
        }
        this.l.getLogger().h(EnumC0094u1.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", abstractC0037d1.l);
        return false;
    }
}
