package j$.util.concurrent;

import j$.util.Collection$CC;
import j$.util.Collection$EL;
import j$.util.InterfaceC0135b;
import j$.util.Spliterator;
import j$.util.stream.StreamSupport;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends b implements Set, InterfaceC0135b {
    private static final long serialVersionUID = 7249069246763182397L;

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.concurrent.b, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        Set set;
        return (obj instanceof Set) && ((set = (Set) obj) == this || (containsAll(set) && set.containsAll(this)));
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final void forEach(Consumer consumer) {
        consumer.getClass();
        l[] lVarArr = this.a.a;
        if (lVarArr == null) {
            return;
        }
        p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
        while (true) {
            l lVarA = pVar.a();
            if (lVarA == null) {
                return;
            } else {
                consumer.p(lVarA.b);
            }
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        Object it = iterator();
        int iHashCode = 0;
        while (((AbstractC0137a) it).hasNext()) {
            iHashCode += ((h) it).next().hashCode();
        }
        return iHashCode;
    }

    @Override // j$.util.concurrent.b, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        ConcurrentHashMap concurrentHashMap = this.a;
        l[] lVarArr = concurrentHashMap.a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        return new h(lVarArr, length, length, concurrentHashMap, 0);
    }

    @Override // java.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return j$.util.stream.Stream.Wrapper.convert(StreamSupport.stream(Collection$EL.b(this), true));
    }

    @Override // j$.util.concurrent.b, java.util.Collection
    public final boolean remove(Object obj) {
        return this.a.remove(obj) != null;
    }

    @Override // java.util.Collection, j$.util.InterfaceC0135b
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection$CC.a(this, predicate);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set, j$.util.InterfaceC0135b
    public final Spliterator spliterator() {
        ConcurrentHashMap concurrentHashMap = this.a;
        long j = concurrentHashMap.j();
        l[] lVarArr = concurrentHashMap.a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        return new j(lVarArr, length, 0, length, j < 0 ? 0L : j, 0);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    @Override // java.util.Collection, j$.util.InterfaceC0135b
    public final /* synthetic */ j$.util.stream.Stream stream() {
        return StreamSupport.stream(Collection$EL.b(this), false);
    }

    @Override // java.util.Collection
    public final /* synthetic */ Stream stream() {
        return j$.util.stream.Stream.Wrapper.convert(StreamSupport.stream(Collection$EL.b(this), false));
    }

    @Override // java.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }
}
