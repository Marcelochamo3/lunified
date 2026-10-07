package io.sentry;

import java.io.Closeable;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;

/* JADX INFO: loaded from: classes.dex */
public final class SpotlightIntegration implements InterfaceC0002a0, A1, Closeable {
    public I1 l;
    public ILogger m = A0.l;
    public T n = C0105y0.p;

    public static void a(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
        } catch (IOException unused) {
        } finally {
            httpURLConnection.disconnect();
        }
    }

    public static HttpURLConnection f(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) URI.create(str).toURL().openConnection();
        httpURLConnection.setReadTimeout(1000);
        httpURLConnection.setConnectTimeout(1000);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/x-sentry-envelope");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        httpURLConnection.setRequestProperty("Connection", "close");
        httpURLConnection.connect();
        return httpURLConnection;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.n.j(0L);
        I1 i1 = this.l;
        if (i1 == null || i1.getBeforeEnvelopeCallback() != this) {
            return;
        }
        this.l.setBeforeEnvelopeCallback(null);
    }

    @Override // io.sentry.InterfaceC0002a0
    public final void l(I1 i1) {
        this.l = i1;
        this.m = i1.getLogger();
        if (i1.getBeforeEnvelopeCallback() != null || !i1.isEnableSpotlight()) {
            this.m.h(EnumC0094u1.DEBUG, "SpotlightIntegration is not enabled. BeforeEnvelopeCallback is already set or spotlight is not enabled.", new Object[0]);
            return;
        }
        this.n = new C0072p0(5, false);
        i1.setBeforeEnvelopeCallback(this);
        this.m.h(EnumC0094u1.DEBUG, "SpotlightIntegration enabled.", new Object[0]);
    }
}
