package io.sentry.android.core;

import java.io.File;
import java.nio.charset.Charset;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d0 implements Comparator {
    public final /* synthetic */ int l;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.l) {
            case 0:
                io.sentry.V v = (io.sentry.V) obj;
                io.sentry.V v2 = (io.sentry.V) obj2;
                int iCompareTo = v.t().compareTo(v2.t());
                return iCompareTo != 0 ? iCompareTo : v.k().m.l.compareTo(v2.k().m.l);
            default:
                Charset charset = io.sentry.cache.c.r;
                return Long.compare(((File) obj).lastModified(), ((File) obj2).lastModified());
        }
    }
}
