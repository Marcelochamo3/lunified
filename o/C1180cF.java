package o;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: renamed from: o.cF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1180cF implements Serializable {
    private static final long serialVersionUID = 0;
    public final Object[] l;
    public final Object[] m;

    public C1180cF(AbstractC1278dF abstractC1278dF) {
        int i = ((R60) abstractC1278dF).q;
        Object[] objArr = new Object[i];
        Object[] objArr2 = new Object[i];
        Aq0 it = abstractC1278dF.entrySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            objArr[i2] = entry.getKey();
            objArr2[i2] = entry.getValue();
            i2++;
        }
        this.l = objArr;
        this.m = objArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object readResolve() {
        Object[] objArr = this.l;
        boolean z = objArr instanceof AbstractC1571gF;
        Object[] objArr2 = this.m;
        if (!z) {
            C2613qy c2613qy = new C2613qy(objArr.length, 5);
            for (int i = 0; i < objArr.length; i++) {
                c2613qy.I(objArr[i], objArr2[i]);
            }
            return c2613qy.c();
        }
        AbstractC1571gF abstractC1571gF = (AbstractC1571gF) objArr;
        C2613qy c2613qy2 = new C2613qy(abstractC1571gF.size(), 5);
        Aq0 it = abstractC1571gF.iterator();
        Aq0 it2 = ((UE) objArr2).iterator();
        while (it.hasNext()) {
            c2613qy2.I(it.next(), it2.next());
        }
        return c2613qy2.c();
    }
}
