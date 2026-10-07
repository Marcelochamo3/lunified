package io.sentry;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

/* JADX INFO: renamed from: io.sentry.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0047h extends AbstractCollection implements Queue, Serializable {
    private static final long serialVersionUID = -8423413834657610406L;
    public transient Object[] l;
    public transient int m = 0;
    public transient int n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public transient boolean f113o = false;
    public final int p;

    public C0047h(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The size must be greater than 0");
        }
        Object[] objArr = new Object[i];
        this.l = objArr;
        this.p = objArr.length;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = this.p;
        this.l = new Object[i];
        int i2 = objectInputStream.readInt();
        for (int i3 = 0; i3 < i2; i3++) {
            this.l[i3] = objectInputStream.readObject();
        }
        this.m = 0;
        boolean z = i2 == i;
        this.f113o = z;
        if (z) {
            this.n = 0;
        } else {
            this.n = i2;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        C0044g c0044g = new C0044g(this);
        while (c0044g.hasNext()) {
            objectOutputStream.writeObject(c0044g.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Attempted to add null object to queue");
        }
        int size = size();
        int i = this.p;
        if (size == i) {
            remove();
        }
        Object[] objArr = this.l;
        int i2 = this.n;
        int i3 = i2 + 1;
        this.n = i3;
        objArr[i2] = obj;
        if (i3 >= i) {
            this.n = 0;
        }
        if (this.n == this.m) {
            this.f113o = true;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f113o = false;
        this.m = 0;
        this.n = 0;
        Arrays.fill(this.l, (Object) null);
    }

    @Override // java.util.Queue
    public final Object element() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        return peek();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0044g(this);
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }

    @Override // java.util.Queue
    public final Object peek() {
        if (isEmpty()) {
            return null;
        }
        return this.l[this.m];
    }

    @Override // java.util.Queue
    public final Object poll() {
        if (isEmpty()) {
            return null;
        }
        return remove();
    }

    @Override // java.util.Queue
    public final Object remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        Object[] objArr = this.l;
        int i = this.m;
        Object obj = objArr[i];
        if (obj != null) {
            int i2 = i + 1;
            this.m = i2;
            objArr[i] = null;
            if (i2 >= this.p) {
                this.m = 0;
            }
            this.f113o = false;
        }
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = this.n;
        int i2 = this.m;
        int i3 = this.p;
        if (i < i2) {
            return (i3 - i2) + i;
        }
        if (i != i2) {
            return i - i2;
        }
        if (this.f113o) {
            return i3;
        }
        return 0;
    }
}
