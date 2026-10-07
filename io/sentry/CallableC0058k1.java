package io.sentry;

import android.content.Context;
import io.sentry.android.core.SentryAndroidOptions;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: io.sentry.k1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC0058k1 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ CallableC0058k1(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws IOException {
        switch (this.a) {
            case 0:
                U u = (U) this.b;
                S1 s1 = (S1) this.c;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, C0070o1.d));
                    try {
                        u.z(s1, bufferedWriter);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        bufferedWriter.close();
                        byteArrayOutputStream.close();
                        return byteArray;
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
            case 1:
                U u2 = (U) this.b;
                AbstractC0037d1 abstractC0037d1 = (AbstractC0037d1) this.c;
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream2, C0070o1.d));
                    try {
                        u2.z(abstractC0037d1, bufferedWriter2);
                        byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                        bufferedWriter2.close();
                        byteArrayOutputStream2.close();
                        return byteArray2;
                    } catch (Throwable th5) {
                        try {
                            bufferedWriter2.close();
                            break;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                } catch (Throwable th7) {
                    try {
                        byteArrayOutputStream2.close();
                        break;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                    }
                    throw th7;
                }
            case 2:
                U u3 = (U) this.b;
                io.sentry.clientreport.b bVar = (io.sentry.clientreport.b) this.c;
                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter3 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream3, C0070o1.d));
                    try {
                        u3.z(bVar, bufferedWriter3);
                        byte[] byteArray3 = byteArrayOutputStream3.toByteArray();
                        bufferedWriter3.close();
                        byteArrayOutputStream3.close();
                        return byteArray3;
                    } catch (Throwable th9) {
                        try {
                            bufferedWriter3.close();
                            break;
                        } catch (Throwable th10) {
                            th9.addSuppressed(th10);
                        }
                        throw th9;
                    }
                } catch (Throwable th11) {
                    try {
                        byteArrayOutputStream3.close();
                        break;
                    } catch (Throwable th12) {
                        th11.addSuppressed(th12);
                    }
                    throw th11;
                }
            default:
                Context context = (Context) this.b;
                SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.c;
                if (io.sentry.android.core.K.h == null) {
                    synchronized (io.sentry.android.core.K.class) {
                        try {
                            if (io.sentry.android.core.K.h == null) {
                                io.sentry.android.core.K.h = new io.sentry.android.core.K(context.getApplicationContext(), sentryAndroidOptions);
                            }
                        } catch (Throwable th13) {
                            throw th13;
                        }
                        break;
                    }
                }
                return io.sentry.android.core.K.h;
        }
    }
}
