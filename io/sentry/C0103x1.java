package io.sentry;

import java.util.Date;

/* JADX INFO: renamed from: io.sentry.x1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0103x1 extends AbstractC0049h1 {
    public final Date l;
    public final long m;

    public C0103x1(Date date, long j) {
        this.l = date;
        this.m = j;
    }

    @Override // io.sentry.AbstractC0049h1, java.lang.Comparable
    /* JADX INFO: renamed from: a */
    public final int compareTo(AbstractC0049h1 abstractC0049h1) {
        if (!(abstractC0049h1 instanceof C0103x1)) {
            return super.compareTo(abstractC0049h1);
        }
        C0103x1 c0103x1 = (C0103x1) abstractC0049h1;
        long time = this.l.getTime();
        long time2 = c0103x1.l.getTime();
        return time == time2 ? Long.valueOf(this.m).compareTo(Long.valueOf(c0103x1.m)) : Long.valueOf(time).compareTo(Long.valueOf(time2));
    }

    @Override // io.sentry.AbstractC0049h1
    public final long b(AbstractC0049h1 abstractC0049h1) {
        return abstractC0049h1 instanceof C0103x1 ? this.m - ((C0103x1) abstractC0049h1).m : super.b(abstractC0049h1);
    }

    @Override // io.sentry.AbstractC0049h1
    public final long c(AbstractC0049h1 abstractC0049h1) {
        if (abstractC0049h1 == null || !(abstractC0049h1 instanceof C0103x1)) {
            return super.c(abstractC0049h1);
        }
        C0103x1 c0103x1 = (C0103x1) abstractC0049h1;
        int iCompareTo = compareTo(abstractC0049h1);
        long j = this.m;
        long j2 = c0103x1.m;
        if (iCompareTo < 0) {
            return d() + (j2 - j);
        }
        return c0103x1.d() + (j - j2);
    }

    @Override // io.sentry.AbstractC0049h1
    public final long d() {
        return this.l.getTime() * 1000000;
    }

    public C0103x1() {
        this(io.sentry.config.a.j(), System.nanoTime());
    }
}
