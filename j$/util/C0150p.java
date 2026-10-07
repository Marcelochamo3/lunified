package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0150p implements PrimitiveIterator.OfDouble {
    public final /* synthetic */ InterfaceC0151q a;

    private /* synthetic */ C0150p(InterfaceC0151q interfaceC0151q) {
        this.a = interfaceC0151q;
    }

    public static /* synthetic */ PrimitiveIterator.OfDouble a(InterfaceC0151q interfaceC0151q) {
        if (interfaceC0151q == null) {
            return null;
        }
        return interfaceC0151q instanceof C0149o ? ((C0149o) interfaceC0151q).a : new C0150p(interfaceC0151q);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0151q interfaceC0151q = this.a;
        if (obj instanceof C0150p) {
            obj = ((C0150p) obj).a;
        }
        return interfaceC0151q.equals(obj);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.a.forEachRemaining((Object) doubleConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining(consumer);
    }

    @Override // java.util.PrimitiveIterator.OfDouble
    /* JADX INFO: renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(DoubleConsumer doubleConsumer) {
        this.a.forEachRemaining(doubleConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ Double next() {
        return this.a.next();
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.a.next();
    }

    @Override // java.util.PrimitiveIterator.OfDouble
    public final /* synthetic */ double nextDouble() {
        return this.a.nextDouble();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.a.remove();
    }
}
