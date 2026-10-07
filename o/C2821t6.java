package o;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: o.t6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2821t6 extends AbstractC3015v6 {
    public final long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f1040o;
    public final ArrayList p;

    public C2821t6(int i, long j) {
        super(i, 0);
        this.n = j;
        this.f1040o = new ArrayList();
        this.p = new ArrayList();
    }

    public final C2821t6 E(int i) {
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C2821t6 c2821t6 = (C2821t6) arrayList.get(i2);
            if (c2821t6.m == i) {
                return c2821t6;
            }
        }
        return null;
    }

    public final C2918u6 F(int i) {
        ArrayList arrayList = this.f1040o;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C2918u6 c2918u6 = (C2918u6) arrayList.get(i2);
            if (c2918u6.m == i) {
                return c2918u6;
            }
        }
        return null;
    }

    @Override // o.AbstractC3015v6
    public final String toString() {
        return AbstractC3015v6.g(this.m) + " leaves: " + Arrays.toString(this.f1040o.toArray()) + " containers: " + Arrays.toString(this.p.toArray());
    }
}
