package io.sentry;

/* JADX INFO: renamed from: io.sentry.h1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0049h1 implements Comparable {
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractC0049h1 abstractC0049h1) {
        return Long.valueOf(d()).compareTo(Long.valueOf(abstractC0049h1.d()));
    }

    public long b(AbstractC0049h1 abstractC0049h1) {
        return d() - abstractC0049h1.d();
    }

    public long c(AbstractC0049h1 abstractC0049h1) {
        return (abstractC0049h1 == null || compareTo(abstractC0049h1) >= 0) ? d() : abstractC0049h1.d();
    }

    public abstract long d();
}
