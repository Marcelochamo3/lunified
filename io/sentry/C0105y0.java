package io.sentry;

import j$.util.Objects;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: io.sentry.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0105y0 implements I, M0, N0, T, U, h2, X, Y, InterfaceC0052i1, ILogger {
    public static final C0105y0 m = new C0105y0(0);
    public static final C0105y0 n = new C0105y0(1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C0105y0 f156o = new C0105y0(2);
    public static final C0105y0 p = new C0105y0(3);
    public static final C0105y0 q = new C0105y0(4);
    public static final C0105y0 r = new C0105y0(5);
    public static final C0105y0 s = new C0105y0(6);
    public static final C0105y0 t = new C0105y0(7);
    public final /* synthetic */ int l;

    public /* synthetic */ C0105y0(int i) {
        this.l = i;
    }

    @Override // io.sentry.N0
    public M0 K() {
        return n;
    }

    @Override // io.sentry.U
    public Object b(Reader reader, Class cls) {
        return null;
    }

    @Override // io.sentry.h2
    public void close() {
        int i = this.l;
    }

    @Override // io.sentry.T
    public boolean d() {
        return false;
    }

    @Override // io.sentry.h2
    public List g(W w) {
        return null;
    }

    @Override // io.sentry.ILogger
    public void h(EnumC0094u1 enumC0094u1, String str, Object... objArr) {
        PrintStream printStream = System.out;
        String.format(str, objArr);
        Objects.toString(enumC0094u1);
        printStream.getClass();
    }

    @Override // io.sentry.X
    public boolean isRunning() {
        return false;
    }

    @Override // io.sentry.U
    public C0088s1 k(BufferedInputStream bufferedInputStream) {
        return null;
    }

    @Override // io.sentry.X
    public J0 l(W w, List list, I1 i1) {
        return null;
    }

    @Override // io.sentry.ILogger
    public boolean n(EnumC0094u1 enumC0094u1) {
        return true;
    }

    @Override // io.sentry.U
    public String o(Map map) {
        return "";
    }

    @Override // io.sentry.U
    public Object p(BufferedReader bufferedReader, Class cls, C0038e c0038e) {
        return null;
    }

    @Override // io.sentry.M0
    public io.sentry.rrweb.b q(C0041f c0041f) {
        return null;
    }

    @Override // io.sentry.ILogger
    public void s(EnumC0094u1 enumC0094u1, Throwable th, String str, Object... objArr) {
        if (th == null) {
            h(enumC0094u1, str, objArr);
            return;
        }
        PrintStream printStream = System.out;
        String.format(str, objArr);
        th.toString();
        StringWriter stringWriter = new StringWriter();
        new PrintWriter(stringWriter);
        stringWriter.toString();
        Objects.toString(enumC0094u1);
        printStream.getClass();
    }

    @Override // io.sentry.N0
    public void start() {
        int i = this.l;
    }

    @Override // io.sentry.T
    public Future submit(Runnable runnable) {
        return new FutureTask(new CallableC0107z(1));
    }

    @Override // io.sentry.T
    public Future u(Runnable runnable, long j) {
        return new FutureTask(new CallableC0107z(1));
    }

    @Override // io.sentry.ILogger
    public void v(EnumC0094u1 enumC0094u1, String str, Throwable th) {
        if (th == null) {
            h(enumC0094u1, str, new Object[0]);
            return;
        }
        PrintStream printStream = System.out;
        String.format(str, th.toString());
        StringWriter stringWriter = new StringWriter();
        new PrintWriter(stringWriter);
        stringWriter.toString();
        Objects.toString(enumC0094u1);
        printStream.getClass();
    }

    @Override // io.sentry.Y
    public io.sentry.transport.g w(I1 i1, C0088s1 c0088s1) {
        return new io.sentry.transport.c(i1, new r(i1), i1.getTransportGate(), c0088s1);
    }

    @Override // io.sentry.I
    public C0088s1 x(BufferedInputStream bufferedInputStream) {
        return null;
    }

    @Override // io.sentry.InterfaceC0052i1
    public AbstractC0049h1 y() {
        switch (this.l) {
            case 9:
                return new C0085r1();
            default:
                return new C0103x1();
        }
    }

    private final void A() {
    }

    private final void B() {
    }

    private final void C() {
    }

    private final void D() {
    }

    @Override // io.sentry.N0
    public void f() {
    }

    @Override // io.sentry.N0
    public void i() {
    }

    @Override // io.sentry.N0
    public void stop() {
    }

    @Override // io.sentry.h2
    public void a(T1 t1) {
    }

    @Override // io.sentry.X
    public void c(Q1 q1) {
    }

    @Override // io.sentry.h2
    public void e(V v) {
    }

    @Override // io.sentry.T
    public void j(long j) {
    }

    @Override // io.sentry.h2
    public void m(W w) {
    }

    @Override // io.sentry.U
    public void r(C0088s1 c0088s1, OutputStream outputStream) {
    }

    @Override // io.sentry.N0
    public void t(C0083q1 c0083q1, C0104y c0104y) {
    }

    @Override // io.sentry.U
    public void z(Object obj, BufferedWriter bufferedWriter) {
    }
}
