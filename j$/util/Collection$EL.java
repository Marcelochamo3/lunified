package j$.util;

import j$.util.stream.Stream;
import j$.util.stream.StreamSupport;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: renamed from: j$.util.Collection$-EL, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Collection$EL {
    public static void a(Collection collection, Consumer consumer) {
        if (collection instanceof InterfaceC0135b) {
            ((InterfaceC0135b) collection).forEach(consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    public static Spliterator b(Collection collection) {
        if (collection instanceof InterfaceC0135b) {
            return ((InterfaceC0135b) collection).spliterator();
        }
        if (collection instanceof LinkedHashSet) {
            return new b0((Collection) Objects.requireNonNull((LinkedHashSet) collection), 17);
        }
        if (collection instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) collection;
            return new A(sortedSet, sortedSet);
        }
        if (collection instanceof Set) {
            return new b0((Collection) Objects.requireNonNull((Set) collection), 1);
        }
        return collection instanceof java.util.List ? List.CC.$default$spliterator((java.util.List) collection) : new b0((Collection) Objects.requireNonNull(collection), 0);
    }

    public static /* synthetic */ boolean removeIf(Collection collection, Predicate predicate) {
        return collection instanceof InterfaceC0135b ? ((InterfaceC0135b) collection).removeIf(predicate) : Collection$CC.a(collection, predicate);
    }

    public static /* synthetic */ Stream stream(Collection collection) {
        return collection instanceof InterfaceC0135b ? ((InterfaceC0135b) collection).stream() : StreamSupport.stream(b(collection), false);
    }
}
