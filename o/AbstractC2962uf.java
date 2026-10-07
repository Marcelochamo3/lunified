package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: o.uf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2962uf extends AbstractC1332dr {
    public static final C2147m8 e = new C2147m8(4);
    public int c = 0;
    public int d = 0;
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();

    @Override // o.AbstractC1332dr
    public final int a() {
        return this.d;
    }

    @Override // o.AbstractC1332dr
    public final void c() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((AbstractC1332dr) it.next()).c();
        }
    }

    public final void d() {
        ArrayList<AbstractC1332dr> arrayList = this.a;
        this.c = arrayList.size();
        this.d = 0;
        for (AbstractC1332dr abstractC1332dr : arrayList) {
            this.d = abstractC1332dr.a() + this.d;
        }
        ArrayList arrayList2 = this.b;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        Collections.sort(arrayList2, e);
    }
}
