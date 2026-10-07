package io.sentry;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: io.sentry.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC0107z implements Callable {
    public final /* synthetic */ int a;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                return InetAddress.getLocalHost();
            case 1:
                return null;
            case 2:
                return new ArrayList();
            default:
                return io.sentry.android.core.internal.util.c.b.a();
        }
    }
}
