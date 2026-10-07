package o;

import android.os.Parcelable;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class T7 implements InterfaceC1363e60 {
    public final /* synthetic */ AbstractC0976a8 a;

    public T7(AbstractC0976a8 abstractC0976a8) {
        this.a = abstractC0976a8;
    }

    public final void a(AbstractC2144m60 abstractC2144m60) {
        C3217xA c3217xA = this.a.U0;
        c3217xA.getClass();
        int iC = abstractC2144m60.c();
        if (iC != -1) {
            FV fv = c3217xA.d0;
            int i = fv.l;
            if (i == 1) {
                C2841tM c2841tM = (C2841tM) fv.n;
                if (c2841tM == null || c2841tM.m() == 0) {
                    return;
                }
                ((C2841tM) fv.n).l(Integer.toString(iC));
                return;
            }
            if ((i == 2 || i == 3) && ((C2841tM) fv.n) != null) {
                String string = Integer.toString(iC);
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                abstractC2144m60.a.saveHierarchyState(sparseArray);
                ((C2841tM) fv.n).k(string, sparseArray);
            }
        }
    }
}
