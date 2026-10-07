package j$.util;

import java.util.Collection;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
final class A extends b0 {
    final /* synthetic */ SortedSet f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    A(SortedSet sortedSet, Collection collection) {
        super(collection, 21);
        this.f = sortedSet;
    }

    @Override // j$.util.b0, j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        return this.f.comparator();
    }
}
