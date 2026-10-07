package o;

import java.util.ArrayList;

/* JADX INFO: renamed from: o.x00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3198x00 extends T00 {
    public static final C3198x00 c = new C3198x00();

    public final boolean a() {
        ArrayList arrayList = T00.b;
        ArrayList<S00> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof S00) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            return true;
        }
        for (S00 s00 : arrayList2) {
            if (s00.f.p[s00.g]) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C3198x00);
    }

    public final int hashCode() {
        return 1157110384;
    }

    public final String toString() {
        return "None";
    }
}
