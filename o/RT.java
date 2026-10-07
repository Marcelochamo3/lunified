package o;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class RT implements Comparable {
    public final TT l;
    public final Bundle m;
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f490o;
    public final boolean p;
    public final int q;

    public RT(TT tt, Bundle bundle, boolean z, int i, boolean z2, int i2) {
        AbstractC1474fG.j(tt, "destination");
        this.l = tt;
        this.m = bundle;
        this.n = z;
        this.f490o = i;
        this.p = z2;
        this.q = i2;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(RT rt) {
        AbstractC1474fG.j(rt, "other");
        boolean z = rt.n;
        boolean z2 = this.n;
        if (z2 && !z) {
            return 1;
        }
        if (!z2 && z) {
            return -1;
        }
        int i = this.f490o - rt.f490o;
        if (i > 0) {
            return 1;
        }
        if (i < 0) {
            return -1;
        }
        Bundle bundle = rt.m;
        Bundle bundle2 = this.m;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            int size = bundle2.size();
            AbstractC1474fG.g(bundle);
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z3 = rt.p;
        boolean z4 = this.p;
        if (z4 && !z3) {
            return 1;
        }
        if (z4 || !z3) {
            return this.q - rt.q;
        }
        return -1;
    }
}
