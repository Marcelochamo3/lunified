package o;

import j$.time.Duration;
import j$.util.Collection$EL;
import j$.util.Comparator;
import j$.util.concurrent.atomic.DesugarAtomicInteger;
import j$.util.function.Function$CC;
import j$.util.function.IntUnaryOperator$CC;
import j$.util.stream.Collectors;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntUnaryOperator;
import lombok.Generated;

/* JADX INFO: renamed from: o.vs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3085vs implements H70 {

    @Generated
    private static final CL f = DL.d(C3085vs.class);
    public static final Duration g = Duration.ofSeconds(10);
    public static final Duration h = Duration.ofSeconds(5);
    private final List<b> a;
    private final AtomicInteger b;
    private boolean c;
    private int d;
    private Duration e;

    /* JADX INFO: renamed from: o.vs$a */
    public static class a {
        private final AQ a;
        private final int[] b;
        private final int c;
        private final long d;
        private List<b> e;
        private int f;

        public a(C3085vs c3085vs, AQ aq) {
            this.e = new ArrayList(c3085vs.a);
            this.d = c3085vs.e.toNanos() + System.nanoTime();
            if (c3085vs.c) {
                int iUpdateAndGet = DesugarAtomicInteger.updateAndGet(c3085vs.b, new IntUnaryOperator() { // from class: o.rs
                    public final /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
                        return IntUnaryOperator$CC.$default$andThen(this, intUnaryOperator);
                    }

                    @Override // java.util.function.IntUnaryOperator
                    public final int applyAsInt(int i) {
                        return this.a.j(i);
                    }

                    public final /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
                        return IntUnaryOperator$CC.$default$compose(this, intUnaryOperator);
                    }
                });
                if (iUpdateAndGet > 0) {
                    ArrayList arrayList = new ArrayList(this.e.size());
                    for (int i = 0; i < this.e.size(); i++) {
                        arrayList.add(this.e.get((i + iUpdateAndGet) % this.e.size()));
                    }
                    this.e = arrayList;
                }
            } else {
                this.e = (List) Collection$EL.stream(this.e).sorted(Comparator.CC.comparingInt(new C2794ss())).collect(Collectors.toList());
            }
            this.b = new int[this.e.size()];
            this.c = c3085vs.d;
            this.a = aq;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public CompletionStage<AQ> l(AQ aq, Throwable th, Executor executor) {
            int i = 1;
            AtomicInteger atomicInteger = this.e.get(this.f).b;
            if (th == null) {
                DesugarAtomicInteger.updateAndGet(atomicInteger, new C2988us());
                return CompletableFuture.completedFuture(aq);
            }
            C3085vs.f.f("Failed to resolve {}/{}, id={} with resolver {} ({}) on attempt {} of {}, reason={}", this.a.n().v(), C3080vp0.e(this.a.n().y()), Integer.valueOf(this.a.k().k()), Integer.valueOf(this.f), this.e.get(this.f).a, Integer.valueOf(this.b[this.f]), Integer.valueOf(this.c), th.getMessage());
            atomicInteger.incrementAndGet();
            if (this.d - System.nanoTime() >= 0) {
                int size = (this.f + 1) % this.e.size();
                this.f = size;
                if (this.b[size] < this.c) {
                    return m(executor).handle(new C2891ts(this, executor, i)).thenCompose(Function$CC.identity());
                }
                CompletableFuture completableFutureJ = AbstractC3197x0.j();
                completableFutureJ.completeExceptionally(th);
                return completableFutureJ;
            }
            CompletableFuture completableFutureJ2 = AbstractC3197x0.j();
            completableFutureJ2.completeExceptionally(new IOException("Timed out while trying to resolve " + this.a.n().v() + "/" + C3080vp0.e(this.a.n().m) + ", id=" + this.a.k().k()));
            return completableFutureJ2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int i(int i) {
            if (i > 0) {
                return (int) Math.log(i);
            }
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ int j(int i) {
            return (i + 1) % this.e.size();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int k(b bVar) {
            return bVar.b.get();
        }

        private CompletionStage<AQ> m(Executor executor) {
            b bVar = this.e.get(this.f);
            C3085vs.f.f("Sending {}/{}, id={} to resolver {} ({}), attempt {} of {}", this.a.n().v(), C3080vp0.e(this.a.n().y()), Integer.valueOf(this.a.k().k()), Integer.valueOf(this.f), bVar.a, Integer.valueOf(this.b[this.f] + 1), Integer.valueOf(this.c));
            int[] iArr = this.b;
            int i = this.f;
            iArr[i] = iArr[i] + 1;
            return bVar.a.d(this.a, executor);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CompletionStage<AQ> n(Executor executor) {
            return m(executor).handle(new C2891ts(this, executor, 0)).thenCompose(Function$CC.identity());
        }
    }

    /* JADX INFO: renamed from: o.vs$b */
    public static class b {
        private final H70 a;
        private final AtomicInteger b;

        @Generated
        public b(H70 h70, AtomicInteger atomicInteger) {
            this.a = h70;
            this.b = atomicInteger;
        }

        public String toString() {
            return this.a.toString();
        }

        public b(H70 h70) {
            this(h70, new AtomicInteger(0));
        }
    }

    public C3085vs() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.a = copyOnWriteArrayList;
        this.b = new AtomicInteger();
        this.d = 3;
        this.e = g;
        copyOnWriteArrayList.addAll((Collection) Collection$EL.stream(I70.c().h()).map(new C2504ps(6)).collect(Collectors.toList()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean F(H70 h70, b bVar) {
        return bVar.a == h70;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ H70[] H(int i) {
        return new H70[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ b I(InetSocketAddress inetSocketAddress) {
        Qd0 qd0 = new Qd0(inetSocketAddress);
        qd0.e(h);
        return new b(qd0);
    }

    public void A(H70 h70) {
        Collection$EL.removeIf(this.a, new C2407os(h70));
    }

    public boolean B() {
        return this.c;
    }

    public H70 C(int i) {
        if (i < this.a.size()) {
            return this.a.get(i).a;
        }
        return null;
    }

    public H70[] D() {
        return (H70[]) Collection$EL.stream(this.a).map(new C2504ps(0)).toArray(new C2601qs());
    }

    public int E() {
        return this.d;
    }

    public void J(boolean z) {
        this.c = z;
    }

    public void K(int i) {
        this.d = i;
    }

    @Override // o.H70
    public final /* synthetic */ void a(int i) {
        G70.f(this, i);
    }

    @Override // o.H70
    public final /* synthetic */ AQ b(AQ aq) {
        return G70.b(this, aq);
    }

    @Override // o.H70
    public void c(C1511fi0 c1511fi0) {
        Iterator<b> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().a.c(c1511fi0);
        }
    }

    @Override // o.H70
    public CompletionStage<AQ> d(AQ aq, Executor executor) {
        return new a(this, aq).n(executor);
    }

    @Override // o.H70
    public void e(Duration duration) {
        this.e = duration;
    }

    @Override // o.H70
    public final /* synthetic */ void f(int i, int i2, int i3, AbstractC2304np... abstractC2304npArr) {
        G70.g(this, i, i2, i3, abstractC2304npArr);
    }

    @Override // o.H70
    public void g(int i) {
        Iterator<b> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().a.g(i);
        }
    }

    @Override // o.H70
    public void h(int i, int i2, int i3, List<AbstractC2304np> list) {
        Iterator<b> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().a.h(i, i2, i3, list);
        }
    }

    @Override // o.H70
    public void i(boolean z) {
        Iterator<b> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().a.i(z);
        }
    }

    @Override // o.H70
    public Duration j() {
        return this.e;
    }

    @Override // o.H70
    public CompletionStage<AQ> k(AQ aq) {
        return d(aq, ForkJoinPool.commonPool());
    }

    @Override // o.H70
    public final /* synthetic */ Object l(AQ aq, L70 l70) {
        return G70.c(this, aq, l70);
    }

    @Override // o.H70
    public final /* synthetic */ void m(int i) {
        G70.h(this, i);
    }

    @Override // o.H70
    public final /* synthetic */ void n(int i, int i2) {
        G70.i(this, i, i2);
    }

    @Override // o.H70
    public void o(boolean z) {
        Iterator<b> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().a.o(z);
        }
    }

    public String toString() {
        return "ExtendedResolver of " + this.a;
    }

    public void z(H70 h70) {
        this.a.add(new b(h70));
    }

    public C3085vs(String[] strArr) {
        this.a = new CopyOnWriteArrayList();
        this.b = new AtomicInteger();
        this.d = 3;
        this.e = g;
        for (String str : strArr) {
            Qd0 qd0 = new Qd0(str);
            qd0.e(h);
            this.a.add(new b(qd0));
        }
    }

    public C3085vs(H70[] h70Arr) {
        this(Arrays.asList(h70Arr));
    }

    public C3085vs(Iterable<H70> iterable) {
        this.a = new CopyOnWriteArrayList();
        this.b = new AtomicInteger();
        this.d = 3;
        this.e = g;
        Iterator<H70> it = iterable.iterator();
        while (it.hasNext()) {
            this.a.add(new b(it.next()));
        }
    }
}
