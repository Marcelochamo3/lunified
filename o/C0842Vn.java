package o;

import j$.time.Duration;
import j$.time.temporal.ChronoUnit;
import j$.util.DesugarCollections;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Function$CC;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URL;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import lombok.Generated;

/* JADX INFO: renamed from: o.Vn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0842Vn implements H70 {
    private static Method A = null;
    private static Method B = null;
    private static Method C = null;
    private static final String D = "application/dns-message";
    private static final boolean m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static Object f580o;
    private static Method p;
    private static Method q;
    private static Method r;
    private static Method s;
    private static Method t;
    private static Method u;
    private static Method v;
    private static Method w;
    private static Method x;
    private static Method y;
    private static Method z;
    private final SSLSocketFactory a;
    private boolean b;
    private Duration c;
    private String d;
    private final Duration e;
    private C3141wV f;
    private C1511fi0 g;
    private Executor h;
    private final C1754i6 i;
    private final AtomicLong j;
    private final C1754i6 k;

    @Generated
    private static final CL l = DL.d(C0842Vn.class);
    private static final Map<Executor, Object> n = DesugarCollections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: o.Vn$a */
    public static final class a {
        private final int a;
        private final byte[] b;

        @Generated
        public a(int i, byte[] bArr) {
            this.a = i;
            this.b = bArr;
        }

        @Generated
        public int c() {
            return this.a;
        }

        @Generated
        public byte[] d() {
            return this.b;
        }

        @Generated
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return c() == aVar.c() && Arrays.equals(d(), aVar.d());
        }

        @Generated
        public int hashCode() {
            return Arrays.hashCode(d()) + ((c() + 59) * 59);
        }

        @Generated
        public String toString() {
            return "DohResolver.SendAndGetMessageBytesResponse(rc=" + c() + ", responseBytes=" + Arrays.toString(d()) + ")";
        }
    }

    static {
        boolean z2;
        if (!System.getProperty("java.version").startsWith("1.")) {
            try {
                Class<?> cls = Class.forName("java.net.http.HttpClient$Builder");
                Class<?> cls2 = Class.forName("java.net.http.HttpClient");
                Class<?> cls3 = Class.forName("java.net.http.HttpClient$Version");
                Class<?> cls4 = Class.forName("java.net.http.HttpRequest$Builder");
                Class<?> cls5 = Class.forName("java.net.http.HttpRequest");
                Class<?> cls6 = Class.forName("java.net.http.HttpRequest$BodyPublishers");
                Class<?> cls7 = Class.forName("java.net.http.HttpRequest$BodyPublisher");
                Class<?> cls8 = Class.forName("java.net.http.HttpResponse");
                Class<?> cls9 = Class.forName("java.net.http.HttpResponse$BodyHandlers");
                Class<?> cls10 = Class.forName("java.net.http.HttpResponse$BodyHandler");
                w = cls.getDeclaredMethod("connectTimeout", Duration.class);
                x = cls.getDeclaredMethod("executor", Executor.class);
                y = cls.getDeclaredMethod("build", null);
                v = cls2.getDeclaredMethod("newBuilder", null);
                z = cls2.getDeclaredMethod("sendAsync", cls5, cls10);
                Method declaredMethod = cls4.getDeclaredMethod("header", String.class, String.class);
                Method declaredMethod2 = cls4.getDeclaredMethod("version", cls3);
                q = cls4.getDeclaredMethod("timeout", Duration.class);
                s = cls4.getDeclaredMethod("uri", URI.class);
                r = cls4.getDeclaredMethod("copy", null);
                t = cls4.getDeclaredMethod("build", null);
                u = cls4.getDeclaredMethod("POST", cls7);
                Method declaredMethod3 = cls5.getDeclaredMethod("newBuilder", null);
                p = cls6.getDeclaredMethod("ofByteArray", byte[].class);
                A = cls9.getDeclaredMethod("ofByteArray", null);
                B = cls8.getDeclaredMethod("body", null);
                C = cls8.getDeclaredMethod("statusCode", null);
                f580o = declaredMethod3.invoke(null, null);
                Enum enumValueOf = Enum.valueOf(cls3, "HTTP_2");
                Object obj = f580o;
                Object[] objArr = new Object[1];
                try {
                    objArr[0] = enumValueOf;
                    declaredMethod2.invoke(obj, objArr);
                    Object obj2 = f580o;
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = "Content-Type";
                    objArr2[1] = D;
                    declaredMethod.invoke(obj2, objArr2);
                    Object obj3 = f580o;
                    Object[] objArr3 = new Object[2];
                    objArr3[0] = "Accept";
                    objArr3[1] = D;
                    declaredMethod.invoke(obj3, objArr3);
                    z2 = true;
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    l.t("Java >= 11 detected, but HttpRequest not available");
                    z2 = false;
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
            m = z2;
        }
        z2 = false;
        m = z2;
    }

    public C0842Vn(String str) {
        this(str, 100, Duration.ofMinutes(2L));
    }

    private String A(byte[] bArr) {
        String str = this.d;
        if (this.b) {
            return str;
        }
        StringBuilder sbS = AbstractC1674hK.s(str, "?dns=");
        sbS.append(Cy0.d(bArr, true));
        return sbS.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object C(Executor executor) {
        try {
            Object objInvoke = v.invoke(null, null);
            w.invoke(objInvoke, this.c);
            x.invoke(objInvoke, executor);
            return y.invoke(objInvoke, null);
        } catch (IllegalAccessException | InvocationTargetException e) {
            l.g("Could not create a HttpClient with for Executor {}", executor, e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ CompletionStage D(AQ aq, Executor executor, long j, Object obj, C1754i6.a aVar, Throwable th) {
        return th != null ? R(aq, th) : M(aq, executor, j, obj, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(long j, C1754i6.a aVar, boolean z2, C1754i6.a aVar2, Object obj, Throwable th) {
        if (th == null) {
            this.j.set(j);
        }
        aVar.a();
        if (z2) {
            aVar2.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ CompletableFuture F(AQ aq, Object obj, Throwable th) {
        AQ aq2;
        if (th != null) {
            return th.getCause().getClass().getSimpleName().equals("HttpTimeoutException") ? R(aq, th.getCause()) : w(th);
        }
        try {
            int iIntValue = ((Integer) C.invoke(obj, null)).intValue();
            if (iIntValue < 200 || iIntValue >= 300) {
                aq2 = new AQ();
                aq2.k().w(2);
            } else {
                byte[] bArr = (byte[]) B.invoke(obj, null);
                aq2 = new AQ(bArr);
                S(aq, aq2, bArr, this.g);
            }
            aq2.G(this);
            return CompletableFuture.completedFuture(aq2);
        } catch (IOException e) {
            e = e;
            return w(e);
        } catch (IllegalAccessException e2) {
            e = e2;
            return w(e);
        } catch (InvocationTargetException e3) {
            e = e3;
            return w(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ CompletionStage G(boolean z2, C1754i6.a aVar, AQ aq, Executor executor, long j, Object obj, C1754i6.a aVar2, Throwable th) {
        if (th == null) {
            return L(aq, executor, j, obj, aVar, z2, aVar2);
        }
        if (z2) {
            aVar.a();
        }
        return R(aq, th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ CompletableFuture H(AQ aq, String str, byte[] bArr, long j, C1754i6.a aVar, Throwable th) {
        AQ aq2;
        try {
            if (th != null) {
                return R(aq, th);
            }
            a aVarJ = J(str, bArr, j);
            if (aVarJ.a == 0) {
                aq2 = new AQ(aVarJ.b);
                S(aq, aq2, aVarJ.b, this.g);
            } else {
                aq2 = new AQ(0);
                aq2.k().w(aVarJ.a);
            }
            aq2.G(this);
            return CompletableFuture.completedFuture(aq2);
        } catch (IOException e) {
            return w(e);
        } catch (SocketTimeoutException e2) {
            return R(aq, e2);
        } finally {
            aVar.a();
        }
    }

    private AQ I(AQ aq) {
        AQ aqC = aq.clone();
        aqC.k().u(0);
        if (this.f != null && aqC.m() == null) {
            aqC.b(this.f, 3);
        }
        C1511fi0 c1511fi0 = this.g;
        if (c1511fi0 != null) {
            c1511fi0.m(aqC, null);
        }
        return aqC;
    }

    private a J(String str, byte[] bArr, long j) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        if (httpURLConnection instanceof HttpsURLConnection) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(this.a);
        }
        Duration durationMinus = this.c.minus(System.nanoTime() - j, ChronoUnit.NANOS);
        httpURLConnection.setConnectTimeout((int) durationMinus.toMillis());
        httpURLConnection.setReadTimeout((int) durationMinus.toMillis());
        httpURLConnection.setRequestMethod(this.b ? "POST" : "GET");
        httpURLConnection.setRequestProperty("Content-Type", D);
        httpURLConnection.setRequestProperty("Accept", D);
        if (this.b) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.getOutputStream().write(bArr);
        }
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode < 200 || responseCode >= 300) {
            v(httpURLConnection.getInputStream());
            v(httpURLConnection.getErrorStream());
            return new a(2, null);
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            try {
                if (httpURLConnection.getContentLength() > -1) {
                    int contentLength = httpURLConnection.getContentLength();
                    byte[] bArr2 = new byte[contentLength];
                    int i = 0;
                    do {
                        int i2 = inputStream.read(bArr2, i, contentLength - i);
                        if (i2 <= 0) {
                            if (i < contentLength) {
                                throw new EOFException("Could not read expected content length");
                            }
                            a aVar = new a(0, bArr2);
                            inputStream.close();
                            return aVar;
                        }
                        i += i2;
                    } while (!this.c.minus(System.nanoTime() - j, ChronoUnit.NANOS).isNegative());
                    throw new SocketTimeoutException();
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byte[] bArr3 = new byte[C1672hI.a.f];
                    while (true) {
                        int i3 = inputStream.read(bArr3, 0, C1672hI.a.f);
                        if (i3 <= 0) {
                            a aVar2 = new a(0, byteArrayOutputStream.toByteArray());
                            byteArrayOutputStream.close();
                            inputStream.close();
                            return aVar2;
                        }
                        if (this.c.minus(System.nanoTime() - j, ChronoUnit.NANOS).isNegative()) {
                            throw new SocketTimeoutException();
                        }
                        byteArrayOutputStream.write(bArr3, 0, i3);
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th6) {
                            th4.addSuppressed(th6);
                        }
                    }
                    throw th5;
                }
            }
        } catch (IOException e) {
            v(httpURLConnection.getErrorStream());
            throw e;
        }
        v(httpURLConnection.getErrorStream());
        throw e;
    }

    private CompletionStage<AQ> K(AQ aq, Executor executor) {
        long jNanoTime = System.nanoTime();
        byte[] bArrL = I(aq).L();
        String strA = A(bArrL);
        try {
            Object objInvoke = r.invoke(f580o, null);
            s.invoke(objInvoke, URI.create(strA));
            if (this.b) {
                u.invoke(objInvoke, p.invoke(null, bArrL));
            }
            return this.k.d(this.c.minus(System.nanoTime() - jNanoTime, ChronoUnit.NANOS)).handle(new C0738Rn(this, aq, executor, jNanoTime, objInvoke)).thenCompose(Function$CC.identity());
        } catch (IllegalAccessException | InvocationTargetException e) {
            return w(e);
        }
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [o.Sn] */
    private CompletionStage<AQ> L(AQ aq, Executor executor, final long j, Object obj, final C1754i6.a aVar, final boolean z2, final C1754i6.a aVar2) {
        int i = 0;
        Duration durationMinus = this.c.minus(System.nanoTime() - j, ChronoUnit.NANOS);
        if (durationMinus.isNegative()) {
            if (z2) {
                aVar.a();
            }
            aVar2.a();
            return R(aq, null);
        }
        try {
            Object objY = y(executor);
            q.invoke(obj, durationMinus);
            return Lj0.d(AbstractC3197x0.D(z.invoke(objY, t.invoke(obj, null), A.invoke(null, null))).whenComplete((BiConsumer) new BiConsumer() { // from class: o.Sn
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj2, Object obj3) {
                    this.a.E(j, aVar2, z2, aVar, obj2, (Throwable) obj3);
                }

                public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                    return BiConsumer$CC.$default$andThen(this, biConsumer);
                }
            }).handleAsync((BiFunction) new C0790Tn(this, i, aq), executor).thenCompose(Function$CC.identity()), durationMinus.toMillis(), TimeUnit.MILLISECONDS);
        } catch (IllegalAccessException | InvocationTargetException e) {
            return w(e);
        }
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [o.Un] */
    private CompletionStage<AQ> M(final AQ aq, final Executor executor, final long j, final Object obj, final C1754i6.a aVar) {
        final boolean z2 = this.j.get() < System.nanoTime() - this.e.toNanos();
        if (!z2) {
            aVar.a();
        }
        Duration durationMinus = this.c.minus(System.nanoTime() - j, ChronoUnit.NANOS);
        if (!durationMinus.isNegative()) {
            return this.i.d(durationMinus).handle(new BiFunction() { // from class: o.Un
                public final /* synthetic */ BiFunction andThen(Function function) {
                    return BiFunction$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.BiFunction
                public final Object apply(Object obj2, Object obj3) {
                    return this.a.G(z2, aVar, aq, executor, j, obj, (C1754i6.a) obj2, (Throwable) obj3);
                }
            }).thenCompose(Function$CC.identity());
        }
        if (z2) {
            aVar.a();
        }
        return R(aq, null);
    }

    private CompletionStage<AQ> N(AQ aq, Executor executor) {
        byte[] bArrL = I(aq).L();
        return this.i.d(this.c).handleAsync(new C0738Rn(this, aq, A(bArrL), bArrL, System.nanoTime()), executor).thenCompose(Function$CC.identity());
    }

    private <T> CompletableFuture<T> R(AQ aq, Throwable th) {
        return w(new IOException("Query " + aq.k().k() + " for " + aq.n().v() + "/" + C3080vp0.e(aq.n().y()) + " timed out", th));
    }

    private void S(AQ aq, AQ aq2, byte[] bArr, C1511fi0 c1511fi0) {
        if (c1511fi0 == null) {
            return;
        }
        l.f("TSIG verify for query {}, {}/{}: {}", Integer.valueOf(aq.k().k()), aq.n().v(), C3080vp0.e(aq.n().y()), C2820t50.a(c1511fi0.F(aq2, bArr, aq.j())));
    }

    private void v(InputStream inputStream) {
        if (inputStream != null) {
            try {
                try {
                    do {
                    } while (inputStream.read(new byte[C1672hI.a.f]) > 0);
                    inputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            inputStream.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    private <T> CompletableFuture<T> w(Throwable th) {
        CompletableFuture<T> completableFutureJ = AbstractC3197x0.j();
        completableFutureJ.completeExceptionally(th);
        return completableFutureJ;
    }

    private Object y(Executor executor) {
        return j$.util.Map.EL.computeIfAbsent(n, executor, new Vr0(2, this));
    }

    public boolean B() {
        return this.b;
    }

    @Deprecated
    public void O(Executor executor) {
        if (executor == null) {
            executor = ForkJoinPool.commonPool();
        }
        this.h = executor;
        n.clear();
    }

    public void P(String str) {
        this.d = str;
    }

    public void Q(boolean z2) {
        this.b = z2;
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
        this.g = c1511fi0;
    }

    @Override // o.H70
    public CompletionStage<AQ> d(AQ aq, Executor executor) {
        return m ? K(aq, executor) : N(aq, executor);
    }

    @Override // o.H70
    public void e(Duration duration) {
        this.c = duration;
        n.clear();
    }

    @Override // o.H70
    public final /* synthetic */ void f(int i, int i2, int i3, AbstractC2304np... abstractC2304npArr) {
        G70.g(this, i, i2, i3, abstractC2304npArr);
    }

    @Override // o.H70
    public void h(int i, int i2, int i3, List<AbstractC2304np> list) {
        if (i == -1) {
            this.f = null;
        } else {
            if (i != 0) {
                throw new IllegalArgumentException("invalid EDNS version - must be 0 or -1 to disable");
            }
            this.f = new C3141wV(0, 0, i, i3, list);
        }
    }

    @Override // o.H70
    public Duration j() {
        return this.c;
    }

    @Override // o.H70
    public CompletionStage<AQ> k(AQ aq) {
        return d(aq, this.h);
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

    public String toString() {
        StringBuilder sb = new StringBuilder("DohResolver {");
        sb.append(this.b ? "POST " : "GET ");
        return AbstractC1701hf0.h(sb, this.d, "}");
    }

    @Deprecated
    public Executor x() {
        return this.h;
    }

    public String z() {
        return this.d;
    }

    public C0842Vn(String str, int i, Duration duration) {
        this.b = false;
        this.c = Duration.ofSeconds(5L);
        this.f = new C3141wV(0, 0, 0);
        this.h = ForkJoinPool.commonPool();
        this.j = new AtomicLong(0L);
        this.k = new C1754i6(1);
        this.d = str;
        this.e = duration;
        if (i <= 0) {
            throw new IllegalArgumentException("maxConcurrentRequests must be > 0");
        }
        if (!m) {
            try {
                int i2 = Integer.parseInt(System.getProperty("http.maxConnections", "5"));
                if (i > i2) {
                    i = i2;
                }
            } catch (NumberFormatException unused) {
            }
        }
        this.i = new C1754i6(i);
        try {
            this.a = SSLContext.getDefault().getSocketFactory();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // o.H70
    public void g(int i) {
    }

    @Override // o.H70
    public void i(boolean z2) {
    }

    @Override // o.H70
    public void o(boolean z2) {
    }
}
