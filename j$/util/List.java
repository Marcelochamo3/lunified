package j$.util;

import java.util.Arrays;
import java.util.Collection;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: classes2.dex */
public interface List<E> extends InterfaceC0135b {

    /* JADX INFO: renamed from: j$.util.List$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$sort(java.util.List list, java.util.Comparator comparator) {
            Object[] array = list.toArray();
            Arrays.sort(array, comparator);
            ListIterator<E> listIterator = list.listIterator();
            for (Object obj : array) {
                listIterator.next();
                listIterator.set(obj);
            }
        }

        public static Spliterator $default$spliterator(java.util.List list) {
            return list instanceof RandomAccess ? new C0134a(list) : new b0((Collection) Objects.requireNonNull(list), 16);
        }
    }

    void replaceAll(UnaryOperator<E> unaryOperator);

    void sort(java.util.Comparator<? super E> comparator);

    @Override // j$.util.InterfaceC0135b
    Spliterator<E> spliterator();
}
