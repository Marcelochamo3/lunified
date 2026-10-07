package io.sentry;

import java.io.File;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Z0 implements Runnable {
    public final /* synthetic */ int l;
    public final /* synthetic */ File m;

    public /* synthetic */ Z0(File file, int i) {
        this.l = i;
        this.m = file;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.l) {
            case 0:
                File[] fileArrListFiles = this.m.listFiles();
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        if (file.lastModified() < AbstractC0031b1.e - TimeUnit.MINUTES.toMillis(5L)) {
                            io.sentry.config.a.c(file);
                        }
                    }
                    break;
                }
                break;
            default:
                io.sentry.config.a.c(this.m);
                break;
        }
    }
}
