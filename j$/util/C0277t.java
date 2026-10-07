package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0277t implements PrimitiveIterator.OfInt {
    public final /* synthetic */ InterfaceC0278u a;

    private /* synthetic */ C0277t(InterfaceC0278u interfaceC0278u) {
        this.a = interfaceC0278u;
    }

    public static /* synthetic */ PrimitiveIterator.OfInt a(InterfaceC0278u interfaceC0278u) {
        if (interfaceC0278u == null) {
            return null;
        }
        return interfaceC0278u instanceof C0152s ? ((C0152s) interfaceC0278u).a : new C0277t(interfaceC0278u);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0278u interfaceC0278u = this.a;
        if (obj instanceof C0277t) {
            obj = ((C0277t) obj).a;
        }
        return interfaceC0278u.equals(obj);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.a.forEachRemaining((Object) intConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining(consumer);
    }

    @Override // java.util.PrimitiveIterator.OfInt
    /* JADX INFO: renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(IntConsumer intConsumer) {
        this.a.forEachRemaining(intConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ Integer next() {
        return this.a.next();
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.a.next();
    }

    @Override // java.util.PrimitiveIterator.OfInt
    public final /* synthetic */ int nextInt() {
        return this.a.nextInt();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.a.remove();
    }
}
