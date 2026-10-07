package o;

import java.util.Iterator;

/* JADX INFO: renamed from: o.Bq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0326Bq extends AbstractC3347yd0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0326Bq(F80 f80, int i) {
        super(f80);
        switch (i) {
            case 1:
                AbstractC1474fG.j(f80, "database");
                super(f80);
                break;
            default:
                AbstractC1474fG.j(f80, "database");
                break;
        }
    }

    public abstract void e(C3485zy c3485zy, Object obj);

    public void f(Object obj) {
        C3485zy c3485zyA = a();
        try {
            e(c3485zyA, obj);
            c3485zyA.f();
        } finally {
            d(c3485zyA);
        }
    }

    public void g(Iterable iterable) {
        AbstractC1474fG.j(iterable, "entities");
        C3485zy c3485zyA = a();
        try {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                e(c3485zyA, it.next());
                c3485zyA.a();
            }
            d(c3485zyA);
        } catch (Throwable th) {
            d(c3485zyA);
            throw th;
        }
    }

    public void h(Object obj) {
        C3485zy c3485zyA = a();
        try {
            e(c3485zyA, obj);
            c3485zyA.a();
        } finally {
            d(c3485zyA);
        }
    }
}
