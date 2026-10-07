package o;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: o.an, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1032an implements Closeable {
    public final String l;
    public final long m;
    public final List n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1227cn f679o;

    public C1032an(C1227cn c1227cn, String str, long j, ArrayList arrayList, long[] jArr) {
        AbstractC1474fG.j(str, "key");
        AbstractC1474fG.j(jArr, "lengths");
        this.f679o = c1227cn;
        this.l = str;
        this.m = j;
        this.n = arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            Mr0.d((InterfaceC2091lf0) it.next());
        }
    }
}
