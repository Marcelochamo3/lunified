package o;

import java.io.Serializable;

/* JADX INFO: renamed from: o.fF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1473fF implements Serializable {
    private static final long serialVersionUID = 0;
    public final Object[] l;

    public C1473fF(Object[] objArr) {
        this.l = objArr;
    }

    public Object readResolve() {
        Object[] objArr = this.l;
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? AbstractC1571gF.k(objArr.length, (Object[]) objArr.clone()) : new C1893je0(objArr[0]);
        }
        return S60.u;
    }
}
