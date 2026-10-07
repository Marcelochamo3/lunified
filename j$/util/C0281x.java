package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0281x implements PrimitiveIterator.OfLong {
    public final /* synthetic */ InterfaceC0282y a;

    private /* synthetic */ C0281x(InterfaceC0282y interfaceC0282y) {
        this.a = interfaceC0282y;
    }

    public static /* synthetic */ PrimitiveIterator.OfLong a(InterfaceC0282y interfaceC0282y) {
        if (interfaceC0282y == null) {
            return null;
        }
        return interfaceC0282y instanceof C0280w ? ((C0280w) interfaceC0282y).a : new C0281x(interfaceC0282y);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0282y interfaceC0282y = this.a;
        if (obj instanceof C0281x) {
            obj = ((C0281x) obj).a;
        }
        return interfaceC0282y.equals(obj);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.a.forEachRemaining((Object) longConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining(consumer);
    }

    @Override // java.util.PrimitiveIterator.OfLong
    /* JADX INFO: renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(LongConsumer longConsumer) {
        this.a.forEachRemaining(longConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ Long next() {
        return this.a.next();
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.a.next();
    }

    @Override // java.util.PrimitiveIterator.OfLong
    public final /* synthetic */ long nextLong() {
        return this.a.nextLong();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.a.remove();
    }
}
