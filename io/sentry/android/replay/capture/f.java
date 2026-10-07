package io.sentry.android.replay.capture;

import java.util.Comparator;
import o.AbstractC1376eG;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return AbstractC1376eG.j(Long.valueOf(((io.sentry.rrweb.b) obj).m), Long.valueOf(((io.sentry.rrweb.b) obj2).m));
    }
}
