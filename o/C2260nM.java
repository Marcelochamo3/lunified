package o;

import j$.lang.Iterable$EL;
import j$.util.Collection$EL;
import j$.util.Optional;
import j$.util.function.BiFunction$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.concurrent.ForkJoinPool;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import lombok.Generated;
import lombok.NonNull;

/* JADX INFO: renamed from: o.nM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2260nM {

    @Generated
    private static final CL i = DL.d(C2260nM.class);
    public static final int j = 16;
    public static final int k = 1;
    private final H70 a;
    private final int b;
    private final int c;
    private final List<C2848tT> d;
    private final boolean e;
    private final Map<Integer, C0388Ea> f;
    private final XC g;
    private final Executor h;

    /* JADX INFO: renamed from: o.nM$b */
    public static class b {
        private H70 a;
        private int b;
        private int c;
        private List<C2848tT> d;
        private boolean e;
        private List<C0388Ea> f;
        private XC g;
        private Executor h;

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ C2848tT o(C2848tT c2848tT) {
            try {
                return C2848tT.h(c2848tT, C2848tT.v);
            } catch (C2945uT unused) {
                throw new IllegalArgumentException("Search path name too long");
            }
        }

        public C2260nM d() {
            List<C2848tT> list = this.d;
            if (list != null) {
                this.d = (List) Collection$EL.stream(list).map(new C2504ps(12)).collect(Collectors.toCollection(new C1504ff(1)));
            } else {
                this.d = Collections.emptyList();
            }
            return new C2260nM(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        }

        @Deprecated
        public b e(@NonNull Integer num, @NonNull C0388Ea c0388Ea) {
            if (num == null) {
                throw new NullPointerException("dclass is marked non-null but is null");
            }
            if (c0388Ea == null) {
                throw new NullPointerException("cache is marked non-null but is null");
            }
            f(c0388Ea);
            return this;
        }

        public b f(@NonNull C0388Ea c0388Ea) {
            if (c0388Ea == null) {
                throw new NullPointerException("cache is marked non-null but is null");
            }
            if (this.f == null) {
                this.f = new ArrayList(1);
            }
            for (C0388Ea c0388Ea2 : this.f) {
                if (c0388Ea2.r() == c0388Ea.r()) {
                    this.f.remove(c0388Ea2);
                    break;
                }
            }
            this.f.add(c0388Ea);
            return this;
        }

        public b g(@NonNull Collection<C0388Ea> collection) {
            if (collection == null) {
                throw new NullPointerException("caches is marked non-null but is null");
            }
            Iterable$EL.forEach(collection, new WU(5, this));
            return this;
        }

        @Deprecated
        public b h(@NonNull Map<Integer, C0388Ea> map) {
            if (map != null) {
                return g(map.values());
            }
            throw new NullPointerException("caches is marked non-null but is null");
        }

        public b i() {
            List<C0388Ea> list = this.f;
            if (list != null) {
                list.clear();
            }
            return this;
        }

        public b j() {
            List<C2848tT> list = this.d;
            if (list != null) {
                list.clear();
            }
            return this;
        }

        public b k(boolean z) {
            this.e = z;
            return this;
        }

        public b l() {
            this.g = new XC();
            return this;
        }

        public b m(Executor executor) {
            this.h = executor;
            return this;
        }

        public b n(XC xc) {
            this.g = xc;
            return this;
        }

        public b p(int i) {
            this.b = i;
            return this;
        }

        public b q(int i) {
            this.c = i;
            return this;
        }

        public b r(@NonNull H70 h70) {
            if (h70 == null) {
                throw new NullPointerException("resolver is marked non-null but is null");
            }
            this.a = h70;
            return this;
        }

        public b s(Collection<? extends C2848tT> collection) {
            if (this.d == null) {
                this.d = new ArrayList();
            }
            this.d.addAll(collection);
            return this;
        }

        public b t(C2848tT c2848tT) {
            if (this.d == null) {
                this.d = new ArrayList();
            }
            this.d.add(c2848tT);
            return this;
        }

        @Generated
        public String toString() {
            return "LookupSession.LookupSessionBuilder(resolver=" + this.a + ", maxRedirects=" + this.b + ", ndots=" + this.c + ", searchPath=" + this.d + ", cycleResults=" + this.e + ", caches=" + this.f + ", hostsFileParser=" + this.g + ", executor=" + this.h + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Stream B(X40 x40) {
        return Collection$EL.stream(x40.r(this.e));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [o.lM] */
    private CompletionStage<C1774iM> E(final Iterator<C2848tT> it, final int i2, final int i3) {
        H50 h50Z = H50.z(it.next(), i2, i3);
        return F(h50Z, null).thenCompose(new C1433es0(this, h50Z, 1)).handle(new BiFunction() { // from class: o.lM
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return this.a.t(it, i2, i3, (C1774iM) obj, (Throwable) obj2);
            }
        }).thenCompose(Function$CC.identity());
    }

    private CompletionStage<C1774iM> F(final H50 h50, final List<C2848tT> list) {
        return AbstractC0712Qn.k(Optional.ofNullable(this.f.get(Integer.valueOf(h50.t()))).map(new Vr0(4, h50)).map(new TU(this, h50, list, 1)).orElseGet(new Supplier() { // from class: o.kM
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.a.w(h50, list);
            }
        }));
    }

    private C1774iM G(List<C2848tT> list, int i2) {
        if (this.g == null) {
            return null;
        }
        if (i2 != 1 && i2 != 28) {
            return null;
        }
        try {
            for (C2848tT c2848tT : list) {
                Optional<InetAddress> optionalC = this.g.c(c2848tT, i2);
                if (optionalC.isPresent()) {
                    return new C1774iM(Collections.singletonList(i2 == 1 ? new C1837j(c2848tT, 1, 0L, optionalC.get()) : new C1545g(c2848tT, 1, 0L, optionalC.get())), Collections.emptyList());
                }
            }
            return null;
        } catch (IOException e) {
            i.Q(e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public CompletionStage<C1774iM> w(H50 h50, List<C2848tT> list) {
        return this.a.d(AQ.w(h50), this.h).thenApply(new C1870jM(this, 1)).thenApply(new C1433es0(list, h50, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AQ I(AQ aq) {
        for (X40 x40 : aq.s(1)) {
            if (x40.getType() == 5 || x40.getType() == 39) {
                if (x40.t() != 1) {
                    throw new C2157mG("Multiple CNAME RRs not allowed, see RFC1034 3.6.2");
                }
            }
        }
        Optional.ofNullable(this.f.get(Integer.valueOf(aq.n().t()))).ifPresent(new WU(4, aq));
        return aq;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public CompletionStage<C1774iM> z(C1774iM c1774iM, H50 h50, int i2) {
        if (i2 > this.b) {
            throw new C2435p60(this.b);
        }
        List<H50> listB = c1774iM.b();
        return (listB.isEmpty() || h50.y() == listB.get(0).y() || !(listB.get(0).y() == 5 || listB.get(0).y() == 39)) ? CompletableFuture.completedFuture(c1774iM) : K(c1774iM, h50, i2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [o.mM] */
    private CompletionStage<C1774iM> K(C1774iM c1774iM, H50 h50, int i2) {
        ArrayList arrayList = new ArrayList(c1774iM.a());
        ArrayList arrayList2 = new ArrayList();
        C2848tT c2848tTV = h50.v();
        for (H50 h51 : c1774iM.b()) {
            if (i2 > this.b) {
                throw new C2435p60(this.b);
            }
            if (h51.t() == h50.t()) {
                if (h51.y() == 5 && c2848tTV.equals(h51.v())) {
                    arrayList.add(c2848tTV);
                    i2++;
                    c2848tTV = ((C3243xa) h51).W();
                } else if (h51.y() == 39 && c2848tTV.y(h51.v())) {
                    arrayList.add(c2848tTV);
                    i2++;
                    try {
                        c2848tTV = c2848tTV.l((C0448Gi) h51);
                    } catch (C2945uT e) {
                        throw new C2157mG("Cannot derive DNAME from " + h51 + " for " + c2848tTV, e);
                    }
                } else if (h51.y() == h50.y() && c2848tTV.equals(h51.v())) {
                    arrayList2.add(h51);
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            return CompletableFuture.completedFuture(new C1774iM(arrayList2, arrayList));
        }
        if (i2 > this.b) {
            throw new C2435p60(this.b);
        }
        final int i3 = i2 + 1;
        final H50 h50Z = H50.z(c2848tTV, h50.y(), h50.t());
        return F(h50Z, arrayList).thenCompose(new Function() { // from class: o.mM
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public final /* synthetic */ Function mo4andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.a.z(h50Z, i3, (C1774iM) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public CompletionStage<C1774iM> s(C1774iM c1774iM, H50 h50) {
        return z(c1774iM, h50, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C2848tT M(C2848tT c2848tT, C2848tT c2848tT2) {
        try {
            return C2848tT.h(c2848tT, c2848tT2);
        } catch (C2945uT unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public CompletionStage<C1774iM> v(Gc0 gc0, H50 h50, List<C2848tT> list) {
        if (gc0.i()) {
            return o(new YU(h50.v(), h50.y()));
        }
        if (gc0.j()) {
            return o(new ZU(h50.v(), h50.y()));
        }
        if (gc0.k()) {
            return CompletableFuture.completedFuture(new C1774iM((List) Collection$EL.stream(gc0.b()).flatMap(new C1870jM(this, 0)).collect(Collectors.toList()), list));
        }
        return null;
    }

    private static C1774iM m(AQ aq, List<C2848tT> list, H50 h50) {
        int iO = aq.o();
        List<H50> listQ = aq.q(1);
        if (!listQ.isEmpty() || iO == 0) {
            return new C1774iM(listQ, list);
        }
        if (iO == 2) {
            throw new C1987kc0();
        }
        if (iO == 3) {
            throw new YU(h50.v(), h50.y());
        }
        if (iO != 8) {
            throw new C1676hM(AbstractC1701hf0.t("Unknown non-success error code ", C2820t50.b(iO)));
        }
        throw new ZU(h50.v(), h50.y());
    }

    public static b n() {
        b bVar = new b();
        bVar.b = 16;
        bVar.c = 1;
        return bVar;
    }

    private <T extends Throwable> CompletionStage<C1774iM> o(T t) {
        CompletableFuture completableFutureJ = AbstractC3197x0.j();
        completableFutureJ.completeExceptionally(t);
        return completableFutureJ;
    }

    public static b p() {
        return n().r(new C3085vs((Iterable<H70>) Collection$EL.stream(I70.c().h()).map(new C2504ps(9)).collect(Collectors.toList()))).q(I70.c().d()).f(new C0388Ea(1)).l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ CompletionStage t(Iterator it, int i2, int i3, C1774iM c1774iM, Throwable th) {
        Throwable cause = th == null ? null : th.getCause();
        if ((cause instanceof YU) || (cause instanceof ZU)) {
            return it.hasNext() ? E(it, i2, i3) : o(cause);
        }
        return cause != null ? o(cause) : CompletableFuture.completedFuture(c1774iM);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Gc0 u(H50 h50, C0388Ea c0388Ea) {
        return c0388Ea.y(h50.v(), h50.y(), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C1774iM x(List list, H50 h50, AQ aq) {
        return m(aq, list, h50);
    }

    public CompletionStage<C1774iM> C(C2848tT c2848tT, int i2) {
        return D(c2848tT, i2, 1);
    }

    public CompletionStage<C1774iM> D(C2848tT c2848tT, int i2, int i3) {
        List<C2848tT> listQ = q(c2848tT);
        C1774iM c1774iMG = G(listQ, i2);
        return c1774iMG != null ? CompletableFuture.completedFuture(c1774iMG) : E(listQ.iterator(), i2, i3);
    }

    public List<C2848tT> q(C2848tT c2848tT) {
        if (c2848tT.q()) {
            return Collections.singletonList(c2848tT);
        }
        List<C2848tT> list = (List) Collection$EL.stream(this.d).map(new Vr0(5, c2848tT)).filter(new C2244n8(1)).collect(Collectors.toCollection(new C1504ff(1)));
        if (c2848tT.s() > this.c) {
            list.add(0, M(c2848tT, C2848tT.v));
        } else {
            list.add(M(c2848tT, C2848tT.v));
        }
        return list;
    }

    private C2260nM(@NonNull H70 h70, int i2, int i3, List<C2848tT> list, boolean z, List<C0388Ea> list2, XC xc, Executor executor) {
        if (h70 == null) {
            throw new NullPointerException("resolver is marked non-null but is null");
        }
        this.a = h70;
        this.b = i2;
        this.c = i3;
        this.d = list;
        this.e = z;
        this.f = list2 == null ? Collections.emptyMap() : (Map) Collection$EL.stream(list2).collect(Collectors.toMap(new C2504ps(10), new C2504ps(11)));
        this.g = xc;
        this.h = executor == null ? ForkJoinPool.commonPool() : executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C0388Ea A(C0388Ea c0388Ea) {
        return c0388Ea;
    }
}
