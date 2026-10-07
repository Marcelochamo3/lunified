package io.sentry;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class W0 {
    public final /* synthetic */ ILogger a;
    public final /* synthetic */ String b;
    public final /* synthetic */ AbstractC0081q c;
    public final /* synthetic */ File d;

    public /* synthetic */ W0(ILogger iLogger, String str, AbstractC0081q abstractC0081q, File file) {
        this.a = iLogger;
        this.b = str;
        this.c = abstractC0081q;
        this.d = file;
    }

    public final void a() {
        File file;
        char c;
        int i = 0;
        File file2 = this.d;
        EnumC0094u1 enumC0094u1 = EnumC0094u1.DEBUG;
        String str = this.b;
        ILogger iLogger = this.a;
        iLogger.h(enumC0094u1, "Started processing cached files from %s", str);
        AbstractC0081q abstractC0081q = this.c;
        ILogger iLogger2 = abstractC0081q.b;
        try {
            iLogger2.h(enumC0094u1, "Processing dir. %s", file2.getAbsolutePath());
            if (!file2.exists()) {
                iLogger2.h(EnumC0094u1.WARNING, "Directory '%s' doesn't exist. No cached events to send.", file2.getAbsolutePath());
            } else if (file2.isDirectory()) {
                File[] fileArrListFiles = file2.listFiles();
                if (fileArrListFiles == null) {
                    iLogger2.h(EnumC0094u1.ERROR, "Cache dir %s is null.", file2.getAbsolutePath());
                } else {
                    File[] fileArrListFiles2 = file2.listFiles(new C0068o(0, abstractC0081q));
                    iLogger2.h(enumC0094u1, "Processing %d items from cache dir %s", Integer.valueOf(fileArrListFiles2 != null ? fileArrListFiles2.length : 0), file2.getAbsolutePath());
                    int length = fileArrListFiles.length;
                    int i2 = 0;
                    while (i2 < length) {
                        File file3 = fileArrListFiles[i2];
                        if (file3.isFile()) {
                            String absolutePath = file3.getAbsolutePath();
                            b2 b2Var = abstractC0081q.d;
                            if (!b2Var.contains(absolutePath)) {
                                r rVarE = abstractC0081q.a.e();
                                if (rVarE != null && rVarE.b(EnumC0053j.All)) {
                                    iLogger2.h(EnumC0094u1.INFO, "DirectoryProcessor, rate limiting active.", new Object[i]);
                                    break;
                                }
                                EnumC0094u1 enumC0094u2 = EnumC0094u1.DEBUG;
                                Object[] objArr = new Object[1];
                                objArr[i] = absolutePath;
                                iLogger2.h(enumC0094u2, "Processing file: %s", objArr);
                                file = file2;
                                try {
                                    abstractC0081q.c(file3, io.sentry.config.a.b(new C0071p(abstractC0081q.c, abstractC0081q.b, absolutePath, b2Var)));
                                    Thread.sleep(100L);
                                } catch (Throwable th) {
                                    th = th;
                                    c = 0;
                                    iLogger2.s(EnumC0094u1.ERROR, th, "Failed processing '%s'", file.getAbsolutePath());
                                    EnumC0094u1 enumC0094u3 = EnumC0094u1.DEBUG;
                                    Object[] objArr2 = new Object[1];
                                    objArr2[c] = str;
                                    iLogger.h(enumC0094u3, "Finished processing cached files from %s", objArr2);
                                }
                            } else {
                                EnumC0094u1 enumC0094u4 = EnumC0094u1.DEBUG;
                                Object[] objArr3 = new Object[1];
                                objArr3[i] = absolutePath;
                                iLogger2.h(enumC0094u4, "File '%s' has already been processed so it will not be processed again.", objArr3);
                            }
                            i2++;
                            length = length;
                            file2 = file;
                            i = 0;
                        } else {
                            EnumC0094u1 enumC0094u5 = EnumC0094u1.DEBUG;
                            Object[] objArr4 = new Object[1];
                            objArr4[i] = file3.getAbsolutePath();
                            iLogger2.h(enumC0094u5, "File %s is not a File.", objArr4);
                        }
                        file = file2;
                        i2++;
                        length = length;
                        file2 = file;
                        i = 0;
                    }
                }
            } else {
                iLogger2.h(EnumC0094u1.ERROR, "Cache dir %s is not a directory.", file2.getAbsolutePath());
            }
            c = 0;
        } catch (Throwable th2) {
            th = th2;
            file = file2;
        }
        EnumC0094u1 enumC0094u6 = EnumC0094u1.DEBUG;
        Object[] objArr5 = new Object[1];
        objArr5[c] = str;
        iLogger.h(enumC0094u6, "Finished processing cached files from %s", objArr5);
    }
}
