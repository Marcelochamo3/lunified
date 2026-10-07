package o;

import j$.lang.Iterable$CC;
import j$.util.Collection$EL;
import j$.util.List;
import j$.util.stream.StreamSupport;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/* JADX INFO: renamed from: o.yp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3370yp extends ArrayList implements List {
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            ((C3176wp) it.next()).E();
        }
        super.clear();
    }

    @Override // java.util.ArrayList
    public final Object clone() {
        C3370yp c3370yp = new C3370yp(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            c3370yp.add(((C3176wp) it.next()).clone());
        }
        return c3370yp;
    }

    public final String d() {
        StringBuilder sbB = AbstractC1021ah0.b();
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            C3176wp c3176wp = (C3176wp) it.next();
            if (sbB.length() != 0) {
                sbB.append(" ");
            }
            sbB.append(c3176wp.Z());
        }
        return AbstractC1021ah0.h(sbB);
    }

    @Override // java.util.ArrayList, java.lang.Iterable, j$.lang.a
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return j$.util.stream.Stream.Wrapper.convert(StreamSupport.stream(Collection$EL.b(this), true));
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        C3176wp c3176wp = (C3176wp) super.remove(i);
        c3176wp.E();
        return c3176wp;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.ArrayList, java.util.Collection, j$.util.InterfaceC0135b
    public final boolean removeIf(Predicate predicate) {
        Iterator<E> it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (predicate.test((C3176wp) it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ArrayList, java.util.List, j$.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        for (int i = 0; i < size(); i++) {
            C3176wp c3176wp = (C3176wp) unaryOperator.apply((C3176wp) get(i));
            Sr0.w(c3176wp);
            ((C3176wp) super.set(i, c3176wp)).G(c3176wp);
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        Iterator<E> it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (!collection.contains((C3176wp) it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        C3176wp c3176wp = (C3176wp) obj;
        Sr0.w(c3176wp);
        C3176wp c3176wp2 = (C3176wp) super.set(i, c3176wp);
        c3176wp2.G(c3176wp);
        return c3176wp2;
    }

    @Override // java.util.ArrayList, java.util.List, j$.util.List
    public final /* synthetic */ void sort(Comparator comparator) {
        List.CC.$default$sort(this, comparator);
    }

    @Override // java.util.ArrayList, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.Spliterator.Wrapper.convert(List.CC.$default$spliterator(this));
    }

    @Override // java.util.Collection
    public final /* synthetic */ Stream stream() {
        return j$.util.stream.Stream.Wrapper.convert(StreamSupport.stream(Collection$EL.b(this), false));
    }

    @Override // java.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sbB = AbstractC1021ah0.b();
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            C3176wp c3176wp = (C3176wp) it.next();
            if (sbB.length() != 0) {
                sbB.append("\n");
            }
            sbB.append(c3176wp.y());
        }
        return AbstractC1021ah0.h(sbB);
    }

    @Override // java.util.Collection
    public final /* synthetic */ j$.util.stream.Stream parallelStream() {
        return StreamSupport.stream(Collection$EL.b(this), true);
    }

    @Override // java.util.ArrayList, java.util.Collection, java.lang.Iterable, java.util.List, j$.util.List, j$.util.InterfaceC0135b
    public final /* synthetic */ j$.util.Spliterator spliterator() {
        return List.CC.$default$spliterator(this);
    }

    @Override // java.util.Collection, j$.util.InterfaceC0135b
    public final /* synthetic */ j$.util.stream.Stream stream() {
        return StreamSupport.stream(Collection$EL.b(this), false);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        ((C3176wp) super.remove(iIndexOf)).E();
        return true;
    }
}
