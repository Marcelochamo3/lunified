package o;

import j$.time.Instant;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;

/* JADX INFO: renamed from: o.Ow, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0669Ow implements TemporalQuery {
    @Override // j$.time.temporal.TemporalQuery
    public final Object queryFrom(TemporalAccessor temporalAccessor) {
        return Instant.from(temporalAccessor);
    }
}
