package io.sentry.internal.debugmeta;

import android.content.Context;
import io.sentry.C0072p0;
import io.sentry.EnumC0094u1;
import io.sentry.F0;
import io.sentry.ILogger;
import io.sentry.Z1;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;
import o.Yu0;

/* JADX INFO: loaded from: classes.dex */
public final class c implements a, F0 {
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;

    public /* synthetic */ c(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // io.sentry.internal.debugmeta.a
    public List a() {
        Object obj = this.c;
        switch (this.a) {
            case 0:
                ILogger iLogger = (ILogger) this.b;
                ArrayList arrayList = new ArrayList();
                try {
                    Enumeration<URL> resources = ((ClassLoader) obj).getResources("sentry-debug-meta.properties");
                    while (resources.hasMoreElements()) {
                        URL urlNextElement = resources.nextElement();
                        try {
                            InputStream inputStreamOpenStream = urlNextElement.openStream();
                            try {
                                Properties properties = new Properties();
                                properties.load(inputStreamOpenStream);
                                arrayList.add(properties);
                                iLogger.h(EnumC0094u1.INFO, "Debug Meta Data Properties loaded from %s", urlNextElement);
                                if (inputStreamOpenStream != null) {
                                    inputStreamOpenStream.close();
                                }
                            } catch (Throwable th) {
                                if (inputStreamOpenStream != null) {
                                    try {
                                        inputStreamOpenStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    break;
                                }
                                throw th;
                            }
                        } catch (RuntimeException e) {
                            iLogger.s(EnumC0094u1.ERROR, e, "%s file is malformed.", urlNextElement);
                        }
                        break;
                    }
                } catch (IOException e2) {
                    iLogger.s(EnumC0094u1.ERROR, e2, "Failed to load %s", "sentry-debug-meta.properties");
                }
                if (!arrayList.isEmpty()) {
                    return arrayList;
                }
                iLogger.h(EnumC0094u1.INFO, "No %s file was found.", "sentry-debug-meta.properties");
                return null;
            default:
                ILogger iLogger2 = (ILogger) this.b;
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(((Context) obj).getAssets().open("sentry-debug-meta.properties"));
                    try {
                        Properties properties2 = new Properties();
                        properties2.load(bufferedInputStream);
                        List listSingletonList = Collections.singletonList(properties2);
                        bufferedInputStream.close();
                        return listSingletonList;
                    } catch (Throwable th3) {
                        try {
                            bufferedInputStream.close();
                            break;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (FileNotFoundException e3) {
                    iLogger2.s(EnumC0094u1.INFO, e3, "%s file was not found.", "sentry-debug-meta.properties");
                    return null;
                } catch (IOException e4) {
                    iLogger2.v(EnumC0094u1.ERROR, "Error getting Proguard UUIDs.", e4);
                    return null;
                } catch (RuntimeException e5) {
                    iLogger2.s(EnumC0094u1.ERROR, e5, "%s file is malformed.", "sentry-debug-meta.properties");
                    return null;
                }
        }
    }

    public c b() {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.b;
        cVar.t();
        cVar.a();
        int i = cVar.n;
        int[] iArr = cVar.m;
        if (i == iArr.length) {
            cVar.m = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = cVar.m;
        int i2 = cVar.n;
        cVar.n = i2 + 1;
        iArr2[i2] = 3;
        cVar.l.write(Yu0.b.i0);
        return this;
    }

    public c c() {
        ((io.sentry.vendor.gson.stream.c) this.b).f('}', 3, 5);
        return this;
    }

    public byte[] d() {
        Callable callable;
        if (((byte[]) this.b) == null && (callable = (Callable) this.c) != null) {
            this.b = (byte[]) callable.call();
        }
        byte[] bArr = (byte[]) this.b;
        return bArr != null ? bArr : new byte[0];
    }

    public Properties e() {
        String str = (String) this.c;
        try {
            File file = new File(str);
            if (!file.isFile() || !file.canRead()) {
                return null;
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                bufferedInputStream.close();
                return properties;
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            ((ILogger) this.b).s(EnumC0094u1.ERROR, e, "Failed to load Sentry configuration from file: %s", str);
            return null;
        }
    }

    public c f(String str) {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.b;
        if (str == null) {
            cVar.getClass();
            throw new NullPointerException("name == null");
        }
        if (cVar.r != null) {
            throw new IllegalStateException();
        }
        if (cVar.n == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        cVar.r = str;
        return this;
    }

    public Z1 g() {
        return (Z1) ((LinkedBlockingDeque) this.c).peek();
    }

    public c h(double d) throws IOException {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.b;
        cVar.t();
        if (cVar.q || !(Double.isNaN(d) || Double.isInfinite(d))) {
            cVar.a();
            cVar.l.append((CharSequence) Double.toString(d));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
    }

    public c i(long j) throws IOException {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.b;
        cVar.t();
        cVar.a();
        cVar.l.write(Long.toString(j));
        return this;
    }

    public c j(ILogger iLogger, Object obj) {
        ((C0072p0) this.c).f(this, iLogger, obj);
        return this;
    }

    public c k(Boolean bool) throws IOException {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.b;
        if (bool == null) {
            cVar.l();
        } else {
            cVar.t();
            cVar.a();
            cVar.l.write(bool.booleanValue() ? "true" : "false");
        }
        return this;
    }

    public c l(Number number) {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.b;
        if (number == null) {
            cVar.l();
        } else {
            cVar.t();
            String string = number.toString();
            if (!cVar.q && (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
                throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
            }
            cVar.a();
            cVar.l.append((CharSequence) string);
        }
        return this;
    }

    public c m(String str) {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.b;
        if (str == null) {
            cVar.l();
        } else {
            cVar.t();
            cVar.a();
            cVar.q(str);
        }
        return this;
    }

    public c n(boolean z) throws IOException {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.b;
        cVar.t();
        cVar.a();
        cVar.l.write(z ? "true" : "false");
        return this;
    }

    public c(Writer writer, int i) {
        this.a = 1;
        this.b = new io.sentry.vendor.gson.stream.c(writer);
        this.c = new C0072p0(i);
    }

    public c(ILogger iLogger) {
        this.a = 0;
        ClassLoader classLoader = c.class.getClassLoader();
        this.b = iLogger;
        this.c = classLoader == null ? ClassLoader.getSystemClassLoader() : classLoader;
    }

    public c(ILogger iLogger, Z1 z1) {
        this.a = 4;
        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque();
        this.c = linkedBlockingDeque;
        io.sentry.config.a.C(iLogger, "logger is required");
        this.b = iLogger;
        linkedBlockingDeque.push(z1);
    }

    public c(Callable callable) {
        this.a = 3;
        this.c = callable;
    }
}
