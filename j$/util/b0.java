package j$.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class b0 implements Spliterator {
    private final Collection a;
    private Iterator b;
    private final int c;
    private long d;
    private int e;

    public b0(Collection collection, int i) {
        this.a = collection;
        this.b = null;
        this.c = i | 16448;
    }

    public b0(Iterator it, int i) {
        this.a = null;
        this.b = it;
        this.d = Long.MAX_VALUE;
        this.c = i & (-16449);
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.c;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        if (this.b != null) {
            return this.d;
        }
        Collection collection = this.a;
        this.b = collection.iterator();
        long size = collection.size();
        this.d = size;
        return size;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        Iterator it = this.b;
        if (it == null) {
            Collection collection = this.a;
            Iterator it2 = collection.iterator();
            this.b = it2;
            this.d = collection.size();
            it = it2;
        }
        if (it instanceof InterfaceC0144j) {
            ((InterfaceC0144j) it).forEachRemaining(consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    @Override // j$.util.Spliterator
    public java.util.Comparator getComparator() {
        if (B.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return B.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return B.e(this, i);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        if (this.b == null) {
            Collection collection = this.a;
            this.b = collection.iterator();
            this.d = collection.size();
        }
        if (!this.b.hasNext()) {
            return false;
        }
        consumer.accept(this.b.next());
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        long size;
        Iterator it = this.b;
        if (it == null) {
            Collection collection = this.a;
            Iterator it2 = collection.iterator();
            this.b = it2;
            size = collection.size();
            this.d = size;
            it = it2;
        } else {
            size = this.d;
        }
        if (size <= 1 || !it.hasNext()) {
            return null;
        }
        int i = this.e + 1024;
        if (i > size) {
            i = (int) size;
        }
        if (i > 33554432) {
            i = 33554432;
        }
        Object[] objArr = new Object[i];
        int i2 = 0;
        do {
            objArr[i2] = it.next();
            i2++;
            if (i2 >= i) {
                break;
            }
        } while (it.hasNext());
        this.e = i2;
        long j = this.d;
        if (j != Long.MAX_VALUE) {
            this.d = j - ((long) i2);
        }
        return new U(objArr, 0, i2, this.c);
    }
}
