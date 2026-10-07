package o;

import j$.time.Clock;
import j$.time.Duration;
import j$.util.Collection$EL;
import j$.util.function.BiFunction$CC;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import lombok.Generated;

/* JADX INFO: renamed from: o.fs0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1531fs0 implements H70 {

    @Generated
    private static final CL h = DL.d(C1531fs0.class);
    public static final int i = 65280;
    private static final long j = 60;
    private final C2547qI a;
    private final Sm0 b;
    private final Rr0 c;
    private final C1975kT d;
    private final H70 e;
    private final Clock f;
    private boolean g;

    /* JADX INFO: renamed from: o.fs0$a */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[EnumC1887jb0.values().length];
            b = iArr;
            try {
                iArr[EnumC1887jb0.SECURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[EnumC1887jb0.INSECURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[EnumC1887jb0.BOGUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[EnumC1887jb0.INDETERMINATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[EnumC1887jb0.UNCHECKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[EnumC2148m80.values().length];
            a = iArr2;
            try {
                iArr2[EnumC2148m80.POSITIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[EnumC2148m80.CNAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[EnumC2148m80.NODATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[EnumC2148m80.NAMEERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[EnumC2148m80.ANY.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[EnumC2148m80.CNAME_NODATA.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[EnumC2148m80.CNAME_NAMEERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public C1531fs0(H70 h70) {
        this(h70, Clock.systemUTC());
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [o.as0] */
    /* JADX WARN: Type inference failed for: r6v1, types: [o.bs0] */
    private CompletionStage<Void> A0(final AQ aq, final C1369e90 c1369e90) {
        final HashMap map = new HashMap(1);
        final ArrayList arrayList = new ArrayList(0);
        final ArrayList arrayList2 = new ArrayList(0);
        return u0(c1369e90, aq.n().y(), map).thenCompose(new Function() { // from class: o.as0
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public final /* synthetic */ Function mo4andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.a.h0(aq, c1369e90, map, arrayList, arrayList2, (Boolean) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).thenAccept(new Consumer() { // from class: o.bs0
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void p(Object obj) {
                this.a.i0(map, arrayList2, arrayList, c1369e90, (Boolean) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [o.Xr0] */
    private CompletionStage<Boolean> B0(final C1369e90 c1369e90, final Map<C2848tT, C2848tT> map, final List<C1761i90> list, final List<C1761i90> list2, final int[] iArr, final AtomicInteger atomicInteger, final AtomicInteger atomicInteger2) {
        if (atomicInteger.get() >= iArr.length) {
            return CompletableFuture.completedFuture(Boolean.TRUE);
        }
        List<C1761i90> listL = c1369e90.l(iArr[atomicInteger.get()]);
        if (atomicInteger2.get() < listL.size()) {
            final C1761i90 c1761i90 = listL.get(atomicInteger2.getAndIncrement());
            return l0(c1761i90).thenCompose(new Function() { // from class: o.Xr0
                @Override // java.util.function.Function
                /* JADX INFO: renamed from: andThen */
                public final /* synthetic */ Function mo4andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return this.a.j0(c1761i90, c1369e90, map, list2, list, iArr, atomicInteger, atomicInteger2, (C2643rI) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        }
        atomicInteger.getAndIncrement();
        atomicInteger2.set(0);
        return B0(c1369e90, map, list, list2, iArr, atomicInteger, atomicInteger2);
    }

    private void I(AQ aq, String str) {
        int length = (str.length() / 255) + 1;
        String[] strArr = new String[length];
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            strArr[i2] = str.substring(i2 * 255, Math.min(i3 * 255, str.length()));
            i2 = i3;
        }
        aq.b(new C1901ji0(C2848tT.v, i, 0L, (List<String>) Arrays.asList(strArr)), 3);
    }

    private void J(C1369e90 c1369e90, AQ aq) {
        C3141wV c3141wV;
        if (c1369e90.g() <= -1) {
            return;
        }
        C3141wV c3141wVM = aq.m();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C2213ms(c1369e90.g(), c1369e90.e()));
        if (c3141wVM != null) {
            arrayList.addAll((Collection) Collection$EL.stream(c3141wVM.W()).filter(new C2244n8(2)).collect(Collectors.toList()));
            c3141wV = new C3141wV(c3141wVM.Y(), c3141wVM.U(), c3141wVM.Z(), c3141wVM.V(), arrayList);
            aq.A(aq.m(), 3);
        } else {
            c3141wV = new C3141wV(Qd0.j, 0, 0, 0, arrayList);
        }
        aq.b(c3141wV, 3);
    }

    private C2643rI K(C1369e90 c1369e90, AQ aq, C1761i90 c1761i90) {
        C2848tT c2848tTV = aq.n().v();
        int iT = aq.n().t();
        C2643rI c2643rIB = C2643rI.B(c2848tTV, iT, j);
        if (!this.c.g(c1369e90)) {
            c2643rIB.E(10, U40.a("failed.ds.nonsec", c2848tTV));
            return c2643rIB;
        }
        C1281dI c1281dIP = this.c.p(aq, c1369e90, c1761i90, this.f.instant());
        int i2 = a.b[c1281dIP.a.ordinal()];
        if (i2 == 1) {
            C2643rI c2643rID = C2643rI.D(c2848tTV, iT, j);
            c2643rID.E(-1, U40.a("insecure.ds.nsec", new Object[0]));
            return c2643rID;
        }
        if (i2 == 2) {
            return null;
        }
        if (i2 == 3) {
            c2643rIB.E(c1281dIP.b, c1281dIP.c);
            return c2643rIB;
        }
        List<C1761i90> listM = c1369e90.m(2, 50);
        ArrayList arrayList = new ArrayList(0);
        if (listM.isEmpty()) {
            c2643rIB.E(6, U40.a("failed.ds.unknown", new Object[0]));
            return c2643rIB;
        }
        long jP = -1;
        C2848tT c2848tTV2 = null;
        for (C1761i90 c1761i91 : listM) {
            if (this.c.w(c1761i91, c1761i90, this.f.instant()).a != EnumC1887jb0.SECURE) {
                h.M("Skipping bad NSEC3");
            } else {
                c2848tTV2 = c1761i91.v();
                if (jP < 0 || c1761i91.p() < jP) {
                    jP = c1761i91.p();
                }
                arrayList.add(c1761i91);
            }
        }
        int i3 = a.b[this.d.k(arrayList, c2848tTV, c2848tTV2).ordinal()];
        if (i3 == 1 || i3 == 2) {
            C2643rI c2643rID2 = C2643rI.D(c2848tTV, iT, jP);
            c2643rID2.E(-1, U40.a("insecure.ds.nsec3", new Object[0]));
            return c2643rID2;
        }
        if (i3 == 3) {
            c2643rIB.E(6, U40.a("failed.ds.nsec3", new Object[0]));
            return c2643rIB;
        }
        if (i3 != 4) {
            c2643rIB.E(6, U40.a("unknown.ds.nsec3", new Object[0]));
            return c2643rIB;
        }
        h.M("NSEC3s for the referral proved no delegation");
        return null;
    }

    private C2643rI L(C1369e90 c1369e90, AQ aq, C1761i90 c1761i90) {
        C2848tT c2848tTV = aq.n().v();
        int iT = aq.n().t();
        EnumC2148m80 enumC2148m80C = Rr0.c(aq, c1369e90);
        C2643rI c2643rIB = C2643rI.B(c2848tTV, iT, j);
        int i2 = a.a[enumC2148m80C.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                if (this.c.w(c1369e90.c(c2848tTV, 5, iT), c1761i90, this.f.instant()).a == EnumC1887jb0.SECURE) {
                    return null;
                }
                c2643rIB.E(6, U40.a("failed.ds.cname", new Object[0]));
                return c2643rIB;
            }
            if (i2 == 3 || i2 == 4) {
                return K(c1369e90, aq, c1761i90);
            }
            c2643rIB.E(6, U40.a("failed.ds.notype", enumC2148m80C));
            return c2643rIB;
        }
        C1761i90 c1761i90C = c1369e90.c(c2848tTV, 43, iT);
        C1281dI c1281dIW = this.c.w(c1761i90C, c1761i90, this.f.instant());
        if (c1281dIW.a != EnumC1887jb0.SECURE) {
            c2643rIB.E(c1281dIW.b, c1281dIW.c);
            return c2643rIB;
        }
        if (this.c.b(c1761i90C)) {
            h.v("DS RRset was good");
            return C2643rI.C(c1761i90C);
        }
        C2643rI c2643rID = C2643rI.D(c2848tTV, iT, c1761i90C.p());
        c2643rID.E(1, U40.a("insecure.ds.noalgorithms", c2848tTV));
        return c2643rID;
    }

    private static C1369e90 M(AQ aq, int i2) {
        C1369e90 c1369e90 = new C1369e90(aq.k().k(), aq.n());
        C1763iB c1763iBH = c1369e90.h();
        c1763iBH.w(i2);
        c1763iBH.t(0);
        return c1369e90;
    }

    private <T> CompletionStage<T> N(Throwable th) {
        CompletableFuture completableFutureJ = AbstractC3197x0.j();
        completableFutureJ.completeExceptionally(th);
        return completableFutureJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean R(AbstractC2304np abstractC2304np) {
        return abstractC2304np.c() != 15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ AQ S(C1369e90 c1369e90) {
        AQ aqI = c1369e90.i();
        String strE = c1369e90.e();
        if (strE != null) {
            J(c1369e90, aqI);
            if (this.g) {
                I(aqI, strE);
            }
        }
        return aqI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void T(C1369e90 c1369e90, boolean z) {
        if (c1369e90.n() == EnumC1887jb0.SECURE) {
            c1369e90.h().w(0);
        } else if (z) {
            c1369e90.o(U40.a("failed.nxdomain.haswildcard", new Object[0]));
        } else {
            c1369e90.o(U40.a("failed.nxdomain.exists", c1369e90.j().v()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C2643rI U(C1828iv c1828iv, Void r1) {
        return c1828iv.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ CompletionStage X(C1369e90 c1369e90, AQ aq, Void r4) {
        if (c1369e90.n() == EnumC1887jb0.INSECURE) {
            return CompletableFuture.completedFuture(null);
        }
        c1369e90.q(EnumC1887jb0.UNCHECKED, -1);
        return y0(aq, c1369e90);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ CompletionStage Y(C1369e90 c1369e90, AQ aq, Void r4) {
        if (c1369e90.n() == EnumC1887jb0.INSECURE) {
            return CompletableFuture.completedFuture(null);
        }
        c1369e90.q(EnumC1887jb0.UNCHECKED, -1);
        return w0(aq, c1369e90);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C1369e90 Z(AQ aq, C1369e90 c1369e90, Void r3) {
        return p0(aq, c1369e90);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ CompletionStage a0(AQ aq, C1369e90 c1369e90) {
        c1369e90.h().A(10);
        if (aq.k().g(11)) {
            return CompletableFuture.completedFuture(c1369e90.i());
        }
        AQ aqI = c1369e90.i();
        if (aq.n().y() != 46 || aqI.k().n() != 0 || aqI.s(1).isEmpty()) {
            return q0(aq, c1369e90).thenApply(new Vr0(1, this));
        }
        aqI.k().A(10);
        return CompletableFuture.completedFuture(aqI);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ CompletionStage b0(C1761i90 c1761i90, C1369e90 c1369e90, Map map, int i2, AtomicInteger atomicInteger, List list, C2643rI c2643rI) {
        C1281dI c1281dIF = c2643rI.F(c1761i90.v());
        if (c1281dIF != null) {
            c1281dIF.a(c1369e90);
            return CompletableFuture.completedFuture(Boolean.FALSE);
        }
        EnumC1887jb0 enumC1887jb0 = this.c.w(c1761i90, c2643rI, this.f.instant()).a;
        EnumC1887jb0 enumC1887jb1 = EnumC1887jb0.SECURE;
        if (enumC1887jb0 != enumC1887jb1) {
            c1369e90.o(U40.a("failed.answer.positive", c1761i90));
            return CompletableFuture.completedFuture(Boolean.FALSE);
        }
        try {
            C2848tT c2848tTS = Rr0.s(c1761i90);
            if (c2848tTS != null) {
                if (c1761i90.getType() == 39) {
                    c1369e90.o(U40.a("failed.dname.wildcard", c1761i90.o()));
                    return CompletableFuture.completedFuture(Boolean.FALSE);
                }
                map.put(c1761i90.o(), c2848tTS);
            }
            if (i2 != 39 && c1761i90.getType() == 39) {
                C0448Gi c0448Gi = (C0448Gi) c1761i90.m();
                if (atomicInteger.getAndIncrement() < list.size()) {
                    C1761i90 c1761i91 = (C1761i90) list.get(atomicInteger.get());
                    if (c1761i91.getType() == 5 && c0448Gi != null) {
                        if (c1761i91.t() > 1) {
                            c1369e90.o(U40.a("failed.synthesize.multiple", new Object[0]));
                            return CompletableFuture.completedFuture(Boolean.FALSE);
                        }
                        C3243xa c3243xa = (C3243xa) c1761i91.m();
                        try {
                            C2848tT c2848tTH = C2848tT.h(c3243xa.v().w(c0448Gi.v()), c0448Gi.W());
                            if (!c2848tTH.equals(c3243xa.W())) {
                                c1369e90.o(U40.a("failed.synthesize.nomatch", c3243xa.W(), c2848tTH));
                                return CompletableFuture.completedFuture(Boolean.FALSE);
                            }
                            c1761i91.x(enumC1887jb1);
                        } catch (C2945uT unused) {
                            c1369e90.o(U40.a("failed.synthesize.toolong", new Object[0]));
                            return CompletableFuture.completedFuture(Boolean.FALSE);
                        }
                    }
                }
            }
            atomicInteger.getAndIncrement();
            return v0(c1369e90, i2, map, atomicInteger);
        } catch (RuntimeException e) {
            c1369e90.o(U40.a(e.getMessage(), c1761i90.o()));
            return CompletableFuture.completedFuture(Boolean.FALSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ CompletionStage c0(C1369e90 c1369e90, C2848tT c2848tT, AQ aq, Void r14) {
        ArrayList arrayList = new ArrayList(0);
        C2848tT c2848tTV = null;
        boolean z = false;
        boolean zN = false;
        int i2 = 0;
        for (C1761i90 c1761i90 : c1369e90.l(2)) {
            if (c1761i90.getType() == 47) {
                C2073lT c2073lT = (C2073lT) c1761i90.m();
                if (Rr0.l(c1761i90, c2073lT, c2848tT)) {
                    z = true;
                }
                int iS = Rr0.d(c2848tT, c1761i90.o(), c2073lT.U()).s();
                if (iS > i2 || (iS == i2 && !zN)) {
                    zN = Rr0.n(c1761i90, c2073lT, c2848tT);
                }
                i2 = iS;
            }
            if (c1761i90.getType() == 50) {
                arrayList.add(c1761i90);
                c2848tTV = c1761i90.v();
            }
        }
        this.d.n(arrayList);
        if ((!z || !zN) && !arrayList.isEmpty()) {
            h.M("Validating nxdomain: using NSEC3 records");
            if (this.d.a(arrayList, this.a)) {
                c1369e90.r(EnumC1887jb0.INSECURE, -1, U40.a("failed.nsec3_ignored", new Object[0]));
                return CompletableFuture.completedFuture(null);
            }
            EnumC1887jb0 enumC1887jb0J = this.d.j(arrayList, c2848tT, c2848tTV);
            if (enumC1887jb0J != EnumC1887jb0.SECURE) {
                if (enumC1887jb0J == EnumC1887jb0.INSECURE) {
                    c1369e90.r(enumC1887jb0J, -1, U40.a("failed.nxdomain.nsec3_insecure", new Object[0]));
                } else {
                    c1369e90.r(enumC1887jb0J, 6, U40.a("failed.nxdomain.nsec3_bogus", new Object[0]));
                }
                return CompletableFuture.completedFuture(null);
            }
            z = true;
            zN = true;
        }
        if (!z || !zN) {
            return y0(aq, c1369e90).thenRun(new RunnableC1335ds0(0, c1369e90, z));
        }
        h.v("Successfully validated NAME ERROR response");
        c1369e90.q(EnumC1887jb0.SECURE, -1);
        return CompletableFuture.completedFuture(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void d0(Throwable th) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ CompletionStage e0(C1761i90 c1761i90, C1369e90 c1369e90, AtomicInteger atomicInteger, C2643rI c2643rI) {
        C1281dI c1281dIF = c2643rI.F(c1761i90.v());
        if (c1281dIF != null) {
            c1281dIF.a(c1369e90);
            return N(new Exception(c1281dIF.c));
        }
        if (this.c.w(c1761i90, c2643rI, this.f.instant()).a == EnumC1887jb0.SECURE) {
            return x0(c1369e90, atomicInteger);
        }
        c1369e90.o(U40.a("failed.nxdomain.authority", c1761i90));
        return N(new Exception("failed.nxdomain.authority"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void f0(C1369e90 c1369e90, C2848tT c2848tT, int i2, Void r20, Throwable th) {
        if (th != null) {
            return null;
        }
        Rr0.b bVar = new Rr0.b();
        ArrayList arrayList = new ArrayList(0);
        int i3 = 12;
        C2848tT c2848tTD = null;
        C2848tT c2848tTV = null;
        boolean z = false;
        for (C1761i90 c1761i90 : c1369e90.l(2)) {
            if (c1761i90.getType() == 47) {
                C2073lT c2073lT = (C2073lT) c1761i90.m();
                Rr0.b bVarO = Rr0.o(c1761i90, c2073lT, c2848tT, i2);
                if (bVarO.a) {
                    z = true;
                } else {
                    i3 = 6;
                }
                if (Rr0.l(c1761i90, c2073lT, c2848tT)) {
                    c2848tTD = Rr0.d(c2848tT, c1761i90.o(), c2073lT.U());
                }
                bVar = bVarO;
            }
            if (c1761i90.getType() == 50) {
                arrayList.add(c1761i90);
                c2848tTV = c1761i90.v();
            }
        }
        C2848tT c2848tT2 = bVar.b;
        if (c2848tT2 != null && (c2848tTD == null || (!c2848tTD.equals(c2848tT2) && !c2848tT.equals(c2848tTD)))) {
            i3 = 6;
            z = false;
        }
        this.d.n(arrayList);
        if (!z && !arrayList.isEmpty()) {
            h.M("Using NSEC3 records");
            if (this.d.a(arrayList, this.a)) {
                c1369e90.o(U40.a("failed.nsec3_ignored", new Object[0]));
                return null;
            }
            C1281dI c1281dIL = this.d.l(arrayList, c2848tT, i2, c2848tTV);
            i3 = c1281dIL.b;
            EnumC1887jb0 enumC1887jb0 = c1281dIL.a;
            EnumC1887jb0 enumC1887jb1 = EnumC1887jb0.INSECURE;
            if (enumC1887jb0 == enumC1887jb1) {
                c1369e90.q(enumC1887jb1, -1);
                return null;
            }
            z = enumC1887jb0 == EnumC1887jb0.SECURE;
        }
        if (z) {
            h.v("Successfully validated NODATA response");
            c1369e90.q(EnumC1887jb0.SECURE, -1);
            return null;
        }
        c1369e90.p(U40.a("failed.nodata", new Object[0]), i3);
        h.s(c2848tT, "Failed NODATA for {}");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ CompletionStage g0(C1761i90 c1761i90, C1369e90 c1369e90, AtomicInteger atomicInteger, C2643rI c2643rI) {
        C1281dI c1281dIF = c2643rI.F(c1761i90.v());
        if (c1281dIF != null) {
            c1281dIF.a(c1369e90);
            return N(new Exception(c1281dIF.c));
        }
        if (this.c.w(c1761i90, c2643rI, this.f.instant()).a == EnumC1887jb0.SECURE) {
            return z0(c1369e90, atomicInteger);
        }
        c1369e90.o(U40.a("failed.authority.nodata", c1761i90));
        return N(new Exception("failed.authority.nodata"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ CompletionStage h0(AQ aq, C1369e90 c1369e90, Map map, List list, List list2, Boolean bool) {
        if (Boolean.TRUE.equals(bool)) {
            return B0(c1369e90, map, list, list2, aq.n().y() == 255 ? new int[]{1, 2} : new int[]{2}, new AtomicInteger(0), new AtomicInteger(0));
        }
        return CompletableFuture.completedFuture(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:35:0x00b8  */
    public /* synthetic */ void i0(Map map, List list, List list2, C1369e90 c1369e90, Boolean bool) {
        boolean z;
        boolean z2;
        if (Boolean.TRUE.equals(bool)) {
            if (map.size() > 0) {
                for (Map.Entry entry : map.entrySet()) {
                    Iterator it = list.iterator();
                    while (true) {
                        z = true;
                        if (!it.hasNext()) {
                            z2 = false;
                            break;
                        }
                        C1761i90 c1761i90 = (C1761i90) it.next();
                        C2073lT c2073lT = (C2073lT) c1761i90.m();
                        if (Rr0.l(c1761i90, c2073lT, (C2848tT) entry.getKey())) {
                            try {
                                if (((C2848tT) entry.getValue()).equals(Rr0.q((C2848tT) entry.getKey(), c1761i90, c2073lT))) {
                                    z2 = true;
                                    break;
                                }
                            } catch (C2945uT unused) {
                                throw new IllegalStateException(U40.a("failed.positive.wildcardgeneration", new Object[0]));
                            }
                        }
                    }
                    if (z2 || list2.isEmpty()) {
                        z = z2;
                    } else {
                        if (this.d.a(list2, this.a)) {
                            c1369e90.r(EnumC1887jb0.INSECURE, -1, U40.a("failed.nsec3_ignored", new Object[0]));
                            return;
                        }
                        EnumC1887jb0 enumC1887jb0M = this.d.m(list2, (C2848tT) entry.getKey(), ((C1761i90) list2.get(0)).v(), (C2848tT) entry.getValue());
                        if (enumC1887jb0M == EnumC1887jb0.INSECURE) {
                            c1369e90.q(enumC1887jb0M, -1);
                            return;
                        } else if (enumC1887jb0M != EnumC1887jb0.SECURE) {
                            z = z2;
                        }
                    }
                    if (!z) {
                        c1369e90.o(U40.a("failed.positive.wildcard_too_broad", new Object[0]));
                        return;
                    }
                }
            }
            c1369e90.q(EnumC1887jb0.SECURE, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ CompletionStage j0(C1761i90 c1761i90, C1369e90 c1369e90, Map map, List list, List list2, int[] iArr, AtomicInteger atomicInteger, AtomicInteger atomicInteger2, C2643rI c2643rI) {
        C1281dI c1281dIF = c2643rI.F(c1761i90.v());
        if (c1281dIF != null) {
            c1281dIF.a(c1369e90);
            return CompletableFuture.completedFuture(Boolean.FALSE);
        }
        if (this.c.w(c1761i90, c2643rI, this.f.instant()).a != EnumC1887jb0.SECURE) {
            c1369e90.o(U40.a("failed.authority.positive", c1761i90));
            return CompletableFuture.completedFuture(Boolean.FALSE);
        }
        if (map.size() > 0) {
            if (c1761i90.getType() != 47) {
                if (c1761i90.getType() == 50) {
                    list2.add(c1761i90);
                }
                return B0(c1369e90, map, list2, list, iArr, atomicInteger, atomicInteger2);
            }
            list.add(c1761i90);
        }
        return B0(c1369e90, map, list2, list, iArr, atomicInteger, atomicInteger2);
    }

    private CompletionStage<C2643rI> l0(C1761i90 c1761i90) {
        C1828iv c1828iv = new C1828iv();
        c1828iv.c = c1761i90.v();
        c1828iv.d = c1761i90.n();
        if (c1828iv.c == null) {
            c1828iv.c = c1761i90.o();
        }
        C1761i90 c1761i90B = this.b.b(c1828iv.c, c1761i90.n());
        if (c1761i90B == null) {
            return CompletableFuture.completedFuture(C2643rI.D(c1828iv.c, c1761i90.n(), j));
        }
        C2643rI c2643rIC = this.a.c(c1828iv.c, c1761i90.n());
        c1828iv.b = c2643rIC;
        if (c2643rIC != null && (c2643rIC.o().equals(c1828iv.c) || !c1828iv.b.z())) {
            return CompletableFuture.completedFuture(c1828iv.b);
        }
        c1828iv.a = c1761i90B;
        c1828iv.b = null;
        c1828iv.f = new C2848tT(c1761i90B.o(), 1);
        return o0(c1828iv).thenApply(new Vr0(0, c1828iv));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public CompletionStage<Void> W(AQ aq, C1369e90 c1369e90, C1828iv c1828iv) {
        C2848tT c2848tTV = aq.n().v();
        int iT = aq.n().t();
        C1761i90 c1761i90C = c1369e90.c(c2848tTV, 48, iT);
        if (c1761i90C == null) {
            C2643rI c2643rIB = C2643rI.B(c2848tTV, iT, j);
            c1828iv.b = c2643rIB;
            c2643rIB.E(9, U40.a("dnskey.no_rrset", c2848tTV));
            return CompletableFuture.completedFuture(null);
        }
        C2643rI c2643rIV = this.c.v(c1761i90C, c1828iv.a, j, this.f.instant());
        c1828iv.b = c2643rIV;
        if (!c2643rIV.z()) {
            return CompletableFuture.completedFuture(null);
        }
        this.a.g(c1828iv.b);
        return o0(c1828iv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public CompletionStage<Void> V(AQ aq, C1369e90 c1369e90, C1828iv c1828iv) {
        C2848tT c2848tTV = aq.n().v();
        c1828iv.e = null;
        c1828iv.a = null;
        C2643rI c2643rIL = L(c1369e90, aq, c1828iv.b);
        if (c2643rIL == null) {
            c1828iv.e = c2848tTV;
        } else {
            if (!c2643rIL.z()) {
                c1828iv.b = c2643rIL;
                if (c2643rIL.A()) {
                    this.a.g(c2643rIL);
                }
                return CompletableFuture.completedFuture(null);
            }
            c1828iv.a = c2643rIL;
            c1828iv.f = new C2848tT(c2643rIL.o(), 1);
        }
        return o0(c1828iv);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [o.Wr0] */
    /* JADX WARN: Type inference failed for: r3v7, types: [o.Wr0] */
    private CompletionStage<Void> o0(final C1828iv c1828iv) {
        final int i2 = 0;
        final int i3 = 1;
        int i4 = c1828iv.d;
        C2848tT c2848tT = c1828iv.c;
        C2848tT c2848tTO = C2848tT.w;
        C2643rI c2643rI = c1828iv.b;
        if (c2643rI != null) {
            c2848tTO = c2643rI.o();
        }
        C2848tT c2848tT2 = c1828iv.f;
        if (c2848tT2 != null) {
            c1828iv.f = null;
            c2848tTO = c2848tT2;
        }
        if (c2848tTO.equals(c2848tT)) {
            return CompletableFuture.completedFuture(null);
        }
        C2848tT c2848tT3 = c1828iv.e;
        if (c2848tT3 != null) {
            c2848tTO = c2848tT3;
        }
        int iS = (c2848tT.s() - c2848tTO.s()) - 1;
        if (iS < 0) {
            return CompletableFuture.completedFuture(null);
        }
        C2848tT c2848tT4 = new C2848tT(c2848tT, iS);
        h.u("Key search: targetKeyName = {}, currentKeyName = {}, nextKeyName = {}", c2848tT, c2848tTO, c2848tT4);
        C1761i90 c1761i90 = c1828iv.a;
        if (c1761i90 == null || !c1761i90.o().equals(c2848tT4)) {
            final AQ aqW = AQ.w(H50.z(c2848tT4, 43, i4));
            return s0(aqW).thenComposeAsync(new Function(this) { // from class: o.Wr0
                public final /* synthetic */ C1531fs0 b;

                {
                    this.b = this;
                }

                @Override // java.util.function.Function
                /* JADX INFO: renamed from: andThen */
                public final /* synthetic */ Function mo4andThen(Function function) {
                    int i5 = i2;
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    switch (i2) {
                        case 0:
                            return this.b.V(aqW, c1828iv, (C1369e90) obj);
                        default:
                            return this.b.W(aqW, c1828iv, (C1369e90) obj);
                    }
                }

                public final /* synthetic */ Function compose(Function function) {
                    int i5 = i2;
                    return Function$CC.$default$compose(this, function);
                }
            });
        }
        final AQ aqW2 = AQ.w(H50.z(c1828iv.a.o(), 48, i4));
        return s0(aqW2).thenComposeAsync(new Function(this) { // from class: o.Wr0
            public final /* synthetic */ C1531fs0 b;

            {
                this.b = this;
            }

            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public final /* synthetic */ Function mo4andThen(Function function) {
                int i5 = i3;
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                switch (i3) {
                    case 0:
                        return this.b.V(aqW2, c1828iv, (C1369e90) obj);
                    default:
                        return this.b.W(aqW2, c1828iv, (C1369e90) obj);
                }
            }

            public final /* synthetic */ Function compose(Function function) {
                int i5 = i3;
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    private C1369e90 p0(AQ aq, C1369e90 c1369e90) {
        EnumC1887jb0 enumC1887jb0N = c1369e90.n();
        String strE = c1369e90.e();
        int iG = c1369e90.g();
        int i2 = a.b[enumC1887jb0N.ordinal()];
        if (i2 != 1) {
            int i3 = 2;
            if (i2 != 2) {
                if (i2 == 3) {
                    int iN = c1369e90.h().n();
                    if (iN != 0 && iN != 3) {
                        i3 = iN;
                    }
                    c1369e90 = M(aq, i3);
                } else if (i2 != 5) {
                    throw new IllegalArgumentException("unexpected security status");
                }
            }
        } else {
            c1369e90.h().t(10);
        }
        c1369e90.r(enumC1887jb0N, iG, strE);
        return c1369e90;
    }

    private CompletionStage<C1369e90> q0(AQ aq, C1369e90 c1369e90) {
        CompletionStage<Void> completionStageA0;
        int i2 = 0;
        int i3 = 1;
        EnumC2148m80 enumC2148m80C = Rr0.c(aq, c1369e90);
        if (enumC2148m80C != EnumC2148m80.REFERRAL) {
            r0(c1369e90);
        }
        switch (a.a[enumC2148m80C.ordinal()]) {
            case 1:
            case 2:
            case 5:
                h.v("Validating a positive response");
                completionStageA0 = A0(aq, c1369e90);
                break;
            case 3:
                h.v("Validating a nodata response");
                completionStageA0 = y0(aq, c1369e90);
                break;
            case 4:
                h.v("Validating a nxdomain response");
                completionStageA0 = w0(aq, c1369e90);
                break;
            case 6:
                h.v("Validating a CNAME_NODATA response");
                completionStageA0 = A0(aq, c1369e90).thenCompose(new C1238cs0(this, c1369e90, aq, i2));
                break;
            case 7:
                h.v("Validating a cname_nxdomain response");
                completionStageA0 = A0(aq, c1369e90).thenCompose(new C1238cs0(this, c1369e90, aq, i3));
                break;
            default:
                c1369e90.o(U40.a("validate.response.unknown", enumC2148m80C));
                completionStageA0 = CompletableFuture.completedFuture(null);
                break;
        }
        return completionStageA0.thenApply(new C1238cs0(this, aq, c1369e90));
    }

    private void r0(C1369e90 c1369e90) {
        if (c1369e90.l(1).isEmpty() && c1369e90.l(2).size() == 1) {
            return;
        }
        Iterator<C1761i90> it = c1369e90.l(2).iterator();
        while (it.hasNext()) {
            C1761i90 next = it.next();
            if (next.getType() == 2 && next.s().isEmpty()) {
                h.u("Removing spurious unsigned NS record (likely inserted by forwarder) {}/{}/{}", next.o(), C3080vp0.e(next.getType()), C0344Ci.b(next.n()));
                it.remove();
            }
        }
    }

    private CompletionStage<C1369e90> s0(AQ aq) {
        H50 h50N = aq.n();
        h.u("Sending request: <{}/{}/{}>", h50N.v(), C3080vp0.e(h50N.y()), C0344Ci.b(h50N.t()));
        AQ aqClone = aq.clone();
        aqClone.k().t(11);
        return this.e.k(aqClone).thenApply(new C2504ps(1));
    }

    private CompletionStage<Boolean> u0(C1369e90 c1369e90, int i2, Map<C2848tT, C2848tT> map) {
        return v0(c1369e90, i2, map, new AtomicInteger(0));
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [o.Yr0] */
    private CompletionStage<Boolean> v0(final C1369e90 c1369e90, final int i2, final Map<C2848tT, C2848tT> map, final AtomicInteger atomicInteger) {
        final List<C1761i90> listL = c1369e90.l(1);
        if (atomicInteger.get() >= listL.size()) {
            return CompletableFuture.completedFuture(Boolean.TRUE);
        }
        final C1761i90 c1761i90 = listL.get(atomicInteger.get());
        return l0(c1761i90).thenCompose(new Function() { // from class: o.Yr0
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public final /* synthetic */ Function mo4andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.a.b0(c1761i90, c1369e90, map, i2, atomicInteger, listL, (C2643rI) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    private CompletionStage<Void> w0(AQ aq, C1369e90 c1369e90) {
        C2848tT c2848tTV = aq.n().v();
        for (C1761i90 c1761i90 : c1369e90.l(1)) {
            if (c1761i90.u() != EnumC1887jb0.SECURE) {
                c1369e90.o(U40.a("failed.nxdomain.cname_nxdomain", c1761i90));
                return CompletableFuture.completedFuture(null);
            }
            if (c1761i90.getType() == 5) {
                c2848tTV = ((C3243xa) c1761i90.m()).W();
            }
        }
        return x0(c1369e90, new AtomicInteger(0)).thenComposeAsync(new Ur0(this, c1369e90, c2848tTV, aq)).exceptionally(new C2504ps(16));
    }

    private CompletionStage<Void> x0(C1369e90 c1369e90, AtomicInteger atomicInteger) {
        if (atomicInteger.get() >= c1369e90.l(2).size()) {
            return CompletableFuture.completedFuture(null);
        }
        C1761i90 c1761i90 = c1369e90.l(2).get(atomicInteger.getAndIncrement());
        return l0(c1761i90).thenCompose(new Ur0(this, c1761i90, c1369e90, atomicInteger, 0));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [o.Zr0] */
    private CompletionStage<Void> y0(AQ aq, final C1369e90 c1369e90) {
        final C2848tT c2848tTV = aq.n().v();
        final int iY = aq.n().y();
        for (C1761i90 c1761i90 : c1369e90.l(1)) {
            if (c1761i90.u() != EnumC1887jb0.SECURE) {
                c1369e90.o(U40.a("failed.answer.cname_nodata", c1761i90.o()));
                return CompletableFuture.completedFuture(null);
            }
            if (c1761i90.getType() == 5) {
                c2848tTV = ((C3243xa) c1761i90.m()).W();
            }
        }
        return z0(c1369e90, new AtomicInteger(0)).handleAsync(new BiFunction() { // from class: o.Zr0
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return this.a.f0(c1369e90, c2848tTV, iY, (Void) obj, (Throwable) obj2);
            }
        });
    }

    private CompletionStage<Void> z0(C1369e90 c1369e90, AtomicInteger atomicInteger) {
        if (atomicInteger.get() >= c1369e90.l(2).size()) {
            return CompletableFuture.completedFuture(null);
        }
        C1761i90 c1761i90 = c1369e90.l(2).get(atomicInteger.getAndIncrement());
        return l0(c1761i90).thenComposeAsync(new Ur0(this, c1761i90, c1369e90, atomicInteger, 1));
    }

    public Sm0 O() {
        return this.b;
    }

    public void P(Properties properties) {
        this.a.d(properties);
        this.d.f(properties);
        this.c.h(properties);
        String property = properties.getProperty("dnsjava.dnssec.trust_anchor_file");
        if (property != null) {
            h.C(property, "Reading trust anchor file: {}");
            k0(new FileInputStream(property));
        }
    }

    @Generated
    public boolean Q() {
        return this.g;
    }

    @Override // o.H70
    public final /* synthetic */ void a(int i2) {
        G70.f(this, i2);
    }

    @Override // o.H70
    public final /* synthetic */ AQ b(AQ aq) {
        return G70.b(this, aq);
    }

    @Override // o.H70
    public void c(C1511fi0 c1511fi0) {
        this.e.c(c1511fi0);
    }

    @Override // o.H70
    public final /* synthetic */ CompletionStage d(AQ aq, Executor executor) {
        return G70.e(this, aq, executor);
    }

    @Override // o.H70
    public void e(Duration duration) {
        this.e.e(duration);
    }

    @Override // o.H70
    public final /* synthetic */ void f(int i2, int i3, int i4, AbstractC2304np... abstractC2304npArr) {
        G70.g(this, i2, i3, i4, abstractC2304npArr);
    }

    @Override // o.H70
    public void g(int i2) {
        this.e.g(i2);
    }

    @Override // o.H70
    public void h(int i2, int i3, int i4, List<AbstractC2304np> list) {
        if (i2 == -1) {
            throw new IllegalArgumentException("EDNS cannot be disabled");
        }
        this.e.h(i2, i3, i4 | 32768, list);
    }

    @Override // o.H70
    public Duration j() {
        return this.e.j();
    }

    @Override // o.H70
    public CompletionStage<AQ> k(AQ aq) {
        return s0(aq).thenCompose(new C1433es0(this, aq, 0));
    }

    public void k0(InputStream inputStream) {
        ArrayList<H50> arrayList = new ArrayList();
        FN fn = new FN(inputStream, C2848tT.v, 0L);
        while (true) {
            try {
                H50 h50K = fn.K();
                if (h50K == null) {
                    break;
                } else {
                    arrayList.add(h50K);
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        fn.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
        fn.close();
        Collections.sort(arrayList);
        C1761i90 c1761i90 = new C1761i90();
        for (H50 h50 : arrayList) {
            if (h50.y() == 48 || h50.y() == 43) {
                if (c1761i90.t() == 0) {
                    c1761i90.d(h50);
                } else if (c1761i90.o().equals(h50.v()) && c1761i90.getType() == h50.y() && c1761i90.n() == h50.t()) {
                    c1761i90.d(h50);
                } else {
                    this.b.f(c1761i90);
                    c1761i90 = new C1761i90();
                    c1761i90.d(h50);
                }
            }
        }
        if (c1761i90.t() > 0) {
            this.b.f(c1761i90);
        }
    }

    @Override // o.H70
    public final /* synthetic */ Object l(AQ aq, L70 l70) {
        return G70.c(this, aq, l70);
    }

    @Override // o.H70
    public final /* synthetic */ void m(int i2) {
        G70.h(this, i2);
    }

    @Override // o.H70
    public final /* synthetic */ void n(int i2, int i3) {
        G70.i(this, i2, i3);
    }

    @Override // o.H70
    public void o(boolean z) {
        this.e.o(z);
    }

    @Generated
    public void t0(boolean z) {
        this.g = z;
    }

    public C1531fs0(H70 h70, Clock clock) {
        this.g = true;
        this.e = h70;
        this.f = clock;
        h70.f(0, 0, 32768, new AbstractC2304np[0]);
        h70.i(false);
        this.a = new C2547qI();
        this.c = new Rr0();
        this.d = new C1975kT();
        this.b = new Sm0();
        try {
            P(System.getProperties());
        } catch (IOException e) {
            h.I("Could not initialize from system properties", e);
        }
    }

    @Override // o.H70
    public void i(boolean z) {
    }
}
