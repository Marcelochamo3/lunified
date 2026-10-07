package o;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class L implements Iterator {
    public final Iterator l;
    public Object m = null;
    public Collection n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Iterator f374o = YG.l;
    public final /* synthetic */ Y p;

    public L(Y y) {
        this.p = y;
        this.l = y.f629o.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.l.hasNext() || this.f374o.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f374o.hasNext()) {
            Map.Entry entry = (Map.Entry) this.l.next();
            this.m = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.n = collection;
            this.f374o = collection.iterator();
        }
        return this.f374o.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f374o.remove();
        Collection collection = this.n;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.l.remove();
        }
        this.p.p--;
    }

    public final Object a(Object obj, Object obj2) {
        return obj2;
    }
}
