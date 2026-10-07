package o;

import android.util.SparseArray;
import java.util.Set;

/* JADX INFO: renamed from: o.c60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1168c60 {
    public SparseArray a;
    public int b;
    public Set c;

    public final C1071b60 a(int i) {
        SparseArray sparseArray = this.a;
        C1071b60 c1071b60 = (C1071b60) sparseArray.get(i);
        if (c1071b60 != null) {
            return c1071b60;
        }
        C1071b60 c1071b61 = new C1071b60();
        sparseArray.put(i, c1071b61);
        return c1071b61;
    }
}
