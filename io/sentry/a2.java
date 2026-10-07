package io.sentry;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public abstract class a2 implements Collection, Serializable {
    private static final long serialVersionUID = 2412805092710877986L;
    public final Collection l;
    public final a2 m = this;

    public a2(C0047h c0047h) {
        this.l = c0047h;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        boolean zAdd;
        synchronized (this.m) {
            zAdd = ((Queue) ((b2) this).l).add(obj);
        }
        return zAdd;
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        boolean zAddAll;
        synchronized (this.m) {
            zAddAll = ((Queue) ((b2) this).l).addAll(collection);
        }
        return zAddAll;
    }

    @Override // java.util.Collection
    public final void clear() {
        synchronized (this.m) {
            ((Queue) ((b2) this).l).clear();
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        boolean zContains;
        synchronized (this.m) {
            zContains = ((Queue) ((b2) this).l).contains(obj);
        }
        return zContains;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        boolean zContainsAll;
        synchronized (this.m) {
            zContainsAll = ((Queue) ((b2) this).l).containsAll(collection);
        }
        return zContainsAll;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.m) {
            zIsEmpty = ((Queue) ((b2) this).l).isEmpty();
        }
        return zIsEmpty;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return ((Queue) ((b2) this).l).iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        boolean zRemove;
        synchronized (this.m) {
            zRemove = ((Queue) ((b2) this).l).remove(obj);
        }
        return zRemove;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        boolean zRemoveAll;
        synchronized (this.m) {
            zRemoveAll = ((Queue) ((b2) this).l).removeAll(collection);
        }
        return zRemoveAll;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        boolean zRetainAll;
        synchronized (this.m) {
            zRetainAll = ((Queue) ((b2) this).l).retainAll(collection);
        }
        return zRetainAll;
    }

    @Override // java.util.Collection
    public final int size() {
        int size;
        synchronized (this.m) {
            size = ((Queue) ((b2) this).l).size();
        }
        return size;
    }

    public final String toString() {
        String string;
        synchronized (this.m) {
            string = ((Queue) ((b2) this).l).toString();
        }
        return string;
    }
}
