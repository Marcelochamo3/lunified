package o;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: renamed from: o.ef, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1406ef extends AbstractC1309df {
    public static void Q(Collection collection, Iterable iterable) {
        AbstractC1474fG.j(collection, "<this>");
        AbstractC1474fG.j(iterable, "elements");
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static final boolean R(Iterable iterable, InterfaceC0412Ey interfaceC0412Ey, boolean z) {
        Iterator it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (((Boolean) interfaceC0412Ey.b(it.next())).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    public static void S(List list, InterfaceC0412Ey interfaceC0412Ey) {
        int iJ;
        AbstractC1474fG.j(list, "<this>");
        if (!(list instanceof RandomAccess)) {
            if (!(list instanceof InterfaceC1770iI) || (list instanceof InterfaceC1866jI)) {
                R(list, interfaceC0412Ey, true);
                return;
            } else {
                Jp0.N(list, "kotlin.collections.MutableIterable");
                throw null;
            }
        }
        int i = 0;
        YF it = new ZF(0, AbstractC0937Ze.J(list), 1).iterator();
        while (it.n) {
            int iA = it.a();
            Object obj = list.get(iA);
            if (!((Boolean) interfaceC0412Ey.b(obj)).booleanValue()) {
                if (i != iA) {
                    list.set(i, obj);
                }
                i++;
            }
        }
        if (i >= list.size() || i > (iJ = AbstractC0937Ze.J(list))) {
            return;
        }
        while (true) {
            list.remove(iJ);
            if (iJ == i) {
                return;
            } else {
                iJ--;
            }
        }
    }

    public static Object T(AbstractList abstractList) {
        AbstractC1474fG.j(abstractList, "<this>");
        if (abstractList.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return abstractList.remove(AbstractC0937Ze.J(abstractList));
    }
}
