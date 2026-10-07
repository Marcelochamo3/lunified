package io.sentry.transport;

import io.sentry.C0088s1;
import io.sentry.EnumC0053j;
import io.sentry.EnumC0094u1;
import io.sentry.F1;
import io.sentry.I1;
import io.sentry.ILogger;
import io.sentry.r;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import o.AbstractC1701hf0;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final Charset e = Charset.forName("UTF-8");
    public final Proxy a;
    public final C0088s1 b;
    public final I1 c;
    public final r d;

    public e(I1 i1, C0088s1 c0088s1, r rVar) {
        Proxy proxy;
        String str;
        String str2;
        this.b = c0088s1;
        this.c = i1;
        this.d = rVar;
        F1 proxy2 = i1.getProxy();
        if (proxy2 == null || (str = proxy2.b) == null || (str2 = proxy2.a) == null) {
            proxy = null;
        } else {
            try {
                Proxy.Type type = proxy2.e;
                if (type == null) {
                    type = Proxy.Type.HTTP;
                }
                proxy = new Proxy(type, new InetSocketAddress(str2, Integer.parseInt(str)));
            } catch (NumberFormatException e2) {
                this.c.getLogger().s(EnumC0094u1.ERROR, e2, AbstractC1701hf0.u("Failed to parse Sentry Proxy port: ", str, ". Proxy is ignored"), new Object[0]);
                proxy = null;
            }
        }
        this.a = proxy;
        if (proxy == null || i1.getProxy() == null) {
            return;
        }
        String str3 = i1.getProxy().c;
        String str4 = i1.getProxy().d;
        if (str3 == null || str4 == null) {
            return;
        }
        Authenticator.setDefault(new k(str3, str4));
    }

    public static void a(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
        } catch (IOException unused) {
        } finally {
            httpURLConnection.disconnect();
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static String b(HttpURLConnection httpURLConnection) {
        try {
            InputStream errorStream = httpURLConnection.getErrorStream();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, e));
                try {
                    StringBuilder sb = new StringBuilder();
                    boolean z = true;
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        if (!z) {
                            sb.append("\n");
                        }
                        sb.append(line);
                        z = false;
                        if (errorStream != null) {
                            try {
                                errorStream.close();
                            } catch (Throwable th) {
                                th.addSuppressed(th);
                            }
                        }
                        throw th;
                    }
                    String string = sb.toString();
                    bufferedReader.close();
                    if (errorStream != null) {
                        errorStream.close();
                    }
                    return string;
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                if (errorStream != null) {
                    errorStream.close();
                }
                throw th4;
            }
        } catch (IOException unused) {
            return "Failed to obtain error message while analyzing send failure.";
        }
    }

    public final io.sentry.config.a c(HttpURLConnection httpURLConnection) {
        I1 i1 = this.c;
        try {
            int responseCode = httpURLConnection.getResponseCode();
            e(httpURLConnection, responseCode);
            if (responseCode == 200) {
                i1.getLogger().h(EnumC0094u1.DEBUG, "Envelope sent successfully.", new Object[0]);
                return p.a;
            }
            ILogger logger = i1.getLogger();
            EnumC0094u1 enumC0094u1 = EnumC0094u1.ERROR;
            logger.h(enumC0094u1, "Request failed, API returned %s", Integer.valueOf(responseCode));
            if (i1.isDebug()) {
                i1.getLogger().h(enumC0094u1, "%s", b(httpURLConnection));
            }
            return new o(responseCode);
        } catch (IOException e2) {
            i1.getLogger().s(EnumC0094u1.ERROR, e2, "Error reading and logging the response stream", new Object[0]);
            return new o(-1);
        } finally {
            a(httpURLConnection);
        }
    }

    public final io.sentry.config.a d(C0088s1 c0088s1) {
        C0088s1 c0088s2 = this.b;
        Proxy proxy = this.a;
        HttpURLConnection httpURLConnection = (HttpURLConnection) (proxy == null ? ((URL) c0088s2.l).openConnection() : ((URL) c0088s2.l).openConnection(proxy));
        for (Map.Entry entry : ((Map) c0088s2.m).entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/x-sentry-envelope");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        httpURLConnection.setRequestProperty("Connection", "close");
        I1 i1 = this.c;
        httpURLConnection.setConnectTimeout(i1.getConnectionTimeoutMillis());
        httpURLConnection.setReadTimeout(i1.getReadTimeoutMillis());
        SSLSocketFactory sslSocketFactory = i1.getSslSocketFactory();
        if ((httpURLConnection instanceof HttpsURLConnection) && sslSocketFactory != null) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sslSocketFactory);
        }
        httpURLConnection.connect();
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    i1.getSerializer().r(c0088s1, gZIPOutputStream);
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                } catch (Throwable th) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (Throwable th5) {
            try {
                i1.getLogger().s(EnumC0094u1.ERROR, th5, "An exception occurred while submitting the envelope to the Sentry server.", new Object[0]);
            } catch (Throwable th6) {
                c(httpURLConnection);
                throw th6;
            }
        }
        return c(httpURLConnection);
    }

    /* JADX WARN: Code duplicated, block: B:111:0x010f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0060  */
    /* JADX WARN: Code duplicated, block: B:32:0x008d  */
    /* JADX WARN: Code duplicated, block: B:61:0x010f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0111  */
    /* JADX WARN: Code duplicated, block: B:64:0x0119 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:69:0x0129  */
    /* JADX WARN: Code duplicated, block: B:71:0x012d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0139 A[LOOP:2: B:70:0x012b->B:74:0x0139, LOOP_END] */
    public final void e(HttpURLConnection httpURLConnection, int i) {
        long j;
        String[] strArr;
        I1 i1;
        long j2;
        String str;
        Date date;
        String[] strArr2;
        int i2;
        String[] strArr3;
        EnumC0053j enumC0053j;
        String[] strArrSplit;
        int length;
        int i3;
        String string;
        int i4 = 0;
        int i5 = 1;
        String headerField = httpURLConnection.getHeaderField("Retry-After");
        String headerField2 = httpURLConnection.getHeaderField("X-Sentry-Rate-Limits");
        r rVar = this.d;
        I1 i6 = (I1) rVar.b;
        double d = 1000.0d;
        f fVar = (f) rVar.a;
        if (headerField2 == null) {
            if (i == 429) {
                if (headerField != null) {
                    try {
                        j = (long) (Double.parseDouble(headerField) * 1000.0d);
                    } catch (NumberFormatException unused) {
                        j = 60000;
                    }
                } else {
                    j = 60000;
                }
                rVar.a(EnumC0053j.All, new Date(fVar.b() + j));
                return;
            }
            return;
        }
        int i7 = -1;
        String[] strArrSplit2 = headerField2.split(",", -1);
        int length2 = strArrSplit2.length;
        int i8 = 0;
        while (i8 < length2) {
            String[] strArrSplit3 = strArrSplit2[i8].replace(" ", "").split(":", i7);
            String str2 = strArrSplit3.length > 4 ? strArrSplit3[4] : null;
            if (strArrSplit3.length > 0) {
                String str3 = strArrSplit3[i4];
                if (str3 != null) {
                    try {
                        double d2 = Double.parseDouble(str3);
                        length2 = length2;
                        j2 = (long) (d2 * d);
                    } catch (NumberFormatException unused2) {
                        j2 = 60000;
                    }
                    if (strArrSplit3.length > i5) {
                        str = strArrSplit3[i5];
                        date = new Date(fVar.b() + j2);
                        if (str != null || str.isEmpty()) {
                            strArr = strArrSplit2;
                            i1 = i6;
                            rVar.a(EnumC0053j.All, date);
                        } else {
                            String[] strArrSplit4 = str.split(";", -1);
                            int length3 = strArrSplit4.length;
                            while (i4 < length3) {
                                String str4 = strArrSplit4[i4];
                                EnumC0053j enumC0053jValueOf = EnumC0053j.Unknown;
                                try {
                                    Charset charset = io.sentry.util.e.a;
                                    if (str4 != null) {
                                        try {
                                            if (str4.isEmpty()) {
                                                strArr2 = strArrSplit2;
                                                i2 = length3;
                                                string = str4;
                                            } else {
                                                strArr2 = strArrSplit2;
                                                try {
                                                    String[] strArrSplit5 = io.sentry.util.e.b.split(str4, -1);
                                                    StringBuilder sb = new StringBuilder();
                                                    int length4 = strArrSplit5.length;
                                                    i2 = length3;
                                                    int i9 = 0;
                                                    while (i9 < length4) {
                                                        try {
                                                            sb.append(io.sentry.util.e.a(strArrSplit5[i9]));
                                                            i9++;
                                                            strArrSplit5 = strArrSplit5;
                                                        } catch (IllegalArgumentException e2) {
                                                            e = e2;
                                                            strArr3 = strArrSplit4;
                                                            i6.getLogger().s(EnumC0094u1.INFO, e, "Unknown category: %s", str4);
                                                            enumC0053j = enumC0053jValueOf;
                                                            if (EnumC0053j.Unknown.equals(enumC0053j)) {
                                                                i5 = 1;
                                                            } else {
                                                                if (EnumC0053j.MetricBucket.equals(enumC0053j)) {
                                                                    strArrSplit = str2.split(";", -1);
                                                                    if (strArrSplit.length > 0) {
                                                                        length = strArrSplit.length;
                                                                        i3 = 0;
                                                                        while (true) {
                                                                            if (i3 >= length) {
                                                                                i5 = 1;
                                                                            } else if (!"custom".equals(strArrSplit[i3])) {
                                                                                i3++;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                i5 = 1;
                                                                rVar.a(enumC0053j, date);
                                                            }
                                                            i4 += i5;
                                                            strArrSplit2 = strArr2;
                                                            length3 = i2;
                                                            strArrSplit4 = strArr3;
                                                            i6 = i6;
                                                        }
                                                    }
                                                    string = sb.toString();
                                                } catch (IllegalArgumentException e3) {
                                                    e = e3;
                                                    i2 = length3;
                                                    strArr3 = strArrSplit4;
                                                    i6.getLogger().s(EnumC0094u1.INFO, e, "Unknown category: %s", str4);
                                                    enumC0053j = enumC0053jValueOf;
                                                    if (EnumC0053j.Unknown.equals(enumC0053j)) {
                                                        if (EnumC0053j.MetricBucket.equals(enumC0053j)) {
                                                            strArrSplit = str2.split(";", -1);
                                                            if (strArrSplit.length > 0) {
                                                                length = strArrSplit.length;
                                                                i3 = 0;
                                                                while (true) {
                                                                    if (i3 >= length) {
                                                                        i5 = 1;
                                                                    } else if (!"custom".equals(strArrSplit[i3])) {
                                                                        i3++;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        i5 = 1;
                                                        rVar.a(enumC0053j, date);
                                                    } else {
                                                        i5 = 1;
                                                    }
                                                    i4 += i5;
                                                    strArrSplit2 = strArr2;
                                                    length3 = i2;
                                                    strArrSplit4 = strArr3;
                                                    i6 = i6;
                                                }
                                            }
                                        } catch (IllegalArgumentException e4) {
                                            e = e4;
                                            strArr2 = strArrSplit2;
                                        }
                                    } else {
                                        strArr2 = strArrSplit2;
                                        i2 = length3;
                                        string = str4;
                                    }
                                    if (string != null) {
                                        enumC0053jValueOf = EnumC0053j.valueOf(string);
                                        strArr3 = strArrSplit4;
                                    } else {
                                        strArr3 = strArrSplit4;
                                        try {
                                            i6.getLogger().h(EnumC0094u1.ERROR, "Couldn't capitalize: %s", str4);
                                        } catch (IllegalArgumentException e5) {
                                            e = e5;
                                            i6.getLogger().s(EnumC0094u1.INFO, e, "Unknown category: %s", str4);
                                            enumC0053j = enumC0053jValueOf;
                                        }
                                    }
                                    enumC0053j = enumC0053jValueOf;
                                } catch (IllegalArgumentException e6) {
                                    e = e6;
                                    strArr2 = strArrSplit2;
                                }
                                if (EnumC0053j.Unknown.equals(enumC0053j)) {
                                    if (EnumC0053j.MetricBucket.equals(enumC0053j) && str2 != null && !str2.equals("")) {
                                        strArrSplit = str2.split(";", -1);
                                        if (strArrSplit.length > 0) {
                                            length = strArrSplit.length;
                                            i3 = 0;
                                            while (true) {
                                                if (i3 >= length) {
                                                    i5 = 1;
                                                } else if (!"custom".equals(strArrSplit[i3])) {
                                                    i3++;
                                                }
                                            }
                                        }
                                    }
                                    i5 = 1;
                                    rVar.a(enumC0053j, date);
                                } else {
                                    i5 = 1;
                                }
                                i4 += i5;
                                strArrSplit2 = strArr2;
                                length3 = i2;
                                strArrSplit4 = strArr3;
                                i6 = i6;
                            }
                        }
                        i8 += i5;
                        strArrSplit2 = strArr;
                        length2 = length2;
                        i6 = i1;
                        i4 = 0;
                        d = 1000.0d;
                        i7 = -1;
                    }
                    strArr = strArrSplit2;
                    i1 = i6;
                }
                j2 = 60000;
                if (strArrSplit3.length > i5) {
                    str = strArrSplit3[i5];
                    date = new Date(fVar.b() + j2);
                    if (str != null) {
                    }
                    strArr = strArrSplit2;
                    i1 = i6;
                    rVar.a(EnumC0053j.All, date);
                    i8 += i5;
                    strArrSplit2 = strArr;
                    length2 = length2;
                    i6 = i1;
                    i4 = 0;
                    d = 1000.0d;
                    i7 = -1;
                }
                strArr = strArrSplit2;
                i1 = i6;
            } else {
                strArr = strArrSplit2;
                i1 = i6;
                length2 = length2;
            }
            i8 += i5;
            strArrSplit2 = strArr;
            length2 = length2;
            i6 = i1;
            i4 = 0;
            d = 1000.0d;
            i7 = -1;
        }
    }
}
