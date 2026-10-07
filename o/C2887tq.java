package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: o.tq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2887tq implements Iterable {
    public final List l;

    public C2887tq(ArrayList arrayList) {
        this.l = arrayList;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.l.iterator();
    }
}
