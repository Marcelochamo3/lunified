package o;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: o.xN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3230xN implements Iterator {
    public final Iterator l;

    public C3230xN(Iterator it) {
        it.getClass();
        this.l = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.l.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return ((Map.Entry) this.l.next()).getValue();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.l.remove();
    }
}
