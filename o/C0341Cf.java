package o;

import java.util.Comparator;

/* JADX INFO: renamed from: o.Cf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0341Cf extends AbstractC0393Ef {
    public static AbstractC0393Ef f(int i) {
        if (i < 0) {
            return AbstractC0393Ef.b;
        }
        return i > 0 ? AbstractC0393Ef.c : AbstractC0393Ef.a;
    }

    @Override // o.AbstractC0393Ef
    public final AbstractC0393Ef a(int i, int i2) {
        int i3;
        if (i < i2) {
            i3 = -1;
        } else {
            i3 = i > i2 ? 1 : 0;
        }
        return f(i3);
    }

    @Override // o.AbstractC0393Ef
    public final AbstractC0393Ef b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // o.AbstractC0393Ef
    public final AbstractC0393Ef c(boolean z, boolean z2) {
        int i;
        if (z == z2) {
            i = 0;
        } else {
            i = z ? 1 : -1;
        }
        return f(i);
    }

    @Override // o.AbstractC0393Ef
    public final AbstractC0393Ef d(boolean z, boolean z2) {
        int i;
        if (z2 == z) {
            i = 0;
        } else {
            i = z2 ? 1 : -1;
        }
        return f(i);
    }

    @Override // o.AbstractC0393Ef
    public final int e() {
        return 0;
    }
}
