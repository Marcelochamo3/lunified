package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: o.Ze, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0937Ze extends AbstractC2506pt {
    public static ZF I(Collection collection) {
        AbstractC1474fG.j(collection, "<this>");
        return new ZF(0, collection.size() - 1, 1);
    }

    public static int J(List list) {
        AbstractC1474fG.j(list, "<this>");
        return list.size() - 1;
    }

    public static List K(Object... objArr) {
        AbstractC1474fG.j(objArr, "elements");
        return objArr.length > 0 ? X5.F(objArr) : C1233cq.l;
    }

    public static ArrayList L(Object... objArr) {
        AbstractC1474fG.j(objArr, "elements");
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new L5(objArr, true));
    }

    public static final List M(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : AbstractC2506pt.A(list.get(0));
        }
        return C1233cq.l;
    }

    public static void N() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
