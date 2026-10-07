package o;

import j$.time.Duration;
import j$.util.Objects;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.concurrent.ForkJoinPool;
import java.util.function.Function;
import lombok.Generated;

/* JADX INFO: loaded from: classes.dex */
public class Qd0 implements H70 {
    public static final int i = 53;
    public static final int j = 1280;
    private static final short k = 512;
    private InetSocketAddress a;
    private InetSocketAddress b;
    private boolean c;
    private boolean d;
    private C3141wV e;
    private C1511fi0 f;
    private Duration g;

    @Generated
    private static final CL h = DL.d(Qd0.class);
    private static InetSocketAddress l = new InetSocketAddress(InetAddress.getLoopbackAddress(), 53);

    public Qd0() {
        this((String) null);
    }

    private int A(AQ aq) {
        C3141wV c3141wVM = aq.m();
        if (c3141wVM == null) {
            return 512;
        }
        return c3141wVM.Y();
    }

    private AQ B(byte[] bArr) throws Rw0 {
        try {
            return new AQ(bArr);
        } catch (IOException e) {
            if (e instanceof Rw0) {
                throw ((Rw0) e);
            }
            throw new Rw0("Error parsing message", e);
        }
    }

    private AQ C(AQ aq) throws Rw0 {
        yy0 yy0VarS = yy0.s(aq.n().v(), this.a, this.f);
        yy0VarS.F(this.g);
        yy0VarS.D(this.b);
        try {
            yy0VarS.z();
            List<H50> listG = yy0VarS.g();
            AQ aq2 = new AQ(aq.k().k());
            aq2.k().t(5);
            aq2.k().t(0);
            aq2.b(aq.n(), 0);
            Iterator<H50> it = listG.iterator();
            while (it.hasNext()) {
                aq2.b(it.next(), 1);
            }
            return aq2;
        } catch (xy0 e) {
            throw new Rw0(e.getMessage());
        }
    }

    public static void G(String str) {
        l = new InetSocketAddress(str, 53);
    }

    public static void H(InetSocketAddress inetSocketAddress) {
        l = inetSocketAddress;
    }

    private void L(AQ aq, AQ aq2, byte[] bArr) {
        C1511fi0 c1511fi0 = this.f;
        if (c1511fi0 == null) {
            return;
        }
        h.R(Integer.valueOf(aq.k().k()), C2820t50.a(c1511fi0.F(aq2, bArr, aq.j())), "TSIG verify on message id {}: {}");
    }

    private void r(AQ aq) {
        if (this.e == null || aq.m() != null) {
            return;
        }
        aq.b(this.e, 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(CompletableFuture completableFuture, AQ aq) {
        try {
            completableFuture.complete(C(aq));
        } catch (IOException e) {
            completableFuture.completeExceptionally(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ CompletionStage z(int i2, AQ aq, boolean z, Executor executor, byte[] bArr) {
        CompletableFuture completableFutureJ = AbstractC3197x0.j();
        if (bArr.length < 12) {
            completableFutureJ.completeExceptionally(new Rw0("invalid DNS header - too short"));
            return completableFutureJ;
        }
        int i3 = ((bArr[0] & 255) << 8) + (bArr[1] & 255);
        if (i3 != i2) {
            completableFutureJ.completeExceptionally(new Rw0(AbstractC1674hK.m(i2, i3, "invalid message id: expected ", "; got id ")));
            return completableFutureJ;
        }
        try {
            AQ aqB = B(bArr);
            if (!aq.n().v().equals(aqB.n().v())) {
                completableFutureJ.completeExceptionally(new Rw0("invalid name in message: expected " + aq.n().v() + "; got " + aqB.n().v()));
                return completableFutureJ;
            }
            if (aq.n().t() != aqB.n().t()) {
                completableFutureJ.completeExceptionally(new Rw0("invalid class in message: expected " + C0344Ci.b(aq.n().t()) + "; got " + C0344Ci.b(aqB.n().t())));
                return completableFutureJ;
            }
            if (aq.n().y() != aqB.n().y()) {
                completableFutureJ.completeExceptionally(new Rw0("invalid type in message: expected " + C3080vp0.e(aq.n().y()) + "; got " + C3080vp0.e(aqB.n().y())));
                return completableFutureJ;
            }
            L(aq, aqB, bArr);
            if (z || this.d || !aqB.k().g(6)) {
                aqB.G(this);
                completableFutureJ.complete(aqB);
                return completableFutureJ;
            }
            CL cl = h;
            if (cl.O()) {
                cl.z(Integer.valueOf(i2), aqB, "Got truncated response for id {}, retrying via TCP, response:\n{}");
            } else {
                cl.C(Integer.valueOf(i2), "Got truncated response for id {}, retrying via TCP");
            }
            return D(aq, true, executor);
        } catch (Rw0 e) {
            completableFutureJ.completeExceptionally(e);
            return completableFutureJ;
        }
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [o.Pd0] */
    public CompletableFuture<AQ> D(final AQ aq, boolean z, final Executor executor) {
        final int iK = aq.k().k();
        byte[] bArrM = aq.M(AQ.w);
        int iA = A(aq);
        boolean z2 = z || bArrM.length > iA;
        CL cl = h;
        if (cl.O()) {
            cl.u("Sending {}/{}, id={} to {}/{}:{}, query:\n{}", aq.n().v(), C3080vp0.e(aq.n().y()), Integer.valueOf(iK), z2 ? "tcp" : "udp", this.a.getAddress().getHostAddress(), Integer.valueOf(this.a.getPort()), aq);
        } else if (cl.j()) {
            cl.f("Sending {}/{}, id={} to {}/{}:{}", aq.n().v(), C3080vp0.e(aq.n().y()), Integer.valueOf(iK), z2 ? "tcp" : "udp", this.a.getAddress().getHostAddress(), Integer.valueOf(this.a.getPort()));
        }
        final boolean z3 = z2;
        return (z2 ? VU.A(this.b, this.a, aq, bArrM, this.g) : XU.x(this.b, this.a, aq, bArrM, iA, this.g)).thenComposeAsync((Function<? super byte[], ? extends CompletionStage<U>>) ((Function) new Function() { // from class: o.Pd0
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public final /* synthetic */ Function mo4andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.a.z(iK, aq, z3, executor, (byte[]) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }), executor);
    }

    public void E(InetAddress inetAddress) {
        this.a = new InetSocketAddress(inetAddress, this.a.getPort());
    }

    public void F(InetSocketAddress inetSocketAddress) {
        this.a = inetSocketAddress;
    }

    public void I(C3141wV c3141wV) {
        this.e = c3141wV;
    }

    public void J(InetAddress inetAddress) {
        this.b = new InetSocketAddress(inetAddress, 0);
    }

    public void K(InetSocketAddress inetSocketAddress) {
        this.b = inetSocketAddress;
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
        this.f = c1511fi0;
    }

    @Override // o.H70
    public CompletionStage<AQ> d(AQ aq, Executor executor) {
        H50 h50N;
        if (aq.k().m() == 0 && (h50N = aq.n()) != null && h50N.y() == 252) {
            CompletableFuture completableFutureJ = AbstractC3197x0.j();
            CompletableFuture.runAsync(new RunnableC1169c7(this, completableFutureJ, aq, 9), executor);
            return completableFutureJ;
        }
        AQ aqC = aq.clone();
        r(aqC);
        C1511fi0 c1511fi0 = this.f;
        if (c1511fi0 != null) {
            aqC.I(c1511fi0, 0, null);
        }
        return D(aqC, this.c, executor);
    }

    @Override // o.H70
    public void e(Duration duration) {
        this.g = duration;
    }

    @Override // o.H70
    public final /* synthetic */ void f(int i2, int i3, int i4, AbstractC2304np... abstractC2304npArr) {
        G70.g(this, i2, i3, i4, abstractC2304npArr);
    }

    @Override // o.H70
    public void g(int i2) {
        this.a = new InetSocketAddress(this.a.getAddress(), i2);
    }

    @Override // o.H70
    public void h(int i2, int i3, int i4, List<AbstractC2304np> list) {
        if (i2 == -1) {
            this.e = null;
        } else {
            if (i2 != 0) {
                throw new IllegalArgumentException("invalid EDNS version - must be 0 or -1 to disable");
            }
            this.e = new C3141wV(i3 == 0 ? j : i3, 0, i2, i4, list);
        }
    }

    @Override // o.H70
    public void i(boolean z) {
        this.d = z;
    }

    @Override // o.H70
    public Duration j() {
        return this.g;
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
    public final /* synthetic */ void m(int i2) {
        G70.h(this, i2);
    }

    @Override // o.H70
    public final /* synthetic */ void n(int i2, int i3) {
        G70.i(this, i2, i3);
    }

    @Override // o.H70
    public void o(boolean z) {
        this.c = z;
    }

    public InetSocketAddress s() {
        return this.a;
    }

    public C3141wV t() {
        return this.e;
    }

    public String toString() {
        return "SimpleResolver [" + this.a + "]";
    }

    public boolean u() {
        return this.d;
    }

    public int v() {
        return this.a.getPort();
    }

    public boolean w() {
        return this.c;
    }

    public C1511fi0 x() {
        return this.f;
    }

    public Qd0(String str) {
        this.e = new C3141wV(j, 0, 0, 0);
        this.g = Duration.ofSeconds(10L);
        if (str != null) {
            this.a = new InetSocketAddress("0".equals(str) ? InetAddress.getLoopbackAddress() : InetAddress.getByName(str), 53);
            return;
        }
        InetSocketAddress inetSocketAddressG = I70.c().g();
        this.a = inetSocketAddressG;
        if (inetSocketAddressG == null) {
            this.a = l;
        }
    }

    public Qd0(InetSocketAddress inetSocketAddress) {
        this.e = new C3141wV(j, 0, 0, 0);
        this.g = Duration.ofSeconds(10L);
        Objects.requireNonNull(inetSocketAddress, "host must not be null");
        this.a = inetSocketAddress;
    }

    public Qd0(InetAddress inetAddress) {
        this.e = new C3141wV(j, 0, 0, 0);
        this.g = Duration.ofSeconds(10L);
        Objects.requireNonNull(inetAddress, "host must not be null");
        this.a = new InetSocketAddress(inetAddress, 53);
    }
}
