package o;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: renamed from: o.Yu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0927Yu implements Rb0 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ C0927Yu(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // o.Rb0
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new C0875Wu(this);
            case 1:
                return new C1934jz(this);
            default:
                Rb0 rb0 = (Rb0) this.b;
                AbstractC1474fG.j(rb0, "<this>");
                ArrayList arrayList = new ArrayList();
                Iterator it = rb0.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
                Comparator comparator = (Comparator) this.c;
                AbstractC1474fG.j(comparator, "comparator");
                if (arrayList.size() > 1) {
                    Collections.sort(arrayList, comparator);
                }
                return arrayList.iterator();
        }
    }

    public C0927Yu(File file) {
        this.a = 0;
        EnumC0953Zu enumC0953Zu = EnumC0953Zu.l;
        this.b = file;
        this.c = enumC0953Zu;
    }
}
