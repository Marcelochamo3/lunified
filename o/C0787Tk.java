package o;

import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;

/* JADX INFO: renamed from: o.Tk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0787Tk extends S7 implements InterfaceC1570gE {
    public int A;
    public long B;
    public long C;
    public final boolean p;
    public final int q;
    public final int r;
    public final String s;
    public final C2994uv t;
    public final C2994uv u;
    public final boolean v;
    public final I20 w;
    public HttpURLConnection x;
    public InputStream y;
    public boolean z;

    public C0787Tk(String str, int i, int i2, C2994uv c2994uv) {
        super(true);
        this.s = str;
        this.q = i;
        this.r = i2;
        this.p = false;
        this.t = c2994uv;
        this.w = null;
        this.u = new C2994uv(8);
        this.v = false;
    }

    public static void m(HttpURLConnection httpURLConnection, long j) {
        int i;
        if (httpURLConnection == null || (i = Lr0.a) < 19 || i > 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j <= 2048) {
                return;
            }
            String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                superclass.getClass();
                Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, null);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0028  */
    /* JADX WARN: Code duplicated, block: B:13:0x0029 A[Catch: IOException -> 0x0033, TRY_LEAVE, TryCatch #0 {IOException -> 0x0033, blocks: (B:4:0x0004, B:6:0x000d, B:9:0x0018, B:10:0x001e, B:13:0x0029), top: B:18:0x0004 }] */
    @Override // o.InterfaceC2000kj
    public final int D(byte[] bArr, int i, int i2) throws C1277dE {
        int i3;
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.B;
            if (j != -1) {
                long j2 = j - this.C;
                if (j2 != 0) {
                    i2 = (int) Math.min(i2, j2);
                    InputStream inputStream = this.y;
                    int i4 = Lr0.a;
                    i3 = inputStream.read(bArr, i, i2);
                    if (i3 == -1) {
                        this.C += (long) i3;
                        b(i3);
                        return i3;
                    }
                }
            } else {
                InputStream inputStream2 = this.y;
                int i5 = Lr0.a;
                i3 = inputStream2.read(bArr, i, i2);
                if (i3 == -1) {
                    this.C += (long) i3;
                    b(i3);
                    return i3;
                }
            }
            return -1;
        } catch (IOException e) {
            int i6 = Lr0.a;
            throw C1277dE.b(2, e);
        }
    }

    @Override // o.InterfaceC2583qj
    public final void close() {
        try {
            InputStream inputStream = this.y;
            if (inputStream != null) {
                long j = this.B;
                long j2 = -1;
                if (j != -1) {
                    j2 = j - this.C;
                }
                m(this.x, j2);
                try {
                    inputStream.close();
                } catch (IOException e) {
                    int i = Lr0.a;
                    throw new C1277dE(2000, 3, e);
                }
            }
            this.y = null;
            g();
            if (this.z) {
                this.z = false;
                c();
            }
        } catch (Throwable th) {
            this.y = null;
            g();
            if (this.z) {
                this.z = false;
                c();
            }
            throw th;
        }
    }

    public final void g() {
        HttpURLConnection httpURLConnection = this.x;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                AP.g("Unexpected error while disconnecting", e);
            }
            this.x = null;
        }
    }

    public final URL h(URL url, String str) throws C1277dE {
        if (str == null) {
            throw new C1277dE("Null location redirect", 2001);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new C1277dE(AbstractC1701hf0.t("Unsupported protocol redirect: ", protocol), 2001);
            }
            if (this.p || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new C1277dE("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", 2001);
        } catch (MalformedURLException e) {
            throw new C1277dE(2001, 1, e);
        }
    }

    public final HttpURLConnection i(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.q);
        httpURLConnection.setReadTimeout(this.r);
        HashMap map2 = new HashMap();
        C2994uv c2994uv = this.t;
        if (c2994uv != null) {
            map2.putAll(c2994uv.c0());
        }
        map2.putAll(this.u.c0());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strA = AbstractC2639rE.a(j, j2);
        if (strA != null) {
            httpURLConnection.setRequestProperty("Range", strA);
        }
        String str = this.s;
        if (str != null) {
            httpURLConnection.setRequestProperty("User-Agent", str);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        httpURLConnection.setRequestMethod(C2970uj.b(i));
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    public final HttpURLConnection j(C2970uj c2970uj) throws IOException {
        C2970uj c2970uj2 = c2970uj;
        URL url = new URL(c2970uj2.a.toString());
        int i = 0;
        boolean z = (c2970uj2.i & 1) == 1;
        boolean z2 = this.p;
        boolean z3 = this.v;
        int i2 = c2970uj2.c;
        byte[] bArr = c2970uj2.d;
        long j = c2970uj2.f;
        long j2 = c2970uj2.g;
        if (!z2 && !z3) {
            return i(url, i2, bArr, j, j2, z, true, c2970uj2.e);
        }
        URL urlH = url;
        byte[] bArr2 = bArr;
        int i3 = i2;
        while (true) {
            int i4 = i + 1;
            if (i > 20) {
                throw new C1277dE(2001, 1, new NoRouteToHostException(AbstractC1674hK.n(i4, "Too many redirects: ")));
            }
            Map map = c2970uj2.e;
            int i5 = i3;
            long j3 = j2;
            URL url2 = urlH;
            long j4 = j;
            HttpURLConnection httpURLConnectionI = i(urlH, i3, bArr2, j, j2, z, false, map);
            int responseCode = httpURLConnectionI.getResponseCode();
            String headerField = httpURLConnectionI.getHeaderField("Location");
            if ((i5 == 1 || i5 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionI.disconnect();
                urlH = h(url2, headerField);
                i3 = i5;
            } else {
                if (i5 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return httpURLConnectionI;
                }
                httpURLConnectionI.disconnect();
                if (z3 && responseCode == 302) {
                    i3 = i5;
                } else {
                    bArr2 = null;
                    i3 = 1;
                }
                urlH = h(url2, headerField);
            }
            c2970uj2 = c2970uj;
            i = i4;
            j2 = j3;
            j = j4;
        }
    }

    @Override // o.S7, o.InterfaceC2583qj
    public final Map l() {
        HttpURLConnection httpURLConnection = this.x;
        return httpURLConnection == null ? R60.r : new C0761Sk(httpURLConnection.getHeaderFields());
    }

    public final void n(long j) throws IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[C1672hI.a.f];
        while (j > 0) {
            int iMin = (int) Math.min(j, C1672hI.a.f);
            InputStream inputStream = this.y;
            int i = Lr0.a;
            int i2 = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new C1277dE(2000, 1, new InterruptedIOException());
            }
            if (i2 == -1) {
                throw new C1277dE(2008);
            }
            j -= (long) i2;
            b(i2);
        }
    }

    @Override // o.InterfaceC2583qj
    public final long v(C2970uj c2970uj) throws C1277dE {
        long jMax;
        this.C = 0L;
        this.B = 0L;
        e();
        try {
            HttpURLConnection httpURLConnectionJ = j(c2970uj);
            this.x = httpURLConnectionJ;
            this.A = httpURLConnectionJ.getResponseCode();
            httpURLConnectionJ.getResponseMessage();
            int i = this.A;
            long j = c2970uj.f;
            long j2 = c2970uj.g;
            if (i < 200 || i > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionJ.getHeaderFields();
                if (this.A == 416 && j == AbstractC2639rE.b(httpURLConnectionJ.getHeaderField("Content-Range"))) {
                    this.z = true;
                    f(c2970uj);
                    if (j2 != -1) {
                        return j2;
                    }
                    return 0L;
                }
                InputStream errorStream = httpURLConnectionJ.getErrorStream();
                try {
                    if (errorStream != null) {
                        Lr0.W(errorStream);
                    } else {
                        int i2 = Lr0.a;
                    }
                } catch (IOException unused) {
                    int i3 = Lr0.a;
                }
                g();
                throw new C1472fE(this.A, this.A == 416 ? new C2679rj(2008) : null, headerFields);
            }
            String contentType = httpURLConnectionJ.getContentType();
            I20 i20 = this.w;
            if (i20 != null && !i20.apply(contentType)) {
                g();
                throw new C1374eE(contentType);
            }
            if (this.A != 200 || j == 0) {
                j = 0;
            }
            boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionJ.getHeaderField("Content-Encoding"));
            if (zEqualsIgnoreCase || j2 != -1) {
                this.B = j2;
            } else {
                String headerField = httpURLConnectionJ.getHeaderField("Content-Length");
                String headerField2 = httpURLConnectionJ.getHeaderField("Content-Range");
                Pattern pattern = AbstractC2639rE.a;
                if (TextUtils.isEmpty(headerField)) {
                    jMax = -1;
                } else {
                    try {
                        jMax = Long.parseLong(headerField);
                    } catch (NumberFormatException unused2) {
                        AP.f();
                        jMax = -1;
                    }
                }
                if (!TextUtils.isEmpty(headerField2)) {
                    Matcher matcher = AbstractC2639rE.a.matcher(headerField2);
                    if (matcher.matches()) {
                        try {
                            String strGroup = matcher.group(2);
                            strGroup.getClass();
                            long j3 = Long.parseLong(strGroup);
                            String strGroup2 = matcher.group(1);
                            strGroup2.getClass();
                            long j4 = 1 + (j3 - Long.parseLong(strGroup2));
                            if (jMax < 0) {
                                jMax = j4;
                            } else if (jMax != j4) {
                                AP.z();
                                jMax = Math.max(jMax, j4);
                            }
                        } catch (NumberFormatException unused3) {
                            AP.f();
                        }
                    }
                }
                this.B = jMax != -1 ? jMax - j : -1L;
            }
            try {
                this.y = httpURLConnectionJ.getInputStream();
                if (zEqualsIgnoreCase) {
                    this.y = new GZIPInputStream(this.y);
                }
                this.z = true;
                f(c2970uj);
                try {
                    n(j);
                    return this.B;
                } catch (IOException e) {
                    g();
                    if (e instanceof C1277dE) {
                        throw ((C1277dE) e);
                    }
                    throw new C1277dE(2000, 1, e);
                }
            } catch (IOException e2) {
                g();
                throw new C1277dE(2000, 1, e2);
            }
        } catch (IOException e3) {
            g();
            throw C1277dE.b(1, e3);
        }
    }

    @Override // o.InterfaceC2583qj
    public final Uri w() {
        HttpURLConnection httpURLConnection = this.x;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }
}
