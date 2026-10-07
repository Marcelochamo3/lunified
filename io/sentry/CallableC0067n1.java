package io.sentry;

import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.concurrent.Callable;
import o.AbstractC1701hf0;

/* JADX INFO: renamed from: io.sentry.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC0067n1 implements Callable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ U c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ CallableC0067n1(C0001a c0001a, long j, U u, ILogger iLogger) {
        this.d = c0001a;
        this.b = j;
        this.c = u;
        this.e = iLogger;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws io.sentry.exception.b {
        Object obj = this.e;
        long j = this.b;
        Object obj2 = this.d;
        U u = this.c;
        switch (this.a) {
            case 0:
                C0001a c0001a = (C0001a) obj2;
                byte[] bArr = c0001a.a;
                String str = c0001a.c;
                if (bArr == null) {
                    InterfaceC0084r0 interfaceC0084r0 = c0001a.b;
                    if (interfaceC0084r0 != null) {
                        Charset charset = io.sentry.util.a.a;
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, io.sentry.util.a.a));
                                try {
                                    u.z(interfaceC0084r0, bufferedWriter);
                                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                                    bufferedWriter.close();
                                    byteArrayOutputStream.close();
                                    bArr = byteArray;
                                } catch (Throwable th) {
                                    try {
                                        bufferedWriter.close();
                                        break;
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                try {
                                    byteArrayOutputStream.close();
                                    break;
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                }
                                throw th3;
                            }
                        } catch (Throwable th5) {
                            ((ILogger) obj).v(EnumC0094u1.ERROR, "Could not serialize serializable", th5);
                            bArr = null;
                        }
                        if (bArr != null) {
                            long length = bArr.length;
                            if (length > j) {
                                throw new io.sentry.exception.b(String.format("Dropping attachment with filename '%s', because the size of the passed bytes with %d bytes is bigger than the maximum allowed attachment size of %d bytes.", str, Long.valueOf(length), Long.valueOf(j)));
                            }
                        }
                    }
                    throw new io.sentry.exception.b(AbstractC1701hf0.u("Couldn't attach the attachment ", str, ".\nPlease check that either bytes, serializable or a path is set."));
                }
                long length2 = bArr.length;
                if (length2 > j) {
                    throw new io.sentry.exception.b(String.format("Dropping attachment with filename '%s', because the size of the passed bytes with %d bytes is bigger than the maximum allowed attachment size of %d bytes.", str, Long.valueOf(length2), Long.valueOf(j)));
                }
                return bArr;
            default:
                File file = (File) obj2;
                if (!file.exists()) {
                    throw new io.sentry.exception.b(AbstractC1701hf0.u("Dropping profiling trace data, because the file '", file.getName(), "' doesn't exists"));
                }
                try {
                    String str2 = new String(io.sentry.vendor.a.a(io.sentry.config.a.A(j, file.getPath())), "US-ASCII");
                    if (str2.isEmpty()) {
                        throw new io.sentry.exception.b("Profiling trace file is empty");
                    }
                    J0 j0 = (J0) obj;
                    j0.M = str2;
                    try {
                        j0.w = (List) j0.m.call();
                        break;
                    } catch (Throwable unused) {
                    }
                    try {
                        try {
                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                            try {
                                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream2, C0070o1.d));
                                try {
                                    u.z(j0, bufferedWriter2);
                                    byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                                    bufferedWriter2.close();
                                    byteArrayOutputStream2.close();
                                    file.delete();
                                    return byteArray2;
                                } catch (Throwable th6) {
                                    try {
                                        bufferedWriter2.close();
                                        break;
                                    } catch (Throwable th7) {
                                        th6.addSuppressed(th7);
                                    }
                                    throw th6;
                                }
                            } catch (Throwable th8) {
                                try {
                                    byteArrayOutputStream2.close();
                                    break;
                                } catch (Throwable th9) {
                                    th8.addSuppressed(th9);
                                }
                                throw th8;
                            }
                        } catch (IOException e) {
                            throw new io.sentry.exception.b("Failed to serialize profiling trace data\n" + e.getMessage());
                        }
                    } catch (Throwable th10) {
                        file.delete();
                        throw th10;
                    }
                } catch (UnsupportedEncodingException e2) {
                    throw new AssertionError(e2);
                }
        }
    }

    public /* synthetic */ CallableC0067n1(File file, long j, J0 j0, U u) {
        this.d = file;
        this.b = j;
        this.e = j0;
        this.c = u;
    }
}
