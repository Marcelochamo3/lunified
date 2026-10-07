package io.sentry.android.core.performance;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Comparable {
    public final d l = new d();
    public final d m = new d();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        a aVar = (a) obj;
        int iCompare = Long.compare(this.l.n, aVar.l.n);
        return iCompare == 0 ? Long.compare(this.m.n, aVar.m.n) : iCompare;
    }
}
