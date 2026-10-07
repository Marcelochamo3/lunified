package o;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: renamed from: o.qE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2543qE implements InterfaceC1610gj {
    public final C2151mA l;
    public final int m;
    public HttpURLConnection n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public InputStream f987o;
    public volatile boolean p;

    public C2543qE(C2151mA c2151mA, int i) {
        this.l = c2151mA;
        this.m = i;
    }

    @Override // o.InterfaceC1610gj
    public final void a() {
        InputStream inputStream = this.f987o;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.n;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.n = null;
    }

    @Override // o.InterfaceC1610gj
    public final Class b() {
        return InputStream.class;
    }

    @Override // o.InterfaceC1610gj
    public final int c() {
        return 2;
    }

    @Override // o.InterfaceC1610gj
    public final void cancel() {
        this.p = true;
    }

    public final InputStream d(URL url, int i, URL url2, Map map) throws C1766iE {
        int responseCode;
        int responseCode2 = -1;
        if (i >= 5) {
            throw new C1766iE(-1, null, "Too many (> 5) redirects!");
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new C1766iE(-1, null, "In re-direct loop");
                }
            } catch (URISyntaxException unused) {
            }
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            int i2 = this.m;
            httpURLConnection.setConnectTimeout(i2);
            httpURLConnection.setReadTimeout(i2);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.n = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.f987o = this.n.getInputStream();
                if (this.p) {
                    return null;
                }
                try {
                    responseCode = this.n.getResponseCode();
                } catch (IOException unused2) {
                    Log.isLoggable("HttpUrlFetcher", 3);
                    responseCode = -1;
                }
                int i3 = responseCode / 100;
                if (i3 == 2) {
                    HttpURLConnection httpURLConnection2 = this.n;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.f987o = new C1801ih(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                httpURLConnection2.getContentEncoding();
                            }
                            this.f987o = httpURLConnection2.getInputStream();
                        }
                        return this.f987o;
                    } catch (IOException e) {
                        try {
                            responseCode2 = httpURLConnection2.getResponseCode();
                        } catch (IOException unused3) {
                            Log.isLoggable("HttpUrlFetcher", 3);
                        }
                        throw new C1766iE(responseCode2, e, "Failed to obtain InputStream");
                    }
                }
                if (i3 != 3) {
                    if (responseCode == -1) {
                        throw new C1766iE(responseCode, null, "Http request failed");
                    }
                    try {
                        throw new C1766iE(responseCode, null, this.n.getResponseMessage());
                    } catch (IOException e2) {
                        throw new C1766iE(responseCode, e2, "Failed to get a response message");
                    }
                }
                String headerField = this.n.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new C1766iE(responseCode, null, "Received empty or null redirect url");
                }
                try {
                    URL url3 = new URL(url, headerField);
                    a();
                    return d(url3, i + 1, url, map);
                } catch (MalformedURLException e3) {
                    throw new C1766iE(responseCode, e3, AbstractC1701hf0.t("Bad redirect url: ", headerField));
                }
            } catch (IOException e4) {
                try {
                    responseCode2 = this.n.getResponseCode();
                } catch (IOException unused4) {
                    Log.isLoggable("HttpUrlFetcher", 3);
                }
                throw new C1766iE(responseCode2, e4, "Failed to connect or obtain data");
            }
        } catch (IOException e5) {
            throw new C1766iE(0, e5, "URL.openConnection threw");
        }
    }

    @Override // o.InterfaceC1610gj
    public final void e(EnumC1651h30 enumC1651h30, InterfaceC1512fj interfaceC1512fj) {
        C2151mA c2151mA = this.l;
        int i = AL.a;
        SystemClock.elapsedRealtimeNanos();
        try {
            if (c2151mA.f == null) {
                c2151mA.f = new URL(c2151mA.d());
            }
            interfaceC1512fj.f(d(c2151mA.f, 0, null, c2151mA.b.a()));
        } catch (IOException e) {
            Log.isLoggable("HttpUrlFetcher", 3);
            interfaceC1512fj.d(e);
        } finally {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                SystemClock.elapsedRealtimeNanos();
            }
        }
    }
}
