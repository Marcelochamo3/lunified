package io.sentry;

import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public final class b2 extends a2 implements Queue {
    private static final long serialVersionUID = 1;

    @Override // java.util.Queue
    public final Object element() {
        Object objElement;
        synchronized (this.m) {
            objElement = ((Queue) this.l).element();
        }
        return objElement;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.m) {
            zEquals = ((Queue) this.l).equals(obj);
        }
        return zEquals;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        int iHashCode;
        synchronized (this.m) {
            iHashCode = ((Queue) this.l).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        boolean zOffer;
        synchronized (this.m) {
            zOffer = ((Queue) this.l).offer(obj);
        }
        return zOffer;
    }

    @Override // java.util.Queue
    public final Object peek() {
        Object objPeek;
        synchronized (this.m) {
            objPeek = ((Queue) this.l).peek();
        }
        return objPeek;
    }

    @Override // java.util.Queue
    public final Object poll() {
        Object objPoll;
        synchronized (this.m) {
            objPoll = ((Queue) this.l).poll();
        }
        return objPoll;
    }

    @Override // java.util.Queue
    public final Object remove() {
        Object objRemove;
        synchronized (this.m) {
            objRemove = ((Queue) this.l).remove();
        }
        return objRemove;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] array;
        synchronized (this.m) {
            array = ((Queue) this.l).toArray();
        }
        return array;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] array;
        synchronized (this.m) {
            array = ((Queue) this.l).toArray(objArr);
        }
        return array;
    }
}
