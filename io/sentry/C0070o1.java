package io.sentry;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: io.sentry.o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0070o1 {
    public static final Charset d = Charset.forName("UTF-8");
    public final C0073p1 a;
    public final Callable b;
    public byte[] c;

    public C0070o1(C0073p1 c0073p1, byte[] bArr) {
        this.a = c0073p1;
        this.c = bArr;
        this.b = null;
    }

    public static C0070o1 a(U u, io.sentry.clientreport.b bVar) {
        io.sentry.config.a.C(u, "ISerializer is required.");
        io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(new CallableC0058k1(u, 2, bVar));
        return new C0070o1(new C0073p1(EnumC0091t1.resolve(bVar), new CallableC0061l1(cVar, 4), "application/json", (String) null, (String) null), new CallableC0061l1(cVar, 5));
    }

    public static C0070o1 b(U u, S1 s1) {
        io.sentry.config.a.C(u, "ISerializer is required.");
        io.sentry.config.a.C(s1, "Session is required.");
        io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(new CallableC0058k1(u, 0, s1));
        return new C0070o1(new C0073p1(EnumC0091t1.Session, new CallableC0061l1(cVar, 7), "application/json", (String) null, (String) null), new CallableC0061l1(cVar, 9));
    }

    public static byte[] f(LinkedHashMap linkedHashMap) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write((byte) (linkedHashMap.size() | 128));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                byte[] bytes = ((String) entry.getKey()).getBytes(d);
                int length = bytes.length;
                byteArrayOutputStream.write(-39);
                byteArrayOutputStream.write((byte) length);
                byteArrayOutputStream.write(bytes);
                byte[] bArr = (byte[]) entry.getValue();
                int length2 = bArr.length;
                byteArrayOutputStream.write(-58);
                byteArrayOutputStream.write(ByteBuffer.allocate(4).order(ByteOrder.BIG_ENDIAN).putInt(length2).array());
                byteArrayOutputStream.write(bArr);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final io.sentry.clientreport.b c(U u) throws IOException {
        C0073p1 c0073p1 = this.a;
        if (c0073p1 == null || c0073p1.n != EnumC0091t1.ClientReport) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(d()), d));
        try {
            io.sentry.clientreport.b bVar = (io.sentry.clientreport.b) u.b(bufferedReader, io.sentry.clientreport.b.class);
            bufferedReader.close();
            return bVar;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final byte[] d() {
        Callable callable;
        if (this.c == null && (callable = this.b) != null) {
            this.c = (byte[]) callable.call();
        }
        return this.c;
    }

    public final io.sentry.protocol.A e(U u) throws IOException {
        C0073p1 c0073p1 = this.a;
        if (c0073p1 == null || c0073p1.n != EnumC0091t1.Transaction) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(d()), d));
        try {
            io.sentry.protocol.A a = (io.sentry.protocol.A) u.b(bufferedReader, io.sentry.protocol.A.class);
            bufferedReader.close();
            return a;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public C0070o1(C0073p1 c0073p1, Callable callable) {
        this.a = c0073p1;
        this.b = callable;
        this.c = null;
    }
}
