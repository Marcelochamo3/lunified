package o;

import android.graphics.Rect;
import java.util.Comparator;

/* JADX INFO: renamed from: o.uw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2996uw implements Comparator {
    public final Rect l = new Rect();
    public final Rect m = new Rect();
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0622Nb f1065o;

    public C2996uw(boolean z, C0622Nb c0622Nb) {
        this.n = z;
        this.f1065o = c0622Nb;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f1065o.getClass();
        Rect rect = this.l;
        ((N0) obj).f(rect);
        Rect rect2 = this.m;
        ((N0) obj2).f(rect2);
        int i = rect.top;
        int i2 = rect2.top;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = rect.left;
        int i4 = rect2.left;
        boolean z = this.n;
        if (i3 < i4) {
            return z ? 1 : -1;
        }
        if (i3 > i4) {
            return z ? -1 : 1;
        }
        int i5 = rect.bottom;
        int i6 = rect2.bottom;
        if (i5 < i6) {
            return -1;
        }
        if (i5 > i6) {
            return 1;
        }
        int i7 = rect.right;
        int i8 = rect2.right;
        if (i7 < i8) {
            return z ? 1 : -1;
        }
        if (i7 > i8) {
            return z ? -1 : 1;
        }
        return 0;
    }
}
