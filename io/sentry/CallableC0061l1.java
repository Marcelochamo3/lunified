package io.sentry;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: io.sentry.l1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC0061l1 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ io.sentry.internal.debugmeta.c b;

    public /* synthetic */ CallableC0061l1(io.sentry.internal.debugmeta.c cVar, int i) {
        this.a = i;
        this.b = cVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                return Integer.valueOf(this.b.d().length);
            case 1:
                return this.b.d();
            case 2:
                return Integer.valueOf(this.b.d().length);
            case 3:
                return this.b.d();
            case 4:
                return Integer.valueOf(this.b.d().length);
            case 5:
                return this.b.d();
            case 6:
                return Integer.valueOf(this.b.d().length);
            case 7:
                return Integer.valueOf(this.b.d().length);
            case 8:
                return this.b.d();
            case 9:
                return this.b.d();
            case 10:
                return Integer.valueOf(this.b.d().length);
            case 11:
                return this.b.d();
            case 12:
                return Integer.valueOf(this.b.d().length);
            default:
                return this.b.d();
        }
    }
}
